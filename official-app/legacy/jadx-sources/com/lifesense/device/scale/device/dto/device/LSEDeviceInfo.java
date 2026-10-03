package com.lifesense.device.scale.device.dto.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.device.scale.device.product.DisplayProduct;
import com.lifesense.device.scale.device.product.FactoryProtocol;

/* JADX INFO: loaded from: classes4.dex */
public class LSEDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<LSEDeviceInfo> CREATOR = new a();
    public String deviceName;
    public LsDeviceInfo lsDeviceInfo;
    public String macAddress;
    public FactoryProtocol protocolType;
    public byte[] scanRecord;

    public static class a implements Parcelable.Creator<LSEDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LSEDeviceInfo createFromParcel(Parcel parcel) {
            return new LSEDeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LSEDeviceInfo[] newArray(int i) {
            return new LSEDeviceInfo[i];
        }
    }

    public LSEDeviceInfo(Parcel parcel) {
        this.macAddress = parcel.readString();
        this.deviceName = parcel.readString();
        int i = parcel.readInt();
        this.protocolType = i == -1 ? null : FactoryProtocol.values()[i];
        this.lsDeviceInfo = (LsDeviceInfo) parcel.readParcelable(LsDeviceInfo.class.getClassLoader());
        this.scanRecord = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.lsDeviceInfo.getDeviceId();
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public LsDeviceInfo getLsDeviceInfo() {
        return this.lsDeviceInfo;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public FactoryProtocol getProtocolType() {
        return this.protocolType;
    }

    public byte[] getScanRecord() {
        return this.scanRecord;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.macAddress);
        parcel.writeString(this.deviceName);
        FactoryProtocol factoryProtocol = this.protocolType;
        parcel.writeInt(factoryProtocol == null ? -1 : factoryProtocol.ordinal());
        parcel.writeParcelable(this.lsDeviceInfo, i);
        parcel.writeByteArray(this.scanRecord);
    }

    public LSEDeviceInfo(DisplayProduct displayProduct, LsDeviceInfo lsDeviceInfo) {
        this.macAddress = lsDeviceInfo.getMacAddress();
        this.deviceName = lsDeviceInfo.getDeviceName();
        this.protocolType = displayProduct.getFactoryProducts().get(0).getFactoryProtocal();
        this.lsDeviceInfo = lsDeviceInfo;
    }

    public LSEDeviceInfo(DisplayProduct displayProduct, String str, String str2, byte[] bArr) {
        this.macAddress = str;
        this.deviceName = str2;
        this.protocolType = displayProduct.getFactoryProducts().get(0).getFactoryProtocal();
        this.scanRecord = bArr;
    }
}
