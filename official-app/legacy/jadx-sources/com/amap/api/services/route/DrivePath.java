package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DrivePath extends Path {
    public static final Parcelable.Creator<DrivePath> CREATOR = new a();
    private String a;
    private float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1009c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<DriveStep> f1010e;
    private int f;

    public static class a implements Parcelable.Creator<DrivePath> {
        public static DrivePath a(Parcel parcel) {
            return new DrivePath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePath[] newArray(int i) {
            return null;
        }
    }

    public DrivePath(Parcel parcel) {
        super(parcel);
        this.f1010e = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.f1009c = parcel.readFloat();
        this.f1010e = parcel.createTypedArrayList(DriveStep.CREATOR);
        this.d = parcel.readInt();
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getRestriction() {
        return this.f;
    }

    public List<DriveStep> getSteps() {
        return this.f1010e;
    }

    public String getStrategy() {
        return this.a;
    }

    public float getTollDistance() {
        return this.f1009c;
    }

    public float getTolls() {
        return this.b;
    }

    public int getTotalTrafficlights() {
        return this.d;
    }

    public void setRestriction(int i) {
        this.f = i;
    }

    public void setSteps(List<DriveStep> list) {
        this.f1010e = list;
    }

    public void setStrategy(String str) {
        this.a = str;
    }

    public void setTollDistance(float f) {
        this.f1009c = f;
    }

    public void setTolls(float f) {
        this.b = f;
    }

    public void setTotalTrafficlights(int i) {
        this.d = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.f1009c);
        parcel.writeTypedList(this.f1010e);
        parcel.writeInt(this.d);
    }

    public DrivePath() {
        this.f1010e = new ArrayList();
    }
}
