package com.heytap.store.base.core.util;

import com.heytap.store.base.core.util.encryption.EncryptMode;

/* JADX INFO: loaded from: classes3.dex */
public class GetKeyUtil {
    public static String key;

    public static void getRsaAndAesImei() {
        try {
            key = EncryptMode.AES256.getKeyStr().get(0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
