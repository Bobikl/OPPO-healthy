package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullFitDataVersionParams implements Parcelable {
    public static final Parcelable.Creator<PullFitDataVersionParams> CREATOR = new a();
    private long modifiedTime;
    private int type;

    public class a implements Parcelable.Creator<PullFitDataVersionParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullFitDataVersionParams createFromParcel(Parcel parcel) {
            return new PullFitDataVersionParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullFitDataVersionParams[] newArray(int i) {
            return new PullFitDataVersionParams[i];
        }
    }

    public PullFitDataVersionParams() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public int getType() {
        return this.type;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "PullFitDataVersionParams{modifiedTime=" + this.modifiedTime + ", type=" + this.type + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.type);
    }

    public PullFitDataVersionParams(Parcel parcel) {
        this.modifiedTime = parcel.readLong();
        this.type = parcel.readInt();
    }
}
