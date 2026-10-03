package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchV2$RideRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearchV2$RideRouteQuery> CREATOR = new a();
    private RouteSearchV2$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1057c;

    public static class a implements Parcelable.Creator<RouteSearchV2$RideRouteQuery> {
        public static RouteSearchV2$RideRouteQuery a(Parcel parcel) {
            return new RouteSearchV2$RideRouteQuery(parcel);
        }

        public static RouteSearchV2$RideRouteQuery[] b(int i) {
            return new RouteSearchV2$RideRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$RideRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$RideRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearchV2$RideRouteQuery(RouteSearchV2$FromAndTo routeSearchV2$FromAndTo) {
        this.b = 1;
        this.f1057c = 1;
        this.a = routeSearchV2$FromAndTo;
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
        RouteSearchV2$RideRouteQuery routeSearchV2$RideRouteQuery = (RouteSearchV2$RideRouteQuery) obj;
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = this.a;
        if (routeSearchV2$FromAndTo == null) {
            if (routeSearchV2$RideRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearchV2$FromAndTo.equals(routeSearchV2$RideRouteQuery.a)) {
            return false;
        }
        return this.b == routeSearchV2$RideRouteQuery.b && this.f1057c == routeSearchV2$RideRouteQuery.f1057c;
    }

    public int getAlternativeRoute() {
        return this.f1057c;
    }

    public RouteSearchV2$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getShowFields() {
        return this.b;
    }

    public int hashCode() {
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = this.a;
        return (((((routeSearchV2$FromAndTo == null ? 0 : routeSearchV2$FromAndTo.hashCode()) + 31) * 31) + this.b) * 31) + this.f1057c;
    }

    public void setAlternativeRoute(int i) {
        this.f1057c = i;
    }

    public void setShowFields(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.f1057c);
        parcel.writeInt(this.b);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearchV2$RideRouteQuery m4496clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearchV2", "RideRouteQueryclone");
        }
        RouteSearchV2$RideRouteQuery routeSearchV2$RideRouteQuery = new RouteSearchV2$RideRouteQuery(this.a);
        routeSearchV2$RideRouteQuery.setShowFields(this.b);
        routeSearchV2$RideRouteQuery.setAlternativeRoute(this.f1057c);
        return routeSearchV2$RideRouteQuery;
    }

    public RouteSearchV2$RideRouteQuery(Parcel parcel) {
        this.b = 1;
        this.f1057c = 1;
        this.a = (RouteSearchV2$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.f1057c = parcel.readInt();
        this.b = parcel.readInt();
    }

    public RouteSearchV2$RideRouteQuery() {
        this.b = 1;
        this.f1057c = 1;
    }
}
