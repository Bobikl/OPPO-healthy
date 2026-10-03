package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<RoutePlanResult> CREATOR = new a();
    private LatLonPoint a;
    private LatLonPoint b;

    public static class a implements Parcelable.Creator<RoutePlanResult> {
        public static RoutePlanResult a(Parcel parcel) {
            return new RoutePlanResult(parcel);
        }

        public static RoutePlanResult[] b(int i) {
            return new RoutePlanResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePlanResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoutePlanResult[] newArray(int i) {
            return b(i);
        }
    }

    public RoutePlanResult(Parcel parcel) {
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

    public RoutePlanResult() {
    }
}
