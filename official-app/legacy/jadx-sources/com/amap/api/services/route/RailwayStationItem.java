package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class RailwayStationItem implements Parcelable {
    public static final Parcelable.Creator<RailwayStationItem> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f1026c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1027e;
    private boolean f;
    private boolean g;
    private float h;

    public static class a implements Parcelable.Creator<RailwayStationItem> {
        public static RailwayStationItem a(Parcel parcel) {
            return new RailwayStationItem(parcel);
        }

        public static RailwayStationItem[] b(int i) {
            return new RailwayStationItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwayStationItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwayStationItem[] newArray(int i) {
            return b(i);
        }
    }

    public RailwayStationItem() {
        this.f = false;
        this.g = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.d;
    }

    public String getID() {
        return this.a;
    }

    public LatLonPoint getLocation() {
        return this.f1026c;
    }

    public String getName() {
        return this.b;
    }

    public String getTime() {
        return this.f1027e;
    }

    public float getWait() {
        return this.h;
    }

    public boolean isEnd() {
        return this.g;
    }

    public boolean isStart() {
        return this.f;
    }

    public void setAdcode(String str) {
        this.d = str;
    }

    public void setID(String str) {
        this.a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f1026c = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setTime(String str) {
        this.f1027e = str;
    }

    public void setWait(float f) {
        this.h = f;
    }

    public void setisEnd(boolean z) {
        this.g = z;
    }

    public void setisStart(boolean z) {
        this.f = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.f1026c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.f1027e);
        parcel.writeBooleanArray(new boolean[]{this.f, this.g});
        parcel.writeFloat(this.h);
    }

    public RailwayStationItem(Parcel parcel) {
        this.f = false;
        this.g = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1026c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.f1027e = parcel.readString();
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = zArr[1];
        this.h = parcel.readFloat();
    }
}
