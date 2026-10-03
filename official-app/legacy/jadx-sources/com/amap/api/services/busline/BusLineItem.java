package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusLineItem implements Parcelable {
    public static final Parcelable.Creator<BusLineItem> CREATOR = new a();
    private float a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f938c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<LatLonPoint> f939e;
    private List<LatLonPoint> f;
    private String g;
    private String h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f940j;
    private Date k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f941l;
    private float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f942n;
    private List<BusStationItem> o;

    public static class a implements Parcelable.Creator<BusLineItem> {
        public static BusLineItem a(Parcel parcel) {
            return new BusLineItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusLineItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusLineItem[] newArray(int i) {
            return null;
        }
    }

    public BusLineItem() {
        this.f939e = new ArrayList();
        this.f = new ArrayList();
        this.o = new ArrayList();
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
        BusLineItem busLineItem = (BusLineItem) obj;
        String str = this.g;
        if (str == null) {
            if (busLineItem.g != null) {
                return false;
            }
        } else if (!str.equals(busLineItem.g)) {
            return false;
        }
        return true;
    }

    public float getBasicPrice() {
        return this.m;
    }

    public List<LatLonPoint> getBounds() {
        return this.f;
    }

    public String getBusCompany() {
        return this.f941l;
    }

    public String getBusLineId() {
        return this.g;
    }

    public String getBusLineName() {
        return this.b;
    }

    public String getBusLineType() {
        return this.f938c;
    }

    public List<BusStationItem> getBusStations() {
        return this.o;
    }

    public String getCityCode() {
        return this.d;
    }

    public List<LatLonPoint> getDirectionsCoordinates() {
        return this.f939e;
    }

    public float getDistance() {
        return this.a;
    }

    public Date getFirstBusTime() {
        Date date = this.f940j;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public Date getLastBusTime() {
        Date date = this.k;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public String getOriginatingStation() {
        return this.h;
    }

    public String getTerminalStation() {
        return this.i;
    }

    public float getTotalPrice() {
        return this.f942n;
    }

    public int hashCode() {
        String str = this.g;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public void setBasicPrice(float f) {
        this.m = f;
    }

    public void setBounds(List<LatLonPoint> list) {
        this.f = list;
    }

    public void setBusCompany(String str) {
        this.f941l = str;
    }

    public void setBusLineId(String str) {
        this.g = str;
    }

    public void setBusLineName(String str) {
        this.b = str;
    }

    public void setBusLineType(String str) {
        this.f938c = str;
    }

    public void setBusStations(List<BusStationItem> list) {
        this.o = list;
    }

    public void setCityCode(String str) {
        this.d = str;
    }

    public void setDirectionsCoordinates(List<LatLonPoint> list) {
        this.f939e = list;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public void setFirstBusTime(Date date) {
        if (date == null) {
            this.f940j = null;
        } else {
            this.f940j = (Date) date.clone();
        }
    }

    public void setLastBusTime(Date date) {
        if (date == null) {
            this.k = null;
        } else {
            this.k = (Date) date.clone();
        }
    }

    public void setOriginatingStation(String str) {
        this.h = str;
    }

    public void setTerminalStation(String str) {
        this.i = str;
    }

    public void setTotalPrice(float f) {
        this.f942n = f;
    }

    public String toString() {
        return this.b + " " + qxm.c(this.f940j) + "-" + qxm.c(this.k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f938c);
        parcel.writeString(this.d);
        parcel.writeList(this.f939e);
        parcel.writeList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(qxm.c(this.f940j));
        parcel.writeString(qxm.c(this.k));
        parcel.writeString(this.f941l);
        parcel.writeFloat(this.m);
        parcel.writeFloat(this.f942n);
        parcel.writeList(this.o);
    }

    public BusLineItem(Parcel parcel) {
        this.f939e = new ArrayList();
        this.f = new ArrayList();
        this.o = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readString();
        this.f938c = parcel.readString();
        this.d = parcel.readString();
        this.f939e = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.f = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f940j = qxm.j(parcel.readString());
        this.k = qxm.j(parcel.readString());
        this.f941l = parcel.readString();
        this.m = parcel.readFloat();
        this.f942n = parcel.readFloat();
        this.o = parcel.readArrayList(BusStationItem.class.getClassLoader());
    }
}
