package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.axe, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/axe;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "d", "(I)V", "processCode", "c", "nextPacketStartTime", "<init>", "(II)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ProcessPacketDataResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int processCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int nextPacketStartTime;

    public ProcessPacketDataResult(int i, int i2) {
        this.processCode = i;
        this.nextPacketStartTime = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNextPacketStartTime() {
        return this.nextPacketStartTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProcessCode() {
        return this.processCode;
    }

    public final void c(int i) {
        this.nextPacketStartTime = i;
    }

    public final void d(int i) {
        this.processCode = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessPacketDataResult)) {
            return false;
        }
        ProcessPacketDataResult processPacketDataResult = (ProcessPacketDataResult) other;
        return this.processCode == processPacketDataResult.processCode && this.nextPacketStartTime == processPacketDataResult.nextPacketStartTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.processCode) * 31) + Integer.hashCode(this.nextPacketStartTime);
    }

    @NotNull
    public String toString() {
        return "ProcessPacketDataResult(processCode=" + this.processCode + ", nextPacketStartTime=" + this.nextPacketStartTime + ")";
    }
}
