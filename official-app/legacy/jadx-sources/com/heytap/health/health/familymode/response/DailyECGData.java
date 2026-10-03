package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyECGData implements Parcelable {
    public static final Parcelable.Creator<DailyECGData> CREATOR = new a();
    private String ecgMaxClientId;
    private long ecgMaxModifiedTimestamp;

    public class a implements Parcelable.Creator<DailyECGData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DailyECGData createFromParcel(Parcel parcel) {
            return new DailyECGData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DailyECGData[] newArray(int i) {
            return new DailyECGData[i];
        }
    }

    public DailyECGData(Parcel parcel) {
        this.ecgMaxClientId = parcel.readString();
        this.ecgMaxModifiedTimestamp = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEcgMaxClientId() {
        return this.ecgMaxClientId;
    }

    public long getEcgMaxModifiedTimestamp() {
        return this.ecgMaxModifiedTimestamp;
    }

    public void setEcgMaxClientId(String str) {
        this.ecgMaxClientId = str;
    }

    public void setEcgMaxModifiedTimestamp(long j2) {
        this.ecgMaxModifiedTimestamp = j2;
    }

    public String toString() {
        return "DailyECGData{ecgMaxClientId='" + this.ecgMaxClientId + "', ecgMaxModifiedTimestamp=" + this.ecgMaxModifiedTimestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ecgMaxClientId);
        parcel.writeLong(this.ecgMaxModifiedTimestamp);
    }
}
