package com.heytap.store.platform.location;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.heytap.store.platform.location.AndroidLocation$locationListener$1;
import com.heytap.store.platform.location.base.entity.LocationInfo;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\n\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/heytap/store/platform/location/AndroidLocation$locationListener$1", "Landroid/location/LocationListener;", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", BridgeConstant.KEY_EXTRAS, "Landroid/os/Bundle;", "locationdomestic_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AndroidLocation$locationListener$1 implements LocationListener {
    final /* synthetic */ AndroidLocation this$0;

    public AndroidLocation$locationListener$1(AndroidLocation androidLocation) {
        this.this$0 = androidLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLocationChanged$lambda-0, reason: not valid java name */
    public static final void m5054onLocationChanged$lambda0(Location location, AndroidLocation this$0) {
        Intrinsics.checkNotNullParameter(location, "$location");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.setLatitude(location.getLatitude());
        locationInfo.setLongitude(location.getLongitude());
        try {
            List<Address> result = new Geocoder(this$0.context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            Intrinsics.checkNotNullExpressionValue(result, "result");
            Address address = result.isEmpty() ^ true ? result.get(0) : null;
            if (address != null) {
                locationInfo.setProvince(address.getAdminArea());
                locationInfo.setCity(address.getLocality());
            }
            LocationInfo locationInfoTransformFromWGSToGCJ = CoordinateConverterUtil.transformFromWGSToGCJ(locationInfo);
            locationInfo.setLatitude(locationInfoTransformFromWGSToGCJ.getLatitude());
            locationInfo.setLongitude(locationInfoTransformFromWGSToGCJ.getLongitude());
            com.heytap.store.platform.location.base.listener.LocationListener locationListener = this$0.locationCallBackListener;
            if (locationListener == null) {
                return;
            }
            locationListener.onSuccess(locationInfo);
        } catch (IOException unused) {
            com.heytap.store.platform.location.base.listener.LocationListener locationListener2 = this$0.locationCallBackListener;
            if (locationListener2 == null) {
                return;
            }
            locationListener2.onFailed(0, "");
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NotNull final Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        final AndroidLocation androidLocation = this.this$0;
        new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.t20
            @Override // java.lang.Runnable
            public final void run() {
                AndroidLocation$locationListener$1.m5054onLocationChanged$lambda0(location, androidLocation);
            }
        }).start();
        LocationManager locationManager = this.this$0.locationManager;
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(@NotNull String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        com.heytap.store.platform.location.base.listener.LocationListener locationListener = this.this$0.locationCallBackListener;
        if (locationListener == null) {
            return;
        }
        locationListener.onFailed(0, "");
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(@NotNull String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(@Nullable String provider, int status, @Nullable Bundle extras) {
    }
}
