package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class LatLonSharePoint extends LatLonPoint {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<LatLonSharePoint> {
        public static LatLonSharePoint a(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }

        public static LatLonSharePoint[] b(int i) {
            return new LatLonSharePoint[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLonSharePoint[] newArray(int i) {
            return b(i);
        }
    }

    public LatLonSharePoint(double d, double d2, String str) {
        super(d, d2);
        this.a = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LatLonSharePoint latLonSharePoint = (LatLonSharePoint) obj;
        String str = this.a;
        if (str == null) {
            if (latLonSharePoint.a != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.a)) {
            return false;
        }
        return true;
    }

    public String getSharePointName() {
        return this.a;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public void setSharePointName(String str) {
        this.a = str;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public String toString() {
        return super.toString() + "," + this.a;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }
}
