package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateFriendInfoRequest implements Parcelable {
    public static final Parcelable.Creator<UpdateFriendInfoRequest> CREATOR = new a();
    private String friendNickname;
    private String friendSsoid;
    private int groupType;

    public class a implements Parcelable.Creator<UpdateFriendInfoRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UpdateFriendInfoRequest createFromParcel(Parcel parcel) {
            return new UpdateFriendInfoRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UpdateFriendInfoRequest[] newArray(int i) {
            return new UpdateFriendInfoRequest[i];
        }
    }

    public UpdateFriendInfoRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFriendNickname() {
        return this.friendNickname;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public void setFriendNickname(String str) {
        this.friendNickname = str;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeString(this.friendSsoid);
        parcel.writeString(this.friendNickname);
    }

    public UpdateFriendInfoRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.friendSsoid = parcel.readString();
        this.friendNickname = parcel.readString();
    }
}
