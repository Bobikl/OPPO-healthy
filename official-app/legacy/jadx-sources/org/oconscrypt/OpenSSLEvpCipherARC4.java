package org.oconscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes11.dex */
public class OpenSSLEvpCipherARC4 extends OpenSSLEvpCipher {
    public OpenSSLEvpCipherARC4() {
        super(OpenSSLCipher.Mode.ECB, OpenSSLCipher.Padding.NOPADDING);
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode == OpenSSLCipher.Mode.NONE || mode == OpenSSLCipher.Mode.ECB) {
            return;
        }
        throw new NoSuchAlgorithmException("Unsupported mode " + mode.toString());
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding == OpenSSLCipher.Padding.NOPADDING) {
            return;
        }
        throw new NoSuchPaddingException("Unsupported padding " + padding.toString());
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ARCFOUR";
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // org.oconscrypt.OpenSSLEvpCipher
    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        return "rc4";
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public boolean supportsVariableSizeKey() {
        return true;
    }
}
