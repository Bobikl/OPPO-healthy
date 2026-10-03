package com.heytap.databaseengine.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Keep
public class SleepModelSettings {

    @Expose
    private long mStateSyncTime;
    private long timestamp;
    private int mStartNow = 0;

    @Expose
    private int mAccordRestSwitch = 0;

    @Expose
    private int mStateSync = 0;

    @Expose
    private int mAutoRecognizeSwitch = 0;

    public int getAccordRestSwitch() {
        return this.mAccordRestSwitch;
    }

    public int getStartNow() {
        return this.mStartNow;
    }

    public int getStateSync() {
        return this.mStateSync;
    }

    public long getStateSyncUpdateTime() {
        return this.mStateSyncTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isAutoRecognizeEnable() {
        return this.mAutoRecognizeSwitch == 1;
    }

    public boolean isRestLinkageSleepMode() {
        return this.mAccordRestSwitch == 1;
    }

    public boolean isStartNow() {
        return this.mStartNow == 1;
    }

    public boolean isSyncSleepMode() {
        return this.mStateSync == 1;
    }

    public SleepModelSettings setAccordRestSwitch(int i) {
        this.mAccordRestSwitch = i;
        return this;
    }

    public void setAutoRecognizeSwitch(int i) {
        this.mAutoRecognizeSwitch = i;
    }

    public SleepModelSettings setStartNow(int i) {
        this.mStartNow = i;
        return this;
    }

    public SleepModelSettings setStateSync(int i) {
        this.mStateSync = i;
        return this;
    }

    public SleepModelSettings setStateSyncUpdateTime(long j) {
        this.mStateSyncTime = j;
        return this;
    }

    public SleepModelSettings setTimestamp(long j) {
        this.timestamp = j;
        return this;
    }

    public String toDbJSON() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        return "SleepModelSettings{timestamp=" + this.timestamp + ", mStartNow=" + this.mStartNow + ", mAccordRestSwitch=" + this.mAccordRestSwitch + ", mStateSync=" + this.mStateSync + ", mStateSyncTime=" + this.mStateSyncTime + '}';
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SleepModelSettings m18clone() {
        SleepModelSettings sleepModelSettings = new SleepModelSettings();
        sleepModelSettings.setStateSyncUpdateTime(this.mStateSyncTime);
        sleepModelSettings.setStateSync(this.mStateSync);
        sleepModelSettings.setTimestamp(this.timestamp);
        sleepModelSettings.setStartNow(this.mStartNow);
        sleepModelSettings.setAccordRestSwitch(this.mAccordRestSwitch);
        sleepModelSettings.setAutoRecognizeSwitch(this.mAutoRecognizeSwitch);
        return sleepModelSettings;
    }
}