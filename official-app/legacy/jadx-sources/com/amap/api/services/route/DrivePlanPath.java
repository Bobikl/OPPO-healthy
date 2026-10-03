package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DrivePlanPath implements Parcelable {
    public static final Parcelable.Creator<DrivePlanPath> CREATOR = new a();
    float a;
    int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<DrivePlanStep> f1013c;

    public static class a implements Parcelable.Creator<DrivePlanPath> {
        public static DrivePlanPath a(Parcel parcel) {
            return new DrivePlanPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrivePlanPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DrivePlanPath[] newArray(int i) {
            return null;
        }
    }

    public DrivePlanPath(Parcel parcel) {
        this.f1013c = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
        this.f1013c = parcel.createTypedArrayList(DrivePlanStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.a;
    }

    public List<DrivePlanStep> getSteps() {
        return this.f1013c;
    }

    public float getTrafficLights() {
        return this.b;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public void setSteps(List<DrivePlanStep> list) {
        this.f1013c = list;
    }

    public void setTrafficLights(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.f1013c);
    }

    public DrivePlanPath() {
        this.f1013c = new ArrayList();
    }
}
