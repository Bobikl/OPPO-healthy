package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wta, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/wta;", "", "o", "", "b", "", "toString", "hashCode", "", "other", "", "equals", "i", "I", "d", "()I", "setId", "(I)V", "id", "Lcom/amap/api/maps/model/LatLng;", "j", "Lcom/amap/api/maps/model/LatLng;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/amap/api/maps/model/LatLng;", "setLatLng", "(Lcom/amap/api/maps/model/LatLng;)V", "latLng", "<init>", "(ILcom/amap/api/maps/model/LatLng;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LatLngPoint implements Comparable<LatLngPoint> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int id;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public LatLng latLng;

    public LatLngPoint(int i, @NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.id = i;
        this.latLng = latLng;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull LatLngPoint o) {
        Intrinsics.checkNotNullParameter(o, "o");
        int i = this.id;
        int i2 = o.id;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final LatLng getLatLng() {
        return this.latLng;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatLngPoint)) {
            return false;
        }
        LatLngPoint latLngPoint = (LatLngPoint) other;
        return this.id == latLngPoint.id && Intrinsics.areEqual(this.latLng, latLngPoint.latLng);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.latLng.hashCode();
    }

    @NotNull
    public String toString() {
        return "LatLngPoint(id=" + this.id + ", latLng=" + this.latLng + ")";
    }
}
