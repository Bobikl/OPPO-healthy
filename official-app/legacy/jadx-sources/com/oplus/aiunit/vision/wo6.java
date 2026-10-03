package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.JsonObject;
import com.oplus.weatherservicesdk.data.Weather;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
public class wo6 extends k7a {
    public static final String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f18330j;
    public static final String[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f18331l;
    public static final String[] m = {"/ueventd.android_x86.rc", "/init.android_x86.rc", "/fstab.android_x86"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f18332n;
    public static final String[] o;
    public static final String[] p;
    public static final TreeMap<String, String[]> q;
    public static final String[] r;
    public boolean a = false;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18333c = false;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18334e = false;
    public boolean f = false;
    public boolean g = false;
    public int h = 0;

    static {
        String[] strArr = {"/system/bin/ludashi-prop", "/system/etc/init.ludashi.sh"};
        i = strArr;
        String[] strArr2 = {"/system/etc/mumu-configs/device-prop-configs/mumu.config"};
        f18330j = strArr2;
        String[] strArr3 = {"/system/etc/init.tiantian.sh", "/system/lib/egl/libEGL_tiantianVM.so", "/system/lib/egl/libGLESv1_CM_tiantianVM.so", "/system/lib/egl/libGLESv2_tiantianVM.so"};
        k = strArr3;
        String[] strArr4 = {"/system/bin/nox-prop", "/system/bin/nox-vbox-sf", "/system/bin/noxd", "/system/lib/libnoxd.so", "/system/app/Helper/NoxHelp_zh.apk", "/data/property/persist.nox.model"};
        f18331l = strArr4;
        String[] strArr5 = {"/system/bin/droid4x", "/system/bin/droid4x-prop", "/system/bin/droid4x-vbox-sf", "/system/bin/droid4x_setprop"};
        f18332n = strArr5;
        String[] strArr6 = {"/data/misc/profiles/cur/0/com.microvirt.memuime", "/data/misc/profiles/ref/com.microvirt.memuime"};
        o = strArr6;
        String[] strArr7 = {"/system/lib/egl/libEGL_tencent.so", "/system/lib/egl/libGLESv2_tencent.so", "/system/lib64/egl/libEGL_tencent.so", "/system/lib64/egl/libGLESv2_tencent.so"};
        p = strArr7;
        TreeMap<String, String[]> treeMap = new TreeMap<>();
        q = treeMap;
        treeMap.put("LUDASHI", strArr);
        treeMap.put("MUMU", strArr2);
        treeMap.put("TIANTIAN", strArr3);
        treeMap.put("NOX", strArr4);
        treeMap.put("DROID4X", strArr5);
        treeMap.put("MEMU", strArr6);
        treeMap.put("TENCENT", strArr7);
        r = new String[]{"ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5pbnN0YWxsZXI=\n", "Y29tLnNhdXJpay5zdWJzdHJhdGU=\n"};
    }

    public static boolean d(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(File file, String[] strArr) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (d(strArr, file2.getPath())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) throws Throwable {
        k(context);
        m(context);
        h(context);
        i(context);
        g(context);
        l(context);
        f(context);
        j(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("isRoot", Boolean.valueOf(this.a));
        jsonObject2.addProperty("isVirtual", Boolean.valueOf(this.f));
        jsonObject2.addProperty("vmApp", this.b);
        jsonObject2.addProperty("hookFrame", Boolean.valueOf(this.f18333c));
        jsonObject2.addProperty("hookMethods", Boolean.valueOf(this.d));
        jsonObject2.addProperty("isFileExist", Boolean.valueOf(this.f18334e));
        jsonObject2.addProperty("OSisDebuggable", Boolean.valueOf(this.g));
        jsonObject2.addProperty("roSecure", Integer.valueOf(this.h));
        jsonObject.add("EnvInfo", jsonObject2);
    }

    public final void f(Context context) {
        this.g = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
    }

    public final void g(Context context) {
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", UCDeviceInfoUtil.PROC_CPU_INFO).start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    stringBuffer.append(line);
                }
            }
            bufferedReader.close();
            String lowerCase = stringBuffer.toString().toLowerCase();
            if (lowerCase.contains("intel")) {
                this.f18334e = true;
                return;
            }
            if (lowerCase.contains("amd")) {
                this.f18334e = true;
                return;
            }
            String str = Build.PRODUCT;
            if (!str.contains("sdk") && !str.contains("sdk_x86") && !str.contains("sdk_google") && !str.contains("Andy") && !str.contains("Droid4X") && !str.contains("nox") && !str.contains("vbox86p")) {
                String str2 = Build.MANUFACTURER;
                if (!str2.equals("Genymotion") && !str2.contains("Andy") && !str2.contains("nox") && !str2.contains("TiantianVM")) {
                    if (Build.BRAND.contains("Andy")) {
                        this.f18334e = true;
                        return;
                    }
                    String str3 = Build.DEVICE;
                    if (!str3.contains("Andy") && !str3.contains("Droid4X") && !str3.contains("nox") && !str3.contains("vbox86p")) {
                        String str4 = Build.MODEL;
                        if (!str4.contains("Emulator") && !str4.equals("google_sdk") && !str4.contains("Droid4X") && !str4.contains("TiantianVM") && !str4.contains("Andy") && !str4.equals("Android SDK built for x86_64") && !str4.equals("Android SDK built for x86")) {
                            String str5 = Build.HARDWARE;
                            if (!str5.equals("vbox86") && !str5.contains("nox") && !str5.contains("ttVM_x86")) {
                                String str6 = Build.FINGERPRINT;
                                if (str6.contains("generic/sdk/generic") || str6.contains("generic_x86/sdk_x86/generic_x86") || str6.contains("Andy") || str6.contains("ttVM_Hdragon") || str6.contains("generic/google_sdk/generic") || str6.contains("vbox86p") || str6.contains("generic/vbox86p/vbox86p")) {
                                    this.f18334e = true;
                                    return;
                                }
                                return;
                            }
                            this.f18334e = true;
                            return;
                        }
                        this.f18334e = true;
                        return;
                    }
                    this.f18334e = true;
                    return;
                }
                this.f18334e = true;
                return;
            }
            this.f18334e = true;
        } catch (Exception e2) {
            v6b.b(e2.toString());
        }
    }

    public final void h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : r) {
            try {
                packageManager.getApplicationInfo(new String(Base64.decode(str.getBytes("UTF-8"), 0)), 0);
                this.f18333c = true;
                return;
            } catch (Exception unused) {
            }
        }
        this.f18333c = false;
    }

    public final void i(Context context) {
        try {
            throw new Exception("blah");
        } catch (Exception e2) {
            int i2 = 0;
            boolean z = false;
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") && (i2 = i2 + 1) == 2) {
                    v6b.b("Substrate is active on the device.");
                    z = true;
                }
                if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getMethodName().equals("invoked")) {
                    v6b.b("A method on the stack trace has been hooked using Substrate.");
                    z = true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("main")) {
                    v6b.b("Xposed is active on the device.");
                    z = true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    v6b.b("A method on the stack trace has been hooked using Xposed.");
                    z = true;
                }
            }
            try {
                HashSet<String> hashSet = new HashSet();
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else if (line.endsWith(".so") || line.endsWith(".jar")) {
                        hashSet.add(line.substring(line.lastIndexOf(" ") + 1));
                    }
                }
                for (String str : hashSet) {
                    if (str.contains("com.saurik.substrate")) {
                        v6b.b("Substrate shared object found: " + str);
                        z = true;
                    }
                    if (str.contains("XposedBridge.jar")) {
                        v6b.b("Xposed JAR found: " + str);
                        z = true;
                    }
                }
                bufferedReader.close();
            } catch (Exception e3) {
                v6b.b(e3.toString());
            }
            this.d = z;
        }
    }

    public final void j(Context context) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            this.h = ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.secure", -1)).intValue();
        } catch (Exception e2) {
            v6b.b(e2.toString());
            this.h = -1;
        }
    }

    public final void k(Context context) {
        this.a = wga.d();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9 A[Catch: Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:28:0x0066, B:30:0x0070, B:32:0x0073, B:34:0x0083, B:36:0x0086, B:38:0x008f, B:40:0x0092, B:42:0x0097, B:44:0x009f, B:48:0x00ab, B:47:0x00a9), top: B:62:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0092, please report this as an issue */
    public final void l(Context context) throws Throwable {
        String strD;
        String strA;
        String[] strArrSplit;
        int i2;
        int i3;
        int iLastIndexOf;
        int i4;
        String[] strArr = {"com.bly.dkplat", "com.lbe.parallel", "com.excelliance.dualaid", "com.lody.virtual", b7m.a("kge&ya`gg&eioak", 8)};
        String path = context.getFilesDir().getPath();
        int i5 = 0;
        boolean z = false;
        while (true) {
            if (i5 < 5) {
                if (path.contains(strArr[i5])) {
                    z = true;
                }
                i5++;
            } else {
                try {
                    break;
                } catch (Exception e2) {
                    v6b.b(e2.toString());
                }
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
        try {
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (line.contains(strArr[i6])) {
                            z = true;
                        }
                    }
                    strD = fm3.d();
                    if (TextUtils.isEmpty(strD)) {
                        this.f = z;
                        return;
                    }
                    strA = fm3.b().a("ps");
                    if (TextUtils.isEmpty(strA)) {
                        this.f = z;
                        return;
                    }
                    strArrSplit = strA.split(Weather.SEPARATOR);
                    if (strArrSplit.length <= 0) {
                        this.f = z;
                        return;
                    }
                    i3 = 0;
                    for (String str : strArrSplit) {
                        if (!str.contains(strD)) {
                            iLastIndexOf = str.lastIndexOf(" ");
                            if (iLastIndexOf <= 0) {
                                i4 = 0;
                            } else {
                                i4 = iLastIndexOf + 1;
                            }
                            if (new File(String.format("/data/data/%s", str.substring(i4, str.length()), Locale.CHINA)).exists()) {
                                i3++;
                            }
                        }
                    }
                    this.f = i3 <= 1 ? z : true;
                    return;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                v6b.b(e2.toString());
            }
            strD = fm3.d();
            if (TextUtils.isEmpty(strD)) {
                this.f = z;
                return;
            }
            strA = fm3.b().a("ps");
            if (TextUtils.isEmpty(strA)) {
                this.f = z;
                return;
            }
            strArrSplit = strA.split(Weather.SEPARATOR);
            if (strArrSplit.length <= 0) {
                this.f = z;
                return;
            }
            i3 = 0;
            while (i2 < r2) {
                if (!str.contains(strD)) {
                    iLastIndexOf = str.lastIndexOf(" ");
                    if (iLastIndexOf <= 0) {
                        i4 = 0;
                    } else {
                        i4 = iLastIndexOf + 1;
                    }
                    if (new File(String.format("/data/data/%s", str.substring(i4, str.length()), Locale.CHINA)).exists()) {
                        i3++;
                    }
                }
            }
            this.f = i3 <= 1 ? z : true;
            return;
        } catch (Exception unused) {
            this.f = z;
            return;
        }
        bufferedReader.close();
    }

    public final void m(Context context) {
        for (String str : q.keySet()) {
            for (String str2 : q.get(str)) {
                File file = new File(str2);
                if (file.exists() || file.length() > 0) {
                    this.b = str;
                    return;
                }
            }
        }
        if (e(new File("/"), m)) {
            this.b = "LEIDIAN";
        }
    }
}
