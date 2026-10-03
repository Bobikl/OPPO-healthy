package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$DriveRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$DriveRouteQuery> CREATOR = new a();
    private RouteSearch$FromAndTo a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLonPoint> f1038c;
    private List<List<LatLonPoint>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1039e;
    private boolean f;
    private int g;
    private String h;
    private String i;

    public static class a implements Parcelable.Creator<RouteSearch$DriveRouteQuery> {
        public static RouteSearch$DriveRouteQuery a(Parcel parcel) {
            return new RouteSearch$DriveRouteQuery(parcel);
        }

        public static RouteSearch$DriveRouteQuery[] b(int i) {
            return new RouteSearch$DriveRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$DriveRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$DriveRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$DriveRouteQuery(RouteSearch$FromAndTo routeSearch$FromAndTo, int i, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
        this.f = true;
        this.g = 0;
        this.h = null;
        this.i = "base";
        this.a = routeSearch$FromAndTo;
        this.b = i;
        this.f1038c = list;
        this.d = list2;
        this.f1039e = str;
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
        RouteSearch$DriveRouteQuery routeSearch$DriveRouteQuery = (RouteSearch$DriveRouteQuery) obj;
        String str = this.f1039e;
        if (str == null) {
            if (routeSearch$DriveRouteQuery.f1039e != null) {
                return false;
            }
        } else if (!str.equals(routeSearch$DriveRouteQuery.f1039e)) {
            return false;
        }
        List<List<LatLonPoint>> list = this.d;
        if (list == null) {
            if (routeSearch$DriveRouteQuery.d != null) {
                return false;
            }
        } else if (!list.equals(routeSearch$DriveRouteQuery.d)) {
            return false;
        }
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        if (routeSearch$FromAndTo == null) {
            if (routeSearch$DriveRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearch$FromAndTo.equals(routeSearch$DriveRouteQuery.a)) {
            return false;
        }
        if (this.b != routeSearch$DriveRouteQuery.b) {
            return false;
        }
        List<LatLonPoint> list2 = this.f1038c;
        if (list2 == null) {
            if (routeSearch$DriveRouteQuery.f1038c != null) {
                return false;
            }
        } else if (!list2.equals(routeSearch$DriveRouteQuery.f1038c) || this.f != routeSearch$DriveRouteQuery.isUseFerry() || this.g != routeSearch$DriveRouteQuery.g) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null) {
            if (routeSearch$DriveRouteQuery.i != null) {
                return false;
            }
        } else if (!str2.equals(routeSearch$DriveRouteQuery.i)) {
            return false;
        }
        return true;
    }

    public String getAvoidRoad() {
        return this.f1039e;
    }

    public List<List<LatLonPoint>> getAvoidpolygons() {
        return this.d;
    }

    public String getAvoidpolygonsStr() {
        StringBuffer stringBuffer = new StringBuffer();
        List<List<LatLonPoint>> list = this.d;
        if (list == null || list.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.d.size(); i++) {
            List<LatLonPoint> list2 = this.d.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                LatLonPoint latLonPoint = list2.get(i2);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i2 < list2.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            if (i < this.d.size() - 1) {
                stringBuffer.append("|");
            }
        }
        return stringBuffer.toString();
    }

    public int getCarType() {
        return this.g;
    }

    public String getExclude() {
        return this.h;
    }

    public String getExtensions() {
        return this.i;
    }

    public RouteSearch$FromAndTo getFromAndTo() {
        return this.a;
    }

    public int getMode() {
        return this.b;
    }

    public List<LatLonPoint> getPassedByPoints() {
        return this.f1038c;
    }

    public String getPassedPointStr() {
        StringBuffer stringBuffer = new StringBuffer();
        List<LatLonPoint> list = this.f1038c;
        if (list == null || list.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.f1038c.size(); i++) {
            LatLonPoint latLonPoint = this.f1038c.get(i);
            stringBuffer.append(latLonPoint.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(latLonPoint.getLatitude());
            if (i < this.f1038c.size() - 1) {
                stringBuffer.append(";");
            }
        }
        return stringBuffer.toString();
    }

    public boolean hasAvoidRoad() {
        return !qxm.h(getAvoidRoad());
    }

    public boolean hasAvoidpolygons() {
        return !qxm.h(getAvoidpolygonsStr());
    }

    public boolean hasPassPoint() {
        return !qxm.h(getPassedPointStr());
    }

    public int hashCode() {
        String str = this.f1039e;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        List<List<LatLonPoint>> list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RouteSearch$FromAndTo routeSearch$FromAndTo = this.a;
        int iHashCode3 = (((iHashCode2 + (routeSearch$FromAndTo == null ? 0 : routeSearch$FromAndTo.hashCode())) * 31) + this.b) * 31;
        List<LatLonPoint> list2 = this.f1038c;
        return ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.g;
    }

    public boolean isUseFerry() {
        return this.f;
    }

    public void setCarType(int i) {
        this.g = i;
    }

    public void setExclude(String str) {
        this.h = str;
    }

    public void setExtensions(String str) {
        this.i = str;
    }

    public void setUseFerry(boolean z) {
        this.f = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.f1038c);
        List<List<LatLonPoint>> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(list.size());
            Iterator<List<LatLonPoint>> it = this.d.iterator();
            while (it.hasNext()) {
                parcel.writeTypedList(it.next());
            }
        }
        parcel.writeString(this.f1039e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$DriveRouteQuery m4488clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "DriveRouteQueryclone");
        }
        RouteSearch$DriveRouteQuery routeSearch$DriveRouteQuery = new RouteSearch$DriveRouteQuery(this.a, this.b, this.f1038c, this.d, this.f1039e);
        routeSearch$DriveRouteQuery.setUseFerry(this.f);
        routeSearch$DriveRouteQuery.setCarType(this.g);
        routeSearch$DriveRouteQuery.setExclude(this.h);
        routeSearch$DriveRouteQuery.setExtensions(this.i);
        return routeSearch$DriveRouteQuery;
    }

    public RouteSearch$DriveRouteQuery(Parcel parcel) {
        this.f = true;
        this.g = 0;
        this.h = null;
        this.i = "base";
        this.a = (RouteSearch$FromAndTo) parcel.readParcelable(RouteSearch$FromAndTo.class.getClassLoader());
        this.b = parcel.readInt();
        this.f1038c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        int i = parcel.readInt();
        if (i == 0) {
            this.d = null;
        } else {
            this.d = new ArrayList();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.d.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
        }
        this.f1039e = parcel.readString();
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    public RouteSearch$DriveRouteQuery() {
        this.f = true;
        this.g = 0;
        this.h = null;
        this.i = "base";
    }
}
