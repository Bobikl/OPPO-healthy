package org.oconscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    public static class GCM extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM {
            @Override // org.oconscrypt.OpenSSLAeadCipherAES, org.oconscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 16)");
            }
        }

        public static class AES_256 extends GCM {
            @Override // org.oconscrypt.OpenSSLAeadCipherAES, org.oconscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 32)");
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // org.oconscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // org.oconscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) throws InvalidKeyException {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            throw new RuntimeException("Unexpected key length: " + i);
        }
    }

    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM_SIV {
            @Override // org.oconscrypt.OpenSSLAeadCipherAES, org.oconscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 16)");
            }
        }

        public static class AES_256 extends GCM_SIV {
            @Override // org.oconscrypt.OpenSSLAeadCipherAES, org.oconscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 32)");
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // org.oconscrypt.OpenSSLAeadCipher
        public boolean allowsNonceReuse() {
            return true;
        }

        @Override // org.oconscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // org.oconscrypt.OpenSSLAeadCipher
        public void checkSupportedTagLength(int i) throws InvalidAlgorithmParameterException {
            if (i != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        @Override // org.oconscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) throws InvalidKeyException {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            throw new RuntimeException("Unexpected key length: " + i);
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i == 16 || i == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i + " bytes (must be 16 or 32)");
    }

    @Override // org.oconscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("GCM");
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e2) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e2));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // org.oconscrypt.OpenSSLAeadCipher, org.oconscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        return isEncrypting() ? this.bufCount + i + this.tagLengthInBytes : Math.max(0, (this.bufCount + i) - this.tagLengthInBytes);
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecFromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return algorithmParameterSpecFromGCMParameters != null ? algorithmParameterSpecFromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
