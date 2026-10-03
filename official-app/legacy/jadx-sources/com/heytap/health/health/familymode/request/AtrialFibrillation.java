package com.heytap.health.health.familymode.request;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.heytap.health.health.familymode.request.FamilyAtrialFibrillation, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health/familymode/request/FamilyAtrialFibrillation;", "", "atrialFibrillationCount", "", "atrialFibrillationTime", "(II)V", "getAtrialFibrillationCount", "()I", "setAtrialFibrillationCount", "(I)V", "getAtrialFibrillationTime", "setAtrialFibrillationTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AtrialFibrillation {
    private int atrialFibrillationCount;
    private int atrialFibrillationTime;

    public AtrialFibrillation(int i, int i2) {
        this.atrialFibrillationCount = i;
        this.atrialFibrillationTime = i2;
    }

    public static /* synthetic */ AtrialFibrillation copy$default(AtrialFibrillation atrialFibrillation, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = atrialFibrillation.atrialFibrillationCount;
        }
        if ((i3 & 2) != 0) {
            i2 = atrialFibrillation.atrialFibrillationTime;
        }
        return atrialFibrillation.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAtrialFibrillationCount() {
        return this.atrialFibrillationCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAtrialFibrillationTime() {
        return this.atrialFibrillationTime;
    }

    @NotNull
    public final AtrialFibrillation copy(int atrialFibrillationCount, int atrialFibrillationTime) {
        return new AtrialFibrillation(atrialFibrillationCount, atrialFibrillationTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtrialFibrillation)) {
            return false;
        }
        AtrialFibrillation atrialFibrillation = (AtrialFibrillation) other;
        return this.atrialFibrillationCount == atrialFibrillation.atrialFibrillationCount && this.atrialFibrillationTime == atrialFibrillation.atrialFibrillationTime;
    }

    public final int getAtrialFibrillationCount() {
        return this.atrialFibrillationCount;
    }

    public final int getAtrialFibrillationTime() {
        return this.atrialFibrillationTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.atrialFibrillationCount) * 31) + Integer.hashCode(this.atrialFibrillationTime);
    }

    public final void setAtrialFibrillationCount(int i) {
        this.atrialFibrillationCount = i;
    }

    public final void setAtrialFibrillationTime(int i) {
        this.atrialFibrillationTime = i;
    }

    @NotNull
    public String toString() {
        return "AtrialFibrillation(atrialFibrillationCount=" + this.atrialFibrillationCount + ", atrialFibrillationTime=" + this.atrialFibrillationTime + ")";
    }
}
