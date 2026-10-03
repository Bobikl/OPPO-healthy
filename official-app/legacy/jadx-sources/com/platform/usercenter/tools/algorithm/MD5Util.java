package com.platform.usercenter.tools.algorithm;

import com.platform.usercenter.tools.datastructure.ByteString;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes9.dex */
public class MD5Util {
    private static final String TAG = "MD5Util";

    private static String convertHashToString(byte[] bArr) {
        String str = "";
        if (bArr == null) {
            return "";
        }
        for (byte b : bArr) {
            str = str + Integer.toString((b & 255) + 256, 16).substring(1);
        }
        return str.toLowerCase();
    }

    public static String generateMD5(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                byte[] bArr = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream2.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                }
                String strConvertHashToString = convertHashToString(messageDigest.digest());
                try {
                    fileInputStream2.close();
                } catch (Exception unused) {
                }
                return strConvertHashToString;
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return "";
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getMD5(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            UCLogUtil.e(e2);
            return "";
        }
    }

    public static String md5Hex(String str) {
        if (str == null) {
            UCLogUtil.e(TAG, "md5Hex s is null");
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            if (bArrDigest != null && bArrDigest.length > 0) {
                return ByteString.of(bArrDigest).hex();
            }
            return null;
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }
}
