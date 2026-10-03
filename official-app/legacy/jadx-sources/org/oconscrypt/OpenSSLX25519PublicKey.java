package org.oconscrypt;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class OpenSSLX25519PublicKey implements OpenSSLX25519Key, PublicKey {
    private static final byte[] X509_PREAMBLE = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    private static final byte[] X509_PREAMBLE_WITH_NULL = {48, 44, 48, 7, 6, 3, 43, 101, 110, 5, 0, 3, 33, 0};
    private static final long serialVersionUID = 453861992373478445L;
    private final byte[] uCoordinate;

    public OpenSSLX25519PublicKey(X509EncodedKeySpec x509EncodedKeySpec) throws InvalidKeySpecException {
        byte[] encoded = x509EncodedKeySpec.getEncoded();
        if (encoded == null || !"X.509".equals(x509EncodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Encoding must be in X.509 format");
        }
        int iMatchesPreamble = matchesPreamble(X509_PREAMBLE, encoded) | matchesPreamble(X509_PREAMBLE_WITH_NULL, encoded);
        if (iMatchesPreamble == 0) {
            throw new InvalidKeySpecException("Key size is not correct size");
        }
        this.uCoordinate = Arrays.copyOfRange(encoded, iMatchesPreamble, encoded.length);
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

    public boolean equals(Object obj) {
        byte[] bArr = this.uCoordinate;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSSLX25519PublicKey) {
            return Arrays.equals(bArr, ((OpenSSLX25519PublicKey) obj).uCoordinate);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XDH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.uCoordinate == null) {
            throw new IllegalStateException("key is destroyed");
        }
        byte[] bArr = X509_PREAMBLE;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + 32);
        byte[] bArr2 = this.uCoordinate;
        System.arraycopy(bArr2, 0, bArrCopyOf, bArr.length, bArr2.length);
        return bArrCopyOf;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
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
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    public OpenSSLX25519PublicKey(byte[] bArr) {
        this.uCoordinate = (byte[]) bArr.clone();
    }
}
