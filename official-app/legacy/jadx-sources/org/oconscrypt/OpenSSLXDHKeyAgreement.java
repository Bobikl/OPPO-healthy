package org.oconscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenSSLXDHKeyAgreement extends OpenSSLBaseDHKeyAgreement<byte[]> {
    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public int getOutputSize(byte[] bArr) {
        return 32;
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public int computeKey(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidKeyException {
        if (NativeCrypto.X25519(bArr, bArr3, bArr2)) {
            return 32;
        }
        throw new InvalidKeyException("Error running X25519");
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public byte[] convertPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof OpenSSLX25519PrivateKey) {
            return ((OpenSSLX25519PrivateKey) privateKey).getU();
        }
        throw new InvalidKeyException("Only OpenSSLX25519PublicKey accepted");
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public byte[] convertPublicKey(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof OpenSSLX25519PublicKey) {
            return ((OpenSSLX25519PublicKey) publicKey).getU();
        }
        throw new InvalidKeyException("Only OpenSSLX25519PublicKey accepted");
    }
}
