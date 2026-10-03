package com.heytap.store.platform.htrouter.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/platform/htrouter/utils/Consts;", "", "()V", "DOT", "", "HT_ROUTER_SP_CACHE_KEY", "HT_ROUTER_SP_KEY_MAP", "LAST_VERSION_CODE", "LAST_VERSION_NAME", "PREFIX_INTERCEPTOR", "PREFIX_PROVIDER", "PREFIX_ROUTE_ROOT", "ROUTE_ROOT_PACKAGE", "SDK_NAME", "SEPARATOR", "SUFFIX_AUTO_WIRED", "SUFFIX_INTERCEPTORS", "SUFFIX_PROVIDERS", "SUFFIX_ROOT", "TAG", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class Consts {

    @NotNull
    public static final String DOT = ".";

    @NotNull
    public static final String HT_ROUTER_SP_CACHE_KEY = "SP_HT_ROUTER_CACHE";

    @NotNull
    public static final String HT_ROUTER_SP_KEY_MAP = "HT_ROUTER_KEY_MAP";
    public static final Consts INSTANCE = new Consts();

    @NotNull
    public static final String LAST_VERSION_CODE = "LAST_VERSION_CODE";

    @NotNull
    public static final String LAST_VERSION_NAME = "LAST_VERSION_NAME";

    @NotNull
    public static final String PREFIX_INTERCEPTOR = "com.heytap.store.platform.htrouter.routes.HTRouter$$Interceptors";

    @NotNull
    public static final String PREFIX_PROVIDER = "com.heytap.store.platform.htrouter.routes.HTRouter$$Providers";

    @NotNull
    public static final String PREFIX_ROUTE_ROOT = "com.heytap.store.platform.htrouter.routes.HTRouter$$Root";

    @NotNull
    public static final String ROUTE_ROOT_PACKAGE = "com.heytap.store.platform.htrouter.routes";
    private static final String SDK_NAME = "HTRouter";

    @NotNull
    public static final String SEPARATOR = "$$";

    @NotNull
    public static final String SUFFIX_AUTO_WIRED = "$$HTRouter$$AutoWired";
    private static final String SUFFIX_INTERCEPTORS = "Interceptors";
    private static final String SUFFIX_PROVIDERS = "Providers";
    private static final String SUFFIX_ROOT = "Root";

    @NotNull
    public static final String TAG = "HTRouter::";

    private Consts() {
    }
}
