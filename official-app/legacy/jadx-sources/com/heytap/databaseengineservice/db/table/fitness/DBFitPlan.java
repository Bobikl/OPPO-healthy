package com.heytap.databaseengineservice.db.table.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBFitPlan")
@Keep
public class DBFitPlan extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBFitPlan> CREATOR = new a();

    @ColumnInfo(name = "difficulty_level")
    private int difficultyLevel;

    @ColumnInfo(name = "finished_course")
    private String finishedCourse;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long id;

    @ColumnInfo(name = "image_url_detail")
    private String imageUrlDetail;

    @ColumnInfo(name = "image_url_joined")
    private String imageUrlJoined;

    @ColumnInfo(name = "image_url_list")
    private String imageUrlList;

    @ColumnInfo(name = "join_time")
    private long joinTime;

    @ColumnInfo(name = "last_train_time")
    private long lastTrainTime;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "number")
    private int number;

    @ColumnInfo(name = "plan_detail")
    private String planDetail;

    @ColumnInfo(name = DBHealthReviewPlan.PLAN_ID)
    private String planId;

    @ColumnInfo(name = "plan_name")
    private String planName;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "theory_calorie")
    private int theoryCalorie;

    @ColumnInfo(name = "theory_duration")
    private int theoryDuration;

    @ColumnInfo(name = "total_calorie")
    private int totalCalorie;

    @ColumnInfo(name = DBSunshineStat.TOTAL_DURATION)
    private int totalDuration;

    @ColumnInfo(name = "train_type")
    private int trainType;

    @ColumnInfo(name = "update_time")
    private long updateTime;

    public class a implements Parcelable.Creator<DBFitPlan> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFitPlan createFromParcel(Parcel parcel) {
            return new DBFitPlan(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFitPlan[] newArray(int i) {
            return new DBFitPlan[i];
        }
    }

    public DBFitPlan() {
    }

    public static String createFitPlanTableSQL() {
        return "create table if not exists DBFitPlan(_id INTEGER primary key autoincrement not null,ssoid TEXT,plan_id TEXT,plan_name TEXT,plan_detail TEXT,last_train_time INTEGER not null,number INTEGER not null,train_type INTEGER not null,finished_course TEXT,total_calorie INTEGER not null,difficulty_level INTEGER not null,theory_calorie INTEGER not null,total_duration INTEGER not null,theory_duration INTEGER not null,image_url_detail TEXT,image_url_list TEXT,image_url_joined TEXT,join_time INTEGER not null,update_time INTEGER not null,modified_time INTEGER not null,sync_status INTEGER not null)";
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

    public long getId() {
        return this.id;
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

    public long getModifiedTime() {
        return this.modifiedTime;
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

    public int getSyncStatus() {
        return this.syncStatus;
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

    public void setId(long j2) {
        this.id = j2;
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

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
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

    public void setSyncStatus(int i) {
        this.syncStatus = i;
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
        return "DBFitPlan{id=" + this.id + ", ssoid='" + this.ssoid + "', planId='" + this.planId + "', planName='" + this.planName + "', planDetail='" + this.planDetail + "', lastTrainTime=" + this.lastTrainTime + ", number=" + this.number + ", trainType=" + this.trainType + ", finishedCourse='" + this.finishedCourse + "', totalCalorie=" + this.totalCalorie + ", difficultyLevel=" + this.difficultyLevel + ", theoryCalorie=" + this.theoryCalorie + ", totalDuration=" + this.totalDuration + ", theoryDuration=" + this.theoryDuration + ", imageUrlDetail='" + this.imageUrlDetail + "', imageUrlList='" + this.imageUrlList + "', imageUrlJoined='" + this.imageUrlJoined + "', joinTime=" + this.joinTime + ", updateTime=" + this.updateTime + ", modifiedTime=" + this.modifiedTime + ", syncStatus=" + this.syncStatus + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
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
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.syncStatus);
    }

    public DBFitPlan(Parcel parcel) {
        this.id = parcel.readLong();
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
        this.modifiedTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
    }
}
