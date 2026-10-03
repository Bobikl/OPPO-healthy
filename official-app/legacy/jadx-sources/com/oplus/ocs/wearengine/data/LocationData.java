package com.oplus.ocs.wearengine.data;

import android.util.Log;
import androidx.annotation.FloatRange;
import com.oplus.ocs.wearengine.proto.DataProto$Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/oplus/ocs/wearengine/data/LocationData;", "", "latitude", "", "longitude", "altitude", "bearing", "speed", "state", "", "(DDDDDI)V", "getAltitude", "()D", "getBearing", "getLatitude", "getLongitude", "getSpeed", "getState", "()I", "addToValueProtoBuilder", "", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$Value$Builder;", "addToValueProtoBuilder$thirdparty_impl_release", "equals", "", "other", "hashCode", "toString", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocationData {
    private static final int ALTITUDE_INDEX = 2;
    public static final double ALTITUDE_UNAVAILABLE = Double.NaN;
    private static final int BEARING_INDEX = 3;
    public static final double BEARING_UNAVAILABLE = Double.NaN;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int LATITUDE_INDEX = 0;
    private static final int LONGITUDE_INDEX = 1;
    private static final double MAX_LATITUDE = 90.0d;
    private static final double MAX_LONGITUDE = 180.0d;
    private static final int MIN_COUNT = 2;
    private static final double MIN_LATITUDE = -90.0d;
    private static final double MIN_LONGITUDE = -180.0d;
    private static final int SPEED_INDEX = 4;
    public static final double SPEED_UNAVAILABLE = Double.NaN;
    private static final int STATE_INDEX = 5;
    public static final int STATE_INVALID = 0;
    public static final int STATE_UNKNOWN = -1;
    public static final int STATE_VALID = 1;

    @NotNull
    private static final String TAG = "LocationData";
    private final double altitude;
    private final double bearing;
    private final double latitude;
    private final double longitude;
    private final double speed;
    private final int state;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/oplus/ocs/wearengine/data/LocationData$Companion;", "", "()V", "ALTITUDE_INDEX", "", "ALTITUDE_UNAVAILABLE", "", "BEARING_INDEX", "BEARING_UNAVAILABLE", "LATITUDE_INDEX", "LONGITUDE_INDEX", "MAX_LATITUDE", "MAX_LONGITUDE", "MIN_COUNT", "MIN_LATITUDE", "MIN_LONGITUDE", "SPEED_INDEX", "SPEED_UNAVAILABLE", "STATE_INDEX", "STATE_INVALID", "STATE_UNKNOWN", "STATE_VALID", "TAG", "", "fromDataProtoValue", "Lcom/oplus/ocs/wearengine/data/LocationData;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$Value;", "fromDataProtoValue$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocationData fromDataProtoValue$thirdparty_impl_release(@NotNull DataProto$Value proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            if (proto.getDoubleArrayVal().getDoubleArrayCount() >= 2) {
                return new LocationData(proto.getDoubleArrayVal().getDoubleArray(0), proto.getDoubleArrayVal().getDoubleArray(1), proto.getDoubleArrayVal().getDoubleArrayCount() > 2 ? proto.getDoubleArrayVal().getDoubleArray(2) : Double.NaN, proto.getDoubleArrayVal().getDoubleArrayCount() > 3 ? proto.getDoubleArrayVal().getDoubleArray(3) : Double.NaN, proto.getDoubleArrayVal().getDoubleArrayCount() > 4 ? proto.getDoubleArrayVal().getDoubleArray(4) : Double.NaN, (proto.getDoubleArrayVal().getDoubleArrayCount() > 5 ? Double.valueOf(proto.getDoubleArrayVal().getDoubleArray(5)) : -1).intValue());
            }
            throw new IllegalArgumentException("fromDataProtoValue error,  doubleArrayCount:  " + proto + ".doubleArrayVal.doubleArrayCount ");
        }
    }

    public LocationData(@FloatRange(from = MIN_LATITUDE, to = MAX_LATITUDE) double d, @FloatRange(from = MIN_LONGITUDE, to = MAX_LONGITUDE) double d2, double d3, double d4, double d5, int i) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.bearing = d4;
        this.speed = d5;
        this.state = i;
        if (!(MIN_LATITUDE <= d && d <= MAX_LATITUDE)) {
            Log.w(TAG, "latitude value " + d + " is out of range");
        }
        if (MIN_LONGITUDE <= d2 && d2 <= MAX_LONGITUDE) {
            return;
        }
        Log.w(TAG, "longitude value " + d2 + " is out of range");
    }

    public final void addToValueProtoBuilder$thirdparty_impl_release(@NotNull DataProto$Value.Builder proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DataProto$Value.DoubleArray.Builder builderNewBuilder = DataProto$Value.DoubleArray.newBuilder();
        builderNewBuilder.addDoubleArray(this.latitude);
        builderNewBuilder.addDoubleArray(this.longitude);
        builderNewBuilder.addDoubleArray(this.altitude);
        builderNewBuilder.addDoubleArray(this.bearing);
        builderNewBuilder.addDoubleArray(this.speed);
        builderNewBuilder.addDoubleArray(this.state);
        proto.setDoubleArrayVal(builderNewBuilder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) other;
        if (!(this.latitude == locationData.latitude)) {
            return false;
        }
        if (!(this.longitude == locationData.longitude)) {
            return false;
        }
        if (!(this.altitude == locationData.altitude)) {
            return false;
        }
        if (this.bearing == locationData.bearing) {
            return ((this.speed > locationData.speed ? 1 : (this.speed == locationData.speed ? 0 : -1)) == 0) && this.state == locationData.state;
        }
        return false;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getBearing() {
        return this.bearing;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.altitude)) * 31) + Double.hashCode(this.bearing)) * 31) + Double.hashCode(this.speed)) * 31) + Integer.hashCode(this.state);
    }

    @NotNull
    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", bearing=" + this.bearing + " speed=" + this.speed + " state=" + this.state + ")";
    }

    public /* synthetic */ LocationData(double d, double d2, double d3, double d4, double d5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i2 & 4) != 0 ? Double.NaN : d3, (i2 & 8) != 0 ? Double.NaN : d4, (i2 & 16) != 0 ? Double.NaN : d5, (i2 & 32) != 0 ? -1 : i);
    }
}
