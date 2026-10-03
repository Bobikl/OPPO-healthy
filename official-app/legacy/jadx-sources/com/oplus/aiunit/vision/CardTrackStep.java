package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s13, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/s13;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "processCode", "b", "getStepCode", "stepCode", "", "c", "J", "d", "()J", "timestamp", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "subStepArr", MapSchema.FIELD_NAME_ENTRY, "Z", "()Z", "reportData", "<init>", "(IIJLjava/util/concurrent/CopyOnWriteArrayList;Z)V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardTrackStep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int processCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int stepCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final CopyOnWriteArrayList<Integer> subStepArr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean reportData;

    public CardTrackStep(int i, int i2, long j2, @NotNull CopyOnWriteArrayList<Integer> subStepArr, boolean z) {
        Intrinsics.checkNotNullParameter(subStepArr, "subStepArr");
        this.processCode = i;
        this.stepCode = i2;
        this.timestamp = j2;
        this.subStepArr = subStepArr;
        this.reportData = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getProcessCode() {
        return this.processCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getReportData() {
        return this.reportData;
    }

    @NotNull
    public final CopyOnWriteArrayList<Integer> c() {
        return this.subStepArr;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTrackStep)) {
            return false;
        }
        CardTrackStep cardTrackStep = (CardTrackStep) other;
        return this.processCode == cardTrackStep.processCode && this.stepCode == cardTrackStep.stepCode && this.timestamp == cardTrackStep.timestamp && Intrinsics.areEqual(this.subStepArr, cardTrackStep.subStepArr) && this.reportData == cardTrackStep.reportData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.processCode) * 31) + Integer.hashCode(this.stepCode)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.subStepArr.hashCode()) * 31;
        boolean z = this.reportData;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode + r3;
    }

    @NotNull
    public String toString() {
        return "CardTrackStep(processCode=" + this.processCode + ", stepCode=" + this.stepCode + ", timestamp=" + this.timestamp + ", subStepArr=" + this.subStepArr + ", reportData=" + this.reportData + ")";
    }

    public /* synthetic */ CardTrackStep(int i, int i2, long j2, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? System.currentTimeMillis() : j2, (i3 & 8) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList, (i3 & 16) != 0 ? false : z);
    }
}
