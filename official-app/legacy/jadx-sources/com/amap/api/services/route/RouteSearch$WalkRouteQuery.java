package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$WalkRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$WalkRouteQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1046c;

    public static class a implements Parcelable.Creator<RouteSearch$WalkRouteQuery> {
        public static RouteSearch$WalkRouteQuery a(Parcel parcel) {
            return new RouteSearch$WalkRouteQuery(parcel);
        }

        public static RouteSearch$WalkRouteQuery[] b(int i) {
            return new RouteSearch$WalkRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$WalkRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$WalkRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$WalkRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i) {
        this.f1046c = "base";
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
        RouteSearch$WalkRouteQuery routeSearch$WalkRouteQuery = (RouteSearch$WalkRouteQuery) obj;
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        if (routeSearch$FromAndTo == null) {
            if (routeSearch$WalkRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearch$FromAndTo.equals(routeSearch$WalkRouteQuery.a)) {
            return false;
        }
        String str = this.f1046c;
        if (str == null) {
            if (routeSearch$WalkRouteQuery.f1046c != null) {
                return false;
            }
        } else if (!str.equals(routeSearch$WalkRouteQuery.f1046c)) {
            return false;
        }
        return this.b == routeSearch$WalkRouteQuery.b;
    }

    public String getExtensions() {
        return this.f1046c;
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
        this.f1046c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.f1046c);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$WalkRouteQuery m4492clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "WalkRouteQueryclone");
        }
        RouteSearch$WalkRouteQuery routeSearch$WalkRouteQuery = new RouteSearch$WalkRouteQuery(this.a);
        routeSearch$WalkRouteQuery.setExtensions(this.f1046c);
        return routeSearch$WalkRouteQuery;
    }

    public RouteSearch$WalkRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo) {
        this.f1046c = "base";
        this.a = routeSearch$FromAndTo;
    }

    public RouteSearch$WalkRouteQuery(Parcel parcel) {
        this.f1046c = "base";
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1046c = parcel.readString();
    }

    public RouteSearch$WalkRouteQuery() {
        this.f1046c = "base";
    }
}
