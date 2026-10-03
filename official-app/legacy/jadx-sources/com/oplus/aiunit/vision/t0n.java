package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public final class t0n {
    public static String a(String str) {
        FileInputStream fileInputStream;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                byte[] bArr = new byte[2048];
                MessageDigest messageDigest = MessageDigest.getInstance(w0n.t("ETUQ1"));
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                String strZ = w0n.z(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    a2n.e(e2, "MD5", "gfm");
                }
                return strZ;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            a2n.e(th, "MD5", "gfm");
            return null;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    a2n.e(e3, "MD5", "gfm");
                }
            }
        }
    }

    public static String b(byte[] bArr) {
        return w0n.z(c(bArr, w0n.t("ETUQ1")));
    }

    public static byte[] c(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            a2n.e(th, "MD5", "gmb");
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return w0n.z(f(str));
    }

    public static String e(String str) {
        return w0n.C(g(str));
    }

    public static byte[] f(String str) {
        try {
            return h(str);
        } catch (Throwable th) {
            a2n.e(th, "MD5", "gmb");
            return new byte[0];
        }
    }

    public static byte[] g(String str) {
        try {
            return h(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    public static byte[] h(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(w0n.t("ETUQ1"));
        messageDigest.update(w0n.n(str));
        return messageDigest.digest();
    }
}
