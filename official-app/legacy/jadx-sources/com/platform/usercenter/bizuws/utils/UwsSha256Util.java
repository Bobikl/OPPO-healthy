package com.platform.usercenter.bizuws.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes9.dex */
public class UwsSha256Util {
    private static final String DEFAULT_KEY_SHA256 = "750f37126039926610450cde15c7ce05";
    private static final String KEY_SHA256_SALT = "KEY_SHA256_SALT";
    public static final String SHA1 = "sha-1";
    public static final String SHA224 = "sha-224";
    public static final String SHA256 = "sha-256";
    private static String SHA256_SALT = "";
    private static final String SHA256_SP_NAME = "uc_uws_sp_file";
    public static final String SHA384 = "sha-384";
    public static final String SHA512 = "sha-512";

    public static String SHA(String str, @Nullable @SHAType String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = SHA256;
        }
        try {
            String str3 = "";
            for (byte b : MessageDigest.getInstance(str2).digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str3 = str3 + hexString;
            }
            return str3;
        } catch (NoSuchAlgorithmException e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }

    public static String SHASalt(String str, @Nullable @SHAType String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = SHA256;
        }
        String sha256Salt = getSha256Salt();
        if (TextUtils.isEmpty(sha256Salt)) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str2).digest((str + sha256Salt).getBytes());
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str3 = str3 + hexString;
            }
            return str3;
        } catch (NoSuchAlgorithmException e2) {
            UCLogUtil.e(e2);
            return str3;
        }
    }

    public static String getSHA256(String str) {
        return TextUtils.isEmpty(str) ? "" : SHASalt(str, SHA256);
    }

    public static String getSha256Salt() {
        if (TextUtils.isEmpty(SHA256_SALT)) {
            SHA256_SALT = BaseApp.mContext.getSharedPreferences(SHA256_SP_NAME, 0).getString(KEY_SHA256_SALT, DEFAULT_KEY_SHA256);
        }
        return SHA256_SALT;
    }

    public static void setSha256Salt(String str) {
        BaseApp.mContext.getSharedPreferences(SHA256_SP_NAME, 0).edit().putString(KEY_SHA256_SALT, str).apply();
    }
}
