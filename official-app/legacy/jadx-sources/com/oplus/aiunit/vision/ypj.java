package com.oplus.aiunit.vision;

import android.security.keystore.KeyGenParameterSpec;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes12.dex */
public class ypj {
    public static final String TAG = "ypj";
    public SecretKey a;

    public static class a {
        public static final ypj a = new ypj();
    }

    public static ypj c() {
        return a.a;
    }

    public synchronized byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length <= 12) {
            x6b.a(TAG, "decrypt", "input length is" + bArr.length);
            return null;
        }
        try {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 12, bArr.length);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOf);
            SecretKey secretKey = this.a;
            if (secretKey == null) {
                return null;
            }
            cipher.init(2, secretKey, gCMParameterSpec);
            return cipher.doFinal(bArrCopyOfRange);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public synchronized byte[] b(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            SecretKey secretKey = this.a;
            if (secretKey == null) {
                return null;
            }
            cipher.init(1, secretKey);
            return w9k.a(cipher.getIV(), cipher.doFinal(bArr));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public ypj() {
        try {
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyStore.load(null);
            if (keyStore.containsAlias("andes_crypto_kit_key")) {
                this.a = (SecretKey) keyStore.getKey("andes_crypto_kit_key", null);
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
                keyGenerator.init(new KeyGenParameterSpec.Builder("andes_crypto_kit_key", 3).setBlockModes("GCM").setEncryptionPaddings(com.heytap.omas.a.b.a.k).build());
                this.a = keyGenerator.generateKey();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
