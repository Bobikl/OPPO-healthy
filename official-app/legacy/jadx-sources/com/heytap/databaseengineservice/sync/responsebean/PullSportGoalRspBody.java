package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullSportGoalRspBody implements Parcelable {
    public static final Parcelable.Creator<PullSportGoalRspBody> CREATOR = new a();
    private String clientDataId;
    private long endTime;
    private int goalNum;
    private String goalStr;
    private int goalType;
    private int goalUnit;
    private long modifiedTime;
    private String ssoid;
    private long startTime;

    public class a implements Parcelable.Creator<PullSportGoalRspBody> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullSportGoalRspBody createFromParcel(Parcel parcel) {
            return new PullSportGoalRspBody(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullSportGoalRspBody[] newArray(int i) {
            return new PullSportGoalRspBody[i];
        }
    }

    public PullSportGoalRspBody() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getGoalNum() {
        return this.goalNum;
    }

    public String getGoalStr() {
        return this.goalStr;
    }

    public int getGoalType() {
        return this.goalType;
    }

    public int getGoalUnit() {
        return this.goalUnit;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setGoalNum(int i) {
        this.goalNum = i;
    }

    public void setGoalStr(String str) {
        this.goalStr = str;
    }

    public void setGoalType(int i) {
        this.goalType = i;
    }

    public void setGoalUnit(int i) {
        this.goalUnit = i;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public String toString() {
        return "PullSportGoalRspBody{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', goalType=" + this.goalType + ", goalUnit=" + this.goalUnit + ", goalNum=" + this.goalNum + ", goalStr='" + this.goalStr + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", modifiedTime=" + this.modifiedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.goalType);
        parcel.writeInt(this.goalUnit);
        parcel.writeInt(this.goalNum);
        parcel.writeString(this.goalStr);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.modifiedTime);
    }

    public PullSportGoalRspBody(Parcel parcel) {
        this.clientDataId = parcel.readString();
        this.ssoid = parcel.readString();
        this.goalType = parcel.readInt();
        this.goalUnit = parcel.readInt();
        this.goalNum = parcel.readInt();
        this.goalStr = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.modifiedTime = parcel.readLong();
    }
}
