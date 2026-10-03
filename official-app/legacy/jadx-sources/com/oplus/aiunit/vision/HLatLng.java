package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ie8, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ie8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "()D", "latitude", "b", "longitude", "<init>", "(DD)V", "location_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HLatLng {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double lat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double lng;

    public HLatLng(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HLatLng)) {
            return false;
        }
        HLatLng hLatLng = (HLatLng) other;
        return Double.compare(this.lat, hLatLng.lat) == 0 && Double.compare(this.lng, hLatLng.lng) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.lat) * 31) + Double.hashCode(this.lng);
    }

    @NotNull
    public String toString() {
        return "HLatLng(lat=" + this.lat + ", lng=" + this.lng + ")";
    }
}
