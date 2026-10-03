package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public class yzm {
    public static int a(String str) {
        if ("shareToQQ".equals(str)) {
            return 10103;
        }
        if ("shareToQzone".equals(str)) {
            return 10104;
        }
        if ("addToQQFavorites".equals(str)) {
            return 10105;
        }
        if ("sendToMyComputer".equals(str)) {
            return 10106;
        }
        if ("shareToTroopBar".equals(str)) {
            return 10107;
        }
        if ("action_login".equals(str)) {
            return s04.REQUEST_LOGIN;
        }
        return "action_request".equals(str) ? 10100 : -1;
    }

    public static int b(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str != null && str2 == null) {
            return 1;
        }
        if (str == null && str2 != null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (strArrSplit.length > i) {
            return 1;
        }
        return strArrSplit2.length > i ? -1 : 0;
    }

    public static long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i == -1) {
                q8g.i("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j2);
                return j2;
            }
            outputStream.write(bArr, 0, i);
            j2 += (long) i;
        }
    }

    public static String d(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        return null;
    }

    public static String e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", new Class[0]).invoke(Environment.class, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean g(Context context, Intent intent) {
        return (context == null || intent == null || context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    @SuppressLint({"SdCardPath"})
    public static boolean h(String str, String str2, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        q8g.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libName: " + str);
        Context contextA = uum.a();
        if (contextA == null) {
            q8g.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, global context is null. ");
            return false;
        }
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("secure_lib", 0);
        File file = new File(contextA.getFilesDir(), str2);
        if (file.exists()) {
            int i2 = sharedPreferences.getInt("version", 0);
            q8g.i("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: " + i + " | oldVersion: " + i2);
            if (i == i2) {
                return true;
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        InputStream inputStream = null;
        fileOutputStreamOpenFileOutput = null;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        inputStream = null;
        try {
            InputStream inputStreamOpen = contextA.getAssets().open(str);
            try {
                fileOutputStreamOpenFileOutput = contextA.openFileOutput(str2, 0);
                c(inputStreamOpen, fileOutputStreamOpenFileOutput);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("version", i);
                editorEdit.commit();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream2;
                try {
                    q8g.g("openSDK_LOG.SystemUtils", "-->extractSecureLib, when copy lib execption.", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                FileOutputStream fileOutputStream3 = fileOutputStreamOpenFileOutput;
                inputStream = inputStreamOpen;
                fileOutputStream = fileOutputStream3;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean i(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.tencent.mobileqq", 0);
            q8g.i("openSDK_LOG.SystemUtils", "isQQInstalled true");
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            q8g.g("openSDK_LOG.SystemUtils", "PackageManager.NameNotFoundException", e2);
            return false;
        } catch (Exception e3) {
            q8g.g("openSDK_LOG.SystemUtils", "Exception", e3);
            return false;
        }
    }

    public static int j(Context context, String str) {
        return b(e(context, "com.tencent.mobileqq"), str);
    }

    public static boolean k(Context context) {
        return (context == null || context.getApplicationInfo().targetSdkVersion < 29 || f()) ? false : true;
    }

    public static int l(Context context, String str) {
        return b(e(context, s04.PACKAGE_TIM), str);
    }
}
