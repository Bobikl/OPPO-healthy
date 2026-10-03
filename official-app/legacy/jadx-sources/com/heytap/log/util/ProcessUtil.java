package com.heytap.log.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ProcessUtil {
    private static String processName;

    public static String getProcessName(Context context) {
        if (TextUtils.isEmpty(processName)) {
            processName = getProcessNameInner(context);
        }
        return processName;
    }

    private static String getProcessNameInner(Context context) {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
