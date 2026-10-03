package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0007\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\r"}, d2 = {"Landroid/os/Bundle;", "", RnConstant.KEY_INIT_OPTIONS, b2n.f, "", "default", "a", "", "d", "", "c", "Ljava/util/ArrayList;", "f", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class e92 {
    public static final int a(@NotNull Bundle bundle, @Nullable String str, int i) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf(bundle.getInt(str, i)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        Integer numValueOf = Integer.valueOf(i);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = numValueOf;
        }
        return ((Number) objM5287constructorimpl).intValue();
    }

    public static /* synthetic */ int b(Bundle bundle, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return a(bundle, str, i);
    }

    @Nullable
    public static final long[] c(@NotNull Bundle bundle, @Nullable String str) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(bundle.getLongArray(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (long[]) objM5287constructorimpl;
    }

    public static final long d(@NotNull Bundle bundle, @Nullable String str, long j2) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Long.valueOf(bundle.getLong(str, j2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        Long lValueOf = Long.valueOf(j2);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = lValueOf;
        }
        return ((Number) objM5287constructorimpl).longValue();
    }

    public static /* synthetic */ long e(Bundle bundle, String str, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        return d(bundle, str, j2);
    }

    @Nullable
    public static final ArrayList<String> f(@NotNull Bundle bundle, @Nullable String str) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(bundle.getStringArrayList(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (ArrayList) objM5287constructorimpl;
    }

    @Nullable
    public static final String g(@NotNull Bundle bundle, @Nullable String str) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(bundle.getString(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (String) objM5287constructorimpl;
    }
}
