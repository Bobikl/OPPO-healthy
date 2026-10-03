package com.heytap.store.platform.location;

import com.heytap.store.platform.location.base.entity.LocationInfo;

/* JADX INFO: loaded from: classes6.dex */
public class CoordinateConverterUtil {
    private static double a = 6378245.0d;
    private static double ee = 0.006693421622965943d;

    public static boolean outOfChina(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    public static LocationInfo transformFromWGSToGCJ(LocationInfo locationInfo) {
        double dTransformLat = transformLat(locationInfo.getLongitude() - 105.0d, locationInfo.getLatitude() - 35.0d);
        double dTransformLon = transformLon(locationInfo.getLongitude() - 105.0d, locationInfo.getLatitude() - 35.0d);
        double latitude = (locationInfo.getLatitude() / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(latitude);
        double d = 1.0d - ((ee * dSin) * dSin);
        double dSqrt = Math.sqrt(d);
        double d2 = a;
        double d3 = (dTransformLat * 180.0d) / ((((1.0d - ee) * d2) / (d * dSqrt)) * 3.141592653589793d);
        double dCos = (dTransformLon * 180.0d) / (((d2 / dSqrt) * Math.cos(latitude)) * 3.141592653589793d);
        LocationInfo locationInfo2 = new LocationInfo();
        locationInfo2.setLatitude(locationInfo.getLatitude() + d3);
        locationInfo2.setLongitude(locationInfo.getLongitude() + dCos);
        return locationInfo2;
    }

    public static double transformLat(double d, double d2) {
        double d3 = d * 2.0d;
        double d4 = d2 * 3.141592653589793d;
        return (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(d > 0.0d ? d : -d) * 0.2d) + ((((Math.sin((d * 6.0d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double transformLon(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(d > 0.0d ? d : -d) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }
}
