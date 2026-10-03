package org.oconscrypt;

import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class OpenSSLX25519PrivateKey implements OpenSSLX25519Key, PrivateKey {
    private static final byte[] PKCS8_PREAMBLE = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] PKCS8_PREAMBLE_WITH_NULL = {48, 48, 2, 1, 0, 48, 7, 6, 3, 43, 101, 110, 5, 0, 4, 34, 4, 32};
    private static final long serialVersionUID = -3136201500221850916L;
    private byte[] uCoordinate;

    public OpenSSLX25519PrivateKey(PKCS8EncodedKeySpec pKCS8EncodedKeySpec) throws InvalidKeySpecException {
        byte[] encoded = pKCS8EncodedKeySpec.getEncoded();
        if (encoded == null || !"PKCS#8".equals(pKCS8EncodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Key must be encoded in PKCS#8 format");
        }
        byte[] bArr = PKCS8_PREAMBLE;
        if ((matchesPreamble(bArr, encoded) | matchesPreamble(PKCS8_PREAMBLE_WITH_NULL, encoded)) == 0) {
            throw new InvalidKeySpecException("Key size is not correct size");
        }
        this.uCoordinate = Arrays.copyOfRange(encoded, bArr.length, encoded.length);
    }

    private static int matchesPreamble(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != bArr.length + 32) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr2[i2] ^ bArr[i2];
        }
        if (i != 0) {
            return 0;
        }
        return bArr.length;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.uCoordinate = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSSLX25519PrivateKey) {
            return Arrays.equals(this.uCoordinate, ((OpenSSLX25519PrivateKey) obj).uCoordinate);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XDH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.uCoordinate;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        byte[] bArr2 = PKCS8_PREAMBLE;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + bArr.length);
        byte[] bArr3 = this.uCoordinate;
        System.arraycopy(bArr3, 0, bArrCopyOf, bArr2.length, bArr3.length);
        return bArrCopyOf;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.oconscrypt.OpenSSLX25519Key
    public byte[] getU() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(this.uCoordinate);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.uCoordinate == null;
    }

    public OpenSSLX25519PrivateKey(byte[] bArr) {
        this.uCoordinate = (byte[]) bArr.clone();
    }
}
