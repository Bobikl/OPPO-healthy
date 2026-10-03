package com.lifesense.device.scale.application.interfaces.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class SportsAlgorithm {
    public static double calEx(double d, double d2) {
        double d3;
        double d4;
        if (d <= 88.0d) {
            return 0.0d;
        }
        if (d > 88.0d && d <= 113.0d) {
            d3 = (d - 88.0d) * d2;
            d4 = 0.5d;
        } else if (d <= 113.0d || d > 126.0d) {
            d3 = (d - 126.0d) * d2;
            d4 = 4.0d;
        } else {
            d3 = (d - 113.0d) * d2;
            d4 = 3.0d;
        }
        return d3 + d4;
    }

    public static float calK(double d) {
        if (d <= 88.0d) {
            return 0.0f;
        }
        if (d > 88.0d && d <= 113.0d) {
            return 0.06f;
        }
        if (d > 113.0d && d <= 126.0d) {
            return 0.05f;
        }
        if (d > 126.0d && d <= 135.0d) {
            return 0.09f;
        }
        if (d <= 135.0d || d > 145.0d) {
            return (d <= 145.0d || d > 165.0d) ? 0.12f : 0.11f;
        }
        return 0.1f;
    }

    public static double calT(int i, int i2, int i3) {
        return (((double) i2) * 1.0d * 3.0d) + (((((double) i) * 1.0d) - 1000.0d) / 40.0d);
    }

    public static double getCalorie(double d, int i, int i2, int i3) {
        if (i3 < 20) {
            i3 = 20;
        }
        double dCalT = calT(i * 10, i2, i3);
        return ((d * 1.05d) * calEx(dCalT, calK(dCalT))) / 180.0d;
    }

    public static double getCalorieForData(double d, int i, int i2, int i3) {
        if (i3 == 0) {
            return 0.0d;
        }
        int i4 = (i2 * 20) / i3;
        if (i4 < 30) {
            i4 = 30;
        }
        double calorie = getCalorie(d, i, i4, 20);
        int i5 = i2 / i4;
        getCalorie(d, i, i2 % i4, 20);
        return calorie * ((double) i5);
    }

    public static double getMileage(int i, int i2, int i3) {
        double d;
        double d2;
        if (i3 < 20) {
            i3 = 20;
        }
        double d3 = i2;
        float f = (float) (d3 / ((((double) i3) * 1.0d) / 60.0d));
        double d4 = ((double) (i * 10)) * 0.4d;
        if (f >= 102.0f) {
            if (f >= 102.0f && f < 132.0f) {
                d = d4 * ((double) f);
                d2 = 100.0d;
            } else if (f < 132.0f || f >= 159.0f) {
                d4 *= 1.5d;
            } else {
                d = d4 * ((double) f);
                d2 = 105.0d;
            }
            d4 = d / d2;
        }
        return (d3 * d4) / 1000.0d;
    }
}
