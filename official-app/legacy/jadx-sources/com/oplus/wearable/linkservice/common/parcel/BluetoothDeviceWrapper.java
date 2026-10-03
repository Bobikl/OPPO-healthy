package com.oplus.wearable.linkservice.common.parcel;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class BluetoothDeviceWrapper implements Parcelable {
    public static final Parcelable.Creator<BluetoothDeviceWrapper> CREATOR = new a();
    private int mCurrentRssi;
    private BluetoothDevice mDevice;
    private byte[] mScanRecord;

    public class a implements Parcelable.Creator<BluetoothDeviceWrapper> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothDeviceWrapper createFromParcel(Parcel parcel) {
            return new BluetoothDeviceWrapper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BluetoothDeviceWrapper[] newArray(int i) {
            return new BluetoothDeviceWrapper[i];
        }
    }

    public BluetoothDeviceWrapper(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.mDevice = bluetoothDevice;
        this.mCurrentRssi = i;
        this.mScanRecord = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        BluetoothDevice bluetoothDevice = this.mDevice;
        return (bluetoothDevice == null || obj == null) ? super.equals(obj) : bluetoothDevice.equals(((BluetoothDeviceWrapper) obj).mDevice);
    }

    public int getCurrentRssi() {
        return this.mCurrentRssi;
    }

    public BluetoothDevice getDevice() {
        return this.mDevice;
    }

    public byte[] getScanRecord() {
        return this.mScanRecord;
    }

    public int hashCode() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        return bluetoothDevice != null ? bluetoothDevice.hashCode() : super.hashCode();
    }

    public void setCurrentRssi(int i) {
        this.mCurrentRssi = i;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }

    public void setScanRecord(byte[] bArr) {
        this.mScanRecord = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDevice, i);
        parcel.writeByteArray(this.mScanRecord);
        parcel.writeInt(this.mCurrentRssi);
    }

    public BluetoothDeviceWrapper(Parcel parcel) {
        this.mDevice = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.mScanRecord = parcel.createByteArray();
        this.mCurrentRssi = parcel.readInt();
    }
}
