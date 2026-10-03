package com.lifesense.device.scale.device.settings.config;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceHeartRateCfg implements Parcelable {
    public static final Parcelable.Creator<DeviceHeartRateCfg> CREATOR = new a();
    public int state;

    public static class a implements Parcelable.Creator<DeviceHeartRateCfg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceHeartRateCfg createFromParcel(Parcel parcel) {
            return new DeviceHeartRateCfg(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceHeartRateCfg[] newArray(int i) {
            return new DeviceHeartRateCfg[i];
        }
    }

    public DeviceHeartRateCfg() {
    }

    public DeviceHeartRateCfg(Parcel parcel) {
        this.state = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }

    public String toString() {
        return "DeviceHeartRateCfg{state=" + this.state + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.state);
    }
}
