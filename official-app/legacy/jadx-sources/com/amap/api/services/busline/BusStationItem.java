package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusStationItem implements Parcelable {
    public static final Parcelable.Creator<BusStationItem> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f943c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f944e;
    private List<BusLineItem> f;

    public static class a implements Parcelable.Creator<BusStationItem> {
        public static BusStationItem a(Parcel parcel) {
            return new BusStationItem(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusStationItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusStationItem[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ BusStationItem(Parcel parcel, byte b) {
        this(parcel);
    }

    private static String a(List<BusLineItem> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getBusLineName());
                if (i < list.size() - 1) {
                    stringBuffer.append("|");
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusStationItem busStationItem = (BusStationItem) obj;
        String str = this.a;
        if (str == null) {
            if (busStationItem.a != null) {
                return false;
            }
        } else if (!str.equals(busStationItem.a)) {
            return false;
        }
        return true;
    }

    public String getAdCode() {
        return this.f944e;
    }

    public List<BusLineItem> getBusLineItems() {
        return this.f;
    }

    public String getBusStationId() {
        return this.a;
    }

    public String getBusStationName() {
        return this.b;
    }

    public String getCityCode() {
        return this.d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f943c;
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public void setAdCode(String str) {
        this.f944e = str;
    }

    public void setBusLineItems(List<BusLineItem> list) {
        this.f = list;
    }

    public void setBusStationId(String str) {
        this.a = str;
    }

    public void setBusStationName(String str) {
        this.b = str;
    }

    public void setCityCode(String str) {
        this.d = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f943c = latLonPoint;
    }

    public String toString() {
        return "BusStationName: " + this.b + " LatLonPoint: " + this.f943c.toString() + " BusLines: " + a(this.f) + " CityCode: " + this.d + " AdCode: " + this.f944e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.a);
        parcel.writeValue(this.f943c);
        parcel.writeString(this.d);
        parcel.writeString(this.f944e);
        parcel.writeList(this.f);
    }

    public BusStationItem() {
        this.f = new ArrayList();
    }

    private BusStationItem(Parcel parcel) {
        this.f = new ArrayList();
        this.b = parcel.readString();
        this.a = parcel.readString();
        this.f943c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.f944e = parcel.readString();
        this.f = parcel.readArrayList(BusLineItem.class.getClassLoader());
    }
}
