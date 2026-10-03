package com.heytap.store.platform.htrouter.base;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/htrouter/base/InternalGlobalStatus;", "", "()V", "AUTO_INJECT", "", "RAW_URI", "isDebuggable", "", "()Z", "setDebuggable", "(Z)V", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class InternalGlobalStatus {

    @NotNull
    public static final String AUTO_INJECT = "wmHzgD4lOj5o4241";
    public static final InternalGlobalStatus INSTANCE = new InternalGlobalStatus();

    @NotNull
    public static final String RAW_URI = "NTeRQWvye18AkPd6G";
    private static boolean isDebuggable;

    private InternalGlobalStatus() {
    }

    public final boolean isDebuggable() {
        return isDebuggable;
    }

    public final void setDebuggable(boolean z) {
        isDebuggable = z;
    }
}
