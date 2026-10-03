package com.heytap.nearx.cloudconfig.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/ExceptionHandler;", "", "onUnexpectedException", "", "msg", "", "throwable", "", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface ExceptionHandler {
    void onUnexpectedException(@NotNull String msg, @NotNull Throwable throwable);
}
