package com.heytap.health.cervical_vertebra.util;

import com.oplus.aiunit.vision.f04;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/cervical_vertebra/util/a;", "", "Companion", "a", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.cervical_vertebra.util.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/cervical_vertebra/util/a$a;", "", "Ljava/time/LocalDate;", "date", "", MapSchema.FIELD_NAME_ENTRY, ClickApiEntity.TIME, "c", "Ljava/time/LocalDateTime;", "d", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "a", "b", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return (int) RangesKt___RangesKt.coerceAtLeast(endDate.toEpochDay() - startDate.toEpochDay(), 0L);
        }

        public final int b(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return (((endDate.getYear() - startDate.getYear()) * 12) + endDate.getMonthValue()) - startDate.getMonthValue();
        }

        @NotNull
        public final LocalDate c(long time) {
            LocalDate localDate = d(time).toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "getLocalDateTimeFromTime(time).toLocalDate()");
            return localDate;
        }

        @NotNull
        public final LocalDateTime d(long time) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(\n            I…systemDefault()\n        )");
            return localDateTimeOfInstant;
        }

        @JvmStatic
        public final long e(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return RangesKt___RangesKt.coerceAtLeast(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), 0L);
        }
    }
}
