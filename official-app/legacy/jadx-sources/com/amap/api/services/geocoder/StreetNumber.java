package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLonPoint f977c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f978e;

    public static class a implements Parcelable.Creator<StreetNumber> {
        public static StreetNumber a(Parcel parcel) {
            return new StreetNumber(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetNumber createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetNumber[] newArray(int i) {
            return null;
        }
    }

    public /* synthetic */ StreetNumber(Parcel parcel, byte b) {
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
        return this.f978e;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.f977c;
    }

    public final String getNumber() {
        return this.b;
    }

    public final String getStreet() {
        return this.a;
    }

    public final void setDirection(String str) {
        this.d = str;
    }

    public final void setDistance(float f) {
        this.f978e = f;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f977c = latLonPoint;
    }

    public final void setNumber(String str) {
        this.b = str;
    }

    public final void setStreet(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.f977c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.f978e);
    }

    public StreetNumber() {
    }

    private StreetNumber(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f977c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.f978e = parcel.readFloat();
    }
}
