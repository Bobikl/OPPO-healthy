package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/GuardStatus;", "", "id", "", "status", "", "(JI)V", "getId", "()J", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GuardStatus {
    private final long id;
    private final int status;

    public GuardStatus(long j2, int i) {
        this.id = j2;
        this.status = i;
    }

    public static /* synthetic */ GuardStatus copy$default(GuardStatus guardStatus, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = guardStatus.id;
        }
        if ((i2 & 2) != 0) {
            i = guardStatus.status;
        }
        return guardStatus.copy(j2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final GuardStatus copy(long id, int status) {
        return new GuardStatus(id, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardStatus)) {
            return false;
        }
        GuardStatus guardStatus = (GuardStatus) other;
        return this.id == guardStatus.id && this.status == guardStatus.status;
    }

    public final long getId() {
        return this.id;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "GuardStatus(id=" + this.id + ", status=" + this.status + ")";
    }
}
