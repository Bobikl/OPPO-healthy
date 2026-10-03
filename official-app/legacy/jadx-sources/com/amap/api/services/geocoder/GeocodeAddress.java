package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f966c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f967e;
    private String f;
    private String g;
    private String h;
    private LatLonPoint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f968j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f969l;

    public static class a implements Parcelable.Creator<GeocodeAddress> {
        public static GeocodeAddress a(Parcel parcel) {
            return new GeocodeAddress(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeocodeAddress createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeocodeAddress[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ GeocodeAddress(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAdcode() {
        return this.h;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final String getCity() {
        return this.f966c;
    }

    public final String getCountry() {
        return this.k;
    }

    public final String getDistrict() {
        return this.d;
    }

    public final String getFormatAddress() {
        return this.a;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.i;
    }

    public final String getLevel() {
        return this.f968j;
    }

    public final String getNeighborhood() {
        return this.f;
    }

    public final String getPostcode() {
        return this.f969l;
    }

    public final String getProvince() {
        return this.b;
    }

    public final String getTownship() {
        return this.f967e;
    }

    public final void setAdcode(String str) {
        this.h = str;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setCity(String str) {
        this.f966c = str;
    }

    public final void setCountry(String str) {
        this.k = str;
    }

    public final void setDistrict(String str) {
        this.d = str;
    }

    public final void setFormatAddress(String str) {
        this.a = str;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.i = latLonPoint;
    }

    public final void setLevel(String str) {
        this.f968j = str;
    }

    public final void setNeighborhood(String str) {
        this.f = str;
    }

    public final void setPostcode(String str) {
        this.f969l = str;
    }

    public final void setProvince(String str) {
        this.b = str;
    }

    public final void setTownship(String str) {
        this.f967e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f966c);
        parcel.writeString(this.d);
        parcel.writeString(this.f967e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.i);
        parcel.writeString(this.f968j);
        parcel.writeString(this.k);
        parcel.writeString(this.f969l);
    }

    public GeocodeAddress() {
    }

    private GeocodeAddress(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f966c = parcel.readString();
        this.d = parcel.readString();
        this.f967e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f968j = parcel.readString();
        this.k = parcel.readString();
        this.f969l = parcel.readString();
    }
}
