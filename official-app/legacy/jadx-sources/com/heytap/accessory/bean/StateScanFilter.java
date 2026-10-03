package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.discovery.IScanFilter;

/* JADX INFO: loaded from: classes14.dex */
public class StateScanFilter implements IScanFilter {
    public static final Parcelable.Creator<StateScanFilter> CREATOR = new Parcelable.Creator<StateScanFilter>() { // from class: com.heytap.accessory.bean.StateScanFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StateScanFilter createFromParcel(Parcel parcel) {
            return new StateScanFilter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StateScanFilter[] newArray(int i) {
            return new StateScanFilter[i];
        }
    };
    public static final String KEY = "StateScanFilter";
    public static final int PAIR_STATE_ALL = 1;
    public static final int PAIR_STATE_UNPAIR = 0;
    private int mPairState;

    private StateScanFilter() {
        this.mPairState = 1;
    }

    public static StateScanFilter create() {
        return new StateScanFilter();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.accessory.discovery.IScanFilter
    public String getKey() {
        return KEY;
    }

    public int getPairState() {
        return this.mPairState;
    }

    public StateScanFilter setPairState(int i) {
        if (i >= 0 && i <= 1) {
            this.mPairState = i;
            return this;
        }
        throw new IllegalArgumentException("unknown pair state " + i);
    }

    public String toString() {
        return "StateScanFilter{mPairState=" + this.mPairState + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPairState);
    }

    public StateScanFilter(Parcel parcel) {
        this.mPairState = 1;
        this.mPairState = parcel.readInt();
    }
}
