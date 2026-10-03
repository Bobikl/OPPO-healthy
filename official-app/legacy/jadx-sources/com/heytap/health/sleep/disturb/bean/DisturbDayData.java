package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.DisturbSleepStat;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DisturbDayData {
    private long dayStartTime;
    private long mainSleepDuration;
    private List<DisturbSleepStat> statList;

    public long getDayStartTime() {
        return this.dayStartTime;
    }

    public long getMainSleepDuration() {
        return this.mainSleepDuration;
    }

    public List<DisturbSleepStat> getStatList() {
        return this.statList;
    }

    public void setDayStartTime(long j2) {
        this.dayStartTime = j2;
    }

    public void setMainSleepDuration(long j2) {
        this.mainSleepDuration = j2;
    }

    public void setStatList(List<DisturbSleepStat> list) {
        this.statList = list;
    }

    @NonNull
    public String toString() {
        return "DisturbDayData{dayStartTime=" + this.dayStartTime + ", statList=" + this.statList + ", mainSleepDuration=" + this.mainSleepDuration + '}';
    }
}
