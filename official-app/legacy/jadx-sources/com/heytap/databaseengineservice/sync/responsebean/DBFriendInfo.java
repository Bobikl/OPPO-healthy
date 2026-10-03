package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class DBFriendInfo implements Parcelable {
    public static final int AGREE_INVITED = 1;
    public static final Parcelable.Creator<DBFriendInfo> CREATOR = new a();
    private String avatar;
    private long createTimestamp;
    private String deviceName;
    private String friendNickname;
    private String friendSsoid;
    private String height;
    private long invitationEndTime;
    private int isVirtualAccount;
    private String maskedMobile;
    private int status;
    private String weight;

    public class a implements Parcelable.Creator<DBFriendInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFriendInfo createFromParcel(Parcel parcel) {
            return new DBFriendInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFriendInfo[] newArray(int i) {
            return new DBFriendInfo[i];
        }
    }

    public DBFriendInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getFriendNickname() {
        return this.friendNickname;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public String getHeight() {
        return this.height;
    }

    public long getInvitationEndTime() {
        return this.invitationEndTime;
    }

    public int getIsVirtualAccount() {
        return this.isVirtualAccount;
    }

    public String getMaskedMobile() {
        return this.maskedMobile;
    }

    public int getStatus() {
        return this.status;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCreateTimestamp(long j2) {
        this.createTimestamp = j2;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setFriendNickname(String str) {
        this.friendNickname = str;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setInvitationEndTime(long j2) {
        this.invitationEndTime = j2;
    }

    public void setIsVirtualAccount(int i) {
        this.isVirtualAccount = i;
    }

    public void setMaskedMobile(String str) {
        this.maskedMobile = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeString(this.avatar);
        parcel.writeString(this.friendNickname);
        parcel.writeString(this.maskedMobile);
        parcel.writeLong(this.invitationEndTime);
        parcel.writeInt(this.status);
        parcel.writeLong(this.createTimestamp);
        parcel.writeString(this.deviceName);
        parcel.writeInt(this.isVirtualAccount);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
    }

    public DBFriendInfo(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.avatar = parcel.readString();
        this.friendNickname = parcel.readString();
        this.maskedMobile = parcel.readString();
        this.invitationEndTime = parcel.readLong();
        this.status = parcel.readInt();
        this.createTimestamp = parcel.readLong();
        this.deviceName = parcel.readString();
        this.invitationEndTime = parcel.readInt();
        this.height = parcel.readString();
        this.weight = parcel.readString();
    }
}
