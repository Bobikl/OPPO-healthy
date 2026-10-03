package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lpa, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/lpa;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "timestamp", "Lcom/amap/api/maps/model/LatLng;", "Lcom/amap/api/maps/model/LatLng;", "()Lcom/amap/api/maps/model/LatLng;", "latLng", "c", "()Z", "isValid", "<init>", "(JLcom/amap/api/maps/model/LatLng;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class KmMilestone {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final LatLng latLng;

    public KmMilestone(long j2, @NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.timestamp = j2;
        this.latLng = latLng;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LatLng getLatLng() {
        return this.latLng;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean c() {
        LatLng latLng = this.latLng;
        if (latLng.latitude == 0.0d) {
            return !((latLng.longitude > 0.0d ? 1 : (latLng.longitude == 0.0d ? 0 : -1)) == 0);
        }
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KmMilestone)) {
            return false;
        }
        KmMilestone kmMilestone = (KmMilestone) other;
        return this.timestamp == kmMilestone.timestamp && Intrinsics.areEqual(this.latLng, kmMilestone.latLng);
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + this.latLng.hashCode();
    }

    @NotNull
    public String toString() {
        return "KmMilestone(timestamp=" + this.timestamp + ", latLng=" + this.latLng + ")";
    }
}
