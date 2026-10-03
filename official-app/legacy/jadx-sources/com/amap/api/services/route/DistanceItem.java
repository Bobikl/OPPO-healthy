package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class DistanceItem implements Parcelable {
    public static final Parcelable.Creator<DistanceItem> CREATOR = new a();
    public final int ERROR_CODE_NOT_IN_CHINA;
    public final int ERROR_CODE_NO_DRIVE;
    public final int ERROR_CODE_TOO_FAR;
    private int a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1005c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1006e;
    private int f;

    public static class a implements Parcelable.Creator<DistanceItem> {
        public static DistanceItem a(Parcel parcel) {
            return new DistanceItem(parcel);
        }

        public static DistanceItem[] b(int i) {
            return new DistanceItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceItem[] newArray(int i) {
            return b(i);
        }
    }

    public DistanceItem() {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.a = 1;
        this.b = 1;
        this.f1005c = 0.0f;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDestId() {
        return this.b;
    }

    public float getDistance() {
        return this.f1005c;
    }

    public float getDuration() {
        return this.d;
    }

    public int getErrorCode() {
        return this.f;
    }

    public String getErrorInfo() {
        return this.f1006e;
    }

    public int getOriginId() {
        return this.a;
    }

    public void setDestId(int i) {
        this.b = i;
    }

    public void setDistance(float f) {
        this.f1005c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setErrorCode(int i) {
        this.f = i;
    }

    public void setErrorInfo(String str) {
        this.f1006e = str;
    }

    public void setOriginId(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.f1005c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.f1006e);
        parcel.writeInt(this.f);
    }

    public DistanceItem(Parcel parcel) {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.a = 1;
        this.b = 1;
        this.f1005c = 0.0f;
        this.d = 0.0f;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.f1005c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f1006e = parcel.readString();
        this.f = parcel.readInt();
    }
}
