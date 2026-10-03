package com.heytap.databaseengineservice.db.table.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", "course_id"}, tableName = "DBThirdPartFitCourse")
@Keep
public class DBThirdPartFitCourse extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBThirdPartFitCourse> CREATOR = new a();

    @Nullable
    @ColumnInfo(name = "course_detail")
    private String courseDetail;

    @NonNull
    @ColumnInfo(name = "course_id")
    private String courseId;

    @ColumnInfo(name = Element.ELEMENT_NAME_COURSE_NAME)
    private String courseName;

    @ColumnInfo(name = "course_source")
    private int courseSource;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = "deleted_timestamp")
    private long deletedTimestamp;

    @ColumnInfo(name = "difficulty_level")
    private int difficultyLevel;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "finish_number")
    private int finishNumber;

    @ColumnInfo(name = "image_url_thumb")
    private String imageUrlThumb;

    @ColumnInfo(name = "join_time")
    private long joinTime;

    @ColumnInfo(name = "last_train_time")
    private long lastTrainTime;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTime;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @NonNull
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

    public class a implements Parcelable.Creator<DBThirdPartFitCourse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBThirdPartFitCourse createFromParcel(Parcel parcel) {
            return new DBThirdPartFitCourse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBThirdPartFitCourse[] newArray(int i) {
            return new DBThirdPartFitCourse[i];
        }
    }

    public DBThirdPartFitCourse() {
        this.ssoid = "";
        this.courseId = "";
    }

    public static String createThirdPartFitCourseTableSQL() {
        return "create table if not exists DBThirdPartFitCourse(ssoid TEXT not null,course_id TEXT not null,course_source INTEGER not null,course_name TEXT,course_detail TEXT,total_duration INTEGER not null,total_calorie INTEGER not null,deleted INTEGER not null,deleted_timestamp INTEGER not null,last_train_time INTEGER not null,finish_number INTEGER not null,sport_mode INTEGER not null,difficulty_level INTEGER not null,theory_calorie INTEGER not null,theory_duration INTEGER not null,image_url_thumb TEXT,extension TEXT,join_time INTEGER not null,modified_timestamp INTEGER not null,sync_status INTEGER not null,primary key(ssoid,course_id))";
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

    public int getCourseSource() {
        return this.courseSource;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public long getDeletedTimestamp() {
        return this.deletedTimestamp;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getFinishNumber() {
        return this.finishNumber;
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

    public int getSportMode() {
        return this.sportMode;
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

    public void setCourseDetail(String str) {
        this.courseDetail = str;
    }

    public void setCourseId(String str) {
        this.courseId = str;
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setCourseSource(int i) {
        this.courseSource = i;
    }

    public void setDeleted(int i) {
        this.deleted = i;
    }

    public void setDeletedTimestamp(long j2) {
        this.deletedTimestamp = j2;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
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

    public void setSportMode(int i) {
        this.sportMode = i;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBThirdPartFitCourse{ssoid='" + this.ssoid + "', courseId='" + this.courseId + "', courseSource=" + this.courseSource + ", courseName='" + this.courseName + "', courseDetail='" + this.courseDetail + "', totalDuration=" + this.totalDuration + ", totalCalorie=" + this.totalCalorie + ", deleted=" + this.deleted + ", deletedTimestamp=" + this.deletedTimestamp + ", lastTrainTime=" + this.lastTrainTime + ", finishNumber=" + this.finishNumber + ", sportMode=" + this.sportMode + ", difficultyLevel=" + this.difficultyLevel + ", theoryCalorie=" + this.theoryCalorie + ", theoryDuration=" + this.theoryDuration + ", imageUrlThumb='" + this.imageUrlThumb + "', extension='" + this.extension + "', joinTime=" + this.joinTime + ", modifiedTime=" + this.modifiedTime + ", syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.courseId);
        parcel.writeInt(this.courseSource);
        parcel.writeString(this.courseName);
        parcel.writeString(this.courseDetail);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.totalCalorie);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.deletedTimestamp);
        parcel.writeLong(this.lastTrainTime);
        parcel.writeInt(this.finishNumber);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeInt(this.theoryCalorie);
        parcel.writeInt(this.theoryDuration);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeString(this.extension);
        parcel.writeLong(this.joinTime);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.syncStatus);
    }

    public DBThirdPartFitCourse(Parcel parcel) {
        this.ssoid = "";
        this.courseId = "";
        this.ssoid = parcel.readString();
        this.courseId = parcel.readString();
        this.courseSource = parcel.readInt();
        this.courseName = parcel.readString();
        this.courseDetail = parcel.readString();
        this.totalDuration = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.deleted = parcel.readInt();
        this.deletedTimestamp = parcel.readLong();
        this.lastTrainTime = parcel.readLong();
        this.finishNumber = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.difficultyLevel = parcel.readInt();
        this.theoryCalorie = parcel.readInt();
        this.theoryDuration = parcel.readInt();
        this.imageUrlThumb = parcel.readString();
        this.extension = parcel.readString();
        this.joinTime = parcel.readLong();
        this.modifiedTime = parcel.readLong();
        this.syncStatus = parcel.readInt();
    }
}
