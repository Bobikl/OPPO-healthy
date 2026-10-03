package com.oplus.aiunit.vision;

import java.time.LocalDate;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/time/LocalDate;", "", "a", "(Ljava/time/LocalDate;)J", "timeMills", "lib_chart_release"}, k = 2, mv = {1, 8, 0})
public final class vxj {
    public static final long a(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return RangesKt___RangesKt.coerceAtLeast(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L);
    }
}
