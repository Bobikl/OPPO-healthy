package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dj3, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/dj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getEnumId", "()I", "enumId", "b", "titleStrId", "c", "descStrId", "<init>", "(III)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CloudStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int enumId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int titleStrId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int descStrId;

    public CloudStatus(int i, int i2, int i3) {
        this.enumId = i;
        this.titleStrId = i2;
        this.descStrId = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDescStrId() {
        return this.descStrId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleStrId() {
        return this.titleStrId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudStatus)) {
            return false;
        }
        CloudStatus cloudStatus = (CloudStatus) other;
        return this.enumId == cloudStatus.enumId && this.titleStrId == cloudStatus.titleStrId && this.descStrId == cloudStatus.descStrId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.enumId) * 31) + Integer.hashCode(this.titleStrId)) * 31) + Integer.hashCode(this.descStrId);
    }

    @NotNull
    public String toString() {
        return "CloudStatus(enumId=" + this.enumId + ", titleStrId=" + this.titleStrId + ", descStrId=" + this.descStrId + ")";
    }
}
