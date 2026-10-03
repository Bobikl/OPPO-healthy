package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new a();
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f984c;

    public static class a implements Parcelable.Creator<IndoorData> {
        public static IndoorData a(Parcel parcel) {
            return new IndoorData(parcel);
        }

        public static IndoorData[] b(int i) {
            return new IndoorData[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorData[] newArray(int i) {
            return b(i);
        }
    }

    public IndoorData(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.f984c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.b;
    }

    public String getFloorName() {
        return this.f984c;
    }

    public String getPoiId() {
        return this.a;
    }

    public void setFloor(int i) {
        this.b = i;
    }

    public void setFloorName(String str) {
        this.f984c = str;
    }

    public void setPoiId(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.f984c);
    }

    public IndoorData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.f984c = parcel.readString();
    }
}
