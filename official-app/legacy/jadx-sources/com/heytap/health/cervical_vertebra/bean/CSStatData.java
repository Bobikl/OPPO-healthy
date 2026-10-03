package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\u0006\u0010.\u001a\u00020+J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00061"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CSStatData;", "", "createdTimestamp", "", "endTimestamp", "state", "", "wearingSeconds", "lowerHeadSeconds", "goodSeconds", "mildSeconds", "heavySeconds", "(JJIJJIII)V", "getCreatedTimestamp", "()J", "setCreatedTimestamp", "(J)V", "getEndTimestamp", "setEndTimestamp", "getGoodSeconds", "()I", "setGoodSeconds", "(I)V", "getHeavySeconds", "setHeavySeconds", "getLowerHeadSeconds", "setLowerHeadSeconds", "getMildSeconds", "setMildSeconds", "getState", "setState", "getWearingSeconds", "setWearingSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "isNullData", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CSStatData {
    private long createdTimestamp;
    private long endTimestamp;
    private int goodSeconds;
    private int heavySeconds;
    private long lowerHeadSeconds;
    private int mildSeconds;
    private int state;
    private long wearingSeconds;

    public CSStatData(long j2, long j3, int i, long j4, long j5, int i2, int i3, int i4) {
        this.createdTimestamp = j2;
        this.endTimestamp = j3;
        this.state = i;
        this.wearingSeconds = j4;
        this.lowerHeadSeconds = j5;
        this.goodSeconds = i2;
        this.mildSeconds = i3;
        this.heavySeconds = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getWearingSeconds() {
        return this.wearingSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLowerHeadSeconds() {
        return this.lowerHeadSeconds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    @NotNull
    public final CSStatData copy(long createdTimestamp, long endTimestamp, int state, long wearingSeconds, long lowerHeadSeconds, int goodSeconds, int mildSeconds, int heavySeconds) {
        return new CSStatData(createdTimestamp, endTimestamp, state, wearingSeconds, lowerHeadSeconds, goodSeconds, mildSeconds, heavySeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CSStatData)) {
            return false;
        }
        CSStatData cSStatData = (CSStatData) other;
        return this.createdTimestamp == cSStatData.createdTimestamp && this.endTimestamp == cSStatData.endTimestamp && this.state == cSStatData.state && this.wearingSeconds == cSStatData.wearingSeconds && this.lowerHeadSeconds == cSStatData.lowerHeadSeconds && this.goodSeconds == cSStatData.goodSeconds && this.mildSeconds == cSStatData.mildSeconds && this.heavySeconds == cSStatData.heavySeconds;
    }

    public final long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    public final long getLowerHeadSeconds() {
        return this.lowerHeadSeconds;
    }

    public final int getMildSeconds() {
        return this.mildSeconds;
    }

    public final int getState() {
        return this.state;
    }

    public final long getWearingSeconds() {
        return this.wearingSeconds;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.createdTimestamp) * 31) + Long.hashCode(this.endTimestamp)) * 31) + Integer.hashCode(this.state)) * 31) + Long.hashCode(this.wearingSeconds)) * 31) + Long.hashCode(this.lowerHeadSeconds)) * 31) + Integer.hashCode(this.goodSeconds)) * 31) + Integer.hashCode(this.mildSeconds)) * 31) + Integer.hashCode(this.heavySeconds);
    }

    public final boolean isNullData() {
        return this.goodSeconds == 0 && this.mildSeconds == 0 && this.heavySeconds == 0;
    }

    public final void setCreatedTimestamp(long j2) {
        this.createdTimestamp = j2;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setGoodSeconds(int i) {
        this.goodSeconds = i;
    }

    public final void setHeavySeconds(int i) {
        this.heavySeconds = i;
    }

    public final void setLowerHeadSeconds(long j2) {
        this.lowerHeadSeconds = j2;
    }

    public final void setMildSeconds(int i) {
        this.mildSeconds = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setWearingSeconds(long j2) {
        this.wearingSeconds = j2;
    }

    @NotNull
    public String toString() {
        return "CSStatData(createdTimestamp=" + this.createdTimestamp + ", endTimestamp=" + this.endTimestamp + ", state=" + this.state + ", wearingSeconds=" + this.wearingSeconds + ", lowerHeadSeconds=" + this.lowerHeadSeconds + ", goodSeconds=" + this.goodSeconds + ", mildSeconds=" + this.mildSeconds + ", heavySeconds=" + this.heavySeconds + ")";
    }

    public /* synthetic */ CSStatData(long j2, long j3, int i, long j4, long j5, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i5 & 2) != 0 ? 0L : j3, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0L : j4, (i5 & 16) != 0 ? 0L : j5, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4);
    }
}
