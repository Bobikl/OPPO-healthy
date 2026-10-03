package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FriendList implements Parcelable {
    public static final Parcelable.Creator<FriendList> CREATOR = new a();
    private List<FriendInfo> friendList;
    private List<FriendInfo> inviteeList;
    private List<FriendInfo> inviterList;

    public class a implements Parcelable.Creator<FriendList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendList createFromParcel(Parcel parcel) {
            return new FriendList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendList[] newArray(int i) {
            return new FriendList[i];
        }
    }

    public FriendList() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<FriendInfo> getFriendList() {
        return this.friendList;
    }

    public List<FriendInfo> getInviteeList() {
        return this.inviteeList;
    }

    public List<FriendInfo> getInviterList() {
        return this.inviterList;
    }

    public void setFriendList(List<FriendInfo> list) {
        this.friendList = list;
    }

    public void setInviteeList(List<FriendInfo> list) {
        this.inviteeList = list;
    }

    public void setInviterList(List<FriendInfo> list) {
        this.inviterList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.inviterList);
        parcel.writeTypedList(this.inviteeList);
        parcel.writeTypedList(this.friendList);
    }

    public FriendList(Parcel parcel) {
        Parcelable.Creator<FriendInfo> creator = FriendInfo.CREATOR;
        this.inviterList = parcel.createTypedArrayList(creator);
        this.inviteeList = parcel.createTypedArrayList(creator);
        this.friendList = parcel.createTypedArrayList(creator);
    }
}
