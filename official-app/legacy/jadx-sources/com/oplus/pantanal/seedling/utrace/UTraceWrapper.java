package com.oplus.pantanal.seedling.utrace;

import android.content.Context;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.utrace.sdk.UTraceApp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/pantanal/seedling/utrace/UTraceWrapper;", "", "()V", "init", "", "context", "Landroid/content/Context;", "isAboveOSVersion14", "", "setDebbugable", "value", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UTraceWrapper {

    @NotNull
    public static final UTraceWrapper INSTANCE = new UTraceWrapper();

    private UTraceWrapper() {
    }

    public final void init(@NotNull Context context, boolean isAboveOSVersion14) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            UTraceApp.init(context);
            Logger.INSTANCE.d(Constants.TAG, "init flavorLite = 1, checkAboveOSVersion14 = " + (isAboveOSVersion14 ? 1 : 0));
            UTraceApp.setFlag(1, isAboveOSVersion14 ? 1 : 0);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(Constants.TAG, "UTraceApp.init error = " + thM5290exceptionOrNullimpl.getMessage());
        }
    }

    public final void setDebbugable(boolean value) {
        UTraceApp.setFlag(3, value ? 1 : 0);
    }
}
