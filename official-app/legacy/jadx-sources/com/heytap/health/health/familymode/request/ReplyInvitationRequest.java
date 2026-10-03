package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ReplyInvitationRequest implements Parcelable {
    public static final Parcelable.Creator<ReplyInvitationRequest> CREATOR = new a();
    private int answer;
    private String expectFriendNickname;
    private List<Integer> expectSharedDataTypeList;
    private int groupType;
    private String inviterNickname;
    private String inviterSsoid;
    private int noNoticeForSameInvitation;
    private List<Integer> sharedDataTypeList;

    public class a implements Parcelable.Creator<ReplyInvitationRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReplyInvitationRequest createFromParcel(Parcel parcel) {
            return new ReplyInvitationRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ReplyInvitationRequest[] newArray(int i) {
            return new ReplyInvitationRequest[i];
        }
    }

    public ReplyInvitationRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAnswer() {
        return this.answer;
    }

    public String getExpectFriendNickname() {
        return this.expectFriendNickname;
    }

    public List<Integer> getExpectSharedDataTypeList() {
        return this.expectSharedDataTypeList;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public String getInviterNickname() {
        return this.inviterNickname;
    }

    public String getInviterSsoid() {
        return this.inviterSsoid;
    }

    public int getNoNoticeForSameInvitation() {
        return this.noNoticeForSameInvitation;
    }

    public List<Integer> getSharedDataTypeList() {
        return this.sharedDataTypeList;
    }

    public void setAnswer(int i) {
        this.answer = i;
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

    public void setInviterNickname(String str) {
        this.inviterNickname = str;
    }

    public void setInviterSsoid(String str) {
        this.inviterSsoid = str;
    }

    public void setNoNoticeForSameInvitation(int i) {
        this.noNoticeForSameInvitation = i;
    }

    public void setSharedDataTypeList(List<Integer> list) {
        this.sharedDataTypeList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeInt(this.answer);
        parcel.writeString(this.inviterNickname);
        parcel.writeString(this.inviterSsoid);
        parcel.writeInt(this.noNoticeForSameInvitation);
        parcel.writeList(this.sharedDataTypeList);
        parcel.writeList(this.expectSharedDataTypeList);
    }

    public ReplyInvitationRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.answer = parcel.readInt();
        this.inviterNickname = parcel.readString();
        this.inviterSsoid = parcel.readString();
        this.noNoticeForSameInvitation = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.sharedDataTypeList = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        parcel.readList(this.expectSharedDataTypeList, Integer.class.getClassLoader());
    }
}
