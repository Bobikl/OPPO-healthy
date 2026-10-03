package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f975c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LatLonPoint f976e;

    public static class a implements Parcelable.Creator<RegeocodeRoad> {
        public static RegeocodeRoad a(Parcel parcel) {
            return new RegeocodeRoad(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegeocodeRoad createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegeocodeRoad[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ RegeocodeRoad(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDirection() {
        return this.d;
    }

    public final float getDistance() {
        return this.f975c;
    }

    public final String getId() {
        return this.a;
    }

    public final LatLonPoint getLatLngPoint() {
        return this.f976e;
    }

    public final String getName() {
        return this.b;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final void setDistance(float f) {
        this.f975c = f;
    }

    public final void setId(String str) {
        this.a = str;
    }

    public final void setLatLngPoint(LatLonPoint latLonPoint) {
        this.f976e = latLonPoint;
    }

    public final void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeFloat(this.f975c);
        parcel.writeString(this.d);
        parcel.writeValue(this.f976e);
    }

    public RegeocodeRoad() {
    }

    private RegeocodeRoad(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f975c = parcel.readFloat();
        this.d = parcel.readString();
        this.f976e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }
}
