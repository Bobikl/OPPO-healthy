package com.heytap.databaseengine.model.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserDeviceInfoProxy extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<UserDeviceInfoProxy> CREATOR = new a();
    private int connectionState;
    private String deviceName;
    private int deviceType;
    private String manufacturer;
    private String model;
    private int subDeviceType;

    public class a implements Parcelable.Creator<UserDeviceInfoProxy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserDeviceInfoProxy createFromParcel(Parcel parcel) {
            return new UserDeviceInfoProxy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserDeviceInfoProxy[] newArray(int i) {
            return new UserDeviceInfoProxy[i];
        }
    }

    public UserDeviceInfoProxy() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectionState() {
        return this.connectionState;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getSubDeviceType() {
        return this.subDeviceType;
    }

    public void setConnectionState(int i) {
        this.connectionState = i;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setSubDeviceType(int i) {
        this.subDeviceType = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "UserDeviceInfoProxy:\ndeviceName = " + getDeviceName() + "\ndeviceType = " + getDeviceType() + "\nsubDeviceType = " + getSubDeviceType() + "\nmodel = " + getModel() + "\nmanufacturer = " + getManufacturer() + "\nconnectionState = " + getConnectionState() + '\n';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceName);
        parcel.writeInt(this.deviceType);
        parcel.writeInt(this.subDeviceType);
        parcel.writeString(this.model);
        parcel.writeString(this.manufacturer);
        parcel.writeInt(this.connectionState);
    }

    public UserDeviceInfoProxy(Parcel parcel) {
        this.deviceName = parcel.readString();
        this.deviceType = parcel.readInt();
        this.subDeviceType = parcel.readInt();
        this.model = parcel.readString();
        this.manufacturer = parcel.readString();
        this.connectionState = parcel.readInt();
    }
}
