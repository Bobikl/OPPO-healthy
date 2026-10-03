package com.heytap.health.device_settings.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceParam implements Parcelable {
    public static final Parcelable.Creator<DeviceParam> CREATOR = new a();
    public String deviceBleMac;
    public String deviceMac;
    public String deviceModel;
    public String deviceVersion;

    public class a implements Parcelable.Creator<DeviceParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceParam createFromParcel(Parcel parcel) {
            return new DeviceParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceParam[] newArray(int i) {
            return new DeviceParam[i];
        }
    }

    public DeviceParam() {
    }

    public static DeviceParam createEmpty() {
        DeviceParam deviceParam = new DeviceParam();
        deviceParam.deviceBleMac = "";
        deviceParam.deviceMac = "";
        deviceParam.deviceVersion = "";
        deviceParam.deviceModel = "";
        return deviceParam;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceMac);
        parcel.writeString(this.deviceBleMac);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.deviceVersion);
    }

    public DeviceParam(Parcel parcel) {
        this.deviceMac = parcel.readString();
        this.deviceBleMac = parcel.readString();
        this.deviceModel = parcel.readString();
        this.deviceVersion = parcel.readString();
    }
}
