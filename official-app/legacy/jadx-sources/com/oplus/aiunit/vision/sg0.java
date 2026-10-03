package com.oplus.aiunit.vision;

import com.oplus.nearx.cloudconfig.api.AreaCode;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/nearx/cloudconfig/api/AreaCode;", "", "a", "com.oplus.nearx.cloudconfig"}, k = 2, mv = {1, 4, 0})
public final class sg0 {
    @NotNull
    public static final String a(@NotNull AreaCode areaUrl) {
        Intrinsics.checkParameterIsNotNull(areaUrl, "$this$areaUrl");
        return areaUrl.host() + "/v2/checkUpdate";
    }
}
