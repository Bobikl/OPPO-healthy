package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$string;
import com.heytap.sports.record.list.bean.SportModeValueType;
import com.heytap.sports.record.list.helper.DataHelper;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\t\u000e\u0010B7\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016\u0082\u0001\u0004\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/dei;", "", "Lcom/heytap/sports/record/list/bean/SportModeValueType;", "a", "Lcom/heytap/sports/record/list/bean/SportModeValueType;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/sports/record/list/bean/SportModeValueType;", "valueType", "", "b", "I", "()I", mnc.DOCTOR_LEVEL, "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "valueString", "unitString", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "duration", "<init>", "(Lcom/heytap/sports/record/list/bean/SportModeValueType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/oplus/aiunit/vision/dei$a;", "Lcom/oplus/aiunit/vision/dei$b;", "Lcom/oplus/aiunit/vision/dei$c;", "Lcom/oplus/aiunit/vision/dei$d;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class dei {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SportModeValueType valueType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int titleId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String valueString;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String unitString;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long duration;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/dei$a;", "Lcom/oplus/aiunit/vision/dei;", "", "distance", "<init>", "(J)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends dei {
        public static final int $stable = 0;

        public a(long j2) {
            super(SportModeValueType.DistanceKm, R$string.sports_stat_dis_title, DataHelper.p(fji.a(j2)), eji.INSTANCE.b(), null, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/dei$b;", "Lcom/oplus/aiunit/vision/dei;", "", "duration", "<init>", "(J)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends dei {
        public static final int $stable = 0;

        public b(long j2) {
            super(SportModeValueType.Duration, R$string.fit_his_static_total_duration, null, null, Long.valueOf(j2), null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/dei$c;", "Lcom/oplus/aiunit/vision/dei;", "", "distance", "<init>", "(J)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends dei {
        public static final int $stable = 0;

        public c(long j2) {
            super(SportModeValueType.RunAmount, R$string.sport_records_stat_total_runs_card_title_all, DataHelper.p(fji.a(j2)), eji.INSTANCE.b(), null, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/dei$d;", "Lcom/oplus/aiunit/vision/dei;", "", "distance", "<init>", "(J)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends dei {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j2) {
            int i = (int) j2;
            super(SportModeValueType.SwimDistanceM, R$string.sports_stat_dis_title, String.valueOf(fji.j(i)), eji.INSTANCE.d(i), null, null);
        }
    }

    public /* synthetic */ dei(SportModeValueType sportModeValueType, int i, String str, String str2, Long l2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportModeValueType, i, str, str2, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnitString() {
        return this.unitString;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValueString() {
        return this.valueString;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final SportModeValueType getValueType() {
        return this.valueType;
    }

    public dei(SportModeValueType sportModeValueType, int i, String str, String str2, Long l2) {
        this.valueType = sportModeValueType;
        this.titleId = i;
        this.valueString = str;
        this.unitString = str2;
        this.duration = l2;
    }
}
