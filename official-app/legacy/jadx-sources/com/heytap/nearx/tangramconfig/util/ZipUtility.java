package com.heytap.nearx.tangramconfig.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class ZipUtility {
    private static void zipDirectory(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isHidden()) {
            return;
        }
        if (file.isDirectory()) {
            if (str.endsWith("/")) {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                zipOutputStream.closeEntry();
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                zipOutputStream.closeEntry();
            }
            for (File file2 : file.listFiles()) {
                zipDirectory(file2, str + "/" + file2.getName(), zipOutputStream);
            }
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        fileInputStream.close();
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i);
                    Log.e("ZipUtility", "zipDirectory exception : " + e.toString());
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            Log.e("ZipUtility", "zipDirectory exception : " + e2.toString());
        }
    }

    public static void zipFile(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    if (!file.exists()) {
                        Log.e("ZipUtility", "File or directory does not exist: " + file.getAbsolutePath());
                    }
                    if (file.isDirectory()) {
                        zipDirectory(file, file.getName(), zipOutputStream);
                    } else {
                        zipSingleFile(file, zipOutputStream);
                    }
                    zipOutputStream.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e2) {
            Log.e("ZipUtility", "zip File exception : " + e2.toString());
        }
    }

    private static void zipSingleFile(File file, ZipOutputStream zipOutputStream) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        fileInputStream.close();
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i);
                    Log.e("ZipUtility", "zipSingleFile exception : " + e.toString());
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            Log.e("ZipUtility", "zipSingleFile exception : " + e2.toString());
        }
    }
}
