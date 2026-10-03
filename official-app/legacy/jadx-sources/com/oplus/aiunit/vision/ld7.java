package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public final class ld7 {
    public static final String APP_SDCARD_DIR = "SportHealth";
    public static final String BAND_DIAL_BMP;
    public static final String BAND_DIAL_FILE;
    public static final String BAND_OTA_FILE;
    public static final String DEVICE_OTA_FILE;
    public static final String MEDAL_PICTURE_DIR = "SportHealth/Medal/Picture";
    public static final String MEDAL_VIDEO_DIR = "SportHealth/Medal/Video";
    public static final String SEEDLING_CARDP_ROVIDER;
    public static final String SHARE_PICTURE_DIR = "/" + Environment.DIRECTORY_DOWNLOADS + "/SportHealth/LocalShare/";
    public static final String TAG = "FileUtil";
    public static final String a;

    static {
        String str = b78.a().getFilesDir() + "/band";
        a = str;
        BAND_OTA_FILE = str + "/ota";
        String str2 = str + "/dial";
        BAND_DIAL_FILE = str2;
        BAND_DIAL_BMP = str2 + "/bmp";
        StringBuilder sb = new StringBuilder();
        File externalFilesDir = b78.a().getExternalFilesDir(null);
        Objects.requireNonNull(externalFilesDir);
        sb.append(externalFilesDir.getPath());
        sb.append("/seedlingcard");
        SEEDLING_CARDP_ROVIDER = sb.toString();
        DEVICE_OTA_FILE = b78.a().getFilesDir() + "/device_ota";
    }

    public static boolean A(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
            try {
                fileOutputStream2.write(str2.getBytes(Charset.defaultCharset()));
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public static void B(List<File> list, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[1024];
        ?? HasNext = 0;
        HasNext = 0;
        HasNext = 0;
        HasNext = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                    try {
                        Iterator<File> it = list.iterator();
                        while (true) {
                            HasNext = it.hasNext();
                            if (HasNext == 0) {
                                break;
                            }
                            File next = it.next();
                            if (next.isFile()) {
                                a(next, zipOutputStream, bArr);
                            }
                        }
                        zipOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        HasNext = zipOutputStream;
                        a7b.b(TAG, "zipFiles error " + e.getMessage());
                        if (HasNext != 0) {
                            HasNext.close();
                        }
                        if (fileOutputStream != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        HasNext = zipOutputStream;
                        if (HasNext != 0) {
                            HasNext.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        fileOutputStream.close();
    }

    public static void a(File file, ZipOutputStream zipOutputStream, byte[] bArr) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            fileInputStream2.close();
                            return;
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    a7b.b(TAG, "addToZip error " + e.getMessage());
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("cocyFile() called with: source = [");
        sb.append(str);
        sb.append("], target = [");
        sb.append(str2);
        sb.append("]");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                return false;
            }
            File parentFile = file2.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return false;
            }
            try {
                if (!file2.createNewFile()) {
                    return false;
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i <= 0) {
                                bufferedOutputStream.flush();
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                return true;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    bufferedOutputStream.close();
                    throw th4;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static File c(String str, int i) {
        File file = new File(k(i) + "/" + str + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File d(String str, String str2, int i) {
        return new File(c(str, i), str2);
    }

    public static File e(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static File f(String str, String str2, String str3, int i) {
        return d(str, m(str2, str3), i);
    }

    public static File g(String str, String str2, String str3) {
        String strM = m(str2, str3);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, strM);
    }

    public static void h(String str) {
        if (str == null) {
            return;
        }
        try {
            new File(str).delete();
        } catch (Throwable th) {
            a7b.b(TAG, "deleteFile e: " + th);
        }
    }

    public static void i(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    i(file2);
                }
                file2.delete();
            }
        }
        file.delete();
    }

    public static String j() {
        return k(7);
    }

    public static String k(int i) {
        return (Environment.getExternalStorageState().equals("mounted") && PermissionRequestDialog.D(i, "android.permission.WRITE_EXTERNAL_STORAGE")) ? Environment.getExternalStorageDirectory().getPath() : b78.a().getFilesDir().getPath();
    }

    public static String l(String str) {
        return p(str).getPath() + File.separator + z(str);
    }

    public static String m(String str, String str2) {
        return q(str) + "." + str2;
    }

    public static String n() {
        return b78.a().getFilesDir().getPath();
    }

    public static long o(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    public static File p(String str) {
        return new File(b78.a().getFilesDir().getAbsolutePath() + File.separator + z(str));
    }

    public static String q(String str) {
        return new SimpleDateFormat("'" + str + "'_yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    }

    public static String r(File file) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return sb.toString();
                    }
                    sb.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void s(File file) {
        MediaScannerConnection.scanFile(b78.a(), new String[]{Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath()}, null, null);
        String str = Build.BRAND;
        if (str == null || !str.toLowerCase().contains("huawei")) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        b78.a().sendBroadcast(intent);
    }

    public static File t(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str, String str2, int i) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        File fileE = e(str, str2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    bitmap.compress(compressFormat, i, bufferedOutputStream);
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    s(fileE);
                    return fileE;
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
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
        } catch (IOException e2) {
            a7b.b(TAG, "saveBitmap ioexception:" + e2.getMessage());
        }
    }

    public static File u(Bitmap bitmap, String str, int i) {
        return v(bitmap, str, i, false);
    }

    public static File v(Bitmap bitmap, String str, int i, boolean z) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        File fileG = z ? g(str, "DOWN_LOAD", "jpg") : f(str, "DOWN_LOAD", "jpg", 1);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileG);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, i, bufferedOutputStream);
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    s(fileG);
                    return fileG;
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
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
        } catch (IOException e2) {
            a7b.b(TAG, "saveBitmap ioexception:" + e2.getMessage());
        }
    }

    public static String w(long j2) {
        return Formatter.formatFileSize(b78.a(), j2);
    }

    public static String x(File file) {
        return w(file.length());
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static File y(Uri uri) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        InputStream inputStream2 = null;
        try {
            a7b.b("UriToFile", "uri " + uri);
            ContentResolver contentResolver = b78.b().getContentResolver();
            String type = contentResolver.getType(uri);
            if (type == null) {
                a7b.b("UriToFile", "mimeType null");
                return null;
            }
            String strSubstring = type.substring(type.lastIndexOf(47) + 1);
            File file = new File(b78.a().getCacheDir(), "temp/uri_file_" + uri.hashCode() + "." + strSubstring);
            if (file.exists()) {
                a7b.b("UriToFile", "file.exists() " + file.getName());
                return file;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                file.mkdirs();
            } else if (!parentFile.exists()) {
                parentFile.mkdir();
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    a7b.b("UriToFile", "openInputStream null");
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e2) {
                            a7b.c("UriToFile", "Error closing input stream", e2);
                        }
                    }
                    return null;
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.flush();
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e3) {
                        a7b.c("UriToFile", "Error closing input stream", e3);
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        a7b.c("UriToFile", "Error closing output stream", e4);
                    }
                    return file;
                } catch (Exception e5) {
                    inputStream = inputStreamOpenInputStream;
                    e = e5;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        a7b.c("UriToFile", "Error converting uri to file", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e6) {
                                a7b.c("UriToFile", "Error closing input stream", e6);
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e7) {
                                a7b.c("UriToFile", "Error closing output stream", e7);
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        fileOutputStream = fileOutputStream2;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e8) {
                                a7b.c("UriToFile", "Error closing input stream", e8);
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e9) {
                            a7b.c("UriToFile", "Error closing output stream", e9);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    inputStream2 = inputStreamOpenInputStream;
                    th = th2;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e10) {
                fileOutputStream2 = null;
                inputStream = inputStreamOpenInputStream;
                e = e10;
            } catch (Throwable th3) {
                inputStream2 = inputStreamOpenInputStream;
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
            fileOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static String z(String str) {
        return vbb.b(str);
    }
}
