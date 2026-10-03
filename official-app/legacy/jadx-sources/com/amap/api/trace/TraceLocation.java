package com.amap.api.trace;

/* JADX INFO: loaded from: classes12.dex */
public class TraceLocation {
    private double a;
    private double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1085c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1086e;

    public TraceLocation(double d, double d2, float f, float f2, long j2) {
        this.a = a(d);
        this.b = a(d2);
        this.f1085c = (int) ((f * 3600.0f) / 1000.0f);
        this.d = (int) f2;
        this.f1086e = j2;
    }

    private static double a(double d) {
        return Math.round(d * 1000000.0d) / 1000000.0d;
    }

    public TraceLocation copy() {
        TraceLocation traceLocation = new TraceLocation();
        traceLocation.d = this.d;
        traceLocation.a = this.a;
        traceLocation.b = this.b;
        traceLocation.f1085c = this.f1085c;
        traceLocation.f1086e = this.f1086e;
        return traceLocation;
    }

    public float getBearing() {
        return this.d;
    }

    public double getLatitude() {
        return this.a;
    }

    public double getLongitude() {
        return this.b;
    }

    public float getSpeed() {
        return this.f1085c;
    }

    public long getTime() {
        return this.f1086e;
    }

    public void setBearing(float f) {
        this.d = (int) f;
    }

    public void setLatitude(double d) {
        this.a = a(d);
    }

    public void setLongitude(double d) {
        this.b = a(d);
    }

    public void setSpeed(float f) {
        this.f1085c = (int) ((f * 3600.0f) / 1000.0f);
    }

    public void setTime(long j2) {
        this.f1086e = j2;
    }

    public String toString() {
        return this.a + ",longtitude " + this.b + ",speed " + this.f1085c + ",bearing " + this.d + ",time " + this.f1086e;
    }

    public TraceLocation() {
    }
}
