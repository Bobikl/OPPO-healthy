package com.oplus.aiunit.vision;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: loaded from: classes8.dex */
public class vrm {
    public static final String a = "StorageSpaceCalculationUtil";

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }
}
