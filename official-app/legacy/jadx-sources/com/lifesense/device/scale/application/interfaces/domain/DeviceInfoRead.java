package com.lifesense.device.scale.application.interfaces.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoRead implements Parcelable {
    public static final Parcelable.Creator<DeviceInfoRead> CREATOR = new Parcelable.Creator<DeviceInfoRead>() { // from class: com.lifesense.device.scale.application.interfaces.domain.DeviceInfoRead.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfoRead createFromParcel(Parcel parcel) {
            return new DeviceInfoRead(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfoRead[] newArray(int i) {
            return new DeviceInfoRead[i];
        }
    };
    public String broadcastID;
    public String deviceId;
    public String deviceName;
    public String deviceSn;
    public String deviceType;
    public int deviceUserNumber;
    public String firmwareVersion;
    public String hardwareVersion;
    public String macAddress;
    public String manufactureName;
    public String modelNumber;
    public String password;
    public String protocolType;
    public String softwareVersion;

    public DeviceInfoRead() {
    }

    public DeviceInfoRead(Parcel parcel) {
        this.deviceType = parcel.readString();
        this.password = parcel.readString();
        this.broadcastID = parcel.readString();
        this.deviceName = parcel.readString();
        this.deviceId = parcel.readString();
        this.deviceSn = parcel.readString();
        this.modelNumber = parcel.readString();
        this.softwareVersion = parcel.readString();
        this.hardwareVersion = parcel.readString();
        this.firmwareVersion = parcel.readString();
        this.manufactureName = parcel.readString();
        this.deviceUserNumber = parcel.readInt();
        this.protocolType = parcel.readString();
        this.macAddress = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBroadcastID() {
        return this.broadcastID;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int getDeviceUserNumber() {
        return this.deviceUserNumber;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public String getManufactureName() {
        return this.manufactureName;
    }

    public String getModelNumber() {
        return this.modelNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProtocolType() {
        return this.protocolType;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public void setBroadcastID(String str) {
        this.broadcastID = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUserNumber(int i) {
        this.deviceUserNumber = i;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setManufactureName(String str) {
        this.manufactureName = str;
    }

    public void setModelNumber(String str) {
        this.modelNumber = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProtocolType(String str) {
        this.protocolType = str;
    }

    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    public String toString() {
        return "DeviceInfoRead{deviceType='" + this.deviceType + "', password='" + this.password + "', broadcastID='" + this.broadcastID + "', deviceName='" + this.deviceName + "', deviceId='" + this.deviceId + "', deviceSn='" + this.deviceSn + "', modelNumber='" + this.modelNumber + "', softwareVersion='" + this.softwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', firmwareVersion='" + this.firmwareVersion + "', manufactureName='" + this.manufactureName + "', deviceUserNumber=" + this.deviceUserNumber + ", protocolType='" + this.protocolType + "', macAddress='" + this.macAddress + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceType);
        parcel.writeString(this.password);
        parcel.writeString(this.broadcastID);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceSn);
        parcel.writeString(this.modelNumber);
        parcel.writeString(this.softwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.manufactureName);
        parcel.writeInt(this.deviceUserNumber);
        parcel.writeString(this.protocolType);
        parcel.writeString(this.macAddress);
    }
}
