package protocolsupport.protocol.packet.middleimpl.readable.play.v_4_5_6;

import java.util.Collection;
import java.util.Collections;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.md_5.bungee.protocol.PacketWrapper;
import net.md_5.bungee.protocol.packet.Chat;
import protocolsupport.protocol.packet.middleimpl.readable.DefinedReadableMiddlePacket;
import protocolsupport.protocol.serializer.LegacySerializer;

public class FromServerChatPacket extends DefinedReadableMiddlePacket {

	public static final int PACKET_ID = 0x03;

	public FromServerChatPacket() {
		super(PACKET_ID);
	}

	protected String message;

	@Override
	protected void read0(ByteBuf from) {
		message = ComponentSerializer.toString(new TextComponent(LegacySerializer.readString(from)));
	}

	@Override
	public Collection<PacketWrapper> toNative() {
		return Collections.singletonList(new PacketWrapper(new Chat(message), Unpooled.wrappedBuffer(readbytes)));
	}

}
