package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class AccountInfo implements Parcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new Parcelable.Creator<AccountInfo>() { // from class: com.heytap.accessory.bean.AccountInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountInfo createFromParcel(Parcel parcel) {
            return new AccountInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountInfo[] newArray(int i) {
            return new AccountInfo[i];
        }
    };
    private byte[] mAccountKey;
    private long mDate;
    private byte[] mModelId;

    public AccountInfo() {
    }

    private void readFromParcel(Parcel parcel) {
        this.mDate = parcel.readLong();
        this.mModelId = parcel.createByteArray();
        this.mAccountKey = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAccountKey() {
        return this.mAccountKey;
    }

    public long getDate() {
        return this.mDate;
    }

    public byte[] getModelId() {
        return this.mModelId;
    }

    public void setAccountKey(byte[] bArr) {
        this.mAccountKey = bArr;
    }

    public void setDate(long j2) {
        this.mDate = j2;
    }

    public void setModelId(byte[] bArr) {
        this.mModelId = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mDate);
        parcel.writeByteArray(this.mModelId);
        parcel.writeByteArray(this.mAccountKey);
    }

    public AccountInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
