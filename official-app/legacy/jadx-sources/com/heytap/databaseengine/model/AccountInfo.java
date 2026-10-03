package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AccountInfo implements Parcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new a();
    private boolean login;
    private String ssoid;
    private String token;

    public class a implements Parcelable.Creator<AccountInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountInfo createFromParcel(Parcel parcel) {
            return new AccountInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccountInfo[] newArray(int i) {
            return new AccountInfo[i];
        }
    }

    public AccountInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getLogin() {
        return this.login;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getToken() {
        return this.token;
    }

    public void setLogin(boolean z) {
        this.login = z;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "AccountInfo{ssoid='" + this.ssoid + "', login=" + this.login + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.token);
        parcel.writeByte(this.login ? (byte) 1 : (byte) 0);
    }

    public AccountInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.token = parcel.readString();
        this.login = parcel.readByte() != 0;
    }
}
