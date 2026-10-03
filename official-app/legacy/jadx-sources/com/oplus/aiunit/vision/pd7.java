package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes8.dex */
public class pd7 {
    @SuppressLint({"NewApi"})
    public static void a(Object obj) {
        if (obj == null) {
            w7i.c(plm.a, "Closeable obj null", new Object[0]);
            return;
        }
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException unused) {
                w7i.c(plm.a, "Closeable error", new Object[0]);
            }
        } else {
            throw new IllegalArgumentException("obj: " + obj + " cannot be closed.");
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    bufferedOutputStream.flush();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, i);
            }
        } finally {
            a(outputStream);
            a(inputStream);
        }
    }

    public static boolean c(File file) {
        return d(file, true);
    }

    public static boolean d(File file, boolean z) {
        File[] fileArrListFiles;
        if (g(file)) {
            return false;
        }
        if (file.isFile()) {
            e(file);
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            c(file2);
        }
        if (!z) {
            return true;
        }
        e(file);
        return true;
    }

    public static boolean e(File file) {
        if (g(file)) {
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
                w7i.i(plm.a, "deleteFileSafely error " + e2.getMessage(), new Object[0]);
                z = false;
            }
        }
        w7i.a(plm.a, z + " to delete file: " + file.getAbsolutePath(), new Object[0]);
        return z;
    }

    public static boolean f(File file, String str) {
        if (g(file)) {
            w7i.a(plm.a, "deleteOthersDirs current null", new Object[0]);
            return false;
        }
        File parentFile = file.getParentFile();
        if (g(parentFile)) {
            w7i.a(plm.a, "deleteOthersDirs parent null", new Object[0]);
            return false;
        }
        File[] fileArrListFiles = parentFile.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            w7i.a(plm.a, "deleteOthersDirs files null", new Object[0]);
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && !file2.getName().equals(file.getName()) && !file2.getName().equals(a8i.DOWNLOAD)) {
                if (!TextUtils.isEmpty(str)) {
                    File file3 = new File(file2, str);
                    if (file3.exists()) {
                        file3.setWritable(true);
                        file3.setExecutable(true);
                    }
                }
                c(file2);
            }
        }
        return true;
    }

    public static boolean g(File file) {
        return file == null || !file.exists();
    }

    public static String h(File file) {
        if (g(file)) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strI = i(fileInputStream);
                fileInputStream.close();
                return strI;
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

    @SuppressLint({"UnsafeHashAlgorithmDetector"})
    public static String i(InputStream inputStream) {
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
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean j(File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }
}
