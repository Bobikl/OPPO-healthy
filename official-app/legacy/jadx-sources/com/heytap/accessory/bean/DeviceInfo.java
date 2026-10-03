package com.heytap.accessory.bean;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.utils.HexUtils;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceInfo implements Parcelable {
    public static final int CONNECT_TYPE_BLE = 1;
    public static final int CONNECT_TYPE_BT = 2;
    public static final int CONNECT_TYPE_MAX = 15;
    public static final int CONNECT_TYPE_NETWORK = 8;
    public static final int CONNECT_TYPE_P2P = 4;
    public static final int CONNECT_TYPE_UNKNOWN = 0;
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new Parcelable.Creator<DeviceInfo>() { // from class: com.heytap.accessory.bean.DeviceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    };
    public static final int DEVICE_ROLE_BOTH = 3;
    public static final int DEVICE_ROLE_CENTRAL = 1;
    public static final int DEVICE_ROLE_PERIPHERAL = 2;
    public static final int DEVICE_ROLE_UNKNOWN = 0;
    public static final int PAIRED_TYPE_BLE = 1;
    public static final int PAIRED_TYPE_BT = 2;
    public static final int PAIRED_TYPE_P2P = 4;
    public static final int PAIRED_TYPE_UNKNOWN = 0;
    public static final int PAIR_NONE = 0;
    public static final int PAIR_PAIRED = 2;
    public static final int PAIR_PAIRING = 1;
    private byte[] mAdditionData;
    private byte[] mAlias;
    private BluetoothDevice mBluetoothDevice;
    private String mBluetoothName;
    private int mConnectType;
    private byte[] mDeviceId;
    private int mDeviceRole;
    private int mEvent;
    private int mMajor;
    private int mMinor;
    private byte[] mModelId;
    private String mName;
    private byte[] mNickName;
    private int mPairState;
    private int mSignalStrength;
    private String mTag;
    private BlePairState mBlePairState = new BlePairState();
    private BtPairState mBtPairState = new BtPairState();
    private P2pPairState mP2pPairState = new P2pPairState();

    public DeviceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAdditionData() {
        return this.mAdditionData;
    }

    public byte[] getAlias() {
        return this.mAlias;
    }

    public String getBleMac() {
        return this.mBlePairState.getMac();
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.mBluetoothDevice;
    }

    public String getBluetoothName() {
        return this.mBluetoothName;
    }

    public String getBtMac() {
        return this.mBtPairState.getMac();
    }

    public int getConnectType() {
        return this.mConnectType;
    }

    public byte[] getDeviceId() {
        return this.mDeviceId;
    }

    public int getDeviceRole() {
        return this.mDeviceRole;
    }

    public int getEvent() {
        return this.mEvent;
    }

    public int getMajor() {
        return this.mMajor;
    }

    public int getMinor() {
        return this.mMinor;
    }

    public byte[] getModelId() {
        return this.mModelId;
    }

    public String getName() {
        return this.mName;
    }

    public byte[] getNickName() {
        return this.mNickName;
    }

    public String getP2pIp() {
        return this.mP2pPairState.getIp();
    }

    public String getP2pMac() {
        return this.mP2pPairState.getP2pMac();
    }

    public int getPairState() {
        return this.mPairState;
    }

    public int getPairedType() {
        return (this.mBlePairState.isPaired() ? 1 : 0) + (this.mBtPairState.isPaired() ? 2 : 0) + (this.mP2pPairState.isPaired() ? 4 : 0);
    }

    public int getSignalStrength() {
        return this.mSignalStrength;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isPaired() {
        return getPairedType() != 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mTag = parcel.readString();
        this.mBluetoothName = parcel.readString();
        this.mName = parcel.readString();
        this.mNickName = parcel.createByteArray();
        this.mPairState = parcel.readInt();
        this.mDeviceRole = parcel.readInt();
        this.mConnectType = parcel.readInt();
        this.mEvent = parcel.readInt();
        this.mMajor = parcel.readInt();
        this.mMinor = parcel.readInt();
        this.mSignalStrength = parcel.readInt();
        this.mDeviceId = parcel.createByteArray();
        this.mModelId = parcel.createByteArray();
        this.mAdditionData = parcel.createByteArray();
        this.mAlias = parcel.createByteArray();
        this.mBluetoothDevice = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.mBlePairState = (BlePairState) parcel.readParcelable(BlePairState.class.getClassLoader());
        this.mBtPairState = (BtPairState) parcel.readParcelable(BtPairState.class.getClassLoader());
        this.mP2pPairState = (P2pPairState) parcel.readParcelable(P2pPairState.class.getClassLoader());
    }

    public void setAdditionData(byte[] bArr) {
        this.mAdditionData = bArr;
    }

    public void setAlias(byte[] bArr) {
        this.mAlias = bArr;
    }

    public void setBleMac(String str) {
        this.mBlePairState.setMac(str);
    }

    public void setBlePaired(boolean z) {
        this.mBlePairState.setPaired(z);
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.mBluetoothDevice = bluetoothDevice;
    }

    public void setBluetoothName(String str) {
        this.mBluetoothName = str;
    }

    public void setBtMac(String str) {
        this.mBtPairState.setMac(str);
    }

    public void setBtPaired(boolean z) {
        this.mBtPairState.setPaired(z);
    }

    public void setConnectType(int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("invalid argument, connectType must be set 1-15");
        }
        this.mConnectType = i;
    }

    public void setDeviceId(byte[] bArr) {
        this.mDeviceId = bArr;
    }

    public void setDeviceRole(int i) {
        if (i < 1 || i > 2) {
            throw new IllegalArgumentException("invalid argument, deviceRole must be set 1-2");
        }
        this.mDeviceRole = i;
    }

    public void setEvent(int i) {
        this.mEvent = i;
    }

    public void setMajor(int i) {
        this.mMajor = i;
    }

    public void setMinor(int i) {
        this.mMinor = i;
    }

    public void setModelId(byte[] bArr) {
        this.mModelId = bArr;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNickName(byte[] bArr) {
        this.mNickName = bArr;
    }

    public void setP2pIp(String str) {
        this.mP2pPairState.setIp(str);
    }

    public void setP2pMac(String str) {
        this.mP2pPairState.setP2pMac(str);
    }

    public void setP2pPaired(boolean z) {
        this.mP2pPairState.setPaired(z);
    }

    public void setPairState(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid argument, pairState must be set 0-2");
        }
        this.mPairState = i;
    }

    public void setSignalStrength(int i) {
        this.mSignalStrength = i;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public String toString() {
        return "DeviceInfo{ modelId=" + HexUtils.byteArrayToHexStr(this.mModelId) + " deviceId=" + HexUtils.hide(this.mDeviceId) + " tag=" + HexUtils.hide(this.mTag) + " name=" + HexUtils.hide(this.mName) + " major=" + this.mMajor + " minor=" + this.mMinor + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTag);
        parcel.writeString(this.mBluetoothName);
        parcel.writeString(this.mName);
        parcel.writeByteArray(this.mNickName);
        parcel.writeInt(this.mPairState);
        parcel.writeInt(this.mDeviceRole);
        parcel.writeInt(this.mConnectType);
        parcel.writeInt(this.mEvent);
        parcel.writeInt(this.mMajor);
        parcel.writeInt(this.mMinor);
        parcel.writeInt(this.mSignalStrength);
        parcel.writeByteArray(this.mDeviceId);
        parcel.writeByteArray(this.mModelId);
        parcel.writeByteArray(this.mAdditionData);
        parcel.writeByteArray(this.mAlias);
        parcel.writeParcelable(this.mBluetoothDevice, 0);
        parcel.writeParcelable(this.mBlePairState, 0);
        parcel.writeParcelable(this.mBtPairState, 0);
        parcel.writeParcelable(this.mP2pPairState, 0);
    }

    public DeviceInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
