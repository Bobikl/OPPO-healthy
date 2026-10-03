package com.heytap.health.operation.courses.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class CourseListBean {
    private int calorie;
    private String courseCode;
    private String courseIcon;
    private int courseSource;
    private int difficultyLevel;
    private String fee;
    private int finishNumber;
    private String forPeople;
    private int itemType = 0;
    private int joinState;
    private long lastTrainTime;
    private String name;
    private String summary;
    private int trainDuration;
    private List<Integer> trainParts;
    private List<Integer> trainTargets;
    private int trainType;

    public int getCalorie() {
        return this.calorie;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseIcon() {
        return this.courseIcon;
    }

    public int getCourseSource() {
        return this.courseSource;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public String getFee() {
        return this.fee;
    }

    public int getFinishNumber() {
        return this.finishNumber;
    }

    public String getForPeople() {
        return this.forPeople;
    }

    public int getItemType() {
        return this.itemType;
    }

    public int getJoinState() {
        return this.joinState;
    }

    public long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public String getName() {
        return this.name;
    }

    public String getSummary() {
        return this.summary;
    }

    public int getTrainDuration() {
        return this.trainDuration;
    }

    public List<Integer> getTrainParts() {
        return this.trainParts;
    }

    public List<Integer> getTrainTargets() {
        return this.trainTargets;
    }

    public int getTrainType() {
        return this.trainType;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseCode(String str) {
        this.courseCode = str;
    }

    public void setCourseIcon(String str) {
        this.courseIcon = str;
    }

    public void setCourseSource(int i) {
        this.courseSource = i;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setFee(String str) {
        this.fee = str;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public void setForPeople(String str) {
        this.forPeople = str;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setJoinState(int i) {
        this.joinState = i;
    }

    public void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTrainDuration(int i) {
        this.trainDuration = i;
    }

    public void setTrainParts(List<Integer> list) {
        this.trainParts = list;
    }

    public void setTrainTargets(List<Integer> list) {
        this.trainTargets = list;
    }

    public void setTrainType(int i) {
        this.trainType = i;
    }

    public String toString() {
        return "CourseListBean{courseCode='" + this.courseCode + "', name='" + this.name + "', calorie=" + this.calorie + ", trainDuration=" + this.trainDuration + ", difficultyLevel=" + this.difficultyLevel + ", trainType=" + this.trainType + ", summary='" + this.summary + "', forPeople='" + this.forPeople + "', courseSource=" + this.courseSource + ", courseIcon='" + this.courseIcon + "', fee='" + this.fee + "', joinState=" + this.joinState + ", finishNumber=" + this.finishNumber + ", lastTrainTime=" + this.lastTrainTime + ", trainParts=" + this.trainParts + ", trainTargets=" + this.trainTargets + '}';
    }
}
