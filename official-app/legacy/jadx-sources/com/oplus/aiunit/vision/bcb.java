package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public class bcb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    public static byte[] a(String str) throws Throwable {
        ?? IsFile;
        FileInputStream fileInputStream;
        File file = new File(str);
        ?? r3 = 0;
        if (!file.exists() || (IsFile = file.isFile()) == 0 || file.length() <= 0) {
            wil.b("MD5Util", "getMD5: input file check error");
            return null;
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                try {
                    fileInputStream = new FileInputStream(str);
                    try {
                        byte[] bArr = new byte[1048576];
                        for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                            messageDigest.update(bArr, 0, i);
                        }
                        byte[] bArrDigest = messageDigest.digest();
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            wil.b("MD5Util", "IOException: " + e2.getMessage());
                        }
                        return bArrDigest;
                    } catch (IOException e3) {
                        e = e3;
                        wil.b("MD5Util", "getMD5: IOException " + e.getMessage());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                wil.b("MD5Util", "IOException: " + e4.getMessage());
                            }
                        }
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (r3 != 0) {
                        try {
                            r3.close();
                        } catch (IOException e6) {
                            wil.b("MD5Util", "IOException: " + e6.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = IsFile;
            }
        } catch (NoSuchAlgorithmException unused) {
            wil.b("MD5Util", "getMD5: can not get MD5 MessageDigest");
            return null;
        }
    }

    public static byte[] b(Context context, Uri uri) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                InputStream inputStreamOpenInputStream = context.getApplicationContext().getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return null;
                }
                try {
                    byte[] bArr = new byte[1048576];
                    for (int i = inputStreamOpenInputStream.read(bArr); i > 0; i = inputStreamOpenInputStream.read(bArr)) {
                        messageDigest.update(bArr, 0, i);
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    inputStreamOpenInputStream.close();
                    return bArrDigest;
                } catch (Throwable th) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                wil.b("MD5Util", "getMD5: IOException " + e2.getMessage());
                return null;
            }
        } catch (NoSuchAlgorithmException unused) {
            wil.b("MD5Util", "getMD5: can not get MD5 MessageDigest");
            return null;
        }
    }
}
