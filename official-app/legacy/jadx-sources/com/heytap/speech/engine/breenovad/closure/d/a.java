package com.heytap.speech.engine.breenovad.closure.d;

import android.content.Context;
import com.oplus.aiunit.vision.s04;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String[] b = {"0", "1", "2", "3", "4", "5", "6", "7", s04.VIA_SHARE_TYPE_PUBLISHVIDEO, "9", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f"};

    public static String a(byte b2) {
        int i = b2;
        if (b2 < 0) {
            i = b2 + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = b;
        sb.append(strArr[i / 16]);
        sb.append(strArr[i % 16]);
        return sb.toString();
    }

    public static String b(String str) {
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b2 : bArrDigest) {
                int i2 = i + 1;
                char[] cArr2 = a;
                cArr[i] = cArr2[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr[i2] = cArr2[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(Context context, String str) {
        InputStream inputStreamOpen;
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            inputStreamOpen = context.getAssets().open(str);
            while (true) {
                try {
                    int i = inputStreamOpen.read(bArr, 0, 1024);
                    if (i == -1) {
                        inputStreamOpen.close();
                        return b(messageDigest.digest());
                    }
                    messageDigest.update(bArr, 0, i);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            }
        } catch (Exception e4) {
            e = e4;
            inputStreamOpen = null;
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        fileInputStream.close();
                        return b(messageDigest.digest());
                    }
                    messageDigest.update(bArr, 0, i);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        }
    }

    public static final String a(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b2 : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(a(b2));
        }
        return stringBuffer.toString();
    }
}
