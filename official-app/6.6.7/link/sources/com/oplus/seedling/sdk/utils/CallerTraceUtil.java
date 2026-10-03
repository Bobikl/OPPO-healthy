package com.oplus.seedling.sdk.utils;

import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.weatherservicesdk.data.Weather;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/oplus/seedling/sdk/utils/CallerTraceUtil;", "", "()V", "NUM_5", "", "TAG", "", "getCaller", "tag", "ste", "", "Ljava/lang/StackTraceElement;", "depth", "(Ljava/lang/String;[Ljava/lang/StackTraceElement;I)Ljava/lang/String;", "getCallerTrace", "(Ljava/lang/String;[Ljava/lang/StackTraceElement;)Ljava/lang/String;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallerTraceUtil {

    @NotNull
    public static final CallerTraceUtil INSTANCE = new CallerTraceUtil();
    private static final int NUM_5 = 5;

    @NotNull
    private static final String TAG = "CallerTraceUtil";

    private CallerTraceUtil() {
    }

    @JvmStatic
    private static final String getCaller(String tag, StackTraceElement[] ste, int depth) {
        Object obj;
        if (ste == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(tag);
        sb.append(Weather.SEPARATOR);
        try {
            Result.Companion companion = Result.Companion;
            int iMin = Math.min(ste.length, depth);
            for (int i = 0; i < iMin; i++) {
                sb.append(ste[i]);
                sb.append(Weather.SEPARATOR);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "getCaller error:" + th2, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
        sb.append(Weather.SEPARATOR);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @JvmStatic
    @NotNull
    public static final String getCallerTrace(@NotNull String tag, @Nullable StackTraceElement[] ste) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return getCaller(tag, ste, 5);
    }
}
