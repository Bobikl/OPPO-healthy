package com.heytap.health.oobe.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.oobe.OOBELogKt;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.t04;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b_\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bé\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0003¢\u0006\u0002\u0010'J\t\u0010r\u001a\u00020\u0015HÖ\u0001J\b\u0010s\u001a\u00020\u0003H\u0016J\u0019\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u0015HÖ\u0001R\u001e\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R\u001e\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+R\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R\u001e\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010)\"\u0004\bM\u0010+R\u001e\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u001e\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010)\"\u0004\bY\u0010+R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010+R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R\u001e\u0010 \u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010)\"\u0004\ba\u0010+R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010)\"\u0004\bc\u0010+R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010)\"\u0004\be\u0010+R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010)\"\u0004\bi\u0010+R\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010)\"\u0004\bk\u0010+R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001e\u0010%\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010)\"\u0004\bq\u0010+¨\u0006y"}, d2 = {"Lcom/heytap/health/oobe/dto/DeviceDetailInfo;", "Landroid/os/Parcelable;", ServiceNodeBundleKeys.DEVICE_NAME, "", "deviceType", t04.DEVICE_UNIQUE_ID, e36.PARAM_FIRMWARE_VERSION, "hardwareVersion", HttpConst.OTA_VERSION, "manufacturer", "model", "deviceSn", "mac", "bleMac", "bleSecretMetadata", "sku", e36.PARAM_SKU_CODE, "bluetoothName", "projectId", "boardId", "subDeviceType", "", "deviceOsVersion", "deviceMarketName", "skuMarketName", "guid", "iwatchKey", "iwatchRandom", "sign", dj8.KEY_SN, "imei", "bindKey", DistrictSearchQuery.KEYWORDS_PROVINCE, DistrictSearchQuery.KEYWORDS_CITY, "microMac", DistrictSearchQuery.KEYWORDS_DISTRICT, "appTerminalId", "vaid", "deviceSsoid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppTerminalId", "()Ljava/lang/String;", "setAppTerminalId", "(Ljava/lang/String;)V", "getBindKey", "setBindKey", "getBleMac", "setBleMac", "getBleSecretMetadata", "setBleSecretMetadata", "getBluetoothName", "setBluetoothName", "getBoardId", "setBoardId", "getCity", "setCity", "getDeviceMarketName", "setDeviceMarketName", "getDeviceName", "setDeviceName", "getDeviceOsVersion", "setDeviceOsVersion", "getDeviceSn", "setDeviceSn", "getDeviceSsoid", "setDeviceSsoid", "getDeviceType", "setDeviceType", "getDeviceUniqueId", "setDeviceUniqueId", "getDistrict", "setDistrict", "getFirmwareVersion", "setFirmwareVersion", "getGuid", "setGuid", "getHardwareVersion", "setHardwareVersion", "getImei", "setImei", "getIwatchKey", "setIwatchKey", "getIwatchRandom", "setIwatchRandom", "getMac", "setMac", "getManufacturer", "setManufacturer", "getMicroMac", "setMicroMac", "getModel", "setModel", "getOtaVersion", "setOtaVersion", "getProjectId", "setProjectId", "getProvince", "setProvince", "getSign", "setSign", "getSku", "setSku", "getSkuCode", "setSkuCode", "getSkuMarketName", "setSkuMarketName", "getSn", "setSn", "getSubDeviceType", "()I", "setSubDeviceType", "(I)V", "getVaid", "setVaid", "describeContents", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceDetailInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeviceDetailInfo> CREATOR = new a();

    @SerializedName("appTerminalId")
    @NotNull
    private String appTerminalId;

    @SerializedName("bindKey")
    @NotNull
    private String bindKey;

    @SerializedName("bleMac")
    @NotNull
    private String bleMac;

    @SerializedName("bleSecretMetadata")
    @NotNull
    private String bleSecretMetadata;

    @SerializedName("bluetoothName")
    @NotNull
    private String bluetoothName;

    @SerializedName("boardId")
    @NotNull
    private String boardId;

    @SerializedName(DistrictSearchQuery.KEYWORDS_CITY)
    @NotNull
    private String city;

    @SerializedName("deviceMarketName")
    @NotNull
    private String deviceMarketName;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    @NotNull
    private String deviceName;

    @SerializedName("deviceOsVersion")
    @NotNull
    private String deviceOsVersion;

    @SerializedName("deviceSn")
    @NotNull
    private String deviceSn;

    @NotNull
    private String deviceSsoid;

    @SerializedName("deviceType")
    @Nullable
    private String deviceType;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @SerializedName(DistrictSearchQuery.KEYWORDS_DISTRICT)
    @NotNull
    private String district;

    @SerializedName(e36.PARAM_FIRMWARE_VERSION)
    @NotNull
    private String firmwareVersion;

    @SerializedName("guid")
    @NotNull
    private String guid;

    @SerializedName("hardwareVersion")
    @NotNull
    private String hardwareVersion;

    @SerializedName("imei")
    @NotNull
    private String imei;

    @SerializedName("iwatchKey")
    @Nullable
    private String iwatchKey;

    @SerializedName("iwatchRandom")
    @Nullable
    private String iwatchRandom;

    @SerializedName("mac")
    @NotNull
    private String mac;

    @SerializedName("manufacturer")
    @NotNull
    private String manufacturer;

    @SerializedName("microMac")
    @NotNull
    private String microMac;

    @SerializedName("model")
    @NotNull
    private String model;

    @SerializedName(HttpConst.OTA_VERSION)
    @NotNull
    private String otaVersion;

    @SerializedName("projectId")
    @NotNull
    private String projectId;

    @SerializedName(DistrictSearchQuery.KEYWORDS_PROVINCE)
    @NotNull
    private String province;

    @SerializedName("sign")
    @NotNull
    private String sign;

    @SerializedName("sku")
    @NotNull
    private String sku;

    @SerializedName(e36.PARAM_SKU_CODE)
    @NotNull
    private String skuCode;

    @SerializedName("skuMarketName")
    @NotNull
    private String skuMarketName;

    @SerializedName(dj8.KEY_SN)
    @NotNull
    private String sn;

    @SerializedName("subDeviceType")
    private int subDeviceType;

    @SerializedName("mobileVaid")
    @NotNull
    private String vaid;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeviceDetailInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceDetailInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceDetailInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DeviceDetailInfo[] newArray(int i) {
            return new DeviceDetailInfo[i];
        }
    }

    public DeviceDetailInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getAppTerminalId() {
        return this.appTerminalId;
    }

    @NotNull
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final String getBleMac() {
        return this.bleMac;
    }

    @NotNull
    public final String getBleSecretMetadata() {
        return this.bleSecretMetadata;
    }

    @NotNull
    public final String getBluetoothName() {
        return this.bluetoothName;
    }

    @NotNull
    public final String getBoardId() {
        return this.boardId;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getDeviceMarketName() {
        return this.deviceMarketName;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceOsVersion() {
        return this.deviceOsVersion;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @NotNull
    public final String getDeviceSsoid() {
        return this.deviceSsoid;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    public final String getIwatchKey() {
        return this.iwatchKey;
    }

    @Nullable
    public final String getIwatchRandom() {
        return this.iwatchRandom;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getMicroMac() {
        return this.microMac;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSkuCode() {
        return this.skuCode;
    }

    @NotNull
    public final String getSkuMarketName() {
        return this.skuMarketName;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getSubDeviceType() {
        return this.subDeviceType;
    }

    @NotNull
    public final String getVaid() {
        return this.vaid;
    }

    public final void setAppTerminalId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appTerminalId = str;
    }

    public final void setBindKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindKey = str;
    }

    public final void setBleMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleMac = str;
    }

    public final void setBleSecretMetadata(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bleSecretMetadata = str;
    }

    public final void setBluetoothName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bluetoothName = str;
    }

    public final void setBoardId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.boardId = str;
    }

    public final void setCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setDeviceMarketName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceMarketName = str;
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setDeviceOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceOsVersion = str;
    }

    public final void setDeviceSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceSn = str;
    }

    public final void setDeviceSsoid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceSsoid = str;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setDeviceUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceUniqueId = str;
    }

    public final void setDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.district = str;
    }

    public final void setFirmwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firmwareVersion = str;
    }

    public final void setGuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.guid = str;
    }

    public final void setHardwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareVersion = str;
    }

    public final void setImei(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imei = str;
    }

    public final void setIwatchKey(@Nullable String str) {
        this.iwatchKey = str;
    }

    public final void setIwatchRandom(@Nullable String str) {
        this.iwatchRandom = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setManufacturer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manufacturer = str;
    }

    public final void setMicroMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.microMac = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOtaVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otaVersion = str;
    }

    public final void setProjectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectId = str;
    }

    public final void setProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.province = str;
    }

    public final void setSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sign = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setSkuCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skuCode = str;
    }

    public final void setSkuMarketName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skuMarketName = str;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final void setSubDeviceType(int i) {
        this.subDeviceType = i;
    }

    public final void setVaid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vaid = str;
    }

    @NotNull
    public String toString() {
        String str = this.deviceName;
        String str2 = this.deviceMarketName;
        String strB = OOBELogKt.b(this.deviceUniqueId);
        String str3 = this.bluetoothName;
        String str4 = this.deviceType;
        String str5 = this.firmwareVersion;
        String str6 = this.hardwareVersion;
        String str7 = this.otaVersion;
        String str8 = this.model;
        String str9 = this.iwatchKey;
        return "DeviceDetailInfo(deviceName='" + str + "', deviceMarketName=" + str2 + ", deviceUniqueId=" + strB + ", bluetoothName=" + str3 + ", deviceType=" + str4 + ", firmwareVersion=" + str5 + ", hardwareVersion=" + str6 + ", otaVersion=" + str7 + ", model=" + str8 + ", iwatchKey=" + (str9 != null ? OOBELogKt.b(str9) : null) + ", iwatchRandom=" + this.iwatchRandom + ", deviceSn=" + OOBELogKt.b(this.deviceSn) + ", bleSecretMetadata=" + gdb.a(this.bleSecretMetadata) + ", sku=" + this.sku + ", skuCode=" + this.skuCode + ", projectId=" + this.projectId + ", boardId=" + this.boardId + ", subDeviceType=" + this.subDeviceType + ", deviceOsVersion=" + this.deviceOsVersion + ", skuMarketName=" + this.skuMarketName + ", guid=" + this.guid + ", imei=" + OOBELogKt.b(this.imei) + ", bindKey='" + OOBELogKt.b(this.bindKey) + "', district='" + this.district + "', appTerminalId='" + this.appTerminalId + "', deviceSsoid='" + OOBELogKt.b(this.deviceSsoid) + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceSn);
        parcel.writeString(this.mac);
        parcel.writeString(this.bleMac);
        parcel.writeString(this.bleSecretMetadata);
        parcel.writeString(this.sku);
        parcel.writeString(this.skuCode);
        parcel.writeString(this.bluetoothName);
        parcel.writeString(this.projectId);
        parcel.writeString(this.boardId);
        parcel.writeInt(this.subDeviceType);
        parcel.writeString(this.deviceOsVersion);
        parcel.writeString(this.deviceMarketName);
        parcel.writeString(this.skuMarketName);
        parcel.writeString(this.guid);
        parcel.writeString(this.iwatchKey);
        parcel.writeString(this.iwatchRandom);
        parcel.writeString(this.sign);
        parcel.writeString(this.sn);
        parcel.writeString(this.imei);
        parcel.writeString(this.bindKey);
        parcel.writeString(this.province);
        parcel.writeString(this.city);
        parcel.writeString(this.microMac);
        parcel.writeString(this.district);
        parcel.writeString(this.appTerminalId);
        parcel.writeString(this.vaid);
        parcel.writeString(this.deviceSsoid);
    }

    public DeviceDetailInfo(@NotNull String deviceName, @Nullable String str, @NotNull String deviceUniqueId, @NotNull String firmwareVersion, @NotNull String hardwareVersion, @NotNull String otaVersion, @NotNull String manufacturer, @NotNull String model, @NotNull String deviceSn, @NotNull String mac, @NotNull String bleMac, @NotNull String bleSecretMetadata, @NotNull String sku, @NotNull String skuCode, @NotNull String bluetoothName, @NotNull String projectId, @NotNull String boardId, int i, @NotNull String deviceOsVersion, @NotNull String deviceMarketName, @NotNull String skuMarketName, @NotNull String guid, @Nullable String str2, @Nullable String str3, @NotNull String sign, @NotNull String sn, @NotNull String imei, @NotNull String bindKey, @NotNull String province, @NotNull String city, @NotNull String microMac, @NotNull String district, @NotNull String appTerminalId, @NotNull String vaid, @NotNull String deviceSsoid) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        Intrinsics.checkNotNullParameter(otaVersion, "otaVersion");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bleMac, "bleMac");
        Intrinsics.checkNotNullParameter(bleSecretMetadata, "bleSecretMetadata");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(skuCode, "skuCode");
        Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(deviceOsVersion, "deviceOsVersion");
        Intrinsics.checkNotNullParameter(deviceMarketName, "deviceMarketName");
        Intrinsics.checkNotNullParameter(skuMarketName, "skuMarketName");
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(bindKey, "bindKey");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(microMac, "microMac");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(appTerminalId, "appTerminalId");
        Intrinsics.checkNotNullParameter(vaid, "vaid");
        Intrinsics.checkNotNullParameter(deviceSsoid, "deviceSsoid");
        this.deviceName = deviceName;
        this.deviceType = str;
        this.deviceUniqueId = deviceUniqueId;
        this.firmwareVersion = firmwareVersion;
        this.hardwareVersion = hardwareVersion;
        this.otaVersion = otaVersion;
        this.manufacturer = manufacturer;
        this.model = model;
        this.deviceSn = deviceSn;
        this.mac = mac;
        this.bleMac = bleMac;
        this.bleSecretMetadata = bleSecretMetadata;
        this.sku = sku;
        this.skuCode = skuCode;
        this.bluetoothName = bluetoothName;
        this.projectId = projectId;
        this.boardId = boardId;
        this.subDeviceType = i;
        this.deviceOsVersion = deviceOsVersion;
        this.deviceMarketName = deviceMarketName;
        this.skuMarketName = skuMarketName;
        this.guid = guid;
        this.iwatchKey = str2;
        this.iwatchRandom = str3;
        this.sign = sign;
        this.sn = sn;
        this.imei = imei;
        this.bindKey = bindKey;
        this.province = province;
        this.city = city;
        this.microMac = microMac;
        this.district = district;
        this.appTerminalId = appTerminalId;
        this.vaid = vaid;
        this.deviceSsoid = deviceSsoid;
    }

    public /* synthetic */ DeviceDetailInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) != 0 ? "" : str15, (i2 & 32768) != 0 ? "" : str16, (i2 & 65536) != 0 ? "" : str17, (i2 & 131072) != 0 ? 0 : i, (i2 & 262144) != 0 ? "" : str18, (i2 & 524288) != 0 ? "" : str19, (i2 & 1048576) != 0 ? "" : str20, (i2 & 2097152) != 0 ? "" : str21, (i2 & 4194304) != 0 ? "" : str22, (i2 & 8388608) != 0 ? "" : str23, (i2 & 16777216) != 0 ? "" : str24, (i2 & 33554432) != 0 ? "" : str25, (i2 & 67108864) != 0 ? "" : str26, (i2 & 134217728) != 0 ? "" : str27, (i2 & 268435456) != 0 ? "" : str28, (i2 & 536870912) != 0 ? "" : str29, (i2 & 1073741824) != 0 ? "" : str30, (i2 & Integer.MIN_VALUE) != 0 ? "" : str31, (i3 & 1) != 0 ? "" : str32, (i3 & 2) != 0 ? "" : str33, (i3 & 4) != 0 ? "" : str34);
    }
}
