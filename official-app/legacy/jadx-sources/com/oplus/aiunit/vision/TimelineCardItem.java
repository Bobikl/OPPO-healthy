package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.d0k, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/d0k;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "descStr", "b", "I", "()I", "curIconRes", "curIconColor", "d", MapSchema.FIELD_NAME_ENTRY, "hisIconRes", "", "J", "f", "()J", "startTime", "endTime", b2n.f, "Z", "()Z", "isSportType", "<init>", "(Ljava/lang/String;IIIJJZ)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TimelineCardItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String descStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int curIconRes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int curIconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int hisIconRes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long endTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean isSportType;

    public TimelineCardItem(@NotNull String descStr, int i, int i2, int i3, long j2, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(descStr, "descStr");
        this.descStr = descStr;
        this.curIconRes = i;
        this.curIconColor = i2;
        this.hisIconRes = i3;
        this.startTime = j2;
        this.endTime = j3;
        this.isSportType = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurIconColor() {
        return this.curIconColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurIconRes() {
        return this.curIconRes;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescStr() {
        return this.descStr;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHisIconRes() {
        return this.hisIconRes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineCardItem)) {
            return false;
        }
        TimelineCardItem timelineCardItem = (TimelineCardItem) other;
        return Intrinsics.areEqual(this.descStr, timelineCardItem.descStr) && this.curIconRes == timelineCardItem.curIconRes && this.curIconColor == timelineCardItem.curIconColor && this.hisIconRes == timelineCardItem.hisIconRes && this.startTime == timelineCardItem.startTime && this.endTime == timelineCardItem.endTime && this.isSportType == timelineCardItem.isSportType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSportType() {
        return this.isSportType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((((((this.descStr.hashCode() * 31) + Integer.hashCode(this.curIconRes)) * 31) + Integer.hashCode(this.curIconColor)) * 31) + Integer.hashCode(this.hisIconRes)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        boolean z = this.isSportType;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode + r3;
    }

    @NotNull
    public String toString() {
        return "TimelineCardItem(descStr=" + this.descStr + ", curIconRes=" + this.curIconRes + ", curIconColor=" + this.curIconColor + ", hisIconRes=" + this.hisIconRes + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isSportType=" + this.isSportType + ")";
    }
}
