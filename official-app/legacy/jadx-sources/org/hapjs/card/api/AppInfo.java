package org.hapjs.card.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Parcelable.Creator<AppInfo>() { // from class: org.hapjs.card.api.AppInfo.1
        @Override // android.os.Parcelable.Creator
        public AppInfo[] newArray(int i) {
            return new AppInfo[0];
        }

        @Override // android.os.Parcelable.Creator
        public AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    };
    private int mMinPlatformVersion;
    private String mName;
    private String mPackage;
    private int mVersionCode;
    private String mVersionName;

    public AppInfo(String str, String str2, String str3, int i, int i2) {
        this.mPackage = str;
        this.mName = str2;
        this.mVersionName = str3;
        this.mVersionCode = i;
        this.mMinPlatformVersion = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMinPlatformVersion() {
        return this.mMinPlatformVersion;
    }

    public String getName() {
        return this.mName;
    }

    public String getPackage() {
        return this.mPackage;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public String getVersionName() {
        return this.mVersionName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPackage);
        parcel.writeString(this.mName);
        parcel.writeString(this.mVersionName);
        parcel.writeInt(this.mVersionCode);
        parcel.writeInt(this.mMinPlatformVersion);
    }
}
