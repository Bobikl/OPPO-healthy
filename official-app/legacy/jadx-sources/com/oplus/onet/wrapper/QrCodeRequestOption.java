package com.oplus.onet.wrapper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.zqm;

/* JADX INFO: loaded from: classes8.dex */
public class QrCodeRequestOption implements Parcelable {
    public static final String BUNDLE_KEY_CONNECT_TYPE_FLAG = "connect_type_flag";
    public static final Parcelable.Creator<QrCodeRequestOption> CREATOR = new a();
    public static final String PROTOCOL_TYPE_OAF = "protocol_type_oaf";
    public String mConnectType;
    public int mDeviceType;
    public Bundle mExtraData;
    public String mModelId;
    public String mProtocolType;

    public class a implements Parcelable.Creator<QrCodeRequestOption> {
        @Override // android.os.Parcelable.Creator
        public final QrCodeRequestOption createFromParcel(Parcel parcel) {
            return new QrCodeRequestOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final QrCodeRequestOption[] newArray(int i) {
            return new QrCodeRequestOption[i];
        }
    }

    public QrCodeRequestOption(String str, String str2, int i, String str3, Bundle bundle) {
        this.mProtocolType = str;
        this.mConnectType = str2;
        this.mDeviceType = i;
        this.mModelId = str3;
        this.mExtraData = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getConnectType() {
        return this.mConnectType;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public Bundle getExtraData() {
        return this.mExtraData;
    }

    public String getModelId() {
        return this.mModelId;
    }

    public String getProtocolType() {
        return this.mProtocolType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mProtocolType = parcel.readString();
        this.mConnectType = parcel.readString();
        this.mDeviceType = parcel.readInt();
        this.mModelId = parcel.readString();
        this.mExtraData = parcel.readBundle();
    }

    public void setConnectType(String str) {
        this.mConnectType = str;
        Bundle bundle = this.mExtraData;
        if (bundle != null) {
            bundle.putBoolean(BUNDLE_KEY_CONNECT_TYPE_FLAG, false);
        }
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setExtraData(Bundle bundle) {
        this.mExtraData = bundle;
    }

    public void setModelId(String str) {
        this.mModelId = str;
    }

    public void setProtocolType(String str) {
        this.mProtocolType = str;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("QrCodeRequestOption{mProtocolType=");
        sbA.append(this.mProtocolType);
        sbA.append(", mConnectType=");
        sbA.append(this.mConnectType);
        sbA.append(", mDeviceType=");
        sbA.append(this.mDeviceType);
        sbA.append(", mModelId=");
        sbA.append(this.mModelId);
        sbA.append(", mExtraData=");
        sbA.append(this.mExtraData);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProtocolType);
        parcel.writeString(this.mConnectType);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mModelId);
        parcel.writeBundle(this.mExtraData);
    }

    public void setConnectType(int i) {
        this.mConnectType = String.valueOf(i);
        if (this.mExtraData == null) {
            this.mExtraData = new Bundle();
        }
        this.mExtraData.putBoolean(BUNDLE_KEY_CONNECT_TYPE_FLAG, true);
    }

    public QrCodeRequestOption(String str, int i, int i2, String str2, Bundle bundle) {
        this.mProtocolType = str;
        this.mConnectType = String.valueOf(i);
        this.mDeviceType = i2;
        this.mModelId = str2;
        bundle = bundle == null ? new Bundle() : bundle;
        bundle.putBoolean(BUNDLE_KEY_CONNECT_TYPE_FLAG, true);
        this.mExtraData = bundle;
    }

    public QrCodeRequestOption(Parcel parcel) {
        readFromParcel(parcel);
    }
}
