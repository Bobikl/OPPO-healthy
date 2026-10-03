package com.heytap.databaseengineservice.sync.responsebean.newsleep;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006&"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/newsleep/SleepHeartRateStatPOJO;", "", "()V", "avgSleepHeartRate", "", "getAvgSleepHeartRate", "()Ljava/lang/Integer;", "setAvgSleepHeartRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "date", "getDate", "()I", "setDate", "(I)V", "maxHeartRate", "getMaxHeartRate", "setMaxHeartRate", "minHeartRate", "getMinHeartRate", "setMinHeartRate", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "reasonableRangeHigh", "getReasonableRangeHigh", "setReasonableRangeHigh", "reasonableRangeLow", "getReasonableRangeLow", "setReasonableRangeLow", "warningNumber", "getWarningNumber", "setWarningNumber", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepHeartRateStatPOJO {

    @Nullable
    private Integer avgSleepHeartRate;
    private int date;

    @Nullable
    private Integer maxHeartRate;

    @Nullable
    private Integer minHeartRate;
    private long modifiedTimestamp;

    @Nullable
    private Integer reasonableRangeHigh;

    @Nullable
    private Integer reasonableRangeLow;
    private int warningNumber;

    @Nullable
    public final Integer getAvgSleepHeartRate() {
        return this.avgSleepHeartRate;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    public final Integer getMinHeartRate() {
        return this.minHeartRate;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Integer getReasonableRangeHigh() {
        return this.reasonableRangeHigh;
    }

    @Nullable
    public final Integer getReasonableRangeLow() {
        return this.reasonableRangeLow;
    }

    public final int getWarningNumber() {
        return this.warningNumber;
    }

    public final void setAvgSleepHeartRate(@Nullable Integer num) {
        this.avgSleepHeartRate = num;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setMaxHeartRate(@Nullable Integer num) {
        this.maxHeartRate = num;
    }

    public final void setMinHeartRate(@Nullable Integer num) {
        this.minHeartRate = num;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setReasonableRangeHigh(@Nullable Integer num) {
        this.reasonableRangeHigh = num;
    }

    public final void setReasonableRangeLow(@Nullable Integer num) {
        this.reasonableRangeLow = num;
    }

    public final void setWarningNumber(int i) {
        this.warningNumber = i;
    }

    @NotNull
    public String toString() {
        return "SleepHeartRateStatPOJO(date=" + this.date + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", reasonableRangeLow=" + this.reasonableRangeLow + ", reasonableRangeHigh=" + this.reasonableRangeHigh + ", warningNumber=" + this.warningNumber + ", avgSleepHeartRate=" + this.avgSleepHeartRate + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
