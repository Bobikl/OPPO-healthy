package com.heytap.health.weekly;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WeeklyDetailBean {
    private int averageDailySteps;
    private int complianceDay;
    private double complianceIncomeRate;
    private int complianceTotalIncome;
    private Object description;
    private String endTime;
    private int farthestSportMode;
    private Object gpsData;
    private int longestDistance;
    private long longestDistanceDate;
    private String maxBonus;
    private int maxDaySteps;
    private int maxSportDuration;
    private int maxSteps;
    private Object medalList;
    private int redPacketNum;
    private Object sportList;
    private int sportNum;
    private String startTime;
    private int status;
    private TagBean tag;
    private String title;
    private int totalDuration;
    private double totalMileage;

    @Keep
    public static class TagBean {
        private Object depletionContent;
        private Object description;
        private Object mileageContent;
        private Object regionRank;

        public Object getDescription() {
            return this.description;
        }

        public void setDescription(Object obj) {
            this.description = obj;
        }
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTag(TagBean tagBean) {
        this.tag = tagBean;
    }
}
