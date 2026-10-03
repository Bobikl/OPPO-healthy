package com.cmcc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();
    private String mAPIVersion;
    private String mDeviceIMEI;
    private String mDeviceSerialNumber;
    private int mDeviceType;
    private String mEID;
    private String mProductName;
    private int mResultCode;
    private String mSign;
    private List<SimInfo> mSimInfoList;
    private String mTechVersion;
    private long mTime;

    public class a implements Parcelable.Creator<MultiSimDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo createFromParcel(Parcel parcel) {
            return new MultiSimDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo[] newArray(int i) {
            return new MultiSimDeviceInfo[i];
        }
    }

    public MultiSimDeviceInfo(Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceIMEI = parcel.readString();
        this.mDeviceSerialNumber = parcel.readString();
        this.mProductName = parcel.readString();
        this.mEID = parcel.readString();
        this.mAPIVersion = parcel.readString();
        this.mTechVersion = parcel.readString();
        this.mTime = parcel.readLong();
        this.mSign = parcel.readString();
        this.mSimInfoList = parcel.createTypedArrayList(SimInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAPIVersion() {
        return this.mAPIVersion;
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

    public String getSign() {
        return this.mSign;
    }

    public List<SimInfo> getSimInfoList() {
        return this.mSimInfoList;
    }

    public String getTechVersion() {
        return this.mTechVersion;
    }

    public long getTime() {
        return this.mTime;
    }

    public void setAPIVersion(String str) {
        this.mAPIVersion = str;
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

    public void setSign(String str) {
        this.mSign = str;
    }

    public void setSimInfoList(List<SimInfo> list) {
        this.mSimInfoList = list;
    }

    public void setTechVersion(String str) {
        this.mTechVersion = str;
    }

    public void setTime(long j2) {
        this.mTime = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mDeviceIMEI);
        parcel.writeString(this.mDeviceSerialNumber);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mEID);
        parcel.writeString(this.mAPIVersion);
        parcel.writeString(this.mTechVersion);
        parcel.writeLong(this.mTime);
        parcel.writeString(this.mSign);
        parcel.writeTypedList(this.mSimInfoList);
    }

    public MultiSimDeviceInfo() {
    }
}
