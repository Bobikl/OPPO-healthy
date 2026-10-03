package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SnoreRecordTimeInterval implements Parcelable {
    public static final Parcelable.Creator<SnoreRecordTimeInterval> CREATOR = new a();
    long endTime;
    long startTime;

    public class a implements Parcelable.Creator<SnoreRecordTimeInterval> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreRecordTimeInterval createFromParcel(Parcel parcel) {
            return new SnoreRecordTimeInterval(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreRecordTimeInterval[] newArray(int i) {
            return new SnoreRecordTimeInterval[i];
        }
    }

    public SnoreRecordTimeInterval() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public String toString() {
        return "SnoreRecordTimeInterval{startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public SnoreRecordTimeInterval(Parcel parcel) {
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
    }
}
