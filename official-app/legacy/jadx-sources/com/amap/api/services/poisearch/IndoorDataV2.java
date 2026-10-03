package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorDataV2 implements Parcelable {
    public static final Parcelable.Creator<IndoorDataV2> CREATOR = new a();
    private boolean a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f985c;
    private String d;

    public static class a implements Parcelable.Creator<IndoorDataV2> {
        public static IndoorDataV2 a(Parcel parcel) {
            return new IndoorDataV2(parcel);
        }

        public static IndoorDataV2[] b(int i) {
            return new IndoorDataV2[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorDataV2 createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndoorDataV2[] newArray(int i) {
            return b(i);
        }
    }

    public IndoorDataV2(boolean z, String str, int i, String str2) {
        this.a = z;
        this.b = str;
        this.f985c = i;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.f985c;
    }

    public String getFloorName() {
        return this.d;
    }

    public String getPoiId() {
        return this.b;
    }

    public boolean isIndoorMap() {
        return this.a;
    }

    public void setFloor(int i) {
        this.f985c = i;
    }

    public void setFloorName(String str) {
        this.d = str;
    }

    public void setIndoorMap(boolean z) {
        this.a = z;
    }

    public void setPoiId(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.a});
        parcel.writeString(this.b);
        parcel.writeInt(this.f985c);
        parcel.writeString(this.d);
    }

    public IndoorDataV2(Parcel parcel) {
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.a = zArr[0];
        this.b = parcel.readString();
        this.f985c = parcel.readInt();
        this.d = parcel.readString();
    }
}
