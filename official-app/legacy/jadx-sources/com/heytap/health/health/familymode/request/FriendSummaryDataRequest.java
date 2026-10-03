package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class FriendSummaryDataRequest implements Parcelable {
    public static final Parcelable.Creator<FriendSummaryDataRequest> CREATOR = new a();
    private int date;

    public class a implements Parcelable.Creator<FriendSummaryDataRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendSummaryDataRequest createFromParcel(Parcel parcel) {
            return new FriendSummaryDataRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendSummaryDataRequest[] newArray(int i) {
            return new FriendSummaryDataRequest[i];
        }
    }

    public FriendSummaryDataRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int i) {
        this.date = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.date);
    }

    public FriendSummaryDataRequest(Parcel parcel) {
        this.date = parcel.readInt();
    }
}
