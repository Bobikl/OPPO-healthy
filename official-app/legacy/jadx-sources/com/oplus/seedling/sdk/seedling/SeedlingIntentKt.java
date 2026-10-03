package com.oplus.seedling.sdk.seedling;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"getPolicyName", "", "pantanal-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SeedlingIntentKt {
    @RequiresVersionSdk(version = VersionSdk.SDK_1_0_30)
    @NotNull
    public static final String getPolicyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() == 0) {
            return "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strOptString = new JSONObject(str).optString("policyName");
            Intrinsics.checkNotNullExpressionValue(strOptString, "initDataJsonObject.optString(key)");
            return strOptString;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            return "";
        }
    }
}
