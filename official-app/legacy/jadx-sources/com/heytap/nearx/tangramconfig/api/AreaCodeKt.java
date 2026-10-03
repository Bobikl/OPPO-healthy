package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"areaUrl", "", "Lcom/heytap/nearx/tangramconfig/api/AreaCode;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AreaCodeKt {
    @NotNull
    public static final String areaUrl(@NotNull AreaCode areaCode) {
        Intrinsics.checkNotNullParameter(areaCode, "<this>");
        return areaCode.host() + "/v5/sdk/%scheckUpdate";
    }
}
