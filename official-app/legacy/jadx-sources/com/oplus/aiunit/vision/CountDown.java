package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.va4, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/va4;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "c", "()J", ClickApiEntity.TIME, "b", "Z", "()Z", "start", "I", "()I", "step", "<init>", "(JZI)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CountDown {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int step;

    public CountDown(long j2, boolean z, int i) {
        this.time = j2;
        this.start = z;
        this.step = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountDown)) {
            return false;
        }
        CountDown countDown = (CountDown) other;
        return this.time == countDown.time && this.start == countDown.start && this.step == countDown.step;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        boolean z = this.start;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.step);
    }

    @NotNull
    public String toString() {
        return "CountDown(time=" + this.time + ", start=" + this.start + ", step=" + this.step + ")";
    }
}
