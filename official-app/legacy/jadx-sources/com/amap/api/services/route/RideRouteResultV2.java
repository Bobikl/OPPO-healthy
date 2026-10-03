package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RideRouteResultV2 extends RouteResult {
    public static final Parcelable.Creator<RideRouteResultV2> CREATOR = new a();
    private List<RidePath> a;
    private RouteSearchV2$RideRouteQuery b;

    public static class a implements Parcelable.Creator<RideRouteResultV2> {
        public static RideRouteResultV2 a(Parcel parcel) {
            return new RideRouteResultV2(parcel);
        }

        public static RideRouteResultV2[] b(int i) {
            return new RideRouteResultV2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResultV2[] newArray(int i) {
            return b(i);
        }
    }

    public RideRouteResultV2(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.b = (RouteSearchV2$RideRouteQuery) parcel.readParcelable(RouteSearch$RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.a;
    }

    public RouteSearchV2$RideRouteQuery getRideQuery() {
        return this.b;
    }

    public void setPaths(List<RidePath> list) {
        this.a = list;
    }

    public void setRideQuery(RouteSearchV2$RideRouteQuery routeSearchV2$RideRouteQuery) {
        this.b = routeSearchV2$RideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public RideRouteResultV2() {
        this.a = new ArrayList();
    }
}
