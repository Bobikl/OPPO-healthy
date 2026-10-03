package com.heytap.store.homemodule.data;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createNotChangeResult", "Lcom/heytap/store/homemodule/data/HomeDataCheckResult;", "homeComponent", "Lorg/json/JSONObject;", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HomeDataCheckResultKt {
    @NotNull
    public static final HomeDataCheckResult createNotChangeResult(@NotNull JSONObject homeComponent) {
        Intrinsics.checkNotNullParameter(homeComponent, "homeComponent");
        return new HomeDataCheckResult(false, false, homeComponent, "");
    }
}
