package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$BusRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$BusRouteQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1034c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1035e;
    private String f;

    public static class a implements Parcelable.Creator<RouteSearch$BusRouteQuery> {
        public static RouteSearch$BusRouteQuery a(Parcel parcel) {
            return new RouteSearch$BusRouteQuery(parcel);
        }

        public static RouteSearch$BusRouteQuery[] b(int i) {
            return new RouteSearch$BusRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$BusRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$BusRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$BusRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i, String str, int i2) {
        this.f = "base";
        this.a = routeSearch$FromAndTo;
        this.b = i;
        this.f1034c = str;
        this.f1035e = i2;
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
        RouteSearch$BusRouteQuery routeSearch$BusRouteQuery = (RouteSearch$BusRouteQuery) obj;
        String str = this.f1034c;
        if (str == null) {
            if (routeSearch$BusRouteQuery.f1034c != null) {
                return false;
            }
        } else if (!str.equals(routeSearch$BusRouteQuery.f1034c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (routeSearch$BusRouteQuery.d != null) {
                return false;
            }
        } else if (!str2.equals(routeSearch$BusRouteQuery.d)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null) {
            if (routeSearch$BusRouteQuery.f != null) {
                return false;
            }
        } else if (!str3.equals(routeSearch$BusRouteQuery.f)) {
            return false;
        }
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        if (routeSearch$FromAndTo == null) {
            if (routeSearch$BusRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearch$FromAndTo.equals(routeSearch$BusRouteQuery.a)) {
            return false;
        }
        return this.b == routeSearch$BusRouteQuery.b && this.f1035e == routeSearch$BusRouteQuery.f1035e;
    }

    public String getCity() {
        return this.f1034c;
    }

    public String getCityd() {
        return this.d;
    }

    public String getExtensions() {
        return this.f;
    }

    public RouteSearch$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getMode() {
        return this.b;
    }

    public int getNightFlag() {
        return this.f1035e;
    }

    public int hashCode() {
        String str = this.f1034c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        int iHashCode2 = (((((iHashCode + (routeSearch$FromAndTo == null ? 0 : routeSearch$FromAndTo.hashCode())) * 31) + this.b) * 31) + this.f1035e) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setCityd(String str) {
        this.d = str;
    }

    public void setExtensions(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.f1034c);
        parcel.writeInt(this.f1035e);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$BusRouteQuery m4486clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "BusRouteQueryclone");
        }
        RouteSearch$BusRouteQuery routeSearch$BusRouteQuery = new RouteSearch$BusRouteQuery(this.a, this.b, this.f1034c, this.f1035e);
        routeSearch$BusRouteQuery.setCityd(this.d);
        routeSearch$BusRouteQuery.setExtensions(this.f);
        return routeSearch$BusRouteQuery;
    }

    public RouteSearch$BusRouteQuery(Parcel parcel) {
        this.f = "base";
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1034c = parcel.readString();
        this.f1035e = parcel.readInt();
        this.d = parcel.readString();
        this.f = parcel.readString();
    }

    public RouteSearch$BusRouteQuery() {
        this.f = "base";
    }
}
