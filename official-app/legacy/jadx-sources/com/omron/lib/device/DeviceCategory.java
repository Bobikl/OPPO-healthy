package com.omron.lib.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface DeviceCategory {
    public static final int ALL_SUPPORT = 0;
    public static final int BLOOD_GLUCOSE = 2;
    public static final int BLOOD_OXYGEN = 5;
    public static final int BLOOD_PRESSURE = 1;
    public static final int BODY_FAT = 4;
}
