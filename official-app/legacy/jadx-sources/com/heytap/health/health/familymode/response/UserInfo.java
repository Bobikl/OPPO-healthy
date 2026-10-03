package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new a();
    private String avatar;
    private String friendNickname;
    private String ssoid;

    public class a implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    public UserInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFriendNickname() {
        return this.friendNickname;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setFriendNickname(String str) {
        this.friendNickname = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.avatar);
        parcel.writeString(this.friendNickname);
    }

    public UserInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.avatar = parcel.readString();
        this.friendNickname = parcel.readString();
    }
}
