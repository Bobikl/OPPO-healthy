package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$TruckRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$TruckRouteQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1043c;
    private List<LatLonPoint> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1044e;
    private float f;
    private float g;
    private float h;
    private float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1045j;

    public static class a implements Parcelable.Creator<RouteSearch$TruckRouteQuery> {
        public static RouteSearch$TruckRouteQuery a(Parcel parcel) {
            return new RouteSearch$TruckRouteQuery(parcel);
        }

        public static RouteSearch$TruckRouteQuery[] b(int i) {
            return new RouteSearch$TruckRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$TruckRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$TruckRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$TruckRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i, List<LatLonPoint> list, int i2) {
        this.f1045j = "base";
        this.a = routeSearch$FromAndTo;
        this.f1043c = i;
        this.d = list;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getExtensions() {
        return this.f1045j;
    }

    public RouteSearch$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getMode() {
        return this.f1043c;
    }

    public List<LatLonPoint> getPassedByPoints() {
        return this.d;
    }

    public String getPassedPointStr() {
        StringBuffer stringBuffer = new StringBuffer();
        List<LatLonPoint> list = this.d;
        if (list == null || list.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.d.size(); i++) {
            LatLonPoint latLonPoint = this.d.get(i);
            stringBuffer.append(latLonPoint.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(latLonPoint.getLatitude());
            if (i < this.d.size() - 1) {
                stringBuffer.append(";");
            }
        }
        return stringBuffer.toString();
    }

    public float getTruckAxis() {
        return this.i;
    }

    public float getTruckHeight() {
        return this.f1044e;
    }

    public float getTruckLoad() {
        return this.g;
    }

    public int getTruckSize() {
        return this.b;
    }

    public float getTruckWeight() {
        return this.h;
    }

    public float getTruckWidth() {
        return this.f;
    }

    public boolean hasPassPoint() {
        return !qxm.h(getPassedPointStr());
    }

    public void setExtensions(String str) {
        this.f1045j = str;
    }

    public void setMode(int i) {
        this.f1043c = i;
    }

    public void setTruckAxis(float f) {
        this.i = f;
    }

    public void setTruckHeight(float f) {
        this.f1044e = f;
    }

    public void setTruckLoad(float f) {
        this.g = f;
    }

    public void setTruckSize(int i) {
        this.b = i;
    }

    public void setTruckWeight(float f) {
        this.h = f;
    }

    public void setTruckWidth(float f) {
        this.f = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f1043c);
        parcel.writeTypedList(this.d);
        parcel.writeFloat(this.f1044e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeString(this.f1045j);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$TruckRouteQuery m4491clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "TruckRouteQueryclone");
        }
        RouteSearch$TruckRouteQuery routeSearch$TruckRouteQuery = new RouteSearch$TruckRouteQuery(this.a, this.f1043c, this.d, this.b);
        routeSearch$TruckRouteQuery.setExtensions(this.f1045j);
        return routeSearch$TruckRouteQuery;
    }

    public RouteSearch$TruckRouteQuery(Parcel parcel) {
        this.b = 2;
        this.f1045j = "base";
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1043c = parcel.readInt();
        this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f1044e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readFloat();
        this.i = parcel.readFloat();
        this.f1045j = parcel.readString();
    }
}
