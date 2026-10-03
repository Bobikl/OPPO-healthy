package com.heytap.health.stress.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import com.oplus.aiunit.vision.o0j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StressDayBean extends HealthChartDayBean {
    private float balance;
    private int lastStress;
    private int maxStressIndex;
    private long startTime;
    private int style = 0;
    private List<StressDataStat> halfHourData = new ArrayList();
    private List<StressTSData> dataList = new ArrayList();
    private List<StressTSData> undueDataList = new ArrayList();

    public float getBalance() {
        return this.balance;
    }

    public long getChartEndTime() {
        if (isUndue() && this.undueDataList.size() > 0) {
            List<StressTSData> list = this.undueDataList;
            return list.get(list.size() - 1).getTimestamp();
        }
        if (this.dataList.size() <= 0) {
            return 0L;
        }
        List<StressTSData> list2 = this.dataList;
        return list2.get(list2.size() - 1).getTimestamp();
    }

    public List<StressTSData> getDataList() {
        return this.dataList;
    }

    public List<StressDataStat> getHalfHourData() {
        return this.halfHourData;
    }

    public int getLastStress() {
        return this.lastStress;
    }

    public int getMaxStressIndex() {
        return this.maxStressIndex;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStyle() {
        return this.style;
    }

    public List<StressTSData> getUndueDataList() {
        return this.undueDataList;
    }

    public StressDayBean insertCurTimeEmptyData() {
        long jD = o0j.d();
        long jC = o0j.c();
        this.dataList.add(new StressTSData(jD, 0.0f));
        this.dataList.add(new StressTSData(jC, 0.0f));
        this.curPageTimestamp = jD;
        return this;
    }

    public void insertEmptyData(long j2, long j3) {
        this.dataList.clear();
        this.dataList.add(new StressTSData(j2, 0.0f));
        this.dataList.add(new StressTSData(j3, 0.0f));
    }

    public void insertUndueDataList(long j2, long j3) {
        this.undueDataList.clear();
        this.undueDataList.add(new StressTSData(j2, 0.0f));
        this.undueDataList.add(new StressTSData(j3, 0.0f));
        this.curPageTimestamp = j2;
    }

    public boolean isEmptyData() {
        if (this.dataList.isEmpty()) {
            return true;
        }
        if (this.dataList.size() == 2) {
            return this.dataList.get(0).getY() <= 0.0f && this.dataList.get(1).getY() <= 0.0f;
        }
        return false;
    }

    public boolean isUndue() {
        return this.style == 1;
    }

    public void setBalance(float f) {
        this.balance = f;
    }

    public void setDataList(List<StressTSData> list) {
        this.dataList = list;
        if (list.isEmpty()) {
            return;
        }
        List<StressTSData> list2 = this.dataList;
        this.lastStress = (int) list2.get(list2.size() - 1).getY();
    }

    public void setHalfHourData(List<StressDataStat> list) {
        this.halfHourData = list;
    }

    public void setLastStress(int i) {
        this.lastStress = i;
    }

    public void setMaxStressIndex(int i) {
        this.maxStressIndex = i;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    @NonNull
    public String toString() {
        return "StressDayBean{style=" + this.style + ", startTime=" + this.startTime + ", halfHourData=" + this.halfHourData + ", dataList=" + this.dataList + ", undueDataList=" + this.undueDataList + ", lastStress=" + this.lastStress + ", maxStressIndex=" + this.maxStressIndex + ", balance=" + this.balance + '}';
    }
}
