package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TruckRouteRestult implements Parcelable {
    public static final Parcelable.Creator<TruckRouteRestult> CREATOR = new a();
    private RouteSearch$TruckRouteQuery a;
    private List<TruckPath> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f1069c;
    private LatLonPoint d;

    public static class a implements Parcelable.Creator<TruckRouteRestult> {
        public static TruckRouteRestult a(Parcel parcel) {
            return new TruckRouteRestult(parcel);
        }

        public static TruckRouteRestult[] b(int i) {
            return new TruckRouteRestult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckRouteRestult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckRouteRestult[] newArray(int i) {
            return b(i);
        }
    }

    public TruckRouteRestult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TruckPath> getPaths() {
        return this.b;
    }

    public LatLonPoint getStartPos() {
        return this.f1069c;
    }

    public LatLonPoint getTargetPos() {
        return this.d;
    }

    public RouteSearch$TruckRouteQuery getTruckQuery() {
        return this.a;
    }

    public void setPaths(List<TruckPath> list) {
        this.b = list;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f1069c = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setTruckQuery(RouteSearch$TruckRouteQuery routeSearch$TruckRouteQuery) {
        this.a = routeSearch$TruckRouteQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1069c, i);
        parcel.writeParcelable(this.d, i);
    }

    public TruckRouteRestult(Parcel parcel) {
        this.b = parcel.createTypedArrayList(TruckPath.CREATOR);
        this.f1069c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }
}
