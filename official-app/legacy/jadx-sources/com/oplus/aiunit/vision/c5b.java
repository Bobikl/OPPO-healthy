package com.oplus.aiunit.vision;

import com.amap.api.location.AMapLocation;
import com.heytap.health.location.HMapLocation;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/amap/api/location/AMapLocation;", "Lcom/heytap/health/location/HMapLocation;", "a", "location_impl_release"}, k = 2, mv = {1, 8, 0})
public final class c5b {
    @NotNull
    public static final HMapLocation a(@NotNull AMapLocation aMapLocation) {
        Intrinsics.checkNotNullParameter(aMapLocation, "<this>");
        HMapLocation hMapLocation = new HMapLocation();
        hMapLocation.setLatitude(aMapLocation.getLatitude());
        hMapLocation.setLongitude(aMapLocation.getLongitude());
        hMapLocation.setGpsAccuracyStatus(aMapLocation.getGpsAccuracyStatus());
        hMapLocation.setBearing(aMapLocation.getBearing());
        hMapLocation.setSpeed(aMapLocation.getSpeed());
        hMapLocation.setConScenario(aMapLocation.getConScenario());
        hMapLocation.setAccuracy(aMapLocation.getAccuracy());
        hMapLocation.setCity(aMapLocation.getCity());
        hMapLocation.setDistrict(aMapLocation.getDistrict());
        hMapLocation.setAdCode(aMapLocation.getAdCode());
        hMapLocation.setLocType(aMapLocation.getLocationType());
        hMapLocation.setProvince(aMapLocation.getProvince());
        hMapLocation.setAddrStr(aMapLocation.getAddress());
        hMapLocation.setErrorCode(aMapLocation.getErrorCode());
        hMapLocation.setCoordType(aMapLocation.getCoordType());
        hMapLocation.setDescription(aMapLocation.getDescription());
        hMapLocation.setTime(aMapLocation.getTime());
        return hMapLocation;
    }
}
