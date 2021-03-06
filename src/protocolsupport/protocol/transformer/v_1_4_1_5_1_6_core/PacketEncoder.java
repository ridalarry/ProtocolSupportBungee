package protocolsupport.protocol.transformer.v_1_4_1_5_1_6_core;

import java.io.IOException;

import protocolsupport.LoggerUtil;
import protocolsupport.protocol.transformer.TransformedPacket;
import protocolsupport.protocol.transformer.v_1_4_1_5_1_6_core.reader.BungeePacketTransformer;
import net.md_5.bungee.protocol.DefinedPacket;
import net.md_5.bungee.protocol.MinecraftEncoder;
import net.md_5.bungee.protocol.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketEncoder extends MinecraftEncoder {

	private boolean server;
	public PacketEncoder(Protocol protocol, boolean server, int protocolVersion) {
		super(protocol, server, protocolVersion);
		this.server = server;
	}

	@Override
	protected void encode(ChannelHandlerContext ctx, DefinedPacket packet, ByteBuf buf) throws Exception {
		TransformedPacket[] packets = null;
		if (!(packet instanceof TransformedPacket)) {
			packets = BungeePacketTransformer.transformBungeePacket(ctx.channel(), packet, buf);
			if (packets == null) {
				throw new IOException("Unable to transform bungee packet "+packet.getClass().getName());
			}
		} else {
			packets = new TransformedPacket[] { (TransformedPacket) packet };
		}
		encodePackets(packets, buf);
	}

	private void encodePackets(TransformedPacket[] packets, ByteBuf buf) {
		for (TransformedPacket tpacket : packets) {
			if (tpacket.shouldWrite()) {
				if (LoggerUtil.isEnabled()) {
					LoggerUtil.debug((server ? "[To Client] " : "[To Server] ") + "Sent packet(id: "+tpacket.getId() + ", defined data: " + tpacket.toString() + ")");
				}
				buf.writeByte(tpacket.getId());
				tpacket.write(buf);
			}
		}
	}

}
