package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PairSetting implements Parcelable {
    public static final Parcelable.Creator<PairSetting> CREATOR = new Parcelable.Creator<PairSetting>() { // from class: com.heytap.accessory.bean.PairSetting.1
        @Override // android.os.Parcelable.Creator
        public PairSetting createFromParcel(Parcel parcel) {
            return new PairSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PairSetting[] newArray(int i) {
            return new PairSetting[i];
        }
    };
    public static final byte GO_INTENT_MAX = 15;
    public static final byte GO_INTENT_MIN = 0;
    private static final byte GO_INTENT_NOT_SET = -1;
    private final byte mGoIntent;
    private final int mPort;

    public static final class Builder {
        private byte mGoIntent = -1;
        private int mPort = 0;

        public PairSetting build() {
            return new PairSetting(this.mGoIntent, this.mPort);
        }

        public Builder setGoIntent(byte b) {
            if (b >= 0 && b <= 15) {
                this.mGoIntent = b;
                return this;
            }
            throw new IllegalArgumentException("unknown go intent " + ((int) b));
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

    public byte getGoIntent() {
        return this.mGoIntent;
    }

    public int getPort() {
        return this.mPort;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mGoIntent);
        parcel.writeInt(this.mPort);
    }

    private PairSetting(byte b, int i) {
        this.mGoIntent = b;
        this.mPort = i;
    }

    public PairSetting(Parcel parcel) {
        this.mGoIntent = parcel.readByte();
        this.mPort = parcel.readInt();
    }
}
