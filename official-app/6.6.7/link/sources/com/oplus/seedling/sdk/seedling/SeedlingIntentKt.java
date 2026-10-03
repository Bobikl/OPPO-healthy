package com.oplus.seedling.sdk.seedling;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import pantanal.foundation.utils.RequiresVersionSdk;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"getPolicyName", "", "pantanal-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SeedlingIntentKt {
    @RequiresVersionSdk(version = 1000030)
    @NotNull
    public static final String getPolicyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.trim(str).toString().length() == 0) {
            return "";
        }
        try {
            Result.Companion companion = Result.Companion;
            String strOptString = new JSONObject(str).optString("policyName");
            Intrinsics.checkNotNullExpressionValue(strOptString, "initDataJsonObject.optString(key)");
            return strOptString;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            return "";
        }
    }
}
