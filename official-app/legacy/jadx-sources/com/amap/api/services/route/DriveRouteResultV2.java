package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DriveRouteResultV2 extends RouteResult {
    public static final Parcelable.Creator<DriveRouteResultV2> CREATOR = new a();
    private float a;
    private List<DrivePathV2> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearchV2$DriveRouteQuery f1018c;

    public static class a implements Parcelable.Creator<DriveRouteResultV2> {
        public static DriveRouteResultV2 a(Parcel parcel) {
            return new DriveRouteResultV2(parcel);
        }

        public static DriveRouteResultV2[] b(int i) {
            return new DriveRouteResultV2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRouteResultV2[] newArray(int i) {
            return b(i);
        }
    }

    public DriveRouteResultV2(Parcel parcel) {
        super(parcel);
        this.b = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(DrivePathV2.CREATOR);
        this.f1018c = (RouteSearchV2$DriveRouteQuery) parcel.readParcelable(RouteSearchV2$DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearchV2$DriveRouteQuery getDriveQuery() {
        return this.f1018c;
    }

    public List<DrivePathV2> getPaths() {
        return this.b;
    }

    public float getTaxiCost() {
        return this.a;
    }

    public void setDriveQuery(RouteSearchV2$DriveRouteQuery routeSearchV2$DriveRouteQuery) {
        this.f1018c = routeSearchV2$DriveRouteQuery;
    }

    public void setPaths(List<DrivePathV2> list) {
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
        parcel.writeParcelable(this.f1018c, i);
    }

    public DriveRouteResultV2() {
        this.b = new ArrayList();
    }
}
