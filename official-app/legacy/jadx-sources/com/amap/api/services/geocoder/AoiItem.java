package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class AoiItem implements Parcelable {
    public static final Parcelable.Creator<AoiItem> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f964c;
    private LatLonPoint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Float f965e;
    private float f;
    private String g;

    public static class a implements Parcelable.Creator<AoiItem> {
        public static AoiItem a(Parcel parcel) {
            return new AoiItem(parcel);
        }

        public static AoiItem[] b(int i) {
            return new AoiItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AoiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AoiItem[] newArray(int i) {
            return b(i);
        }
    }

    public AoiItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f964c;
    }

    public Float getAoiArea() {
        return this.f965e;
    }

    public LatLonPoint getAoiCenterPoint() {
        return this.d;
    }

    public String getAoiId() {
        return this.a;
    }

    public String getAoiName() {
        return this.b;
    }

    public float getDistance() {
        return this.f;
    }

    public String getType() {
        return this.g;
    }

    public void setAdcode(String str) {
        this.f964c = str;
    }

    public void setArea(Float f) {
        this.f965e = f;
    }

    public void setDistance(float f) {
        this.f = f;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setType(String str) {
        this.g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f964c);
        parcel.writeParcelable(this.d, i);
        parcel.writeFloat(this.f965e.floatValue());
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
    }

    public AoiItem(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f964c = parcel.readString();
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f965e = Float.valueOf(parcel.readFloat());
        this.f = parcel.readFloat();
        this.g = parcel.readString();
    }
}
