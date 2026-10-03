package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/r3j;", "", "Ljava/time/LocalDate;", "a", "", "timestamp", "c", "b", "Ljava/time/LocalDateTime;", "localDateTime", "d", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class r3j {
    public static final int $stable = 0;

    @NotNull
    public static final r3j INSTANCE = new r3j();

    @NotNull
    public final LocalDate a() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        return localDateNow;
    }

    public final long b(long timestamp) {
        LocalDateTime localDateTimeWith = e(timestamp).with(TemporalAdjusters.firstDayOfNextYear());
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…ers.firstDayOfNextYear())");
        return d(localDateTimeWith) - ((long) 1000);
    }

    @NotNull
    public final LocalDate c(long timestamp) {
        return o05.D(timestamp);
    }

    public final long d(@NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
        return localDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public final LocalDateTime e(long timestamp) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
        return localDateTimeOfInstant;
    }
}
