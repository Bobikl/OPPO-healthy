package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.mfc;
import com.oplus.aiunit.vision.ua4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DriveStepV2 implements Parcelable {
    public static final Parcelable.Creator<DriveStepV2> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1023c;
    private List<LatLonPoint> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<RouteSearchCity> f1024e;
    private List<TMC> f;
    private int g;
    private ua4 h;
    private mfc i;

    public static class a implements Parcelable.Creator<DriveStepV2> {
        public static DriveStepV2 a(Parcel parcel) {
            return new DriveStepV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveStepV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DriveStepV2[] newArray(int i) {
            return null;
        }
    }

    public DriveStepV2(Parcel parcel) {
        this.d = new ArrayList();
        this.f1024e = new ArrayList();
        this.f = new ArrayList();
        this.g = -1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1023c = parcel.readString();
        this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f1024e = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.f = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ua4 getCostDetail() {
        return null;
    }

    public String getInstruction() {
        return this.a;
    }

    public mfc getNavi() {
        return null;
    }

    public String getOrientation() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.d;
    }

    public String getRoad() {
        return this.f1023c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.f1024e;
    }

    public int getStepDistance() {
        return this.g;
    }

    public List<TMC> getTMCs() {
        return this.f;
    }

    public void setCostDetail(ua4 ua4Var) {
    }

    public void setInstruction(String str) {
        this.a = str;
    }

    public void setNavi(mfc mfcVar) {
    }

    public void setOrientation(String str) {
        this.b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.d = list;
    }

    public void setRoad(String str) {
        this.f1023c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.f1024e = list;
    }

    public void setStepDistance(int i) {
        this.g = i;
    }

    public void setTMCs(List<TMC> list) {
        this.f = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f1023c);
        parcel.writeTypedList(this.d);
        parcel.writeTypedList(this.f1024e);
        parcel.writeTypedList(this.f);
    }

    public DriveStepV2() {
        this.d = new ArrayList();
        this.f1024e = new ArrayList();
        this.f = new ArrayList();
        this.g = -1;
    }
}
