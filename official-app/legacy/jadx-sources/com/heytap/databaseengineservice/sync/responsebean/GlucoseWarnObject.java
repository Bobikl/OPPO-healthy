package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ:\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseWarnObject;", "", "timestamp", "", "value", "", EventType.EventAssociationExtra.THRESHOLD, "alertType", "", "(Ljava/lang/Long;DDLjava/lang/Integer;)V", "getAlertType", "()Ljava/lang/Integer;", "setAlertType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getThreshold", "()D", "setThreshold", "(D)V", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getValue", "setValue", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;DDLjava/lang/Integer;)Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseWarnObject;", "equals", "", "other", "hashCode", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GlucoseWarnObject {

    @Nullable
    private Integer alertType;
    private double threshold;

    @Nullable
    private Long timestamp;
    private double value;

    public GlucoseWarnObject(@Nullable Long l2, double d, double d2, @Nullable Integer num) {
        this.timestamp = l2;
        this.value = d;
        this.threshold = d2;
        this.alertType = num;
    }

    public static /* synthetic */ GlucoseWarnObject copy$default(GlucoseWarnObject glucoseWarnObject, Long l2, double d, double d2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = glucoseWarnObject.timestamp;
        }
        if ((i & 2) != 0) {
            d = glucoseWarnObject.value;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = glucoseWarnObject.threshold;
        }
        double d4 = d2;
        if ((i & 8) != 0) {
            num = glucoseWarnObject.alertType;
        }
        return glucoseWarnObject.copy(l2, d3, d4, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getThreshold() {
        return this.threshold;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAlertType() {
        return this.alertType;
    }

    @NotNull
    public final GlucoseWarnObject copy(@Nullable Long timestamp, double value, double threshold, @Nullable Integer alertType) {
        return new GlucoseWarnObject(timestamp, value, threshold, alertType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlucoseWarnObject)) {
            return false;
        }
        GlucoseWarnObject glucoseWarnObject = (GlucoseWarnObject) other;
        return Intrinsics.areEqual(this.timestamp, glucoseWarnObject.timestamp) && Double.compare(this.value, glucoseWarnObject.value) == 0 && Double.compare(this.threshold, glucoseWarnObject.threshold) == 0 && Intrinsics.areEqual(this.alertType, glucoseWarnObject.alertType);
    }

    @Nullable
    public final Integer getAlertType() {
        return this.alertType;
    }

    public final double getThreshold() {
        return this.threshold;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        Long l2 = this.timestamp;
        int iHashCode = (((((l2 == null ? 0 : l2.hashCode()) * 31) + Double.hashCode(this.value)) * 31) + Double.hashCode(this.threshold)) * 31;
        Integer num = this.alertType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setAlertType(@Nullable Integer num) {
        this.alertType = num;
    }

    public final void setThreshold(double d) {
        this.threshold = d;
    }

    public final void setTimestamp(@Nullable Long l2) {
        this.timestamp = l2;
    }

    public final void setValue(double d) {
        this.value = d;
    }

    @NotNull
    public String toString() {
        return "GlucoseWarnObject(timestamp=" + this.timestamp + ", value=" + this.value + ", threshold=" + this.threshold + ", alertType=" + this.alertType + ")";
    }
}
