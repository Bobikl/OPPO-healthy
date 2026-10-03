package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DriveRoutePlanResult extends RoutePlanResult {
    public static final Parcelable.Creator<DriveRoutePlanResult> CREATOR = new a();
    private List<DrivePlanPath> a;
    private List<TimeInfo> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouteSearch$DrivePlanQuery f1016c;

    public static class a implements Parcelable.Creator<DriveRoutePlanResult> {
        public static DriveRoutePlanResult a(Parcel parcel) {
            return new DriveRoutePlanResult(parcel);
        }

        public static DriveRoutePlanResult[] b(int i) {
            return new DriveRoutePlanResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DriveRoutePlanResult[] newArray(int i) {
            return b(i);
        }
    }

    public DriveRoutePlanResult(Parcel parcel) {
        super(parcel);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.a = parcel.createTypedArrayList(DrivePlanPath.CREATOR);
        this.b = parcel.createTypedArrayList(TimeInfo.CREATOR);
        this.f1016c = (RouteSearch$DrivePlanQuery) parcel.readParcelable(RouteSearch$DrivePlanQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivePlanPath> getPaths() {
        return this.a;
    }

    public List<TimeInfo> getTimeInfos() {
        return this.b;
    }

    public void setDrivePlanQuery(RouteSearch$DrivePlanQuery routeSearch$DrivePlanQuery) {
        this.f1016c = routeSearch$DrivePlanQuery;
        RouteSearch$FromAndTo fromAndTo = routeSearch$DrivePlanQuery.getFromAndTo();
        if (fromAndTo != null) {
            setStartPos(fromAndTo.getFrom());
            setTargetPos(fromAndTo.getTo());
        }
    }

    public void setPaths(List<DrivePlanPath> list) {
        this.a = list;
    }

    public void setTimeInfos(List<TimeInfo> list) {
        this.b = list;
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1016c, i);
    }

    public DriveRoutePlanResult() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
