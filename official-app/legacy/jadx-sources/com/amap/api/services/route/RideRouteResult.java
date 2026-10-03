package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RideRouteResult extends RouteResult {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new a();
    private List<RidePath> a;
    private RouteSearch$RideRouteQuery b;

    public static class a implements Parcelable.Creator<RideRouteResult> {
        public static RideRouteResult a(Parcel parcel) {
            return new RideRouteResult(parcel);
        }

        public static RideRouteResult[] b(int i) {
            return new RideRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RideRouteResult[] newArray(int i) {
            return b(i);
        }
    }

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.b = (RouteSearch$RideRouteQuery) parcel.readParcelable(RouteSearch$RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.a;
    }

    public RouteSearch$RideRouteQuery getRideQuery() {
        return this.b;
    }

    public void setPaths(List<RidePath> list) {
        this.a = list;
    }

    public void setRideQuery(RouteSearch$RideRouteQuery routeSearch$RideRouteQuery) {
        this.b = routeSearch$RideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public RideRouteResult() {
        this.a = new ArrayList();
    }
}
