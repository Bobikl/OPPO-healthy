package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchV2$BusRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearchV2$BusRouteQuery> CREATOR = new a();
    private RouteSearchV2$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1047c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1048e;
    private String f;
    private int g;
    private String h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1049j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1050l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1051n;
    private int o;

    public static class a implements Parcelable.Creator<RouteSearchV2$BusRouteQuery> {
        public static RouteSearchV2$BusRouteQuery a(Parcel parcel) {
            return new RouteSearchV2$BusRouteQuery(parcel);
        }

        public static RouteSearchV2$BusRouteQuery[] b(int i) {
            return new RouteSearchV2$BusRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$BusRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$BusRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearchV2$BusRouteQuery(RouteSearchV2$FromAndTo routeSearchV2$FromAndTo, int i, String str, int i2) {
        this.f1050l = 5;
        this.m = 0;
        this.f1051n = 4;
        this.o = 1;
        this.a = routeSearchV2$FromAndTo;
        this.b = i;
        this.f1047c = str;
        this.g = i2;
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
        RouteSearchV2$BusRouteQuery routeSearchV2$BusRouteQuery = (RouteSearchV2$BusRouteQuery) obj;
        if (this.b == routeSearchV2$BusRouteQuery.b && this.g == routeSearchV2$BusRouteQuery.g && this.h.equals(routeSearchV2$BusRouteQuery.h) && this.i.equals(routeSearchV2$BusRouteQuery.i) && this.f1050l == routeSearchV2$BusRouteQuery.f1050l && this.m == routeSearchV2$BusRouteQuery.m && this.f1051n == routeSearchV2$BusRouteQuery.f1051n && this.o == routeSearchV2$BusRouteQuery.o && this.a.equals(routeSearchV2$BusRouteQuery.a) && this.f1047c.equals(routeSearchV2$BusRouteQuery.f1047c) && this.d.equals(routeSearchV2$BusRouteQuery.d) && this.f1048e.equals(routeSearchV2$BusRouteQuery.f1048e) && this.f.equals(routeSearchV2$BusRouteQuery.f) && this.f1049j.equals(routeSearchV2$BusRouteQuery.f1049j)) {
            return this.k.equals(routeSearchV2$BusRouteQuery.k);
        }
        return false;
    }

    public String getAd1() {
        return this.f1049j;
    }

    public String getAd2() {
        return this.k;
    }

    public int getAlternativeRoute() {
        return this.f1050l;
    }

    public String getCity() {
        return this.f1047c;
    }

    public String getCityd() {
        return this.d;
    }

    public String getDate() {
        return this.f1048e;
    }

    public String getDestinationPoiId() {
        return this.i;
    }

    public RouteSearchV2$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getMaxTrans() {
        return this.f1051n;
    }

    public int getMode() {
        return this.b;
    }

    public int getMultiExport() {
        return this.m;
    }

    public int getNightFlag() {
        return this.g;
    }

    public String getOriginPoiId() {
        return this.h;
    }

    public int getShowFields() {
        return this.o;
    }

    public String getTime() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.f1047c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f1048e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f1049j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f1050l) * 31) + this.m) * 31) + this.f1051n) * 31) + this.o;
    }

    public void setAd1(String str) {
        this.f1049j = str;
    }

    public void setAd2(String str) {
        this.k = str;
    }

    public void setAlternativeRoute(int i) {
        this.f1050l = i;
    }

    public void setCityd(String str) {
        this.d = str;
    }

    public void setDate(String str) {
        this.f1048e = str;
    }

    public void setDestinationPoiId(String str) {
        this.i = str;
    }

    public void setMaxTrans(int i) {
        this.f1051n = i;
    }

    public void setMultiExport(int i) {
        this.m = i;
    }

    public void setOriginPoiId(String str) {
        this.h = str;
    }

    public void setShowFields(int i) {
        this.o = i;
    }

    public void setTime(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.f1047c);
        parcel.writeInt(this.g);
        parcel.writeString(this.d);
        parcel.writeInt(this.o);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f1049j);
        parcel.writeString(this.k);
        parcel.writeInt(this.f1050l);
        parcel.writeInt(this.f1051n);
        parcel.writeInt(this.m);
        parcel.writeString(this.f1048e);
        parcel.writeString(this.f);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearchV2$BusRouteQuery m4493clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearchV2", "BusRouteQueryclone");
        }
        RouteSearchV2$BusRouteQuery routeSearchV2$BusRouteQuery = new RouteSearchV2$BusRouteQuery(this.a, this.b, this.f1047c, this.g);
        routeSearchV2$BusRouteQuery.setCityd(this.d);
        routeSearchV2$BusRouteQuery.setShowFields(this.o);
        routeSearchV2$BusRouteQuery.setDate(this.f1048e);
        routeSearchV2$BusRouteQuery.setTime(this.f);
        routeSearchV2$BusRouteQuery.setAd1(this.f1049j);
        routeSearchV2$BusRouteQuery.setAd2(this.k);
        routeSearchV2$BusRouteQuery.setOriginPoiId(this.h);
        routeSearchV2$BusRouteQuery.setDestinationPoiId(this.i);
        routeSearchV2$BusRouteQuery.setMaxTrans(this.f1051n);
        routeSearchV2$BusRouteQuery.setMultiExport(this.m);
        routeSearchV2$BusRouteQuery.setAlternativeRoute(this.f1050l);
        return routeSearchV2$BusRouteQuery;
    }

    public RouteSearchV2$BusRouteQuery(Parcel parcel) {
        this.b = 0;
        this.g = 0;
        this.f1050l = 5;
        this.m = 0;
        this.f1051n = 4;
        this.o = 1;
        this.a = (RouteSearchV2$FromAndTo) parcel.readParcelable(RouteSearchV2$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1047c = parcel.readString();
        this.g = parcel.readInt();
        this.d = parcel.readString();
        this.o = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f1048e = parcel.readString();
        this.f = parcel.readString();
        this.f1051n = parcel.readInt();
        this.m = parcel.readInt();
        this.f1050l = parcel.readInt();
        this.f1049j = parcel.readString();
        this.k = parcel.readString();
    }

    public RouteSearchV2$BusRouteQuery() {
        this.b = 0;
        this.g = 0;
        this.f1050l = 5;
        this.m = 0;
        this.f1051n = 4;
        this.o = 1;
    }
}
