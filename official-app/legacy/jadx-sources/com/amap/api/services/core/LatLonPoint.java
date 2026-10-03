package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new a();
    private double a;
    private double b;

    public static class a implements Parcelable.Creator<LatLonPoint> {
        public static LatLonPoint a(Parcel parcel) {
            return new LatLonPoint(parcel);
        }

        public static LatLonPoint[] b(int i) {
            return new LatLonPoint[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonPoint[] newArray(int i) {
            return b(i);
        }
    }

    public LatLonPoint(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(latLonPoint.a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(latLonPoint.b);
    }

    public double getLatitude() {
        return this.a;
    }

    public double getLongitude() {
        return this.b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public void setLatitude(double d) {
        this.a = d;
    }

    public void setLongitude(double d) {
        this.b = d;
    }

    public String toString() {
        return this.a + "," + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }

    public LatLonPoint(Parcel parcel) {
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
