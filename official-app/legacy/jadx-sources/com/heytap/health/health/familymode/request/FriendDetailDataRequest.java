package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class FriendDetailDataRequest implements Parcelable {
    public static final Parcelable.Creator<FriendDetailDataRequest> CREATOR = new a();
    private int date;
    private boolean includeVirtualAccount;

    public class a implements Parcelable.Creator<FriendDetailDataRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendDetailDataRequest createFromParcel(Parcel parcel) {
            return new FriendDetailDataRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendDetailDataRequest[] newArray(int i) {
            return new FriendDetailDataRequest[i];
        }
    }

    public FriendDetailDataRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public boolean isIncludeVirtualAccount() {
        return this.includeVirtualAccount;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setIncludeVirtualAccount(boolean z) {
        this.includeVirtualAccount = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
        parcel.writeByte(this.includeVirtualAccount ? (byte) 1 : (byte) 0);
    }

    public FriendDetailDataRequest(Parcel parcel) {
        this.date = parcel.readInt();
        this.includeVirtualAccount = parcel.readByte() != 0;
    }
}
