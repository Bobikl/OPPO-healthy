package com.heytap.health.bloodoxygen.util;

import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/a;", "", "Companion", "a", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final LocalDate a;
    public static final long b;

    /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.util.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\n\u0010\t\u001a\u00020\u0002*\u00020\u0004J\n\u0010\n\u001a\u00020\u0002*\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/a$a;", "", "", "timestamp", "Ljava/time/LocalDate;", MapSchema.FIELD_NAME_ENTRY, "Ljava/time/LocalDateTime;", "f", "a", b2n.f, b2n.g, "b", "DEFAULT_MIN_DATE", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "DEFAULT_MIN_DATE_TIME", "J", "d", "()J", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
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

        public final long b() {
            return LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        @NotNull
        public final LocalDate c() {
            return a.a;
        }

        public final long d() {
            return a.b;
        }

        @NotNull
        public final LocalDate e(long timestamp) {
            LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "ofInstant(Instant.ofEpoc…mDefault()).toLocalDate()");
            return localDate;
        }

        @NotNull
        public final LocalDateTime f(long timestamp) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
            return localDateTimeOfInstant;
        }

        public final long g(@NotNull LocalDate localDate) {
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }

        public final long h(@NotNull LocalDateTime localDateTime) {
            Intrinsics.checkNotNullParameter(localDateTime, "<this>");
            return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        LocalDate localDateOf = LocalDate.of(2019, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(2019, 1, 1)");
        a = localDateOf;
        b = companion.g(localDateOf);
    }
}
