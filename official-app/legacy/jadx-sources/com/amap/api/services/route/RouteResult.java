package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class RouteResult implements Parcelable {
    public static final Parcelable.Creator<RouteResult> CREATOR = new a();
    private LatLonPoint a;
    private LatLonPoint b;

    public static class a implements Parcelable.Creator<RouteResult> {
        public static RouteResult a(Parcel parcel) {
            return new RouteResult(parcel);
        }

        public static RouteResult[] b(int i) {
            return new RouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RouteResult[] newArray(int i) {
            return b(i);
        }
    }

    public RouteResult(Parcel parcel) {
        this.a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getStartPos() {
        return this.a;
    }

    public LatLonPoint getTargetPos() {
        return this.b;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public RouteResult() {
    }
}
