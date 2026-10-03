package com.heytap.health.operations.doctor;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/operations/doctor/Renewal;", "", "status", "", "beginAt", "", "(IJ)V", "getBeginAt", "()J", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Renewal {
    private final long beginAt;
    private final int status;

    public Renewal(int i, long j2) {
        this.status = i;
        this.beginAt = j2;
    }

    public static /* synthetic */ Renewal copy$default(Renewal renewal, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = renewal.status;
        }
        if ((i2 & 2) != 0) {
            j2 = renewal.beginAt;
        }
        return renewal.copy(i, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBeginAt() {
        return this.beginAt;
    }

    @NotNull
    public final Renewal copy(int status, long beginAt) {
        return new Renewal(status, beginAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Renewal)) {
            return false;
        }
        Renewal renewal = (Renewal) other;
        return this.status == renewal.status && this.beginAt == renewal.beginAt;
    }

    public final long getBeginAt() {
        return this.beginAt;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(this.status) * 31) + Long.hashCode(this.beginAt);
    }

    @NotNull
    public String toString() {
        return "Renewal(status=" + this.status + ", beginAt=" + this.beginAt + ")";
    }
}
