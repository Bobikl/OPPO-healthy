package com.heytap.health.cervical_vertebra.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0007"}, d2 = {"Ljava/time/LocalDate;", "", "b", "c", "Ljava/time/LocalDateTime;", "d", "a", "cervical_vertebra_release"}, k = 2, mv = {1, 8, 0})
public final class b {
    public static final long a(long j2) {
        return b(a.INSTANCE.c(j2));
    }

    public static final long b(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public static final LocalDate c(long j2) {
        return a.INSTANCE.c(j2);
    }

    @NotNull
    public static final LocalDateTime d(long j2) {
        return a.INSTANCE.d(j2);
    }
}
