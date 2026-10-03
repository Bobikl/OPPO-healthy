package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class AllFriendSharedDataTypeListRequest implements Parcelable {
    public static final Parcelable.Creator<AllFriendSharedDataTypeListRequest> CREATOR = new a();
    private int groupType;

    public class a implements Parcelable.Creator<AllFriendSharedDataTypeListRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllFriendSharedDataTypeListRequest createFromParcel(Parcel parcel) {
            return new AllFriendSharedDataTypeListRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AllFriendSharedDataTypeListRequest[] newArray(int i) {
            return new AllFriendSharedDataTypeListRequest[i];
        }
    }

    public AllFriendSharedDataTypeListRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
    }

    public AllFriendSharedDataTypeListRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
    }
}
