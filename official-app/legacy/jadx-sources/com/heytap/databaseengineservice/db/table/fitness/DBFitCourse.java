package com.heytap.databaseengineservice.db.table.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBFitCourse")
@Keep
public class DBFitCourse extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBFitCourse> CREATOR = new a();

    @ColumnInfo(name = "course_detail")
    private String courseDetail;

    @ColumnInfo(name = "course_id")
    private String courseId;

    @ColumnInfo(name = Element.ELEMENT_NAME_COURSE_NAME)
    private String courseName;

    @ColumnInfo(name = "difficulty_level")
    private int difficultyLevel;

    @ColumnInfo(name = "finish_number")
    private int finishNumber;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long id;

    @ColumnInfo(name = "image_url_record")
    private String imageUrlRecord;

    @ColumnInfo(name = "image_url_share")
    private String imageUrlShare;

    @ColumnInfo(name = "image_url_thumb")
    private String imageUrlThumb;

    @ColumnInfo(name = "join_time")
    private long joinTime;

    @ColumnInfo(name = "last_train_time")
    private long lastTrainTime;

    @ColumnInfo(name = "modified_time")
    private long modifiedTime;

    @ColumnInfo(name = "number")
    private int number;

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

    @ColumnInfo(name = "type")
    private int type;

    public class a implements Parcelable.Creator<DBFitCourse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBFitCourse createFromParcel(Parcel parcel) {
            return new DBFitCourse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBFitCourse[] newArray(int i) {
            return new DBFitCourse[i];
        }
    }

    public DBFitCourse() {
    }

    public static String createFitCourseTableSQL() {
        return "create table if not exists DBFitCourse(_id INTEGER primary key autoincrement not null,ssoid TEXT,course_id TEXT,course_name TEXT,course_detail TEXT,last_train_time INTEGER not null,type INTEGER not null,finish_number INTEGER not null,number INTEGER not null,train_type INTEGER not null,total_calorie INTEGER not null,difficulty_level INTEGER not null,theory_calorie INTEGER not null,total_duration INTEGER not null,theory_duration INTEGER not null,image_url_share TEXT,image_url_thumb TEXT,image_url_record TEXT,join_time INTEGER not null,modified_time INTEGER not null,sync_status INTEGER not null)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCourseDetail() {
        return this.courseDetail;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public int getFinishNumber() {
        return this.finishNumber;
    }

    public long getId() {
        return this.id;
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

    public int getNumber() {
        return this.number;
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

    public int getType() {
        return this.type;
    }

    public void setCourseDetail(String str) {
        this.courseDetail = str;
    }

    public void setCourseId(String str) {
        this.courseId = str;
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public void setId(long j2) {
        this.id = j2;
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

    public void setNumber(int i) {
        this.number = i;
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

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBFitCourse{id=" + this.id + ", ssoid='" + this.ssoid + "', courseId='" + this.courseId + "', courseName='" + this.courseName + "', courseDetail='" + this.courseDetail + "', lastTrainTime=" + this.lastTrainTime + ", type=" + this.type + ", finishNumber=" + this.finishNumber + ", number=" + this.number + ", trainType=" + this.trainType + ", totalCalorie=" + this.totalCalorie + ", difficultyLevel=" + this.difficultyLevel + ", theoryCalorie=" + this.theoryCalorie + ", totalDuration=" + this.totalDuration + ", theoryDuration=" + this.theoryDuration + ", imageUrlShare='" + this.imageUrlShare + "', imageUrlThumb='" + this.imageUrlThumb + "', imageUrlRecord='" + this.imageUrlRecord + "', joinTime=" + this.joinTime + ", modifiedTime=" + this.modifiedTime + ", syncStatus=" + this.syncStatus + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.courseId);
        parcel.writeString(this.courseName);
        parcel.writeString(this.courseDetail);
        parcel.writeLong(this.lastTrainTime);
        parcel.writeInt(this.type);
        parcel.writeInt(this.finishNumber);
        parcel.writeInt(this.number);
        parcel.writeInt(this.trainType);
        parcel.writeInt(this.totalCalorie);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeInt(this.theoryCalorie);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.theoryDuration);
        parcel.writeString(this.imageUrlShare);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeString(this.imageUrlRecord);
        parcel.writeLong(this.joinTime);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.syncStatus);
    }

    public DBFitCourse(Parcel parcel) {
        this.id = parcel.readLong();
        this.ssoid = parcel.readString();
        this.courseId = parcel.readString();
        this.courseName = parcel.readString();
        this.courseDetail = parcel.readString();
        this.lastTrainTime = parcel.readLong();
        this.type = parcel.readInt();
        this.finishNumber = parcel.readInt();
        this.number = parcel.readInt();
        this.trainType = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.difficultyLevel = parcel.readInt();
        this.theoryCalorie = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.theoryDuration = parcel.readInt();
        this.imageUrlShare = parcel.readString();
        this.imageUrlThumb = parcel.readString();
        this.imageUrlRecord = parcel.readString();
        this.joinTime = parcel.readLong();
        this.modifiedTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
    }
}
