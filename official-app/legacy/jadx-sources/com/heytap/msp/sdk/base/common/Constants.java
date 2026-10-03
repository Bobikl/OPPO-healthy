package com.heytap.msp.sdk.base.common;

/* JADX INFO: loaded from: classes19.dex */
public class Constants {
    public static final String ACTION_MSP_APP_INSTALL_SUC = "com.heytap.msp.sdk.msp_install_suc";
    public static final String APP_REQUEST_BASE_REQ_CLAZZ_NAME = "com.heytap.msp.bean.BaseRequest";
    public static final String APP_REQUEST_BIZ_REQ_CLAZZ_NAME = "com.heytap.msp.bean.BizRequest";
    public static final String APP_REQUEST_CLAZZ_NAME = "com.heytap.msp.bean.Request";
    public static final int APP_VERSION_SERIALIZABLE_OPT = 1050000;
    public static final int CODE_INIT_FAIL_CONTEXT_NULL = -2;
    public static final int CODE_INIT_FAIL_NO_PROVIDER = -1;
    public static final int CODE_INIT_SUC = 0;
    public static final int CODE_INIT_SUC_HAS_INITED = 1;
    public static final int CODE_INIT_SUC_PROVIDER_MSP_SDK = 2;
    public static final int CODE_INIT_SUC_PROVIDER_PAY_SDK = 3;
    public static final int KEYPATH_DOWNLOAD_APP = 4;
    public static final int KEYPATH_EXECUTE = 1;
    public static final int KEYPATH_INNERCALLBACK = 3;
    public static final int KEYPATH_USEAPP = 2;
    public static final String MSP_APP_PACK_NAME = "com.heytap.htms";
    public static final String MSP_APP_SIGNATURE = "c44ddd883807f4f97e75b47a2584f6b1";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final String SDK_MODULE_META_NAME_PREFIX = "SDK_MODULE_";
    public static final String SDK_MODULE_NNED_PRESTART_APP_SUFFFIX = "_NEED_PRESTART_APP";
    public static final String SDK_VERSION_META_NAME_PREFIX = "SDK_VERSION_";
    public static final String SP_COMMON_FILE = "sp_common_file";
    public static final int VERSION_CODE_T = 33;

    public class AppDownloadGuideStatus {
        public static final byte DOWNLOADING_MSP_APK = 2;
        public static final byte GETTING_DOWNLOAD_INFO = 1;
        public static final byte INITED_STATE = -1;
        public static final byte SHOWING_NEED_DOWN_TIPS_DIALOG = 0;

        public AppDownloadGuideStatus() {
        }
    }

    public static class CompatibleInfo {
        public static final String KEY_COMPATIBLE_EXPIRE = "biz_%s_expire";
        public static final String KEY_COMPATIBLE_RECORD = "biz_%s_record";
        public static final String KEY_COMPATIBLE_RECORD_TIME = "biz_%s_record_time";
        public static final String KEY_COMPATIBLE_ROUTE = "route_%s_app";

        public enum KeyType {
            Record,
            Record_Time,
            Expire,
            Route
        }
    }
}
