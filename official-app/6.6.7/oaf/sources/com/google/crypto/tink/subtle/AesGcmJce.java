package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class AesGcmJce implements Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private static final ThreadLocal<Cipher> localCipher = new ThreadLocal<Cipher>() { // from class: com.google.crypto.tink.subtle.AesGcmJce.1
        @Override // java.lang.ThreadLocal
        public Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    };
    private final SecretKey keySpec;

    public AesGcmJce(byte[] bArr) throws GeneralSecurityException {
        Validators.validateAesKeySize(bArr.length);
        this.keySpec = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec getParams(byte[] bArr) throws GeneralSecurityException {
        return getParams(bArr, 0, bArr.length);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec params = getParams(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = localCipher;
        threadLocal.get().init(2, this.keySpec, params);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrRandBytes = Random.randBytes(12);
        System.arraycopy(bArrRandBytes, 0, bArr3, 0, 12);
        AlgorithmParameterSpec params = getParams(bArrRandBytes);
        ThreadLocal<Cipher> threadLocal = localCipher;
        threadLocal.get().init(1, this.keySpec, params);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    private static AlgorithmParameterSpec getParams(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        return (!SubtleUtil.isAndroid() || SubtleUtil.androidApiLevel() > 19) ? new GCMParameterSpec(Barcode.FORMAT_ITF, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }
}
