package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class TaxiItem implements Parcelable {
    public static final Parcelable.Creator<TaxiItem> CREATOR = new a();
    private LatLonPoint a;
    private LatLonPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1061c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1062e;
    private String f;

    public static class a implements Parcelable.Creator<TaxiItem> {
        public static TaxiItem a(Parcel parcel) {
            return new TaxiItem(parcel);
        }

        public static TaxiItem[] b(int i) {
            return new TaxiItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaxiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaxiItem[] newArray(int i) {
            return b(i);
        }
    }

    public TaxiItem() {
    }

    public TaxiItem(Parcel parcel) {
        this.a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f1061c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f1062e = parcel.readString();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.b;
    }

    public float getDistance() {
        return this.f1061c;
    }

    public float getDuration() {
        return this.d;
    }

    public LatLonPoint getOrigin() {
        return this.a;
    }

    public String getmSname() {
        return this.f1062e;
    }

    public String getmTname() {
        return this.f;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setDistance(float f) {
        this.f1061c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.a = latLonPoint;
    }

    public void setSname(String str) {
        this.f1062e = str;
    }

    public void setTname(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloat(this.f1061c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.f1062e);
        parcel.writeString(this.f);
    }
}
