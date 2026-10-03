package com.heytap.health.stress.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.oplus.aiunit.vision.axi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StressBean {
    private long chartStartTime;
    private boolean showEmptyChart;
    private List<StressDataStat> dataStatList = new ArrayList();
    private List<axi> candleDataList = new ArrayList();

    public long getChartStartTime() {
        return this.chartStartTime;
    }

    public List<StressDataStat> getDataStatList() {
        return this.dataStatList;
    }

    public List<axi> getStressCandleDataList() {
        return this.candleDataList;
    }

    public boolean isShowEmptyChart() {
        return this.showEmptyChart;
    }

    public void setChartStartTime(long j2) {
        this.chartStartTime = j2;
    }

    public void setDataStatList(List<StressDataStat> list) {
        this.dataStatList = list;
    }

    public void setShowEmptyChart(boolean z) {
        this.showEmptyChart = z;
    }

    public void setStressCandleDataList(List<axi> list) {
        this.candleDataList = list;
    }

    @NonNull
    public String toString() {
        return "StressBean{chartStartTime=" + this.chartStartTime + ", showEmptyChart=" + this.showEmptyChart + ", dataStatList=" + this.dataStatList + ", candleDataList=" + this.candleDataList + '}';
    }
}
