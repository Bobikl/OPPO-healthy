package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class BusinessArea implements Parcelable {
    public static final Parcelable.Creator<BusinessArea> CREATOR = new a();
    private LatLonPoint a;
    private String b;

    public static class a implements Parcelable.Creator<BusinessArea> {
        public static BusinessArea a(Parcel parcel) {
            return new BusinessArea(parcel);
        }

        public static BusinessArea[] b(int i) {
            return new BusinessArea[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusinessArea createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusinessArea[] newArray(int i) {
            return b(i);
        }
    }

    public BusinessArea() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.a = latLonPoint;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }

    public BusinessArea(Parcel parcel) {
        this.a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = parcel.readString();
    }
}
