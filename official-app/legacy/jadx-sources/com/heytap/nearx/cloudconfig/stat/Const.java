package com.heytap.nearx.cloudconfig.stat;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/heytap/nearx/cloudconfig/stat/Const;", "", "()V", "APP_ID", "", "CATEGORY_STAT", "", "CONFIG_CODE", "CONFIG_TYPE_DATABASE", "CONFIG_TYPE_FILE", "CONFIG_TYPE_PLUGIN_FILE", "CONFIG_TYPE_UNKNOWN", "CONFIG_UNAVAILABLE", "CONFIG_VERSION_DELETE", "CONFIG_VERSION_EMERGENCE", "CONFIG_VERSION_TOBE_DELETE", "CONFIG_VERSION_UNAVAILABLE", "DIR_DEFAULT", "ENV_PREVIEW", "EVENT_RETRY_STAT", "EVENT_STAT", "NETWORK_ALL", "NETWORK_DOWNLOAD_DONE", "NETWORK_ONLY_WIFI", "PACKAGE_NAME", "PERMISSION_CHANGE_NETWORK_STATE", "PRODUCTD", "getPRODUCTD$com_heytap_nearx_cloudconfig", "()Ljava/lang/String;", "setPRODUCTD$com_heytap_nearx_cloudconfig", "(Ljava/lang/String;)V", "REQUEST_CODE_SUCCESS", "SHARED_PREFERENCE_FILE", "STATE_CONFIG_CHECKING", "STATE_CONFIG_EXIST", "STATE_CONFIG_FAILED", "STATE_CONFIG_INIT", "STATE_CONFIG_LOADING", "STATE_CONFIG_NEW_VERSION", "STATE_CONFIG_SUCCESS", "STEP_CHECK_UPDATE_FAILED", "STEP_CONFIG_ALREADY_EXIST", "STEP_CONFIG_CHECK_NETWORK_RETRY_END", "STEP_CONFIG_DELETE_EMERGENCE", "STEP_CONFIG_DOWNLOAD_NETWORK_NOTMATCH", "STEP_CONFIG_EMERGENCE", "STEP_CONFIG_NO_NETWORK", "STEP_CONFIG_RESPONSE_CONFIG_CODE_ERROR", "STEP_CONFIG_RETRY_END", "STEP_CONFIG_UNAVAILABLE", "STEP_DONE", "STEP_DOWNLOAD", "STEP_MD5_VERIFY_FAILED", "STEP_READ", "STEP_UNZIP", "STEP_VERIFY", "STEP_ZIP_DECOMPRESS_FAILED", "TAPMANIFEST", "UPDATE_PATH_CHECK_UPDATE", "UPDATE_PATH_V2", "URL_REGEX", "Lkotlin/text/Regex;", "getURL_REGEX", "()Lkotlin/text/Regex;", "VALUE_PREVIEW_FALSE", "VALUE_PREVIEW_TRUE", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class Const {
    public static final int APP_ID = 20246;

    @NotNull
    public static final String CATEGORY_STAT = "10010";

    @NotNull
    public static final String CONFIG_CODE = "config_code";
    public static final int CONFIG_TYPE_DATABASE = 1;
    public static final int CONFIG_TYPE_FILE = 2;
    public static final int CONFIG_TYPE_PLUGIN_FILE = 3;
    public static final int CONFIG_TYPE_UNKNOWN = 0;
    public static final int CONFIG_UNAVAILABLE = 2;
    public static final int CONFIG_VERSION_DELETE = 1;
    public static final int CONFIG_VERSION_EMERGENCE = 0;
    public static final int CONFIG_VERSION_TOBE_DELETE = -1;
    public static final int CONFIG_VERSION_UNAVAILABLE = -2;

    @NotNull
    public static final String DIR_DEFAULT = "_cloud_temp";

    @NotNull
    public static final String ENV_PREVIEW = "debug.heytap.cloudconfig.preview";

    @NotNull
    public static final String EVENT_RETRY_STAT = "10013";

    @NotNull
    public static final String EVENT_STAT = "10011";
    public static final int NETWORK_ALL = 0;
    public static final int NETWORK_DOWNLOAD_DONE = -1;
    public static final int NETWORK_ONLY_WIFI = 1;

    @NotNull
    public static final String PACKAGE_NAME = "cloudconfig";

    @NotNull
    public static final String PERMISSION_CHANGE_NETWORK_STATE = "android.permission.CHANGE_NETWORK_STATE";
    public static final int REQUEST_CODE_SUCCESS = 200;

    @NotNull
    public static final String SHARED_PREFERENCE_FILE = "@cloudctrl_product";
    public static final int STATE_CONFIG_CHECKING = 10;
    public static final int STATE_CONFIG_EXIST = 1;
    public static final int STATE_CONFIG_FAILED = 200;
    public static final int STATE_CONFIG_INIT = 0;
    public static final int STATE_CONFIG_LOADING = 40;
    public static final int STATE_CONFIG_NEW_VERSION = 20;
    public static final int STATE_CONFIG_SUCCESS = 101;
    public static final int STEP_CHECK_UPDATE_FAILED = -101;
    public static final int STEP_CONFIG_ALREADY_EXIST = -5;
    public static final int STEP_CONFIG_CHECK_NETWORK_RETRY_END = -10;
    public static final int STEP_CONFIG_DELETE_EMERGENCE = -8;
    public static final int STEP_CONFIG_DOWNLOAD_NETWORK_NOTMATCH = -12;
    public static final int STEP_CONFIG_EMERGENCE = -3;
    public static final int STEP_CONFIG_NO_NETWORK = -4;
    public static final int STEP_CONFIG_RESPONSE_CONFIG_CODE_ERROR = -11;
    public static final int STEP_CONFIG_RETRY_END = -9;
    public static final int STEP_CONFIG_UNAVAILABLE = -2;
    public static final int STEP_DONE = 4;
    public static final int STEP_DOWNLOAD = 0;
    public static final int STEP_MD5_VERIFY_FAILED = -6;
    public static final int STEP_READ = 3;
    public static final int STEP_UNZIP = 2;
    public static final int STEP_VERIFY = 1;
    public static final int STEP_ZIP_DECOMPRESS_FAILED = -7;

    @NotNull
    public static final String TAPMANIFEST = "TapManifest";

    @NotNull
    public static final String UPDATE_PATH_CHECK_UPDATE = "/checkUpdate";

    @NotNull
    public static final String UPDATE_PATH_V2 = "/v2";
    public static final int VALUE_PREVIEW_FALSE = 0;
    public static final int VALUE_PREVIEW_TRUE = 1;
    public static final Const INSTANCE = new Const();

    @NotNull
    private static String PRODUCTD = "";

    @NotNull
    private static final Regex URL_REGEX = new Regex("((http|ftp|https):\\/\\/)?[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&:/~\\+#]*[\\w\\-\\@?^=%&/~\\+#])?");

    private Const() {
    }

    @NotNull
    public final String getPRODUCTD$com_heytap_nearx_cloudconfig() {
        return PRODUCTD;
    }

    @NotNull
    public final Regex getURL_REGEX() {
        return URL_REGEX;
    }

    public final void setPRODUCTD$com_heytap_nearx_cloudconfig(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        PRODUCTD = str;
    }
}
