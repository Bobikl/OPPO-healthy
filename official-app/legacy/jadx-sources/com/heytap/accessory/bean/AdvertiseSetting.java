package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class AdvertiseSetting implements Parcelable {
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_TYPE_FASTDISCOVERY = 0;
    public static final int ADVERTISE_TYPE_FASTPAIR_ACCOUNT = 2;
    public static final int ADVERTISE_TYPE_FASTPAIR_MODELID = 1;
    public static final int CONNECT_TYPE_BLE = 0;
    public static final int CONNECT_TYPE_BT = 1;
    public static final int CONNECT_TYPE_NETWORK_CONNECT = 4;
    public static final int CONNECT_TYPE_PC_P2P = 3;
    public static final int CONNECT_TYPE_WIFI = 2;
    public static final Parcelable.Creator<AdvertiseSetting> CREATOR = new Parcelable.Creator<AdvertiseSetting>() { // from class: com.heytap.accessory.bean.AdvertiseSetting.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdvertiseSetting createFromParcel(Parcel parcel) {
            return new AdvertiseSetting(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdvertiseSetting[] newArray(int i) {
            return new AdvertiseSetting[i];
        }
    };
    public static final byte GO_INTENT_MAX = 15;
    public static final byte GO_INTENT_MIN = 0;
    public static final byte GO_INTENT_NOT_SET = -1;
    public static final byte GO_INTENT_PHONE_DEFAULT = 8;
    private static final int LIMITED_ADVETISING_MAX_MILLIS = 10800000;
    private static final int LIMITED_MODELID_LENGTH = 3;
    private static final int LIMITED_NICKNAME_LENGTH = 9;
    public static final int SECURE_KEY_TYPE_PRESET = 1;
    public static final int SECURE_KEY_TYPE_UKEY2_INVISIBLE = 2;
    private byte[] mAdditionData;
    private final int mAdvertiseMode;
    private final int mAdvertiseType;
    private final int mConnectType;
    private final int mDurationMillis;
    private final byte mGoIntent;
    private final int mKeyType;
    private final int mMajor;
    private byte[] mModelId;
    private byte[] mNickName;
    private final int mPort;

    public static final class Builder {
        private int mAdvertiseType = 1;
        private int mConnectType = 1;
        private int mDurationMillis = 0;
        private int mKeyType = 1;
        private byte[] mModelId = null;
        private byte[] mNickName = null;
        private byte[] mAdditionData = null;
        private byte mGoIntent = -1;
        private int mPort = 0;
        private int mMajor = 3;
        private int mAdvertiseMode = 0;

        public AdvertiseSetting build() {
            byte[] bArr;
            int i = this.mAdvertiseType;
            if ((i == 0 || i == 1) && ((bArr = this.mModelId) == null || bArr.length != 3)) {
                throw new IllegalArgumentException("model id invalid (length must be 3 byte)");
            }
            return new AdvertiseSetting(this.mAdvertiseType, this.mConnectType, this.mDurationMillis, this.mKeyType, this.mModelId, this.mNickName, this.mAdditionData, this.mGoIntent, this.mPort, this.mMajor, this.mAdvertiseMode);
        }

        public Builder setAdditionData(byte[] bArr) {
            this.mAdditionData = bArr;
            return this;
        }

        public Builder setAdvertiseMode(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("mode invalid, must be 0-2");
            }
            this.mAdvertiseMode = i;
            return this;
        }

        public Builder setAdvertiseType(int i) {
            if (i >= 0 && i <= 2) {
                this.mAdvertiseType = i;
                return this;
            }
            throw new IllegalArgumentException("unknown advertise type: " + i);
        }

        public Builder setConnectType(int i) {
            if (i >= 0 && i <= 4) {
                this.mConnectType = i;
                return this;
            }
            throw new IllegalArgumentException("unknown connect type " + i);
        }

        public Builder setDurationMillis(int i) {
            if (i < 0 || i > 10800000) {
                throw new IllegalArgumentException("timeoutMillis invalid (must be 0-10800000 milliseconds)");
            }
            this.mDurationMillis = i;
            return this;
        }

        public Builder setGoIntent(byte b) {
            if (b >= 0 && b <= 15) {
                this.mGoIntent = b;
                return this;
            }
            throw new IllegalArgumentException("unknown go intent " + ((int) b));
        }

        public Builder setKeyType(int i) {
            if (i < 1 || i > 2) {
                throw new IllegalArgumentException("keyType invalid");
            }
            this.mKeyType = i;
            return this;
        }

        public Builder setMajor(int i) {
            if (i < 1 || i > 8) {
                throw new IllegalArgumentException("major invalid, must be 1-8");
            }
            this.mMajor = i;
            return this;
        }

        public Builder setModelId(byte[] bArr) {
            if (bArr == null || bArr.length != 3) {
                throw new IllegalArgumentException("model id invalid (length must be 3 byte)");
            }
            this.mModelId = bArr;
            return this;
        }

        public Builder setNickName(byte[] bArr) {
            if (bArr == null || bArr.length > 9) {
                throw new IllegalArgumentException("nickName invalid (length must be 0-9 byte)");
            }
            this.mNickName = bArr;
            return this;
        }

        public Builder setPort(int i) {
            this.mPort = i;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAdditionData() {
        return this.mAdditionData;
    }

    public int getAdvertiseMode() {
        return this.mAdvertiseMode;
    }

    public int getAdvertiseType() {
        return this.mAdvertiseType;
    }

    public int getConnectType() {
        return this.mConnectType;
    }

    public int getDurationMillis() {
        return this.mDurationMillis;
    }

    public byte getGoIntent() {
        return this.mGoIntent;
    }

    public int getKeyType() {
        return this.mKeyType;
    }

    public int getMajor() {
        return this.mMajor;
    }

    public byte[] getModelId() {
        return this.mModelId;
    }

    public byte[] getNickName() {
        return this.mNickName;
    }

    public int getPort() {
        return this.mPort;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mAdvertiseType);
        parcel.writeInt(this.mConnectType);
        parcel.writeInt(this.mDurationMillis);
        parcel.writeInt(this.mKeyType);
        parcel.writeByteArray(this.mModelId);
        parcel.writeByteArray(this.mNickName);
        parcel.writeByteArray(this.mAdditionData);
        parcel.writeByte(this.mGoIntent);
        parcel.writeInt(this.mPort);
        parcel.writeInt(this.mMajor);
        parcel.writeInt(this.mAdvertiseMode);
    }

    private AdvertiseSetting(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte b, int i5, int i6, int i7) {
        this.mAdvertiseType = i;
        this.mConnectType = i2;
        this.mDurationMillis = i3;
        this.mKeyType = i4;
        this.mModelId = bArr;
        this.mNickName = bArr2;
        this.mAdditionData = bArr3;
        this.mGoIntent = b;
        this.mPort = i5;
        this.mMajor = i6;
        this.mAdvertiseMode = i7;
    }

    public AdvertiseSetting(Parcel parcel) {
        this.mAdvertiseType = parcel.readInt();
        this.mConnectType = parcel.readInt();
        this.mDurationMillis = parcel.readInt();
        this.mKeyType = parcel.readInt();
        this.mModelId = parcel.createByteArray();
        this.mNickName = parcel.createByteArray();
        this.mAdditionData = parcel.createByteArray();
        this.mGoIntent = parcel.readByte();
        this.mPort = parcel.readInt();
        this.mMajor = parcel.readInt();
        this.mAdvertiseMode = parcel.readInt();
    }
}
