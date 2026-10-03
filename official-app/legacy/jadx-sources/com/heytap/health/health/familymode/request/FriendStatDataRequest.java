package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class FriendStatDataRequest implements Parcelable {
    public static final Parcelable.Creator<FriendStatDataRequest> CREATOR = new a();
    private int endDate;
    private String friendSsoid;
    private int startDate;

    public class a implements Parcelable.Creator<FriendStatDataRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendStatDataRequest createFromParcel(Parcel parcel) {
            return new FriendStatDataRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendStatDataRequest[] newArray(int i) {
            return new FriendStatDataRequest[i];
        }
    }

    public FriendStatDataRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEndDate() {
        return this.endDate;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public int getStartDate() {
        return this.startDate;
    }

    public void setEndDate(int i) {
        this.endDate = i;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setStartDate(int i) {
        this.startDate = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeInt(this.startDate);
        parcel.writeInt(this.endDate);
    }

    public FriendStatDataRequest(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.startDate = parcel.readInt();
        this.endDate = parcel.readInt();
    }
}
