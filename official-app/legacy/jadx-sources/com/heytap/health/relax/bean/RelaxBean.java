package com.heytap.health.relax.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.relax.RelaxStat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class RelaxBean {
    private long chartStartTime;
    private boolean showEmptyChart;
    private List<RelaxStat> relaxStatList = new ArrayList();
    private List<RelaxBarData> dataList = new ArrayList();

    public long getChartStartTime() {
        return this.chartStartTime;
    }

    public List<RelaxBarData> getDataList() {
        return this.dataList;
    }

    public List<RelaxStat> getRelaxStatList() {
        return this.relaxStatList;
    }

    public boolean isShowEmptyChart() {
        return this.showEmptyChart;
    }

    public void setChartStartTime(long j2) {
        this.chartStartTime = j2;
    }

    public void setDataList(List<RelaxBarData> list) {
        this.dataList = list;
    }

    public void setRelaxStatList(List<RelaxStat> list) {
        this.relaxStatList = list;
    }

    public void setShowEmptyChart(boolean z) {
        this.showEmptyChart = z;
    }

    @NonNull
    public String toString() {
        return "RelaxBean{chartStartTime=" + this.chartStartTime + ", showEmptyChart=" + this.showEmptyChart + ", relaxStatList=" + this.relaxStatList + ", dataList=" + this.dataList + '}';
    }
}
