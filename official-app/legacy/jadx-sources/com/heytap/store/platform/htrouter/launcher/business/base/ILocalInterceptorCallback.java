package com.heytap.store.platform.htrouter.launcher.business.base;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/business/base/ILocalInterceptorCallback;", "", "onContinue", "", "navCard", "Lcom/heytap/store/platform/htrouter/launcher/business/base/NavCard;", "onInterrupt", "exception", "", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public interface ILocalInterceptorCallback {
    void onContinue(@NotNull NavCard navCard);

    void onInterrupt(@Nullable Throwable exception);
}
