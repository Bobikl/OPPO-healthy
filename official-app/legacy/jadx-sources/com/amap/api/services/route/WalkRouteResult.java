package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class WalkRouteResult extends RouteResult {
    public static final Parcelable.Creator<WalkRouteResult> CREATOR = new a();
    private List<WalkPath> a;
    private RouteSearch$WalkRouteQuery b;

    public static class a implements Parcelable.Creator<WalkRouteResult> {
        public static WalkRouteResult a(Parcel parcel) {
            return new WalkRouteResult(parcel);
        }

        public static WalkRouteResult[] b(int i) {
            return new WalkRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkRouteResult[] newArray(int i) {
            return b(i);
        }
    }

    public WalkRouteResult(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.b = (RouteSearch$WalkRouteQuery) parcel.readParcelable(RouteSearch$WalkRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.a;
    }

    public RouteSearch$WalkRouteQuery getWalkQuery() {
        return this.b;
    }

    public void setPaths(List<WalkPath> list) {
        this.a = list;
    }

    public void setWalkQuery(RouteSearch$WalkRouteQuery routeSearch$WalkRouteQuery) {
        this.b = routeSearch$WalkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public WalkRouteResult() {
        this.a = new ArrayList();
    }
}
