package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class InviteRequest implements Parcelable {
    public static final Parcelable.Creator<InviteRequest> CREATOR = new a();
    private String expectFriendNickname;
    private ArrayList<Integer> expectSharedDataTypeList;
    private int groupType;
    private int invitationType;
    private String inviteeId;
    private String inviteeNickname;
    private String inviteeRegisterId;
    private String inviteeSsoid;
    private String inviterRegisterId;
    private ArrayList<Integer> sharedDataTypeList;

    public class a implements Parcelable.Creator<InviteRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InviteRequest createFromParcel(Parcel parcel) {
            return new InviteRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InviteRequest[] newArray(int i) {
            return new InviteRequest[i];
        }
    }

    public InviteRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getExpectFriendNickname() {
        return this.expectFriendNickname;
    }

    public ArrayList<Integer> getExpectSharedDataTypeList() {
        return this.expectSharedDataTypeList;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public int getInvitationType() {
        return this.invitationType;
    }

    public String getInviteeId() {
        return this.inviteeId;
    }

    public String getInviteeNickname() {
        return this.inviteeNickname;
    }

    public String getInviteeRegisterId() {
        return this.inviteeRegisterId;
    }

    public String getInviteeSsoid() {
        return this.inviteeSsoid;
    }

    public String getInviterRegisterId() {
        return this.inviterRegisterId;
    }

    public ArrayList<Integer> getSharedDataTypeList() {
        return this.sharedDataTypeList;
    }

    public void setExpectFriendNickname(String str) {
        this.expectFriendNickname = str;
    }

    public void setExpectSharedDataTypeList(ArrayList<Integer> arrayList) {
        this.expectSharedDataTypeList = arrayList;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    public void setInvitationType(int i) {
        this.invitationType = i;
    }

    public void setInviteeId(String str) {
        this.inviteeId = str;
    }

    public void setInviteeNickname(String str) {
        this.inviteeNickname = str;
    }

    public void setInviteeRegisterId(String str) {
        this.inviteeRegisterId = str;
    }

    public void setInviteeSsoid(String str) {
        this.inviteeSsoid = str;
    }

    public void setInviterRegisterId(String str) {
        this.inviterRegisterId = str;
    }

    public void setSharedDataTypeList(ArrayList<Integer> arrayList) {
        this.sharedDataTypeList = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeInt(this.invitationType);
        parcel.writeString(this.inviteeId);
        parcel.writeString(this.inviteeSsoid);
        parcel.writeString(this.inviteeNickname);
        parcel.writeString(this.inviterRegisterId);
        parcel.writeString(this.inviteeRegisterId);
        parcel.writeList(this.sharedDataTypeList);
        parcel.writeList(this.expectSharedDataTypeList);
        parcel.writeString(this.expectFriendNickname);
    }

    public InviteRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.invitationType = parcel.readInt();
        this.inviteeId = parcel.readString();
        this.inviteeSsoid = parcel.readString();
        this.inviteeNickname = parcel.readString();
        this.inviterRegisterId = parcel.readString();
        this.inviteeRegisterId = parcel.readString();
        this.sharedDataTypeList = new ArrayList<>();
        this.expectSharedDataTypeList = new ArrayList<>();
        this.expectFriendNickname = parcel.readString();
        parcel.readList(this.sharedDataTypeList, Integer.class.getClassLoader());
        parcel.readList(this.expectSharedDataTypeList, Integer.class.getClassLoader());
    }
}
