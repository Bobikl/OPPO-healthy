package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.Marker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.v5k, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/v5k;", "", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/amap/api/maps/model/Marker;", "Lcom/amap/api/maps/model/Marker;", "getStartMarker", "()Lcom/amap/api/maps/model/Marker;", "startMarker", "b", "getEndMarker", "endMarker", "<init>", "(Lcom/amap/api/maps/model/Marker;Lcom/amap/api/maps/model/Marker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TrackDrawResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Marker startMarker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Marker endMarker;

    public TrackDrawResult(@Nullable Marker marker, @Nullable Marker marker2) {
        this.startMarker = marker;
        this.endMarker = marker2;
    }

    public final void a() {
        Marker marker = this.startMarker;
        if (marker != null) {
            marker.remove();
        }
        Marker marker2 = this.endMarker;
        if (marker2 != null) {
            marker2.remove();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackDrawResult)) {
            return false;
        }
        TrackDrawResult trackDrawResult = (TrackDrawResult) other;
        return Intrinsics.areEqual(this.startMarker, trackDrawResult.startMarker) && Intrinsics.areEqual(this.endMarker, trackDrawResult.endMarker);
    }

    public int hashCode() {
        Marker marker = this.startMarker;
        int iHashCode = (marker == null ? 0 : marker.hashCode()) * 31;
        Marker marker2 = this.endMarker;
        return iHashCode + (marker2 != null ? marker2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrackDrawResult(startMarker=" + this.startMarker + ", endMarker=" + this.endMarker + ")";
    }
}
