package com.heytap.store.apm.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.text.format.Formatter;
import android.util.Log;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\n"}, d2 = {"calculateMemoryUsagePercentage", "", "context", "Landroid/content/Context;", "getAvailMemory", "", "getProcessMemoryUsage", "", "getTotalMemory", "", "apm_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class MemoryCpuGetterKt {
    public static final float calculateMemoryUsagePercentage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long processMemoryUsage = getProcessMemoryUsage(context);
        long totalMemory = getTotalMemory(context);
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        int i = memoryInfo.dalvikPrivateDirty;
        int i2 = memoryInfo.nativePrivateDirty;
        Runtime runtime = Runtime.getRuntime();
        runtime.totalMemory();
        runtime.freeMemory();
        StringBuilder sb = new StringBuilder();
        sb.append("app占用内存:");
        sb.append(processMemoryUsage);
        sb.append(",总内存");
        float f = totalMemory;
        sb.append(f / 1024.0f);
        sb.append(",java内存：");
        sb.append(i / 1024.0f);
        sb.append(",native内存：");
        sb.append(i2 / 1024.0f);
        Log.d("frytest", sb.toString());
        return (processMemoryUsage / f) * 100;
    }

    @NotNull
    public static final String getAvailMemory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        String fileSize = Formatter.formatFileSize(context, memoryInfo.availMem);
        Intrinsics.checkNotNullExpressionValue(fileSize, "formatFileSize(context, memInfo.availMem)");
        return fileSize;
    }

    public static final int getProcessMemoryUsage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) systemService).getProcessMemoryInfo(new int[]{Process.myPid()});
        Intrinsics.checkNotNullExpressionValue(processMemoryInfo, "am.getProcessMemoryInfo(intArrayOf(Process.myPid()))");
        return processMemoryInfo[0].getTotalPss() / 1024;
    }

    public static final long getTotalMemory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Intrinsics.checkNotNull(activityManager);
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem / ((long) 1024);
    }
}
