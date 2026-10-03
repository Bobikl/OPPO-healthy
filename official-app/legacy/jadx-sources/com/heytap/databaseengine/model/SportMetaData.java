package com.heytap.databaseengine.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.gymstrengthtraining.GymStrengthTrainingExtra;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportMetaData extends TrackMetaData {
    private String courseId;
    private String courseName;
    private int dataSource;
    private int difficultyLevel;
    private int exerciseLoad;
    private String extra;
    private int fatigue;
    private int finishNumber;
    private int fitSourceType;

    @SerializedName("gymTrainingExtra")
    private GymStrengthTrainingExtra gymStrengthTrainingExtra;
    private String imageUrlRecord;
    private String imageUrlShare;
    private String imageUrlThumb;
    private String lstActions;
    private int physicalFitness;
    private String planId;
    private String subType;
    private String subTypeName;
    private int theoryCalorie;
    private int theoryDuration;
    private int trainedActNum;
    private int trainedCalorie;
    private int trainedDuration;

    @SerializedName("vo2MaxExtra")
    private Vo2MaxExtra vo2MaxExtra;

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public int getAvgHeartRate() {
        return super.getAvgHeartRate();
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        String sportName = super.getSportName();
        return TextUtils.isEmpty(sportName) ? this.courseName : sportName;
    }

    public int getDataSource() {
        return this.dataSource;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public int getExerciseLoad() {
        return this.exerciseLoad;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFatigue() {
        return this.fatigue;
    }

    public int getFinishNumber() {
        long totalSteps = super.getTotalSteps();
        return totalSteps > 0 ? (int) totalSteps : this.finishNumber;
    }

    public int getFitSourceType() {
        return this.fitSourceType;
    }

    public GymStrengthTrainingExtra getGymStrengthTrainingExtra() {
        return this.gymStrengthTrainingExtra;
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

    public String getLstActions() {
        return this.lstActions;
    }

    public int getPhysicalFitness() {
        return this.physicalFitness;
    }

    public String getPlanId() {
        return this.planId;
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public String getRunExtra() {
        return super.getRunExtra();
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public String getSportName() {
        return getCourseName();
    }

    public String getSubType() {
        return this.subType;
    }

    public String getSubTypeName() {
        return this.subTypeName;
    }

    public int getTheoryCalorie() {
        return this.theoryCalorie;
    }

    public int getTheoryDuration() {
        return this.theoryDuration;
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public long getTotalCalories() {
        long totalCalories = super.getTotalCalories();
        return totalCalories > 0 ? totalCalories : getTrainedCalorie();
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public int getTotalSteps() {
        return getFinishNumber();
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public long getTotalTime() {
        long totalTime = super.getTotalTime();
        return totalTime > 0 ? totalTime : this.trainedDuration;
    }

    public int getTrainedActNum() {
        return this.trainedActNum;
    }

    public int getTrainedCalorie() {
        return this.trainedCalorie;
    }

    public int getTrainedDuration() {
        return this.trainedDuration;
    }

    public Vo2MaxExtra getVo2MaxExtra() {
        return this.vo2MaxExtra;
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public void setAvgHeartRate(int i) {
        super.setAvgHeartRate(i);
    }

    public void setCourseId(String str) {
        this.courseId = str;
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setDataSource(int i) {
        this.dataSource = i;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setExerciseLoad(int i) {
        this.exerciseLoad = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFatigue(int i) {
        this.fatigue = i;
    }

    public void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public void setFitSourceType(int i) {
        this.fitSourceType = i;
    }

    public void setGymStrengthTrainingExtra(GymStrengthTrainingExtra gymStrengthTrainingExtra) {
        this.gymStrengthTrainingExtra = gymStrengthTrainingExtra;
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

    public void setLstActions(String str) {
        this.lstActions = str;
    }

    public void setPhysicalFitness(int i) {
        this.physicalFitness = i;
    }

    public void setPlanId(String str) {
        this.planId = str;
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public void setRunExtra(String str) {
        super.setRunExtra(str);
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setSubTypeName(String str) {
        this.subTypeName = str;
    }

    public void setTheoryCalorie(int i) {
        this.theoryCalorie = i;
    }

    public void setTheoryDuration(int i) {
        this.theoryDuration = i;
    }

    public void setTrainedActNum(int i) {
        this.trainedActNum = i;
    }

    public void setTrainedCalorie(int i) {
        this.trainedCalorie = i;
    }

    public void setTrainedDuration(int i) {
        this.trainedDuration = i;
    }

    public void setVo2MaxExtra(Vo2MaxExtra vo2MaxExtra) {
        this.vo2MaxExtra = vo2MaxExtra;
    }

    @Override // com.heytap.databaseengine.model.TrackMetaData
    public String toString() {
        return "SportMetaData{finishNumber=" + this.finishNumber + ", courseName='" + this.courseName + "', courseId='" + this.courseId + "', planId='" + this.planId + "', fitSourceType=" + this.fitSourceType + ", trainedDuration=" + this.trainedDuration + ", theoryDuration=" + this.theoryDuration + ", theoryCalorie=" + this.theoryCalorie + ", trainedCalorie=" + this.trainedCalorie + ", imageUrlShare='" + this.imageUrlShare + "', imageUrlThumb='" + this.imageUrlThumb + "', imageUrlRecord='" + this.imageUrlRecord + "', trainedActNum=" + this.trainedActNum + ", difficultyLevel=" + this.difficultyLevel + ", lstActions='" + this.lstActions + "', dataSource=" + this.dataSource + ", extra='" + this.extra + "', subType='" + this.subType + "', subTypeName='" + this.subTypeName + "', vo2MaxExtra=" + this.vo2MaxExtra + ", gymStrengthTrainingExtra=" + this.gymStrengthTrainingExtra + ", fatigue=" + this.fatigue + ", physicalFitness=" + this.physicalFitness + ", exerciseLoad=" + this.exerciseLoad + '}';
    }
}
