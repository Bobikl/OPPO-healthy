package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/oplus/utrace/utils/ExceptionProtectUtil;", "", "()V", "QUERY_INTERVAL", "", "isTesting", "", "isTesting$annotations", "()Z", "setTesting", "(Z)V", "mContext", "Landroid/content/Context;", "queryTime", "userExperienceProgram", "checkUserSwitch", "isUserExperienceToggleOn", "setContext", "", "context", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class ExceptionProtectUtil {

    @NotNull
    public static final ExceptionProtectUtil INSTANCE = new ExceptionProtectUtil();
    private static final long QUERY_INTERVAL = 60000;
    private static boolean isTesting;

    @Nullable
    private static Context mContext;
    private static volatile long queryTime;
    private static volatile boolean userExperienceProgram;

    private ExceptionProtectUtil() {
    }

    @JvmStatic
    public static final boolean checkUserSwitch() {
        return userExperienceProgram() || isTesting;
    }

    @VisibleForTesting
    public static /* synthetic */ void isTesting$annotations() {
    }

    @JvmStatic
    private static final boolean isUserExperienceToggleOn() {
        Object objM5287constructorimpl;
        Integer numValueOf;
        ContentResolver contentResolver;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = mContext;
            if (context == null || (contentResolver = context.getContentResolver()) == null) {
                numValueOf = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(contentResolver, "contentResolver");
                numValueOf = Integer.valueOf(Settings.System.getInt(contentResolver, "oplus_customize_cta_user_experience"));
            }
            objM5287constructorimpl = Result.m5287constructorimpl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.w("UTrace.Lib.ProtectUtil", "isUserExperienceToggleOn Exception: " + thM5290exceptionOrNullimpl.getMessage(), thM5290exceptionOrNullimpl);
        }
        Integer num = (Integer) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
        Logs.INSTANCE.d("UTrace.Lib.ProtectUtil", "isUserExperienceToggleOn result=" + num);
        return num != null && num.intValue() == 1;
    }

    @JvmStatic
    public static final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mContext = context;
    }

    @JvmStatic
    private static final boolean userExperienceProgram() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - queryTime > 60000) {
            userExperienceProgram = isUserExperienceToggleOn();
            Logs.INSTANCE.i("UTrace.Lib.ProtectUtil", "userExperienceProgram: " + userExperienceProgram);
            queryTime = jCurrentTimeMillis;
        }
        return userExperienceProgram;
    }

    public final boolean isTesting() {
        return isTesting;
    }

    public final void setTesting(boolean z) {
        isTesting = z;
    }
}
