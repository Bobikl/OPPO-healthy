package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class exe {
    public static String a;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            a = b();
        } catch (RuntimeException e2) {
            w7i.i("Split:ProcessUtil", "getProcessNameClassical Application failed " + e2.getMessage(), new Object[0]);
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            a = c(context);
        } catch (Exception e3) {
            w7i.i("Split:ProcessUtil", "getProcessNameClassical Classical failed " + e3.getMessage(), new Object[0]);
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        a = d();
        w7i.a("Split:ProcessUtil", "Get process name: sCurrentProcess" + a + " in secure mode.", new Object[0]);
        return a;
    }

    public static String b() {
        return Application.getProcessName();
    }

    public static String c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str = "";
        if (context == null) {
            return "";
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                str = runningAppProcessInfo.processName;
            }
        }
        return str;
    }

    public static String d() throws Throwable {
        BufferedReader bufferedReader;
        IOException e2;
        String line = "";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(new File("/proc/" + Process.myPid() + "/cmdline").toPath(), new OpenOption[0]), StandardCharsets.UTF_8));
            try {
                try {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        line = line.trim();
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    w7i.c("Split:ProcessUtil", "getProcessNameSecure failed " + e2.getMessage(), new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                pd7.a(bufferedReader2);
                throw th;
            }
        } catch (IOException e4) {
            bufferedReader = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            pd7.a(bufferedReader2);
            throw th;
        }
        pd7.a(bufferedReader);
        return line;
    }

    public static boolean e(Context context, String str) {
        boolean z;
        if (context == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            w7i.a("Split:ProcessUtil", "isProcessAlive get null running process. processName: " + str, new Object[0]);
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().processName, str)) {
                z = true;
                w7i.a("Split:ProcessUtil", "isProcessAlive processName: " + str + ", alive: " + z, new Object[0]);
                return z;
            }
        }
        z = false;
        w7i.a("Split:ProcessUtil", "isProcessAlive processName: " + str + ", alive: " + z, new Object[0]);
        return z;
    }

    public static void f(Context context, String str) {
        if (context == null) {
            return;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            w7i.i("Split:ProcessUtil", "killProcess get empty getRunningAppProcesses: %s", str);
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(str, runningAppProcessInfo.processName)) {
                Process.killProcess(runningAppProcessInfo.pid);
                w7i.a("Split:ProcessUtil", "kill process %s:%d", runningAppProcessInfo.processName, Integer.valueOf(runningAppProcessInfo.pid));
            }
        }
    }

    public static void g(Context context, Set<String> set) {
        if (context == null) {
            return;
        }
        String strJoin = TextUtils.join(",", set);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            w7i.i("Split:ProcessUtil", "killProcess get empty getRunningAppProcesses: %s", strJoin);
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), runningAppProcessInfo.processName)) {
                    Process.killProcess(runningAppProcessInfo.pid);
                    w7i.a("Split:ProcessUtil", "kill process %s:%d", runningAppProcessInfo.processName, Integer.valueOf(runningAppProcessInfo.pid));
                }
            }
        }
    }
}
