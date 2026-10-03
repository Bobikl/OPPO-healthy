package com.heytap.log.core.bean;

/* JADX INFO: loaded from: classes19.dex */
public class TimerCheckParam {
    private boolean enableTimerCheck = false;
    private int timesPerDay = 10;
    private boolean enableDelayRetry = true;
    private long delayRetrySecond = 60;

    public long getDelayRetrySecond() {
        return this.delayRetrySecond;
    }

    public int getTimesPerDay() {
        return this.timesPerDay;
    }

    public boolean isEnableDelayRetry() {
        return this.enableDelayRetry;
    }

    public boolean isEnableTimerCheck() {
        return this.enableTimerCheck;
    }

    public void setDelayRetrySecond(long j2) {
        this.delayRetrySecond = j2;
    }

    public void setEnableDelayRetry(boolean z) {
        this.enableDelayRetry = z;
    }

    public void setEnableTimerCheck(boolean z) {
        this.enableTimerCheck = z;
    }

    public void setTimesPerDay(int i) {
        this.timesPerDay = i;
    }
}
