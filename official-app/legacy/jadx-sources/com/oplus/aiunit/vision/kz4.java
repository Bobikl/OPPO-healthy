package com.oplus.aiunit.vision;

import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX INFO: loaded from: classes16.dex */
public interface kz4 {
    public static final int TRIGGER_ALARM = 4;
    public static final int TRIGGER_APP_START = 5;
    public static final int TRIGGER_DEVICE = 2;
    public static final int TRIGGER_FIVE_MINUTES = 6;
    public static final int TRIGGER_PROVIDER_HEART_RATE = 9;
    public static final int TRIGGER_RECONNECT = 3;
    public static final int TRIGGER_SNORE_RECORD = 7;
    public static final int TRIGGER_STEP_MANAGER = 8;
    public static final int TRIGGER_USER = 1;

    static String a(int i) {
        switch (i) {
            case 1:
                return "TRIGGER_USER";
            case 2:
                return "TRIGGER_DEVICE";
            case 3:
                return "TRIGGER_RECONNECT";
            case 4:
                return "TRIGGER_ALARM";
            case 5:
                return "TRIGGER_APP_START";
            case 6:
                return "TRIGGER_FIVE_MINUTES";
            case 7:
                return "TRIGGER_SNORE_RECORD";
            case 8:
                return "TRIGGER_STEP_MANAGER";
            case 9:
                return "TRIGGER_PROVIDER_HEART_RATE";
            default:
                return LanConstants.OPERATOR_UNKNOWN;
        }
    }
}
