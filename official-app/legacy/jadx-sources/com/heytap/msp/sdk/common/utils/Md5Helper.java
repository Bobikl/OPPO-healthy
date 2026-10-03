package com.heytap.msp.sdk.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.SensitiveInfoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class Md5Helper {
    private static final String TAG = "Md5Helper";

    public static String generateRequestSign(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return getHashString(messageDigest);
        } catch (NoSuchAlgorithmException e2) {
            MspLog.e(TAG, "generateRequestSign: " + e2.getMessage());
            return null;
        }
    }

    private static String getHashString(MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static boolean verifyApkRightful(Context context, File file, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (file == null || !file.exists() || !file.isFile()) {
                MspLog.d(TAG, "APK file not exist");
                return false;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr, 0, 8192);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                    }
                    String hashString = getHashString(messageDigest);
                    MspLog.d(TAG, SensitiveInfoUtils.currencyReplace(hashString));
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(hashString) && TextUtils.equals(hashString, str)) {
                        fileInputStream.close();
                        return true;
                    }
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                MspLog.e(TAG, e2.getMessage());
            }
        } catch (Exception e3) {
            MspLog.e(TAG, "verifyApkRightful: " + e3.getMessage());
        }
        return false;
    }
}
