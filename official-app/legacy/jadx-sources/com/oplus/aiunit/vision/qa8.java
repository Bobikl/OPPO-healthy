package com.oplus.aiunit.vision;

import com.heytap.health.wallet.location.LatLngEntity;

/* JADX INFO: loaded from: classes18.dex */
public class qa8 {
    public static final double A = 6378245.0d;
    public static final double EE = 0.006693421622965943d;
    public static final double PI = 3.141592653589793d;

    public static LatLngEntity a(double d, double d2) {
        double d3 = d2 - 0.0065d;
        double d4 = d - 0.006d;
        double dSqrt = Math.sqrt((d3 * d3) + (d4 * d4)) - (Math.sin(d4 * 3.141592653589793d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d4, d3) - (Math.cos(d3 * 3.141592653589793d) * 3.0E-6d);
        return new LatLngEntity(dSqrt * Math.sin(dAtan2), Math.cos(dAtan2) * dSqrt);
    }

    public static LatLngEntity b(double d, double d2) {
        LatLngEntity latLngEntityA = a(d, d2);
        return d(latLngEntityA.latitude, latLngEntityA.longitude);
    }

    public static LatLngEntity c(double d, double d2) {
        double dSqrt = Math.sqrt((d2 * d2) + (d * d)) + (Math.sin(d * 3.141592653589793d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d, d2) + (Math.cos(d2 * 3.141592653589793d) * 3.0E-6d);
        return new LatLngEntity((dSqrt * Math.sin(dAtan2)) + 0.006d, (Math.cos(dAtan2) * dSqrt) + 0.0065d);
    }

    public static LatLngEntity d(double d, double d2) {
        LatLngEntity latLngEntityF = f(d, d2);
        return new LatLngEntity((d * 2.0d) - latLngEntityF.latitude, (d2 * 2.0d) - latLngEntityF.longitude);
    }

    public static boolean e(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    public static LatLngEntity f(double d, double d2) {
        if (e(d, d2)) {
            return new LatLngEntity(d, d2);
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double dG = g(d3, d4);
        double dH = h(d3, d4);
        double d5 = (d / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d5);
        double d6 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d6);
        return new LatLngEntity(d + ((dG * 180.0d) / ((6335552.717000426d / (d6 * dSqrt)) * 3.141592653589793d)), d2 + ((dH * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d5)) * 3.141592653589793d)));
    }

    public static double g(double d, double d2) {
        double d3 = d * 2.0d;
        double dSqrt = (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d4 = d2 * 3.141592653589793d;
        return dSqrt + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static double h(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }
}
