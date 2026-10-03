package com.lifesense.device.scale.device.settings.config;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class LSEScaleTargetCfg implements Parcelable {
    public static final Parcelable.Creator<DeviceUnitCfg> CREATOR = new a();
    public static int LSEWeightType = 1;
    public int targetType;
    public float targetWeight;
    public int userNumber;

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

    public LSEScaleTargetCfg() {
    }

    public LSEScaleTargetCfg(Parcel parcel) {
        this.userNumber = parcel.readInt();
        this.targetType = parcel.readInt();
        this.targetWeight = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getTargetType() {
        return this.targetType;
    }

    public float getTargetWeight() {
        return this.targetWeight;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public void setTargetType(int i) {
        this.targetType = i;
    }

    public void setTargetWeight(float f) {
        this.targetWeight = f;
    }

    public void setUserNumber(int i) {
        this.userNumber = i;
    }

    public String toString() {
        return "LSEScaleTargetCfg{userNumber=" + this.userNumber + ", targetType=" + this.targetType + ", targetWeight=" + this.targetWeight + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userNumber);
        parcel.writeInt(this.targetType);
        parcel.writeFloat(this.targetWeight);
    }
}
