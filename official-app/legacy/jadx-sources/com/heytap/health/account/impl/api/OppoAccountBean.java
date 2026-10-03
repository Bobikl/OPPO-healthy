package com.heytap.health.account.impl.api;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class OppoAccountBean {
    private String accountName;
    private String avatar;
    private String birthday;
    private int checkStatus;
    private String country;
    private long createTime;
    private int guideStatus;
    private String height;
    private String id;
    private String indoorRunGoalStr;
    private String runGoalStr;
    private String sex;
    private String ssoid;
    private String status;
    private int stepGoal;
    private String stepGoalStr;
    private int unit;
    private long updateTime;
    private boolean uploadAvatar;
    private String userName;
    private boolean userNameNeedModify;
    private String walkGoalStr;
    private String weight;
    private int weightGoal;
    private String weightGoalStr;

    public String getAccountName() {
        return this.accountName;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public int getCheckStatus() {
        return this.checkStatus;
    }

    public String getCountry() {
        return this.country;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getGuideStatus() {
        return this.guideStatus;
    }

    public String getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getIndoorRunGoalStr() {
        return this.indoorRunGoalStr;
    }

    public String getRunGoalStr() {
        return this.runGoalStr;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getStatus() {
        return this.status;
    }

    public int getStepGoal() {
        return this.stepGoal;
    }

    public String getStepGoalStr() {
        return this.stepGoalStr;
    }

    public int getUnit() {
        return this.unit;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getWalkGoalStr() {
        return this.walkGoalStr;
    }

    public String getWeight() {
        return this.weight;
    }

    public int getWeightGoal() {
        return this.weightGoal;
    }

    public String getWeightGoalStr() {
        return this.weightGoalStr;
    }

    public boolean isUploadAvatar() {
        return this.uploadAvatar;
    }

    public boolean isUserNameNeedModify() {
        return this.userNameNeedModify;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCheckStatus(int i) {
        this.checkStatus = i;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setGuideStatus(int i) {
        this.guideStatus = i;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIndoorRunGoalStr(String str) {
        this.indoorRunGoalStr = str;
    }

    public void setRunGoalStr(String str) {
        this.runGoalStr = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStepGoal(int i) {
        this.stepGoal = i;
    }

    public void setStepGoalStr(String str) {
        this.stepGoalStr = str;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public void setUploadAvatar(boolean z) {
        this.uploadAvatar = z;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setUserNameNeedModify(boolean z) {
        this.userNameNeedModify = z;
    }

    public void setWalkGoalStr(String str) {
        this.walkGoalStr = str;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public void setWeightGoal(int i) {
        this.weightGoal = i;
    }

    public void setWeightGoalStr(String str) {
        this.weightGoalStr = str;
    }

    public String toString() {
        return "BodyBean{id='" + this.id + "', ssoid='" + this.ssoid + "', userName='" + this.userName + "', accountName='" + this.accountName + "', userNameNeedModify=" + this.userNameNeedModify + ", country='" + this.country + "', status='" + this.status + "', birthday='" + this.birthday + "', sex='" + this.sex + "', uploadAvatar=" + this.uploadAvatar + ", avatar='" + this.avatar + "', height=" + this.height + "', weight=" + this.weight + "', stepGoalStr=" + this.stepGoalStr + ", weightGoalStr=" + this.weightGoalStr + ", runGoalStr=" + this.runGoalStr + ", walkGoalStr=" + this.walkGoalStr + ", indoorRunGoalStr=" + this.indoorRunGoalStr + ", stepGoal=" + this.stepGoal + ", weightGoal=" + this.weightGoal + ", unit=" + this.unit + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", checkStatus=" + this.checkStatus + ", guideStatus =" + this.guideStatus + '}';
    }
}
