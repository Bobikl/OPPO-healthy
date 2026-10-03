package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Immutable
public final class PrfHmacJce implements Prf {
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final String algorithm;
    private final Key key;
    private final ThreadLocal<Mac> localMac;
    private final int maxOutputLength;

    public PrfHmacJce(String str, Key key) throws GeneralSecurityException {
        ThreadLocal<Mac> threadLocal = new ThreadLocal<Mac>() { // from class: com.google.crypto.tink.subtle.PrfHmacJce.1
            @Override // java.lang.ThreadLocal
            public Mac initialValue() {
                try {
                    Mac engineFactory = EngineFactory.MAC.getInstance(PrfHmacJce.this.algorithm);
                    engineFactory.init(PrfHmacJce.this.key);
                    return engineFactory;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        this.localMac = threadLocal;
        this.algorithm = str;
        this.key = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.maxOutputLength = 20;
                break;
            case "HMACSHA256":
                this.maxOutputLength = 32;
                break;
            case "HMACSHA384":
                this.maxOutputLength = 48;
                break;
            case "HMACSHA512":
                this.maxOutputLength = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        threadLocal.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.maxOutputLength) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.localMac.get().update(bArr);
        return Arrays.copyOf(this.localMac.get().doFinal(), i);
    }

    public int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
