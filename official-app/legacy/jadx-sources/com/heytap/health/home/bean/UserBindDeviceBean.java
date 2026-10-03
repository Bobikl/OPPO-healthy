package com.heytap.health.home.bean;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.t04;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class UserBindDeviceBean {

    @SerializedName("appTerminalId")
    private String appTerminalId;

    @SerializedName("bindingTime")
    private long bindingTime;

    @SerializedName("microMac")
    private String bleMac;

    @SerializedName("bleSecretMetadata")
    private String bleSecretMetadata;

    @SerializedName("boardId")
    private String boardId;

    @SerializedName("capacityPercent")
    private int capacityPercent;

    @SerializedName("connectionState")
    private int connectionState;

    @SerializedName("deviceIcon")
    private Bitmap deviceIcon;

    @SerializedName("deviceIconPath")
    private String deviceIconPath;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String deviceName;

    @SerializedName("deviceSn")
    private String deviceSn;

    @SerializedName("deviceType")
    private int deviceType;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @SerializedName(e36.PARAM_FIRMWARE_VERSION)
    private String firmwareVersion;

    @SerializedName("hardwareVersion")
    private String hardwareVersion;

    @SerializedName("isShowRedDot")
    private boolean isShowRedDot;

    @SerializedName("mac")
    private String mac;

    @SerializedName("manufacturer")
    private String manufacturer;

    @SerializedName("marketMode")
    private int marketMode;

    @SerializedName("marketModeTimestamp")
    private long marketModeTimestamp;

    @SerializedName("model")
    private String model;

    @SerializedName("pictureIdImage")
    private String pictureIdImage;

    @SerializedName("projectId")
    private String projectId;

    @SerializedName("sku")
    private String sku;

    @SerializedName(e36.PARAM_SKU_CODE)
    private String skuCode;

    public String getAppTerminalId() {
        return this.appTerminalId;
    }

    public long getBindingTime() {
        return this.bindingTime;
    }

    public String getBleMac() {
        return this.bleMac;
    }

    public String getBleSecretMetadata() {
        return this.bleSecretMetadata;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public int getCapacityPercent() {
        return this.capacityPercent;
    }

    public int getConnectionState() {
        return this.connectionState;
    }

    public Bitmap getDeviceIcon() {
        return this.deviceIcon;
    }

    public String getDeviceIconPath() {
        return this.deviceIconPath;
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

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getMac() {
        return this.mac;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getMarketMode() {
        return this.marketMode;
    }

    public long getMarketModeTimestamp() {
        return this.marketModeTimestamp;
    }

    public String getModel() {
        return this.model;
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

    public boolean isShowRedDot() {
        return this.isShowRedDot;
    }

    public void setAppTerminalId(String str) {
        this.appTerminalId = str;
    }

    public void setBindingTime(long j2) {
        this.bindingTime = j2;
    }

    public void setBleMac(String str) {
        this.bleMac = str;
    }

    public void setBleSecretMetadata(String str) {
        this.bleSecretMetadata = str;
    }

    public void setBoardId(String str) {
        this.boardId = str;
    }

    public void setCapacityPercent(int i) {
        this.capacityPercent = i;
    }

    public void setConnectionState(int i) {
        this.connectionState = i;
    }

    public void setDeviceIcon(Bitmap bitmap) {
        this.deviceIcon = bitmap;
    }

    public void setDeviceIconPath(String str) {
        this.deviceIconPath = str;
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

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMarketMode(int i) {
        this.marketMode = i;
    }

    public void setMarketModeTimestamp(long j2) {
        this.marketModeTimestamp = j2;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setPictureIdImage(String str) {
        this.pictureIdImage = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setShowRedDot(boolean z) {
        this.isShowRedDot = z;
    }

    public void setSku(String str) {
        this.sku = str;
    }

    public void setSkuCode(String str) {
        this.skuCode = str;
    }

    public String toString() {
        return "UserBindDeviceBean{deviceName='" + this.deviceName + "', deviceIcon=" + this.deviceIcon + ", deviceIconPath='" + this.deviceIconPath + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', firmwareVersion='" + this.firmwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', manufacturer='" + this.manufacturer + "', model='" + this.model + "', deviceSn='" + this.deviceSn + "', mac='" + this.mac + "', bleMac='" + this.bleMac + "', bleSecretMetadata='" + this.bleSecretMetadata + "', appTerminalId='" + this.appTerminalId + "', bindingTime=" + this.bindingTime + ", sku='" + this.sku + "', skuCode='" + this.skuCode + "', pictureIdImage='" + this.pictureIdImage + "', marketMode=" + this.marketMode + ", marketModeTimestamp=" + this.marketModeTimestamp + ", connectionState=" + this.connectionState + ", capacityPercent=" + this.capacityPercent + ", isShowRedDot=" + this.isShowRedDot + ", boardId='" + this.boardId + "', projectId='" + this.projectId + "'}";
    }
}
