package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class PoiItem implements Parcelable {
    public static final Parcelable.Creator<PoiItem> CREATOR = new Parcelable.Creator<PoiItem>() { // from class: com.amap.api.fence.PoiItem.1
        private static PoiItem a(Parcel parcel) {
            return new PoiItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItem[] newArray(int i) {
            return a(i);
        }

        private static PoiItem[] a(int i) {
            return new PoiItem[i];
        }
    };
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f875c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f876e;
    private double f;
    private double g;
    private String h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f877j;
    private String k;

    public PoiItem() {
        this.a = "";
        this.b = "";
        this.f875c = "";
        this.d = "";
        this.f876e = "";
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = "";
        this.i = "";
        this.f877j = "";
        this.k = "";
    }

    public static Parcelable.Creator<PoiItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f876e;
    }

    public String getAdname() {
        return this.k;
    }

    public String getCity() {
        return this.f877j;
    }

    public double getLatitude() {
        return this.f;
    }

    public double getLongitude() {
        return this.g;
    }

    public String getPoiId() {
        return this.b;
    }

    public String getPoiName() {
        return this.a;
    }

    public String getPoiType() {
        return this.f875c;
    }

    public String getProvince() {
        return this.i;
    }

    public String getTel() {
        return this.h;
    }

    public String getTypeCode() {
        return this.d;
    }

    public void setAddress(String str) {
        this.f876e = str;
    }

    public void setAdname(String str) {
        this.k = str;
    }

    public void setCity(String str) {
        this.f877j = str;
    }

    public void setLatitude(double d) {
        this.f = d;
    }

    public void setLongitude(double d) {
        this.g = d;
    }

    public void setPoiId(String str) {
        this.b = str;
    }

    public void setPoiName(String str) {
        this.a = str;
    }

    public void setPoiType(String str) {
        this.f875c = str;
    }

    public void setProvince(String str) {
        this.i = str;
    }

    public void setTel(String str) {
        this.h = str;
    }

    public void setTypeCode(String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f875c);
        parcel.writeString(this.d);
        parcel.writeString(this.f876e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f877j);
        parcel.writeString(this.k);
    }

    public PoiItem(Parcel parcel) {
        this.a = "";
        this.b = "";
        this.f875c = "";
        this.d = "";
        this.f876e = "";
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = "";
        this.i = "";
        this.f877j = "";
        this.k = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f875c = parcel.readString();
        this.d = parcel.readString();
        this.f876e = parcel.readString();
        this.f = parcel.readDouble();
        this.g = parcel.readDouble();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f877j = parcel.readString();
        this.k = parcel.readString();
    }
}
