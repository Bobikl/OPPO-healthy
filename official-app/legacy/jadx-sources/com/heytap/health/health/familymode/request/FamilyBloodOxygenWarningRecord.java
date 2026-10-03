package com.heytap.health.health.familymode.request;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/heytap/health/health/familymode/request/FamilyBloodOxygenWarningRecord;", "Ljava/io/Serializable;", "startTimestamp", "", "endTimestamp", "maxBloodOxygenSaturation", "", "minBloodOxygenSaturation", "(JJII)V", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "getMaxBloodOxygenSaturation", "()I", "setMaxBloodOxygenSaturation", "(I)V", "getMinBloodOxygenSaturation", "setMinBloodOxygenSaturation", "getStartTimestamp", "setStartTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FamilyBloodOxygenWarningRecord implements Serializable {
    private long endTimestamp;
    private int maxBloodOxygenSaturation;

    /* JADX INFO: renamed from: minBloodOxygenSaturation, reason: from kotlin metadata and from toString */
    private int mixBloodOxygenSaturation;
    private long startTimestamp;

    public FamilyBloodOxygenWarningRecord(long j2, long j3, int i, int i2) {
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.maxBloodOxygenSaturation = i;
        this.mixBloodOxygenSaturation = i2;
    }

    public static /* synthetic */ FamilyBloodOxygenWarningRecord copy$default(FamilyBloodOxygenWarningRecord familyBloodOxygenWarningRecord, long j2, long j3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = familyBloodOxygenWarningRecord.startTimestamp;
        }
        long j4 = j2;
        if ((i3 & 2) != 0) {
            j3 = familyBloodOxygenWarningRecord.endTimestamp;
        }
        long j5 = j3;
        if ((i3 & 4) != 0) {
            i = familyBloodOxygenWarningRecord.maxBloodOxygenSaturation;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = familyBloodOxygenWarningRecord.mixBloodOxygenSaturation;
        }
        return familyBloodOxygenWarningRecord.copy(j4, j5, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMixBloodOxygenSaturation() {
        return this.mixBloodOxygenSaturation;
    }

    @NotNull
    public final FamilyBloodOxygenWarningRecord copy(long startTimestamp, long endTimestamp, int maxBloodOxygenSaturation, int minBloodOxygenSaturation) {
        return new FamilyBloodOxygenWarningRecord(startTimestamp, endTimestamp, maxBloodOxygenSaturation, minBloodOxygenSaturation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyBloodOxygenWarningRecord)) {
            return false;
        }
        FamilyBloodOxygenWarningRecord familyBloodOxygenWarningRecord = (FamilyBloodOxygenWarningRecord) other;
        return this.startTimestamp == familyBloodOxygenWarningRecord.startTimestamp && this.endTimestamp == familyBloodOxygenWarningRecord.endTimestamp && this.maxBloodOxygenSaturation == familyBloodOxygenWarningRecord.maxBloodOxygenSaturation && this.mixBloodOxygenSaturation == familyBloodOxygenWarningRecord.mixBloodOxygenSaturation;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    public final int getMinBloodOxygenSaturation() {
        return this.mixBloodOxygenSaturation;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.startTimestamp) * 31) + Long.hashCode(this.endTimestamp)) * 31) + Integer.hashCode(this.maxBloodOxygenSaturation)) * 31) + Integer.hashCode(this.mixBloodOxygenSaturation);
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setMaxBloodOxygenSaturation(int i) {
        this.maxBloodOxygenSaturation = i;
    }

    public final void setMinBloodOxygenSaturation(int i) {
        this.mixBloodOxygenSaturation = i;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "FamilyBloodOxygenWarningRecord(startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", maxBloodOxygenSaturation=" + this.maxBloodOxygenSaturation + ", mixBloodOxygenSaturation=" + this.mixBloodOxygenSaturation + ")";
    }
}
