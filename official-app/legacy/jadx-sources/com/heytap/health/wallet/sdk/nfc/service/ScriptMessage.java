package com.heytap.health.wallet.sdk.nfc.service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ScriptMessage implements Parcelable {
    public static final Parcelable.Creator<ScriptMessage> CREATOR = new a();
    private static final String TAG = "ScriptMessage";
    public String actionType;
    public String aid;
    public String appCode;
    public Integer balance;
    public String cardNo;
    public String content;
    public String extraInfo;
    public Integer networkType;
    public String orderNo;
    public Integer push;
    public Integer sendType;
    public String title;

    public class a implements Parcelable.Creator<ScriptMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScriptMessage createFromParcel(Parcel parcel) {
            return new ScriptMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScriptMessage[] newArray(int i) {
            return new ScriptMessage[i];
        }
    }

    public ScriptMessage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActionType() {
        return this.actionType;
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getContent() {
        return this.content;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public Integer getNetworkType() {
        return this.networkType;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public Integer getPush() {
        return this.push;
    }

    public String getTitle() {
        return this.title;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setBalance(Integer num) {
        this.balance = num;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setNetworkType(Integer num) {
        this.networkType = num;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setPush(Integer num) {
        this.push = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionType);
        parcel.writeString(this.appCode);
        parcel.writeString(this.aid);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.extraInfo);
        parcel.writeValue(this.networkType);
        parcel.writeValue(this.push);
        parcel.writeString(this.content);
        parcel.writeString(this.title);
        parcel.writeValue(this.sendType);
        parcel.writeString(this.cardNo);
        parcel.writeValue(this.balance);
    }

    public ScriptMessage(Parcel parcel) {
        this.actionType = parcel.readString();
        this.appCode = parcel.readString();
        this.aid = parcel.readString();
        this.orderNo = parcel.readString();
        this.extraInfo = parcel.readString();
        this.networkType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.push = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.content = parcel.readString();
        this.title = parcel.readString();
        this.sendType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.cardNo = parcel.readString();
        this.balance = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
