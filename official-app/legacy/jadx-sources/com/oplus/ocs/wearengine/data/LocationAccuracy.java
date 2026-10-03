package com.oplus.ocs.wearengine.data;

import android.util.Log;
import androidx.annotation.FloatRange;
import com.oplus.ocs.wearengine.proto.DataProto$DataPointAccuracy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\r\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/oplus/ocs/wearengine/data/LocationAccuracy;", "Lcom/oplus/ocs/wearengine/data/DataPointAccuracy;", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$DataPointAccuracy;", "(Lcom/oplus/ocs/wearengine/proto/DataProto$DataPointAccuracy;)V", "horizontalPositionErrorMeters", "", "verticalPositionErrorMeters", "(DD)V", "getHorizontalPositionErrorMeters", "()D", "getVerticalPositionErrorMeters", "getDataPointAccuracyProto", "getDataPointAccuracyProto$thirdparty_impl_release", "toString", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocationAccuracy extends DataPointAccuracy {

    @NotNull
    private static final String TAG = "LocationAccuracy";
    private final double horizontalPositionErrorMeters;
    private final double verticalPositionErrorMeters;

    public /* synthetic */ LocationAccuracy(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? Double.MAX_VALUE : d2);
    }

    @NotNull
    public final DataProto$DataPointAccuracy getDataPointAccuracyProto$thirdparty_impl_release() {
        DataProto$DataPointAccuracy dataProto$DataPointAccuracyBuild = DataProto$DataPointAccuracy.newBuilder().setLocationAccuracy(DataProto$DataPointAccuracy.LocationAccuracy.newBuilder().setHorizontalPositionError(this.horizontalPositionErrorMeters).setVerticalPositionError(this.verticalPositionErrorMeters)).build();
        Intrinsics.checkNotNullExpressionValue(dataProto$DataPointAccuracyBuild, "newBuilder()\n           …der)\n            .build()");
        return dataProto$DataPointAccuracyBuild;
    }

    public final double getHorizontalPositionErrorMeters() {
        return this.horizontalPositionErrorMeters;
    }

    public final double getVerticalPositionErrorMeters() {
        return this.verticalPositionErrorMeters;
    }

    @NotNull
    public String toString() {
        return "LocationAccuracy(horizontalPositionErrorMeters=" + this.horizontalPositionErrorMeters + ",verticalPositionErrorMeters=" + this.verticalPositionErrorMeters + ")";
    }

    public LocationAccuracy(@FloatRange(from = 0.0d) double d, @FloatRange(from = 0.0d) double d2) {
        this.horizontalPositionErrorMeters = d;
        this.verticalPositionErrorMeters = d2;
        if (d < 0.0d) {
            Log.w(TAG, "horizontalPositionErrorMeters value " + d + " is out of range");
        }
        if (d2 < 0.0d) {
            Log.w(TAG, "verticalPositionErrorMeters value " + d2 + " is out of range");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationAccuracy(@NotNull DataProto$DataPointAccuracy proto) {
        this(proto.getLocationAccuracy().getHorizontalPositionError(), proto.getLocationAccuracy().getVerticalPositionError());
        Intrinsics.checkNotNullParameter(proto, "proto");
    }
}
