package io.netty.incubator.codec.quic;

/* JADX INFO: loaded from: classes10.dex */
public enum QuicPacketType {
    INITIAL((byte) 1),
    RETRY((byte) 2),
    HANDSHAKE((byte) 3),
    ZERO_RTT((byte) 4),
    SHORT((byte) 5),
    VERSION_NEGOTIATION((byte) 6);

    final byte type;

    QuicPacketType(byte b) {
        this.type = b;
    }

    public static QuicPacketType of(byte b) {
        switch (b) {
            case 1:
                return INITIAL;
            case 2:
                return RETRY;
            case 3:
                return HANDSHAKE;
            case 4:
                return ZERO_RTT;
            case 5:
                return SHORT;
            case 6:
                return VERSION_NEGOTIATION;
            default:
                throw new IllegalArgumentException("Unknown QUIC packet type: " + ((int) b));
        }
    }
}
