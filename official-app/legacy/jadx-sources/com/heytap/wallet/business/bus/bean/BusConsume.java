package com.heytap.wallet.business.bus.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class BusConsume implements Parcelable {
    public static final Parcelable.Creator<BusConsume> CREATOR = new a();
    public static final String KEY_TRANSTYPE_CONSUME = "CONSUME";
    public static final String KEY_TRANSTYPE_RECHARGE = "RECHARGE";
    public static final int RESULT_CODE_EXCEPTION = 9999;
    public static final int RESULT_CODE_SUC = 0;
    public String aid;
    public int balance;
    public int resultCode;
    public String terminalCode;
    public String tlvData;
    public Long tradeTime;
    public int transAmount;
    public String transDate;
    public String transSeType;
    public String transTime;
    public int transTool;
    public String transType;

    public class a implements Parcelable.Creator<BusConsume> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusConsume createFromParcel(Parcel parcel) {
            return new BusConsume(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BusConsume[] newArray(int i) {
            return new BusConsume[i];
        }
    }

    public BusConsume() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAid() {
        return this.aid;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getTlvData() {
        return this.tlvData;
    }

    public String getTransDate() {
        return this.transDate;
    }

    public String getTransTime() {
        return this.transTime;
    }

    public String getTransType() {
        return this.transType;
    }

    public boolean isSuccess() {
        return this.resultCode == 0;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setBalance(int i) {
        this.balance = i;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setTlvData(String str) {
        this.tlvData = str;
    }

    public void setTransDate(String str) {
        this.transDate = str;
    }

    public void setTransTime(String str) {
        this.transTime = str;
    }

    public void setTransType(String str) {
        this.transType = str;
    }

    public String toString() {
        return "BusinessCardConsume{aid='" + this.aid + "'tlvData='" + this.tlvData + "', transAmount=" + this.transAmount + ", balance=" + this.balance + ", transType='" + this.transType + "', transTool='" + this.transTool + "', terminalCode='" + this.terminalCode + "', transDate='" + this.transDate + "', transTime='" + this.transTime + "', transSeType='" + this.transSeType + "', resultCode='" + this.resultCode + "', tradeTime=" + this.tradeTime + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeString(this.tlvData);
        parcel.writeInt(this.transAmount);
        parcel.writeInt(this.balance);
        parcel.writeString(this.transType);
        parcel.writeInt(this.transTool);
        parcel.writeString(this.terminalCode);
        parcel.writeString(this.transDate);
        parcel.writeString(this.transTime);
        Long l2 = this.tradeTime;
        parcel.writeLong(l2 == null ? 0L : l2.longValue());
        parcel.writeString(this.transSeType);
        parcel.writeInt(this.resultCode);
    }

    public BusConsume(Parcel parcel) {
        this.aid = parcel.readString();
        this.tlvData = parcel.readString();
        this.transAmount = parcel.readInt();
        this.balance = parcel.readInt();
        this.transType = parcel.readString();
        this.transTool = parcel.readInt();
        this.terminalCode = parcel.readString();
        this.transDate = parcel.readString();
        this.transTime = parcel.readString();
        this.tradeTime = parcel.readLong() == 0 ? null : Long.valueOf(parcel.readLong());
        this.transSeType = parcel.readString();
        this.resultCode = parcel.readInt();
    }
}
