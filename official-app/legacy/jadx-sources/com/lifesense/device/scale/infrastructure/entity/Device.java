package com.lifesense.device.scale.infrastructure.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.annotation.JSONField;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;

/* JADX INFO: loaded from: classes4.dex */
public class Device implements Parcelable {
    public static final int COMM_BLE = 4;
    public static final Parcelable.Creator<Device> CREATOR = new a();
    public static final String PRODUCT_ALI_PAY = "11";
    public static final String PRODUCT_BLOOD_GLUCOSE = "06";
    public static final String PRODUCT_BLOOD_PRESSURE = "08";
    public static final String PRODUCT_FAT_SCALE = "02";
    public static final String PRODUCT_NORMAL_WEIGHT = "01";
    public static final String PRODUCT_PEDOMETER = "04";
    public static final String PRODUCT_SLEEPACE = "14";
    public boolean connected;
    public String hardwareVersion;
    public String id;

    @JSONField(name = "imgUrl")
    public String imageUrl;
    public String mac;
    public String model;
    public String name;
    public String osVersion;

    @JSONField(name = "softwareVersion")
    public String otaVersion;
    public String phoneImei;
    public String phoneModel;
    public String phoneOs;
    public String phonePower;
    public String productTypeCode;
    public String sn;
    public String transferName;
    public Long userId;
    public String venderId;

    public static class a implements Parcelable.Creator<Device> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Device[] newArray(int i) {
            return new Device[i];
        }
    }

    public Device() {
    }

    public Device(Parcel parcel) {
        this.id = parcel.readString();
        this.userId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.name = parcel.readString();
        this.otaVersion = parcel.readString();
        this.mac = parcel.readString();
        this.phonePower = parcel.readString();
        this.phoneOs = parcel.readString();
        this.osVersion = parcel.readString();
        this.phoneModel = parcel.readString();
        this.phoneImei = parcel.readString();
        this.connected = parcel.readByte() != 0;
        this.imageUrl = parcel.readString();
        this.transferName = parcel.readString();
        this.hardwareVersion = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Device.class != obj.getClass()) {
            return false;
        }
        return this.id.equals(((Device) obj).id);
    }

    public boolean getConnected() {
        return this.connected;
    }

    public DeviceType getDeviceType() {
        if ("02".equals(this.productTypeCode)) {
            return DeviceType.FAT_SCALE;
        }
        if ("04".equals(this.productTypeCode)) {
            return DeviceType.PEDOMETER;
        }
        return "08".equals(this.productTypeCode) ? DeviceType.BLOOD_PRESSURE : DeviceType.UNKNOWN;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getMac() {
        return this.mac;
    }

    public String getMacConvert() {
        if (TextUtils.isEmpty(this.mac)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(this.mac);
            for (int i = 2; i < sb.length(); i = i + 1 + 2) {
                sb.insert(i, ':');
            }
            return sb.toString();
        } catch (Exception e2) {
            Log.e("GET_MAC_CONVERT_ERROR", e2.getMessage());
            return null;
        }
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOtaVersion() {
        return this.otaVersion;
    }

    public String getPhoneImei() {
        return this.phoneImei;
    }

    public String getPhoneModel() {
        return this.phoneModel;
    }

    public String getPhoneOs() {
        return this.phoneOs;
    }

    public String getPhonePower() {
        return this.phonePower;
    }

    public String getProductTypeCode() {
        return this.productTypeCode;
    }

    public String getSn() {
        return this.sn;
    }

    public String getTransferName() {
        return this.transferName;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getVenderId() {
        return this.venderId;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void setConnected(boolean z) {
        this.connected = z;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setOtaVersion(String str) {
        this.otaVersion = str;
    }

    public void setPhoneImei(String str) {
        this.phoneImei = str;
    }

    public void setPhoneModel(String str) {
        this.phoneModel = str;
    }

    public void setPhoneOs(String str) {
        this.phoneOs = str;
    }

    public void setPhonePower(String str) {
        this.phonePower = str;
    }

    public void setProductTypeCode(String str) {
        this.productTypeCode = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setTransferName(String str) {
        this.transferName = str;
    }

    public void setUserId(Long l2) {
        this.userId = l2;
    }

    public void setVenderId(String str) {
        this.venderId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeValue(this.userId);
        parcel.writeString(this.name);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.mac);
        parcel.writeString(this.phonePower);
        parcel.writeString(this.phoneOs);
        parcel.writeString(this.osVersion);
        parcel.writeString(this.phoneModel);
        parcel.writeString(this.phoneImei);
        parcel.writeByte(this.connected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.transferName);
        parcel.writeString(this.hardwareVersion);
    }

    public Device(String str) {
        this.id = str;
    }

    public Device(String str, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.id = str;
        this.userId = l2;
        this.name = str2;
        this.otaVersion = str3;
        this.mac = str4;
        this.hardwareVersion = str5;
        this.phonePower = str6;
        this.phoneOs = str7;
        this.osVersion = str8;
        this.phoneModel = str9;
        this.phoneImei = str10;
        this.connected = z;
        this.imageUrl = str11;
        this.transferName = str12;
        this.productTypeCode = str13;
        this.model = str14;
        this.venderId = str15;
        this.sn = str16;
    }
}
