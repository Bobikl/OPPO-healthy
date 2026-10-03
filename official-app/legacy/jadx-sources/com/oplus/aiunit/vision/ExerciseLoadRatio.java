package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ow6, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ow6;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "timestamp", "b", "I", "()I", "value", "<init>", "(JI)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ExerciseLoadRatio {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int value;

    public ExerciseLoadRatio(long j2, int i) {
        this.timestamp = j2;
        this.value = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseLoadRatio)) {
            return false;
        }
        ExerciseLoadRatio exerciseLoadRatio = (ExerciseLoadRatio) other;
        return this.timestamp == exerciseLoadRatio.timestamp && this.value == exerciseLoadRatio.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "ExerciseLoadRatio(timestamp=" + this.timestamp + ", value=" + this.value + ")";
    }
}
