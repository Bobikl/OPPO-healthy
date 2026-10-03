package com.heytap.nearx.tangramconfig.util;

import android.text.TextUtils;
import com.oplus.aiunit.vision.hc3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes17.dex */
public class UnzipUtils {
    private static final String MAC_IGNORE = "__MACOSX/";

    public static void decompressGzipFile(String str, String str2) {
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(str));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = gZIPInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.close();
                            gZIPInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                gZIPInputStream.close();
                throw th4;
            }
        } catch (IOException unused) {
        }
    }

    public static File unAFileZip(File file) {
        if (!file.exists()) {
            return null;
        }
        String str = file.getParent() + file.getName() + hc3.CLASSIC_CONFIG_SUFFIX;
        unZipFile(file.getPath(), str);
        if (!new File(str).exists()) {
            decompressGzipFile(file.getPath(), str);
        }
        return new File(str);
    }

    public static void unZipFile(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
                try {
                    ZipFile zipFile = new ZipFile(file);
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            zipInputStream.close();
                            return;
                        }
                        String name = nextEntry.getName();
                        if (name == null || !name.contains(MAC_IGNORE)) {
                            File file2 = new File(str2);
                            if (nextEntry.isDirectory()) {
                                new File(str2).mkdirs();
                            } else {
                                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                byte[] bArr = new byte[1024];
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        InputStream inputStream = zipFile.getInputStream(nextEntry);
                                        while (true) {
                                            try {
                                                int i = inputStream.read(bArr);
                                                if (i == -1) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr, 0, i);
                                                }
                                            } catch (Throwable th) {
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                th.addSuppressed(th3);
                                            }
                                            throw th;
                                        }
                                        inputStream.close();
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        fileOutputStream.close();
                                        throw th4;
                                    }
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Exception unused2) {
            }
        }
    }
}
