package com.amap.api.services.routepoisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class RoutePOIItem implements Parcelable {
    public static final Parcelable.Creator<RoutePOIItem> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f1076c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1077e;
    private String f;

    public static class a implements Parcelable.Creator<RoutePOIItem> {
        public static RoutePOIItem a(Parcel parcel) {
            return new RoutePOIItem(parcel);
        }

        public static RoutePOIItem[] b(int i) {
            return new RoutePOIItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePOIItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePOIItem[] newArray(int i) {
            return b(i);
        }
    }

    public RoutePOIItem() {
    }

    public RoutePOIItem(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1076c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readFloat();
        this.f1077e = parcel.readFloat();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCPID() {
        return this.f;
    }

    public float getDistance() {
        return this.d;
    }

    public float getDuration() {
        return this.f1077e;
    }

    public String getID() {
        return this.a;
    }

    public LatLonPoint getPoint() {
        return this.f1076c;
    }

    public String getTitle() {
        return this.b;
    }

    public void setCPID(String str) {
        this.f = str;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setDuration(float f) {
        this.f1077e = f;
    }

    public void setID(String str) {
        this.a = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f1076c = latLonPoint;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.f1076c, i);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.f1077e);
        parcel.writeString(this.f);
    }
}
