package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class SharedDataTypeListRequest implements Parcelable {
    public static final Parcelable.Creator<SharedDataTypeListRequest> CREATOR = new a();
    private String friendSsoid;
    private int groupType;
    private String queryDefault;

    public class a implements Parcelable.Creator<SharedDataTypeListRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharedDataTypeListRequest createFromParcel(Parcel parcel) {
            return new SharedDataTypeListRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SharedDataTypeListRequest[] newArray(int i) {
            return new SharedDataTypeListRequest[i];
        }
    }

    public SharedDataTypeListRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public String getQueryDefault() {
        return this.queryDefault;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    public void setQueryDefault(String str) {
        this.queryDefault = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeString(this.friendSsoid);
        parcel.writeString(this.queryDefault);
    }

    public SharedDataTypeListRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.friendSsoid = parcel.readString();
        this.queryDefault = parcel.readString();
    }
}
