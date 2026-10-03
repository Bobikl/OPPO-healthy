package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public final class Crossroad extends Road {
    public static final Parcelable.Creator<Crossroad> CREATOR = new a();
    private float a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f991c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f992e;
    private String f;

    public static class a implements Parcelable.Creator<Crossroad> {
        public static Crossroad a(Parcel parcel) {
            return new Crossroad(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Crossroad createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Crossroad[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ Crossroad(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDirection() {
        return this.b;
    }

    public final float getDistance() {
        return this.a;
    }

    public final String getFirstRoadId() {
        return this.f991c;
    }

    public final String getFirstRoadName() {
        return this.d;
    }

    public final String getSecondRoadId() {
        return this.f992e;
    }

    public final String getSecondRoadName() {
        return this.f;
    }

    public final void setDirection(String str) {
        this.b = str;
    }

    public final void setDistance(float f) {
        this.a = f;
    }

    public final void setFirstRoadId(String str) {
        this.f991c = str;
    }

    public final void setFirstRoadName(String str) {
        this.d = str;
    }

    public final void setSecondRoadId(String str) {
        this.f992e = str;
    }

    public final void setSecondRoadName(String str) {
        this.f = str;
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f991c);
        parcel.writeString(this.d);
        parcel.writeString(this.f992e);
        parcel.writeString(this.f);
    }

    public Crossroad() {
    }

    private Crossroad(Parcel parcel) {
        super(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readString();
        this.f991c = parcel.readString();
        this.d = parcel.readString();
        this.f992e = parcel.readString();
        this.f = parcel.readString();
    }
}
