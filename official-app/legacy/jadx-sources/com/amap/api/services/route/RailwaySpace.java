package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class RailwaySpace implements Parcelable {
    public static final Parcelable.Creator<RailwaySpace> CREATOR = new a();
    private String a;
    private float b;

    public static class a implements Parcelable.Creator<RailwaySpace> {
        public static RailwaySpace a(Parcel parcel) {
            return new RailwaySpace(parcel);
        }

        public static RailwaySpace[] b(int i) {
            return new RailwaySpace[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwaySpace createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RailwaySpace[] newArray(int i) {
            return b(i);
        }
    }

    public RailwaySpace(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCode() {
        return this.a;
    }

    public float getCost() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
    }

    public RailwaySpace(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
    }
}
