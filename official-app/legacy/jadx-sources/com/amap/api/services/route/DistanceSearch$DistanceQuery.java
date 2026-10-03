package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DistanceSearch$DistanceQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistanceSearch$DistanceQuery> CREATOR = new a();
    private int a;
    private List<LatLonPoint> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f1007c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1008e;

    public static class a implements Parcelable.Creator<DistanceSearch$DistanceQuery> {
        public static DistanceSearch$DistanceQuery a(Parcel parcel) {
            return new DistanceSearch$DistanceQuery(parcel);
        }

        public static DistanceSearch$DistanceQuery[] b(int i) {
            return new DistanceSearch$DistanceQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceSearch$DistanceQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceSearch$DistanceQuery[] newArray(int i) {
            return b(i);
        }
    }

    public DistanceSearch$DistanceQuery() {
        this.a = 1;
        this.b = new ArrayList();
        this.d = "base";
        this.f1008e = 4;
    }

    public void addOrigins(LatLonPoint... latLonPointArr) {
        for (LatLonPoint latLonPoint : latLonPointArr) {
            if (latLonPoint != null) {
                this.b.add(latLonPoint);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getDestination() {
        return this.f1007c;
    }

    public String getExtensions() {
        return this.d;
    }

    public int getMode() {
        return this.f1008e;
    }

    public List<LatLonPoint> getOrigins() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f1007c = latLonPoint;
    }

    public void setExtensions(String str) {
        this.d = str;
    }

    public void setMode(int i) {
        this.f1008e = i;
    }

    public void setOrigins(List<LatLonPoint> list) {
        if (list != null) {
            this.b = list;
        }
    }

    public void setType(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.f1007c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.f1008e);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DistanceSearch$DistanceQuery m4485clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "DistanceSearch", "DistanceQueryclone");
        }
        DistanceSearch$DistanceQuery distanceSearch$DistanceQuery = new DistanceSearch$DistanceQuery();
        distanceSearch$DistanceQuery.setType(this.a);
        distanceSearch$DistanceQuery.setOrigins(this.b);
        distanceSearch$DistanceQuery.setDestination(this.f1007c);
        distanceSearch$DistanceQuery.setExtensions(this.d);
        distanceSearch$DistanceQuery.setMode(this.f1008e);
        return distanceSearch$DistanceQuery;
    }

    public DistanceSearch$DistanceQuery(Parcel parcel) {
        this.a = 1;
        this.b = new ArrayList();
        this.d = "base";
        this.f1008e = 4;
        this.a = parcel.readInt();
        this.b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f1007c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.f1008e = parcel.readInt();
    }
}
