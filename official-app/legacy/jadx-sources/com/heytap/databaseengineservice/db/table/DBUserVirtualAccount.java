package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "virtual_ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID}, tableName = "DBUserVirtualAccount")
@Keep
public class DBUserVirtualAccount implements Parcelable {
    public static final Parcelable.Creator<DBUserVirtualAccount> CREATOR = new a();

    @ColumnInfo(name = "bind_status")
    private int bindStatus;

    @ColumnInfo(name = "create_timestamp")
    private long createTime;

    @ColumnInfo(name = DeviceInfoCompat.DB_KEY_DEVICE_NAME)
    private String deviceName;

    @NonNull
    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "nick_name")
    private String nickName;

    @ColumnInfo(name = "real_ssoid")
    private String realSsoid;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @NonNull
    @ColumnInfo(name = "virtual_ssoid")
    private String virtualSsoid;

    public class a implements Parcelable.Creator<DBUserVirtualAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBUserVirtualAccount createFromParcel(Parcel parcel) {
            return new DBUserVirtualAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBUserVirtualAccount[] newArray(int i) {
            return new DBUserVirtualAccount[i];
        }
    }

    public DBUserVirtualAccount() {
        this.ssoid = "";
        this.virtualSsoid = "";
        this.deviceUniqueId = "";
    }

    public static String createTable() {
        return "create table if not exists DBUserVirtualAccount(ssoid TEXT not null,virtual_ssoid TEXT not null,real_ssoid TEXT,device_name TEXT,device_unique_id TEXT not null,nick_name TEXT,bind_status INTEGER not null,create_timestamp INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,virtual_ssoid," + DBAssessmentRecord.DEVICE_UNIQUE_ID + "))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBindStatus() {
        return this.bindStatus;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRealSsoid() {
        return this.realSsoid;
    }

    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public String getVirtualSsoid() {
        return this.virtualSsoid;
    }

    public void setBindStatus(int i) {
        this.bindStatus = i;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(@NotNull String str) {
        this.deviceUniqueId = str;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRealSsoid(String str) {
        this.realSsoid = str;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setVirtualSsoid(@NotNull String str) {
        this.virtualSsoid = str;
    }

    public String toString() {
        return "DBUserVirtualAccount{ssoid='" + this.ssoid + "', virtualSsoid='" + this.virtualSsoid + "', realSsoid='" + this.realSsoid + "', deviceName='" + this.deviceName + "', deviceUniqueId='" + this.deviceUniqueId + "', nickName='" + this.nickName + "', bindStatus=" + this.bindStatus + ", createTime=" + this.createTime + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.virtualSsoid);
        parcel.writeString(this.realSsoid);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.nickName);
        parcel.writeInt(this.bindStatus);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBUserVirtualAccount(Parcel parcel) {
        this.ssoid = "";
        this.virtualSsoid = "";
        this.deviceUniqueId = "";
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.virtualSsoid = string2;
        this.realSsoid = parcel.readString();
        this.deviceName = parcel.readString();
        String string3 = parcel.readString();
        Objects.requireNonNull(string3);
        this.deviceUniqueId = string3;
        this.nickName = parcel.readString();
        this.bindStatus = parcel.readInt();
        this.createTime = parcel.readLong();
        this.modifiedTimestamp = parcel.readLong();
    }
}
