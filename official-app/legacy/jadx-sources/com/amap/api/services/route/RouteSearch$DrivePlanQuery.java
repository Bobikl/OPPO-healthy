package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$DrivePlanQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$DrivePlanQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1036c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1037e;
    private int f;
    private int g;

    public static class a implements Parcelable.Creator<RouteSearch$DrivePlanQuery> {
        public static RouteSearch$DrivePlanQuery a(Parcel parcel) {
            return new RouteSearch$DrivePlanQuery(parcel);
        }

        public static RouteSearch$DrivePlanQuery[] b(int i) {
            return new RouteSearch$DrivePlanQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$DrivePlanQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$DrivePlanQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$DrivePlanQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i, int i2, int i3) {
        this.f1036c = 1;
        this.d = 0;
        this.a = routeSearch$FromAndTo;
        this.f1037e = i;
        this.f = i2;
        this.g = i3;
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
        RouteSearch$DrivePlanQuery routeSearch$DrivePlanQuery = (RouteSearch$DrivePlanQuery) obj;
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        if (routeSearch$FromAndTo == null) {
            if (routeSearch$DrivePlanQuery.a != null) {
                return false;
            }
        } else if (!routeSearch$FromAndTo.equals(routeSearch$DrivePlanQuery.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (routeSearch$DrivePlanQuery.b != null) {
                return false;
            }
        } else if (!str.equals(routeSearch$DrivePlanQuery.b)) {
            return false;
        }
        return this.f1036c == routeSearch$DrivePlanQuery.f1036c && this.d == routeSearch$DrivePlanQuery.d && this.f1037e == routeSearch$DrivePlanQuery.f1037e && this.f == routeSearch$DrivePlanQuery.f && this.g == routeSearch$DrivePlanQuery.g;
    }

    public int getCarType() {
        return this.d;
    }

    public int getCount() {
        return this.g;
    }

    public String getDestParentPoiID() {
        return this.b;
    }

    public int getFirstTime() {
        return this.f1037e;
    }

    public RouteSearch$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getInterval() {
        return this.f;
    }

    public int getMode() {
        return this.f1036c;
    }

    public int hashCode() {
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        int iHashCode = ((routeSearch$FromAndTo == null ? 0 : routeSearch$FromAndTo.hashCode()) + 31) * 31;
        String str = this.b;
        return ((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f1036c) * 31) + this.d) * 31) + this.f1037e) * 31) + this.f) * 31) + this.g;
    }

    public void setCarType(int i) {
        this.d = i;
    }

    public void setDestParentPoiID(String str) {
        this.b = str;
    }

    public void setMode(int i) {
        this.f1036c = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.f1036c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1037e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$DrivePlanQuery m4487clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "DriveRouteQueryclone");
        }
        RouteSearch$DrivePlanQuery routeSearch$DrivePlanQuery = new RouteSearch$DrivePlanQuery(this.a, this.f1037e, this.f, this.g);
        routeSearch$DrivePlanQuery.setDestParentPoiID(this.b);
        routeSearch$DrivePlanQuery.setMode(this.f1036c);
        routeSearch$DrivePlanQuery.setCarType(this.d);
        return routeSearch$DrivePlanQuery;
    }

    public RouteSearch$DrivePlanQuery() {
        this.f1036c = 1;
        this.d = 0;
        this.f1037e = 0;
        this.f = 0;
        this.g = 48;
    }

    public RouteSearch$DrivePlanQuery(Parcel parcel) {
        this.f1036c = 1;
        this.d = 0;
        this.f1037e = 0;
        this.f = 0;
        this.g = 48;
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readString();
        this.f1036c = parcel.readInt();
        this.d = parcel.readInt();
        this.f1037e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
}
