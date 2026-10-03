package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.va5;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.utrace.lib.ConstValuesKt;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBDeviceInfo")
@Keep
public class DBDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DBDeviceInfo> CREATOR = new a();

    @ColumnInfo(name = "app_terminal_id")
    private String appTerminalId;

    @ColumnInfo(name = "ble_secret_metadata")
    private String bleSecretMetadata;

    @ColumnInfo(name = "board_id")
    private String boardId;

    @ColumnInfo(name = "create_time")
    private long createTime;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long deviceInfoId;

    @ColumnInfo(name = "market_name")
    private String deviceMarketName;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @ColumnInfo(name = va5.TAG_DEVICE_SN)
    private String deviceSn;

    @ColumnInfo(name = "device_type")
    private int deviceType;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "firmware_version")
    private String firmwareVersion;

    @ColumnInfo(name = "guid")
    private String guid;

    @ColumnInfo(name = "hardware_version")
    private String hardwareVersion;

    @ColumnInfo(name = "mac")
    private String mac;

    @ColumnInfo(name = "manufacturer")
    private String manufacturer;

    @ColumnInfo(name = "micro_mac")
    private String microMac;

    @ColumnInfo(name = "model")
    private String model;

    @ColumnInfo(name = "node_id")
    private String nodeId;

    @ColumnInfo(name = ConstValuesKt.OTA_VERSION)
    private String otaVersion;

    @ColumnInfo(name = "picture_id_image")
    private String pictureIdImage;

    @ColumnInfo(name = "project_id")
    private String projectId;

    @ColumnInfo(name = "sku")
    private String sku;

    @ColumnInfo(name = "sku_code")
    private String skuCode;

    @ColumnInfo(name = "sku_market_name")
    private String skuMarketName;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "vaid")
    private String vaid;

    public class a implements Parcelable.Creator<DBDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBDeviceInfo createFromParcel(Parcel parcel) {
            return new DBDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBDeviceInfo[] newArray(int i) {
            return new DBDeviceInfo[i];
        }
    }

    public DBDeviceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppTerminalId() {
        return this.appTerminalId;
    }

    public String getBleSecretMetadata() {
        return this.bleSecretMetadata;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceInfoId() {
        return this.deviceInfoId;
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

    public void setDeviceInfoId(long j2) {
        this.deviceInfoId = j2;
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

    public String toString() {
        return "DBDeviceInfo{deviceInfoId=" + this.deviceInfoId + ", deviceName='" + this.deviceName + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', firmwareVersion='" + this.firmwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', manufacturer='" + this.manufacturer + "', model='" + this.model + "', deviceSn='" + this.deviceSn + "', mac='" + this.mac + "', microMac='" + this.microMac + "', bleSecretMetadata='" + this.bleSecretMetadata + "', sku='" + this.sku + "', skuCode='" + this.skuCode + "', deviceMarketName='" + this.deviceMarketName + "', skuMarketName='" + this.skuMarketName + "', vaid='" + this.vaid + "', pictureIdImage='" + this.pictureIdImage + "', nodeId='" + this.nodeId + "', projectId='" + this.projectId + "', boardId='" + this.boardId + "', otaVersion='" + this.otaVersion + "', appTerminalId='" + this.appTerminalId + "', createTime=" + this.createTime + ", syncStatus=" + this.syncStatus + ", guid=" + this.guid + '}';
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
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.guid);
    }

    public DBDeviceInfo(Parcel parcel) {
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
        this.createTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.guid = parcel.readString();
    }
}
