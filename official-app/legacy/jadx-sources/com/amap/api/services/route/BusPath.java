package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BusPath extends Path {
    public static final Parcelable.Creator<BusPath> CREATOR = new a();
    private float a;
    private boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f995c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BusStep> f996e;

    public static class a implements Parcelable.Creator<BusPath> {
        public static BusPath a(Parcel parcel) {
            return new BusPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BusPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BusPath[] newArray(int i) {
            return null;
        }
    }

    public BusPath(Parcel parcel) {
        super(parcel);
        this.f996e = new ArrayList();
        this.a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.b = zArr[0];
        this.f995c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f996e = parcel.createTypedArrayList(BusStep.CREATOR);
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

    public List<BusStep> getSteps() {
        return this.f996e;
    }

    public float getWalkDistance() {
        return this.f995c;
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

    public void setSteps(List<BusStep> list) {
        this.f996e = list;
    }

    public void setWalkDistance(float f) {
        this.f995c = f;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeBooleanArray(new boolean[]{this.b});
        parcel.writeFloat(this.f995c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.f996e);
    }

    public BusPath() {
        this.f996e = new ArrayList();
    }
}
