package com.heytap.store.platform.videoplayer.util;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class LowMachineUtil {
    private static final String TAG = "MemoryUtil";

    public static boolean checkDevice() {
        String str = Build.DEVICE;
        return "A37".equals(str) || "R9PlusA".equals(str) || "A59".equals(str);
    }
}
