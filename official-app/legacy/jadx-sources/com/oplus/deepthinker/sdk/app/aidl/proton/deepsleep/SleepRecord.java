package com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class SleepRecord implements Parcelable {
    public static final Parcelable.Creator<SleepRecord> CREATOR = new Parcelable.Creator<SleepRecord>() { // from class: com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.SleepRecord.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepRecord createFromParcel(Parcel parcel) {
            SleepRecord sleepRecord = new SleepRecord(0L, 0L);
            sleepRecord.mSleepTime = parcel.readLong();
            sleepRecord.mWakeTime = parcel.readLong();
            return sleepRecord;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepRecord[] newArray(int i) {
            return new SleepRecord[i];
        }
    };
    private long mSleepTime;
    private long mWakeTime;

    public SleepRecord(long j2, long j3) {
        this.mSleepTime = j2;
        this.mWakeTime = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getSleepTime() {
        return this.mSleepTime;
    }

    public long getWakeTime() {
        return this.mWakeTime;
    }

    public void setSleepTime(long j2) {
        this.mSleepTime = j2;
    }

    public void setWakeTime(long j2) {
        this.mWakeTime = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mSleepTime);
        parcel.writeLong(this.mWakeTime);
    }
}
