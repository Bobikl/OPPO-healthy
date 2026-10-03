package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserPreference implements Parcelable {
    public static final Parcelable.Creator<UserPreference> CREATOR = new a();
    public static final String UNIT_CM_KG = "0";
    public static final String UNIT_DEFAULT = "0";
    public static final String UNIT_FT_LB = "1";
    private String key;
    private long modifiedTime;
    private String module;
    private boolean pushToCloud;
    private String ssoid;
    private int syncStatus;
    private String value;

    public class a implements Parcelable.Creator<UserPreference> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserPreference createFromParcel(Parcel parcel) {
            return new UserPreference(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserPreference[] newArray(int i) {
            return new UserPreference[i];
        }
    }

    public UserPreference() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKey() {
        return this.key;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getModule() {
        return this.module;
    }

    public boolean getPushToCloud() {
        return this.pushToCloud;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setPushToCloud(boolean z) {
        this.pushToCloud = z;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "UserPreference{ssoid='" + this.ssoid + "', key='" + this.key + "', value='" + this.value + "', module='" + this.module + "', pushToCloud=" + this.pushToCloud + ", syncStatus=" + this.syncStatus + ", modifiedTime=" + this.modifiedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.module);
        parcel.writeByte(this.pushToCloud ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTime);
    }

    public UserPreference(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.key = parcel.readString();
        this.value = parcel.readString();
        this.module = parcel.readString();
        this.pushToCloud = parcel.readByte() != 0;
        this.syncStatus = parcel.readInt();
        this.modifiedTime = parcel.readLong();
    }
}
