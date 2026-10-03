package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeviceInfoV2 implements Parcelable {
    public static final Parcelable.Creator<DeviceInfoV2> CREATOR = new a();
    private String appTerminalId;
    private String bleSecretMetadata;
    private String boardId;
    private long createTime;
    private String deviceMarketName;
    private String deviceName;
    private String deviceSn;
    private int deviceType;
    private String deviceUniqueId;
    private String firmwareVersion;
    private String guid;
    private String hardwareVersion;
    private String mac;
    private String manufacturer;
    private String microMac;
    private String model;
    private String nodeId;
    private String otaVersion;
    private String pictureIdImage;
    private String projectId;
    private String sku;
    private String skuCode;
    private String skuMarketName;
    private int syncStatus;
    private String vaid;
    private UserInfo virtualUserInfo;

    public class a implements Parcelable.Creator<DeviceInfoV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceInfoV2 createFromParcel(Parcel parcel) {
            return new DeviceInfoV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceInfoV2[] newArray(int i) {
            return new DeviceInfoV2[i];
        }
    }

    public DeviceInfoV2() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppTerminalId() {
        return this.appTerminalId;
    }

    @Nullable
    public String getBleSecretMetadata() {
        return this.bleSecretMetadata;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDeviceMarketName() {
        return this.deviceMarketName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getMac() {
        return this.mac;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMicroMac() {
        return this.microMac;
    }

    public String getModel() {
        return this.model;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getOtaVersion() {
        return this.otaVersion;
    }

    public String getPictureIdImage() {
        return this.pictureIdImage;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getSku() {
        return this.sku;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public String getSkuMarketName() {
        return this.skuMarketName;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getVaid() {
        return this.vaid;
    }

    public UserInfo getVirtualUserInfo() {
        return this.virtualUserInfo;
    }

    public void setAppTerminalId(String str) {
        this.appTerminalId = str;
    }

    public void setBleSecretMetadata(String str) {
        this.bleSecretMetadata = str;
    }

    public void setBoardId(String str) {
        this.boardId = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDeviceMarketName(String str) {
        this.deviceMarketName = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMicroMac(String str) {
        this.microMac = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setOtaVersion(String str) {
        this.otaVersion = str;
    }

    public void setPictureIdImage(String str) {
        this.pictureIdImage = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setSku(String str) {
        this.sku = str;
    }

    public void setSkuCode(String str) {
        this.skuCode = str;
    }

    public void setSkuMarketName(String str) {
        this.skuMarketName = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setVaid(String str) {
        this.vaid = str;
    }

    public void setVirtualUserInfo(UserInfo userInfo) {
        this.virtualUserInfo = userInfo;
    }

    public String toString() {
        return "DeviceInfoV2{deviceName='" + this.deviceName + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', firmwareVersion='" + this.firmwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', manufacturer='" + this.manufacturer + "', model='" + this.model + "', deviceSn='" + this.deviceSn + "', guid='" + this.guid + "', mac='" + this.mac + "', microMac='" + this.microMac + "', bleSecretMetadata='" + this.bleSecretMetadata + "', sku='" + this.sku + "', skuCode='" + this.skuCode + "', deviceMarketName='" + this.deviceMarketName + "', skuMarketName='" + this.skuMarketName + "', vaid='" + this.vaid + "', pictureIdImage='" + this.pictureIdImage + "', nodeId='" + this.nodeId + "', projectId='" + this.projectId + "', boardId='" + this.boardId + "', otaVersion='" + this.otaVersion + "', appTerminalId='" + this.appTerminalId + "', syncStatus=" + this.syncStatus + ", createTime=" + this.createTime + ", virtualUserInfo=" + this.virtualUserInfo + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceName);
        parcel.writeInt(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceSn);
        parcel.writeString(this.mac);
        parcel.writeString(this.microMac);
        parcel.writeString(this.bleSecretMetadata);
        parcel.writeString(this.sku);
        parcel.writeString(this.skuCode);
        parcel.writeString(this.deviceMarketName);
        parcel.writeString(this.skuMarketName);
        parcel.writeString(this.vaid);
        parcel.writeString(this.pictureIdImage);
        parcel.writeString(this.nodeId);
        parcel.writeString(this.projectId);
        parcel.writeString(this.boardId);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.appTerminalId);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.createTime);
        parcel.writeParcelable(this.virtualUserInfo, i);
        parcel.writeString(this.guid);
    }

    public DeviceInfoV2(Parcel parcel) {
        this.deviceName = parcel.readString();
        this.deviceType = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.firmwareVersion = parcel.readString();
        this.hardwareVersion = parcel.readString();
        this.manufacturer = parcel.readString();
        this.model = parcel.readString();
        this.deviceSn = parcel.readString();
        this.mac = parcel.readString();
        this.microMac = parcel.readString();
        this.bleSecretMetadata = parcel.readString();
        this.sku = parcel.readString();
        this.skuCode = parcel.readString();
        this.deviceMarketName = parcel.readString();
        this.skuMarketName = parcel.readString();
        this.vaid = parcel.readString();
        this.pictureIdImage = parcel.readString();
        this.nodeId = parcel.readString();
        this.projectId = parcel.readString();
        this.boardId = parcel.readString();
        this.otaVersion = parcel.readString();
        this.appTerminalId = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.createTime = parcel.readLong();
        this.virtualUserInfo = (UserInfo) parcel.readParcelable(UserInfo.class.getClassLoader());
        this.guid = parcel.readString();
    }
}
