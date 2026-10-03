package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class Road implements Parcelable {
    public static final Parcelable.Creator<Road> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f993c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f994e;
    private LatLonPoint f;

    public static class a implements Parcelable.Creator<Road> {
        public static Road a(Parcel parcel) {
            return new Road(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Road createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Road[] newArray(int i) {
            return null;
        }
    }

    public Road() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f;
    }

    public String getCityCode() {
        return this.f993c;
    }

    public String getId() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public float getRoadWidth() {
        return this.d;
    }

    public String getType() {
        return this.f994e;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f = latLonPoint;
    }

    public void setCityCode(String str) {
        this.f993c = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setRoadWidth(float f) {
        this.d = f;
    }

    public void setType(String str) {
        this.f994e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f993c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.f994e);
        parcel.writeValue(this.f);
    }

    public Road(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public Road(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f993c = parcel.readString();
        this.d = parcel.readFloat();
        this.f994e = parcel.readString();
        this.f = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
