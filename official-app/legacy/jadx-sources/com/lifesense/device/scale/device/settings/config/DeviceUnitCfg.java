package com.lifesense.device.scale.device.settings.config;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceUnitCfg implements Parcelable {
    public static final Parcelable.Creator<DeviceUnitCfg> CREATOR = new a();
    public int unit;

    public static class a implements Parcelable.Creator<DeviceUnitCfg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceUnitCfg createFromParcel(Parcel parcel) {
            return new DeviceUnitCfg(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceUnitCfg[] newArray(int i) {
            return new DeviceUnitCfg[i];
        }
    }

    public DeviceUnitCfg() {
    }

    public DeviceUnitCfg(Parcel parcel) {
        this.unit = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public String toString() {
        return "DeviceUnitCfg{unit=" + this.unit + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.unit);
    }
}
