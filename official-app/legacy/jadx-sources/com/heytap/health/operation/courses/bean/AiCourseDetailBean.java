package com.heytap.health.operation.courses.bean;

import androidx.annotation.Keep;
import com.heytap.health.operations.bean.StageBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class AiCourseDetailBean {
    private List<StageBean> actions;
    private int calorie;
    private String courseCode;
    private String courseImage;
    private long createTime;
    private String description;
    private int difficultyLevel;
    private int duration;
    private List<String> evaluationItems;
    private String level;
    private String levelName;
    private String name;
    private String schemeDate;
    private String schemeType;
    private SdkDisplayInfoBean sdkDisplayInfo;
    private String suitableCrowd;
    private String summaryDescription;
    private String taboo;
    private float videoSize;

    public int getCalorie() {
        return this.calorie;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseImage() {
        return this.courseImage;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public int getDuration() {
        return this.duration;
    }

    public List<String> getEvaluationItems() {
        return this.evaluationItems;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public String getName() {
        return this.name;
    }

    public String getSchemeDate() {
        return this.schemeDate;
    }

    public String getSchemeType() {
        return this.schemeType;
    }

    public SdkDisplayInfoBean getSdkDisplayInfo() {
        return this.sdkDisplayInfo;
    }

    public List<StageBean> getStages() {
        return this.actions;
    }

    public String getSuitableCrowd() {
        return this.suitableCrowd;
    }

    public String getSummaryDescription() {
        return this.summaryDescription;
    }

    public String getTaboo() {
        return this.taboo;
    }

    public float getVideoSize() {
        return this.videoSize;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseCode(String str) {
        this.courseCode = str;
    }

    public void setCourseImage(String str) {
        this.courseImage = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEvaluationItems(List<String> list) {
        this.evaluationItems = list;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevelName(String str) {
        this.levelName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSchemeDate(String str) {
        this.schemeDate = str;
    }

    public void setSchemeType(String str) {
        this.schemeType = str;
    }

    public void setSdkDisplayInfo(SdkDisplayInfoBean sdkDisplayInfoBean) {
        this.sdkDisplayInfo = sdkDisplayInfoBean;
    }

    public void setStages(List<StageBean> list) {
        this.actions = list;
    }

    public void setSuitableCrowd(String str) {
        this.suitableCrowd = str;
    }

    public void setSummaryDescription(String str) {
        this.summaryDescription = str;
    }

    public void setTaboo(String str) {
        this.taboo = str;
    }

    public void setVideoSize(float f) {
        this.videoSize = f;
    }
}
