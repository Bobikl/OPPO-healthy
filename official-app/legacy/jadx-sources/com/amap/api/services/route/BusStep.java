package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusStep implements Parcelable {
    public static final Parcelable.Creator<BusStep> CREATOR = new a();
    private RouteBusWalkItem a;
    private List<RouteBusLineItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Doorway f1001c;
    private Doorway d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RouteRailwayItem f1002e;
    private TaxiItem f;

    public static class a implements Parcelable.Creator<BusStep> {
        public static BusStep a(Parcel parcel) {
            return new BusStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStep[] newArray(int i) {
            return null;
        }
    }

    public BusStep(Parcel parcel) {
        this.b = new ArrayList();
        this.a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f1001c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f1002e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f = (TaxiItem) parcel.readParcelable(TaxiItem.class.getClassLoader());
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
        return this.f1001c;
    }

    public Doorway getExit() {
        return this.d;
    }

    public RouteRailwayItem getRailway() {
        return this.f1002e;
    }

    public TaxiItem getTaxi() {
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
        this.f1001c = doorway;
    }

    public void setExit(Doorway doorway) {
        this.d = doorway;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.f1002e = routeRailwayItem;
    }

    public void setTaxi(TaxiItem taxiItem) {
        this.f = taxiItem;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.a = routeBusWalkItem;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1001c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.f1002e, i);
        parcel.writeParcelable(this.f, i);
    }

    public BusStep() {
        this.b = new ArrayList();
    }
}
