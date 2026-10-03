package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/PullDataVersionsParams;", "", "startModifiedTimestamp", "", "endModifiedTimestamp", "(JJ)V", "getEndModifiedTimestamp", "()J", "getStartModifiedTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PullDataVersionsParams {
    private final long endModifiedTimestamp;
    private final long startModifiedTimestamp;

    public PullDataVersionsParams() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ PullDataVersionsParams copy$default(PullDataVersionsParams pullDataVersionsParams, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = pullDataVersionsParams.startModifiedTimestamp;
        }
        if ((i & 2) != 0) {
            j3 = pullDataVersionsParams.endModifiedTimestamp;
        }
        return pullDataVersionsParams.copy(j2, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartModifiedTimestamp() {
        return this.startModifiedTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndModifiedTimestamp() {
        return this.endModifiedTimestamp;
    }

    @NotNull
    public final PullDataVersionsParams copy(long startModifiedTimestamp, long endModifiedTimestamp) {
        return new PullDataVersionsParams(startModifiedTimestamp, endModifiedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullDataVersionsParams)) {
            return false;
        }
        PullDataVersionsParams pullDataVersionsParams = (PullDataVersionsParams) other;
        return this.startModifiedTimestamp == pullDataVersionsParams.startModifiedTimestamp && this.endModifiedTimestamp == pullDataVersionsParams.endModifiedTimestamp;
    }

    public final long getEndModifiedTimestamp() {
        return this.endModifiedTimestamp;
    }

    public final long getStartModifiedTimestamp() {
        return this.startModifiedTimestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.startModifiedTimestamp) * 31) + Long.hashCode(this.endModifiedTimestamp);
    }

    @NotNull
    public String toString() {
        return "PullDataVersionsParams(startModifiedTimestamp=" + this.startModifiedTimestamp + ", endModifiedTimestamp=" + this.endModifiedTimestamp + ")";
    }

    public PullDataVersionsParams(long j2, long j3) {
        this.startModifiedTimestamp = j2;
        this.endModifiedTimestamp = j3;
    }

    public /* synthetic */ PullDataVersionsParams(long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3);
    }
}
