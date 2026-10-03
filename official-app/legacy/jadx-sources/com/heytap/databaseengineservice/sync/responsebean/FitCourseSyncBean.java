package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FitCourseSyncBean implements Parcelable {
    public static final Parcelable.Creator<FitCourseSyncBean> CREATOR = new a();
    private String courseCode;
    private Long courseId;
    private String courseName;
    private int courseSource;
    private String extension;
    private int finishNumber;
    private long lastTrainTime;
    private int totalCalorie;
    private int totalDuration;

    public class a implements Parcelable.Creator<FitCourseSyncBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitCourseSyncBean createFromParcel(Parcel parcel) {
            return new FitCourseSyncBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FitCourseSyncBean[] newArray(int i) {
            return new FitCourseSyncBean[i];
        }
    }

    public FitCourseSyncBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public long getCourseId() {
        return this.courseId.longValue();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getCourseSource() {
        return this.courseSource;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getFinishNumber() {
        return this.finishNumber;
    }

    public long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public int getTotalCalorie() {
        return this.totalCalorie;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }

    public void setCourseCode(String str) {
        this.courseCode = str;
    }

    public void setCourseId(long j2) {
        this.courseId = Long.valueOf(j2);
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setCourseSource(int i) {
        this.courseSource = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public void setTotalCalorie(int i) {
        this.totalCalorie = i;
    }

    public void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.courseId.longValue());
        parcel.writeString(this.courseName);
        parcel.writeLong(this.lastTrainTime);
        parcel.writeInt(this.finishNumber);
        parcel.writeInt(this.totalCalorie);
        parcel.writeInt(this.totalDuration);
        parcel.writeString(this.courseCode);
        parcel.writeInt(this.courseSource);
        parcel.writeString(this.extension);
    }

    public FitCourseSyncBean(Parcel parcel) {
        this.courseId = Long.valueOf(parcel.readLong());
        this.courseName = parcel.readString();
        this.lastTrainTime = parcel.readLong();
        this.finishNumber = parcel.readInt();
        this.totalCalorie = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.courseCode = parcel.readString();
        this.courseSource = parcel.readInt();
        this.extension = parcel.readString();
    }

    public void setCourseId(Long l2) {
        this.courseId = l2;
    }
}
