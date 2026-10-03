package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class DBFriendListRequest implements Parcelable {
    public static final Parcelable.Creator<DBFriendListRequest> CREATOR = new a();
    private int groupType;
    private boolean includeInviting;
    private boolean includeVirtualAccount;

    public class a implements Parcelable.Creator<DBFriendListRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFriendListRequest createFromParcel(Parcel parcel) {
            return new DBFriendListRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFriendListRequest[] newArray(int i) {
            return new DBFriendListRequest[i];
        }
    }

    public DBFriendListRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public boolean isIncludeInviting() {
        return this.includeInviting;
    }

    public boolean isIncludeVirtualAccount() {
        return this.includeVirtualAccount;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    public void setIncludeInviting(boolean z) {
        this.includeInviting = z;
    }

    public void setIncludeVirtualAccount(boolean z) {
        this.includeVirtualAccount = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeByte(this.includeInviting ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.includeVirtualAccount ? (byte) 1 : (byte) 0);
    }

    public DBFriendListRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.includeInviting = parcel.readByte() != 0;
        this.includeVirtualAccount = parcel.readByte() != 0;
    }
}
