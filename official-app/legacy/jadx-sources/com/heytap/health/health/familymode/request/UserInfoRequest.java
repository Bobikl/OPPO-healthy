package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class UserInfoRequest implements Parcelable {
    public static final Parcelable.Creator<UserInfoRequest> CREATOR = new a();
    private String mobile;

    public class a implements Parcelable.Creator<UserInfoRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfoRequest createFromParcel(Parcel parcel) {
            return new UserInfoRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfoRequest[] newArray(int i) {
            return new UserInfoRequest[i];
        }
    }

    public UserInfoRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mobile);
    }

    public UserInfoRequest(Parcel parcel) {
        this.mobile = parcel.readString();
    }
}
