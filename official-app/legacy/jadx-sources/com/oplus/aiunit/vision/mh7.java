package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class mh7 extends fs4 {
    public static final int DISTANCE_CHANGED = 13;
    public static final int EXPENDED_ENERGY_CHANGED = 10;
    public static final int HEART_RATE_CHANGED = 9;
    public static final int INCLINE_CHANGED = 6;
    public static final int NUMBER_OF_STEP_CHANGED = 11;
    public static final int NUMBER_OF_STRIDES_CHANGED = 12;
    public static final int PAUSE_BY_USER = 2;
    public static final int POWER_CHANGED = 8;
    public static final int RESISTANCE_LEVEL_CHANGED = 7;
    public static final int SPEED_CHANGED = 5;
    public static final int START_OR_RESUME_BY_USER = 4;
    public static final int STOP_BY_USER = 1;
    public static final int STOP_OR_PAUSED_BY_SAFE_KEY = 3;
    public static final int STOP_OR_PAUSED_BY_USER = 2;
    public static final int TRAINING_TIME_CHANGED = 14;

    public mh7(@Nullable byte[] bArr) {
        super(bArr);
    }

    public int e() {
        Integer numB = b(17, 0);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }

    public int f() {
        Integer numB = b(17, 1);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
