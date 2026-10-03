package io.netty.incubator.codec.quic;

import io.netty.util.internal.ObjectUtil;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

/* JADX INFO: loaded from: classes10.dex */
final class HmacSignQuicConnectionIdGenerator implements QuicConnectionIdGenerator {
    static final QuicConnectionIdGenerator INSTANCE = new HmacSignQuicConnectionIdGenerator();
    private static final byte[] randomKey;

    static {
        byte[] bArr = new byte[16];
        randomKey = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    private HmacSignQuicConnectionIdGenerator() {
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public boolean isIdempotent() {
        return true;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public int maxConnectionIdLength() {
        return Quiche.QUICHE_MAX_CONN_ID_LEN;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public ByteBuffer newId(int i) {
        throw new UnsupportedOperationException("HmacSignQuicConnectionIdGenerator should always have an input to sign with");
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionIdGenerator
    public ByteBuffer newId(ByteBuffer byteBuffer, int i) {
        ObjectUtil.checkNotNull(byteBuffer, "buffer");
        ObjectUtil.checkPositive(byteBuffer.remaining(), "buffer");
        ObjectUtil.checkInRange(i, 0, maxConnectionIdLength(), "length");
        byte[] bArrHmac = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, randomKey).hmac(byteBuffer);
        if (bArrHmac.length != i) {
            bArrHmac = Arrays.copyOf(bArrHmac, i);
        }
        return ByteBuffer.wrap(bArrHmac);
    }
}
