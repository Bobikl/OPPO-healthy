package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public class u7m {
    public static String a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        gZIPOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static byte[] b(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String c(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit.length == 0 ? "" : strArrSplit[strArrSplit.length - 1];
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String e(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode));
        byte[] bArr = new byte[256];
        while (true) {
            int i = gZIPInputStream.read(bArr);
            if (i < 0) {
                gZIPInputStream.close();
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static byte[] f(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[256];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i < 0) {
                gZIPInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    public static void g(Context context, Uri uri, File file) throws IOException {
        i(context.getContentResolver().openInputStream(uri), file);
    }

    public static void h(File file, File file2) throws IOException {
        i(new FileInputStream(file), file2);
    }

    public static void i(InputStream inputStream, File file) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                File file2 = new File(file, nextEntry.getName());
                String canonicalPath = file2.getCanonicalPath();
                String canonicalPath2 = file.getCanonicalPath();
                if (!canonicalPath.startsWith(canonicalPath2)) {
                    throw new IOException("Zip Path Security Exception, filePath is=" + canonicalPath + " targetPath is=" + canonicalPath2);
                }
                File parentFile = nextEntry.isDirectory() ? file2 : file2.getParentFile();
                if (parentFile != null && (parentFile.isDirectory() || parentFile.mkdirs())) {
                    if (!nextEntry.isDirectory()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        while (true) {
                            try {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        fileOutputStream.close();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to ensure directory: ");
                sb.append(parentFile != null ? parentFile.getAbsolutePath() : "null");
                throw new FileNotFoundException(sb.toString());
            }
        } catch (Throwable th2) {
            zipInputStream.close();
            throw th2;
        }
    }

    public static boolean j(String str, String str2) throws Throwable {
        ZipOutputStream zipOutputStream;
        File file = new File(str);
        BufferedInputStream bufferedInputStream = null;
        try {
            File file2 = new File(str2);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            try {
                if (file.isDirectory()) {
                    k(zipOutputStream, file, file.getParent().length());
                } else {
                    byte[] bArr = new byte[2048];
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str), 2048);
                    try {
                        ZipEntry zipEntry = new ZipEntry(c(str));
                        zipEntry.setTime(file.lastModified());
                        zipOutputStream.putNextEntry(zipEntry);
                        while (true) {
                            int i = bufferedInputStream2.read(bArr, 0, 2048);
                            if (i == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i);
                        }
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Exception unused) {
                        bufferedInputStream = bufferedInputStream2;
                        d(bufferedInputStream);
                        d(zipOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        d(bufferedInputStream);
                        d(zipOutputStream);
                        throw th;
                    }
                }
                d(bufferedInputStream);
                d(zipOutputStream);
                return true;
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            zipOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream = null;
        }
    }

    public static void k(ZipOutputStream zipOutputStream, File file, int i) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                k(zipOutputStream, file2, i);
            } else {
                byte[] bArr = new byte[2048];
                String path = file2.getPath();
                String strSubstring = path.substring(i);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path), 2048);
                ZipEntry zipEntry = new ZipEntry(strSubstring);
                zipEntry.setTime(file2.lastModified());
                zipOutputStream.putNextEntry(zipEntry);
                while (true) {
                    int i2 = bufferedInputStream.read(bArr, 0, 2048);
                    if (i2 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i2);
                    }
                }
                bufferedInputStream.close();
            }
        }
    }
}
