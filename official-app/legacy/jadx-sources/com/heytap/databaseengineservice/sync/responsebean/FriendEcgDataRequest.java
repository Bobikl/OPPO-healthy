package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class FriendEcgDataRequest implements Parcelable {
    public static final Parcelable.Creator<FriendEcgDataRequest> CREATOR = new a();
    private int date;
    private String friendSsoid;

    public class a implements Parcelable.Creator<FriendEcgDataRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendEcgDataRequest createFromParcel(Parcel parcel) {
            return new FriendEcgDataRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendEcgDataRequest[] newArray(int i) {
            return new FriendEcgDataRequest[i];
        }
    }

    public FriendEcgDataRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeInt(this.date);
    }

    public FriendEcgDataRequest(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.date = parcel.readInt();
    }
}
