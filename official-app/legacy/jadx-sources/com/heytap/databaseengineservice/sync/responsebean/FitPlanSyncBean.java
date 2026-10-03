package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FitPlanSyncBean implements Parcelable {
    public static final Parcelable.Creator<FitPlanSyncBean> CREATOR = new a();
    private String finishedCourseIdsInPlan;
    private long lastTrainTime;
    private long planId;
    private String planName;
    private int totalCalorie;
    private int totalDuration;

    public class a implements Parcelable.Creator<FitPlanSyncBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitPlanSyncBean createFromParcel(Parcel parcel) {
            return new FitPlanSyncBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FitPlanSyncBean[] newArray(int i) {
            return new FitPlanSyncBean[i];
        }
    }

    public FitPlanSyncBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFinishedCourseIdsInPlan() {
        return this.finishedCourseIdsInPlan;
    }

    public long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public long getPlanId() {
        return this.planId;
    }

    public String getPlanName() {
        return this.planName;
    }

    public int getTotalCalorie() {
        return this.totalCalorie;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public void setFinishedCourseIdsInPlan(String str) {
        this.finishedCourseIdsInPlan = str;
    }

    public void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public void setPlanId(long j2) {
        this.planId = j2;
    }

    public void setPlanName(String str) {
        this.planName = str;
    }

    public void setTotalCalorie(int i) {
        this.totalCalorie = i;
    }

    public void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.planId);
        parcel.writeString(this.planName);
        parcel.writeLong(this.lastTrainTime);
        parcel.writeString(this.finishedCourseIdsInPlan);
        parcel.writeInt(this.totalCalorie);
        parcel.writeInt(this.totalDuration);
    }

    public FitPlanSyncBean(Parcel parcel) {
        this.planId = parcel.readLong();
        this.planName = parcel.readString();
        this.lastTrainTime = parcel.readLong();
        this.finishedCourseIdsInPlan = parcel.readString();
        this.totalCalorie = parcel.readInt();
        this.totalDuration = parcel.readInt();
    }
}
