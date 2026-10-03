package com.lifesense.device.scale.device.product;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class FactoryProduct implements Parcelable {
    public static final Parcelable.Creator<FactoryProduct> CREATOR = new Parcelable.Creator<FactoryProduct>() { // from class: com.lifesense.device.scale.device.product.FactoryProduct.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FactoryProduct createFromParcel(Parcel parcel) {
            return new FactoryProduct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FactoryProduct[] newArray(int i) {
            return new FactoryProduct[i];
        }
    };
    public String bluetoothBroadcastName;
    public String communicationType;
    public int configureManne;
    public long displayProductId;
    public Long id;
    public String model;
    public String name;
    public String productTypeCode;
    public boolean randomCode;
    public String serviceUUID;
    public String transferProtocal;

    public FactoryProduct() {
    }

    public FactoryProduct(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.name = parcel.readString();
        this.model = parcel.readString();
        this.productTypeCode = parcel.readString();
        this.communicationType = parcel.readString();
        this.transferProtocal = parcel.readString();
        this.bluetoothBroadcastName = parcel.readString();
        this.randomCode = parcel.readByte() != 0;
        this.serviceUUID = parcel.readString();
        this.configureManne = parcel.readInt();
        this.displayProductId = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBluetoothBroadcastName() {
        return this.bluetoothBroadcastName;
    }

    public String getCommunicationType() {
        return this.communicationType;
    }

    public int getConfigureManne() {
        return this.configureManne;
    }

    public long getDisplayProductId() {
        return this.displayProductId;
    }

    public FactoryProtocol getFactoryProtocal() {
        return FactoryProtocol.toFactoryProtocal(this.transferProtocal);
    }

    public Long getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public String getProductTypeCode() {
        return this.productTypeCode;
    }

    public boolean getRandomCode() {
        return this.randomCode;
    }

    public String getServiceUUID() {
        return this.serviceUUID;
    }

    public String getTransferProtocal() {
        return this.transferProtocal;
    }

    public void setBluetoothBroadcastName(String str) {
        this.bluetoothBroadcastName = str;
    }

    public void setCommunicationType(String str) {
        this.communicationType = str;
    }

    public void setConfigureManne(int i) {
        this.configureManne = i;
    }

    public void setDisplayProductId(long j2) {
        this.displayProductId = j2;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProductTypeCode(String str) {
        this.productTypeCode = str;
    }

    public void setRandomCode(boolean z) {
        this.randomCode = z;
    }

    public void setServiceUUID(String str) {
        this.serviceUUID = str;
    }

    public void setTransferProtocal(String str) {
        this.transferProtocal = str;
    }

    public String toString() {
        return "FactoryProduct{id=" + this.id + ", name='" + this.name + "', model='" + this.model + "', productTypeCode='" + this.productTypeCode + "', communicationType='" + this.communicationType + "', transferProtocal='" + this.transferProtocal + "', bluetoothBroadcastName='" + this.bluetoothBroadcastName + "', randomCode=" + this.randomCode + ", serviceUUID='" + this.serviceUUID + "', configureManne=" + this.configureManne + ", displayProductId=" + this.displayProductId + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.model);
        parcel.writeString(this.productTypeCode);
        parcel.writeString(this.communicationType);
        parcel.writeString(this.transferProtocal);
        parcel.writeString(this.bluetoothBroadcastName);
        parcel.writeByte(this.randomCode ? (byte) 1 : (byte) 0);
        parcel.writeString(this.serviceUUID);
        parcel.writeInt(this.configureManne);
        parcel.writeLong(this.displayProductId);
    }

    public FactoryProduct(Long l2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, int i, long j2) {
        this.id = l2;
        this.name = str;
        this.model = str2;
        this.productTypeCode = str3;
        this.communicationType = str4;
        this.transferProtocal = str5;
        this.bluetoothBroadcastName = str6;
        this.randomCode = z;
        this.serviceUUID = str7;
        this.configureManne = i;
        this.displayProductId = j2;
    }
}
