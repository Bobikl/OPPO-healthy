package com.heytap.accessory;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CommonStatusCodes {
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
    public static String getStatusCodeString(int i) {
        switch (i) {
            case 1001:
                return "AUTHENTICATE_SUCCESS";
            case AUTHENTICATE_FAIL /* 1002 */:
                return "AUTHENTICATE_FAIL";
            case TIME_EXPIRED /* 1003 */:
                return "TIME_EXPIRED";
            case AUTHCODE_EXPECTED /* 1004 */:
                return "AUTHCODE_EXPECTED";
            case VERSION_INCOMPATIBLE /* 1005 */:
                return "VERSION_INCOMPATIBLE";
            case AUTHCODE_RECYCLE /* 1006 */:
                return "AUTHCODE_RECYCLE";
            case AUTHCODE_INVALID /* 1007 */:
                return "AUTHCODE_INVALID";
            case CAPABILITY_EXCEPTION /* 1008 */:
                return "CAPABILITY_EXCEPTION";
            case INTERNAL_EXCEPTION /* 1009 */:
                return "INTERNAL_EXCEPTION";
            case PERMISSION_DENIAL /* 1010 */:
                return "NONE_PERMISSION";
            default:
                return "unknown status code: " + i;
        }
    }
}
