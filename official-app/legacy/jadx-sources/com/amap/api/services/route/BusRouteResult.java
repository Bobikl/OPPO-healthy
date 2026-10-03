package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusRouteResult extends RouteResult {
    public static final Parcelable.Creator<BusRouteResult> CREATOR = new a();
    private float a;
    private List<BusPath> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch$BusRouteQuery f999c;

    public static class a implements Parcelable.Creator<BusRouteResult> {
        public static BusRouteResult a(Parcel parcel) {
            return new BusRouteResult(parcel);
        }

        public static BusRouteResult[] b(int i) {
            return new BusRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResult[] newArray(int i) {
            return b(i);
        }
    }

    public BusRouteResult(Parcel parcel) {
        super(parcel);
        this.b = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(BusPath.CREATOR);
        this.f999c = (RouteSearch$BusRouteQuery) parcel.readParcelable(RouteSearch$BusRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch$BusRouteQuery getBusQuery() {
        return this.f999c;
    }

    public List<BusPath> getPaths() {
        return this.b;
    }

    public float getTaxiCost() {
        return this.a;
    }

    public void setBusQuery(RouteSearch$BusRouteQuery routeSearch$BusRouteQuery) {
        this.f999c = routeSearch$BusRouteQuery;
    }

    public void setPaths(List<BusPath> list) {
        this.b = list;
    }

    public void setTaxiCost(float f) {
        this.a = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f999c, i);
    }

    public BusRouteResult() {
        this.b = new ArrayList();
    }
}
