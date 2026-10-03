package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006("}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseObject;", "", "minBloodGlucose", "", "maxBloodGlucose", "bloodGlucoseDeviceStartTime", "", "bloodGlucoseAlertRecordList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseWarnObject;", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;)V", "getBloodGlucoseAlertRecordList", "()Ljava/util/List;", "setBloodGlucoseAlertRecordList", "(Ljava/util/List;)V", "getBloodGlucoseDeviceStartTime", "()Ljava/lang/Long;", "setBloodGlucoseDeviceStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxBloodGlucose", "()Ljava/lang/Double;", "setMaxBloodGlucose", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMinBloodGlucose", "setMinBloodGlucose", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;)Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseObject;", "equals", "", "other", "hashCode", "", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GlucoseObject {

    @Nullable
    private List<GlucoseWarnObject> bloodGlucoseAlertRecordList;

    @Nullable
    private Long bloodGlucoseDeviceStartTime;

    @Nullable
    private Double maxBloodGlucose;

    @Nullable
    private Double minBloodGlucose;

    public GlucoseObject(@Nullable Double d, @Nullable Double d2, @Nullable Long l2, @Nullable List<GlucoseWarnObject> list) {
        this.minBloodGlucose = d;
        this.maxBloodGlucose = d2;
        this.bloodGlucoseDeviceStartTime = l2;
        this.bloodGlucoseAlertRecordList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlucoseObject copy$default(GlucoseObject glucoseObject, Double d, Double d2, Long l2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = glucoseObject.minBloodGlucose;
        }
        if ((i & 2) != 0) {
            d2 = glucoseObject.maxBloodGlucose;
        }
        if ((i & 4) != 0) {
            l2 = glucoseObject.bloodGlucoseDeviceStartTime;
        }
        if ((i & 8) != 0) {
            list = glucoseObject.bloodGlucoseAlertRecordList;
        }
        return glucoseObject.copy(d, d2, l2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getMinBloodGlucose() {
        return this.minBloodGlucose;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMaxBloodGlucose() {
        return this.maxBloodGlucose;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBloodGlucoseDeviceStartTime() {
        return this.bloodGlucoseDeviceStartTime;
    }

    @Nullable
    public final List<GlucoseWarnObject> component4() {
        return this.bloodGlucoseAlertRecordList;
    }

    @NotNull
    public final GlucoseObject copy(@Nullable Double minBloodGlucose, @Nullable Double maxBloodGlucose, @Nullable Long bloodGlucoseDeviceStartTime, @Nullable List<GlucoseWarnObject> bloodGlucoseAlertRecordList) {
        return new GlucoseObject(minBloodGlucose, maxBloodGlucose, bloodGlucoseDeviceStartTime, bloodGlucoseAlertRecordList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlucoseObject)) {
            return false;
        }
        GlucoseObject glucoseObject = (GlucoseObject) other;
        return Intrinsics.areEqual((Object) this.minBloodGlucose, (Object) glucoseObject.minBloodGlucose) && Intrinsics.areEqual((Object) this.maxBloodGlucose, (Object) glucoseObject.maxBloodGlucose) && Intrinsics.areEqual(this.bloodGlucoseDeviceStartTime, glucoseObject.bloodGlucoseDeviceStartTime) && Intrinsics.areEqual(this.bloodGlucoseAlertRecordList, glucoseObject.bloodGlucoseAlertRecordList);
    }

    @Nullable
    public final List<GlucoseWarnObject> getBloodGlucoseAlertRecordList() {
        return this.bloodGlucoseAlertRecordList;
    }

    @Nullable
    public final Long getBloodGlucoseDeviceStartTime() {
        return this.bloodGlucoseDeviceStartTime;
    }

    @Nullable
    public final Double getMaxBloodGlucose() {
        return this.maxBloodGlucose;
    }

    @Nullable
    public final Double getMinBloodGlucose() {
        return this.minBloodGlucose;
    }

    public int hashCode() {
        Double d = this.minBloodGlucose;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.maxBloodGlucose;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l2 = this.bloodGlucoseDeviceStartTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<GlucoseWarnObject> list = this.bloodGlucoseAlertRecordList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setBloodGlucoseAlertRecordList(@Nullable List<GlucoseWarnObject> list) {
        this.bloodGlucoseAlertRecordList = list;
    }

    public final void setBloodGlucoseDeviceStartTime(@Nullable Long l2) {
        this.bloodGlucoseDeviceStartTime = l2;
    }

    public final void setMaxBloodGlucose(@Nullable Double d) {
        this.maxBloodGlucose = d;
    }

    public final void setMinBloodGlucose(@Nullable Double d) {
        this.minBloodGlucose = d;
    }

    @NotNull
    public String toString() {
        return "GlucoseObject(minBloodGlucose=" + this.minBloodGlucose + ", maxBloodGlucose=" + this.maxBloodGlucose + ", bloodGlucoseDeviceStartTime=" + this.bloodGlucoseDeviceStartTime + ", bloodGlucoseAlertRecordList=" + this.bloodGlucoseAlertRecordList + ")";
    }
}
