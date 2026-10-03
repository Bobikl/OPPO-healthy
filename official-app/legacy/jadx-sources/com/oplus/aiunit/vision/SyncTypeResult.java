package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.sjj, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/sjj;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "trackKey", "b", "I", "()I", "successCount", "pluralsResId", "<init>", "(Ljava/lang/String;II)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SyncTypeResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String trackKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int successCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int pluralsResId;

    public SyncTypeResult(@NotNull String trackKey, int i, int i2) {
        Intrinsics.checkNotNullParameter(trackKey, "trackKey");
        this.trackKey = trackKey;
        this.successCount = i;
        this.pluralsResId = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPluralsResId() {
        return this.pluralsResId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSuccessCount() {
        return this.successCount;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTrackKey() {
        return this.trackKey;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncTypeResult)) {
            return false;
        }
        SyncTypeResult syncTypeResult = (SyncTypeResult) other;
        return Intrinsics.areEqual(this.trackKey, syncTypeResult.trackKey) && this.successCount == syncTypeResult.successCount && this.pluralsResId == syncTypeResult.pluralsResId;
    }

    public int hashCode() {
        return (((this.trackKey.hashCode() * 31) + Integer.hashCode(this.successCount)) * 31) + Integer.hashCode(this.pluralsResId);
    }

    @NotNull
    public String toString() {
        return "SyncTypeResult(trackKey=" + this.trackKey + ", successCount=" + this.successCount + ", pluralsResId=" + this.pluralsResId + ")";
    }
}
