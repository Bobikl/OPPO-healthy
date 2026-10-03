package com.oplus.aiunit.vision;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class poa {
    @RequiresApi(23)
    public static SecretKey a(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyStore.load(null);
            return !keyStore.containsAlias(str) ? b(str).generateKey() : (SecretKey) keyStore.getKey(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @RequiresApi(23)
    public static KeyGenerator b(String str) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setUserAuthenticationRequired(false).setEncryptionPaddings(com.heytap.omas.a.b.a.f7573l).build());
            return keyGenerator;
        } catch (Exception unused) {
            return null;
        }
    }
}
