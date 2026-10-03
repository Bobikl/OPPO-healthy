package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wd7 {
    public static final String TAG = "FileUtils";
    public static final String OLD_VERSION_WATCH_FACE_MANAGER_ROOT_DIR = Environment.getExternalStorageDirectory() + "/SportHealth/WatchFace";
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code duplicated, block: B:65:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[SYNTHETIC] */
    public static boolean b(String str, File file, boolean z) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(str + "/" + file.getName());
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.flush();
                    if (z) {
                        h(file);
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e2) {
                        ltl.a("FileUtils", "[copyFile]  fileInputStream IOException " + e2.getMessage());
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        ltl.a("FileUtils", "[copyFile]  fileOutputStream IOException " + e3.getMessage());
                    }
                    return true;
                } catch (Exception e4) {
                    e = e4;
                    fileInputStream = fileInputStream2;
                    try {
                        ltl.a("FileUtils", "[copyFile]  Exception " + e.getMessage());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                ltl.a("FileUtils", "[copyFile]  fileInputStream IOException " + e5.getMessage());
                            }
                        }
                        if (fileOutputStream == null) {
                            return false;
                        }
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException e6) {
                            ltl.a("FileUtils", "[copyFile]  fileOutputStream IOException " + e6.getMessage());
                            return false;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e7) {
                                ltl.a("FileUtils", "[copyFile]  fileInputStream IOException " + e7.getMessage());
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e8) {
                            ltl.a("FileUtils", "[copyFile]  fileOutputStream IOException " + e8.getMessage());
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static void c(String str, String str2, String[] strArr, boolean z) throws Exception {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str3 : strArr) {
            String str4 = File.separator;
            File file = str.endsWith(str4) ? new File(str + str3) : new File(str + str4 + str3);
            if (file.isDirectory()) {
                boolean zE = e(str + "/" + str3, str2 + "/" + str3, z);
                StringBuilder sb = new StringBuilder();
                sb.append("[copyFile] copeStatus ");
                sb.append(zE);
                ltl.a("FileUtils", sb.toString());
                if (!zE) {
                    throw new Exception("copyFolder error");
                }
            } else {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    ltl.a("FileUtils", "[copyFile]  oldFile not exist ||ldFile not file ||oldFile cannot read");
                    throw new Exception("oldFile not exist ||ldFile not file ||oldFile cannot read");
                }
                if (!b(str2, file, z)) {
                    throw new Exception("copyFile error");
                }
            }
        }
    }

    public static boolean d(String str, String str2) {
        return e(str, str2, true);
    }

    public static boolean e(String str, String str2, boolean z) {
        ltl.a("FileUtils", "[copyFolder] copy from " + str + " to " + str2);
        try {
            File file = new File(str2);
            if (!file.exists() && !file.mkdirs()) {
                ltl.a("FileUtils", "copyFolder: cannot create directory.");
                return false;
            }
            File file2 = new File(str);
            c(str, str2, file2.list(), z);
            if (!z) {
                return true;
            }
            h(file2);
            return true;
        } catch (Exception e2) {
            ltl.a("FileUtils", "copyFolder: cannot create directory.Exception " + e2.getMessage());
            return false;
        }
    }

    public static void f(String str) {
        File file = new File(str + "/.nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Exception e2) {
            ltl.b("FileUtils", "[createIgnoreMediaFile] --> e=" + e2.getMessage());
        }
    }

    public static void g(String str) {
        File file = new File(str);
        if (file.exists()) {
            ltl.d("FileUtils", "[delete] needDelFile = " + file + ", status = " + file.delete());
        }
    }

    public static void h(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        ltl.a("FileUtils", "[deleteFile]  delete " + file.delete());
    }

    public static String i(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        try {
            fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileInputStream.close();
                        return q(messageDigest.digest());
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Exception e2) {
                e = e2;
                ltl.b("FileUtils", "catch exception = " + e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                        ltl.b("FileUtils", e.getMessage());
                    }
                }
                return null;
            } catch (OutOfMemoryError e3) {
                e = e3;
                ltl.b("FileUtils", "catch exception = " + e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        ltl.b("FileUtils", e4.getMessage());
                    }
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            fileInputStream = null;
        }
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/")) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        return strArrSplit[strArrSplit.length - 1];
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static String k(Context context, Uri uri) throws Throwable {
        Cursor cursorQuery;
        ?? r2 = 0;
        string = null;
        string = null;
        string = null;
        String string = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ltl.b("FileUtils", "[getPathFromUri] --> error=" + e.getMessage());
                        if (cursorQuery != null) {
                        }
                        return string;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r2 = context;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return string;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static /* synthetic */ void m(ComponentName componentName, String str, String str2, x5h x5hVar) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        FileWriter fileWriter;
        Exception e2;
        if (b78.a() == null) {
            x5hVar.onError(new Throwable("applicationContext==null"));
            return;
        }
        if (componentName == null) {
            x5hVar.onError(new Throwable("componentName==null"));
            return;
        }
        File file = new File(str, componentName.getPackageName());
        if (!(file.exists() ? true : file.mkdirs())) {
            x5hVar.onError(new Throwable("package dir not exist"));
            return;
        }
        try {
            fileWriter = new FileWriter(new File(file, componentName.getClassName() + hc3.CLASSIC_CONFIG_SUFFIX), false);
            try {
                bufferedWriter = new BufferedWriter(fileWriter);
                try {
                    try {
                        bufferedWriter.write(str2);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (Exception e3) {
                        e2 = e3;
                        ltl.b("FileUtils", "[saveStyleInfo] --> " + e2.getMessage());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    nt9.a(bufferedWriter, "FileUtils");
                    nt9.a(fileWriter, "FileUtils");
                    throw th;
                }
            } catch (Exception e4) {
                bufferedWriter = null;
                e2 = e4;
            } catch (Throwable th3) {
                bufferedWriter = null;
                th = th3;
                nt9.a(bufferedWriter, "FileUtils");
                nt9.a(fileWriter, "FileUtils");
                throw th;
            }
        } catch (Exception e5) {
            bufferedWriter = null;
            e2 = e5;
            fileWriter = null;
        } catch (Throwable th4) {
            bufferedWriter = null;
            th = th4;
            fileWriter = null;
        }
        nt9.a(bufferedWriter, "FileUtils");
        nt9.a(fileWriter, "FileUtils");
        x5hVar.onSuccess(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static JSONObject n(String str, String str2, String str3) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        File file = new File(str, str2);
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        if (!file.exists()) {
            ltl.i("FileUtils", "[loadSdcardStyle] pkgDir == null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            File file2 = new File(file, str3 + hc3.CLASSIC_CONFIG_SUFFIX);
            if (!file2.exists()) {
                ltl.i("FileUtils", "[loadSdcardStyle] styleFile == null");
                nt9.a(null, "FileUtils");
                nt9.a(null, "FileUtils");
                nt9.a(null, "FileUtils");
                return null;
            }
            fileInputStream = new FileInputStream(file2);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    JSONObject jSONObject = new JSONObject(sb.toString());
                                    nt9.a(bufferedReader, "FileUtils");
                                    nt9.a(inputStreamReader, "FileUtils");
                                    nt9.a(fileInputStream, "FileUtils");
                                    return jSONObject;
                                }
                                sb.append(line);
                            } catch (Exception e2) {
                                e = e2;
                                ltl.i("FileUtils", "[loadSdcardStyle] Exception " + e.getMessage());
                                nt9.a(bufferedReader, "FileUtils");
                                nt9.a(inputStreamReader, "FileUtils");
                                nt9.a(fileInputStream, "FileUtils");
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r6 = bufferedReader;
                        }
                        th = th;
                        r6 = bufferedReader;
                        nt9.a(r6, "FileUtils");
                        nt9.a(inputStreamReader, "FileUtils");
                        nt9.a(fileInputStream, "FileUtils");
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = 0;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                ltl.i("FileUtils", "[loadSdcardStyle] Exception " + e.getMessage());
                nt9.a(bufferedReader, "FileUtils");
                nt9.a(inputStreamReader, "FileUtils");
                nt9.a(fileInputStream, "FileUtils");
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            inputStreamReader = null;
        }
    }

    public static void o(InputStream inputStream, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e2;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    try {
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = bufferedInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, i);
                                }
                            }
                            bufferedOutputStream.flush();
                            fileOutputStream.flush();
                        } catch (IOException e3) {
                            e2 = e3;
                            ltl.b("FileUtils", e2.getMessage());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        nt9.a(bufferedInputStream, "FileUtils");
                        nt9.a(fileOutputStream, "FileUtils");
                        nt9.a(bufferedOutputStream, "FileUtils");
                        throw th;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    bufferedOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    nt9.a(bufferedInputStream, "FileUtils");
                    nt9.a(fileOutputStream, "FileUtils");
                    nt9.a(bufferedOutputStream, "FileUtils");
                    throw th;
                }
            } catch (IOException e5) {
                bufferedOutputStream = null;
                e2 = e5;
                fileOutputStream = null;
            } catch (Throwable th4) {
                bufferedOutputStream = null;
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException e6) {
            bufferedOutputStream = null;
            bufferedInputStream = null;
            e2 = e6;
            fileOutputStream = null;
        } catch (Throwable th5) {
            bufferedOutputStream = null;
            bufferedInputStream = null;
            th = th5;
            fileOutputStream = null;
        }
        nt9.a(bufferedInputStream, "FileUtils");
        nt9.a(fileOutputStream, "FileUtils");
        nt9.a(bufferedOutputStream, "FileUtils");
    }

    public static void p(final ComponentName componentName, final String str, final String str2, l6h<Boolean> l6hVar) {
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.sd7
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                wd7.m(componentName, str2, str, x5hVar);
            }
        }).y(su8.c()).s(f30.c()).b(l6hVar);
    }

    public static String q(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static boolean r(String str, String str2, String str3, int i) {
        if (!l(str2)) {
            return false;
        }
        return v9g.x(str).D(isf.SP_TAG_RES_MD5 + str3 + i).equalsIgnoreCase(i(new File(str2)));
    }
}
