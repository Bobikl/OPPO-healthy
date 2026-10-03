package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_ESIM = 2;
    public static final int DEVICE_TYPE_INVALID = 0;
    public static final int DEVICE_TYPE_NO_MODEM = 3;
    public static final int DEVICE_TYPE_SIM = 1;
    private String mDeviceIMEI;
    private String mDeviceSerialNumber;
    private int mDeviceType;
    private String mEID;
    private String mProductName;
    private int mResultCode;
    private List<SimInfo> mSimInfoList;

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

    public MultiSimDeviceInfo() {
        this.mSimInfoList = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SimInfo getActiveSimProfileInfo() {
        List<SimInfo> list = this.mSimInfoList;
        if (list != null) {
            for (SimInfo simInfo : list) {
                if (simInfo.isActive()) {
                    try {
                        return simInfo.m4533clone();
                    } catch (CloneNotSupportedException unused) {
                        return new SimInfo(simInfo.getIMSI(), simInfo.getICCID(), simInfo.isActive());
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

    public List<SimInfo> getSimInfoList() {
        return new ArrayList(this.mSimInfoList);
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

    public void setSimInfoList(List<SimInfo> list) {
        this.mSimInfoList = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        List<SimInfo> list = this.mSimInfoList;
        if (list != null && !list.isEmpty()) {
            Iterator<SimInfo> it = this.mSimInfoList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString());
            }
        }
        return "MultiSimDeviceInfo [mDeviceType=" + this.mDeviceType + ", mDeviceIdentifierm=" + this.mDeviceIMEI + ", mDeviceSerialNumber=" + this.mDeviceSerialNumber + ", mProductName=" + this.mProductName + ", mEID=" + this.mEID + ", mProfileInfoList=[" + stringBuffer.toString() + "] ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mDeviceIMEI);
        parcel.writeString(this.mDeviceSerialNumber);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mEID);
        parcel.writeTypedList(this.mSimInfoList);
    }

    public MultiSimDeviceInfo(Parcel parcel) {
        this.mSimInfoList = null;
        this.mResultCode = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceIMEI = parcel.readString();
        this.mDeviceSerialNumber = parcel.readString();
        this.mProductName = parcel.readString();
        this.mEID = parcel.readString();
        if (this.mSimInfoList == null) {
            this.mSimInfoList = new ArrayList();
        }
        parcel.readTypedList(this.mSimInfoList, SimInfo.CREATOR);
    }
}
