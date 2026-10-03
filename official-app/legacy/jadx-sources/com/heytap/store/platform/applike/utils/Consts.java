package com.heytap.store.platform.applike.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/applike/utils/Consts;", "", "()V", "APP_LIKE_SP_CACHE_KEY", "", "APP_LIKE_SP_KEY_MAP", "LAST_VERSION_CODE", "LAST_VERSION_NAME", "SDK_NAME", "TAG", "applike-api_release"}, k = 1, mv = {1, 1, 15})
public final class Consts {

    @NotNull
    public static final String APP_LIKE_SP_CACHE_KEY = "SP_APP_LIKE_CACHE";

    @NotNull
    public static final String APP_LIKE_SP_KEY_MAP = "APP_LIKE_KEY_MAP";
    public static final Consts INSTANCE = new Consts();

    @NotNull
    public static final String LAST_VERSION_CODE = "LAST_VERSION_CODE";

    @NotNull
    public static final String LAST_VERSION_NAME = "LAST_VERSION_NAME";
    private static final String SDK_NAME = "AppLike";

    @NotNull
    public static final String TAG = "AppLike::";

    private Consts() {
    }
}
