package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class BlePairState implements Parcelable {
    public static final Parcelable.Creator<BlePairState> CREATOR = new Parcelable.Creator<BlePairState>() { // from class: com.heytap.accessory.bean.BlePairState.1
        @Override // android.os.Parcelable.Creator
        public BlePairState createFromParcel(Parcel parcel) {
            return new BlePairState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BlePairState[] newArray(int i) {
            return new BlePairState[i];
        }
    };
    private String mMac;
    private PairState mPairState;

    public BlePairState() {
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

    public BlePairState(Parcel parcel) {
        this.mPairState = (PairState) parcel.readParcelable(PairState.class.getClassLoader());
        this.mMac = parcel.readString();
    }
}
