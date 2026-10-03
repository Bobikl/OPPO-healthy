package io.netty.incubator.codec.quic;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicConnectionIdGenerator {
    static QuicConnectionIdGenerator randomGenerator() {
        return SecureRandomQuicConnectionIdGenerator.INSTANCE;
    }

    static QuicConnectionIdGenerator signGenerator() {
        return HmacSignQuicConnectionIdGenerator.INSTANCE;
    }

    boolean isIdempotent();

    int maxConnectionIdLength();

    ByteBuffer newId(int i);

    ByteBuffer newId(ByteBuffer byteBuffer, int i);
}
