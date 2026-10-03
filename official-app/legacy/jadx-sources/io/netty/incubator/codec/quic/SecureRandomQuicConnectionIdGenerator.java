package io.netty.incubator.codec.quic;

import io.netty.util.internal.ObjectUtil;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
final class SecureRandomQuicConnectionIdGenerator implements QuicConnectionIdGenerator {
    private static final SecureRandom RANDOM = new SecureRandom();
    static final QuicConnectionIdGenerator INSTANCE = new SecureRandomQuicConnectionIdGenerator();

    private SecureRandomQuicConnectionIdGenerator() {
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public boolean isIdempotent() {
        return false;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public int maxConnectionIdLength() {
        return Quiche.QUICHE_MAX_CONN_ID_LEN;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public ByteBuffer newId(int i) {
        ObjectUtil.checkInRange(i, 0, maxConnectionIdLength(), "length");
        byte[] bArr = new byte[i];
        RANDOM.nextBytes(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public ByteBuffer newId(ByteBuffer byteBuffer, int i) {
        return newId(i);
    }
}
