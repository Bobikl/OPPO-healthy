package com.omron.lib.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.heytap.wearable.support.watchface.common.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class BpDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<BpDeviceInfo> CREATOR = new Parcelable.Creator<BpDeviceInfo>() { // from class: com.omron.lib.bean.BpDeviceInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BpDeviceInfo createFromParcel(Parcel parcel) {
            return new BpDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BpDeviceInfo[] newArray(int i) {
            return new BpDeviceInfo[i];
        }
    };

    @Nullable
    private Integer batteryLevel;

    @Nullable
    private String cmei;

    @Nullable
    private String deviceBrand;

    @Nullable
    private String deviceType;

    @Nullable
    private String deviceVendor;

    @Nullable
    private String firmwareVersion;
    private String macAddress;

    @Nullable
    private String moduleType;
    private String name;

    @Nullable
    private String networkType;

    @Nullable
    private String os;

    @Nullable
    private String powerSupplyModel;

    @Nullable
    private String productToken;

    @Nullable
    private String protocolVersion;

    @Nullable
    private String realSn;

    @Nullable
    private String serialNumber;
    private String softVersion;
    private String type;

    public BpDeviceInfo(Parcel parcel) {
        this.protocolVersion = Constants.HeyBuildVersion.V1_0;
        this.softVersion = Constants.HeyBuildVersion.V1_0;
        this.os = "NO OS";
        this.networkType = "Bluetooth";
        this.deviceVendor = "OMRONHEALTHCARE";
        this.deviceBrand = "OMRON";
        this.powerSupplyModel = "battery/220V";
        this.moduleType = "Bluetooth";
        this.type = parcel.readString();
        this.name = parcel.readString();
        this.macAddress = parcel.readString();
        this.batteryLevel = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.firmwareVersion = parcel.readString();
        this.serialNumber = parcel.readString();
        this.protocolVersion = parcel.readString();
        this.deviceType = parcel.readString();
        this.cmei = parcel.readString();
        this.productToken = parcel.readString();
        this.realSn = parcel.readString();
        this.os = parcel.readString();
        this.networkType = parcel.readString();
        this.deviceVendor = parcel.readString();
        this.deviceBrand = parcel.readString();
        this.powerSupplyModel = parcel.readString();
        this.moduleType = parcel.readString();
        this.softVersion = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "BpDeviceInfo{type='" + this.type + "', name='" + this.name + "', macAddress='" + this.macAddress + "', batteryLevel=" + this.batteryLevel + ", firmwareVersion='" + this.firmwareVersion + "', serialNumber='" + this.serialNumber + "', protocolVersion='" + this.protocolVersion + "', softVersion='" + this.softVersion + "', deviceType='" + this.deviceType + "', cmei='" + this.cmei + "', productToken='" + this.productToken + "', realSn='" + this.realSn + "', os='" + this.os + "', networkType='" + this.networkType + "', deviceVendor='" + this.deviceVendor + "', deviceBrand='" + this.deviceBrand + "', powerSupplyModel='" + this.powerSupplyModel + "', moduleType='" + this.moduleType + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.macAddress);
        if (this.batteryLevel == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.batteryLevel.intValue());
        }
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.serialNumber);
        parcel.writeString(this.protocolVersion);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.cmei);
        parcel.writeString(this.productToken);
        parcel.writeString(this.realSn);
        parcel.writeString(this.os);
        parcel.writeString(this.networkType);
        parcel.writeString(this.deviceVendor);
        parcel.writeString(this.deviceBrand);
        parcel.writeString(this.powerSupplyModel);
        parcel.writeString(this.moduleType);
        parcel.writeString(this.softVersion);
    }
}
