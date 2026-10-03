package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DisturbSleepStat extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DisturbSleepStat> CREATOR = new a();
    private String appName;
    private int date;
    private int lunchCount;
    private String packageName;
    private String ssoid;
    private String timezone;
    private long totalDuration;

    public class a implements Parcelable.Creator<DisturbSleepStat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DisturbSleepStat createFromParcel(Parcel parcel) {
            return new DisturbSleepStat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DisturbSleepStat[] newArray(int i) {
            return new DisturbSleepStat[i];
        }
    }

    public DisturbSleepStat() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getDate() {
        return this.date;
    }

    public int getLunchCount() {
        return this.lunchCount;
    }

    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public long getTotalDuration() {
        return this.totalDuration;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setLunchCount(int i) {
        this.lunchCount = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DisturbSleepStat{packageName='" + this.packageName + "', appName='" + this.appName + "', totalDuration=" + this.totalDuration + ", lunchCount=" + this.lunchCount + ", date=" + this.date + ", timezone='" + this.timezone + "'} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeLong(this.totalDuration);
        parcel.writeInt(this.lunchCount);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
    }

    public DisturbSleepStat(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.packageName = parcel.readString();
        this.appName = parcel.readString();
        this.totalDuration = parcel.readLong();
        this.lunchCount = parcel.readInt();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
    }
}
