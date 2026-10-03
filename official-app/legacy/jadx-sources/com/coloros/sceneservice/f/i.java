package com.coloros.sceneservice.f;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final String Rb = "com.coloros.sceneservice";

    @NotNull
    public static final String Sb = "pureManualCommuteMode";

    @NotNull
    public static final String TAG = "SupportFunctionManager";

    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return b(context);
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            return context.getPackageManager().getApplicationInfo("com.coloros.sceneservice", 128).metaData.getBoolean(Sb, false);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                com.coloros.sceneservice.m.f.e(TAG, "getMetaData error = " + thM5290exceptionOrNullimpl.getMessage());
            }
            return false;
        }
    }
}
