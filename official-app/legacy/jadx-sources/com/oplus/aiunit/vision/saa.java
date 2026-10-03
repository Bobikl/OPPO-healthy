package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDate;
import java.time.LocalDateTime;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/saa;", "", "", "d", "", "a", "", "c", "b", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class saa {
    public static final int $stable = 0;

    public final boolean a() {
        long jC = c();
        long jB = b();
        a7b.f("InsightNotifyLimit", "canSendNotify canSendStartTime:" + jC + ", canSendEndTime:" + jB + ", curTime:" + System.currentTimeMillis());
        boolean zN = o05.n(System.currentTimeMillis(), jC, jB);
        StringBuilder sb = new StringBuilder();
        sb.append("canSendNotify backResult:");
        sb.append(zN);
        a7b.f("InsightNotifyLimit", sb.toString());
        return zN;
    }

    public final long b() {
        LocalDateTime localDateTimeAtTime = LocalDate.now().atTime(22, 0, 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "now().atTime(22, 0, 0)");
        return o05.I(localDateTimeAtTime);
    }

    public final long c() {
        long jA = waa.a();
        boolean z = false;
        LocalDateTime localDateTimeAtTime = LocalDate.now().atTime(6, 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "now().atTime(6, 0)");
        long jI = o05.I(localDateTimeAtTime);
        LocalDateTime localDateTimeAtTime2 = LocalDate.now().atTime(11, 0, 0);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime2, "now().atTime(11, 0, 0)");
        long jI2 = o05.I(localDateTimeAtTime2);
        if (jI <= jA && jA <= jI2) {
            z = true;
        }
        return z ? jA : jI2;
    }

    public final void d() {
        a7b.f("InsightNotifyLimit", "saveBedTime:" + System.currentTimeMillis());
        waa.y0(System.currentTimeMillis());
    }
}
