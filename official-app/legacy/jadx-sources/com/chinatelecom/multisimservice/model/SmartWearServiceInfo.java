package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class SmartWearServiceInfo implements Parcelable {
    public static final Parcelable.Creator<SmartWearServiceInfo> CREATOR = new a();
    private String packageName;
    private String versionCode;

    public class a implements Parcelable.Creator<SmartWearServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo createFromParcel(Parcel parcel) {
            return new SmartWearServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo[] newArray(int i) {
            return new SmartWearServiceInfo[i];
        }
    }

    public SmartWearServiceInfo(String str, String str2) {
        this.packageName = str;
        this.versionCode = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersionName() {
        return this.versionCode;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setVersionName(String str) {
        this.versionCode = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.versionCode);
    }

    public SmartWearServiceInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.versionCode = parcel.readString();
    }
}
