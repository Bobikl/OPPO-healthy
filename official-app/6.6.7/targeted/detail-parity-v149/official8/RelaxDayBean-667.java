package com.heytap.health.relax.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.relax.RelaxStat;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class RelaxDayBean extends HealthChartDayBean {
    private long maxDuration;
    private long startTime;
    private int style = 0;
    private List<RelaxStat> itemList = new ArrayList();
    private List<RelaxBarData> dataList = new ArrayList();
    private final List<RelaxBarData> undueDataList = new ArrayList();

    public List<RelaxBarData> getDataList() {
        return this.dataList;
    }

    public List<RelaxStat> getItemList() {
        return this.itemList;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStyle() {
        return this.style;
    }

    public List<RelaxBarData> getUndueDataList() {
        return this.undueDataList;
    }

    public float getYMaxValue() {
        for (RelaxBarData relaxBarData : this.dataList) {
            if (this.maxDuration < relaxBarData.getTotalDuration()) {
                this.maxDuration = relaxBarData.getTotalDuration();
            }
        }
        return this.maxDuration / 3600.0f;
    }

    public void insertCurTimeEmptyData(long j2, long j3) {
        this.dataList.clear();
        this.dataList.add(new RelaxBarData(j2, 0L, 0L));
        this.dataList.add(new RelaxBarData(j3, 0L, 0L));
        this.curPageTimestamp = j2;
    }

    public void insertUndueDataList(long j2, long j3) {
        this.undueDataList.clear();
        this.undueDataList.add(new RelaxBarData(j2, 0L, 0L));
        this.undueDataList.add(new RelaxBarData(j3, 0L, 0L));
        this.curPageTimestamp = j2;
    }

    public boolean isEmptyData() {
        if (this.dataList.isEmpty()) {
            return true;
        }
        if (this.dataList.size() == 2) {
            return this.dataList.get(0).isEmptyData() && this.dataList.get(1).isEmptyData();
        }
        return false;
    }

    public boolean isUndue() {
        return this.style == 1;
    }

    public void setDataList(List<RelaxBarData> list) {
        this.dataList = list;
    }

    public void setItemList(List<RelaxStat> list) {
        this.itemList = list;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    @NonNull
    public String toString() {
        return "RelaxDayBean{style=" + this.style + ", startTime=" + this.startTime + ", itemList=" + this.itemList + ", dataList=" + this.dataList + ", undueDataList=" + this.undueDataList + ", maxDuration=" + this.maxDuration + '}';
    }
}