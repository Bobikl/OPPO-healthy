package com.heytap.health.device.third.bgp;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.gdb;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class BpgBean implements Parcelable {
    public static final Parcelable.Creator<BpgBean> CREATOR = new a();
    public static final int SUCCESS_CODE = 0;
    public transient List BPData = new ArrayList();
    String deviceId;
    String deviceMac;
    String deviceName;
    String deviceType;
    int errorCode;
    String errorMsg;
    String manufacturer;
    boolean sdkBindSuccess;
    boolean serviceBindSuccess;

    public class a implements Parcelable.Creator<BpgBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BpgBean createFromParcel(Parcel parcel) {
            return new BpgBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BpgBean[] newArray(int i) {
            return new BpgBean[i];
        }
    }

    public BpgBean(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.deviceType = parcel.readString();
        this.deviceName = parcel.readString();
        this.deviceId = parcel.readString();
        this.deviceMac = parcel.readString();
        this.manufacturer = parcel.readString();
        this.sdkBindSuccess = parcel.readByte() != 0;
        this.serviceBindSuccess = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BpgBean bpgBean = (BpgBean) obj;
        return Objects.equals(this.deviceType, bpgBean.deviceType) && Objects.equals(this.deviceName, bpgBean.deviceName) && Objects.equals(this.deviceId, bpgBean.deviceId) && Objects.equals(this.deviceMac, bpgBean.deviceMac) && Objects.equals(this.manufacturer, bpgBean.manufacturer);
    }

    public List getBPData() {
        return this.BPData;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceMac() {
        return this.deviceMac;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int hashCode() {
        return Objects.hash(this.deviceType, this.deviceName, this.deviceId, this.deviceMac, this.manufacturer);
    }

    public boolean isSdkBindSuccess() {
        return this.sdkBindSuccess;
    }

    public boolean isServiceBindSuccess() {
        return this.serviceBindSuccess;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public boolean isUntie() {
        return this.errorCode == 100;
    }

    public void setBPData(List list) {
        this.BPData = list;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceMac(String str) {
        this.deviceMac = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setSdkBindSuccess(boolean z) {
        this.sdkBindSuccess = z;
    }

    public void setServiceBindSuccess(boolean z) {
        this.serviceBindSuccess = z;
    }

    public String toString() {
        return "BpgBindOrDataBean{errorCode=" + this.errorCode + ", deviceType=" + this.deviceType + ", deviceMac='" + gdb.a(this.deviceMac) + "', sdkBindSuccess='" + this.sdkBindSuccess + "', serviceBindSuccess='" + this.serviceBindSuccess + "', manufacturer='" + this.manufacturer + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceMac);
        parcel.writeString(this.manufacturer);
        parcel.writeByte(this.sdkBindSuccess ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.serviceBindSuccess ? (byte) 1 : (byte) 0);
    }

    public BpgBean() {
    }
}
