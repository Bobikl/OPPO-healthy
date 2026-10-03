package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.r6k, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/r6k;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "getLat", "()D", "lat", "b", "getLng", "lng", "", "c", "J", "getTs", "()J", "ts", "<init>", "(DDJ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TrackPoint {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double lat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double lng;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long ts;

    public TrackPoint(double d, double d2, long j2) {
        this.lat = d;
        this.lng = d2;
        this.ts = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackPoint)) {
            return false;
        }
        TrackPoint trackPoint = (TrackPoint) other;
        return Double.compare(this.lat, trackPoint.lat) == 0 && Double.compare(this.lng, trackPoint.lng) == 0 && this.ts == trackPoint.ts;
    }

    public int hashCode() {
        return (((Double.hashCode(this.lat) * 31) + Double.hashCode(this.lng)) * 31) + Long.hashCode(this.ts);
    }

    @NotNull
    public String toString() {
        return "TrackPoint(lat=" + this.lat + ", lng=" + this.lng + ", ts=" + this.ts + ")";
    }
}
