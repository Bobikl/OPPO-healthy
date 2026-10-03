package com.oplus.utrace.lib;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u00020\r8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u000e\u0010\u0018\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\r8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0002R\u000e\u0010\u001b\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/oplus/utrace/lib/HLogConst;", "", "()V", "CODE_HLOG_CONFIG_ENV_DEFAULT", "", "CODE_HLOG_CONFIG_ENV_DEV", "CODE_HLOG_CONFIG_ENV_RELEASE", "DEFAULT_LOG_ENABLE", "", "DEFAULT_LOG_EXPIRE_DAYS", "DEFAULT_MAX_LOG_FILES_MB", "DEFAULT_MAX_LOG_FILE_SIZE_MB", "HLOG_BUSINESS_NAME", "", "HLOG_PKG", "HLOG_UPLOAD_MAX_SIZE", "KEY_BUSINESS", "KEY_END_TIME", "KEY_EXTRAS", "KEY_EXTRAS_SIM_FD_TIMEOUT", "KEY_EXTRAS_UPLOAD_FLAG", "KEY_HLOG_CONFIG_ENV", "KEY_LOG_ENABLED", "getKEY_LOG_ENABLED$annotations", "KEY_LOG_ENABLED_V2", "KEY_LOG_EXPIRE_DAYS", "getKEY_LOG_EXPIRE_DAYS$annotations", "KEY_LOG_EXPIRE_DAYS_V2", "KEY_MAX_FILE_SIZE", "KEY_MAX_LOG_FILES_MB", "KEY_MAX_LOG_FILE_SIZE_MB", "KEY_MODULE_NAME", "KEY_RAW_CONTENT", "KEY_SEND_FROM", "KEY_SIZE", "KEY_START_TIME", "KEY_TRACE_ID", "KEY_TRACE_PKG", "KEY_UPLOAD_FLAG", "KEY_USE_WIFI", "LOG_FILE_SIZE_MB_RANGE", "Lkotlin/ranges/IntRange;", "getLOG_FILE_SIZE_MB_RANGE", "()Lkotlin/ranges/IntRange;", "METHOD_GET_LOG_CONFIG", "PUSH_TO_UPLOAD_ACTION", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HLogConst {
    public static final int CODE_HLOG_CONFIG_ENV_DEFAULT = -1;
    public static final int CODE_HLOG_CONFIG_ENV_DEV = 0;
    public static final int CODE_HLOG_CONFIG_ENV_RELEASE = 1;
    public static final boolean DEFAULT_LOG_ENABLE = false;
    public static final int DEFAULT_LOG_EXPIRE_DAYS = 7;
    public static final int DEFAULT_MAX_LOG_FILES_MB = 500;
    public static final int DEFAULT_MAX_LOG_FILE_SIZE_MB = 4;

    @NotNull
    public static final String HLOG_BUSINESS_NAME = "ums";

    @NotNull
    public static final String HLOG_PKG = "com.heytap.log";
    public static final int HLOG_UPLOAD_MAX_SIZE = 10;

    @NotNull
    public static final String KEY_BUSINESS = "business";

    @NotNull
    public static final String KEY_END_TIME = "endTime";

    @NotNull
    public static final String KEY_EXTRAS = "key_extras";

    @NotNull
    public static final String KEY_EXTRAS_SIM_FD_TIMEOUT = "simulate_fd_timeout";

    @NotNull
    public static final String KEY_EXTRAS_UPLOAD_FLAG = "suggested_upload_flag";

    @NotNull
    public static final String KEY_HLOG_CONFIG_ENV = "HLOG_CONFIG_ENV";

    @NotNull
    public static final String KEY_LOG_ENABLED = "log_enabled";

    @NotNull
    public static final String KEY_LOG_ENABLED_V2 = "log_enabled_v2";

    @NotNull
    public static final String KEY_LOG_EXPIRE_DAYS = "log_expire_days";

    @NotNull
    public static final String KEY_LOG_EXPIRE_DAYS_V2 = "log_expire_days_v2";

    @NotNull
    public static final String KEY_MAX_FILE_SIZE = "maxFileSize";

    @NotNull
    public static final String KEY_MAX_LOG_FILES_MB = "max_log_files_mb";

    @NotNull
    public static final String KEY_MAX_LOG_FILE_SIZE_MB = "max_log_file_size_mb";

    @NotNull
    public static final String KEY_MODULE_NAME = "module";

    @NotNull
    public static final String KEY_RAW_CONTENT = "rawContent";

    @NotNull
    public static final String KEY_SEND_FROM = "sendFrom";

    @NotNull
    public static final String KEY_SIZE = "size";

    @NotNull
    public static final String KEY_START_TIME = "startTime";

    @NotNull
    public static final String KEY_TRACE_ID = "traceId";

    @NotNull
    public static final String KEY_TRACE_PKG = "tracePkg";

    @NotNull
    public static final String KEY_UPLOAD_FLAG = "uploadFlag";

    @NotNull
    public static final String KEY_USE_WIFI = "useWifi";

    @NotNull
    public static final String METHOD_GET_LOG_CONFIG = "get_log_config";

    @NotNull
    public static final String PUSH_TO_UPLOAD_ACTION = "com.oplus.pantanal.log.upload";

    @NotNull
    public static final HLogConst INSTANCE = new HLogConst();

    @NotNull
    private static final IntRange LOG_FILE_SIZE_MB_RANGE = new IntRange(1, 8);

    private HLogConst() {
    }

    @Deprecated(message = "改用KEY_LOG_ENABLED_V2，本常量仅为兼容而保留")
    public static /* synthetic */ void getKEY_LOG_ENABLED$annotations() {
    }

    @Deprecated(message = "改用KEY_LOG_EXPIRE_DAYS_V2，本常量仅为兼容而保留")
    public static /* synthetic */ void getKEY_LOG_EXPIRE_DAYS$annotations() {
    }

    @NotNull
    public final IntRange getLOG_FILE_SIZE_MB_RANGE() {
        return LOG_FILE_SIZE_MB_RANGE;
    }
}
