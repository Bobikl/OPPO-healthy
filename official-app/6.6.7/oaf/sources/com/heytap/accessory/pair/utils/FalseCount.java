package com.heytap.accessory.pair.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.heytap.accessory.pair.logging.PairLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FalseCount implements Parcelable {
    public static final Parcelable.Creator<FalseCount> CREATOR = new Parcelable.Creator<FalseCount>() { // from class: com.heytap.accessory.pair.utils.FalseCount.1
        @Override // android.os.Parcelable.Creator
        public FalseCount createFromParcel(Parcel parcel) {
            return new FalseCount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FalseCount[] newArray(int i) {
            return new FalseCount[i];
        }
    };
    private static final int MAX_FAULT_COUNT = 10;
    private static final String TAG = "FalseCount";
    private static final long TIME_INVALID_FAULT_COUNT_IN_MILLIS = 300000;
    private int mFc;
    private long mFirstFcTime;

    public FalseCount() {
        this.mFc = 0;
        this.mFirstFcTime = 0L;
    }

    public static FalseCount createByStoreValue(String str) {
        FalseCount falseCount = new FalseCount();
        if (TextUtils.isEmpty(str)) {
            return falseCount;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length != 2) {
            return falseCount;
        }
        try {
            falseCount.mFc = Integer.parseInt(strArrSplit[0]);
            falseCount.mFirstFcTime = Long.parseLong(strArrSplit[1]);
        } catch (Exception e) {
            PairLog.e(TAG, "createByStoreValue: ex " + e);
        }
        return falseCount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCount() {
        return this.mFc;
    }

    public String getStoreValue() {
        return this.mFc + ";" + this.mFirstFcTime;
    }

    public void increase() {
        if (this.mFc == 0) {
            this.mFirstFcTime = System.currentTimeMillis();
        }
        int i = this.mFc;
        if (i < 10) {
            this.mFc = i + 1;
        }
    }

    public boolean isMaxCount() {
        return this.mFc >= 10;
    }

    public boolean isValidInTime() {
        return System.currentTimeMillis() - this.mFirstFcTime < TIME_INVALID_FAULT_COUNT_IN_MILLIS;
    }

    public void reset() {
        this.mFc = 0;
        this.mFirstFcTime = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFc);
        parcel.writeLong(this.mFirstFcTime);
    }

    public FalseCount(Parcel parcel) {
        this.mFc = 0;
        this.mFirstFcTime = 0L;
        this.mFc = parcel.readInt();
        this.mFirstFcTime = parcel.readLong();
    }
}
