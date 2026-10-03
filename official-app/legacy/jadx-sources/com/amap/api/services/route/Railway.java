package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new a();
    private String a;
    private String b;

    public static class a implements Parcelable.Creator<Railway> {
        public static Railway a(Parcel parcel) {
            return new Railway(parcel);
        }

        public static Railway[] b(int i) {
            return new Railway[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Railway[] newArray(int i) {
            return b(i);
        }
    }

    public Railway() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getID() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public void setID(String str) {
        this.a = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public Railway(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
