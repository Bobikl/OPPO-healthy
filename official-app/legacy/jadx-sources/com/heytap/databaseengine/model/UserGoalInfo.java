package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserGoalInfo implements Parcelable {
    public static final String CONSUMPTION_GOAL_DEFAULT = "300000";
    public static final Parcelable.Creator<UserGoalInfo> CREATOR = new a();
    public static final String DEVICE_CONSUMPTION_GOAL_DEFAULT = "100000";
    public static final String DEVICE_DATA_MOVE_ABOUT_TIMES_GOAL_DEFAULT = "10";
    public static final String DEVICE_DATA_WORKOUT_GOAL_DEFAULT = "10";
    public static final String DEVICE_STEPS_GOAL_DEFAULT = "5000";
    public static final String MOVE_ABOUT_TIMES_GOAL_DEFAULT = "12";
    public static final String STEPS_GOAL_DEFAULT = "8000";
    public static final String TRACK_SPORT_GOAL_DEFAULT = "1%200%3";
    public static final String TRACK_SPORT_GOAL_DEFAULT_RIDE = "0%5%0";
    public static final String TRACK_SPORT_GOAL_DEFAULT_RUN = "0%5%4";
    public static final String WEIGHT_GOAL_DEFAULT = "60000";
    public static final String WORKOUT_GOAL_DEFAULT = "30";
    private int deadLine;
    private long modifiedTime;
    private String ssoid;
    private int syncStatus;
    private int type;
    private String value;

    public class a implements Parcelable.Creator<UserGoalInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserGoalInfo createFromParcel(Parcel parcel) {
            return new UserGoalInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserGoalInfo[] newArray(int i) {
            return new UserGoalInfo[i];
        }
    }

    public UserGoalInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDeadLine() {
        return this.deadLine;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setDeadLine(int i) {
        this.deadLine = i;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "UserGoalInfo{ssoid='" + this.ssoid + "', type=" + this.type + ", value='" + this.value + "', deadLine=" + this.deadLine + ", syncStatus=" + this.syncStatus + ", modifiedTime=" + this.modifiedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.type);
        parcel.writeString(this.value);
        parcel.writeInt(this.deadLine);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTime);
    }

    public UserGoalInfo(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.type = parcel.readInt();
        this.value = parcel.readString();
        this.deadLine = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.modifiedTime = parcel.readLong();
    }
}
