package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class c9k extends fs4 {
    public static final int STATUS_COOL_DOWN = 11;
    public static final int STATUS_FITNESS_TEST = 8;
    public static final int STATUS_HEART_RATE_CONTROL = 7;
    public static final int STATUS_HIGH_INTENSITY_INTERVAL = 4;
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_ISOMETRIC = 6;
    public static final int STATUS_LOW_INTENSITY_INTERVAL = 3;
    public static final int STATUS_MANUAL_MODE = 13;
    public static final int STATUS_OTHER = 0;
    public static final int STATUS_POST_WORKOUT = 15;
    public static final int STATUS_PRE_WORKOUT = 14;
    public static final int STATUS_RECOVERY_INTERVAL = 5;
    public static final int STATUS_SPEED_OUTSIDE_OF_CONTROL_HIGH = 10;
    public static final int STATUS_SPEED_OUTSIDE_OF_CONTROL_LOW = 9;
    public static final int STATUS_WARMING_UP = 2;
    public static final int STATUS_WATT_CONTROL = 12;

    public c9k(@Nullable byte[] bArr) {
        super(bArr);
    }

    public int e() {
        Integer numB = b(17, 1);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
