package com.oplus.aiunit.vision;

import com.heytap.nearx.taphttp.core.HeyCenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "", "msg", "", "throwable", "", "a", "Lcom/oplus/aiunit/vision/kz9;", "callback", "b", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class lz9 {
    public static final void a(@Nullable HeyCenter heyCenter, @NotNull String msg, @NotNull Throwable throwable) {
        kz9 kz9Var;
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (heyCenter == null || (kz9Var = (kz9) heyCenter.g(kz9.class)) == null) {
            return;
        }
        kz9Var.onUnexpectedException(msg, throwable);
    }

    public static final void b(@NotNull HeyCenter setUnexpectedCallback, @NotNull kz9 callback) {
        Intrinsics.checkNotNullParameter(setUnexpectedCallback, "$this$setUnexpectedCallback");
        Intrinsics.checkNotNullParameter(callback, "callback");
        setUnexpectedCallback.o(kz9.class, callback);
    }
}
