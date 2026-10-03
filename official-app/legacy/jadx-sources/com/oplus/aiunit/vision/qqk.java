package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.system.Os;
import android.text.TextUtils;
import android.util.Log;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneTrainData;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.weatherservicesdk.data.Weather;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class qqk {
    public static final String[] a = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    public class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TextUtils.isDigitsOnly(str);
        }
    }

    public static class b {
        public static final String ROM_EMUI = "EMUI";
        public static final String ROM_FLYME = "FLYME";
        public static final String ROM_MIUI = "MIUI";
        public static final String ROM_OPPO = "OPPO";
        public static final String ROM_QIKU = "QIKU";
        public static final String ROM_SMARTISAN = "SMARTISAN";
        public static final String ROM_VIVO = "VIVO";
        public static String a;
        public static String b;

        public static boolean a(String str) throws Throwable {
            String str2 = a;
            if (str2 != null) {
                return str2.equals(str);
            }
            String strB = b("ro.miui.ui.version.name");
            b = strB;
            if (TextUtils.isEmpty(strB)) {
                String strB2 = b(pcm.a);
                b = strB2;
                if (TextUtils.isEmpty(strB2)) {
                    String strB3 = b("ro.build.version.opporom");
                    b = strB3;
                    if (TextUtils.isEmpty(strB3)) {
                        String strB4 = b("ro.vivo.os.version");
                        b = strB4;
                        if (TextUtils.isEmpty(strB4)) {
                            String strB5 = b("ro.smartisan.version");
                            b = strB5;
                            if (TextUtils.isEmpty(strB5)) {
                                String str3 = Build.DISPLAY;
                                b = str3;
                                if (str3.toUpperCase().contains(ROM_FLYME)) {
                                    a = ROM_FLYME;
                                } else {
                                    b = "unknown";
                                    a = Build.MANUFACTURER.toUpperCase();
                                }
                            } else {
                                a = ROM_SMARTISAN;
                            }
                        } else {
                            a = ROM_VIVO;
                        }
                    } else {
                        a = "OPPO";
                    }
                } else {
                    a = ROM_EMUI;
                }
            } else {
                a = ROM_MIUI;
            }
            return a.equals(str);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:24:0x0062 */
        public static String b(String str) throws Throwable {
            BufferedReader bufferedReader;
            BufferedReader bufferedReader2;
            BufferedReader bufferedReader3 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                    try {
                        String line = bufferedReader.readLine();
                        bufferedReader.close();
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return line;
                    } catch (IOException e3) {
                        e = e3;
                        Log.e("Rom", "Unable to read prop " + str, e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader3 = bufferedReader2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader3 != null) {
                    bufferedReader3.close();
                }
                throw th;
            }
        }

        public static boolean c() {
            return a(ROM_MIUI);
        }
    }

    public static boolean a(String str) {
        File file = new File(str);
        try {
            if (file.exists()) {
                return file.isDirectory();
            }
            file.mkdirs();
            return file.exists() && file.isDirectory();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context, long j2) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        int iMyPid = Process.myPid();
        long j3 = j2 / 500;
        for (int i = 0; i < j3; i++) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                xcrash.b.c().e("xcrash", "processErrorList is NOT null !!!!, i = " + i);
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    xcrash.b.c().e("xcrash", "errorStateInfo.pid = " + processErrorStateInfo.pid + ", my pid = " + iMyPid + ", errorStateInfo.condition = " + processErrorStateInfo.condition);
                    if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                        return true;
                    }
                }
            } else {
                xcrash.b.c().e("xcrash", "processErrorList is null !!!! poll = " + j3 + ", i = " + i);
            }
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String c() {
        return TextUtils.join(",", Build.SUPPORTED_ABIS);
    }

    public static String d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    public static String e() {
        String str;
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles(new a());
            if (fileArrListFiles != null) {
                int i = 0;
                for (File file : fileArrListFiles) {
                    try {
                        str = Os.readlink(file.getAbsolutePath());
                    } catch (Exception unused) {
                        str = null;
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    sb.append(TextUtils.isEmpty(str) ? "???" : str.trim());
                    sb.append('\n');
                    i++;
                    if (i > 1024) {
                        break;
                    }
                }
                if (fileArrListFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(fileArrListFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String f(String str) {
        return g(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String g(String str, int i) throws Throwable {
        StringBuilder sb = new StringBuilder();
        ?? r1 = 0;
        r1 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
                    int i2 = 0;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String strTrim = line.trim();
                            if (strTrim.length() > 0) {
                                i2++;
                                if (i == 0 || i2 <= i) {
                                    sb.append("  ");
                                    sb.append(strTrim);
                                    sb.append(Weather.SEPARATOR);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            r1 = bufferedReader;
                            xcrash.b.c().i("xcrash", "Util getInfo(" + str + ") failed", e);
                            if (r1 != 0) {
                                r1.close();
                                r1 = r1;
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            r1 = bufferedReader;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0 && i2 > i) {
                        sb.append("  ......\n");
                        sb.append("  (number of records: ");
                        sb.append(i2);
                        sb.append(")\n");
                    }
                    bufferedReader.close();
                    r1 = i2;
                } catch (Exception unused2) {
                }
            } catch (Exception e3) {
                e = e3;
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String h(File file) {
        if (!file.exists()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    fileInputStream.close();
                    return String.format("%032x", new BigInteger(1, messageDigest.digest()));
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String i(Date date, Date date2, String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nTombstone maker: 'xCrash 3.1.0'\nCrash type: '");
        sb.append(str);
        sb.append("'\nStart time: '");
        sb.append(simpleDateFormat.format(date));
        sb.append("'\nCrash time: '");
        sb.append(simpleDateFormat.format(date2));
        sb.append("'\nApp ID: '");
        sb.append(str2);
        sb.append("'\nApp version: '");
        sb.append(str3);
        sb.append("'\nRooted: '");
        sb.append(q() ? "Yes" : SceneTrainData.KEY_NO);
        sb.append("'\nAPI level: '");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("'\nOS version: '");
        sb.append(Build.VERSION.RELEASE);
        sb.append("'\nABI list: '");
        sb.append(c());
        sb.append("'\nManufacturer: '");
        sb.append(Build.MANUFACTURER);
        sb.append("'\nBrand: '");
        sb.append(Build.BRAND);
        sb.append("'\nModel: '");
        sb.append(m());
        sb.append("'\nBuild fingerprint: '");
        sb.append(Build.FINGERPRINT);
        sb.append("'\n");
        return sb.toString();
    }

    public static String j(int i, int i2, int i3) throws Throwable {
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append("logcat:\n");
        if (i > 0) {
            k(iMyPid, sb, "main", i, 'D');
        }
        if (i2 > 0) {
            k(iMyPid, sb, "system", i2, 'W');
        }
        if (i3 > 0) {
            k(iMyPid, sb, DbParams.TABLE_EVENTS, i2, 'I');
        }
        sb.append(Weather.SEPARATOR);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.BufferedReader] */
    public static void k(int i, StringBuilder sb, String str, int i2, char c2) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        Exception e2;
        String string = Integer.toString(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(string);
        sb2.append(" ");
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/bin/logcat");
        arrayList.add("-b");
        arrayList.add(str);
        arrayList.add("-d");
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        arrayList.add(Integer.toString(i2));
        arrayList.add("--pid");
        arrayList.add(string);
        arrayList.add("*:" + c2);
        Object[] array = arrayList.toArray();
        ?? r6 = "--------- tail end of log ";
        sb.append("--------- tail end of log ");
        sb.append(str);
        sb.append(" (");
        sb.append(TextUtils.join(" ", array));
        sb.append(")\n");
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).start().getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(Weather.SEPARATOR);
                    } catch (Exception e3) {
                        e2 = e3;
                        xcrash.b.c().w("xcrash", "Util run logcat command failed", e2);
                        if (bufferedReader == null) {
                            return;
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r6 != 0) {
                    try {
                        r6.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            bufferedReader = null;
            e2 = e4;
        } catch (Throwable th3) {
            r6 = 0;
            th = th3;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
        bufferedReader.close();
    }

    public static String l() {
        return "memory info:\n System Summary (From: /proc/meminfo)\n" + f("/proc/meminfo") + "-\n Process Status (From: /proc/PID/status)\n" + f("/proc/self/status") + "-\n Process Limits (From: /proc/PID/limits)\n" + f("/proc/self/limits") + "-\n" + o() + Weather.SEPARATOR;
    }

    public static String m() {
        String str;
        if (b.c()) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method declaredMethod = cls.getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                str = (String) declaredMethod.invoke(cls, "ro.product.marketname", "");
                try {
                    if (TextUtils.isEmpty(str)) {
                        str = (String) declaredMethod.invoke(cls, "ro.product.model", "");
                    }
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    e.printStackTrace();
                } catch (IllegalAccessException e3) {
                    e = e3;
                    e.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    e.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e = e5;
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e6) {
                e = e6;
                str = "";
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "";
            } catch (NoSuchMethodException e8) {
                e = e8;
                str = "";
            } catch (InvocationTargetException e9) {
                e = e9;
                str = "";
            }
        } else {
            str = Build.MODEL;
        }
        return str == null ? "" : str;
    }

    public static String n() {
        return "network info:\nNot supported on Android Q (API level 29) and later.\n\n";
    }

    public static String o() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%21s %8s\n", "", "Pss(KB)"));
        sb.append(String.format(locale, "%21s %8s\n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, "%21s %8s\n", "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Code:", memoryInfo.getMemoryStat("summary.code")));
            sb.append(String.format(locale, "%21s %8s\n", "Stack:", memoryInfo.getMemoryStat("summary.stack")));
            sb.append(String.format(locale, "%21s %8s\n", "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
            sb.append(String.format(locale, "%21s %8s\n", "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
            sb.append(String.format(locale, "%21s %8s\n", "System:", memoryInfo.getMemoryStat("summary.system")));
            sb.append(String.format(locale, "%21s %8s %21s %8s\n", "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
        } catch (Exception e2) {
            xcrash.b.c().i("xcrash", "Util getProcessMemoryInfo failed", e2);
        }
        return sb.toString();
    }

    public static String p(Context context, int i) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    String strTrim = line.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        return strTrim;
                    }
                }
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        try {
            bufferedReader.close();
        } catch (Exception unused5) {
        }
        return null;
    }

    public static boolean q() {
        try {
            for (String str : a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
