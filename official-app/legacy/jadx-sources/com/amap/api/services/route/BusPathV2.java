package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusPathV2 extends Path {
    public static final Parcelable.Creator<BusPathV2> CREATOR = new a();
    private float a;
    private boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f997c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BusStepV2> f998e;

    public static class a implements Parcelable.Creator<BusPathV2> {
        public static BusPathV2 a(Parcel parcel) {
            return new BusPathV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusPathV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusPathV2[] newArray(int i) {
            return null;
        }
    }

    public BusPathV2(Parcel parcel) {
        super(parcel);
        this.f998e = new ArrayList();
        this.a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.b = zArr[0];
        this.f997c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f998e = parcel.createTypedArrayList(BusStepV2.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBusDistance() {
        return this.d;
    }

    public float getCost() {
        return this.a;
    }

    public List<BusStepV2> getSteps() {
        return this.f998e;
    }

    public float getWalkDistance() {
        return this.f997c;
    }

    public boolean isNightBus() {
        return this.b;
    }

    public void setBusDistance(float f) {
        this.d = f;
    }

    public void setCost(float f) {
        this.a = f;
    }

    public void setNightBus(boolean z) {
        this.b = z;
    }

    public void setSteps(List<BusStepV2> list) {
        this.f998e = list;
    }

    public void setWalkDistance(float f) {
        this.f997c = f;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeBooleanArray(new boolean[]{this.b});
        parcel.writeFloat(this.f997c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.f998e);
    }

    public BusPathV2() {
        this.f998e = new ArrayList();
    }
}
