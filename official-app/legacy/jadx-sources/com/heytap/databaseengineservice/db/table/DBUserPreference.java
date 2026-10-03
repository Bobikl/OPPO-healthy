package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBUserPreference")
@Keep
public class DBUserPreference implements Parcelable {
    public static final Parcelable.Creator<DBUserPreference> CREATOR = new a();

    @ColumnInfo(name = "create_time")
    private long createTime;

    @ColumnInfo(name = "preference_key")
    private String key;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "module")
    private String module;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long userPreferenceId;

    @ColumnInfo(name = "preference_value")
    private String value;

    public class a implements Parcelable.Creator<DBUserPreference> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBUserPreference createFromParcel(Parcel parcel) {
            return new DBUserPreference(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBUserPreference[] newArray(int i) {
            return new DBUserPreference[i];
        }
    }

    public DBUserPreference() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCreateTime() {
        return this.createTime;
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

    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public long getUserPreferenceId() {
        return this.userPreferenceId;
    }

    public String getValue() {
        return this.value;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
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

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setUserPreferenceId(long j2) {
        this.userPreferenceId = j2;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "DBUserPreference{userPreferenceId=" + this.userPreferenceId + ", ssoid='" + this.ssoid + "', key='" + this.key + "', value='" + this.value + "', module='" + this.module + "', syncStatus=" + this.syncStatus + ", createTime=" + this.createTime + ", modifiedTime=" + this.modifiedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.module);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.modifiedTime);
    }

    public DBUserPreference(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.key = parcel.readString();
        this.value = parcel.readString();
        this.module = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.createTime = parcel.readLong();
        this.modifiedTime = parcel.readLong();
    }
}
