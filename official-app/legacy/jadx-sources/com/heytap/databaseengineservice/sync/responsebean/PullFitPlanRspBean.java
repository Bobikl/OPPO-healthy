package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullFitPlanRspBean implements Parcelable {
    public static final Parcelable.Creator<PullFitPlanRspBean> CREATOR = new a();
    private int calorie;
    private String courseIds;
    private int courseNumber;
    private int difficultyLevel;
    private String finishedCourseIdsInPlan;
    private String imageUrl;
    private String imageUrlDetail;
    private String imageUrlJoined;
    private long joinTime;
    private long lastTrainTime;
    private long modifiedTime;
    private String name;
    private long planId;
    private String ssoid;
    private int totalCalorie;
    private int totalDuration;
    private int trainDuration;
    private int trainType;
    private int type;

    public class a implements Parcelable.Creator<PullFitPlanRspBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullFitPlanRspBean createFromParcel(Parcel parcel) {
            return new PullFitPlanRspBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullFitPlanRspBean[] newArray(int i) {
            return new PullFitPlanRspBean[i];
        }
    }

    public PullFitPlanRspBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public String getCourseIds() {
        return this.courseIds;
    }

    public int getCourseNumber() {
        return this.courseNumber;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getFinishedCourseIdsInPlan() {
        return this.finishedCourseIdsInPlan;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getImageUrlDetail() {
        return this.imageUrlDetail;
    }

    public String getImageUrlJoined() {
        return this.imageUrlJoined;
    }

    public long getJoinTime() {
        return this.joinTime;
    }

    public long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getName() {
        return this.name;
    }

    public long getPlanId() {
        return this.planId;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public int getTotalCalorie() {
        return this.totalCalorie;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public int getTrainDuration() {
        return this.trainDuration;
    }

    public int getTrainType() {
        return this.trainType;
    }

    public int getType() {
        return this.type;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseIds(String str) {
        this.courseIds = str;
    }

    public void setCourseNumber(int i) {
        this.courseNumber = i;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setFinishedCourseIdsInPlan(String str) {
        this.finishedCourseIdsInPlan = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setImageUrlDetail(String str) {
        this.imageUrlDetail = str;
    }

    public void setImageUrlJoined(String str) {
        this.imageUrlJoined = str;
    }

    public void setJoinTime(long j2) {
        this.joinTime = j2;
    }

    public void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPlanId(long j2) {
        this.planId = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTotalCalorie(int i) {
        this.totalCalorie = i;
    }

    public void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public void setTrainDuration(int i) {
        this.trainDuration = i;
    }

    public void setTrainType(int i) {
        this.trainType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.lastTrainTime);
        parcel.writeString(this.finishedCourseIdsInPlan);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.totalCalorie);
        parcel.writeLong(this.planId);
        parcel.writeLong(this.modifiedTime);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.name);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageUrlDetail);
        parcel.writeString(this.imageUrlJoined);
        parcel.writeInt(this.calorie);
        parcel.writeInt(this.trainDuration);
        parcel.writeInt(this.trainType);
        parcel.writeInt(this.type);
        parcel.writeString(this.courseIds);
        parcel.writeInt(this.courseNumber);
        parcel.writeLong(this.joinTime);
    }

    public PullFitPlanRspBean(Parcel parcel) {
        this.lastTrainTime = parcel.readLong();
        this.finishedCourseIdsInPlan = parcel.readString();
        this.totalDuration = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.planId = parcel.readLong();
        this.modifiedTime = parcel.readLong();
        this.ssoid = parcel.readString();
        this.name = parcel.readString();
        this.difficultyLevel = parcel.readInt();
        this.imageUrl = parcel.readString();
        this.imageUrlDetail = parcel.readString();
        this.imageUrlJoined = parcel.readString();
        this.calorie = parcel.readInt();
        this.trainDuration = parcel.readInt();
        this.trainType = parcel.readInt();
        this.type = parcel.readInt();
        this.courseIds = parcel.readString();
        this.courseNumber = parcel.readInt();
        this.joinTime = parcel.readLong();
    }
}
