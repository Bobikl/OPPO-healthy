package com.heytap.health.sleep.snore.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class FragmentInfoBean {
    private final String absolutePath;
    private final long cutEndTime;
    private final long cutStartTime;
    private final String perFilePath;
    private final long snoreBeginUnix;
    private final long snoreEndUnix;

    public FragmentInfoBean(long j2, long j3, String str, long j4, long j5, String str2) {
        this.cutStartTime = j2;
        this.cutEndTime = j3;
        this.absolutePath = str;
        this.snoreBeginUnix = j4;
        this.snoreEndUnix = j5;
        this.perFilePath = str2;
    }

    public String getAbsolutePath() {
        return this.absolutePath;
    }

    public long getCutEndTime() {
        return this.cutEndTime;
    }

    public long getCutStartTime() {
        return this.cutStartTime;
    }

    public String getPerFilePath() {
        return this.perFilePath;
    }

    public long getSnoreBeginUnix() {
        return this.snoreBeginUnix;
    }

    public long getSnoreEndUnix() {
        return this.snoreEndUnix;
    }

    @NonNull
    public String toString() {
        return "FragmentTimeBean{cutStartTime=" + this.cutStartTime + ", cutEndTime=" + this.cutEndTime + ", absolutePath=" + this.absolutePath + ", perFilePath=" + this.perFilePath + '}';
    }
}
