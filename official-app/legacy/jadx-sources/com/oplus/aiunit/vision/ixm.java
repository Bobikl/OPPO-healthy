package com.oplus.aiunit.vision;

import android.os.Build;
import com.customer.feedback.sdk.util.LogUtil;
import com.oplus.os.OplusBuild;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes10.dex */
public final class ixm {
    @JvmStatic
    public static final boolean a() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(OplusBuild.VERSION.SDK_VERSION >= 34));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e("VersionUtil", "isAboveOS15, errMsg=" + thM5290exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool;
        }
        Boolean bool2 = (Boolean) objM5287constructorimpl;
        LogUtil.d("VersionUtil", "isAboveOS15, result=" + bool2.booleanValue());
        return bool2.booleanValue();
    }

    @JvmStatic
    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 36;
    }
}
