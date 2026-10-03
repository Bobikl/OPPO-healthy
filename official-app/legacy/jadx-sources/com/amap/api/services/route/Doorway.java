package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new a();
    private String a;
    private LatLonPoint b;

    public static class a implements Parcelable.Creator<Doorway> {
        public static Doorway a(Parcel parcel) {
            return new Doorway(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Doorway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Doorway[] newArray(int i) {
            return null;
        }
    }

    public Doorway(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.b;
    }

    public String getName() {
        return this.a;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setName(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public Doorway() {
    }
}
