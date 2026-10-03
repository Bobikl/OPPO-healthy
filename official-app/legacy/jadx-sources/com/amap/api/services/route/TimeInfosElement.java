package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TimeInfosElement implements Parcelable {
    public static final Parcelable.Creator<TimeInfosElement> CREATOR = new a();
    int a;
    float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f1065c;
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<TMC> f1066e;

    public static class a implements Parcelable.Creator<TimeInfosElement> {
        public static TimeInfosElement a(Parcel parcel) {
            return new TimeInfosElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeInfosElement createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeInfosElement[] newArray(int i) {
            return null;
        }
    }

    public TimeInfosElement(Parcel parcel) {
        this.f1066e = new ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.f1065c = parcel.readFloat();
        this.d = parcel.readInt();
        this.f1066e = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDuration() {
        return this.b;
    }

    public int getPathindex() {
        return this.a;
    }

    public int getRestriction() {
        return this.d;
    }

    public List<TMC> getTMCs() {
        return this.f1066e;
    }

    public float getTolls() {
        return this.f1065c;
    }

    public void setDuration(float f) {
        this.b = f;
    }

    public void setPathindex(int i) {
        this.a = i;
    }

    public void setRestriction(int i) {
        this.d = i;
    }

    public void setTMCs(List<TMC> list) {
        this.f1066e = list;
    }

    public void setTolls(float f) {
        this.f1065c = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.f1065c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.f1066e);
    }

    public TimeInfosElement() {
        this.f1066e = new ArrayList();
    }
}
