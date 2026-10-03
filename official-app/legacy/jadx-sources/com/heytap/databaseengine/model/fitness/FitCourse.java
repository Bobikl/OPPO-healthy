package com.heytap.databaseengine.model.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FitCourse extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<FitCourse> CREATOR = new a();
    private String courseDetail;
    private String courseId;
    private String courseName;
    private int courseSource;
    private int difficultyLevel;
    private String extension;
    private int finishNumber;
    private String imageUrlRecord;
    private String imageUrlShare;
    private String imageUrlThumb;
    private long joinTime;
    private long lastTrainTime;
    private int number;
    private int sportMode;
    private String ssoid;
    private int theoryCalorie;
    private int theoryDuration;
    private int totalCalorie;
    private int totalDuration;

    public class a implements Parcelable.Creator<FitCourse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitCourse createFromParcel(Parcel parcel) {
            return new FitCourse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FitCourse[] newArray(int i) {
            return new FitCourse[i];
        }
    }

    public FitCourse() {
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

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getExtension() {
        return this.extension;
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

    public int getNumber() {
        return this.number;
    }

    public int getSportMode() {
        return this.sportMode;
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

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setExtension(String str) {
        this.extension = str;
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

    public void setNumber(int i) {
        this.number = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "FitCourse{ssoid='" + this.ssoid + "', courseId='" + this.courseId + "', courseSource=" + this.courseSource + ", courseName='" + this.courseName + "', courseDetail='" + this.courseDetail + "', totalDuration=" + this.totalDuration + ", totalCalorie=" + this.totalCalorie + ", lastTrainTime=" + this.lastTrainTime + ", finishNumber=" + this.finishNumber + ", number=" + this.number + ", sportMode=" + this.sportMode + ", difficultyLevel=" + this.difficultyLevel + ", theoryCalorie=" + this.theoryCalorie + ", theoryDuration=" + this.theoryDuration + ", imageUrlShare='" + this.imageUrlShare + "', imageUrlThumb='" + this.imageUrlThumb + "', imageUrlRecord='" + this.imageUrlRecord + "', extension='" + this.extension + "', joinTime=" + this.joinTime + '}';
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
        parcel.writeLong(this.lastTrainTime);
        parcel.writeInt(this.finishNumber);
        parcel.writeInt(this.number);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeInt(this.theoryCalorie);
        parcel.writeInt(this.theoryDuration);
        parcel.writeString(this.imageUrlShare);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeString(this.imageUrlRecord);
        parcel.writeString(this.extension);
        parcel.writeLong(this.joinTime);
    }

    public FitCourse(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.courseId = parcel.readString();
        this.courseSource = parcel.readInt();
        this.courseName = parcel.readString();
        this.courseDetail = parcel.readString();
        this.totalDuration = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.lastTrainTime = parcel.readLong();
        this.finishNumber = parcel.readInt();
        this.number = parcel.readInt();
        this.sportMode = parcel.readInt();
        this.difficultyLevel = parcel.readInt();
        this.theoryCalorie = parcel.readInt();
        this.theoryDuration = parcel.readInt();
        this.imageUrlShare = parcel.readString();
        this.imageUrlThumb = parcel.readString();
        this.imageUrlRecord = parcel.readString();
        this.extension = parcel.readString();
        this.joinTime = parcel.readLong();
    }
}
