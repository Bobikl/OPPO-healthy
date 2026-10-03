package com.oplus.aiunit.vision;

import android.security.keystore.KeyGenParameterSpec;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes19.dex */
public class d7 {
    public static SecretKey a() {
        try {
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            keyStore.load(null);
            if (!keyStore.containsAlias("AC_SDK")) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", AesGcmAndroidKeyStore.KEY_STORE_MODULE);
                keyGenerator.init(new KeyGenParameterSpec.Builder("AC_SDK", 3).setBlockModes("GCM").setEncryptionPaddings(com.heytap.omas.a.b.a.k).setKeySize(256).build());
                keyGenerator.generateKey();
            }
            return ((KeyStore.SecretKeyEntry) keyStore.getEntry("AC_SDK", null)).getSecretKey();
        } catch (Throwable th) {
            AcLogUtil.e("AcAesUtils", "get KeySecret fail", th);
            return null;
        }
    }
}
