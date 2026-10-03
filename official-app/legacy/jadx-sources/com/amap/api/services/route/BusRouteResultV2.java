package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusRouteResultV2 extends RouteResult {
    public static final Parcelable.Creator<BusRouteResultV2> CREATOR = new a();
    private float a;
    private List<BusPathV2> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearchV2$BusRouteQuery f1000c;
    private float d;

    public static class a implements Parcelable.Creator<BusRouteResultV2> {
        public static BusRouteResultV2 a(Parcel parcel) {
            return new BusRouteResultV2(parcel);
        }

        public static BusRouteResultV2[] b(int i) {
            return new BusRouteResultV2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusRouteResultV2[] newArray(int i) {
            return b(i);
        }
    }

    public BusRouteResultV2(Parcel parcel) {
        super(parcel);
        this.b = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(BusPathV2.CREATOR);
        this.f1000c = (RouteSearchV2$BusRouteQuery) parcel.readParcelable(RouteSearchV2$BusRouteQuery.class.getClassLoader());
        this.d = parcel.readFloat();
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2$BusRouteQuery getBusQuery() {
        return this.f1000c;
    }

    public float getDistance() {
        return this.d;
    }

    public List<BusPathV2> getPaths() {
        return this.b;
    }

    public float getTaxiCost() {
        return this.a;
    }

    public void setBusQuery(RouteSearchV2$BusRouteQuery routeSearchV2$BusRouteQuery) {
        this.f1000c = routeSearchV2$BusRouteQuery;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setPaths(List<BusPathV2> list) {
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
        parcel.writeParcelable(this.f1000c, i);
        parcel.writeFloat(this.d);
    }

    public BusRouteResultV2() {
        this.b = new ArrayList();
    }
}
