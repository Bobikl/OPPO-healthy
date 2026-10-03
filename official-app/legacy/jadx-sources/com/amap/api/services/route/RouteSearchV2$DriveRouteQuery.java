package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.azf;
import com.oplus.aiunit.vision.qxm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchV2$DriveRouteQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearchV2$DriveRouteQuery> CREATOR = new a();
    private RouteSearchV2$FromAndTo a;
    private azf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1052c;
    private List<LatLonPoint> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<List<LatLonPoint>> f1053e;
    private String f;
    private boolean g;
    private int h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1054j;

    public static class a implements Parcelable.Creator<RouteSearchV2$DriveRouteQuery> {
        public static RouteSearchV2$DriveRouteQuery a(Parcel parcel) {
            return new RouteSearchV2$DriveRouteQuery(parcel);
        }

        public static RouteSearchV2$DriveRouteQuery[] b(int i) {
            return new RouteSearchV2$DriveRouteQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$DriveRouteQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$DriveRouteQuery[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearchV2$DriveRouteQuery(RouteSearchV2$FromAndTo routeSearchV2$FromAndTo, RouteSearchV2$DrivingStrategy routeSearchV2$DrivingStrategy, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
        this.f1052c = RouteSearchV2$DrivingStrategy.DEFAULT.getValue();
        this.g = true;
        this.h = 0;
        this.i = null;
        this.f1054j = 1;
        this.a = routeSearchV2$FromAndTo;
        this.f1052c = routeSearchV2$DrivingStrategy.getValue();
        this.d = list;
        this.f1053e = list2;
        this.f = str;
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
        RouteSearchV2$DriveRouteQuery routeSearchV2$DriveRouteQuery = (RouteSearchV2$DriveRouteQuery) obj;
        String str = this.f;
        if (str == null) {
            if (routeSearchV2$DriveRouteQuery.f != null) {
                return false;
            }
        } else if (!str.equals(routeSearchV2$DriveRouteQuery.f)) {
            return false;
        }
        List<List<LatLonPoint>> list = this.f1053e;
        if (list == null) {
            if (routeSearchV2$DriveRouteQuery.f1053e != null) {
                return false;
            }
        } else if (!list.equals(routeSearchV2$DriveRouteQuery.f1053e)) {
            return false;
        }
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = this.a;
        if (routeSearchV2$FromAndTo == null) {
            if (routeSearchV2$DriveRouteQuery.a != null) {
                return false;
            }
        } else if (!routeSearchV2$FromAndTo.equals(routeSearchV2$DriveRouteQuery.a)) {
            return false;
        }
        if (this.f1052c != routeSearchV2$DriveRouteQuery.f1052c) {
            return false;
        }
        List<LatLonPoint> list2 = this.d;
        if (list2 == null) {
            if (routeSearchV2$DriveRouteQuery.d != null) {
                return false;
            }
        } else if (!list2.equals(routeSearchV2$DriveRouteQuery.d) || this.g != routeSearchV2$DriveRouteQuery.isUseFerry() || this.h != routeSearchV2$DriveRouteQuery.h || this.f1054j != routeSearchV2$DriveRouteQuery.f1054j) {
            return false;
        }
        return true;
    }

    public String getAvoidRoad() {
        return this.f;
    }

    public List<List<LatLonPoint>> getAvoidpolygons() {
        return this.f1053e;
    }

    public String getAvoidpolygonsStr() {
        StringBuffer stringBuffer = new StringBuffer();
        List<List<LatLonPoint>> list = this.f1053e;
        if (list == null || list.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.f1053e.size(); i++) {
            List<LatLonPoint> list2 = this.f1053e.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                LatLonPoint latLonPoint = list2.get(i2);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i2 < list2.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            if (i < this.f1053e.size() - 1) {
                stringBuffer.append("|");
            }
        }
        return stringBuffer.toString();
    }

    public int getCarType() {
        return this.h;
    }

    public String getExclude() {
        return this.i;
    }

    public RouteSearchV2$FromAndTo getFromAndTo() {
        return this.a;
    }

    public RouteSearchV2$DrivingStrategy getMode() {
        return RouteSearchV2$DrivingStrategy.fromValue(this.f1052c);
    }

    public azf getNewEnergy() {
        return null;
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

    public int getShowFields() {
        return this.f1054j;
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
        String str = this.f;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        List<List<LatLonPoint>> list = this.f1053e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = this.a;
        int iHashCode3 = (((iHashCode2 + (routeSearchV2$FromAndTo == null ? 0 : routeSearchV2$FromAndTo.hashCode())) * 31) + this.f1052c) * 31;
        List<LatLonPoint> list2 = this.d;
        return ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.h;
    }

    public boolean isUseFerry() {
        return this.g;
    }

    public void setCarType(int i) {
        this.h = i;
    }

    public void setExclude(String str) {
        this.i = str;
    }

    public void setNewEnergy(azf azfVar) {
    }

    public void setShowFields(int i) {
        this.f1054j = i;
    }

    public void setUseFerry(boolean z) {
        this.g = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.f1052c);
        parcel.writeTypedList(this.d);
        List<List<LatLonPoint>> list = this.f1053e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(list.size());
            Iterator<List<LatLonPoint>> it = this.f1053e.iterator();
            while (it.hasNext()) {
                parcel.writeTypedList(it.next());
            }
        }
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.f1054j);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearchV2$DriveRouteQuery m4494clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearchV2", "DriveRouteQueryclone");
        }
        RouteSearchV2$DriveRouteQuery routeSearchV2$DriveRouteQuery = new RouteSearchV2$DriveRouteQuery(this.a, RouteSearchV2$DrivingStrategy.fromValue(this.f1052c), this.d, this.f1053e, this.f);
        routeSearchV2$DriveRouteQuery.setUseFerry(this.g);
        routeSearchV2$DriveRouteQuery.setCarType(this.h);
        routeSearchV2$DriveRouteQuery.setExclude(this.i);
        routeSearchV2$DriveRouteQuery.setShowFields(this.f1054j);
        routeSearchV2$DriveRouteQuery.setNewEnergy(null);
        return routeSearchV2$DriveRouteQuery;
    }

    public RouteSearchV2$DriveRouteQuery(Parcel parcel) {
        this.f1052c = RouteSearchV2$DrivingStrategy.DEFAULT.getValue();
        this.g = true;
        this.h = 0;
        this.i = null;
        this.f1054j = 1;
        this.a = (RouteSearchV2$FromAndTo) parcel.readParcelable(RouteSearchV2$FromAndTo.class.getClassLoader());
        this.f1052c = parcel.readInt();
        this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        int i = parcel.readInt();
        if (i == 0) {
            this.f1053e = null;
        } else {
            this.f1053e = new ArrayList();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f1053e.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
        }
        this.f = parcel.readString();
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.f1054j = parcel.readInt();
    }

    public RouteSearchV2$DriveRouteQuery() {
        this.f1052c = RouteSearchV2$DrivingStrategy.DEFAULT.getValue();
        this.g = true;
        this.h = 0;
        this.i = null;
        this.f1054j = 1;
    }
}
