package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FriendSharedDataTypeList implements Parcelable {
    public static final Parcelable.Creator<FriendSharedDataTypeList> CREATOR = new a();
    private int shareAll;
    private List<FriendSharedDataType> sharedDataTypeList;

    public class a implements Parcelable.Creator<FriendSharedDataTypeList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendSharedDataTypeList createFromParcel(Parcel parcel) {
            return new FriendSharedDataTypeList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendSharedDataTypeList[] newArray(int i) {
            return new FriendSharedDataTypeList[i];
        }
    }

    public FriendSharedDataTypeList() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getShareAll() {
        return this.shareAll;
    }

    public List<FriendSharedDataType> getSharedDataTypeList() {
        return this.sharedDataTypeList;
    }

    public void setShareAll(int i) {
        this.shareAll = i;
    }

    public void setSharedDataTypeList(List<FriendSharedDataType> list) {
        this.sharedDataTypeList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.shareAll);
        parcel.writeTypedList(this.sharedDataTypeList);
    }

    public FriendSharedDataTypeList(Parcel parcel) {
        this.shareAll = parcel.readInt();
        this.sharedDataTypeList = parcel.createTypedArrayList(FriendSharedDataType.CREATOR);
    }
}
