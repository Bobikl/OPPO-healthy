package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.pk1, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0010\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u000b\u0010\u0013R\u001a\u0010\"\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/pk1;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "a", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "c", "()Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "lastData", "b", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "minValue", "d", "maxValue", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", c8l.SPAN_KEY, b2n.f, "getPriority", "priority", "<init>", "(Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;IILjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BloodOxygenCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final BloodOxygenSaturation lastData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int priority;

    public BloodOxygenCardState(@Nullable BloodOxygenSaturation bloodOxygenSaturation, int i, int i2, @NotNull String ssoid, long j2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.lastData = bloodOxygenSaturation;
        this.minValue = i;
        this.maxValue = i2;
        this.ssoid = ssoid;
        this.dataTime = j2;
        this.span = i3;
        this.priority = i4;
    }

    @Override // com.oplus.aiunit.vision.g27
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BloodOxygenSaturation getLastData() {
        return this.lastData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodOxygenCardState)) {
            return false;
        }
        BloodOxygenCardState bloodOxygenCardState = (BloodOxygenCardState) other;
        return Intrinsics.areEqual(this.lastData, bloodOxygenCardState.lastData) && this.minValue == bloodOxygenCardState.minValue && this.maxValue == bloodOxygenCardState.maxValue && Intrinsics.areEqual(getSsoid(), bloodOxygenCardState.getSsoid()) && getDataTime() == bloodOxygenCardState.getDataTime() && getSpan() == bloodOxygenCardState.getSpan() && getPriority() == bloodOxygenCardState.getPriority();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        BloodOxygenSaturation bloodOxygenSaturation = this.lastData;
        return ((((((((((((bloodOxygenSaturation == null ? 0 : bloodOxygenSaturation.hashCode()) * 31) + Integer.hashCode(this.minValue)) * 31) + Integer.hashCode(this.maxValue)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "BloodOxygenCardState(lastData=" + this.lastData + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ BloodOxygenCardState(BloodOxygenSaturation bloodOxygenSaturation, int i, int i2, String str, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(bloodOxygenSaturation, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, str, j2, (i5 & 32) != 0 ? 1 : i3, (i5 & 64) != 0 ? 5 : i4);
    }
}
