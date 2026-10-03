package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/community/data/MessageCount;", "", "totalCount", "", "(J)V", "getTotalCount", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MessageCount {
    private final long totalCount;

    public MessageCount(long j2) {
        this.totalCount = j2;
    }

    public static /* synthetic */ MessageCount copy$default(MessageCount messageCount, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = messageCount.totalCount;
        }
        return messageCount.copy(j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final MessageCount copy(long totalCount) {
        return new MessageCount(totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageCount) && this.totalCount == ((MessageCount) other).totalCount;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Long.hashCode(this.totalCount);
    }

    @NotNull
    public String toString() {
        return "MessageCount(totalCount=" + this.totalCount + ")";
    }
}
