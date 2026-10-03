package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DistanceResult implements Parcelable {
    public static final Parcelable.Creator<DistanceResult> CREATOR = new a();
    private DistanceSearch$DistanceQuery a;
    private List<DistanceItem> b;

    public static class a implements Parcelable.Creator<DistanceResult> {
        public static DistanceResult a(Parcel parcel) {
            return new DistanceResult(parcel);
        }

        public static DistanceResult[] b(int i) {
            return new DistanceResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult[] newArray(int i) {
            return b(i);
        }
    }

    public DistanceResult() {
        this.b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DistanceSearch$DistanceQuery getDistanceQuery() {
        return this.a;
    }

    public List<DistanceItem> getDistanceResults() {
        return this.b;
    }

    public void setDistanceQuery(DistanceSearch$DistanceQuery distanceSearch$DistanceQuery) {
        this.a = distanceSearch$DistanceQuery;
    }

    public void setDistanceResults(List<DistanceItem> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    public DistanceResult(Parcel parcel) {
        this.b = null;
        this.b = parcel.createTypedArrayList(DistanceItem.CREATOR);
    }
}
