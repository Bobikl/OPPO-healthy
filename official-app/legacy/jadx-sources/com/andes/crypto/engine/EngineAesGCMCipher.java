package com.andes.crypto.engine;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.w9k;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class EngineAesGCMCipher {
    private final byte[] mCipherCipherMaterial;
    private final Key mKeySpec;

    public EngineAesGCMCipher(byte[] bArr, byte[] bArr2) {
        this.mCipherCipherMaterial = bArr2;
        this.mKeySpec = new SecretKeySpec(bArr, "AES");
    }

    public byte[] decrypt(@NonNull byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.mKeySpec, new IvParameterSpec(Arrays.copyOf(bArr, 12)));
        return cipher.doFinal(Arrays.copyOfRange(bArr, 12, bArr.length));
    }

    public byte[] encrypt(@NonNull byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.mKeySpec);
        return w9k.a(cipher.getIV(), cipher.doFinal(bArr));
    }

    public byte[] getCipherMaterial() {
        return this.mCipherCipherMaterial;
    }
}
