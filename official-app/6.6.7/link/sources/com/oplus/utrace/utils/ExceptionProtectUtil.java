package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        Object obj;
        Integer numValueOf;
        ContentResolver contentResolver;
        try {
            Result.Companion companion = Result.Companion;
            Context context = mContext;
            if (context == null || (contentResolver = context.getContentResolver()) == null) {
                numValueOf = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(contentResolver, "contentResolver");
                numValueOf = Integer.valueOf(Settings.System.getInt(contentResolver, "oplus_customize_cta_user_experience"));
            }
            obj = Result.constructor-impl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w("UTrace.Lib.ProtectUtil", "isUserExperienceToggleOn Exception: " + th2.getMessage(), th2);
        }
        Integer num = (Integer) (Result.isFailure-impl(obj) ? null : obj);
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
