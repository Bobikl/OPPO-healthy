package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.op5;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportDataDetail extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SportDataDetail> CREATOR = new a();
    private int altitudeOffset;
    private int amountOfExercise;
    private long calories;
    private String deviceType;
    private String deviceUniqueId;
    private int display;
    private int distance;
    private long endTimestamp;
    private int moveAbout;
    private int sedentaryState;
    private int sportMode;
    private String ssoid;
    private long startTimestamp;
    private int steps;
    private int syncStatus;
    private String timezone;
    private int workout;

    public class a implements Parcelable.Creator<SportDataDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportDataDetail createFromParcel(Parcel parcel) {
            return new SportDataDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportDataDetail[] newArray(int i) {
            return new SportDataDetail[i];
        }
    }

    public SportDataDetail() {
        this.deviceType = op5.PHONE;
        this.display = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAltitudeOffset() {
        return this.altitudeOffset;
    }

    public int getAmountOfExercise() {
        return this.amountOfExercise;
    }

    public long getCalories() {
        return this.calories;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getMoveAbout() {
        return this.moveAbout;
    }

    public int getSedentaryState() {
        return this.sedentaryState;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getWorkout() {
        return this.workout;
    }

    public void setAltitudeOffset(int i) {
        this.altitudeOffset = i;
    }

    public void setAmountOfExercise(int i) {
        this.amountOfExercise = i;
    }

    public void setCalories(long j2) {
        this.calories = j2;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setMoveAbout(int i) {
        this.moveAbout = i;
    }

    public void setSedentaryState(int i) {
        this.sedentaryState = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSteps(int i) {
        this.steps = i;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setWorkout(int i) {
        this.workout = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SportDataDetail{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", altitude=" + this.altitudeOffset + ", workout=" + this.workout + ", sedentaryState=" + this.sedentaryState + ", moveAbout=" + this.moveAbout + ", amountOfExercise=" + this.amountOfExercise + ", syncStatus=" + this.syncStatus + ", display=" + this.display + ", timezone='" + this.timezone + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceType);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        parcel.writeLong(this.calories);
        parcel.writeInt(this.altitudeOffset);
        parcel.writeInt(this.workout);
        parcel.writeInt(this.sedentaryState);
        parcel.writeInt(this.moveAbout);
        parcel.writeInt(this.amountOfExercise);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.display);
    }

    public SportDataDetail(Parcel parcel) {
        this.deviceType = op5.PHONE;
        this.display = 1;
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.steps = parcel.readInt();
        this.distance = parcel.readInt();
        this.calories = parcel.readLong();
        this.altitudeOffset = parcel.readInt();
        this.workout = parcel.readInt();
        this.sedentaryState = parcel.readInt();
        this.moveAbout = parcel.readInt();
        this.amountOfExercise = parcel.readInt();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.display = parcel.readInt();
    }
}
