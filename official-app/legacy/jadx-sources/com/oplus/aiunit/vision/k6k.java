package com.oplus.aiunit.vision;

import android.os.Message;
import android.util.Log;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0016\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000\"\u0014\u0010\r\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u000b*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/Function0;", "", "runnable", "b", "", "what", "", "delayMS", "Ljava/lang/Runnable;", "d", "Lorg/json/JSONObject;", "", b2n.g, "TAG", "Ljava/lang/String;", "Lcom/oplus/nearx/track/internal/utils/Logger;", "a", "Lcom/oplus/nearx/track/internal/utils/Logger;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/nearx/track/internal/utils/Logger;", b2n.f, "(Lcom/oplus/nearx/track/internal/utils/Logger;)V", "logger", "", "f", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stackMsg", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class k6k {

    @NotNull
    public static final String TAG = "TrackExt";

    @NotNull
    public static Logger a = new Logger(false, 1, null);

    public static final void b(@NotNull final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        GlobalConfigHelper.INSTANCE.h().execute(new Runnable() { // from class: com.oplus.aiunit.vision.j6k
            @Override // java.lang.Runnable
            public final void run() {
                k6k.c(runnable);
            }
        });
    }

    public static final void c(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void d(int i, long j2, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
        synchronized (globalConfigHelper.k()) {
            if (globalConfigHelper.k().hasMessages(i)) {
                Logger.b(a, TAG, "executeOnceIO, already has Messages what=" + i, null, null, 12, null);
            } else {
                Message messageObtainMessage = globalConfigHelper.k().obtainMessage(i, runnable);
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "GlobalConfigHelper.poste…inMessage(what, runnable)");
                globalConfigHelper.k().sendMessageDelayed(messageObtainMessage, RangesKt___RangesKt.coerceAtLeast(j2, 0L));
                Logger.b(a, TAG, "executeOnceIO, post what=" + i + " delay=" + RangesKt___RangesKt.coerceAtLeast(j2, 0L), null, null, 12, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Logger e() {
        return a;
    }

    @NotNull
    public static final String f(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (!GlobalConfigHelper.INSTANCE.p()) {
            return "";
        }
        String stackTraceString = Log.getStackTraceString(th);
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(this)");
        return stackTraceString;
    }

    public static final void g(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        a = logger;
    }

    @NotNull
    public static final String h(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.length() == 0) {
            return "";
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }
}
