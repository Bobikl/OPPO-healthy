package com.heytap.health.step.card.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.x05;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepCardDetailsBean implements Cloneable {
    private String backgroundImage;
    private long[] checkInDates;
    private int checkInType;
    private int continuousTimes;
    private String darkModeBackground;
    private long firstCheckinDate;
    private int maxContinuousTimes;
    private String queryMonth;
    private long recentlyCheckInDate;
    private float totalDistance;
    private int totalSteps;
    private int totalTimes;

    private String getArrLog(long[] jArr) {
        if (jArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (long j2 : jArr) {
            sb.append(x05.a(j2, "yyyy-MM-dd"));
            sb.append(",");
        }
        return sb.toString();
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public long[] getCheckInDates() {
        return this.checkInDates;
    }

    public int getCheckInType() {
        return this.checkInType;
    }

    public int getContinuousTimes() {
        return this.continuousTimes;
    }

    public String getDarkModeBackground() {
        return this.darkModeBackground;
    }

    public long getFirstCheckinDate() {
        return this.firstCheckinDate;
    }

    public int getMaxContinuousTimes() {
        return this.maxContinuousTimes;
    }

    public String getQueryMonth() {
        return this.queryMonth;
    }

    public long getRecentlyCheckInDate() {
        return this.recentlyCheckInDate;
    }

    public float getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public int getTotalTimes() {
        return this.totalTimes;
    }

    public void setBackgroundImage(String str) {
        this.backgroundImage = str;
    }

    public void setCheckInDates(long[] jArr) {
        this.checkInDates = jArr;
    }

    public void setCheckInType(int i) {
        this.checkInType = i;
    }

    public void setContinuousTimes(int i) {
        this.continuousTimes = i;
    }

    public void setDarkModeBackground(String str) {
        this.darkModeBackground = str;
    }

    public void setFirstCheckinDate(long j2) {
        this.firstCheckinDate = j2;
    }

    public void setMaxContinuousTimes(int i) {
        this.maxContinuousTimes = i;
    }

    public void setQueryMonth(String str) {
        this.queryMonth = str;
    }

    public void setRecentlyCheckInDate(long j2) {
        this.recentlyCheckInDate = j2;
    }

    public void setTotalDistance(float f) {
        this.totalDistance = f;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalTimes(int i) {
        this.totalTimes = i;
    }

    @NonNull
    public String toString() {
        return "StepCardDetailsBean start:checkInType:" + this.checkInType + ",continuousTimes:" + this.continuousTimes + ",maxContinuousTimes:" + this.maxContinuousTimes + ",totalTimes:" + this.totalTimes + ",firstCheckinDate:" + this.firstCheckinDate + ",recentlyCheckInDate:" + this.recentlyCheckInDate + ",totalSteps:" + this.totalSteps + ",totalDistance:" + this.totalDistance + ",checkInDates:" + getArrLog(this.checkInDates) + ",backgroundImage:" + this.backgroundImage + ",darkModeBackground:" + this.darkModeBackground;
    }
}
