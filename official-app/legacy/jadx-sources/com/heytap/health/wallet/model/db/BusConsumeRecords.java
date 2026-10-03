package com.heytap.health.wallet.model.db;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import io.protostuff.Exclude;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BusConsumeRecords implements Parcelable {
    public static final Parcelable.Creator<BusConsumeRecords> CREATOR = new a();

    @Tag(3)
    private String aid;

    @Tag(6)
    private int amount;

    @Tag(7)
    private Integer balance;

    @Tag(2)
    private String cardNo;

    @Tag(5)
    private Integer creditLine;

    @Exclude
    private boolean isUpload;

    @Tag(1)
    private String recordId;

    @Tag(4)
    private String serialNumber;

    @Tag(10)
    private String terminalCode;

    @Tag(9)
    private long time;

    @Tag(8)
    private int type;

    public class a implements Parcelable.Creator<BusConsumeRecords> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusConsumeRecords createFromParcel(Parcel parcel) {
            return new BusConsumeRecords(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BusConsumeRecords[] newArray(int i) {
            return new BusConsumeRecords[i];
        }
    }

    public BusConsumeRecords(Parcel parcel) {
        this.isUpload = false;
        this.recordId = parcel.readString();
        this.cardNo = parcel.readString();
        this.aid = parcel.readString();
        this.serialNumber = parcel.readString();
        this.creditLine = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.amount = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
        this.balance = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.type = parcel.readInt();
        this.time = parcel.readLong();
        this.terminalCode = parcel.readString();
        this.isUpload = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAid() {
        return this.aid;
    }

    public Integer getAmount() {
        return Integer.valueOf(this.amount);
    }

    public Integer getBalance() {
        return this.balance;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public Integer getCreditLine() {
        return this.creditLine;
    }

    public boolean getIsUpload() {
        return this.isUpload;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getTerminalCode() {
        return this.terminalCode;
    }

    public long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }

    public boolean isUpload() {
        return this.isUpload;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAmount(Integer num) {
        this.amount = num.intValue();
    }

    public void setBalance(Integer num) {
        this.balance = num;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCreditLine(Integer num) {
        this.creditLine = num;
    }

    public void setIsUpload(boolean z) {
        this.isUpload = z;
    }

    public void setRecordId(String str) {
        this.recordId = str;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setTerminalCode(String str) {
        this.terminalCode = str;
    }

    public void setTime(long j2) {
        this.time = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpload(boolean z) {
        this.isUpload = z;
    }

    public String toString() {
        return "BusConsumeRecords{recordId='" + this.recordId + "', cardNo='" + this.cardNo + "', aid='" + this.aid + "', serialNumber='" + this.serialNumber + "', creditLine=" + this.creditLine + ", amount=" + this.amount + ", balance=" + this.balance + ", type=" + this.type + ", time=" + this.time + ", terminalCode='" + this.terminalCode + "', isUpload=" + this.isUpload + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.recordId);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.aid);
        parcel.writeString(this.serialNumber);
        parcel.writeValue(this.creditLine);
        parcel.writeValue(Integer.valueOf(this.amount));
        parcel.writeValue(this.balance);
        parcel.writeInt(this.type);
        parcel.writeLong(this.time);
        parcel.writeString(this.terminalCode);
        parcel.writeByte(this.isUpload ? (byte) 1 : (byte) 0);
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public BusConsumeRecords(String str, String str2, String str3, String str4, Integer num, int i, Integer num2, int i2, long j2, String str5, boolean z) {
        this.recordId = str;
        this.cardNo = str2;
        this.aid = str3;
        this.serialNumber = str4;
        this.creditLine = num;
        this.amount = i;
        this.balance = num2;
        this.type = i2;
        this.time = j2;
        this.terminalCode = str5;
        this.isUpload = z;
    }
}
