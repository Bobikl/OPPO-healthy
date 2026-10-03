package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public final class BtPairState implements Parcelable {
    public static final Parcelable.Creator<BtPairState> CREATOR = new Parcelable.Creator<BtPairState>() { // from class: com.heytap.accessory.bean.BtPairState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BtPairState createFromParcel(Parcel parcel) {
            return new BtPairState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BtPairState[] newArray(int i) {
            return new BtPairState[i];
        }
    };
    private String mMac;
    private PairState mPairState;

    public BtPairState() {
        this.mPairState = new PairState();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMac() {
        return this.mMac;
    }

    public boolean isPaired() {
        return this.mPairState.isPaired();
    }

    public void setMac(String str) {
        this.mMac = str;
    }

    public void setPaired(boolean z) {
        this.mPairState.setPaired(z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPairState, i);
        parcel.writeString(this.mMac);
    }

    public BtPairState(Parcel parcel) {
        this.mPairState = (PairState) parcel.readParcelable(BtPairState.class.getClassLoader());
        this.mMac = parcel.readString();
    }
}
