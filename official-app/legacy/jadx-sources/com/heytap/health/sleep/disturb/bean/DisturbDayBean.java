package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import com.oplus.aiunit.vision.mq8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DisturbDayBean extends HealthChartDayBean {
    private long currentDayEndTime;
    private long currentDayStartTime;
    private SleepMainData sleepMainData;
    private int style = 0;
    private List<DisturbBarData> dataList = new ArrayList();
    private final List<DisturbBarData> undueDataList = new ArrayList();
    private final List<RankItem> typeRankList = new ArrayList();
    private final List<RankItem> appRankList = new ArrayList();

    public List<RankItem> getAppRankList() {
        return this.appRankList;
    }

    public long getCurrentDayEndTime() {
        return this.currentDayEndTime;
    }

    public long getCurrentDayStartTime() {
        return this.currentDayStartTime;
    }

    public List<DisturbBarData> getDataList() {
        return this.dataList;
    }

    public SleepMainData getSleepMainData() {
        return this.sleepMainData;
    }

    public List<RankItem> getTypeRankList() {
        return this.typeRankList;
    }

    public List<DisturbBarData> getUndueDataList() {
        return this.undueDataList;
    }

    public void inertUndueData(long j2, long j3) {
        this.undueDataList.clear();
        this.undueDataList.add(new DisturbBarData(j2, new ArrayList()));
        this.undueDataList.add(new DisturbBarData(j3, new ArrayList()));
    }

    public void insertEmptyData(long j2, long j3) {
        this.dataList.clear();
        this.dataList.add(new DisturbBarData(j2, new ArrayList()));
        this.dataList.add(new DisturbBarData(j3, new ArrayList()));
    }

    public boolean isUndue() {
        return this.style == 1;
    }

    public void setAppRankList(List<RankItem> list) {
        this.appRankList.addAll(list);
    }

    public void setCurrentDayStartTime(long j2) {
        this.currentDayStartTime = j2;
        this.currentDayEndTime = mq8.INSTANCE.b(j2);
    }

    public void setDataList(List<DisturbBarData> list) {
        this.dataList = list;
    }

    public void setSleepMainData(SleepMainData sleepMainData) {
        this.sleepMainData = sleepMainData;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setTypeRankList(List<RankItem> list) {
        this.typeRankList.addAll(list);
    }

    @NonNull
    public String toString() {
        return "DisturbDayBean{style=" + this.style + ", currentDayStartTime=" + this.currentDayStartTime + ", dataList=" + this.dataList + ", undueDataList=" + this.undueDataList + ", typeRankList=" + this.typeRankList + ", appRankList=" + this.appRankList + '}';
    }
}
