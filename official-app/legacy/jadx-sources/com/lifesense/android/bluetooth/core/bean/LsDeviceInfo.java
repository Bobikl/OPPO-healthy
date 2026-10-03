package com.lifesense.android.bluetooth.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LsDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<LsDeviceInfo> CREATOR = new Parcelable.Creator<LsDeviceInfo>() { // from class: com.lifesense.android.bluetooth.core.bean.LsDeviceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LsDeviceInfo createFromParcel(Parcel parcel) {
            return new LsDeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LsDeviceInfo[] newArray(int i) {
            return new LsDeviceInfo[i];
        }
    };
    public static final int REGISTERED = 1;
    public static final int UNREGISTERED = 0;
    public String broadcastID;
    public String deviceId;
    public String deviceName;
    public String deviceType;
    public String firmwareVersion;
    public String hardwareVersion;
    public String macAddress;
    public String manufactureId;
    public String manufactureName;
    public String modelNumber;
    public String password;
    public String protocolType;
    public int registerStatus;
    public int rssi;
    public List<String> serviceUuid;
    public String sn;
    public String softwareVersion;
    public int userNo;

    public LsDeviceInfo() {
        this.registerStatus = 1;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LsDeviceInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LsDeviceInfo)) {
            return false;
        }
        LsDeviceInfo lsDeviceInfo = (LsDeviceInfo) obj;
        if (!lsDeviceInfo.canEqual(this)) {
            return false;
        }
        String macAddress = getMacAddress();
        String macAddress2 = lsDeviceInfo.getMacAddress();
        return macAddress != null ? macAddress.equals(macAddress2) : macAddress2 == null;
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

    public String getDeviceType() {
        return this.deviceType;
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

    public String getManufactureId() {
        return this.manufactureId;
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

    public int getRegisterStatus() {
        return this.registerStatus;
    }

    public int getRssi() {
        return this.rssi;
    }

    public List<String> getServiceUuid() {
        return this.serviceUuid;
    }

    public String getSn() {
        return this.sn;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int getUserNo() {
        return this.userNo;
    }

    public int hashCode() {
        String macAddress = getMacAddress();
        return (macAddress == null ? 43 : macAddress.hashCode()) + 59;
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

    public void setDeviceType(String str) {
        this.deviceType = str;
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

    public void setManufactureId(String str) {
        this.manufactureId = str;
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

    public void setRegisterStatus(int i) {
        this.registerStatus = i;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setServiceUuid(List<String> list) {
        this.serviceUuid = list;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    public void setUserNo(int i) {
        this.userNo = i;
    }

    public String toString() {
        return "LsDeviceInfo(deviceType=" + getDeviceType() + ", password=" + getPassword() + ", broadcastID=" + getBroadcastID() + ", deviceName=" + getDeviceName() + ", deviceId=" + getDeviceId() + ", modelNumber=" + getModelNumber() + ", softwareVersion=" + getSoftwareVersion() + ", hardwareVersion=" + getHardwareVersion() + ", firmwareVersion=" + getFirmwareVersion() + ", manufactureName=" + getManufactureName() + ", protocolType=" + getProtocolType() + ", macAddress=" + getMacAddress() + ", rssi=" + getRssi() + ", sn=" + getSn() + ", serviceUuid=" + getServiceUuid() + ", registerStatus=" + getRegisterStatus() + ", manufactureId=" + getManufactureId() + ", userNo=" + getUserNo() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceType);
        parcel.writeString(this.password);
        parcel.writeString(this.broadcastID);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.modelNumber);
        parcel.writeString(this.softwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.manufactureName);
        parcel.writeString(this.protocolType);
        parcel.writeString(this.macAddress);
        parcel.writeInt(this.rssi);
        parcel.writeStringList(this.serviceUuid);
        parcel.writeInt(this.registerStatus);
        parcel.writeString(this.manufactureId);
    }

    public LsDeviceInfo(Parcel parcel) {
        this.registerStatus = 1;
        this.deviceType = parcel.readString();
        this.password = parcel.readString();
        this.broadcastID = parcel.readString();
        this.deviceName = parcel.readString();
        this.deviceId = parcel.readString();
        this.modelNumber = parcel.readString();
        this.softwareVersion = parcel.readString();
        this.hardwareVersion = parcel.readString();
        this.firmwareVersion = parcel.readString();
        this.manufactureName = parcel.readString();
        this.protocolType = parcel.readString();
        this.macAddress = parcel.readString();
        this.rssi = parcel.readInt();
        this.serviceUuid = parcel.createStringArrayList();
        this.registerStatus = parcel.readInt();
        this.manufactureId = parcel.readString();
    }

    public LsDeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, List<String> list, int i2, String str14, int i3) {
        this.deviceType = str;
        this.password = str2;
        this.broadcastID = str3;
        this.deviceName = str4;
        this.deviceId = str5;
        this.modelNumber = str6;
        this.softwareVersion = str7;
        this.hardwareVersion = str8;
        this.firmwareVersion = str9;
        this.manufactureName = str10;
        this.protocolType = str11;
        this.macAddress = str12;
        this.rssi = i;
        this.sn = str13;
        this.serviceUuid = list;
        this.registerStatus = i2;
        this.manufactureId = str14;
        this.userNo = i3;
    }
}
