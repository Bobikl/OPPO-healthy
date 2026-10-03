package com.heytap.health.healthbase.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class TargetBean implements Parcelable {
    public static final Parcelable.Creator<TargetBean> CREATOR = new a();

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("del")
    private int del;

    @SerializedName("deleteTime")
    private long deleteTime;
    private long endTimeStamp;

    @SerializedName("goalCode")
    private String goalCode;

    @SerializedName("goalId")
    private String goalId;

    @SerializedName("goalName")
    private String goalName;

    @SerializedName("goalType")
    private int goalType;

    @SerializedName("iconUrl")
    private String iconUrl;

    @SerializedName("goalColor")
    private String signColor;

    @SerializedName("signInEndTime")
    private String signInEndTime;

    @SerializedName("signInStartTime")
    private String signInStartTime;

    @SerializedName("signInStatus")
    private int signInStatus;

    @SerializedName("totalTimes")
    private int signTimes;
    private long startTimeStamp;

    public class a implements Parcelable.Creator<TargetBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TargetBean createFromParcel(Parcel parcel) {
            return new TargetBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TargetBean[] newArray(int i) {
            return new TargetBean[i];
        }
    }

    public TargetBean() {
        this.goalType = 1;
        this.goalCode = "";
        this.goalId = "";
        this.goalName = "";
        this.signColor = "#FFFE6E4B";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDel() {
        return this.del;
    }

    public long getDeleteTime() {
        return this.deleteTime;
    }

    public long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public String getGoalCode() {
        return this.goalCode;
    }

    public String getGoalId() {
        return this.goalId;
    }

    public String getGoalName() {
        return this.goalName;
    }

    public int getGoalType() {
        return this.goalType;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getSignColor() {
        return this.signColor;
    }

    public String getSignInEndTime() {
        return this.signInEndTime;
    }

    public String getSignInStartTime() {
        return this.signInStartTime;
    }

    public int getSignInStatus() {
        return this.signInStatus;
    }

    public int getSignTimes() {
        return this.signTimes;
    }

    public long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDel(int i) {
        this.del = i;
    }

    public void setDeleteTime(long j2) {
        this.deleteTime = j2;
    }

    public void setEndTimeStamp(long j2) {
        this.endTimeStamp = j2;
    }

    public void setGoalCode(String str) {
        this.goalCode = str;
    }

    public void setGoalId(String str) {
        this.goalId = str;
    }

    public void setGoalName(String str) {
        this.goalName = str;
    }

    public void setGoalType(int i) {
        this.goalType = i;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setSignColor(String str) {
        this.signColor = str;
    }

    public void setSignInEndTime(String str) {
        this.signInEndTime = str;
    }

    public void setSignInStartTime(String str) {
        this.signInStartTime = str;
    }

    public void setSignInStatus(int i) {
        this.signInStatus = i;
    }

    public void setSignTimes(int i) {
        this.signTimes = i;
    }

    public void setStartTimeStamp(long j2) {
        this.startTimeStamp = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.goalType);
        parcel.writeString(this.goalCode);
        parcel.writeString(this.goalId);
        parcel.writeString(this.goalName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.signColor);
        parcel.writeString(this.signInStartTime);
        parcel.writeString(this.signInEndTime);
        parcel.writeInt(this.signInStatus);
        parcel.writeInt(this.del);
        parcel.writeInt(this.signTimes);
        parcel.writeLong(this.deleteTime);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.startTimeStamp);
        parcel.writeLong(this.endTimeStamp);
    }

    public TargetBean(Parcel parcel) {
        this.goalType = 1;
        this.goalCode = "";
        this.goalId = "";
        this.goalName = "";
        this.signColor = "#FFFE6E4B";
        this.goalType = parcel.readInt();
        this.goalCode = parcel.readString();
        this.goalId = parcel.readString();
        this.goalName = parcel.readString();
        this.iconUrl = parcel.readString();
        this.signColor = parcel.readString();
        this.signInStartTime = parcel.readString();
        this.signInEndTime = parcel.readString();
        this.signInStatus = parcel.readInt();
        this.del = parcel.readInt();
        this.signTimes = parcel.readInt();
        this.deleteTime = parcel.readLong();
        this.createTime = parcel.readLong();
        this.startTimeStamp = parcel.readLong();
        this.endTimeStamp = parcel.readLong();
    }
}
