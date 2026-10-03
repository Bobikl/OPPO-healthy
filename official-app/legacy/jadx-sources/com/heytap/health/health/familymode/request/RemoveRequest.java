package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class RemoveRequest implements Parcelable {
    public static final Parcelable.Creator<RemoveRequest> CREATOR = new a();
    private String friendSsoid;
    private int groupType;

    public class a implements Parcelable.Creator<RemoveRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoveRequest createFromParcel(Parcel parcel) {
            return new RemoveRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoveRequest[] newArray(int i) {
            return new RemoveRequest[i];
        }
    }

    public RemoveRequest() {
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
    }

    public RemoveRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.friendSsoid = parcel.readString();
    }
}
