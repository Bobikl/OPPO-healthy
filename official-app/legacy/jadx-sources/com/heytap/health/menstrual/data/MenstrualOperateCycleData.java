package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/menstrual/data/MenstrualOperateCycleData;", "", "status", "", "(I)V", "getStatus", "()I", "setStatus", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualOperateCycleData {
    private int status;

    public MenstrualOperateCycleData(int i) {
        this.status = i;
    }

    public static /* synthetic */ MenstrualOperateCycleData copy$default(MenstrualOperateCycleData menstrualOperateCycleData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menstrualOperateCycleData.status;
        }
        return menstrualOperateCycleData.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final MenstrualOperateCycleData copy(int status) {
        return new MenstrualOperateCycleData(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MenstrualOperateCycleData) && this.status == ((MenstrualOperateCycleData) other).status;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "MenstrualOperateCycleData(status=" + this.status + ")";
    }
}
