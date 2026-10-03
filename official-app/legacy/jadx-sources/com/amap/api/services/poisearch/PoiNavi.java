package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class PoiNavi implements Parcelable {
    public static final Parcelable.Creator<PoiNavi> CREATOR = new a();
    private String a;
    private LatLonPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f986c;
    private String d;

    public static class a implements Parcelable.Creator<PoiNavi> {
        public static PoiNavi a(Parcel parcel) {
            return new PoiNavi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiNavi createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PoiNavi[] newArray(int i) {
            return null;
        }
    }

    public PoiNavi() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getEnter() {
        return this.b;
    }

    public LatLonPoint getExit() {
        return this.f986c;
    }

    public String getGridCode() {
        return this.d;
    }

    public String getNaviPoiID() {
        return this.a;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.f986c = latLonPoint;
    }

    public void setGridCode(String str) {
        this.d = str;
    }

    public void setNaviPoiID(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.f986c);
        parcel.writeString(this.d);
    }

    public PoiNavi(String str, LatLonPoint latLonPoint, LatLonPoint latLonPoint2, String str2) {
        this.a = str;
        this.b = latLonPoint;
        this.f986c = latLonPoint2;
        this.d = str2;
    }

    public PoiNavi(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f986c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
    }
}
