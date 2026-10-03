package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public class plm {
    public static final String a = "Split.FileUtil";
    public static final int b = 8192;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15401c = "MD5";
    public static final int d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15402e = 3;

    @SuppressLint({"UnsafeHashAlgorithmDetector"})
    public static String a(InputStream inputStream) {
        int i;
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuilder sb = new StringBuilder(32);
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            for (byte b2 : messageDigest.digest()) {
                sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b(File file) {
        return c(file, true);
    }

    public static boolean c(File file, boolean z) {
        File[] fileArrListFiles;
        if (f(file)) {
            return false;
        }
        if (file.isFile()) {
            d(file);
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            b(file2);
        }
        if (!z) {
            return true;
        }
        d(file);
        return true;
    }

    public static boolean d(File file) {
        if (f(file)) {
            return true;
        }
        int i = 0;
        boolean z = false;
        while (i < 3 && !z) {
            i++;
            try {
                Files.delete(file.toPath());
                z = true;
            } catch (IOException e2) {
                hpm.e(a, "deleteFileSafely error " + e2.getMessage(), new Object[0]);
                z = false;
            }
        }
        hpm.b(a, z + " to delete file: " + file.getAbsolutePath(), new Object[0]);
        return z;
    }

    public static boolean e(File file) {
        if (f(file)) {
            hpm.b(a, "deleteOthersDirs current null", new Object[0]);
            return false;
        }
        File parentFile = file.getParentFile();
        if (f(parentFile)) {
            hpm.b(a, "deleteOthersDirs parent null", new Object[0]);
            return false;
        }
        File[] fileArrListFiles = parentFile.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            hpm.b(a, "deleteOthersDirs files null", new Object[0]);
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && !file2.getName().equals(file.getName())) {
                c(file2, true);
            }
        }
        return true;
    }

    public static boolean f(File file) {
        return file == null || !file.exists();
    }

    public static String g(File file) {
        if (f(file)) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strA = a(fileInputStream);
                fileInputStream.close();
                return strA;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
