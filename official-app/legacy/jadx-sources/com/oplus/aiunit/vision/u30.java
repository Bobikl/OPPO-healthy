package com.oplus.aiunit.vision;

import android.graphics.Point;

/* JADX INFO: loaded from: classes16.dex */
public class u30 {
    public static long a(float f, float f2) {
        Point point = new Point(0, 0);
        Point point2 = new Point(Math.round(f), 0);
        Point point3 = new Point(Math.round(f), Math.round(f2));
        double dSqrt = Math.sqrt(Math.pow(point.x - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d));
        double dSqrt2 = Math.sqrt(Math.pow(point.x - point3.x, 2.0d) + Math.pow(point.y - point3.y, 2.0d));
        return (180 - Math.round((Math.acos(((Math.pow(dSqrt, 2.0d) + Math.pow(dSqrt2, 2.0d)) - Math.pow(Math.sqrt(Math.pow(point2.x - point3.x, 2.0d) + Math.pow(point2.y - point3.y, 2.0d)), 2.0d)) / ((dSqrt * 2.0d) * dSqrt2)) * 180.0d) / 3.141592653589793d)) - 90;
    }
}
