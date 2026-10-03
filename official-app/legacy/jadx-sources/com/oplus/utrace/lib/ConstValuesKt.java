package com.oplus.utrace.lib;

import com.oplus.aiunit.vision.t13;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"ALPHA", "", "BETA", t13.DAY, "", "DEFAULT_ENABLE_VALUE", "", "FLAG_TIMEOUT", "", "GB", "HOUR", "KB", "MB", "MINUTE", "OTA_VERSION", "PERSIST_SYS_ALWAYSON_ENABLE", "PERSIST_SYS_ASSERT_PANIC", "PERSIST_SYS_CTA", ConstValuesKt.PRE, "RO_BUILD_RELEASE_TYPE", "RO_BUILD_VERSION_OTA", "SECOND", "STATUS_SUCCESS", "STATUS_TIMEOUT", "STATUS_UNKNOWN", "STATUS_UNSPECIFIED", t13.WEEK, "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstValuesKt {

    @NotNull
    public static final String ALPHA = "Alpha";

    @NotNull
    public static final String BETA = "Beta";
    public static final long DAY = 86400000;
    public static final boolean DEFAULT_ENABLE_VALUE = false;
    public static final int FLAG_TIMEOUT = 1;
    public static final long GB = 1073741824;
    public static final long HOUR = 3600000;
    public static final long KB = 1024;
    public static final long MB = 1048576;
    public static final long MINUTE = 60000;

    @NotNull
    public static final String OTA_VERSION = "ota_version";

    @NotNull
    public static final String PERSIST_SYS_ALWAYSON_ENABLE = "persist.sys.alwayson.enable";

    @NotNull
    public static final String PERSIST_SYS_ASSERT_PANIC = "persist.sys.assert.panic";

    @NotNull
    public static final String PERSIST_SYS_CTA = "persist.sys.cta";

    @NotNull
    public static final String PRE = "PRE";

    @NotNull
    public static final String RO_BUILD_RELEASE_TYPE = "ro.build.release_type";

    @NotNull
    public static final String RO_BUILD_VERSION_OTA = "ro.build.version.ota";
    public static final long SECOND = 1000;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_TIMEOUT = -2;
    public static final int STATUS_UNKNOWN = -1;
    public static final int STATUS_UNSPECIFIED = -3;
    public static final long WEEK = 604800000;
}
