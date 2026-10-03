package com.heytap.health.operation.goal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class GoalBean implements Parcelable {
    public static final Parcelable.Creator<GoalBean> CREATOR = new a();

    @SerializedName("createTime")
    public long createTime;

    @SerializedName("del")
    public int del;

    @SerializedName("deleteTime")
    public long deleteTime;
    public int goalCardMode;
    public boolean goalCardSelectState;

    @SerializedName("goalCode")
    public String goalCode;

    @SerializedName("goalId")
    public String goalId;

    @SerializedName("goalName")
    public String goalName;

    @SerializedName("goalType")
    public int goalType;

    @SerializedName("iconUrl")
    public String iconUrl;

    @SerializedName("goalColor")
    public String signColor;

    @SerializedName("signInEndTime")
    public String signInEndTime;

    @SerializedName("signInStartTime")
    public String signInStartTime;

    @SerializedName("signInStatus")
    public int signInStatus;

    @SerializedName("totalTimes")
    public int signTimes;

    public class a implements Parcelable.Creator<GoalBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GoalBean createFromParcel(Parcel parcel) {
            return new GoalBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GoalBean[] newArray(int i) {
            return new GoalBean[i];
        }
    }

    public GoalBean(Parcel parcel) {
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
        this.goalCardMode = parcel.readInt();
        this.goalCardSelectState = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isDelete() {
        return this.del == 1;
    }

    public boolean isSystemGoal() {
        return this.goalType == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
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
        parcel.writeInt(this.goalCardMode);
        parcel.writeByte(this.goalCardSelectState ? (byte) 1 : (byte) 0);
    }
}
