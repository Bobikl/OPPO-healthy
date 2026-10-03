package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusStepV2 implements Parcelable {
    public static final Parcelable.Creator<BusStepV2> CREATOR = new a();
    private RouteBusWalkItem a;
    private List<RouteBusLineItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Doorway f1003c;
    private Doorway d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RouteRailwayItem f1004e;
    private TaxiItemV2 f;

    public static class a implements Parcelable.Creator<BusStepV2> {
        public static BusStepV2 a(Parcel parcel) {
            return new BusStepV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStepV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStepV2[] newArray(int i) {
            return null;
        }
    }

    public BusStepV2(Parcel parcel) {
        this.b = new ArrayList();
        this.a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f1003c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f1004e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItemV2) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.b;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.b.get(0);
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.b;
    }

    public Doorway getEntrance() {
        return this.f1003c;
    }

    public Doorway getExit() {
        return this.d;
    }

    public RouteRailwayItem getRailway() {
        return this.f1004e;
    }

    public TaxiItemV2 getTaxi() {
        return this.f;
    }

    public RouteBusWalkItem getWalk() {
        return this.a;
    }

    @Deprecated
    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.b.add(routeBusLineItem);
        }
        this.b.set(0, routeBusLineItem);
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.b = list;
    }

    public void setEntrance(Doorway doorway) {
        this.f1003c = doorway;
    }

    public void setExit(Doorway doorway) {
        this.d = doorway;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.f1004e = routeRailwayItem;
    }

    public void setTaxi(TaxiItemV2 taxiItemV2) {
        this.f = taxiItemV2;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.a = routeBusWalkItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1003c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.f1004e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStepV2() {
        this.b = new ArrayList();
    }
}
