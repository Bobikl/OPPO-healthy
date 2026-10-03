package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$RideRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$RideRouteQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1042c;

    public static class a implements Parcelable.Creator<RouteSearch$RideRouteQuery> {
        public static RouteSearch$RideRouteQuery a(Parcel parcel) {
            return new RouteSearch$RideRouteQuery(parcel);
        }

        public static RouteSearch$RideRouteQuery[] b(int i) {
            return new RouteSearch$RideRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$RideRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$RideRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$RideRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i) {
        this.f1042c = "base";
        this.a = routeSearch$FromAndTo;
        this.b = i;
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
        RouteSearch$RideRouteQuery routeSearch$RideRouteQuery = (RouteSearch$RideRouteQuery) obj;
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        if (routeSearch$FromAndTo == null) {
            if (routeSearch$RideRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearch$FromAndTo.equals(routeSearch$RideRouteQuery.a)) {
            return false;
        }
        return this.b == routeSearch$RideRouteQuery.b;
    }

    public String getExtensions() {
        return this.f1042c;
    }

    public RouteSearch$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getMode() {
        return this.b;
    }

    public int hashCode() {
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        return (((routeSearch$FromAndTo == null ? 0 : routeSearch$FromAndTo.hashCode()) + 31) * 31) + this.b;
    }

    public void setExtensions(String str) {
        this.f1042c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.f1042c);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$RideRouteQuery m4490clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "RideRouteQueryclone");
        }
        RouteSearch$RideRouteQuery routeSearch$RideRouteQuery = new RouteSearch$RideRouteQuery(this.a);
        routeSearch$RideRouteQuery.setExtensions(this.f1042c);
        return routeSearch$RideRouteQuery;
    }

    public RouteSearch$RideRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo) {
        this.f1042c = "base";
        this.a = routeSearch$FromAndTo;
    }

    public RouteSearch$RideRouteQuery(Parcel parcel) {
        this.f1042c = "base";
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1042c = parcel.readString();
    }

    public RouteSearch$RideRouteQuery() {
        this.f1042c = "base";
    }
}
