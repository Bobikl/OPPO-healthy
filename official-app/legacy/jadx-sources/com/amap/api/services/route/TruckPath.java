package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TruckPath implements Parcelable {
    public static final Parcelable.Creator<TruckPath> CREATOR = new a();
    private float a;
    private long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f1067c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1068e;
    private int f;
    private int g;
    private List<TruckStep> h;

    public static class a implements Parcelable.Creator<TruckPath> {
        public static TruckPath a(Parcel parcel) {
            return new TruckPath(parcel);
        }

        public static TruckPath[] b(int i) {
            return new TruckPath[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TruckPath[] newArray(int i) {
            return b(i);
        }
    }

    public TruckPath() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.a;
    }

    public long getDuration() {
        return this.b;
    }

    public int getRestriction() {
        return this.g;
    }

    public List<TruckStep> getSteps() {
        return this.h;
    }

    public String getStrategy() {
        return this.f1067c;
    }

    public float getTollDistance() {
        return this.f1068e;
    }

    public float getTolls() {
        return this.d;
    }

    public int getTotalTrafficlights() {
        return this.f;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public void setDuration(long j2) {
        this.b = j2;
    }

    public void setRestriction(int i) {
        this.g = i;
    }

    public void setSteps(List<TruckStep> list) {
        this.h = list;
    }

    public void setStrategy(String str) {
        this.f1067c = str;
    }

    public void setTollDistance(float f) {
        this.f1068e = f;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public void setTotalTrafficlights(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.f1067c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.f1068e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeTypedList(this.h);
    }

    public TruckPath(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readLong();
        this.f1067c = parcel.readString();
        this.d = parcel.readFloat();
        this.f1068e = parcel.readFloat();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createTypedArrayList(TruckStep.CREATOR);
    }
}
