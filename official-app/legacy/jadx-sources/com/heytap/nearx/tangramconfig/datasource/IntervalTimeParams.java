package com.heytap.nearx.tangramconfig.datasource;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/IntervalTimeParams;", "", "decentralizedSwitch", "", "intervalRandom", "maxInterval", "discreteTime1", "discreteTime2", "(JJJJJ)V", "getDecentralizedSwitch", "()J", "setDecentralizedSwitch", "(J)V", "getDiscreteTime1", "setDiscreteTime1", "getDiscreteTime2", "setDiscreteTime2", "getIntervalRandom", "setIntervalRandom", "getMaxInterval", "setMaxInterval", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class IntervalTimeParams {
    private long decentralizedSwitch;
    private long discreteTime1;
    private long discreteTime2;
    private long intervalRandom;
    private long maxInterval;

    public IntervalTimeParams() {
        this(0L, 0L, 0L, 0L, 0L, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDecentralizedSwitch() {
        return this.decentralizedSwitch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getIntervalRandom() {
        return this.intervalRandom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMaxInterval() {
        return this.maxInterval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDiscreteTime1() {
        return this.discreteTime1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDiscreteTime2() {
        return this.discreteTime2;
    }

    @NotNull
    public final IntervalTimeParams copy(long decentralizedSwitch, long intervalRandom, long maxInterval, long discreteTime1, long discreteTime2) {
        return new IntervalTimeParams(decentralizedSwitch, intervalRandom, maxInterval, discreteTime1, discreteTime2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntervalTimeParams)) {
            return false;
        }
        IntervalTimeParams intervalTimeParams = (IntervalTimeParams) other;
        return this.decentralizedSwitch == intervalTimeParams.decentralizedSwitch && this.intervalRandom == intervalTimeParams.intervalRandom && this.maxInterval == intervalTimeParams.maxInterval && this.discreteTime1 == intervalTimeParams.discreteTime1 && this.discreteTime2 == intervalTimeParams.discreteTime2;
    }

    public final long getDecentralizedSwitch() {
        return this.decentralizedSwitch;
    }

    public final long getDiscreteTime1() {
        return this.discreteTime1;
    }

    public final long getDiscreteTime2() {
        return this.discreteTime2;
    }

    public final long getIntervalRandom() {
        return this.intervalRandom;
    }

    public final long getMaxInterval() {
        return this.maxInterval;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.decentralizedSwitch) * 31) + Long.hashCode(this.intervalRandom)) * 31) + Long.hashCode(this.maxInterval)) * 31) + Long.hashCode(this.discreteTime1)) * 31) + Long.hashCode(this.discreteTime2);
    }

    public final void setDecentralizedSwitch(long j2) {
        this.decentralizedSwitch = j2;
    }

    public final void setDiscreteTime1(long j2) {
        this.discreteTime1 = j2;
    }

    public final void setDiscreteTime2(long j2) {
        this.discreteTime2 = j2;
    }

    public final void setIntervalRandom(long j2) {
        this.intervalRandom = j2;
    }

    public final void setMaxInterval(long j2) {
        this.maxInterval = j2;
    }

    @NotNull
    public String toString() {
        return "IntervalTimeParams(decentralizedSwitch=" + this.decentralizedSwitch + ", intervalRandom=" + this.intervalRandom + ", maxInterval=" + this.maxInterval + ", discreteTime1=" + this.discreteTime1 + ", discreteTime2=" + this.discreteTime2 + ')';
    }

    public IntervalTimeParams(long j2, long j3, long j4, long j5, long j6) {
        this.decentralizedSwitch = j2;
        this.intervalRandom = j3;
        this.maxInterval = j4;
        this.discreteTime1 = j5;
        this.discreteTime2 = j6;
    }

    public /* synthetic */ IntervalTimeParams(long j2, long j3, long j4, long j5, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4, (i & 8) != 0 ? 0L : j5, (i & 16) != 0 ? 0L : j6);
    }
}
