package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.fo1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodPressureBean {
    private long chartStartTime;
    private boolean showEmptyChart;
    private List<fo1> systolicDataList = new ArrayList();
    private List<fo1> diastolicDataList = new ArrayList();

    public long getChartStartTime() {
        return this.chartStartTime;
    }

    public List<fo1> getDiastolicDataList() {
        return this.diastolicDataList;
    }

    public List<fo1> getSystolicDataList() {
        return this.systolicDataList;
    }

    public boolean isShowEmptyChart() {
        return this.showEmptyChart;
    }

    public void setChartStartTime(long j2) {
        this.chartStartTime = j2;
    }

    public void setDiastolicDataList(List<fo1> list) {
        this.diastolicDataList = list;
    }

    public void setShowEmptyChart(boolean z) {
        this.showEmptyChart = z;
    }

    public void setSystolicDataList(List<fo1> list) {
        this.systolicDataList = list;
    }

    @NonNull
    public String toString() {
        return "BloodPressureBean{chartStartTime=" + this.chartStartTime + ", showEmptyChart=" + this.showEmptyChart + ", systolicDataList=" + this.systolicDataList + ", diastolicDataList=" + this.diastolicDataList + '}';
    }
}
