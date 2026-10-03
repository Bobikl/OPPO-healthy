package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserVirtualAccount implements Parcelable {
    public static final Parcelable.Creator<UserVirtualAccount> CREATOR = new a();
    private int bindStatus;
    private long createTime;
    private String deviceName;
    private String deviceUniqueId;
    private long modifiedTimestamp;
    private String nickName;
    private String realSsoid;
    private String ssoid;
    private String virtualSsoid;

    public class a implements Parcelable.Creator<UserVirtualAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserVirtualAccount createFromParcel(Parcel parcel) {
            return new UserVirtualAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserVirtualAccount[] newArray(int i) {
            return new UserVirtualAccount[i];
        }
    }

    public UserVirtualAccount() {
        this.ssoid = "";
        this.virtualSsoid = "";
        this.deviceUniqueId = "";
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

    public String getSsoid() {
        return this.ssoid;
    }

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

    public void setDeviceUniqueId(String str) {
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

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setVirtualSsoid(String str) {
        this.virtualSsoid = str;
    }

    public String toString() {
        return "UserVirtualAccount{ssoid='" + this.ssoid + "', virtualSsoid='" + this.virtualSsoid + "', realSsoid='" + this.realSsoid + "', deviceName='" + this.deviceName + "', deviceUniqueId='" + this.deviceUniqueId + "', nickName='" + this.nickName + "', bindStatus=" + this.bindStatus + ", createTime=" + this.createTime + ", modifiedTimestamp=" + this.modifiedTimestamp + '}';
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

    public UserVirtualAccount(Parcel parcel) {
        this.ssoid = "";
        this.virtualSsoid = "";
        this.deviceUniqueId = "";
        this.ssoid = parcel.readString();
        this.virtualSsoid = parcel.readString();
        this.realSsoid = parcel.readString();
        this.deviceName = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.nickName = parcel.readString();
        this.bindStatus = parcel.readInt();
        this.createTime = parcel.readLong();
        this.modifiedTimestamp = parcel.readLong();
    }
}
