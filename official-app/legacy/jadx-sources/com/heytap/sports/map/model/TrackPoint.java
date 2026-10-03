package com.heytap.sports.map.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J;\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006/"}, d2 = {"Lcom/heytap/sports/map/model/TrackPoint;", "", "location", "Lcom/amap/api/maps/model/LatLng;", SpeechConstant.KEY_TTS_TIMESTAMP, "", "speed", "", "bearing", "isPause", "", "(Lcom/amap/api/maps/model/LatLng;JFFZ)V", "getBearing", "()F", "setBearing", "(F)V", "()Z", "setPause", "(Z)V", "latitude", "", "getLatitude", "()D", "getLocation", "()Lcom/amap/api/maps/model/LatLng;", "setLocation", "(Lcom/amap/api/maps/model/LatLng;)V", "longitude", "getLongitude", "getSpeed", "setSpeed", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrackPoint {
    public static final int $stable = 8;
    private float bearing;
    private boolean isPause;

    @NotNull
    private LatLng location;
    private float speed;
    private long timeStamp;

    public TrackPoint(@NotNull LatLng location, long j2, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
        this.timeStamp = j2;
        this.speed = f;
        this.bearing = f2;
        this.isPause = z;
    }

    public static /* synthetic */ TrackPoint copy$default(TrackPoint trackPoint, LatLng latLng, long j2, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            latLng = trackPoint.location;
        }
        if ((i & 2) != 0) {
            j2 = trackPoint.timeStamp;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            f = trackPoint.speed;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = trackPoint.bearing;
        }
        float f4 = f2;
        if ((i & 16) != 0) {
            z = trackPoint.isPause;
        }
        return trackPoint.copy(latLng, j3, f3, f4, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLng getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBearing() {
        return this.bearing;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsPause() {
        return this.isPause;
    }

    @NotNull
    public final TrackPoint copy(@NotNull LatLng location, long timeStamp, float speed, float bearing, boolean isPause) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new TrackPoint(location, timeStamp, speed, bearing, isPause);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackPoint)) {
            return false;
        }
        TrackPoint trackPoint = (TrackPoint) other;
        return Intrinsics.areEqual(this.location, trackPoint.location) && this.timeStamp == trackPoint.timeStamp && Float.compare(this.speed, trackPoint.speed) == 0 && Float.compare(this.bearing, trackPoint.bearing) == 0 && this.isPause == trackPoint.isPause;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final double getLatitude() {
        return this.location.latitude;
    }

    @NotNull
    public final LatLng getLocation() {
        return this.location;
    }

    public final double getLongitude() {
        return this.location.longitude;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((this.location.hashCode() * 31) + Long.hashCode(this.timeStamp)) * 31) + Float.hashCode(this.speed)) * 31) + Float.hashCode(this.bearing)) * 31;
        boolean z = this.isPause;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode + r3;
    }

    public final boolean isPause() {
        return this.isPause;
    }

    public final void setBearing(float f) {
        this.bearing = f;
    }

    public final void setLocation(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<set-?>");
        this.location = latLng;
    }

    public final void setPause(boolean z) {
        this.isPause = z;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    @NotNull
    public String toString() {
        return "TrackPoint(location=" + this.location + ", timeStamp=" + this.timeStamp + ", speed=" + this.speed + ", bearing=" + this.bearing + ", isPause=" + this.isPause + ")";
    }

    public /* synthetic */ TrackPoint(LatLng latLng, long j2, float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? false : z);
    }
}
