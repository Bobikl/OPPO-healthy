package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullUserInfoResBody implements Parcelable {
    public static final Parcelable.Creator<PullUserInfoResBody> CREATOR = new a();
    private String birthday;
    private int bloodPressureType;
    private String clientDataId;
    private int guideStatus;
    private String height;
    private long modifiedTime;
    private String sex;
    private String ssoid;
    private String timezone;
    private int unitType;
    private String weight;

    public class a implements Parcelable.Creator<PullUserInfoResBody> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullUserInfoResBody createFromParcel(Parcel parcel) {
            return new PullUserInfoResBody(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullUserInfoResBody[] newArray(int i) {
            return new PullUserInfoResBody[i];
        }
    }

    public PullUserInfoResBody() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public int getBloodPressureType() {
        return this.bloodPressureType;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getGuideStatus() {
        return this.guideStatus;
    }

    public String getHeight() {
        return this.height;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getUnitType() {
        return this.unitType;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBloodPressureType(int i) {
        this.bloodPressureType = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setGuideStatus(int i) {
        this.guideStatus = i;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setUnitType(int i) {
        this.unitType = i;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public String toString() {
        return "PullUserInfoResBody{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', height='" + this.height + "', weight='" + this.weight + "', unitType=" + this.unitType + ", timezone='" + this.timezone + "', modifiedTime=" + this.modifiedTime + ", birthday='" + this.birthday + "', sex='" + this.sex + "', guideStatus=" + this.guideStatus + ", bloodPressureType=" + this.bloodPressureType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
        parcel.writeInt(this.unitType);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.modifiedTime);
        parcel.writeString(this.birthday);
        parcel.writeString(this.sex);
        parcel.writeInt(this.guideStatus);
        parcel.writeInt(this.bloodPressureType);
    }

    public PullUserInfoResBody(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.height = parcel.readString();
        this.weight = parcel.readString();
        this.unitType = parcel.readInt();
        this.timezone = parcel.readString();
        this.modifiedTime = parcel.readLong();
        this.birthday = parcel.readString();
        this.sex = parcel.readString();
        this.guideStatus = parcel.readInt();
        this.bloodPressureType = parcel.readInt();
    }
}
