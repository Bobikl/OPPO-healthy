package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class za {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        if (str == null) {
            AcLogUtil.e("AcMD5Util", "md5Hex s is null");
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            if (bArrDigest != null && bArrDigest.length > 0) {
                return a(bArrDigest);
            }
            return null;
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            AcLogUtil.e("AcMD5Util", "md5Hex e=" + e2);
            return str;
        }
    }
}
