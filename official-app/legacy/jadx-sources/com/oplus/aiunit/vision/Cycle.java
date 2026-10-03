package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.weatherservicesdk.data.Weather;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ii4, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016JC\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/ii4;", "", "", "toString", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/oplus/aiunit/vision/fee;", TypedValues.CycleType.S_WAVE_PERIOD, "Lcom/oplus/aiunit/vision/cyd;", "ovulation", "", "isPredict", "a", "", "hashCode", "other", "equals", "J", "f", "()J", MapSchema.FIELD_NAME_KEY, "(J)V", "b", "c", b2n.g, "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "j", "(Ljava/util/List;)V", "d", "Lcom/oplus/aiunit/vision/cyd;", "()Lcom/oplus/aiunit/vision/cyd;", "i", "(Lcom/oplus/aiunit/vision/cyd;)V", "Z", b2n.f, "()Z", "<init>", "(JJLjava/util/List;Lcom/oplus/aiunit/vision/cyd;Z)V", "menstrual_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Cycle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<Period> period;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public cyd ovulation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isPredict;

    public Cycle(long j2, long j3, @NotNull List<Period> period, @Nullable cyd cydVar, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.startDate = j2;
        this.endDate = j3;
        this.period = period;
        this.ovulation = cydVar;
        this.isPredict = z;
    }

    @NotNull
    public final Cycle a(long startDate, long endDate, @NotNull List<Period> period, @Nullable cyd ovulation, boolean isPredict) {
        Intrinsics.checkNotNullParameter(period, "period");
        return new Cycle(startDate, endDate, period, ovulation, isPredict);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final cyd getOvulation() {
        return this.ovulation;
    }

    @NotNull
    public final List<Period> e() {
        return this.period;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cycle)) {
            return false;
        }
        Cycle cycle = (Cycle) other;
        return this.startDate == cycle.startDate && this.endDate == cycle.endDate && Intrinsics.areEqual(this.period, cycle.period) && Intrinsics.areEqual(this.ovulation, cycle.ovulation) && this.isPredict == cycle.isPredict;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsPredict() {
        return this.isPredict;
    }

    public final void h(long j2) {
        this.endDate = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.startDate) * 31) + Long.hashCode(this.endDate)) * 31) + this.period.hashCode()) * 31;
        cyd cydVar = this.ovulation;
        int iHashCode2 = (iHashCode + (cydVar == null ? 0 : cydVar.hashCode())) * 31;
        boolean z = this.isPredict;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    public final void i(@Nullable cyd cydVar) {
        this.ovulation = cydVar;
    }

    public final void j(@NotNull List<Period> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.period = list;
    }

    public final void k(long j2) {
        this.startDate = j2;
    }

    @NotNull
    public String toString() {
        String str = "Cycle(startDate=" + o05.D(this.startDate) + ",endDate=" + o05.D(this.endDate) + "," + Weather.SEPARATOR + "period=" + this.period + "," + Weather.SEPARATOR + "ovulation=" + this.ovulation + ",isPredict:" + this.isPredict + ")";
        Intrinsics.checkNotNullExpressionValue(str, "builder.toString()");
        return str;
    }

    public /* synthetic */ Cycle(long j2, long j3, List list, cyd cydVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, list, (i & 8) != 0 ? null : cydVar, (i & 16) != 0 ? false : z);
    }
}
