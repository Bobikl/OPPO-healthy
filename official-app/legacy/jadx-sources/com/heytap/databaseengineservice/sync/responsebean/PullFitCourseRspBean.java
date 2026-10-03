package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullFitCourseRspBean implements Parcelable {
    public static final Parcelable.Creator<PullFitCourseRspBean> CREATOR = new a();
    private int actionNumber;
    private int calorie;
    private long courseId;
    private int difficultyLevel;
    private int finishNumber;
    private String imageUrlRecord;
    private String imageUrlShare;
    private String imageUrlThumb;
    private long joinTime;
    private long lastTrainTime;
    private long modifiedTime;
    private String name;
    private String ssoid;
    private int totalCalorie;
    private int totalDuration;
    private int trainDuration;
    private int trainType;
    private int type;

    public class a implements Parcelable.Creator<PullFitCourseRspBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullFitCourseRspBean createFromParcel(Parcel parcel) {
            return new PullFitCourseRspBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullFitCourseRspBean[] newArray(int i) {
            return new PullFitCourseRspBean[i];
        }
    }

    public PullFitCourseRspBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActionNumber() {
        return this.actionNumber;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public int getFinishNumber() {
        return this.finishNumber;
    }

    public String getImageUrlRecord() {
        return this.imageUrlRecord;
    }

    public String getImageUrlShare() {
        return this.imageUrlShare;
    }

    public String getImageUrlThumb() {
        return this.imageUrlThumb;
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

    public void setActionNumber(int i) {
        this.actionNumber = i;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseId(long j2) {
        this.courseId = j2;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public void setImageUrlRecord(String str) {
        this.imageUrlRecord = str;
    }

    public void setImageUrlShare(String str) {
        this.imageUrlShare = str;
    }

    public void setImageUrlThumb(String str) {
        this.imageUrlThumb = str;
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
        parcel.writeInt(this.finishNumber);
        parcel.writeLong(this.courseId);
        parcel.writeInt(this.type);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.totalCalorie);
        parcel.writeLong(this.modifiedTime);
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.trainDuration);
        parcel.writeString(this.name);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeString(this.imageUrlRecord);
        parcel.writeString(this.imageUrlShare);
        parcel.writeInt(this.calorie);
        parcel.writeInt(this.trainType);
        parcel.writeInt(this.actionNumber);
        parcel.writeLong(this.joinTime);
    }

    public PullFitCourseRspBean(Parcel parcel) {
        this.lastTrainTime = parcel.readLong();
        this.finishNumber = parcel.readInt();
        this.courseId = parcel.readLong();
        this.type = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.modifiedTime = parcel.readLong();
        this.ssoid = parcel.readString();
        this.trainDuration = parcel.readInt();
        this.name = parcel.readString();
        this.difficultyLevel = parcel.readInt();
        this.imageUrlThumb = parcel.readString();
        this.imageUrlRecord = parcel.readString();
        this.imageUrlShare = parcel.readString();
        this.calorie = parcel.readInt();
        this.trainType = parcel.readInt();
        this.actionNumber = parcel.readInt();
        this.joinTime = parcel.readLong();
    }
}
