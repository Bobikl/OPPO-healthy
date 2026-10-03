package com.health.sleephrline;

import androidx.annotation.Keep;
import com.health.sleephrline.bean.HrPoint;
import com.health.sleephrline.bean.SleepHrResultBean;

/* JADX INFO: loaded from: classes14.dex */
@Keep
public class SDKNative {
    static {
        System.loadLibrary("sleepHrLib");
    }

    public static native SleepHrResultBean calculate(HrPoint[] hrPointArr, int i, int i2);

    public static native short init();

    public static native short initHealthLog(HealthLogProxy healthLogProxy);
}
