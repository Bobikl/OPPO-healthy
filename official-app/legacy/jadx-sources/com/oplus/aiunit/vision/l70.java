package com.oplus.aiunit.vision;

import com.heytap.httpdns.env.ApiEnv;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/heytap/httpdns/env/ApiEnv;", "", "a", "com.heytap.nearx.httpdns"}, k = 2, mv = {1, 4, 0})
public final class l70 {
    public static final boolean a(@NotNull ApiEnv isDebug) {
        Intrinsics.checkNotNullParameter(isDebug, "$this$isDebug");
        int i = k70.$EnumSwitchMapping$0[isDebug.ordinal()];
        return i == 1 || i == 2;
    }
}
