package com.pantanal.fundation.internal.utils;

import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.t6e;
import com.oplus.wrapper.os.Trace;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/pantanal/fundation/internal/utils/STraceUtils;", "", "", iim.a.f, "", "a", "b", "<init>", "()V", "Type", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class STraceUtils {

    @NotNull
    public static final STraceUtils INSTANCE = new STraceUtils();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/pantanal/fundation/internal/utils/STraceUtils$Type;", "", "id", "", iim.a.f, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "NONE", "foundation-internal_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        NONE(-1, "NONE");


        @NotNull
        private final String description;
        private final int id;

        Type(int i, String str) {
            this.id = i;
            this.description = str;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getId() {
            return this.id;
        }
    }

    @JvmStatic
    public static final void a(@NotNull String description) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(description, "description");
        try {
            Result.Companion companion = Result.INSTANCE;
            Trace.traceBegin(Trace.TRACE_TAG_VIEW, description);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.e(t6e.INSTANCE, "STraceUtils", "traceBegin error:" + thM5290exceptionOrNullimpl, false, null, false, 0, false, null, 252, null);
        }
    }

    @JvmStatic
    public static final void b() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Trace.traceEnd(Trace.TRACE_TAG_VIEW);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            bs9.a.e(t6e.INSTANCE, "STraceUtils", "traceEnd error:" + thM5290exceptionOrNullimpl, false, null, false, 0, false, null, 252, null);
        }
    }
}
