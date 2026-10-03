package com.heytap.databaseengine.model.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FitPlan extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<FitPlan> CREATOR = new a();
    private int difficultyLevel;
    private String finishedCourse;
    private String imageUrlDetail;
    private String imageUrlJoined;
    private String imageUrlList;
    private long joinTime;
    private long lastTrainTime;
    private int number;
    private String planDetail;
    private String planId;
    private String planName;
    private String ssoid;
    private int theoryCalorie;
    private int theoryDuration;
    private int totalCalorie;
    private int totalDuration;
    private int trainType;
    private long updateTime;

    public class a implements Parcelable.Creator<FitPlan> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitPlan createFromParcel(Parcel parcel) {
            return new FitPlan(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FitPlan[] newArray(int i) {
            return new FitPlan[i];
        }
    }

    public FitPlan() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getFinishedCourse() {
        return this.finishedCourse;
    }

    public String getImageUrlDetail() {
        return this.imageUrlDetail;
    }

    public String getImageUrlJoined() {
        return this.imageUrlJoined;
    }

    public String getImageUrlList() {
        return this.imageUrlList;
    }

    public long getJoinTime() {
        return this.joinTime;
    }

    public long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public int getNumber() {
        return this.number;
    }

    public String getPlanDetail() {
        return this.planDetail;
    }

    public String getPlanId() {
        return this.planId;
    }

    public String getPlanName() {
        return this.planName;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getTheoryCalorie() {
        return this.theoryCalorie;
    }

    public int getTheoryDuration() {
        return this.theoryDuration;
    }

    public int getTotalCalorie() {
        return this.totalCalorie;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public int getTrainType() {
        return this.trainType;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setFinishedCourse(String str) {
        this.finishedCourse = str;
    }

    public void setImageUrlDetail(String str) {
        this.imageUrlDetail = str;
    }

    public void setImageUrlJoined(String str) {
        this.imageUrlJoined = str;
    }

    public void setImageUrlList(String str) {
        this.imageUrlList = str;
    }

    public void setJoinTime(long j2) {
        this.joinTime = j2;
    }

    public void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public void setNumber(int i) {
        this.number = i;
    }

    public void setPlanDetail(String str) {
        this.planDetail = str;
    }

    public void setPlanId(String str) {
        this.planId = str;
    }

    public void setPlanName(String str) {
        this.planName = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTheoryCalorie(int i) {
        this.theoryCalorie = i;
    }

    public void setTheoryDuration(int i) {
        this.theoryDuration = i;
    }

    public void setTotalCalorie(int i) {
        this.totalCalorie = i;
    }

    public void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public void setTrainType(int i) {
        this.trainType = i;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "FitPlan{ssoid='" + this.ssoid + "', planId='" + this.planId + "', planName='" + this.planName + "', planDetail='" + this.planDetail + "', lastTrainTime=" + this.lastTrainTime + ", number=" + this.number + ", trainType=" + this.trainType + ", finishedCourse='" + this.finishedCourse + "', totalCalorie=" + this.totalCalorie + ", difficultyLevel=" + this.difficultyLevel + ", theoryCalorie=" + this.theoryCalorie + ", totalDuration=" + this.totalDuration + ", theoryDuration=" + this.theoryDuration + ", imageUrlDetail='" + this.imageUrlDetail + "', imageUrlList='" + this.imageUrlList + "', imageUrlJoined='" + this.imageUrlJoined + "', joinTime=" + this.joinTime + ", updateTime=" + this.updateTime + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.planId);
        parcel.writeString(this.planName);
        parcel.writeString(this.planDetail);
        parcel.writeLong(this.lastTrainTime);
        parcel.writeInt(this.number);
        parcel.writeInt(this.trainType);
        parcel.writeString(this.finishedCourse);
        parcel.writeInt(this.totalCalorie);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeInt(this.theoryCalorie);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.theoryDuration);
        parcel.writeString(this.imageUrlDetail);
        parcel.writeString(this.imageUrlList);
        parcel.writeString(this.imageUrlJoined);
        parcel.writeLong(this.joinTime);
        parcel.writeLong(this.updateTime);
    }

    public FitPlan(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.planId = parcel.readString();
        this.planName = parcel.readString();
        this.planDetail = parcel.readString();
        this.lastTrainTime = parcel.readLong();
        this.number = parcel.readInt();
        this.trainType = parcel.readInt();
        this.finishedCourse = parcel.readString();
        this.totalCalorie = parcel.readInt();
        this.difficultyLevel = parcel.readInt();
        this.theoryCalorie = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.theoryDuration = parcel.readInt();
        this.imageUrlDetail = parcel.readString();
        this.imageUrlList = parcel.readString();
        this.imageUrlJoined = parcel.readString();
        this.joinTime = parcel.readLong();
        this.updateTime = parcel.readLong();
    }
}
