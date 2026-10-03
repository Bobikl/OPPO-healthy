package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class FriendBaseData implements Parcelable {
    public static final Parcelable.Creator<FriendBaseData> CREATOR = new a();
    private String avatar;
    private String createTime;
    private String friendNickname;
    private String friendSsoid;
    private int totalCalories;
    private int totalDistance;
    private int totalSteps;

    public class a implements Parcelable.Creator<FriendBaseData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendBaseData createFromParcel(Parcel parcel) {
            return new FriendBaseData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendBaseData[] newArray(int i) {
            return new FriendBaseData[i];
        }
    }

    public FriendBaseData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getFriendNickname() {
        return this.friendNickname;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public int getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setFriendNickname(String str) {
        this.friendNickname = str;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setTotalCalories(int i) {
        this.totalCalories = i;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeString(this.friendNickname);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.totalSteps);
        parcel.writeInt(this.totalCalories);
        parcel.writeInt(this.totalDistance);
        parcel.writeString(this.createTime);
    }

    public FriendBaseData(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.friendNickname = parcel.readString();
        this.avatar = parcel.readString();
        this.totalSteps = parcel.readInt();
        this.totalCalories = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.createTime = parcel.readString();
    }
}
