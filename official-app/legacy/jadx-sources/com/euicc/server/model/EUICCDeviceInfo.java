package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class EUICCDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<EUICCDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_ESIM = 2;
    public static final int DEVICE_TYPE_INVALID = 0;
    public static final int DEVICE_TYPE_NO_MODEM = 3;
    public static final int DEVICE_TYPE_SIM = 1;
    public static final int RESULT_CODE_NOT_CONNECT = -2;
    public static final int RESULT_CODE_NOT_SUPPORT = -3;
    public static final int RESULT_CODE_SUCCESS = 1;
    public static final int RESULT_CODE_UNKNOW = 0;
    public static final int RESULT_CODE_USER_REJECT = -1;
    private String mAidlVersion;

    @Expose(deserialize = false, serialize = false)
    private String mCiphertext;

    @Expose(deserialize = false, serialize = false)
    private String mCiphertextSign;
    private String mDeviceIMEI;
    private String mDeviceSerialNumber;
    private int mDeviceType;
    private String mEID;

    @Expose(deserialize = false, serialize = false)
    private List<EUICCInfo> mEUICCInfoList;
    private String mOsVersion;
    private String mProductName;
    private int mResultCode;
    private long timeTemp;

    public class a implements Parcelable.Creator<EUICCDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo createFromParcel(Parcel parcel) {
            return new EUICCDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo[] newArray(int i) {
            return new EUICCDeviceInfo[i];
        }
    }

    public EUICCDeviceInfo() {
        this.mEUICCInfoList = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EUICCInfo getActiveSimProfileInfo() {
        List<EUICCInfo> list = this.mEUICCInfoList;
        if (list != null) {
            for (EUICCInfo eUICCInfo : list) {
                if (eUICCInfo.isActive()) {
                    try {
                        return eUICCInfo.m4534clone();
                    } catch (CloneNotSupportedException unused) {
                        return new EUICCInfo(eUICCInfo.getIMSI(), eUICCInfo.getICCID(), eUICCInfo.isActive());
                    }
                }
            }
        }
        return null;
    }

    public String getDeviceID() {
        int i = this.mDeviceType;
        if (i == 2 || i == 1) {
            return this.mDeviceIMEI;
        }
        if (i == 3) {
            return this.mDeviceSerialNumber;
        }
        return null;
    }

    public String getDeviceIMEI() {
        return this.mDeviceIMEI;
    }

    public String getDeviceSerialNumber() {
        return this.mDeviceSerialNumber;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public String getEID() {
        return this.mEID;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public List<EUICCInfo> getSimInfoList() {
        return new ArrayList(this.mEUICCInfoList);
    }

    public long getTimeTemp() {
        return this.timeTemp;
    }

    public String getmAidlVersion() {
        return this.mAidlVersion;
    }

    public String getmCiphertext() {
        return this.mCiphertext;
    }

    public String getmCiphertextSign() {
        return this.mCiphertextSign;
    }

    public String getmOsVersion() {
        return this.mOsVersion;
    }

    public void setDeviceIMEI(String str) {
        this.mDeviceIMEI = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.mDeviceSerialNumber = str;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setEID(String str) {
        this.mEID = str;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }

    public void setResultCode(int i) {
        this.mResultCode = i;
    }

    public void setSimInfoList(List<EUICCInfo> list) {
        this.mEUICCInfoList = list;
    }

    public void setTimeTemp(long j2) {
        this.timeTemp = j2;
    }

    public void setmAidlVersion(String str) {
        this.mAidlVersion = str;
    }

    public void setmCiphertext(String str) {
        this.mCiphertext = str;
    }

    public void setmCiphertextSign(String str) {
        this.mCiphertextSign = str;
    }

    public void setmOsVersion(String str) {
        this.mOsVersion = str;
    }

    @NonNull
    public String toString() {
        return "EUICCDeviceInfo{mResultCode=" + this.mResultCode + ", mDeviceType=" + this.mDeviceType + ", mDeviceIMEI='" + this.mDeviceIMEI + "', mDeviceSerialNumber='" + this.mDeviceSerialNumber + "', mProductName='" + this.mProductName + "', mEID='" + this.mEID + "', mOsVersion='" + this.mOsVersion + "', mAidlVersion='" + this.mAidlVersion + "', mCiphertext='" + this.mCiphertext + "', mCiphertextSign='" + this.mCiphertextSign + "', timeTemp=" + this.timeTemp + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mDeviceIMEI);
        parcel.writeString(this.mDeviceSerialNumber);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mEID);
        parcel.writeString(this.mOsVersion);
        parcel.writeString(this.mAidlVersion);
        parcel.writeString(this.mCiphertext);
        parcel.writeString(this.mCiphertextSign);
        parcel.writeLong(this.timeTemp);
        parcel.writeTypedList(this.mEUICCInfoList);
    }

    public EUICCDeviceInfo(Parcel parcel) {
        this.mEUICCInfoList = null;
        this.mResultCode = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceIMEI = parcel.readString();
        this.mDeviceSerialNumber = parcel.readString();
        this.mProductName = parcel.readString();
        this.mEID = parcel.readString();
        this.mOsVersion = parcel.readString();
        this.mAidlVersion = parcel.readString();
        this.mCiphertext = parcel.readString();
        this.mCiphertextSign = parcel.readString();
        this.timeTemp = parcel.readLong();
        if (this.mEUICCInfoList == null) {
            this.mEUICCInfoList = new ArrayList();
        }
        parcel.readTypedList(this.mEUICCInfoList, EUICCInfo.CREATOR);
    }
}
