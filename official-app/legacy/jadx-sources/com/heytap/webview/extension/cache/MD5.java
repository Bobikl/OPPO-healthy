package com.heytap.webview.extension.cache;

import com.heytap.mcssdk.constant.MessageConstant$MessageType;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class MD5 {
    public static final String TAG = "MD5";
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            return "";
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = hexDigits;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[EXC_TOP_SPLITTER, PHI: r0
  0x0033: PHI (r0v6 java.io.BufferedInputStream) = (r0v5 java.io.BufferedInputStream), (r0v7 java.io.BufferedInputStream) binds: [B:19:0x0031, B:22:0x0037] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String getFileMD5(File file) throws Throwable {
        if (file.exists() && file.length() > 0) {
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    String inputStreamMd5 = getInputStreamMd5(bufferedInputStream2);
                    try {
                        bufferedInputStream2.close();
                        return inputStreamMd5;
                    } catch (IOException unused) {
                        return inputStreamMd5;
                    }
                } catch (FileNotFoundException unused2) {
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return "";
                } catch (OutOfMemoryError unused4) {
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused6) {
            } catch (OutOfMemoryError unused7) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    public static String getInputStreamMd5(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[MessageConstant$MessageType.MESSAGE_STAT];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr, 0, MessageConstant$MessageType.MESSAGE_STAT);
                if (i2 == -1) {
                    break;
                }
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                    i += i2;
                }
            }
            return i == 0 ? "" : bytesToHexString(messageDigest.digest());
        } catch (IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String toMD5(String str) {
        byte[] mD5Byte = toMD5Byte(str);
        return mD5Byte == null ? "" : bytesToHexString(mD5Byte);
    }

    public static byte[] toMD5Byte(String str) {
        try {
            return MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] toMD5Byte(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (Exception unused) {
            System.out.println("toMD5Byte, MessageDigest.getInstance crash!");
            return null;
        }
    }
}
