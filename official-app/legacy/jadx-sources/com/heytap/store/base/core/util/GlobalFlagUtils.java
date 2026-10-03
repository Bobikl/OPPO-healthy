package com.heytap.store.base.core.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/store/base/core/util/GlobalFlagUtils;", "", "()V", "needHookWifiManager", "", "getNeedHookWifiManager", "()Z", "setNeedHookWifiManager", "(Z)V", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GlobalFlagUtils {

    @NotNull
    public static final GlobalFlagUtils INSTANCE = new GlobalFlagUtils();
    private static boolean needHookWifiManager;

    private GlobalFlagUtils() {
    }

    public final boolean getNeedHookWifiManager() {
        return needHookWifiManager;
    }

    public final void setNeedHookWifiManager(boolean z) {
        needHookWifiManager = z;
    }
}
