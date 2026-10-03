package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public final class bj {
    public static final int a = Integer.parseInt("1001");
    public static final int b = Integer.parseInt("1002");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9773c = Integer.parseInt("1004");
    public static final int d = Integer.parseInt("2001");

    public static int a(int i) {
        int code;
        if (i == 30001002 || i == b) {
            code = ResponseEnum.AUTH_LOGIN_ERROR.getCode();
        } else if (i == 30001004) {
            code = ResponseEnum.CANCEL.getCode();
        } else if (i == 30001007) {
            code = ResponseEnum.REMOTE_CALLED_APP_ILLEGAL.getCode();
        } else if (i == 30003042 || i == a) {
            code = ResponseEnum.ERROR_NOT_AUTH.getCode();
        } else if (i == 30003043) {
            code = ResponseEnum.ERROR_REMOTE_SERVICE_NOT_EXIST.getCode();
        } else if (i == 30003046) {
            code = ResponseEnum.AUTH_NOT_SHOW_PAGE.getCode();
        } else if (i == f9773c) {
            code = ResponseEnum.REMOTE_DATA_NULL.getCode();
        } else if (i == d) {
            code = ResponseEnum.NETWORK_UNKNOWN_ERROR.getCode();
        } else {
            code = i == 30003047 ? ResponseEnum.ERROR_NOT_AUTH.getCode() : i;
        }
        if (code != i) {
            AcLogUtil.i("AcResponseHelper", "oldCode " + i + " transferToNewCode " + code);
        }
        return code;
    }

    public static int b(String str) {
        if (str == null || str.isEmpty()) {
            AcLogUtil.e("AcResponseHelper", "old code is null");
            return ResponseEnum.ERROR_UNKNOWN_INNER_ERROR.getCode();
        }
        try {
            return a(Integer.parseInt(str));
        } catch (Exception unused) {
            AcLogUtil.e("AcResponseHelper", "old code is not int: " + str);
            return ResponseEnum.ERROR_UNKNOWN_INNER_ERROR.getCode();
        }
    }
}
