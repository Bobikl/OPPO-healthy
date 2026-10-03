package com.omron;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class bl {
    public static boolean a(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    private static long b(File file) {
        long jB = 0;
        if (!g(file)) {
            return 0L;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                jB += file2.isDirectory() ? b(file2) : file2.length();
            }
        }
        return jB;
    }

    private static long c(File file) {
        long jB = b(file);
        if (jB == -1) {
            return 0L;
        }
        return jB;
    }

    private static long d(File file) {
        if (h(file)) {
            return file.length();
        }
        return -1L;
    }

    private static long e(File file) {
        long jD = d(file);
        if (jD == -1) {
            return 0L;
        }
        return jD;
    }

    public static long f(File file) {
        if (file == null) {
            return 0L;
        }
        return file.isDirectory() ? c(file) : e(file);
    }

    public static boolean g(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public static boolean h(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean i(File file) {
        if (file == null) {
            return false;
        }
        return file.exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedInputStream, java.io.InputStream] */
    public static byte[] j(File file) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? I = i(file);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (I == 0) {
            return null;
        }
        try {
            try {
                I = new BufferedInputStream(new FileInputStream(file), 524288);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[524288];
                        while (true) {
                            int i = I.read(bArr, 0, 524288);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            e.printStackTrace();
                            return null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            I.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        try {
                            I.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        I.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    if (0 == 0) {
                        throw th;
                    }
                    try {
                        byteArrayOutputStream2.close();
                        throw th;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        throw th;
                    }
                }
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String k(File file) throws Throwable {
        byte[] bArrJ = j(file);
        return bArrJ == null ? "" : new String(bArrJ);
    }

    public static boolean a(File file, String str) {
        if (file == null || !file.exists() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        File file2 = new File(file.getParent() + File.separator + str);
        return !file2.exists() && file.renameTo(file2);
    }

    public static File b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(str);
    }

    public static long c(String str) {
        return f(b(str));
    }

    public static boolean a(String str) {
        return a(b(str));
    }
}
