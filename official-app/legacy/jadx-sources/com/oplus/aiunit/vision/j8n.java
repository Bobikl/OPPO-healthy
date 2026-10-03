package com.oplus.aiunit.vision;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j8n {
    public static Pair a(String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            SecretKey secretKeyD = d(str);
            if (secretKeyD == null) {
                return null;
            }
            cipher.init(1, secretKeyD);
            return new Pair(Base64.encodeToString(cipher.doFinal(bArr), 2), Base64.encodeToString(cipher.getIV(), 2));
        } catch (Exception e2) {
            k8n.b("1018", e2);
            return null;
        } catch (InstantiationError unused) {
            Log.e("IDHelper", "1092");
            return null;
        }
    }

    public static SecretKey b(String str) {
        try {
            Log.e("IDHelper", "generateSecretKey, alias:" + str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings(com.heytap.omas.a.b.a.k).build());
            return keyGenerator.generateKey();
        } catch (Exception e2) {
            k8n.b("1017", e2);
            return null;
        }
    }

    public static byte[] c(String str, String str2, String str3) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            byte[] bArrDecode2 = Base64.decode(str3, 2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDecode2);
            SecretKey secretKeyD = d(str);
            if (secretKeyD == null) {
                return null;
            }
            cipher.init(2, secretKeyD, gCMParameterSpec);
            return cipher.doFinal(bArrDecode);
        } catch (Exception e2) {
            k8n.b("1015", e2);
            return null;
        } catch (InstantiationError unused) {
            Log.e("IDHelper", "1093");
            return null;
        }
    }

    public static SecretKey d(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry(str, null);
            SecretKey secretKey = entry != null ? ((KeyStore.SecretKeyEntry) entry).getSecretKey() : null;
            return secretKey == null ? b(str) : secretKey;
        } catch (Exception e2) {
            k8n.b("1016", e2);
            return null;
        }
    }
}
