package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class zo3 {
    public static final int AUTHCODE_EXPECTED = 1004;
    public static final int AUTHCODE_INVALID = 1007;
    public static final int AUTHCODE_RECYCLE = 1006;
    public static final int AUTHENTICATE_FAIL = 1002;
    public static final int AUTHENTICATE_SUCCESS = 1001;
    public static final int CAPABILITY_EXCEPTION = 1008;
    public static final int INTERNAL_EXCEPTION = 1009;
    public static final int PERMISSION_DENIAL = 1010;
    public static final int TIME_EXPIRED = 1003;
    public static final int VERSION_INCOMPATIBLE = 1005;

    @NonNull
    public static String a(int i) {
        switch (i) {
            case 1001:
                return "AUTHENTICATE_SUCCESS";
            case 1002:
                return "AUTHENTICATE_FAIL";
            case 1003:
                return "TIME_EXPIRED";
            case 1004:
                return "AUTHCODE_EXPECTED";
            case 1005:
                return "VERSION_INCOMPATIBLE";
            case 1006:
                return "AUTHCODE_RECYCLE";
            case 1007:
                return "AUTHCODE_INVALID";
            case 1008:
                return "CAPABILITY_EXCEPTION";
            case 1009:
                return "INTERNAL_EXCEPTION";
            case 1010:
                return "NONE_PERMISSION";
            default:
                return "unknown status code: " + i;
        }
    }
}
