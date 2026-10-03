package com.heytap.log.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes19.dex */
public class GzipUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.ByteArrayOutputStream] */
    public static byte[] File2byte(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        fileInputStream.close();
                        byteArrayOutputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                                throw new RuntimeException(e5);
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e6) {
                                throw new RuntimeException(e6);
                            }
                        }
                    } catch (IOException e7) {
                        e = e7;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e8) {
                                throw new RuntimeException(e8);
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                                throw new RuntimeException(e9);
                            }
                        }
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                    byteArrayOutputStream = null;
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    if (file != 0) {
                        try {
                            file.close();
                        } catch (IOException e12) {
                            throw new RuntimeException(e12);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            throw new RuntimeException(e13);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e14) {
            e = e14;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (IOException e15) {
            e = e15;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            file = 0;
        }
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0062 -> B:55:0x0065). Please report as a decompilation issue!!! */
    public static void getFileByBytes(byte[] bArr, String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    File file = new File((String) str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    str = new FileOutputStream(new File(((String) str) + "/" + str2));
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(str);
                        try {
                            bufferedOutputStream2.write(bArr);
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            str.close();
                        } catch (Exception e3) {
                            e = e3;
                            bufferedOutputStream = bufferedOutputStream2;
                            e.printStackTrace();
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (str != 0) {
                                str.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (str == 0) {
                                throw th;
                            }
                            try {
                                str.close();
                                throw th;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public static byte[] gzip(String str) throws Exception {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("gzip文件 filename不能为空");
        }
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            byte[] bArrGzip = gzip(bArr);
            fileInputStream.close();
            return bArrGzip;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] ungzip(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArr2 = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = gZIPInputStream.read(bArr2, 0, 1024);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            byteArrayInputStream.close();
            throw th4;
        }
    }

    public static byte[] gzip(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003d A[Catch: IOException -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0041, blocks: (B:13:0x001d, B:32:0x003d), top: B:59:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0042 -> B:55:0x0045). Please report as a decompilation issue!!! */
    public static void getFileByBytes(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                            try {
                                bufferedOutputStream2.write(bArr);
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                                fileOutputStream.close();
                            } catch (Exception e3) {
                                e = e3;
                                bufferedOutputStream = bufferedOutputStream2;
                                e.printStackTrace();
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            e.printStackTrace();
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }
}
