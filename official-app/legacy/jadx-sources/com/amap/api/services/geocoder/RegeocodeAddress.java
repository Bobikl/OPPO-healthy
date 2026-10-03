package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.road.Road;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class RegeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<RegeocodeAddress> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f970c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f971e;
    private String f;
    private String g;
    private StreetNumber h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f972j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<RegeocodeRoad> f973l;
    private List<Crossroad> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<PoiItem> f974n;
    private List<BusinessArea> o;
    private List<AoiItem> p;
    private String q;
    private String r;

    public static class a implements Parcelable.Creator<RegeocodeAddress> {
        public static RegeocodeAddress a(Parcel parcel) {
            return new RegeocodeAddress(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegeocodeAddress createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegeocodeAddress[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ RegeocodeAddress(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAdCode() {
        return this.f972j;
    }

    public final List<AoiItem> getAois() {
        return this.p;
    }

    public final String getBuilding() {
        return this.g;
    }

    public final List<BusinessArea> getBusinessAreas() {
        return this.o;
    }

    public final String getCity() {
        return this.f970c;
    }

    public final String getCityCode() {
        return this.i;
    }

    public final String getCountry() {
        return this.q;
    }

    public final String getCountryCode() {
        return this.r;
    }

    public final List<Crossroad> getCrossroads() {
        return this.m;
    }

    public final String getDistrict() {
        return this.d;
    }

    public final String getFormatAddress() {
        return this.a;
    }

    public final String getNeighborhood() {
        return this.f;
    }

    public final List<PoiItem> getPois() {
        return this.f974n;
    }

    public final String getProvince() {
        return this.b;
    }

    public final List<RegeocodeRoad> getRoads() {
        return this.f973l;
    }

    public final StreetNumber getStreetNumber() {
        return this.h;
    }

    public final String getTowncode() {
        return this.k;
    }

    public final String getTownship() {
        return this.f971e;
    }

    public final void setAdCode(String str) {
        this.f972j = str;
    }

    public final void setAois(List<AoiItem> list) {
        this.p = list;
    }

    public final void setBuilding(String str) {
        this.g = str;
    }

    public final void setBusinessAreas(List<BusinessArea> list) {
        this.o = list;
    }

    public final void setCity(String str) {
        this.f970c = str;
    }

    public final void setCityCode(String str) {
        this.i = str;
    }

    public final void setCountry(String str) {
        this.q = str;
    }

    public final void setCountryCode(String str) {
        this.r = str;
    }

    public final void setCrossroads(List<Crossroad> list) {
        this.m = list;
    }

    public final void setDistrict(String str) {
        this.d = str;
    }

    public final void setFormatAddress(String str) {
        this.a = str;
    }

    public final void setNeighborhood(String str) {
        this.f = str;
    }

    public final void setPois(List<PoiItem> list) {
        this.f974n = list;
    }

    public final void setProvince(String str) {
        this.b = str;
    }

    public final void setRoads(List<RegeocodeRoad> list) {
        this.f973l = list;
    }

    public final void setStreetNumber(StreetNumber streetNumber) {
        this.h = streetNumber;
    }

    public final void setTowncode(String str) {
        this.k = str;
    }

    public final void setTownship(String str) {
        this.f971e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f970c);
        parcel.writeString(this.d);
        parcel.writeString(this.f971e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeValue(this.h);
        parcel.writeList(this.f973l);
        parcel.writeList(this.m);
        parcel.writeList(this.f974n);
        parcel.writeString(this.i);
        parcel.writeString(this.f972j);
        parcel.writeList(this.o);
        parcel.writeList(this.p);
        parcel.writeString(this.k);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
    }

    public RegeocodeAddress() {
        this.f973l = new ArrayList();
        this.m = new ArrayList();
        this.f974n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
    }

    private RegeocodeAddress(Parcel parcel) {
        this.f973l = new ArrayList();
        this.m = new ArrayList();
        this.f974n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f970c = parcel.readString();
        this.d = parcel.readString();
        this.f971e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = (StreetNumber) parcel.readValue(StreetNumber.class.getClassLoader());
        this.f973l = parcel.readArrayList(Road.class.getClassLoader());
        this.m = parcel.readArrayList(Crossroad.class.getClassLoader());
        this.f974n = parcel.readArrayList(PoiItem.class.getClassLoader());
        this.i = parcel.readString();
        this.f972j = parcel.readString();
        this.o = parcel.readArrayList(BusinessArea.class.getClassLoader());
        this.p = parcel.readArrayList(AoiItem.class.getClassLoader());
        this.k = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
    }
}
