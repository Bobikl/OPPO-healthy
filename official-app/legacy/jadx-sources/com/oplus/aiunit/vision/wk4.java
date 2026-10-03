package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\b"}, d2 = {"", "tag", "", HttpConst.COOKIE, "Lkotlin/Function0;", "", "run", "a", "device_manager_release"}, k = 2, mv = {1, 8, 0})
public final class wk4 {
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public static final void a(@NotNull String tag, @Nullable Object obj, @NotNull Function0<Unit> run) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(run, "run");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            run.invoke();
        } catch (Exception e2) {
            ml4.c("DMBlockUtils", tag + ": failed " + obj + " e=" + e2);
            if (qe0.w()) {
                e2.printStackTrace();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 100) {
            ml4.e("DMBlockUtils", tag + ": timeout " + jCurrentTimeMillis2 + "  " + obj);
        }
    }
}
