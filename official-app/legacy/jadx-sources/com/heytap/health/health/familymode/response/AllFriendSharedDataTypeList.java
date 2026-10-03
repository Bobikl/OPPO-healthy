package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AllFriendSharedDataTypeList implements Parcelable {
    public static final Parcelable.Creator<AllFriendSharedDataTypeList> CREATOR = new a();
    private List<FriendSharedDataTypeList> dataTypeList;
    private String friendSsoid;

    public class a implements Parcelable.Creator<AllFriendSharedDataTypeList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllFriendSharedDataTypeList createFromParcel(Parcel parcel) {
            return new AllFriendSharedDataTypeList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AllFriendSharedDataTypeList[] newArray(int i) {
            return new AllFriendSharedDataTypeList[i];
        }
    }

    public AllFriendSharedDataTypeList() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<FriendSharedDataTypeList> getDataTypeList() {
        return this.dataTypeList;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public void setDataTypeList(List<FriendSharedDataTypeList> list) {
        this.dataTypeList = list;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeTypedList(this.dataTypeList);
    }

    public AllFriendSharedDataTypeList(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.dataTypeList = parcel.createTypedArrayList(FriendSharedDataTypeList.CREATOR);
    }
}
