package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullRestHRRspBean implements Parcelable {
    public static final Parcelable.Creator<PullRestHRRspBean> CREATOR = new a();
    private long modifiedTimestamp;
    private int restHeartRate;

    public class a implements Parcelable.Creator<PullRestHRRspBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullRestHRRspBean createFromParcel(Parcel parcel) {
            return new PullRestHRRspBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullRestHRRspBean[] newArray(int i) {
            return new PullRestHRRspBean[i];
        }
    }

    public PullRestHRRspBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public int getRestHeartRate() {
        return this.restHeartRate;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setRestHeartRate(int i) {
        this.restHeartRate = i;
    }

    public String toString() {
        return "PullRestHRRspBean{restHeartRate=" + this.restHeartRate + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.restHeartRate);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public PullRestHRRspBean(Parcel parcel) {
        this.restHeartRate = parcel.readInt();
        this.modifiedTimestamp = parcel.readLong();
    }
}
