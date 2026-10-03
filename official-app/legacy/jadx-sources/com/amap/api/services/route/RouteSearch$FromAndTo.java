package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class RouteSearch$FromAndTo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RouteSearch$FromAndTo> CREATOR = new a();
    private LatLonPoint a;
    private LatLonPoint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1040c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1041e;
    private String f;
    private String g;
    private String h;

    public static class a implements Parcelable.Creator<RouteSearch$FromAndTo> {
        public static RouteSearch$FromAndTo a(Parcel parcel) {
            return new RouteSearch$FromAndTo(parcel);
        }

        public static RouteSearch$FromAndTo[] b(int i) {
            return new RouteSearch$FromAndTo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$FromAndTo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteSearch$FromAndTo[] newArray(int i) {
            return b(i);
        }
    }

    public RouteSearch$FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
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
        RouteSearch$FromAndTo routeSearch$FromAndTo = (RouteSearch$FromAndTo) obj;
        String str = this.d;
        if (str == null) {
            if (routeSearch$FromAndTo.d != null) {
                return false;
            }
        } else if (!str.equals(routeSearch$FromAndTo.d)) {
            return false;
        }
        LatLonPoint latLonPoint = this.a;
        if (latLonPoint == null) {
            if (routeSearch$FromAndTo.a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(routeSearch$FromAndTo.a)) {
            return false;
        }
        String str2 = this.f1040c;
        if (str2 == null) {
            if (routeSearch$FromAndTo.f1040c != null) {
                return false;
            }
        } else if (!str2.equals(routeSearch$FromAndTo.f1040c)) {
            return false;
        }
        LatLonPoint latLonPoint2 = this.b;
        if (latLonPoint2 == null) {
            if (routeSearch$FromAndTo.b != null) {
                return false;
            }
        } else if (!latLonPoint2.equals(routeSearch$FromAndTo.b)) {
            return false;
        }
        String str3 = this.f1041e;
        if (str3 == null) {
            if (routeSearch$FromAndTo.f1041e != null) {
                return false;
            }
        } else if (!str3.equals(routeSearch$FromAndTo.f1041e)) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null) {
            if (routeSearch$FromAndTo.f != null) {
                return false;
            }
        } else if (!str4.equals(routeSearch$FromAndTo.f)) {
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
        return this.f1041e;
    }

    public String getPlateNumber() {
        return this.h;
    }

    public String getPlateProvince() {
        return this.g;
    }

    public String getStartPoiID() {
        return this.f1040c;
    }

    public LatLonPoint getTo() {
        return this.b;
    }

    public int hashCode() {
        String str = this.d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.a;
        int iHashCode2 = (iHashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
        String str2 = this.f1040c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LatLonPoint latLonPoint2 = this.b;
        int iHashCode4 = (iHashCode3 + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
        String str3 = this.f1041e;
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
        this.f1041e = str;
    }

    public void setPlateNumber(String str) {
        this.h = str;
    }

    public void setPlateProvince(String str) {
        this.g = str;
    }

    public void setStartPoiID(String str) {
        this.f1040c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.f1040c);
        parcel.writeString(this.d);
        parcel.writeString(this.f1041e);
        parcel.writeString(this.f);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteSearch$FromAndTo m4489clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "RouteSearch", "FromAndToclone");
        }
        RouteSearch$FromAndTo routeSearch$FromAndTo = new RouteSearch$FromAndTo(this.a, this.b);
        routeSearch$FromAndTo.setStartPoiID(this.f1040c);
        routeSearch$FromAndTo.setDestinationPoiID(this.d);
        routeSearch$FromAndTo.setOriginType(this.f1041e);
        routeSearch$FromAndTo.setDestinationType(this.f);
        return routeSearch$FromAndTo;
    }

    public RouteSearch$FromAndTo(Parcel parcel) {
        this.a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f1040c = parcel.readString();
        this.d = parcel.readString();
        this.f1041e = parcel.readString();
        this.f = parcel.readString();
    }

    public RouteSearch$FromAndTo() {
    }
}
