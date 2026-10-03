package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/de8;", "", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class de8 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final LocalDate a;
    public static final long b;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.de8$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\n\u0010\t\u001a\u00020\u0002*\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/de8$a;", "", "", "timestamp", "Ljava/time/LocalDate;", "f", "Ljava/time/LocalDateTime;", b2n.f, "a", "j", "b", "c", "localDateTime", b2n.g, "i", "DEFAULT_MIN_DATE", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "DEFAULT_MIN_DATE_TIME", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocalDate a() {
            LocalDate localDate = LocalDateTime.now().toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "now().toLocalDate()");
            return localDate;
        }

        public final long b(long timestamp) {
            LocalDateTime localDateTimeWith = i(timestamp).with(TemporalAdjusters.firstDayOfMonth());
            Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…usters.firstDayOfMonth())");
            return h(localDateTimeWith);
        }

        public final long c(long timestamp) {
            LocalDateTime localDateTimeWith = i(timestamp).with(TemporalAdjusters.firstDayOfNextYear());
            Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…ers.firstDayOfNextYear())");
            return h(localDateTimeWith) - ((long) 1000);
        }

        @NotNull
        public final LocalDate d() {
            return de8.a;
        }

        public final long e() {
            return de8.b;
        }

        @NotNull
        public final LocalDate f(long timestamp) {
            LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "ofInstant(Instant.ofEpoc…mDefault()).toLocalDate()");
            return localDate;
        }

        @NotNull
        public final LocalDateTime g(long timestamp) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
            return localDateTimeOfInstant;
        }

        public final long h(@NotNull LocalDateTime localDateTime) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return localDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final LocalDateTime i(long timestamp) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
            return localDateTimeOfInstant;
        }

        public final long j(@NotNull LocalDate localDate) {
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        LocalDate localDateOf = LocalDate.of(2023, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(2023, 1, 1)");
        a = localDateOf;
        b = companion.j(localDateOf);
    }
}
