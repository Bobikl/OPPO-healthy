package com.heytap.wallet.business.bus.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class BusSiteState implements Parcelable {
    public static final Parcelable.Creator<BusSiteState> CREATOR = new a();
    public static final int SITE_STATE_INNER = 1;
    public static final int SITE_STATE_OUT = 2;
    public static final int SITE_STATE_UNKNOWN = 0;
    public String appAvalideFlag;
    public String beLocked;
    public int inBalance;
    public String inCityCode;
    public String inDateTime;
    public String inLineNo;
    public String inTerminalCode;
    public String inTerminalVendorCode;
    public int inTransAmount;
    public int markPrice;
    public String nationWideFlag;
    public String outCityCode;
    public String outDateTime;
    public String outLineNo;
    public String outTerminalCode;
    public String outTerminalVendorCode;
    public int outTransAmount;
    public String sid;
    public int status;
    public String statusCode;

    public class a implements Parcelable.Creator<BusSiteState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusSiteState createFromParcel(Parcel parcel) {
            return new BusSiteState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BusSiteState[] newArray(int i) {
            return new BusSiteState[i];
        }
    }

    public BusSiteState() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "sid=" + this.sid + " appAvalideFlag=" + this.appAvalideFlag + " nationWideFlag=" + this.nationWideFlag + " beLocked=" + this.beLocked + " statusCode=" + this.statusCode + " status=" + this.status + " inCityCode=" + this.inCityCode + " outCityCode=" + this.outCityCode + " inTerminalVendorCode=" + this.inTerminalVendorCode + " outTerminalVendorCode=" + this.outTerminalVendorCode + " inTerminalCode=" + this.inTerminalCode + " outTerminalCode=" + this.outTerminalCode + " inDateTime=" + this.inDateTime + " outDateTime=" + this.outDateTime + " markPrice=" + this.markPrice + " inLineNo=" + this.inLineNo + " outLineNo=" + this.outLineNo + " inTransAmount=" + this.inTransAmount + " inBalance=" + this.inBalance + " outTransAmount=" + this.outTransAmount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeString(this.appAvalideFlag);
        parcel.writeString(this.nationWideFlag);
        parcel.writeString(this.beLocked);
        parcel.writeString(this.statusCode);
        parcel.writeInt(this.status);
        parcel.writeString(this.inCityCode);
        parcel.writeString(this.outCityCode);
        parcel.writeString(this.inTerminalVendorCode);
        parcel.writeString(this.outTerminalVendorCode);
        parcel.writeString(this.inTerminalCode);
        parcel.writeString(this.outTerminalCode);
        parcel.writeString(this.inDateTime);
        parcel.writeString(this.outDateTime);
        parcel.writeInt(this.markPrice);
        parcel.writeString(this.inLineNo);
        parcel.writeString(this.outLineNo);
        parcel.writeInt(this.inTransAmount);
        parcel.writeInt(this.inBalance);
        parcel.writeInt(this.outTransAmount);
    }

    public BusSiteState(Parcel parcel) {
        this.sid = parcel.readString();
        this.appAvalideFlag = parcel.readString();
        this.nationWideFlag = parcel.readString();
        this.beLocked = parcel.readString();
        this.statusCode = parcel.readString();
        this.status = parcel.readInt();
        this.inCityCode = parcel.readString();
        this.outCityCode = parcel.readString();
        this.inTerminalVendorCode = parcel.readString();
        this.outTerminalVendorCode = parcel.readString();
        this.inTerminalCode = parcel.readString();
        this.outTerminalCode = parcel.readString();
        this.inDateTime = parcel.readString();
        this.outDateTime = parcel.readString();
        this.markPrice = parcel.readInt();
        this.inLineNo = parcel.readString();
        this.outLineNo = parcel.readString();
        this.inTransAmount = parcel.readInt();
        this.inBalance = parcel.readInt();
        this.outTransAmount = parcel.readInt();
    }
}
