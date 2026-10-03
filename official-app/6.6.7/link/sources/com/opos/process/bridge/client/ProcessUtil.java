package com.opos.process.bridge.client;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ProcessUtil {
    private static ActivityManager sActivityManager = null;
    private static volatile String sProcessName = "";

    public static ActivityManager getActivityManager(Context context) {
        if (sActivityManager == null && context != null) {
            sActivityManager = (ActivityManager) context.getApplicationContext().getSystemService(ParserTag.TAG_ACTIVITY);
        }
        return sActivityManager;
    }

    public static int getMyPid(Context context) {
        int iMyPid;
        try {
            iMyPid = Process.myPid();
        } catch (Exception e) {
            ProcessBridgeLog.w("ProcessUtil", "", e);
            iMyPid = -1;
        }
        ProcessBridgeLog.d("ProcessUtil", "getMyPid pid=" + iMyPid);
        return iMyPid;
    }

    public static String getMyProcessName(Context context) {
        try {
            if (TextUtils.isEmpty(sProcessName)) {
                sProcessName = getProcessNameByApplication();
                if (TextUtils.isEmpty(sProcessName)) {
                    sProcessName = getProcessNameByActivityThread();
                }
                if (TextUtils.isEmpty(sProcessName)) {
                    sProcessName = getProcessNameByCmd();
                }
                if (TextUtils.isEmpty(sProcessName)) {
                    sProcessName = getProcessNameByAms(context);
                }
            }
        } catch (Throwable th) {
            ProcessBridgeLog.w("ProcessUtil", "getMyProName", th);
        }
        if (sProcessName == null) {
            sProcessName = "";
        }
        ProcessBridgeLog.d("ProcessUtil", "getMyProName = " + sProcessName);
        return sProcessName;
    }

    private static String getProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            ProcessBridgeLog.w("ProcessUtil", "getProcessNameByActivityThread", th);
            return null;
        }
    }

    private static String getProcessNameByAms(Context context) {
        String str = "";
        try {
            ActivityManager activityManager = getActivityManager(context);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == getMyPid(context)) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            ProcessBridgeLog.w("ProcessUtil", "getProcessNameByAms", e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getProcessNameByAms = ");
        sb.append(str != null ? str : " null ");
        ProcessBridgeLog.d("ProcessUtil", sb.toString());
        return str;
    }

    private static String getProcessNameByApplication() {
        try {
            return Application.getProcessName();
        } catch (Throwable th) {
            ProcessBridgeLog.w("ProcessUtil", "getProcessNameByApplication", th);
            return null;
        }
    }

    private static String getProcessNameByCmd() {
        String line = null;
        if (TextUtils.isEmpty(null)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                try {
                    line = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(line)) {
                        line = line.trim();
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                ProcessBridgeLog.w("ProcessUtil", "getProcessNameByCmd", e);
            }
        }
        return line;
    }
}
