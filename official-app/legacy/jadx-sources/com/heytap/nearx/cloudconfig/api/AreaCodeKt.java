package com.heytap.nearx.cloudconfig.api;

import com.heytap.nearx.cloudconfig.util.UtilsKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"areaUrl", "", "Lcom/heytap/nearx/cloudconfig/api/AreaCode;", "com.heytap.nearx.cloudconfig"}, k = 2, mv = {1, 1, 16})
public final class AreaCodeKt {
    @NotNull
    public static final String areaUrl(@NotNull AreaCode areaUrl) {
        Intrinsics.checkParameterIsNotNull(areaUrl, "$this$areaUrl");
        return areaUrl.host() + UtilsKt.checkUpdateUrl();
    }
}
