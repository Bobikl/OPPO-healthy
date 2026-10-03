package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.oq7, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/oq7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "setDistance", "(I)V", "distance", "b", "setPace", "pace", "c", "setState", "state", "<init>", "(III)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FiveKmCalData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int distance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int pace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int state;

    public FiveKmCalData(int i, int i2, int i3) {
        this.distance = i;
        this.pace = i2;
        this.state = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiveKmCalData)) {
            return false;
        }
        FiveKmCalData fiveKmCalData = (FiveKmCalData) other;
        return this.distance == fiveKmCalData.distance && this.pace == fiveKmCalData.pace && this.state == fiveKmCalData.state;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.distance) * 31) + Integer.hashCode(this.pace)) * 31) + Integer.hashCode(this.state);
    }

    @NotNull
    public String toString() {
        return "FiveKmCalData(distance=" + this.distance + ", pace=" + this.pace + ", state=" + this.state + ")";
    }
}
