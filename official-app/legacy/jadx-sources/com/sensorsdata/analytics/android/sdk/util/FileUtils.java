package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class FileUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static String readFileToString(File file) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream((File) file));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = bufferedInputStream.read(bArr, 0, 1024);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            SALog.printStackTrace(e);
                            return null;
                        }
                        String string = byteArrayOutputStream.toString();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            SALog.printStackTrace(e3);
                        }
                        return string;
                    } catch (IOException e4) {
                        e = e4;
                        SALog.printStackTrace(e);
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e6) {
                                SALog.printStackTrace(e6);
                            }
                        }
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    file = 0;
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    if (file == 0) {
                        throw th;
                    }
                    try {
                        file.close();
                        throw th;
                    } catch (IOException e9) {
                        SALog.printStackTrace(e9);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            SALog.printStackTrace(e10);
            return null;
        }
    }

    public static void writeToFile(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        SALog.printStackTrace(e);
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                SALog.printStackTrace(e3);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    SALog.printStackTrace(e4);
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
