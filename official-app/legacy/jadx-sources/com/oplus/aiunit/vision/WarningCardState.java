package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.HeartRateWarning;
import com.heytap.health.health.familymode.request.FamilyBloodOxygenWarningRecord;
import com.heytap.health.health.familymode.request.GlucoseWarnObject;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.z7l, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\n\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\n\u0012\b\b\u0002\u0010*\u001a\u00020$\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\n\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020$\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00109\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\"\u0010\u0011R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010.\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001a\u00102\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001a\u00104\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b\u0013\u0010'R\u001a\u00106\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b\f\u0010\u001aR\u001a\u00109\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b8\u0010\u001a¨\u0006<"}, d2 = {"Lcom/oplus/aiunit/vision/z7l;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/heytap/databaseengine/model/HeartRateWarning;", "a", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "setHrHighWarningList", "(Ljava/util/List;)V", "hrHighWarningList", "b", "f", "setHrLowWarningList", "hrLowWarningList", "c", "I", "getAtrialFibrillationCount", "()I", "setAtrialFibrillationCount", "(I)V", "atrialFibrillationCount", "Lcom/heytap/health/health/familymode/request/GlucoseWarnObject;", "d", "setGlucoseLowList", "glucoseLowList", "setGlucoseHighList", "glucoseHighList", "", "J", "getBloodGlucoseDeviceStartTime", "()J", "setBloodGlucoseDeviceStartTime", "(J)V", "bloodGlucoseDeviceStartTime", "Lcom/heytap/health/health/familymode/request/FamilyBloodOxygenWarningRecord;", b2n.f, "setSpo2WarningList", "spo2WarningList", b2n.g, "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "i", "dataTime", "j", c8l.SPAN_KEY, MapSchema.FIELD_NAME_KEY, "getPriority", "priority", "<init>", "(Ljava/util/List;Ljava/util/List;ILjava/util/List;Ljava/util/List;JLjava/util/List;Ljava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WarningCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public List<HeartRateWarning> hrHighWarningList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public List<HeartRateWarning> hrLowWarningList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int atrialFibrillationCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public List<GlucoseWarnObject> glucoseLowList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public List<GlucoseWarnObject> glucoseHighList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public long bloodGlucoseDeviceStartTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public List<FamilyBloodOxygenWarningRecord> spo2WarningList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int priority;

    public WarningCardState(@Nullable List<HeartRateWarning> list, @Nullable List<HeartRateWarning> list2, int i, @Nullable List<GlucoseWarnObject> list3, @Nullable List<GlucoseWarnObject> list4, long j2, @Nullable List<FamilyBloodOxygenWarningRecord> list5, @NotNull String ssoid, long j3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.hrHighWarningList = list;
        this.hrLowWarningList = list2;
        this.atrialFibrillationCount = i;
        this.glucoseLowList = list3;
        this.glucoseHighList = list4;
        this.bloodGlucoseDeviceStartTime = j2;
        this.spo2WarningList = list5;
        this.ssoid = ssoid;
        this.dataTime = j3;
        this.span = i2;
        this.priority = i3;
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
    public final List<GlucoseWarnObject> c() {
        return this.glucoseHighList;
    }

    @Nullable
    public final List<GlucoseWarnObject> d() {
        return this.glucoseLowList;
    }

    @Nullable
    public final List<HeartRateWarning> e() {
        return this.hrHighWarningList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningCardState)) {
            return false;
        }
        WarningCardState warningCardState = (WarningCardState) other;
        return Intrinsics.areEqual(this.hrHighWarningList, warningCardState.hrHighWarningList) && Intrinsics.areEqual(this.hrLowWarningList, warningCardState.hrLowWarningList) && this.atrialFibrillationCount == warningCardState.atrialFibrillationCount && Intrinsics.areEqual(this.glucoseLowList, warningCardState.glucoseLowList) && Intrinsics.areEqual(this.glucoseHighList, warningCardState.glucoseHighList) && this.bloodGlucoseDeviceStartTime == warningCardState.bloodGlucoseDeviceStartTime && Intrinsics.areEqual(this.spo2WarningList, warningCardState.spo2WarningList) && Intrinsics.areEqual(getSsoid(), warningCardState.getSsoid()) && getDataTime() == warningCardState.getDataTime() && getSpan() == warningCardState.getSpan() && getPriority() == warningCardState.getPriority();
    }

    @Nullable
    public final List<HeartRateWarning> f() {
        return this.hrLowWarningList;
    }

    @Nullable
    public final List<FamilyBloodOxygenWarningRecord> g() {
        return this.spo2WarningList;
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        List<HeartRateWarning> list = this.hrHighWarningList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<HeartRateWarning> list2 = this.hrLowWarningList;
        int iHashCode2 = (((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.atrialFibrillationCount)) * 31;
        List<GlucoseWarnObject> list3 = this.glucoseLowList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GlucoseWarnObject> list4 = this.glucoseHighList;
        int iHashCode4 = (((iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31) + Long.hashCode(this.bloodGlucoseDeviceStartTime)) * 31;
        List<FamilyBloodOxygenWarningRecord> list5 = this.spo2WarningList;
        return ((((((((iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "WarningCardState(hrHighWarningList=" + this.hrHighWarningList + ", hrLowWarningList=" + this.hrLowWarningList + ", atrialFibrillationCount=" + this.atrialFibrillationCount + ", glucoseLowList=" + this.glucoseLowList + ", glucoseHighList=" + this.glucoseHighList + ", bloodGlucoseDeviceStartTime=" + this.bloodGlucoseDeviceStartTime + ", spo2WarningList=" + this.spo2WarningList + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ WarningCardState(List list, List list2, int i, List list3, List list4, long j2, List list5, String str, long j3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? null : list2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? null : list3, (i4 & 16) != 0 ? null : list4, (i4 & 32) != 0 ? 0L : j2, (i4 & 64) != 0 ? null : list5, str, j3, (i4 & 512) != 0 ? 2 : i2, (i4 & 1024) != 0 ? 0 : i3);
    }
}
