package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DriveStep implements Parcelable {
    public static final Parcelable.Creator<DriveStep> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1019c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1020e;
    private float f;
    private String g;
    private float h;
    private List<LatLonPoint> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1021j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<RouteSearchCity> f1022l;
    private List<TMC> m;

    public static class a implements Parcelable.Creator<DriveStep> {
        public static DriveStep a(Parcel parcel) {
            return new DriveStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DriveStep[] newArray(int i) {
            return null;
        }
    }

    public DriveStep(Parcel parcel) {
        this.i = new ArrayList();
        this.f1022l = new ArrayList();
        this.m = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1019c = parcel.readString();
        this.d = parcel.readFloat();
        this.f1020e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f1021j = parcel.readString();
        this.k = parcel.readString();
        this.f1022l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.m = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.f1021j;
    }

    public String getAssistantAction() {
        return this.k;
    }

    public float getDistance() {
        return this.d;
    }

    public float getDuration() {
        return this.h;
    }

    public String getInstruction() {
        return this.a;
    }

    public String getOrientation() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.i;
    }

    public String getRoad() {
        return this.f1019c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.f1022l;
    }

    public List<TMC> getTMCs() {
        return this.m;
    }

    public float getTollDistance() {
        return this.f;
    }

    public String getTollRoad() {
        return this.g;
    }

    public float getTolls() {
        return this.f1020e;
    }

    public void setAction(String str) {
        this.f1021j = str;
    }

    public void setAssistantAction(String str) {
        this.k = str;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setDuration(float f) {
        this.h = f;
    }

    public void setInstruction(String str) {
        this.a = str;
    }

    public void setOrientation(String str) {
        this.b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.i = list;
    }

    public void setRoad(String str) {
        this.f1019c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.f1022l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.m = list;
    }

    public void setTollDistance(float f) {
        this.f = f;
    }

    public void setTollRoad(String str) {
        this.g = str;
    }

    public void setTolls(float f) {
        this.f1020e = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1019c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.f1020e);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
        parcel.writeFloat(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeString(this.f1021j);
        parcel.writeString(this.k);
        parcel.writeTypedList(this.f1022l);
        parcel.writeTypedList(this.m);
    }

    public DriveStep() {
        this.i = new ArrayList();
        this.f1022l = new ArrayList();
        this.m = new ArrayList();
    }
}
