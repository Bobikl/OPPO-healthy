package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.et6, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/et6;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "startTime", "c", "(J)V", "endTime", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EventTimer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long endTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final void c(long j2) {
        this.endTime = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTimer)) {
            return false;
        }
        EventTimer eventTimer = (EventTimer) other;
        return this.startTime == eventTimer.startTime && this.endTime == eventTimer.endTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    @NotNull
    public String toString() {
        return "EventTimer(startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }
}
