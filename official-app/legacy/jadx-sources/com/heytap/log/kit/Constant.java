package com.heytap.log.kit;

/* JADX INFO: loaded from: classes19.dex */
public class Constant {
    public static final int KIT_MIN_VERSION_CODE = 10000;
    public static final String KIT_NAME = "kit_hlog";

    public static final class DATA_KEY {
        public static final String KEY_BUSINESS = "key_task_business";
        public static final String KEY_CODE = "key_code";
        public static final String KEY_DATA_JSON = "key_task_data_json";
        public static final String KEY_FILE_LENGTH = "key_file_length";
        public static final String KEY_FILE_URI = "key_uri";
        public static final String KEY_GRANT_TARGET_PKG = "key_grant_target_pkg";
        public static final String KEY_HLOG_SDK_VER = "key_hlog_sdk_ver";
        public static final String KEY_MSG = "key_msg";
        public static final String KEY_TASK_TYPE = "key_task_type";
        public static final String KEY_TRACEID = "key_task_traceid";
        public static final String KEY_TRACK_PKG_VER = "key_track_pkg_ver";
    }

    public static final class RESULT_CODE {
        public static final int CODE_ERROR = -1;
        public static final int CODE_SUCCESS = 0;
    }

    public static final class TASK_TYPE {
        public static final int REPORT_DTO_TYPE = 1;
        public static final int TASK_DTO_TYPE = 0;
    }
}
