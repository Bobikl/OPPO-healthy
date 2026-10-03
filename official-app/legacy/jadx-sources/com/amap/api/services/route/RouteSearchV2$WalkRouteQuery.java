package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchV2$WalkRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearchV2$WalkRouteQuery> CREATOR = new a();
    private RouteSearchV2$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1058c;
    private int d;

    public static class a implements Parcelable.Creator<RouteSearchV2$WalkRouteQuery> {
        public static RouteSearchV2$WalkRouteQuery a(Parcel parcel) {
            return new RouteSearchV2$WalkRouteQuery(parcel);
        }

        public static RouteSearchV2$WalkRouteQuery[] b(int i) {
            return new RouteSearchV2$WalkRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$WalkRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$WalkRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearchV2$WalkRouteQuery(RouteSearchV2$FromAndTo routeSearchV2$FromAndTo) {
        this.b = 1;
        this.f1058c = false;
        this.d = 1;
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
        RouteSearchV2$WalkRouteQuery routeSearchV2$WalkRouteQuery = (RouteSearchV2$WalkRouteQuery) obj;
        if (this.b == routeSearchV2$WalkRouteQuery.b && this.f1058c == routeSearchV2$WalkRouteQuery.f1058c && this.d == routeSearchV2$WalkRouteQuery.d) {
            return this.a.equals(routeSearchV2$WalkRouteQuery.a);
        }
        return false;
    }

    public int getAlternativeRoute() {
        return this.d;
    }

    public RouteSearchV2$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getShowFields() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + (this.f1058c ? 1 : 0)) * 31) + this.d;
    }

    public boolean isIndoor() {
        return this.f1058c;
    }

    public void setAlternativeRoute(int i) {
        this.d = i;
    }

    public void setIndoor(boolean z) {
        this.f1058c = z;
    }

    public void setShowFields(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeBooleanArray(new boolean[]{this.f1058c});
        parcel.writeInt(this.d);
        parcel.writeInt(this.b);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearchV2$WalkRouteQuery m4497clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearchV2", "WalkRouteQueryclone");
        }
        RouteSearchV2$WalkRouteQuery routeSearchV2$WalkRouteQuery = new RouteSearchV2$WalkRouteQuery(this.a);
        routeSearchV2$WalkRouteQuery.setShowFields(this.b);
        routeSearchV2$WalkRouteQuery.setIndoor(this.f1058c);
        routeSearchV2$WalkRouteQuery.setAlternativeRoute(this.d);
        return routeSearchV2$WalkRouteQuery;
    }

    public RouteSearchV2$WalkRouteQuery(Parcel parcel) {
        this.b = 1;
        this.f1058c = false;
        this.d = 1;
        this.a = (RouteSearchV2$FromAndTo) parcel.readParcelable(RouteSearchV2$FromAndTo.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f1058c = zArr[0];
        this.d = parcel.readInt();
        this.b = parcel.readInt();
    }

    public RouteSearchV2$WalkRouteQuery() {
        this.b = 1;
        this.f1058c = false;
        this.d = 1;
    }
}
