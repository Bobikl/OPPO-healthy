package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FriendSummaryData implements Parcelable {
    public static final Parcelable.Creator<FriendSummaryData> CREATOR = new a();
    private int calorieGoal;
    private int deviceType;
    private String friendSsoid;
    private List<FriendSharedDataType> sharedTypeList;
    private int stepsGoal;
    private int totalCalories;
    private int totalDistance;
    private int totalSteps;
    private int totalWorkoutMinutes;
    private int totalWorkoutTimes;

    public class a implements Parcelable.Creator<FriendSummaryData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendSummaryData createFromParcel(Parcel parcel) {
            return new FriendSummaryData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendSummaryData[] newArray(int i) {
            return new FriendSummaryData[i];
        }
    }

    public FriendSummaryData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCalorieGoal() {
        return this.calorieGoal;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public List<FriendSharedDataType> getSharedTypeList() {
        return this.sharedTypeList;
    }

    public int getStepsGoal() {
        return this.stepsGoal;
    }

    public int getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public int getTotalWorkoutMinutes() {
        return this.totalWorkoutMinutes;
    }

    public int getTotalWorkoutTimes() {
        return this.totalWorkoutTimes;
    }

    public void setCalorieGoal(int i) {
        this.calorieGoal = i;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setSharedTypeList(List<FriendSharedDataType> list) {
        this.sharedTypeList = list;
    }

    public void setStepsGoal(int i) {
        this.stepsGoal = i;
    }

    public void setTotalCalories(int i) {
        this.totalCalories = i;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalWorkoutMinutes(int i) {
        this.totalWorkoutMinutes = i;
    }

    public void setTotalWorkoutTimes(int i) {
        this.totalWorkoutTimes = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeInt(this.deviceType);
        parcel.writeTypedList(this.sharedTypeList);
        parcel.writeInt(this.totalSteps);
        parcel.writeInt(this.totalDistance);
        parcel.writeInt(this.totalCalories);
        parcel.writeInt(this.totalWorkoutMinutes);
        parcel.writeInt(this.totalWorkoutTimes);
        parcel.writeInt(this.stepsGoal);
        parcel.writeInt(this.calorieGoal);
    }

    public FriendSummaryData(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        this.deviceType = parcel.readInt();
        this.sharedTypeList = parcel.createTypedArrayList(FriendSharedDataType.CREATOR);
        this.totalSteps = parcel.readInt();
        this.totalDistance = parcel.readInt();
        this.totalCalories = parcel.readInt();
        this.totalWorkoutMinutes = parcel.readInt();
        this.totalWorkoutTimes = parcel.readInt();
        this.stepsGoal = parcel.readInt();
        this.calorieGoal = parcel.readInt();
    }
}
