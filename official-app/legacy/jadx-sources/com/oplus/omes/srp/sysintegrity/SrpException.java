package com.oplus.omes.srp.sysintegrity;

import androidx.annotation.Keep;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class SrpException extends Exception {
    public static final int ERROR_CACHE_TIME_CHANGED = 80301;
    public static final int ERROR_CMM_BINDER_UNCONNECTED = 80501;
    public static final int ERROR_DEV_ATTEST_OTHER_FAIL = 80701;
    public static final int ERROR_FILE_INPUT_EXP = 80604;
    public static final int ERROR_FILE_OUTPUT_EXP = 80603;
    public static final int ERROR_GET_KIT_INFO = 80051;
    public static final int ERROR_IMPL_CHECK_DENY = 80103;
    public static final int ERROR_IMPL_INPUT_NULL = 80001;
    public static final int ERROR_IMPL_PERMISSION_DENY = 80102;
    public static final int ERROR_IMPL_RUNNING_MAIN_THREAD = 80101;
    public static final int ERROR_IMPL_SRP_BOOT_TIME_NOT_MEET = 80108;
    public static final int ERROR_IMPL_SRP_CHANCE_NOT_MEET = 80107;
    public static final int ERROR_IMPL_SRP_NOT_ENABLED = 80105;
    public static final int ERROR_IMPL_SRP_NOT_FOUND = 80104;
    public static final int ERROR_IMPL_SRP_SCREEN_OFF = 80106;
    public static final int ERROR_IMPL_SRP_USER_SETUP_UNCOMPLETED = 80109;
    public static final int ERROR_INIT_ERR = 80050;
    public static final int ERROR_NONCE_LEN_ERROR = 80602;
    public static final int ERROR_PARSE_NONCE_ERROR = 80601;
    public static final int ERROR_PROXY_BINDER_DISCONNECTED = 80201;
    public static final int ERROR_PROXY_BIND_SERVICE_FAILED = 80208;
    public static final int ERROR_PROXY_BIND_SERVICE_NO_RESP = 80207;
    public static final int ERROR_PROXY_CHECK_NOT_ALLOWED = 80211;
    public static final int ERROR_PROXY_CHECK_NOT_REACH_INTERVAL = 80205;
    public static final int ERROR_PROXY_FORMAT_FAILED = 80215;
    public static final int ERROR_PROXY_PKG_VER_INIT_FAILED = 80204;
    public static final int ERROR_PROXY_SERVICE_BIND_TIMEOUT = 80209;
    public static final int ERROR_PROXY_SERVICE_NOT_SUPPORTED = 80210;
    public static final int ERROR_PROXY_SERVICE_REMOTE_EXP = 80203;
    public static final int ERROR_PROXY_SERVICE_RESP_NULL = 80202;
    public static final int ERROR_PROXY_TARGET_PKG_NOT_EXIST = 80206;
    public static final int ERROR_PROXY_TARGET_URI_EXP = 80216;
    public static final int ERROR_PROXY_TARGET_URI_NOT_EXIST = 80215;
    public static final int ERROR_UTILS_SETTINGS_KEY_UNDEF = 80401;
    private static final Map<Integer, String> errMsg;
    private int mCode;

    static {
        HashMap map = new HashMap();
        errMsg = map;
        map.put(Integer.valueOf(ERROR_IMPL_INPUT_NULL), "input parameter is null");
        map.put(Integer.valueOf(ERROR_IMPL_RUNNING_MAIN_THREAD), "Can't not be run in main thread");
        map.put(Integer.valueOf(ERROR_IMPL_PERMISSION_DENY), "has no permission to access service");
        map.put(Integer.valueOf(ERROR_IMPL_CHECK_DENY), "not allowed to check system environment");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_NOT_FOUND), "service is not found");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_NOT_ENABLED), "service is not enabled");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_SCREEN_OFF), "screen off");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_CHANCE_NOT_MEET), "trigger not meet");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_BOOT_TIME_NOT_MEET), "boot time not meet");
        map.put(Integer.valueOf(ERROR_IMPL_SRP_USER_SETUP_UNCOMPLETED), "User Setup has not completed");
        map.put(Integer.valueOf(ERROR_PROXY_BINDER_DISCONNECTED), DeviceInfoCompat.DeviceState.DISCONNECTED);
        map.put(Integer.valueOf(ERROR_PROXY_SERVICE_RESP_NULL), "response null");
        map.put(Integer.valueOf(ERROR_PROXY_SERVICE_REMOTE_EXP), "remote exception");
        map.put(Integer.valueOf(ERROR_PROXY_PKG_VER_INIT_FAILED), "package version not init");
        map.put(Integer.valueOf(ERROR_PROXY_CHECK_NOT_REACH_INTERVAL), "please check later");
        map.put(Integer.valueOf(ERROR_PROXY_TARGET_PKG_NOT_EXIST), "service is not installed");
        map.put(Integer.valueOf(ERROR_PROXY_BIND_SERVICE_NO_RESP), "no response when binding");
        map.put(Integer.valueOf(ERROR_PROXY_BIND_SERVICE_FAILED), "bind service failed");
        map.put(Integer.valueOf(ERROR_PROXY_SERVICE_BIND_TIMEOUT), "bind service timeout");
        map.put(Integer.valueOf(ERROR_PROXY_SERVICE_NOT_SUPPORTED), "service not supported");
        map.put(Integer.valueOf(ERROR_PROXY_CHECK_NOT_ALLOWED), "check not allowed");
        map.put(Integer.valueOf(ERROR_CACHE_TIME_CHANGED), "Cache time was manual changed");
        map.put(Integer.valueOf(ERROR_UTILS_SETTINGS_KEY_UNDEF), "Settings key undefined");
        map.put(Integer.valueOf(ERROR_CMM_BINDER_UNCONNECTED), "binder unconnected");
        map.put(Integer.valueOf(ERROR_PARSE_NONCE_ERROR), "parse nonce is err");
    }

    public SrpException(String str) {
        super(str);
        this.mCode = 0;
    }

    public static String getMessage(int i) {
        Map<Integer, String> map = errMsg;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "Undefine";
    }

    public int getCode() {
        return this.mCode;
    }

    public SrpException(int i) {
        super(errMsg.get(Integer.valueOf(i)));
        this.mCode = i;
    }

    public SrpException(int i, String str) {
        super(errMsg.get(Integer.valueOf(i)) + ":" + str);
        this.mCode = i;
    }
}
