package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DriveRouteResult extends RouteResult {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new a();
    private float a;
    private List<DrivePath> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch$DriveRouteQuery f1017c;

    public static class a implements Parcelable.Creator<DriveRouteResult> {
        public static DriveRouteResult a(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }

        public static DriveRouteResult[] b(int i) {
            return new DriveRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResult[] newArray(int i) {
            return b(i);
        }
    }

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.b = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.f1017c = (RouteSearch$DriveRouteQuery) parcel.readParcelable(RouteSearch$DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch$DriveRouteQuery getDriveQuery() {
        return this.f1017c;
    }

    public List<DrivePath> getPaths() {
        return this.b;
    }

    public float getTaxiCost() {
        return this.a;
    }

    public void setDriveQuery(RouteSearch$DriveRouteQuery routeSearch$DriveRouteQuery) {
        this.f1017c = routeSearch$DriveRouteQuery;
    }

    public void setPaths(List<DrivePath> list) {
        this.b = list;
    }

    public void setTaxiCost(float f) {
        this.a = f;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1017c, i);
    }

    public DriveRouteResult() {
        this.b = new ArrayList();
    }
}
