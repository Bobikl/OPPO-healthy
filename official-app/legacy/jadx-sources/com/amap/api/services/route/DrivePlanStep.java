package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DrivePlanStep implements Parcelable {
    public static final Parcelable.Creator<DrivePlanStep> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1014c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<LatLonPoint> f1015e;

    public static class a implements Parcelable.Creator<DrivePlanStep> {
        public static DrivePlanStep a(Parcel parcel) {
            return new DrivePlanStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePlanStep createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePlanStep[] newArray(int i) {
            return null;
        }
    }

    public DrivePlanStep(Parcel parcel) {
        this.f1015e = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f1014c = parcel.readFloat();
        this.d = parcel.readInt() == 1;
        this.f1014c = parcel.readFloat();
        this.f1015e = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.b;
    }

    public float getDistance() {
        return this.f1014c;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f1015e;
    }

    public String getRoad() {
        return this.a;
    }

    public boolean getToll() {
        return this.d;
    }

    public void setAdCode(String str) {
        this.b = str;
    }

    public void setDistance(float f) {
        this.f1014c = f;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f1015e = list;
    }

    public void setRoad(String str) {
        this.a = str;
    }

    public void setToll(boolean z) {
        this.d = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeFloat(this.f1014c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeFloat(this.f1014c);
        parcel.writeTypedList(this.f1015e);
    }

    public DrivePlanStep() {
        this.f1015e = new ArrayList();
    }
}
