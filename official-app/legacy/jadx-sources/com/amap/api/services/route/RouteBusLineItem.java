package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RouteBusLineItem extends BusLineItem {
    public static final Parcelable.Creator<RouteBusLineItem> CREATOR = new a();
    private BusStationItem a;
    private BusStationItem b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f1030c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BusStationItem> f1031e;
    private float f;

    public static class a implements Parcelable.Creator<RouteBusLineItem> {
        public static RouteBusLineItem a(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteBusLineItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RouteBusLineItem[] newArray(int i) {
            return null;
        }
    }

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.f1030c = new ArrayList();
        this.f1031e = new ArrayList();
        this.a = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.b = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f1030c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.d = parcel.readInt();
        this.f1031e = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.f = parcel.readFloat();
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RouteBusLineItem routeBusLineItem = (RouteBusLineItem) obj;
        BusStationItem busStationItem = this.b;
        if (busStationItem == null) {
            if (routeBusLineItem.b != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.b)) {
            return false;
        }
        BusStationItem busStationItem2 = this.a;
        if (busStationItem2 == null) {
            if (routeBusLineItem.a != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.a)) {
            return false;
        }
        return true;
    }

    public BusStationItem getArrivalBusStation() {
        return this.b;
    }

    public BusStationItem getDepartureBusStation() {
        return this.a;
    }

    public float getDuration() {
        return this.f;
    }

    public int getPassStationNum() {
        return this.d;
    }

    public List<BusStationItem> getPassStations() {
        return this.f1031e;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f1030c;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        BusStationItem busStationItem = this.b;
        int iHashCode2 = (iHashCode + (busStationItem == null ? 0 : busStationItem.hashCode())) * 31;
        BusStationItem busStationItem2 = this.a;
        return iHashCode2 + (busStationItem2 != null ? busStationItem2.hashCode() : 0);
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.b = busStationItem;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.a = busStationItem;
    }

    public void setDuration(float f) {
        this.f = f;
    }

    public void setPassStationNum(int i) {
        this.d = i;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.f1031e = list;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f1030c = list;
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeTypedList(this.f1030c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.f1031e);
        parcel.writeFloat(this.f);
    }

    public RouteBusLineItem() {
        this.f1030c = new ArrayList();
        this.f1031e = new ArrayList();
    }
}
