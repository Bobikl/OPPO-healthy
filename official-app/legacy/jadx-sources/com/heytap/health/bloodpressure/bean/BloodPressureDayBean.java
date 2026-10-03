package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.bloodPressure.BloodPressure;
import com.heytap.databaseengine.model.bloodPressure.BloodPressureStat;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import com.oplus.aiunit.vision.fo1;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BloodPressureDayBean extends HealthChartDayBean {
    private BloodPressureStat dayStatData;
    private long endTime;
    private long startTime;
    private int style = 0;
    private List<fo1> systolicDataList = new ArrayList();
    private List<fo1> diastolicDataList = new ArrayList();
    private List<fo1> undueSystolicDataList = new ArrayList();
    private List<fo1> undueDiastolicDataList = new ArrayList();
    private List<BloodPressure> recordList = new ArrayList();

    public BloodPressureStat getDayStatData() {
        return this.dayStatData;
    }

    public List<fo1> getDiastolicDataList() {
        return this.diastolicDataList;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public List<BloodPressure> getRecordList() {
        return this.recordList;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStyle() {
        return this.style;
    }

    public List<fo1> getSystolicDataList() {
        return this.systolicDataList;
    }

    public List<fo1> getUndueDiastolicDataList() {
        return this.undueDiastolicDataList;
    }

    public List<fo1> getUndueSystolicDataList() {
        return this.undueSystolicDataList;
    }

    public void insertCurTimeEmptyData() {
        this.startTime = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.endTime = LocalDate.now().plusDays(1L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
        this.systolicDataList.add(new fo1(this.startTime, 0, 0, 0, 0));
        this.systolicDataList.add(new fo1(this.endTime, 0, 0, 0, 0));
        this.diastolicDataList.add(new fo1(this.startTime, 0, 0, 0, 0));
        this.diastolicDataList.add(new fo1(this.endTime, 0, 0, 0, 0));
    }

    public void insertEmptyData(long j2, long j3) {
        this.systolicDataList.add(new fo1(j2, 0, 0, 0, 0));
        this.systolicDataList.add(new fo1(j3, 0, 0, 0, 0));
        this.diastolicDataList.add(new fo1(j2, 0, 0, 0, 0));
        this.diastolicDataList.add(new fo1(j3, 0, 0, 0, 0));
    }

    public void insertUndueDataList(long j2, long j3) {
        this.undueSystolicDataList.clear();
        this.undueSystolicDataList.add(new fo1(j2, 0, 0, 0, 0));
        this.undueSystolicDataList.add(new fo1(j3, 0, 0, 0, 0));
        this.undueDiastolicDataList.clear();
        this.undueDiastolicDataList.add(new fo1(j2, 0, 0, 0, 0));
        this.undueDiastolicDataList.add(new fo1(j3, 0, 0, 0, 0));
        this.curPageTimestamp = j2;
    }

    public boolean isUndue() {
        return this.style == 1;
    }

    public void setDayStatData(BloodPressureStat bloodPressureStat) {
        this.dayStatData = bloodPressureStat;
    }

    public void setDiastolicDataList(List<fo1> list) {
        this.diastolicDataList = list;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setRecordList(List<BloodPressure> list) {
        this.recordList = list;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setSystolicDataList(List<fo1> list) {
        this.systolicDataList = list;
    }

    public void setUndueDiastolicDataList(List<fo1> list) {
        this.undueDiastolicDataList = list;
    }

    public void setUndueSystolicDataList(List<fo1> list) {
        this.undueSystolicDataList = list;
    }

    @NonNull
    public String toString() {
        return "BloodPressureDayBean{style=" + this.style + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", systolicDataList=" + this.systolicDataList + ", diastolicDataList=" + this.diastolicDataList + ", undueSystolicDataList=" + this.undueSystolicDataList + ", undueDiastolicDataList=" + this.undueDiastolicDataList + ", recordList=" + this.recordList + ", dayStatData=" + this.dayStatData + "} " + super.toString();
    }
}
