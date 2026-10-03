package org.oconscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenSSLECDHKeyAgreement extends OpenSSLBaseDHKeyAgreement<OpenSSLKey> {
    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public int computeKey(byte[] bArr, OpenSSLKey openSSLKey, OpenSSLKey openSSLKey2) throws InvalidKeyException {
        return NativeCrypto.ECDH_compute_key(bArr, 0, openSSLKey.getNativeRef(), openSSLKey2.getNativeRef());
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public OpenSSLKey convertPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
        return OpenSSLKey.fromPrivateKey(privateKey);
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public OpenSSLKey convertPublicKey(PublicKey publicKey) throws InvalidKeyException {
        return OpenSSLKey.fromPublicKey(publicKey);
    }

    @Override // org.oconscrypt.OpenSSLBaseDHKeyAgreement
    public int getOutputSize(OpenSSLKey openSSLKey) {
        return (NativeCrypto.EC_GROUP_get_degree(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(openSSLKey.getNativeRef()))) + 7) / 8;
    }
}
