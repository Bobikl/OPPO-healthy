package com.heytap.log.util;

import android.os.Process;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceMemoryUtil {
    private static final boolean DEBUG = false;
    public static final String[] FIELDS_SYS_MEMINFO = {"MemTotal:", "MemFree:", "Buffers:", "Cached:", "Active:", "Inactive:", "Dirty:"};
    public static final String[] FIELDS_PROC_MEMINFO = {"VmLck:", "VmRSS:", "VmSize:", "VmExe:", "VmStk:", "VmLib", "Threads:"};

    public static Map<String, Long> getSysMemoryInfo() {
        HashMap map = new HashMap();
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            if (method != null) {
                String[] strArr = FIELDS_SYS_MEMINFO;
                int length = strArr.length;
                long[] jArr = new long[length];
                jArr[0] = 30;
                jArr[1] = -30;
                method.invoke(null, new String("/proc/meminfo"), strArr, jArr);
                for (int i = 0; i < length; i++) {
                    map.put(FIELDS_SYS_MEMINFO[i], Long.valueOf(jArr[i]));
                }
            }
            return map;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public Map<String, Long> getProcMemoryInfo() {
        HashMap map = new HashMap();
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            if (method != null) {
                String[] strArr = FIELDS_PROC_MEMINFO;
                int length = strArr.length;
                long[] jArr = new long[length];
                jArr[0] = -1;
                method.invoke(null, new String("/proc/" + String.valueOf(Process.myPid()) + "/status"), strArr, jArr);
                for (int i = 0; i < length; i++) {
                    map.put(FIELDS_PROC_MEMINFO[i], Long.valueOf(jArr[i]));
                }
            }
            return map;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }
}
