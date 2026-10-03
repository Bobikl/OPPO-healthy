package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class WalkRouteResultV2 extends RouteResult {
    public static final Parcelable.Creator<WalkRouteResultV2> CREATOR = new a();
    private List<WalkPath> a;
    private RouteSearchV2$WalkRouteQuery b;

    public static class a implements Parcelable.Creator<WalkRouteResultV2> {
        public static WalkRouteResultV2 a(Parcel parcel) {
            return new WalkRouteResultV2(parcel);
        }

        public static WalkRouteResultV2[] b(int i) {
            return new WalkRouteResultV2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResultV2[] newArray(int i) {
            return b(i);
        }
    }

    public WalkRouteResultV2(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.b = (RouteSearchV2$WalkRouteQuery) parcel.readParcelable(RouteSearchV2$WalkRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.a;
    }

    public RouteSearchV2$WalkRouteQuery getWalkQuery() {
        return this.b;
    }

    public void setPaths(List<WalkPath> list) {
        this.a = list;
    }

    public void setWalkQuery(RouteSearchV2$WalkRouteQuery routeSearchV2$WalkRouteQuery) {
        this.b = routeSearchV2$WalkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public WalkRouteResultV2() {
        this.a = new ArrayList();
    }
}
