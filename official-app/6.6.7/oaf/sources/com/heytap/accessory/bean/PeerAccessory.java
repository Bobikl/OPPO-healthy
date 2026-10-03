package com.heytap.accessory.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.SdkConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PeerAccessory implements Parcelable {
    public static final Parcelable.Creator<PeerAccessory> CREATOR = new Parcelable.Creator<PeerAccessory>() { // from class: com.heytap.accessory.bean.PeerAccessory.1
        @Override // android.os.Parcelable.Creator
        public PeerAccessory createFromParcel(Parcel parcel) {
            return new PeerAccessory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PeerAccessory[] newArray(int i) {
            return new PeerAccessory[i];
        }
    };
    static final int DEFAULT_APDU_SIZE = 1048576;
    static final int DEFAULT_ENCRYPTION_PADDING_LENGTH = 0;
    static final int DEFAULT_MXDU_SIZE = 65524;
    static final int DEFAULT_SSDU_SIZE = 65530;
    public static final String TAG = "PeerAccessory";
    public static final String VERSION_TAG = "newPA_V1";
    private String mAddress;
    private int mApduSize;
    private byte[] mDeviceId;
    private int mDeviceType;
    private int mEncryptionPaddingLength;
    private long mId;
    private int mMxduSize;
    private String mName;
    private String mPeerId;
    private String mProductId;
    private int mSsduSize;
    private int mStatus;
    private boolean mSupportCompression;
    private boolean mSupportFile;
    private boolean mSupportMessage;
    private boolean mSupportStream;
    private int mTransportType;
    private int mUUIDType;
    private String mVendorId;
    private int mVersion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccessoryId() {
        return this.mPeerId;
    }

    public String getAddress() {
        return this.mAddress;
    }

    public int getApduSize() {
        return this.mApduSize;
    }

    public List<String> getContent() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(this.mVersion));
        arrayList.add(Long.toString(this.mId));
        arrayList.add(this.mAddress);
        arrayList.add(this.mName);
        arrayList.add(Integer.toString(this.mTransportType));
        arrayList.add(this.mProductId);
        arrayList.add(this.mVendorId);
        arrayList.add(Integer.toString(this.mSsduSize));
        arrayList.add(this.mPeerId);
        arrayList.add(Integer.toString(this.mMxduSize));
        arrayList.add(Integer.toString(this.mApduSize));
        arrayList.add(Integer.toString(this.mEncryptionPaddingLength));
        arrayList.add(Boolean.toString(this.mSupportMessage));
        arrayList.add(Boolean.toString(this.mSupportFile));
        arrayList.add(Boolean.toString(this.mSupportCompression));
        arrayList.add(Boolean.toString(this.mSupportStream));
        arrayList.add(Integer.toString(this.mUUIDType));
        arrayList.add(Integer.toString(this.mStatus));
        arrayList.add(HexUtils.byteArrayToHexStr(this.mDeviceId));
        arrayList.add(String.valueOf(this.mDeviceType));
        return arrayList;
    }

    public byte[] getDeviceId() {
        return this.mDeviceId;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public int getEncryptionPaddingLength() {
        return this.mEncryptionPaddingLength;
    }

    public long getId() {
        return this.mId;
    }

    public int getMxduSize() {
        return this.mMxduSize;
    }

    public String getName() {
        return this.mName;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public int getSsduSize() {
        return this.mSsduSize;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public int getTransportType() {
        return this.mTransportType;
    }

    public int getUUIDType() {
        return this.mUUIDType;
    }

    public String getVendorId() {
        return this.mVendorId;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public boolean supportCompression() {
        return this.mSupportCompression;
    }

    public boolean supportFile() {
        return this.mSupportFile;
    }

    public boolean supportMessage() {
        return this.mSupportMessage;
    }

    public boolean supportStream() {
        return this.mSupportStream;
    }

    public String toShortString() {
        return "PeerAccessory{, mAddress='" + HexUtils.hideAddress(this.mAddress) + "', fraVer='" + SdkConfig.getCompatibleFrameworkVersion() + "', mName='" + this.mName + "', mTransportType=" + this.mTransportType + ", mDeviceId=" + HexUtils.hide(this.mDeviceId) + ", mDeviceType=" + this.mDeviceType + '}';
    }

    public String toString() {
        return "PeerAccessory{mVersion=" + this.mVersion + ", mId=" + this.mId + ", mAddress='" + HexUtils.hideAddress(this.mAddress) + "', mName='" + this.mName + "', mTransportType=" + this.mTransportType + ", mUUIDType=" + this.mUUIDType + ", mProductId='" + this.mProductId + "', mVendorId='" + this.mVendorId + "', mApduSize=" + this.mApduSize + ", mSsduSize=" + this.mSsduSize + ", mMxduSize=" + this.mMxduSize + ", mEncryptionPaddingLength=" + this.mEncryptionPaddingLength + ", mPeerId='" + this.mPeerId + "', mSupportMessage=" + this.mSupportMessage + ", mSupportFile=" + this.mSupportFile + ", mSupportCompression=" + this.mSupportCompression + ", mSupportStream=" + this.mSupportStream + ", mStatus=" + this.mStatus + ", mDeviceId=" + HexUtils.hide(this.mDeviceId) + ", mDeviceType=" + this.mDeviceType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mVersion);
        parcel.writeLong(this.mId);
        parcel.writeString(this.mAddress);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mTransportType);
        parcel.writeString(this.mProductId);
        parcel.writeString(this.mVendorId);
        parcel.writeInt(this.mSsduSize);
        parcel.writeString(this.mPeerId);
        parcel.writeInt(this.mMxduSize);
        parcel.writeInt(this.mApduSize);
        parcel.writeInt(this.mEncryptionPaddingLength);
        parcel.writeInt(this.mSupportMessage ? 1 : 0);
        parcel.writeInt(this.mSupportFile ? 1 : 0);
        parcel.writeInt(this.mSupportCompression ? 1 : 0);
        parcel.writeInt(this.mSupportStream ? 1 : 0);
        if (SdkConfig.getCompatibleFrameworkVersion() >= 1) {
            parcel.writeString(VERSION_TAG);
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.EXTRA_UUID, this.mUUIDType);
            bundle.putInt("status", this.mStatus);
            bundle.putByteArray(Constants.EXTRA_DEVICE_ID, this.mDeviceId);
            bundle.putInt(Constants.EXTRA_DEVICE_TYPE, this.mDeviceType);
            parcel.writeBundle(bundle);
        }
    }

    private PeerAccessory(Parcel parcel) {
        this.mVersion = parcel.readInt();
        this.mId = parcel.readLong();
        this.mAddress = parcel.readString();
        this.mName = parcel.readString();
        this.mTransportType = parcel.readInt();
        this.mProductId = parcel.readString();
        this.mVendorId = parcel.readString();
        this.mSsduSize = parcel.readInt();
        this.mPeerId = parcel.readString();
        this.mMxduSize = parcel.readInt();
        this.mApduSize = parcel.readInt();
        this.mEncryptionPaddingLength = parcel.readInt();
        this.mSupportMessage = parcel.readInt() == 1;
        this.mSupportFile = parcel.readInt() == 1;
        this.mSupportCompression = parcel.readInt() == 1;
        this.mSupportStream = parcel.readInt() == 1;
        int iDataPosition = parcel.dataPosition();
        try {
            String string = parcel.readString();
            if (!VERSION_TAG.equals(string)) {
                SdkLog.d(TAG, "PeerAccessory: tag is not correct, reset position");
                parcel.setDataPosition(iDataPosition);
                return;
            }
            String str = TAG;
            SdkLog.d(str, "PeerAccessory: tag not empty:" + string);
            Bundle bundle = parcel.readBundle(PeerAccessory.class.getClassLoader());
            if (bundle == null) {
                SdkLog.d(str, "PeerAccessory: tag is not correct, reset position");
                parcel.setDataPosition(iDataPosition);
            } else {
                this.mUUIDType = bundle.getInt(Constants.EXTRA_UUID, 0);
                this.mStatus = bundle.getInt("status", 0);
                this.mDeviceId = bundle.getByteArray(Constants.EXTRA_DEVICE_ID);
                this.mDeviceType = bundle.getInt(Constants.EXTRA_DEVICE_TYPE, 0);
            }
        } catch (Exception e) {
            SdkLog.d(TAG, "PeerAccessory:  get tag exception," + e.getMessage());
            parcel.setDataPosition(iDataPosition);
        }
    }

    public PeerAccessory(List<String> list) {
        this.mVersion = Integer.parseInt(list.get(0));
        this.mId = Integer.parseInt(list.get(1));
        this.mAddress = list.get(2);
        this.mName = list.get(3);
        this.mTransportType = Integer.parseInt(list.get(4));
        this.mProductId = list.get(5);
        this.mVendorId = list.get(6);
        this.mSsduSize = Integer.parseInt(list.get(7));
        this.mPeerId = list.get(8);
        this.mMxduSize = Integer.parseInt(list.get(9));
        this.mApduSize = Integer.parseInt(list.get(10));
        this.mEncryptionPaddingLength = Integer.parseInt(list.get(11));
        this.mSupportMessage = Boolean.parseBoolean(list.get(12));
        this.mSupportFile = Boolean.parseBoolean(list.get(13));
        this.mSupportCompression = Boolean.parseBoolean(list.get(14));
        this.mSupportStream = Boolean.parseBoolean(list.get(15));
        this.mUUIDType = Integer.parseInt(list.get(16));
        this.mStatus = Integer.parseInt(list.get(17));
        this.mDeviceId = HexUtils.hexStrToByteArray(list.get(18));
        this.mDeviceType = Integer.parseInt(list.get(19));
    }

    public PeerAccessory(int i, long j, String str, String str2, int i2, int i3, String str3, String str4, int i4, int i5, int i6, int i7, String str5, boolean z, boolean z2, boolean z3, boolean z4, int i8, byte[] bArr, int i9) {
        this.mVersion = i;
        this.mId = j;
        this.mAddress = str;
        this.mName = str2;
        this.mTransportType = i2;
        this.mUUIDType = i3;
        this.mProductId = str3;
        this.mVendorId = str4;
        this.mSsduSize = i4;
        this.mApduSize = i5;
        this.mMxduSize = i6;
        this.mEncryptionPaddingLength = i7;
        this.mPeerId = str5;
        this.mSupportMessage = z;
        this.mSupportFile = z2;
        this.mSupportCompression = z3;
        this.mSupportStream = z4;
        this.mStatus = i8;
        this.mDeviceId = bArr;
        this.mDeviceType = i9;
    }
}
