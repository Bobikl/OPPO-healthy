package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class td7 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb.toString();
                    bufferedReader.close();
                    return string;
                }
                sb.append(line);
                sb.append(Weather.SEPARATOR);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean b(File file, File file2, boolean z) {
        if (file == null || file2 == null) {
            q7b.a("FileUtils", "copyOrMoveFile file is null!");
            return false;
        }
        if (file.equals(file2)) {
            q7b.a("FileUtils", "copyOrMoveFile files are equal!");
            return false;
        }
        if (!file.exists() || !file.isFile()) {
            q7b.a("FileUtils", "copyOrMoveFile srcFile is not exist!");
            return false;
        }
        if (file2.exists() && !file2.delete()) {
            q7b.a("FileUtils", "copyOrMoveFile destFile is not exist!");
            return false;
        }
        if (!c(file2.getParentFile())) {
            q7b.a("FileUtils", "copyOrMoveFile parent file create failed!");
            return false;
        }
        if (z && TextUtils.equals(file.getParent(), file2.getParent())) {
            q7b.a("FileUtils", "copyOrMoveFile rename!");
            return file.renameTo(file2);
        }
        try {
            if (j(file2, new FileInputStream(file))) {
                return !z || f(file);
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean c(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean d(File file) {
        File[] fileArrListFiles;
        if (file != null && file.exists()) {
            try {
                if (file.isFile()) {
                    return file.delete();
                }
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
                    for (File file2 : fileArrListFiles) {
                        f(file2);
                    }
                }
                return file.delete();
            } catch (Exception e2) {
                q7b.f("FileUtils", "deleteDir failed!", e2);
            }
        }
        return false;
    }

    public static boolean e(String str) {
        return d(new File(str));
    }

    public static boolean f(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    public static String g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String strK = k(messageDigest.digest());
                        fileInputStream.close();
                        return strK;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | OutOfMemoryError | NoSuchAlgorithmException e2) {
            q7b.f("FileUtils", "getFileMD5 failed!", e2);
            return null;
        }
    }

    public static boolean h(File file, File file2) {
        return b(file, file2, true);
    }

    public static String i(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
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
    }

    public static boolean j(File file, InputStream inputStream) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return true;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            q7b.f("FileUtils", "saveToFile failed!", e2);
            return false;
        }
    }

    public static String k(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b & 240) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
