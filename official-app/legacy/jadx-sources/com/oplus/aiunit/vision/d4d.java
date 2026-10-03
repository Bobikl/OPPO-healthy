package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.oplus.os.OplusBuild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/d4d;", "", "", "printLog", "a", "c", "Landroid/content/Context;", "context", "d", "", "TAG", "Ljava/lang/String;", "Ljava/lang/Boolean;", "isLightLow", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class d4d {

    @NotNull
    public static final d4d INSTANCE = new d4d();

    @NotNull
    public static final String TAG = "OSUtils";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static volatile Boolean isLightLow;

    @JvmStatic
    public static final boolean a(boolean printLog) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 33) {
                z = OplusBuild.VERSION.SDK_VERSION >= 30;
                if (printLog) {
                    bs9.a.a(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14, above T, result=" + z, false, null, false, 0, false, null, 252, null);
                }
            } else if (printLog) {
                bs9.a.a(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14, below T, return false", false, null, false, 0, false, null, 252, null);
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14 error, return false, msg:" + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }

    public static /* synthetic */ boolean b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(z);
    }

    @JvmStatic
    public static final boolean c() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 33) {
                z = OplusBuild.VERSION.SDK_VERSION >= 33;
                bs9.a.d(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14.1, above T, result=" + z, false, null, false, 0, false, null, 252, null);
            } else {
                bs9.a.d(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14.1, below T, return false", false, null, false, 0, false, null, 252, null);
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.b(t6e.INSTANCE, TAG, "checkIsAboveOSVersion14.1 error, return false, msg:" + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }

    @JvmStatic
    public static final boolean d(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        Boolean bool = isLightLow;
        if (bool != null) {
            return bool.booleanValue();
        }
        isLightLow = Boolean.valueOf(context.getPackageManager().hasSystemFeature("oplus.software.support_gp.product_light"));
        bs9.a.a(t6e.INSTANCE, TAG, "isLightLowVersion = " + isLightLow, false, null, false, 0, false, null, 252, null);
        Boolean bool2 = isLightLow;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }
}
