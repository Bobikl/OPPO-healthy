package com.heytap.log.util;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.dto.TraceConfigDto;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class FileUtil {
    public static byte[] File2byte(String str) {
        return File2byte(getFile(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.FileOutputStream] */
    public static boolean copyFile(String str, String str2) throws Throwable {
        StringBuilder sb;
        ?? r3 = 0;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        r3 = 0;
        try {
            try {
                FileInputStream fileInputStream3 = new FileInputStream(new File((String) str));
                try {
                    str = new FileOutputStream(new File(str2));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream3.read(bArr);
                            if (i >= 0) {
                                str.write(bArr, 0, i);
                                str.flush();
                            } else {
                                try {
                                    break;
                                } catch (Exception e2) {
                                    Log.e("HLog", "copyFile : " + e2.toString());
                                }
                            }
                        }
                        fileInputStream3.close();
                        try {
                            str.close();
                        } catch (Exception e3) {
                            Log.e("HLog", "copyFile : " + e3.toString());
                        }
                        return true;
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        fileInputStream = fileInputStream3;
                        str = str;
                        Log.e("HLog", "copyFile : " + e.toString());
                        r3 = fileInputStream;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                r3 = fileInputStream;
                            } catch (Exception e5) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("copyFile : ");
                                sb2.append(e5.toString());
                                Log.e("HLog", sb2.toString());
                                r3 = sb2;
                            }
                        }
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e6) {
                                e = e6;
                                sb = new StringBuilder();
                                sb.append("copyFile : ");
                                sb.append(e.toString());
                                Log.e("HLog", sb.toString());
                                return false;
                            }
                        }
                        return false;
                    } catch (IOException e7) {
                        e = e7;
                        fileInputStream2 = fileInputStream3;
                        str = str;
                        Log.e("HLog", "copyFile : " + e.toString());
                        r3 = fileInputStream2;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                                r3 = fileInputStream2;
                            } catch (Exception e8) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("copyFile : ");
                                sb3.append(e8.toString());
                                Log.e("HLog", sb3.toString());
                                r3 = sb3;
                            }
                        }
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e9) {
                                e = e9;
                                sb = new StringBuilder();
                                sb.append("copyFile : ");
                                sb.append(e.toString());
                                Log.e("HLog", sb.toString());
                                return false;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        r3 = fileInputStream3;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e10) {
                                Log.e("HLog", "copyFile : " + e10.toString());
                            }
                        }
                        if (str == 0) {
                            throw th;
                        }
                        try {
                            str.close();
                            throw th;
                        } catch (Exception e11) {
                            Log.e("HLog", "copyFile : " + e11.toString());
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    e = e12;
                    str = 0;
                } catch (IOException e13) {
                    e = e13;
                    str = 0;
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e14) {
            e = e14;
            str = 0;
        } catch (IOException e15) {
            e = e15;
            str = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
        }
    }

    public static void deleteEarlyFile(File[] fileArr) {
        long jLastModified;
        File file;
        if (fileArr == null) {
            return;
        }
        File file2 = null;
        long j2 = 0;
        for (int i = 0; i < fileArr.length; i++) {
            if (i == 0) {
                jLastModified = fileArr[0].lastModified();
                file = fileArr[0];
            } else {
                if (fileArr[i].lastModified() < j2) {
                    jLastModified = fileArr[i].lastModified();
                    file = fileArr[i];
                }
            }
            long j3 = jLastModified;
            file2 = file;
            j2 = j3;
        }
        if (file2 != null) {
            file2.delete();
        }
    }

    public static void deleteOldFile(File[] fileArr, long j2) {
        if (fileArr == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < fileArr.length; i++) {
            if (jCurrentTimeMillis - fileArr[i].lastModified() > j2) {
                fileArr[i].delete();
            }
        }
    }

    public static File getDirectory(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File getFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            return null;
        }
    }

    public static String getLogPathToZip(TraceConfigDto traceConfigDto, String str) {
        if (traceConfigDto == null || TextUtils.isEmpty(traceConfigDto.getKeyWords())) {
            return str;
        }
        return str + File.separator + "kws";
    }

    public static File reNameFile(String str, File file) {
        if (file == null) {
            return null;
        }
        String str2 = str + "_" + file.length() + "_" + file.getName();
        File file2 = new File(file.getAbsolutePath().replace(file.getName(), "") + str2);
        if (!file.renameTo(file2)) {
            return file;
        }
        file.delete();
        return file2;
    }

    public static byte[] File2byte(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }
}
