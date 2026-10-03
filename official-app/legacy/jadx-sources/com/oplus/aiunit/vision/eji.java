package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.sports.R$plurals;
import com.heytap.sports.R$string;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/eji;", "", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class eji {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.eji$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000f\u001a\u00020\u0002H\u0007¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/eji$a;", "", "", "runExtraJson", "", b2n.g, "(Ljava/lang/String;)Ljava/lang/Double;", "b", "", "value", b2n.f, MapSchema.FIELD_NAME_ENTRY, "c", "d", "a", "f", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a(int value) {
            if (fji.H()) {
                String quantityString = b78.a().getResources().getQuantityString(R$plurals.sports_stat_kj_unit, value);
                Intrinsics.checkNotNullExpressionValue(quantityString, "{\n                Global…nit, value)\n            }");
                return quantityString;
            }
            String string = b78.a().getString(R$string.sports_stat_cal_unit);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…t_cal_unit)\n            }");
            return string;
        }

        @JvmStatic
        @NotNull
        public final String b() {
            if (fji.I()) {
                String string = b78.a().getString(R$string.sports_distance_unit_mile);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…_unit_mile)\n            }");
                return string;
            }
            String string2 = b78.a().getString(R$string.sports_distance_unit);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                Global…tance_unit)\n            }");
            return string2;
        }

        @JvmStatic
        @NotNull
        public final String c(int value) {
            if (fji.I()) {
                String quantityString = b78.a().getResources().getQuantityString(R$plurals.sports_detail_elevation_chart_Y_description_foot, value);
                Intrinsics.checkNotNullExpressionValue(quantityString, "{\n                Global…oot, value)\n            }");
                return quantityString;
            }
            String string = b78.a().getString(R$string.sports_detail_elevation_chart_Y_description);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…escription)\n            }");
            return string;
        }

        @JvmStatic
        @NotNull
        public final String d(int value) {
            if (fji.I()) {
                String quantityString = b78.a().getResources().getQuantityString(R$plurals.sports_distance_unit_yard, value);
                Intrinsics.checkNotNullExpressionValue(quantityString, "{\n                Global…ard, value)\n            }");
                return quantityString;
            }
            String string = b78.a().getString(R$string.sports_detail_elevation_chart_Y_description);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…escription)\n            }");
            return string;
        }

        @JvmStatic
        @NotNull
        public final String e() {
            if (fji.I()) {
                String string = b78.a().getString(R$string.sports_running_avg_pace_mile_unit);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…_mile_unit)\n            }");
                return string;
            }
            String string2 = b78.a().getString(R$string.sports_running_avg_pace_unit);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                Global…_pace_unit)\n            }");
            return string2;
        }

        @JvmStatic
        @NotNull
        public final String f() {
            if (fji.H()) {
                String string = b78.a().getString(R$string.sports_record_swim_pace_yard);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…_pace_yard)\n            }");
                return string;
            }
            String string2 = b78.a().getString(R$string.sports_record_swim_pace);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                Global…_swim_pace)\n            }");
            return string2;
        }

        @JvmStatic
        @NotNull
        public final String g(int value) {
            if (fji.I()) {
                String quantityString = b78.a().getResources().getQuantityString(R$plurals.sports_health_record_speed_mile_unit, value);
                Intrinsics.checkNotNullExpressionValue(quantityString, "{\n                Global…nit, value)\n            }");
                return quantityString;
            }
            String string = b78.a().getString(R$string.sports_health_record_speed_unit);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                Global…speed_unit)\n            }");
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002f  */
        @Nullable
        public final Double h(@Nullable String runExtraJson) {
            Double dValueOf;
            boolean zI = fji.I();
            if (zI) {
                RunExtra runExtra = (RunExtra) sc8.a(runExtraJson, RunExtra.class);
                if ((runExtra != null ? runExtra.getBsTotalDistance() : 0L) > 0) {
                    Intrinsics.checkNotNull(runExtra);
                    dValueOf = Double.valueOf(runExtra.getBsTotalDistance() / 10000.0d);
                } else {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getTrackMetaDataBritishDistance() isBritishUnit=");
            sb.append(zI);
            sb.append("; btDistance=");
            sb.append(dValueOf);
            return dValueOf;
        }
    }

    @JvmStatic
    @NotNull
    public static final String a(int i) {
        return INSTANCE.g(i);
    }
}
