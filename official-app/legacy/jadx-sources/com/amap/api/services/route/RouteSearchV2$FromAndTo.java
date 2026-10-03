package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearchV2$FromAndTo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearchV2$FromAndTo> CREATOR = new a();
    private LatLonPoint a;
    private LatLonPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1055c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1056e;
    private String f;
    private String g;

    public static class a implements Parcelable.Creator<RouteSearchV2$FromAndTo> {
        public static RouteSearchV2$FromAndTo a(Parcel parcel) {
            return new RouteSearchV2$FromAndTo(parcel);
        }

        public static RouteSearchV2$FromAndTo[] b(int i) {
            return new RouteSearchV2$FromAndTo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$FromAndTo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearchV2$FromAndTo[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearchV2$FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        this.a = latLonPoint;
        this.b = latLonPoint2;
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
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = (RouteSearchV2$FromAndTo) obj;
        String str = this.d;
        if (str == null) {
            if (routeSearchV2$FromAndTo.d != null) {
                return false;
            }
        } else if (!str.equals(routeSearchV2$FromAndTo.d)) {
            return false;
        }
        LatLonPoint latLonPoint = this.a;
        if (latLonPoint == null) {
            if (routeSearchV2$FromAndTo.a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(routeSearchV2$FromAndTo.a)) {
            return false;
        }
        String str2 = this.f1055c;
        if (str2 == null) {
            if (routeSearchV2$FromAndTo.f1055c != null) {
                return false;
            }
        } else if (!str2.equals(routeSearchV2$FromAndTo.f1055c)) {
            return false;
        }
        LatLonPoint latLonPoint2 = this.b;
        if (latLonPoint2 == null) {
            if (routeSearchV2$FromAndTo.b != null) {
                return false;
            }
        } else if (!latLonPoint2.equals(routeSearchV2$FromAndTo.b)) {
            return false;
        }
        String str3 = this.f1056e;
        if (str3 == null) {
            if (routeSearchV2$FromAndTo.f1056e != null) {
                return false;
            }
        } else if (!str3.equals(routeSearchV2$FromAndTo.f1056e)) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null) {
            if (routeSearchV2$FromAndTo.f != null) {
                return false;
            }
        } else if (!str4.equals(routeSearchV2$FromAndTo.f)) {
            return false;
        }
        return true;
    }

    public String getDestinationPoiID() {
        return this.d;
    }

    public String getDestinationType() {
        return this.f;
    }

    public LatLonPoint getFrom() {
        return this.a;
    }

    public String getOriginType() {
        return this.f1056e;
    }

    public String getPlateNumber() {
        return this.g;
    }

    public String getStartPoiID() {
        return this.f1055c;
    }

    public LatLonPoint getTo() {
        return this.b;
    }

    public int hashCode() {
        String str = this.d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.a;
        int iHashCode2 = (iHashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
        String str2 = this.f1055c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LatLonPoint latLonPoint2 = this.b;
        int iHashCode4 = (iHashCode3 + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
        String str3 = this.f1056e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public void setDestinationPoiID(String str) {
        this.d = str;
    }

    public void setDestinationType(String str) {
        this.f = str;
    }

    public void setOriginType(String str) {
        this.f1056e = str;
    }

    public void setPlateNumber(String str) {
        this.g = str;
    }

    public void setStartPoiID(String str) {
        this.f1055c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.f1055c);
        parcel.writeString(this.d);
        parcel.writeString(this.f1056e);
        parcel.writeString(this.f);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearchV2$FromAndTo m4495clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearchV2", "FromAndToclone");
        }
        RouteSearchV2$FromAndTo routeSearchV2$FromAndTo = new RouteSearchV2$FromAndTo(this.a, this.b);
        routeSearchV2$FromAndTo.setStartPoiID(this.f1055c);
        routeSearchV2$FromAndTo.setDestinationPoiID(this.d);
        routeSearchV2$FromAndTo.setOriginType(this.f1056e);
        routeSearchV2$FromAndTo.setDestinationType(this.f);
        return routeSearchV2$FromAndTo;
    }

    public RouteSearchV2$FromAndTo(Parcel parcel) {
        this.a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f1055c = parcel.readString();
        this.d = parcel.readString();
        this.f1056e = parcel.readString();
        this.f = parcel.readString();
    }

    public RouteSearchV2$FromAndTo() {
    }
}
