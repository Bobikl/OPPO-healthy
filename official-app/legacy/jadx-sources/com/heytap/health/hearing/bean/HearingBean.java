package com.heytap.health.hearing.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.HearingHealthStat;
import com.oplus.aiunit.vision.vw8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class HearingBean {
    private long chartStartTime;
    private boolean showEmptyChart;
    private List<HearingHealthStat> statList = new ArrayList();
    private List<vw8> candleData = new ArrayList();

    public List<vw8> getCandleData() {
        return this.candleData;
    }

    public long getChartStartTime() {
        return this.chartStartTime;
    }

    public List<HearingHealthStat> getStatList() {
        return this.statList;
    }

    public boolean isShowEmptyChart() {
        return this.showEmptyChart;
    }

    public void setCandleData(List<vw8> list) {
        this.candleData = list;
    }

    public void setChartStartTime(long j2) {
        this.chartStartTime = j2;
    }

    public void setShowEmptyChart(boolean z) {
        this.showEmptyChart = z;
    }

    public void setStatList(List<HearingHealthStat> list) {
        this.statList = list;
    }
}
