package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DBFriendList implements Parcelable {
    public static final Parcelable.Creator<DBFriendList> CREATOR = new a();
    private List<DBFriendInfo> friendList;
    private List<DBFriendInfo> inviteeList;
    private List<DBFriendInfo> inviterList;

    public class a implements Parcelable.Creator<DBFriendList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFriendList createFromParcel(Parcel parcel) {
            return new DBFriendList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFriendList[] newArray(int i) {
            return new DBFriendList[i];
        }
    }

    public DBFriendList() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DBFriendInfo> getFriendList() {
        return this.friendList;
    }

    public List<DBFriendInfo> getInviteeList() {
        return this.inviteeList;
    }

    public List<DBFriendInfo> getInviterList() {
        return this.inviterList;
    }

    public void setFriendList(List<DBFriendInfo> list) {
        this.friendList = list;
    }

    public void setInviteeList(List<DBFriendInfo> list) {
        this.inviteeList = list;
    }

    public void setInviterList(List<DBFriendInfo> list) {
        this.inviterList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.inviterList);
        parcel.writeTypedList(this.inviteeList);
        parcel.writeTypedList(this.friendList);
    }

    public DBFriendList(Parcel parcel) {
        Parcelable.Creator<DBFriendInfo> creator = DBFriendInfo.CREATOR;
        this.inviterList = parcel.createTypedArrayList(creator);
        this.inviteeList = parcel.createTypedArrayList(creator);
        this.friendList = parcel.createTypedArrayList(creator);
    }
}
