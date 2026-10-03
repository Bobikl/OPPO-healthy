package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PairState implements Parcelable {
    public static final Parcelable.Creator<PairState> CREATOR = new Parcelable.Creator<PairState>() { // from class: com.heytap.accessory.bean.PairState.1
        @Override // android.os.Parcelable.Creator
        public PairState createFromParcel(Parcel parcel) {
            return new PairState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PairState[] newArray(int i) {
            return new PairState[i];
        }
    };
    private boolean mPaired;

    public PairState() {
        this.mPaired = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isPaired() {
        return this.mPaired;
    }

    public void setPaired(boolean z) {
        this.mPaired = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBoolean(this.mPaired);
    }

    public PairState(Parcel parcel) {
        this.mPaired = false;
        this.mPaired = parcel.readBoolean();
    }
}
