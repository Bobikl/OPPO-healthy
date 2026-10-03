package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class jp6 {
    public static final int ERR_AUTH_CANCEL = 100014;
    public static final int ERR_AUTH_FAILURE = 100012;
    public static final int ERR_BINDER_EXCEPTION = 100003;
    public static final int ERR_BIND_SERVICE_FAIL = 100015;
    public static final int ERR_CHECK_SCOPE_EXCEPTION = 101006;
    public static final int ERR_DATA_DELTE = 101003;
    public static final int ERR_DATA_INSERT = 101001;
    public static final int ERR_DATA_INVALID = 101007;
    public static final int ERR_DATA_READ = 101002;
    public static final int ERR_DATA_SYNCING = 101004;
    public static final int ERR_DATA_TYPE_IS_NOT_SUPPORT = 100009;
    public static final int ERR_FUN_NOT_IMPL = 100011;
    public static final int ERR_HEALTH_APP_IS_NOT_INSTALLED = 100007;
    public static final int ERR_HEALTH_APP_VERSION_IS_TOO_LOW = 100008;
    public static final int ERR_LOGIN_STATUS = 100004;
    public static final int ERR_PARAMETER_ERROR = 100001;
    public static final int ERR_PERMISSION_DENY = 100006;
    public static final int ERR_QUERY_EMPTY = 101005;
    public static final int ERR_REMOTE_EXCEPTION = 100005;
    public static final int ERR_SQLITE_EXCEPTION = 100002;
    public static final int ERR_STORAGE_SPACE_LOW = 100013;
    public static final int SUCCESS = 0;

    public static int a(boolean z, int i) {
        if (!z) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 100002:
                return 2;
            case ERR_BINDER_EXCEPTION /* 100003 */:
                return 3;
            case ERR_LOGIN_STATUS /* 100004 */:
                return 4;
            case 100005:
                return 5;
            case ERR_PERMISSION_DENY /* 100006 */:
                return 10;
            case ERR_HEALTH_APP_IS_NOT_INSTALLED /* 100007 */:
                return 12;
            case ERR_HEALTH_APP_VERSION_IS_TOO_LOW /* 100008 */:
                return 13;
            case ERR_DATA_TYPE_IS_NOT_SUPPORT /* 100009 */:
                return 14;
            default:
                switch (i) {
                    case 101001:
                        return 6;
                    case 101002:
                        return 7;
                    case 101003:
                        return 8;
                    case 101004:
                        return 9;
                    case 101005:
                        return 11;
                    default:
                        return 1;
                }
        }
    }
}
