package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBUserGoalInfo")
@Keep
public class DBUserGoalInfo implements Parcelable {
    public static final Parcelable.Creator<DBUserGoalInfo> CREATOR = new a();

    @ColumnInfo(name = "dead_line")
    private int deadLine;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long goalInfoId;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "value")
    private String value;

    public class a implements Parcelable.Creator<DBUserGoalInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBUserGoalInfo createFromParcel(Parcel parcel) {
            return new DBUserGoalInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBUserGoalInfo[] newArray(int i) {
            return new DBUserGoalInfo[i];
        }
    }

    public DBUserGoalInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDeadLine() {
        return this.deadLine;
    }

    public long getGoalInfoId() {
        return this.goalInfoId;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setDeadLine(int i) {
        this.deadLine = i;
    }

    public void setGoalInfoId(long j2) {
        this.goalInfoId = j2;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "DBUserGoal{goalInfoId=" + this.goalInfoId + ", type=" + this.type + ", value='" + this.value + "', deadLine=" + this.deadLine + ", syncStatus=" + this.syncStatus + ", modifiedTime=" + this.modifiedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.type);
        parcel.writeString(this.value);
        parcel.writeInt(this.deadLine);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTime);
    }

    public DBUserGoalInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.type = parcel.readInt();
        this.value = parcel.readString();
        this.deadLine = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTime = parcel.readLong();
    }
}
