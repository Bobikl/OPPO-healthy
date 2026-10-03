package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new a();
    private String a;
    private LatLonPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f979c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f980e;
    private String f;
    private String g;
    private String h;

    public static class a implements Parcelable.Creator<Tip> {
        public static Tip a(Parcel parcel) {
            return new Tip(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Tip createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Tip[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ Tip(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.f980e;
    }

    public String getAddress() {
        return this.f;
    }

    public String getDistrict() {
        return this.d;
    }

    public String getName() {
        return this.f979c;
    }

    public String getPoiID() {
        return this.a;
    }

    public LatLonPoint getPoint() {
        return this.b;
    }

    public String getTypeCode() {
        return this.g;
    }

    public void setAdcode(String str) {
        this.f980e = str;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setID(String str) {
        this.a = str;
    }

    public void setName(String str) {
        this.f979c = str;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setTypeCode(String str) {
        this.g = str;
    }

    public String toString() {
        return "name:" + this.f979c + " district:" + this.d + " adcode:" + this.f980e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f979c);
        parcel.writeString(this.f980e);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public Tip() {
        this.h = "";
    }

    private Tip(Parcel parcel) {
        this.h = "";
        this.f979c = parcel.readString();
        this.f980e = parcel.readString();
        this.d = parcel.readString();
        this.a = parcel.readString();
        this.b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
