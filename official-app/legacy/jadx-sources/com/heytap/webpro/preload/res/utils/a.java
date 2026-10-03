package com.heytap.webpro.preload.res.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.zxing.common.StringUtils;
import com.oplus.aiunit.vision.d94;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.td7;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void a(String str, int i) {
        td7.d(d(str, i));
    }

    public static File b() {
        return new File(d94.b().getCacheDir(), "H5Preload");
    }

    public static String c() {
        return d94.b().getCacheDir().getAbsolutePath() + "/H5Preload/";
    }

    public static File d(String str, int i) {
        File file = new File(b(), String.format("/packages/%s/%s/", str, Integer.valueOf(i)));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File e(String str, int i, String str2) {
        return new File(d(str, i), String.format("%s.zip", str2));
    }

    public static File f(String str, String str2, String str3) throws IOException {
        File file = new File(new String((str2 + File.separator + str3).getBytes(StandardCharsets.ISO_8859_1), StringUtils.GB2312));
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.startsWith(new String(str.getBytes(StandardCharsets.ISO_8859_1), StringUtils.GB2312))) {
            throw new SecurityException("SecurityException: the file path is " + canonicalPath + ", destDir is " + str2);
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.createNewFile()) {
                q7b.d("PreloadResUtils", "create new file failed");
            }
        }
        return file;
    }

    public static boolean g(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.isDirectory() && file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0;
    }

    public static boolean h(Context context, long j2) {
        StorageHelper.StorageBean storageBeanC = StorageHelper.c(context);
        long totalSizeWithByte = storageBeanC.getTotalSizeWithByte() - storageBeanC.getUsedSizeWithByte();
        q7b.i("PreloadResUtils", "total size:  " + storageBeanC.getTotalSize() + "  remained size：  " + totalSizeWithByte + "  need size:  " + j2);
        return totalSizeWithByte >= j2 * 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean i(ZipFile zipFile, ZipEntry zipEntry, String str, String str2, String str3) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f(str3, str, str2));
            try {
                CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
                byte[] bArr = new byte[4096];
                long size = zipEntry.getSize();
                while (true) {
                    if (size <= 0) {
                        break;
                    }
                    int i = checkedInputStream.read(bArr, 0, 4096);
                    fileOutputStream.write(bArr, 0, i);
                    size -= (long) i;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    throw th;
                }
                boolean z = zipEntry.getCrc() == checkedInputStream.getChecksum().getValue();
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return z;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }

    public static void j(String str, String str2, String str3) throws IOException {
        File file = new File(str + File.separator + str2);
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.startsWith(str3)) {
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        } else {
            throw new SecurityException("SecurityException: the file path is " + canonicalPath + ", destDir is " + str);
        }
    }

    public static boolean k(String str, String str2) throws IOException {
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return false;
        }
        String canonicalPath = new File(str2).getCanonicalPath();
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (name != null) {
                    name = name.replace("\\", File.separator);
                }
                if (zipEntryNextElement.isDirectory()) {
                    j(str2, name, canonicalPath);
                } else if (!i(zipFile, zipEntryNextElement, str2, name, canonicalPath)) {
                    break;
                }
            }
            zipFile.close();
            return true;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
