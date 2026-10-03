package com.heytap.usercenter.accountsdk.utils;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class StatusCodeUtil {
    public static final String ERROR_CODE_ACCOUNT_ERROR = "3013";
    public static final String ERROR_CODE_ACCOUNT_LOGIN_FAIL = "1002";
    public static final String ERROR_CODE_IPC = "1004";
    public static final String ERROR_CODE_LOGIN_STATUS_INVALID = "3040";
    public static final String ERROR_CODE_NO_ACCOUNT_LOGIN = "1001";
    public static final String ERROR_CODE_NO_NETWORT_CONNECT = "2001";
    public static final String ERROR_CODE_OTHER = "1003";
    public static final String SUCCESS_CODE_READ_CACHE = "2000";
    public static final String SUCCESS_CODE_REQ_NETWORK = "1000";

    public static String matchResultMsg(String str) {
        if ("1000".equals(str)) {
            return "获取网络数据成功";
        }
        if ("2000".equals(str)) {
            return "获取缓存数据成功";
        }
        if ("1001".equals(str)) {
            return "账号未登录";
        }
        if ("1002".equals(str)) {
            return "账号登录失败";
        }
        if ("1003".equals(str) || "1004".equals(str)) {
            return "操作失败";
        }
        if ("2001".equals(str)) {
            return "网络异常";
        }
        if ("3040".equals(str)) {
            return "登录状态已失效";
        }
        return "3013".equals(str) ? "账户异常" : "操作失败";
    }
}
