package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/record/details/bean/Altitude;", "", "seaLevelPressure", "", "altitude", "(FF)V", "getAltitude", "()F", "setAltitude", "(F)V", "getSeaLevelPressure", "setSeaLevelPressure", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Altitude {
    public static final int $stable = 8;
    private float altitude;
    private float seaLevelPressure;

    /* JADX WARN: Illegal instructions before constructor call */
    public Altitude() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ Altitude copy$default(Altitude altitude, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = altitude.seaLevelPressure;
        }
        if ((i & 2) != 0) {
            f2 = altitude.altitude;
        }
        return altitude.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final Altitude copy(float seaLevelPressure, float altitude) {
        return new Altitude(seaLevelPressure, altitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Altitude)) {
            return false;
        }
        Altitude altitude = (Altitude) other;
        return Float.compare(this.seaLevelPressure, altitude.seaLevelPressure) == 0 && Float.compare(this.altitude, altitude.altitude) == 0;
    }

    public final float getAltitude() {
        return this.altitude;
    }

    public final float getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    public int hashCode() {
        return (Float.hashCode(this.seaLevelPressure) * 31) + Float.hashCode(this.altitude);
    }

    public final void setAltitude(float f) {
        this.altitude = f;
    }

    public final void setSeaLevelPressure(float f) {
        this.seaLevelPressure = f;
    }

    @NotNull
    public String toString() {
        return " altitude = " + this.altitude + " ;  seaLevelPressure = " + this.seaLevelPressure;
    }

    public Altitude(float f, float f2) {
        this.seaLevelPressure = f;
        this.altitude = f2;
    }

    public /* synthetic */ Altitude(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
