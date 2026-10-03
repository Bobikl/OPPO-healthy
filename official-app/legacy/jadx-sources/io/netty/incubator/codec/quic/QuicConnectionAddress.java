package io.netty.incubator.codec.quic;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicConnectionAddress extends SocketAddress {
    public static final QuicConnectionAddress EPHEMERAL = new QuicConnectionAddress(null, false);
    final ByteBuffer connId;

    public QuicConnectionAddress(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) bArr.clone()), true);
    }

    public static QuicConnectionAddress random(int i) {
        return new QuicConnectionAddress(QuicConnectionIdGenerator.randomGenerator().newId(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QuicConnectionAddress)) {
            return false;
        }
        QuicConnectionAddress quicConnectionAddress = (QuicConnectionAddress) obj;
        if (obj == this) {
            return true;
        }
        ByteBuffer byteBuffer = this.connId;
        if (byteBuffer == null) {
            return false;
        }
        return byteBuffer.equals(quicConnectionAddress.connId);
    }

    public int hashCode() {
        QuicConnectionAddress quicConnectionAddress = EPHEMERAL;
        return this == quicConnectionAddress ? System.identityHashCode(quicConnectionAddress) : Objects.hash(this.connId);
    }

    public String toString() {
        if (this == EPHEMERAL) {
            return "QuicConnectionAddress{EPHEMERAL}";
        }
        return "QuicConnectionAddress{connId=" + this.connId + '}';
    }

    public QuicConnectionAddress(ByteBuffer byteBuffer) {
        this(byteBuffer, true);
    }

    public static QuicConnectionAddress random() {
        return random(Quiche.QUICHE_MAX_CONN_ID_LEN);
    }

    private QuicConnectionAddress(ByteBuffer byteBuffer, boolean z) {
        Quic.ensureAvailability();
        if (z) {
            int iRemaining = byteBuffer.remaining();
            int i = Quiche.QUICHE_MAX_CONN_ID_LEN;
            if (iRemaining > i) {
                throw new IllegalArgumentException("Connection ID can only be of max length " + i);
            }
        }
        this.connId = byteBuffer;
    }
}
