package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010!\u001a\u0004\b\n\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/cyd;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", MapSchema.FIELD_NAME_ENTRY, "()J", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "b", "endDate", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ovulationDay", "d", "predictedTime", "I", "f", "()I", "type", "Z", b2n.f, "()Z", "setDbDate", "(Z)V", "isDbDate", "Ljava/lang/String;", "()Ljava/lang/String;", "setDeviceMac", "(Ljava/lang/String;)V", "deviceMac", "<init>", "(JJLjava/lang/Long;Ljava/lang/Long;IZLjava/lang/String;)V", "menstrual_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class cyd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long ovulationDay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Long predictedTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isDbDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String deviceMac;

    public cyd(long j2, long j3, @Nullable Long l2, @Nullable Long l3, int i, boolean z, @NotNull String deviceMac) {
        Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
        this.startDate = j2;
        this.endDate = j3;
        this.ovulationDay = l2;
        this.predictedTime = l3;
        this.type = i;
        this.isDbDate = z;
        this.deviceMac = deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getOvulationDay() {
        return this.ovulationDay;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getPredictedTime() {
        return this.predictedTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cyd)) {
            return false;
        }
        cyd cydVar = (cyd) other;
        return this.startDate == cydVar.startDate && this.endDate == cydVar.endDate && Intrinsics.areEqual(this.ovulationDay, cydVar.ovulationDay) && Intrinsics.areEqual(this.predictedTime, cydVar.predictedTime) && this.type == cydVar.type && this.isDbDate == cydVar.isDbDate && Intrinsics.areEqual(this.deviceMac, cydVar.deviceMac);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsDbDate() {
        return this.isDbDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.startDate) * 31) + Long.hashCode(this.endDate)) * 31;
        Long l2 = this.ovulationDay;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.predictedTime;
        int iHashCode3 = (((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31;
        boolean z = this.isDbDate;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode3 + r1) * 31) + this.deviceMac.hashCode();
    }

    @NotNull
    public String toString() {
        Object objD;
        StringBuilder sb = new StringBuilder();
        sb.append("Ovulation(");
        sb.append("startDate=");
        sb.append(o05.D(this.startDate));
        sb.append(",");
        sb.append("endDate=");
        sb.append(o05.D(this.endDate));
        sb.append(",");
        sb.append("ovulationDay=");
        Long l2 = this.ovulationDay;
        if (l2 == null || (objD = o05.D(l2.longValue())) == null) {
            objD = "null";
        }
        sb.append(objD);
        sb.append(",");
        sb.append("type=");
        sb.append(this.type);
        sb.append(",");
        sb.append("predictedTime=");
        sb.append(this.predictedTime);
        sb.append("isDbDate=");
        sb.append(this.isDbDate);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public /* synthetic */ cyd(long j2, long j3, Long l2, Long l3, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, l2, l3, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str);
    }
}
