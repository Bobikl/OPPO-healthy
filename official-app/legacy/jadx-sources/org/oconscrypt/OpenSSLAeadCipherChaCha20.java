package org.oconscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305);
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 32)");
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
        }
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // org.oconscrypt.OpenSSLAeadCipher
    public long getEVP_AEAD(int i) throws InvalidKeyException {
        if (i == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        throw new RuntimeException("Unexpected key length: " + i);
    }

    @Override // org.oconscrypt.OpenSSLAeadCipher, org.oconscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        return isEncrypting() ? this.bufCount + i + 16 : Math.max(0, (this.bufCount + i) - 16);
    }
}
