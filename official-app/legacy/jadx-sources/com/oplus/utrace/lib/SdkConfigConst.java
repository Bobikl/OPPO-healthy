package com.oplus.utrace.lib;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/utrace/lib/SdkConfigConst;", "", "()V", "EMPTY_JSON_ARRAY", "", "KEY_IS_ENABLED", "KEY_IS_VALID", "METHOD_GET_CLOUD_CONFIG", "METHOD_IS_ENABLED", "METHOD_QUERY_SDK_CONFIG", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SdkConfigConst {

    @NotNull
    public static final String EMPTY_JSON_ARRAY = "[]";

    @NotNull
    public static final SdkConfigConst INSTANCE = new SdkConfigConst();

    @NotNull
    public static final String KEY_IS_ENABLED = "is_enabled";

    @NotNull
    public static final String KEY_IS_VALID = "is_valid";

    @NotNull
    public static final String METHOD_GET_CLOUD_CONFIG = "force_get_cloud_config";

    @NotNull
    public static final String METHOD_IS_ENABLED = "is_enabled";

    @NotNull
    public static final String METHOD_QUERY_SDK_CONFIG = "query_sdk_config";

    private SdkConfigConst() {
    }
}
