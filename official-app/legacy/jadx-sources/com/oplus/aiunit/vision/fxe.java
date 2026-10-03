package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class fxe {
    public static volatile String a = "";

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return packageName;
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ProcessUtil", "Error getting current process name", e2, new Object[0]);
            return packageName;
        }
    }

    public static String b(Context context) {
        return c(context).replace(":", "_");
    }

    public static String c(Context context) {
        if (!a.isEmpty()) {
            return a;
        }
        a = e();
        if (a.isEmpty()) {
            a = d();
        }
        if (a.isEmpty()) {
            a = f();
        }
        if (a.isEmpty()) {
            a = a(context);
        }
        return a;
    }

    public static String d() {
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_ProcessUtil", "Error getting process name by ActivityThread", e2, new Object[0]);
            return "";
        }
    }

    public static String e() {
        return Application.getProcessName();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String f() throws Throwable {
        BufferedReader bufferedReader;
        IOException e2;
        String line = "";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
            try {
                try {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        line = line.trim();
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    TrackLogger.d("DRS_SDK_COMMON_ProcessUtil", "Error getting process name by CMD", e2, new Object[0]);
                    if (bufferedReader != null) {
                    }
                    return line;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            bufferedReader = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused2) {
        }
        return line;
    }

    public static boolean g(Context context) {
        return context.getPackageName().equals(c(context));
    }
}
