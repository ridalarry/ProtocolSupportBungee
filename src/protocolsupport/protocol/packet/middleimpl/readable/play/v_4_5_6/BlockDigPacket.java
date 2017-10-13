package protocolsupport.protocol.packet.middleimpl.readable.play.v_4_5_6;

import protocolsupport.protocol.packet.middleimpl.readable.FixedLengthPassthroughReadableMiddlePacket;

public class BlockDigPacket extends FixedLengthPassthroughReadableMiddlePacket {

	public static final int PACKET_ID = 0x0E;

	public BlockDigPacket() {
		super(PACKET_ID, Byte.BYTES + Integer.BYTES + Byte.BYTES + Integer.BYTES + Byte.BYTES);
	}

}
