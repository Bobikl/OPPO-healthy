package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"", "callbackId", "", "callback", "a", "pantanal-interface_release"}, k = 2, mv = {1, 8, 0})
public final class jvg {
    @NotNull
    public static final String a(@NotNull String callbackId, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str = callbackId + "&" + callback.toString();
        Intrinsics.checkNotNullExpressionValue(str, "stringBuilder.toString()");
        return str;
    }
}
