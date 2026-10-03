package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/PhysicalMentalObject;", "", "avgStress", "", "stressState", "(II)V", "getAvgStress", "()I", "setAvgStress", "(I)V", "getStressState", "setStressState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PhysicalMentalObject {
    private int avgStress;
    private int stressState;

    public PhysicalMentalObject(int i, int i2) {
        this.avgStress = i;
        this.stressState = i2;
    }

    public static /* synthetic */ PhysicalMentalObject copy$default(PhysicalMentalObject physicalMentalObject, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = physicalMentalObject.avgStress;
        }
        if ((i3 & 2) != 0) {
            i2 = physicalMentalObject.stressState;
        }
        return physicalMentalObject.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStressState() {
        return this.stressState;
    }

    @NotNull
    public final PhysicalMentalObject copy(int avgStress, int stressState) {
        return new PhysicalMentalObject(avgStress, stressState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalMentalObject)) {
            return false;
        }
        PhysicalMentalObject physicalMentalObject = (PhysicalMentalObject) other;
        return this.avgStress == physicalMentalObject.avgStress && this.stressState == physicalMentalObject.stressState;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getStressState() {
        return this.stressState;
    }

    public int hashCode() {
        return (Integer.hashCode(this.avgStress) * 31) + Integer.hashCode(this.stressState);
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }

    public final void setStressState(int i) {
        this.stressState = i;
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalObject(avgStress=" + this.avgStress + ", stressState=" + this.stressState + ")";
    }
}
