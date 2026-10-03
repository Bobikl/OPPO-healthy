package com.oplus.aiunit.vision;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: loaded from: classes18.dex */
public class fui {
    public static String[] a = {c8l.KEY_B, "KB", "MB", "GB", "TB"};

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        StringBuilder sb = new StringBuilder();
        sb.append("currently available memory：");
        long j2 = availableBlocks * blockSize;
        sb.append(j2);
        a7b.f("storage", sb.toString());
        return j2;
    }

    public static boolean b() {
        return a() <= 734003200;
    }

    public static boolean c() {
        return a() <= 1073741824;
    }
}
