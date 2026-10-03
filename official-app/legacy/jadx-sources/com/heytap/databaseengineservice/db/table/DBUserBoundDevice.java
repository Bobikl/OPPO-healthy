package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.utrace.lib.ConstValuesKt;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBUserBoundDevice")
@Keep
public class DBUserBoundDevice implements Parcelable {
    public static final Parcelable.Creator<DBUserBoundDevice> CREATOR = new a();

    @ColumnInfo(name = Fields.ANDROID_VERSION_FIELD)
    private String androidVersion;

    @ColumnInfo(name = "app_terminal_id")
    private String appTerminalId;

    @ColumnInfo(name = "baseband_version")
    private String basebandVersion;

    @ColumnInfo(name = "bind_time")
    private long bindTime;

    @ColumnInfo(name = "bluetooth_address")
    private String bluetoothAddress;

    @ColumnInfo(name = "board_id")
    private String boardId;

    @ColumnInfo(name = "create_time")
    private long createTime;

    @ColumnInfo(name = "market_name")
    private String deviceMarketName;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "eid")
    private String eid;

    @ColumnInfo(name = "guid")
    private String guid;

    @ColumnInfo(name = "imei")
    private String imei;

    @ColumnInfo(name = "kernel_version")
    private String kernelVersion;

    @ColumnInfo(name = "model")
    private String model;

    @ColumnInfo(name = "node_id")
    private String nodeId;

    @ColumnInfo(name = HttpConst.OPERATOR)
    private String operator;

    @ColumnInfo(name = "os_version")
    private String osVersion;

    @ColumnInfo(name = ConstValuesKt.OTA_VERSION)
    private String otaVersion;

    @ColumnInfo(name = "project_id")
    private String projectId;

    @ColumnInfo(name = HttpConst.ROM)
    private String rom;

    @ColumnInfo(name = "serial_number")
    private String serialNumber;

    @ColumnInfo(name = "sku_market_name")
    private String skuMarketName;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long userBoundDeviceId;

    @ColumnInfo(name = "vaid")
    private String vaid;

    @ColumnInfo(name = "version_number")
    private String versionNumber;

    @ColumnInfo(name = "wirelessLan_address")
    private String wirelessLanAddress;

    public class a implements Parcelable.Creator<DBUserBoundDevice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBUserBoundDevice createFromParcel(Parcel parcel) {
            return new DBUserBoundDevice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBUserBoundDevice[] newArray(int i) {
            return new DBUserBoundDevice[i];
        }
    }

    public DBUserBoundDevice() {
    }

    public static String createUserBoundDeviceTableSQL() {
        return "create table if not exists DBUserBoundDevice(_id INTEGER primary key autoincrement not null,ssoid TEXT,device_unique_id TEXT,device_name TEXT,model TEXT,os_version TEXT,version_number TEXT,kernel_version TEXT,android_version TEXT,baseband_version TEXT,rom TEXT,operator TEXT,imei TEXT,serial_number TEXT,wirelessLan_address TEXT,bluetooth_address TEXT,bind_time INTEGER not null,create_time INTEGER not null)";
    }

    public static Parcelable.Creator<DBUserBoundDevice> getCREATOR() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getAppTerminalId() {
        return this.appTerminalId;
    }

    public String getBasebandVersion() {
        return this.basebandVersion;
    }

    public long getBindTime() {
        return this.bindTime;
    }

    public String getBluetoothAddress() {
        return this.bluetoothAddress;
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

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getEid() {
        return this.eid;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getImei() {
        return this.imei;
    }

    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public String getModel() {
        return this.model;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOtaVersion() {
        return this.otaVersion;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getRom() {
        return this.rom;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getSkuMarketName() {
        return this.skuMarketName;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public long getUserBoundDeviceId() {
        return this.userBoundDeviceId;
    }

    public String getVaid() {
        return this.vaid;
    }

    public String getVersionNumber() {
        return this.versionNumber;
    }

    public String getWirelessLanAddress() {
        return this.wirelessLanAddress;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setAppTerminalId(String str) {
        this.appTerminalId = str;
    }

    public void setBasebandVersion(String str) {
        this.basebandVersion = str;
    }

    public void setBindTime(long j2) {
        this.bindTime = j2;
    }

    public void setBluetoothAddress(String str) {
        this.bluetoothAddress = str;
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

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setKernelVersion(String str) {
        this.kernelVersion = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setOperator(String str) {
        this.operator = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setOtaVersion(String str) {
        this.otaVersion = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setRom(String str) {
        this.rom = str;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setSkuMarketName(String str) {
        this.skuMarketName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setUserBoundDeviceId(long j2) {
        this.userBoundDeviceId = j2;
    }

    public void setVaid(String str) {
        this.vaid = str;
    }

    public void setVersionNumber(String str) {
        this.versionNumber = str;
    }

    public void setWirelessLanAddress(String str) {
        this.wirelessLanAddress = str;
    }

    public String toString() {
        return "DBUserBoundDevice{userBoundDeviceId=" + this.userBoundDeviceId + ", ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceName='" + this.deviceName + "', model='" + this.model + "', osVersion='" + this.osVersion + "', versionNumber='" + this.versionNumber + "', kernelVersion='" + this.kernelVersion + "', androidVersion='" + this.androidVersion + "', basebandVersion='" + this.basebandVersion + "', rom='" + this.rom + "', operator='" + this.operator + "', imei='" + this.imei + "', eid='" + this.eid + "', serialNumber='" + this.serialNumber + "', wirelessLanAddress='" + this.wirelessLanAddress + "', bluetoothAddress='" + this.bluetoothAddress + "', nodeId='" + this.nodeId + "', projectId='" + this.projectId + "', boardId='" + this.boardId + "', deviceMarketName='" + this.deviceMarketName + "', skuMarketName='" + this.skuMarketName + "', vaid='" + this.vaid + "', otaVersion='" + this.otaVersion + "', appTerminalId='" + this.appTerminalId + "', bindTime=" + this.bindTime + ", createTime=" + this.createTime + ", guid=" + this.guid + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userBoundDeviceId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.model);
        parcel.writeString(this.osVersion);
        parcel.writeString(this.versionNumber);
        parcel.writeString(this.kernelVersion);
        parcel.writeString(this.androidVersion);
        parcel.writeString(this.basebandVersion);
        parcel.writeString(this.rom);
        parcel.writeString(this.operator);
        parcel.writeString(this.imei);
        parcel.writeString(this.serialNumber);
        parcel.writeString(this.wirelessLanAddress);
        parcel.writeString(this.bluetoothAddress);
        parcel.writeString(this.nodeId);
        parcel.writeString(this.projectId);
        parcel.writeString(this.boardId);
        parcel.writeString(this.deviceMarketName);
        parcel.writeString(this.skuMarketName);
        parcel.writeString(this.vaid);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.appTerminalId);
        parcel.writeLong(this.bindTime);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.guid);
        parcel.writeString(this.eid);
    }

    public DBUserBoundDevice(Parcel parcel) {
        this.userBoundDeviceId = parcel.readLong();
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceName = parcel.readString();
        this.model = parcel.readString();
        this.osVersion = parcel.readString();
        this.versionNumber = parcel.readString();
        this.kernelVersion = parcel.readString();
        this.androidVersion = parcel.readString();
        this.basebandVersion = parcel.readString();
        this.rom = parcel.readString();
        this.operator = parcel.readString();
        this.imei = parcel.readString();
        this.serialNumber = parcel.readString();
        this.wirelessLanAddress = parcel.readString();
        this.bluetoothAddress = parcel.readString();
        this.nodeId = parcel.readString();
        this.projectId = parcel.readString();
        this.boardId = parcel.readString();
        this.deviceMarketName = parcel.readString();
        this.skuMarketName = parcel.readString();
        this.vaid = parcel.readString();
        this.otaVersion = parcel.readString();
        this.appTerminalId = parcel.readString();
        this.bindTime = parcel.readLong();
        this.createTime = parcel.readLong();
        this.guid = parcel.readString();
        this.eid = parcel.readString();
    }
}
