package com.heytap.store.platform.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationManager;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.location.base.ILocation;
import com.heytap.store.platform.location.base.config.BaseLocationConfig;
import com.heytap.store.platform.location.base.entity.LocationInfo;
import com.heytap.store.platform.location.base.listener.LocationListener;
import com.heytap.store.platform.location.p007const.RouterConstKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Route(path = RouterConstKt.SERVICE_PATH)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\b\u0010\u001f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/heytap/store/platform/location/AndroidLocation;", "Lcom/heytap/store/platform/location/base/ILocation;", "()V", "context", "Landroid/content/Context;", "locationCallBackListener", "Lcom/heytap/store/platform/location/base/listener/LocationListener;", "Lcom/heytap/store/platform/location/base/entity/LocationInfo;", "locationListener", "Landroid/location/LocationListener;", "locationManager", "Landroid/location/LocationManager;", "destroyLocation", "", "getCatchLocation", "getGoogleMapIntent", "Landroid/content/Intent;", "s", "", "s1", "init", "initLocation", "mContext", "config", "Lcom/heytap/store/platform/location/base/config/BaseLocationConfig;", "isLocationServiceOpen", "", "saveLocation", "locationInfo", "startLocation", "listener", "stopLocation", "locationdomestic_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AndroidLocation implements ILocation {

    @Nullable
    private Context context;

    @Nullable
    private LocationListener<LocationInfo> locationCallBackListener;

    @NotNull
    private final android.location.LocationListener locationListener = new AndroidLocation$locationListener$1(this);

    @Nullable
    private LocationManager locationManager;

    @Override // com.heytap.store.platform.location.base.ILocation
    public void destroyLocation() {
        LocationManager locationManager = this.locationManager;
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this.locationListener);
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    public void getCatchLocation(@Nullable LocationListener<LocationInfo> locationListener) {
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    @Nullable
    public Intent getGoogleMapIntent(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(s1, "s1");
        return null;
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        this.context = context;
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    public void initLocation(@NotNull Context mContext, @Nullable BaseLocationConfig config) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.context = this.context;
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    public boolean isLocationServiceOpen() {
        return false;
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    public void saveLocation(@Nullable LocationInfo locationInfo) {
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    @SuppressLint({"MissingPermission"})
    public void startLocation(@NotNull LocationListener<LocationInfo> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.locationCallBackListener = listener;
        new Criteria().setAccuracy(1);
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        Object systemService = context.getSystemService("location");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        LocationManager locationManager = (LocationManager) systemService;
        this.locationManager = locationManager;
        locationManager.requestLocationUpdates("network", 1000L, 0.0f, this.locationListener);
    }

    @Override // com.heytap.store.platform.location.base.ILocation
    public void stopLocation() {
    }
}
