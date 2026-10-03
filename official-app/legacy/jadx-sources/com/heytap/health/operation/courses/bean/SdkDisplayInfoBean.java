package com.heytap.health.operation.courses.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class SdkDisplayInfoBean {
    private String arrangeDate;
    private int calorie;
    private String courseId;
    private String courseImage;
    private String courseName;
    private List<FilesBean> files;
    private String fitActionRecords;
    private String planId;
    private String sportCourse;
    private int trainDuration;
    private int videoSize;
    private String videoUrl;

    public String getArrangeDate() {
        return this.arrangeDate;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseImage() {
        return this.courseImage;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public List<FilesBean> getFiles() {
        return this.files;
    }

    public String getFitActionRecords() {
        return this.fitActionRecords;
    }

    public String getPlanId() {
        return this.planId;
    }

    public String getSportCourse() {
        return this.sportCourse;
    }

    public int getTrainDuration() {
        return this.trainDuration;
    }

    public int getVideoSize() {
        return this.videoSize;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setArrangeDate(String str) {
        this.arrangeDate = str;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseId(String str) {
        this.courseId = str;
    }

    public void setCourseImage(String str) {
        this.courseImage = str;
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setFiles(List<FilesBean> list) {
        this.files = list;
    }

    public void setFitActionRecords(String str) {
        this.fitActionRecords = str;
    }

    public void setPlanId(String str) {
        this.planId = str;
    }

    public void setSportCourse(String str) {
        this.sportCourse = str;
    }

    public void setTrainDuration(int i) {
        this.trainDuration = i;
    }

    public void setVideoSize(int i) {
        this.videoSize = i;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public String toString() {
        return "SdkDisplayInfoBean{sportCourse='" + this.sportCourse + "', files=" + this.files + '}';
    }
}
