package com.heytap.health.devicemanager.processor.bean;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.ExtraInfo;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.z7b;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.io.Serializable;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class UserDeviceInfo implements Comparable<UserDeviceInfo>, Parcelable, Serializable, Cloneable {
    public static final int BATTERY_NULL = -1;
    public static final int CLOUD_BINDSECONDARY = 1;
    public static final int CLOUD_ROLE_NONE = -1;
    public static final int CLOUD_ROLE_PRIMARY = 0;
    public static final int CLOUD_ROLE_SECONDARY = 1;
    public static final Parcelable.Creator<UserDeviceInfo> CREATOR = new a();
    public static final int DEVICE_DISCONNECTED = 103;
    public static final int DEVICE_LINKED = 102;
    public static final int DEVICE_LINKED_BALANCE = 105;
    public static final int DEVICE_LINKED_BLE = 104;
    public static final int DEVICE_LINKING = 101;
    public static final int DEVICE_UNLINK = 100;
    public static final String TAG = "UserDeviceInfo";

    @SerializedName("appTerminalId")
    private String appTerminalId;

    @SerializedName("bindSecondary")
    private int bindSecondary;

    @SerializedName("bindingTime")
    private long bindingTime;

    @SerializedName("microMac")
    private String bleMac;

    @SerializedName("bleSecretMetadata")
    private String bleSecretMetadata;

    @SerializedName("boardId")
    private String boardId;
    private int capacityPercent;
    private int chargeStatus;
    private boolean clickable;
    private int connectionState;

    @SerializedName("deviceIcon")
    private Bitmap deviceIcon;

    @SerializedName("deviceIconPath")
    private String deviceIconPath;

    @SerializedName("deviceManageIdImage")
    private String deviceManageIdImage;

    @SerializedName("deviceMarketName")
    private String deviceMarketName;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String deviceName;

    @SerializedName("deviceOsVersion")
    private String deviceOsVersion;

    @SerializedName("deviceSn")
    private String deviceSn;

    @SerializedName("deviceType")
    private int deviceType;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @SerializedName(e36.PARAM_FIRMWARE_VERSION)
    private String firmwareVersion;

    @SerializedName("guid")
    private String guid;

    @SerializedName("hardwareVersion")
    private String hardwareVersion;

    @SerializedName("imei")
    private String imei;

    @SerializedName("iwatchKey")
    private String iwatchKey;

    @SerializedName("iwatchRandom")
    private String iwatchRandom;

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

    @SerializedName(HttpConst.OTA_VERSION)
    private String otaVersion;

    @SerializedName("pictureIdImage")
    private String pictureIdImage;

    @SerializedName("projectId")
    private String projectId;

    @SerializedName("secondary")
    private int secondary;

    @SerializedName("sku")
    private String sku;

    @SerializedName(e36.PARAM_SKU_CODE)
    private String skuCode;

    @SerializedName("skuMarketName")
    private String skuMarketName;

    @SerializedName("subDeviceType")
    private int subDeviceType;

    @SerializedName("virtualAccountData")
    private VirtualAccountData virtualAccountData;

    public class a implements Parcelable.Creator<UserDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserDeviceInfo createFromParcel(Parcel parcel) {
            return new UserDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserDeviceInfo[] newArray(int i) {
            return new UserDeviceInfo[i];
        }
    }

    public UserDeviceInfo(Parcel parcel) {
        this.secondary = -1;
        this.capacityPercent = -1;
        this.clickable = true;
        this.deviceName = parcel.readString();
        this.deviceIcon = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.deviceIconPath = parcel.readString();
        this.deviceType = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.firmwareVersion = parcel.readString();
        this.hardwareVersion = parcel.readString();
        this.otaVersion = parcel.readString();
        this.manufacturer = parcel.readString();
        this.model = parcel.readString();
        this.deviceSn = parcel.readString();
        this.imei = parcel.readString();
        this.mac = parcel.readString();
        this.bleMac = parcel.readString();
        this.bleSecretMetadata = parcel.readString();
        this.appTerminalId = parcel.readString();
        this.bindingTime = parcel.readLong();
        this.sku = parcel.readString();
        this.skuCode = parcel.readString();
        this.deviceManageIdImage = parcel.readString();
        this.marketMode = parcel.readInt();
        this.marketModeTimestamp = parcel.readLong();
        this.projectId = parcel.readString();
        this.boardId = parcel.readString();
        this.subDeviceType = parcel.readInt();
        this.deviceOsVersion = parcel.readString();
        this.deviceMarketName = parcel.readString();
        this.skuMarketName = parcel.readString();
        this.virtualAccountData = (VirtualAccountData) parcel.readParcelable(VirtualAccountData.class.getClassLoader());
        this.connectionState = parcel.readInt();
        this.capacityPercent = parcel.readInt();
        this.guid = parcel.readString();
        this.pictureIdImage = parcel.readString();
        this.secondary = parcel.readInt();
        this.bindSecondary = parcel.readInt();
        this.iwatchKey = parcel.readString();
        this.iwatchRandom = parcel.readString();
        this.chargeStatus = parcel.readInt();
    }

    private static boolean MacEquals(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return TextUtils.equals(str, str2);
    }

    public static ExtraInfo getExtraInfo(String str) {
        return (ExtraInfo) lc5.d(str).a(new Function1() { // from class: com.oplus.aiunit.vision.snk
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((DeviceModel) obj).e9();
            }
        });
    }

    public static boolean isConnected(int i) {
        return i == 102 || i == 104 || 105 == i;
    }

    public static boolean isConnectedBLE(int i) {
        return i == 104;
    }

    public static boolean isConnectedBT(int i) {
        return i == 102 || 105 == i;
    }

    public static boolean isConnectedBalance(int i) {
        return i == 105;
    }

    public static boolean isConnecteding(int i) {
        return i == 101;
    }

    public static boolean isSameDevice(UserDeviceInfo userDeviceInfo, UserDeviceInfo userDeviceInfo2) {
        if (userDeviceInfo == null || userDeviceInfo2 == null) {
            return false;
        }
        return MacEquals(userDeviceInfo.getMac(), userDeviceInfo2.getMac()) || MacEquals(userDeviceInfo.getDeviceUniqueId(), userDeviceInfo2.getDeviceUniqueId()) || MacEquals(userDeviceInfo.getBleMac(), userDeviceInfo2.getBleMac());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppTerminalId() {
        return this.appTerminalId;
    }

    public long getBindingTime() {
        return this.bindingTime;
    }

    public String getBleMac() {
        return this.bleMac;
    }

    @Nullable
    public String getBleSecretMetadata() {
        return this.bleSecretMetadata;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public int getCapacityPercent() {
        return this.capacityPercent;
    }

    public int getChargeStatus() {
        return this.chargeStatus;
    }

    public int getConnectionState() {
        int i = this.connectionState;
        if (i == 0) {
            return 103;
        }
        return i;
    }

    public Bitmap getDeviceIcon() {
        return this.deviceIcon;
    }

    public String getDeviceIconPath() {
        return this.deviceIconPath;
    }

    public String getDeviceManageIdImage() {
        return this.deviceManageIdImage;
    }

    public String getDeviceMarketName() {
        return this.deviceMarketName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceOsVersion() {
        return this.deviceOsVersion;
    }

    public ra5.c getDeviceRole() {
        return isSecondary() ? ra5.c.C0924c.INSTANCE : ra5.c.b.INSTANCE;
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

    public String getImei() {
        return this.imei;
    }

    @Nullable
    public String getIwatchKey() {
        return this.iwatchKey;
    }

    @Nullable
    public String getIwatchRandom() {
        return this.iwatchRandom;
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

    public String getName() {
        String deviceMarketName = getDeviceMarketName();
        return !TextUtils.isEmpty(deviceMarketName) ? deviceMarketName : getDeviceName();
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

    public int getSecondary() {
        return this.secondary;
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

    public int getSubDeviceType() {
        return this.subDeviceType;
    }

    public VirtualAccountData getVirtualAccountData() {
        return this.virtualAccountData;
    }

    public boolean isBindSecondary() {
        return this.bindSecondary == 1 || isSecondary();
    }

    @JvmName(name = "isCharge")
    public boolean isCharge() {
        return this.chargeStatus == 1;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public boolean isConnect() {
        return isConnected(this.connectionState);
    }

    public boolean isConnectBLE() {
        return isConnectedBLE(this.connectionState);
    }

    public boolean isConnectBT() {
        return isConnectedBT(this.connectionState);
    }

    public boolean isConnecting() {
        return isConnecteding(this.connectionState);
    }

    public boolean isCurrTerminal() {
        String strE = ilj.e();
        String appTerminalId = getAppTerminalId();
        String str = gdb.a(getMac()) + " clould:" + appTerminalId + ",curr:" + strE;
        z7b.f(TAG, str);
        ml4.a(TAG, str);
        return TextUtils.equals(appTerminalId, strE);
    }

    public boolean isSecondary() {
        return this.secondary == 1;
    }

    public void readFromParcel(Parcel parcel) {
        this.deviceName = parcel.readString();
        this.deviceIcon = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.deviceIconPath = parcel.readString();
        this.deviceType = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.firmwareVersion = parcel.readString();
        this.hardwareVersion = parcel.readString();
        this.otaVersion = parcel.readString();
        this.manufacturer = parcel.readString();
        this.model = parcel.readString();
        this.deviceSn = parcel.readString();
        this.imei = parcel.readString();
        this.mac = parcel.readString();
        this.bleMac = parcel.readString();
        this.bleSecretMetadata = parcel.readString();
        this.appTerminalId = parcel.readString();
        this.bindingTime = parcel.readLong();
        this.sku = parcel.readString();
        this.skuCode = parcel.readString();
        this.deviceManageIdImage = parcel.readString();
        this.marketMode = parcel.readInt();
        this.marketModeTimestamp = parcel.readLong();
        this.projectId = parcel.readString();
        this.boardId = parcel.readString();
        this.subDeviceType = parcel.readInt();
        this.deviceOsVersion = parcel.readString();
        this.deviceMarketName = parcel.readString();
        this.skuMarketName = parcel.readString();
        this.virtualAccountData = (VirtualAccountData) parcel.readParcelable(VirtualAccountData.class.getClassLoader());
        this.connectionState = parcel.readInt();
        this.capacityPercent = parcel.readInt();
        this.guid = parcel.readString();
        this.pictureIdImage = parcel.readString();
        this.secondary = parcel.readInt();
        this.bindSecondary = parcel.readInt();
        this.iwatchKey = parcel.readString();
        this.iwatchRandom = parcel.readString();
        this.chargeStatus = parcel.readInt();
    }

    public boolean secondaryIsInvalid() {
        return this.secondary != -1;
    }

    public void setAppTerminalId(String str) {
        this.appTerminalId = str;
    }

    public void setBindSecondary(int i) {
        this.bindSecondary = i;
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

    public void setChargeStatus(int i) {
        this.chargeStatus = i;
    }

    public void setClickable(boolean z) {
        this.clickable = z;
    }

    public void setConnectionState(int i) {
        this.connectionState = i;
    }

    public void setDeviceIcon(Bitmap bitmap) {
        this.deviceIcon = bitmap;
    }

    public void setDeviceManageIdImage(String str) {
        this.deviceManageIdImage = str;
    }

    public void setDeviceMarketName(String str) {
        this.deviceMarketName = str;
    }

    public void setDeviceName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.deviceName = str;
    }

    public void setDeviceOsVersion(String str) {
        this.deviceOsVersion = str;
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

    public void setImei(String str) {
        this.imei = str;
    }

    public void setIwatchKey(String str) {
        this.iwatchKey = str;
    }

    public void setIwatchRandom(String str) {
        this.iwatchRandom = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setModel(String str) {
        this.model = str;
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

    public void setSecondary(int i) {
        this.secondary = i;
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

    public void setSubDeviceType(int i) {
        this.subDeviceType = i;
    }

    public void setVirtualAccountData(VirtualAccountData virtualAccountData) {
        this.virtualAccountData = virtualAccountData;
    }

    public String toString() {
        return "UserDeviceInfo{deviceName='" + this.deviceName + "', mac='" + this.mac + "', model='" + this.model + "', appTerminalId='" + this.appTerminalId + "', connectionState=" + this.connectionState + ", capacityPercent=" + this.capacityPercent + ", chargeStatus=" + this.chargeStatus + ", deviceRole='" + getDeviceRole() + "', isBindSecondary='" + isBindSecondary() + "', deviceType=" + this.deviceType + ", deviceUniqueId='" + this.deviceUniqueId + "', firmwareVersion='" + this.firmwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', key='" + this.iwatchKey + "', R1='" + this.iwatchRandom + "', otaVersion='" + this.otaVersion + "', manufacturer='" + this.manufacturer + "', imei='" + this.imei + "', guid='" + this.guid + "', deviceSn='" + this.deviceSn + "', bleMac='" + this.bleMac + "', bleSecretMetadata='" + this.bleSecretMetadata + "', bindingTime=" + this.bindingTime + ", sku='" + this.sku + "', skuCode='" + this.skuCode + "', projectId='" + this.projectId + "', boardId='" + this.boardId + "', subDeviceType=" + this.subDeviceType + ", deviceOsVersion='" + this.deviceOsVersion + "', deviceMarketName='" + this.deviceMarketName + "', skuMarketName='" + this.skuMarketName + "', virtualAccountData=" + this.virtualAccountData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceName);
        parcel.writeParcelable(this.deviceIcon, i);
        parcel.writeString(this.deviceIconPath);
        parcel.writeInt(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceSn);
        parcel.writeString(this.imei);
        parcel.writeString(this.mac);
        parcel.writeString(this.bleMac);
        parcel.writeString(this.bleSecretMetadata);
        parcel.writeString(this.appTerminalId);
        parcel.writeLong(this.bindingTime);
        parcel.writeString(this.sku);
        parcel.writeString(this.skuCode);
        parcel.writeString(this.deviceManageIdImage);
        parcel.writeInt(this.marketMode);
        parcel.writeLong(this.marketModeTimestamp);
        parcel.writeString(this.projectId);
        parcel.writeString(this.boardId);
        parcel.writeInt(this.subDeviceType);
        parcel.writeString(this.deviceOsVersion);
        parcel.writeString(this.deviceMarketName);
        parcel.writeString(this.skuMarketName);
        parcel.writeParcelable(this.virtualAccountData, i);
        parcel.writeInt(this.connectionState);
        parcel.writeInt(this.capacityPercent);
        parcel.writeString(this.guid);
        parcel.writeString(this.pictureIdImage);
        parcel.writeInt(this.secondary);
        parcel.writeInt(this.bindSecondary);
        parcel.writeString(this.iwatchKey);
        parcel.writeString(this.iwatchRandom);
        parcel.writeInt(this.chargeStatus);
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UserDeviceInfo m4637clone() {
        try {
            UserDeviceInfo userDeviceInfo = (UserDeviceInfo) super.clone();
            VirtualAccountData virtualAccountData = this.virtualAccountData;
            if (virtualAccountData != null) {
                userDeviceInfo.virtualAccountData = virtualAccountData.m4638clone();
            }
            return userDeviceInfo;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDeviceInfo userDeviceInfo) {
        long bindingTime = userDeviceInfo.getBindingTime() - getBindingTime();
        if (bindingTime > 0) {
            return 1;
        }
        return bindingTime < 0 ? -1 : 0;
    }

    public ExtraInfo getExtraInfo() {
        return getExtraInfo(this.model);
    }

    public boolean isConnectedBalance() {
        return isConnectedBalance(this.connectionState);
    }

    public static boolean isSameDevice(UserDeviceInfo userDeviceInfo, String str) {
        if (userDeviceInfo == null) {
            return false;
        }
        return MacEquals(str, userDeviceInfo.getMac()) || MacEquals(str, userDeviceInfo.getDeviceUniqueId()) || MacEquals(str, userDeviceInfo.getBleMac());
    }

    public UserDeviceInfo() {
        this.secondary = -1;
        this.capacityPercent = -1;
        this.clickable = true;
    }

    public UserDeviceInfo(String str) {
        this.secondary = -1;
        this.capacityPercent = -1;
        this.clickable = true;
        this.mac = str;
    }
}
