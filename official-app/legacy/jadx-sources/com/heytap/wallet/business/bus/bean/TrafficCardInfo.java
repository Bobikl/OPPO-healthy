package com.heytap.wallet.business.bus.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.e1j;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes19.dex */
public class TrafficCardInfo implements Parcelable {
    public static final Parcelable.Creator<TrafficCardInfo> CREATOR = new a();
    public boolean abnormalUserCard;
    public String aid;
    public String cardIssuerId;
    public String cardNo;
    public String endDate;
    public String innerNo;
    public boolean isInBlackList;
    public String serialNo;
    public String startDate;
    public String status;
    public String version;

    public class a implements Parcelable.Creator<TrafficCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrafficCardInfo createFromParcel(Parcel parcel) {
            return new TrafficCardInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrafficCardInfo[] newArray(int i) {
            return new TrafficCardInfo[i];
        }
    }

    public TrafficCardInfo() {
        this.status = "01";
    }

    private boolean isValidDate(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCardDateOverDue() {
        int iS = e1j.s(e1j.p(System.currentTimeMillis(), "yyyyMMdd"));
        return iS >= e1j.s(this.startDate) && iS <= e1j.s(this.endDate);
    }

    public boolean isCardDateValid() {
        return isValidDate(this.startDate) && isValidDate(this.endDate);
    }

    public boolean isInBlackList() {
        return this.isInBlackList;
    }

    public boolean isNotUse() {
        int iS = e1j.s(e1j.p(System.currentTimeMillis(), "yyyyMMdd"));
        int iS2 = e1j.s(this.startDate);
        e1j.s(this.endDate);
        return iS < iS2;
    }

    public String toString() {
        return "aid=" + this.aid + " cardNo=" + this.cardNo + " startDate=" + this.startDate + " endDate=" + this.endDate + " status=" + this.status + " version=" + this.version + "cardIssuerId =" + this.cardIssuerId + "isInBlackList = " + this.isInBlackList + " abnormalUserCard=" + this.abnormalUserCard + " innerNo=" + this.innerNo + "serialNo=" + this.serialNo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        parcel.writeString(this.status);
        parcel.writeString(this.version);
        parcel.writeByte(this.isInBlackList ? (byte) 1 : (byte) 0);
        parcel.writeString(this.cardIssuerId);
        parcel.writeByte(this.abnormalUserCard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.innerNo);
        parcel.writeString(this.serialNo);
    }

    public TrafficCardInfo(Parcel parcel) {
        this.status = "01";
        this.aid = parcel.readString();
        this.cardNo = parcel.readString();
        this.startDate = parcel.readString();
        this.endDate = parcel.readString();
        this.status = parcel.readString();
        this.version = parcel.readString();
        this.isInBlackList = parcel.readByte() != 0;
        this.cardIssuerId = parcel.readString();
        this.abnormalUserCard = parcel.readByte() != 0;
        this.innerNo = parcel.readString();
        this.serialNo = parcel.readString();
    }
}
