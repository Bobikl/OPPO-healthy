package com.heytap.accessory.bean;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class TrafficReport {
    private static final String KEY_DELAY_TIME = "key_delay_time";
    private static final String KEY_MAX_WINDOW_SIZE = "key_max_window_size";
    private static final String KEY_TENDENCY = "key_tendency";
    private static final String KEY_USED_SIZE = "key_used_size";
    private long mMaxWindowSize;
    private long mUsedSize;
    private Tendency mTendency = Tendency.UNKNOWN;
    private int mDelayTime = 0;

    public enum Tendency {
        UNKNOWN,
        INCREASING,
        STABLE,
        DECREASING
    }

    public TrafficReport(long j, long j2) {
        this.mMaxWindowSize = 0L;
        this.mUsedSize = 0L;
        this.mMaxWindowSize = j;
        this.mUsedSize = j2;
    }

    @Nullable
    public static TrafficReport createFromBundle(Bundle bundle) {
        long j = bundle.getLong("key_max_window_size");
        long j2 = bundle.getLong(KEY_USED_SIZE);
        int i = bundle.getInt(KEY_TENDENCY);
        int i2 = bundle.getInt(KEY_DELAY_TIME);
        TrafficReport trafficReport = new TrafficReport(j, j2);
        if (Tendency.values().length > i) {
            trafficReport.setTendency(Tendency.values()[i]);
        }
        trafficReport.setDelayTime(i2);
        return trafficReport;
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("key_max_window_size", this.mMaxWindowSize);
        bundle.putLong(KEY_USED_SIZE, this.mUsedSize);
        bundle.putInt(KEY_TENDENCY, this.mTendency.ordinal());
        bundle.putInt(KEY_DELAY_TIME, this.mDelayTime);
        return bundle;
    }

    public int getDelayTime() {
        return this.mDelayTime;
    }

    public long getLeftWindowSize() {
        return this.mMaxWindowSize - this.mUsedSize;
    }

    public long getMaxWindowSize() {
        return this.mMaxWindowSize;
    }

    public Tendency getTendency() {
        return this.mTendency;
    }

    public float getUsedPercent() {
        return (this.mUsedSize / this.mMaxWindowSize) * 100.0f;
    }

    public String getUsedPercentString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.CHINA, "%." + i + "f", Float.valueOf(getUsedPercent())));
        sb.append("%");
        return sb.toString();
    }

    public long getUsedSize() {
        return this.mUsedSize;
    }

    public void setDelayTime(int i) {
        this.mDelayTime = i;
    }

    public void setMaxWindowSize(long j) {
        this.mMaxWindowSize = j;
    }

    public void setTendency(Tendency tendency) {
        this.mTendency = tendency;
    }

    public void setUsedSize(long j) {
        this.mUsedSize = j;
    }
}
