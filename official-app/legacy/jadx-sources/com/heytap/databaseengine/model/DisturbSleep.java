package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DisturbSleep extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DisturbSleep> CREATOR = new a();
    private String appName;
    private String packageName;
    private String ssoid;
    private long startTimestamp;
    private int useTime;

    public class a implements Parcelable.Creator<DisturbSleep> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DisturbSleep createFromParcel(Parcel parcel) {
            return new DisturbSleep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DisturbSleep[] newArray(int i) {
            return new DisturbSleep[i];
        }
    }

    public DisturbSleep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return getStartTimestamp();
    }

    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getUseTime() {
        return this.useTime;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setUseTime(int i) {
        this.useTime = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DisturbSleep{packageName='" + this.packageName + "', appName='" + this.appName + "', startTimestamp=" + this.startTimestamp + ", useTime=" + this.useTime + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeLong(this.startTimestamp);
        parcel.writeInt(this.useTime);
    }

    public DisturbSleep(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.packageName = parcel.readString();
        this.appName = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.useTime = parcel.readInt();
    }
}
