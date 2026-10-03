package com.heytap.wallet.business.bus.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.health.wallet.model.db.BusConsumeRecords;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;
import com.oplus.aiunit.vision.e1j;
import com.oplus.aiunit.vision.xbb;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class NfcConsumeRecord implements Parcelable {
    public static final int CONSUME = 1;
    public static final Parcelable.Creator<NfcConsumeRecord> CREATOR = new a();
    public static final int OTHER = 0;
    public static final int RECHARGE = 2;
    public int amount;
    public Integer balance;
    public Integer creditLine;
    public boolean isLine;
    public boolean isTitle;
    public String serialNumber;
    public String terminalCode;
    public String transTime;
    public String transeType;

    public class a implements Parcelable.Creator<NfcConsumeRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NfcConsumeRecord createFromParcel(Parcel parcel) {
            return new NfcConsumeRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NfcConsumeRecord[] newArray(int i) {
            return new NfcConsumeRecord[i];
        }
    }

    public NfcConsumeRecord() {
        this.isTitle = false;
        this.isLine = false;
    }

    public static BusConsumeRecords getBusConsumeRecords(String str, String str2, NfcConsumeRecord nfcConsumeRecord) {
        if (nfcConsumeRecord == null) {
            return null;
        }
        return new BusConsumeRecords(xbb.a(str2 + nfcConsumeRecord.serialNumber + nfcConsumeRecord.terminalCode + nfcConsumeRecord.transTime), str, str2, nfcConsumeRecord.serialNumber, nfcConsumeRecord.creditLine, nfcConsumeRecord.amount, nfcConsumeRecord.balance, getTranseType(nfcConsumeRecord.transeType), e1j.d(nfcConsumeRecord.transTime, e1j.format1), nfcConsumeRecord.terminalCode, false);
    }

    private static int getTranseType(String str) {
        if ("06".equalsIgnoreCase(str) || DeviceTypeConstants.KITCHEN_SCALE.equalsIgnoreCase(str)) {
            return 1;
        }
        return "02".equalsIgnoreCase(str) ? 2 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isConsume() {
        return "06".equalsIgnoreCase(this.transeType) || DeviceTypeConstants.KITCHEN_SCALE.equalsIgnoreCase(this.transeType);
    }

    public String toString() {
        return "NfcConsumeRecord{serialNumber='" + this.serialNumber + "'creditLine='" + this.creditLine + "', amount=" + this.amount + ", balance=" + this.balance + ", transeType='" + this.transeType + "', transTime='" + this.transTime + "', terminalCode='" + this.terminalCode + "', isTitle=" + this.isTitle + ", isLine=" + this.isLine + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serialNumber);
        parcel.writeValue(this.creditLine);
        parcel.writeValue(Integer.valueOf(this.amount));
        parcel.writeValue(this.balance);
        parcel.writeString(this.transeType);
        parcel.writeString(this.transTime);
        parcel.writeString(this.terminalCode);
        parcel.writeByte(this.isTitle ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLine ? (byte) 1 : (byte) 0);
    }

    public NfcConsumeRecord(BusConsumeRecords busConsumeRecords) {
        this.isTitle = false;
        this.isLine = false;
        this.serialNumber = busConsumeRecords.getSerialNumber();
        this.creditLine = busConsumeRecords.getCreditLine();
        this.amount = busConsumeRecords.getAmount().intValue();
        this.balance = busConsumeRecords.getBalance();
        this.transeType = busConsumeRecords.getType() == 1 ? "06" : "02";
        this.transTime = e1j.b(busConsumeRecords.getTime(), e1j.format1);
        this.terminalCode = busConsumeRecords.getTerminalCode();
    }

    public NfcConsumeRecord(Parcel parcel) {
        this.isTitle = false;
        this.isLine = false;
        this.serialNumber = parcel.readString();
        this.creditLine = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.amount = ((Integer) parcel.readValue(Integer.class.getClassLoader())).intValue();
        this.balance = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.transeType = parcel.readString();
        this.transTime = parcel.readString();
        this.terminalCode = parcel.readString();
        this.isTitle = parcel.readByte() != 0;
        this.isLine = parcel.readByte() != 0;
    }
}
