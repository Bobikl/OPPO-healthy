package com.sensorsdata.analytics.android.sdk.encrypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class AESSecretManager {
    private static final String ALGORITHM = "AES";
    private static final String CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final String CHARSET_NAME = "UTF-8";
    private static final String SECRET_KEY_FILE = "com.sensorsdata.analytics.android.sdk.other";
    private static final String TAG = "SA.AESSecretManager";
    private static final byte[] ZERO_IV = new byte[16];
    private String mAESSecret;

    public static class SingletonHolder {
        private static final AESSecretManager INSTANCE = new AESSecretManager();

        private SingletonHolder() {
        }
    }

    private String generateAESKey() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return new String(Base64Coder.encode(keyGenerator.generateKey().getEncoded()));
        } catch (Exception e2) {
            SALog.i(TAG, "generateAESKey fail, msg: " + e2);
            return "";
        }
    }

    public static AESSecretManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private SecretKey strKey2SecretKey(String str) {
        return new SecretKeySpec(Base64Coder.decode(str), "AES");
    }

    public String decryptAES(String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(this.mAESSecret)) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, strKey2SecretKey(this.mAESSecret), new IvParameterSpec(ZERO_IV));
                    return new String(cipher.doFinal(Base64Coder.decode(str)), "UTF-8");
                }
            } catch (Exception e2) {
                SALog.i(TAG, "decryptAES fail, msg: " + e2);
                return "";
            }
        }
        return str;
    }

    public String encryptAES(String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(this.mAESSecret)) {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, strKey2SecretKey(this.mAESSecret), new IvParameterSpec(ZERO_IV));
                    return new String(Base64Coder.encode(cipher.doFinal(str.getBytes("UTF-8"))));
                }
            } catch (Exception e2) {
                SALog.i(TAG, "encryptAES fail, msg: " + e2);
                return "";
            }
        }
        return str;
    }

    public void initSecretKey(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SECRET_KEY_FILE, 0);
        String string = sharedPreferences.getString(Base64Coder.encodeString(SAStoreManager.SECRET_KEY), "");
        this.mAESSecret = string;
        if (TextUtils.isEmpty(string)) {
            this.mAESSecret = generateAESKey();
            sharedPreferences.edit().putString(Base64Coder.encodeString(SAStoreManager.SECRET_KEY), this.mAESSecret).apply();
        }
    }

    private AESSecretManager() {
    }
}
