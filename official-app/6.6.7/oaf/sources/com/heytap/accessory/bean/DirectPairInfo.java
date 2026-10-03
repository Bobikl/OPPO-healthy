package com.heytap.accessory.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class DirectPairInfo implements Parcelable {
    public static final Parcelable.Creator<DirectPairInfo> CREATOR = new Parcelable.Creator<DirectPairInfo>() { // from class: com.heytap.accessory.bean.DirectPairInfo.1
        @Override // android.os.Parcelable.Creator
        public DirectPairInfo createFromParcel(Parcel parcel) {
            return new DirectPairInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DirectPairInfo[] newArray(int i) {
            return new DirectPairInfo[i];
        }
    };
    private static final String INTENT_EXTRA_MODELID = "extra_modelid";
    private static final String INTENT_EXTRA_SSID = "extra_ssid";
    private Bundle mBundle;

    public DirectPairInfo() {
        this.mBundle = new Bundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getModelId() {
        return this.mBundle.getByteArray(INTENT_EXTRA_MODELID);
    }

    public String getSsid() {
        return this.mBundle.getString("extra_ssid");
    }

    public void setModelId(byte[] bArr) {
        this.mBundle.putByteArray(INTENT_EXTRA_MODELID, bArr);
    }

    public void setSsid(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("ssid is invalid");
        }
        this.mBundle.putString("extra_ssid", str);
    }

    public String toString() {
        return "DirectPairInfo{ssid=" + this.mBundle.getString("extra_ssid") + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }

    public DirectPairInfo(Parcel parcel) {
        this.mBundle = parcel.readBundle(getClass().getClassLoader());
    }
}
