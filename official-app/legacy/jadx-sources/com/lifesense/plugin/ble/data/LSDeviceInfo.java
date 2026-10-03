package com.lifesense.plugin.ble.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.lifesense.plugin.ble.data.tracker.ATUserInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class LSDeviceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.lifesense.plugin.ble.data.LSDeviceInfo.1
        @Override // android.os.Parcelable.Creator
        public LSDeviceInfo createFromParcel(Parcel parcel) {
            return new LSDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LSDeviceInfo[] newArray(int i) {
            return new LSDeviceInfo[i];
        }
    };
    public static final int REGISTERED = 1;
    public static final int UNREGISTERED = 0;
    private int battery;
    private String broadcastID;
    private String companyID;
    private boolean delayDisconnect;
    private String deviceId;
    private String deviceName;
    private String deviceSn;
    private String deviceType;

    @Deprecated
    private String deviceUnit;
    private int deviceUserNumber;

    @Deprecated
    private long discoveryTime;
    private String firmwareVersion;
    private String hardwareVersion;
    private int heartRate;

    @Deprecated
    private boolean isClearUserRecords;

    @Deprecated
    private boolean isSupportedBinding;
    private String macAddress;
    private String manufactureData;
    private String manufactureId;
    private String manufactureName;
    private int maxUserQuantity;
    private String modelNumber;
    private int pairMode;
    private int pairStatus;
    private String password;
    private String protocolType;
    private int registerStatus;
    private int rssi;
    private List serviceUuid;
    private String softwareVersion;
    private String systemId;
    private ATUserInfo userInfo;

    public LSDeviceInfo() {
        this.registerStatus = 1;
        this.isSupportedBinding = false;
        this.isClearUserRecords = false;
        this.deviceUnit = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String formatStringValue() {
        return "[type=" + this.deviceType + ",firmware=" + this.firmwareVersion + ",protocol=" + this.protocolType + ",mac=" + this.macAddress + "]";
    }

    public int getBattery() {
        return this.battery;
    }

    public String getBroadcastData() {
        return "Device=" + this.deviceName + "[" + this.deviceType + "], broadcastID=" + this.broadcastID + ", service=" + this.serviceUuid + "[" + this.protocolType + "]";
    }

    public String getBroadcastID() {
        return this.broadcastID;
    }

    public String getCompanyID() {
        return this.companyID;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSimplifyInfo() {
        return "[type=" + this.deviceType + ", hardware=" + this.hardwareVersion + ", firmware=" + this.firmwareVersion + ", protocol=" + this.protocolType + ", mac=" + this.macAddress + ", rssi=" + this.rssi + "]";
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getDeviceUnit() {
        return this.deviceUnit;
    }

    public int getDeviceUserNumber() {
        return this.deviceUserNumber;
    }

    public synchronized long getDiscoveryTime() {
        return this.discoveryTime;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public String getManufactureData() {
        return this.manufactureData;
    }

    public String getManufactureId() {
        return this.manufactureId;
    }

    public String getManufactureName() {
        return this.manufactureName;
    }

    public int getMaxUserQuantity() {
        return this.maxUserQuantity;
    }

    public String getModelNumber() {
        return this.modelNumber;
    }

    public int getPairMode() {
        return this.pairMode;
    }

    public int getPairStatus() {
        return this.pairStatus;
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

    public List getServiceUuid() {
        return this.serviceUuid;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public ATUserInfo getUserInfo() {
        return this.userInfo;
    }

    public boolean isClearUserRecords() {
        return this.isClearUserRecords;
    }

    public boolean isDelayDisconnect() {
        return this.delayDisconnect;
    }

    public boolean isSupportedBinding() {
        return this.isSupportedBinding;
    }

    public void setBattery(int i) {
        this.battery = i;
    }

    public void setBroadcastID(String str) {
        this.broadcastID = str;
    }

    public void setClearUserRecords(boolean z) {
        this.isClearUserRecords = z;
    }

    public void setCompanyID(String str) {
        this.companyID = str;
    }

    public void setDelayDisconnect(boolean z) {
        this.delayDisconnect = z;
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

    public void setDeviceUnit(String str) {
        this.deviceUnit = str;
    }

    public void setDeviceUserNumber(int i) {
        this.deviceUserNumber = i;
    }

    public synchronized void setDiscoveryTime(long j2) {
        this.discoveryTime = j2;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setManufactureData(String str) {
        this.manufactureData = str;
    }

    public void setManufactureId(String str) {
        this.manufactureId = str;
    }

    public void setManufactureName(String str) {
        this.manufactureName = str;
    }

    public void setMaxUserQuantity(int i) {
        this.maxUserQuantity = i;
    }

    public void setModelNumber(String str) {
        this.modelNumber = str;
    }

    public void setPairMode(int i) {
        this.pairMode = i;
    }

    public void setPairStatus(int i) {
        this.pairStatus = i;
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

    public void setServiceUuid(List list) {
        this.serviceUuid = list;
    }

    public void setSoftwareVersion(String str) {
        this.softwareVersion = str;
    }

    public void setSupportedBinding(boolean z) {
        this.isSupportedBinding = z;
    }

    public void setSystemId(String str) {
        this.systemId = str;
    }

    public void setUserInfo(ATUserInfo aTUserInfo) {
        this.userInfo = aTUserInfo;
    }

    public String toString() {
        return "LSDeviceInfo [deviceType=" + this.deviceType + ", password=" + this.password + ", broadcastID=" + this.broadcastID + ", deviceName=" + this.deviceName + ", deviceId=" + this.deviceId + ", deviceSn=" + this.deviceSn + ", modelNumber=" + this.modelNumber + ", softwareVersion=" + this.softwareVersion + ", hardwareVersion=" + this.hardwareVersion + ", firmwareVersion=" + this.firmwareVersion + ", manufactureName=" + this.manufactureName + ", deviceUserNumber=" + this.deviceUserNumber + ", pairStatus=" + this.pairStatus + ", maxUserQuantity=" + this.maxUserQuantity + ", protocolType=" + this.protocolType + ", macAddress=" + this.macAddress + ", rssi=" + this.rssi + ", serviceUuid=" + this.serviceUuid + ", registerStatus=" + this.registerStatus + ", companyID=" + this.companyID + ", manufactureId=" + this.manufactureId + ", isSupportedBinding=" + this.isSupportedBinding + ", isClearUserRecords=" + this.isClearUserRecords + ", deviceUnit=" + this.deviceUnit + ", discoveryTime=" + this.discoveryTime + ", manufactureData=" + this.manufactureData + ", battery=" + this.battery + ", heartRate=" + this.heartRate + "]";
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
        parcel.writeString(this.systemId);
        parcel.writeInt(this.deviceUserNumber);
        parcel.writeInt(this.pairStatus);
        parcel.writeInt(this.maxUserQuantity);
        parcel.writeString(this.protocolType);
        parcel.writeString(this.macAddress);
        parcel.writeInt(this.rssi);
        parcel.writeList(this.serviceUuid);
        parcel.writeInt(this.registerStatus);
        parcel.writeString(this.companyID);
        parcel.writeString(this.manufactureId);
        parcel.writeByte(this.isSupportedBinding ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isClearUserRecords ? (byte) 1 : (byte) 0);
        parcel.writeString(this.deviceUnit);
        parcel.writeLong(this.discoveryTime);
        parcel.writeString(this.manufactureData);
        parcel.writeInt(this.battery);
        parcel.writeInt(this.heartRate);
        parcel.writeByte(this.delayDisconnect ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pairMode);
    }

    private LSDeviceInfo(Parcel parcel) {
        this.registerStatus = 1;
        this.serviceUuid = new ArrayList();
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
        this.systemId = parcel.readString();
        this.deviceUserNumber = parcel.readInt();
        this.pairStatus = parcel.readInt();
        this.maxUserQuantity = parcel.readInt();
        this.protocolType = parcel.readString();
        this.macAddress = parcel.readString();
        this.rssi = parcel.readInt();
        this.serviceUuid = parcel.readArrayList(String.class.getClassLoader());
        this.registerStatus = parcel.readInt();
        this.companyID = parcel.readString();
        this.manufactureId = parcel.readString();
        this.isSupportedBinding = parcel.readByte() != 0;
        this.isClearUserRecords = parcel.readByte() != 0;
        this.deviceUnit = parcel.readString();
        this.discoveryTime = parcel.readLong();
        this.manufactureData = parcel.readString();
        this.battery = parcel.readInt();
        this.heartRate = parcel.readInt();
        this.delayDisconnect = parcel.readByte() != 0;
        this.pairMode = parcel.readInt();
    }
}
