package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/community/data/TopicBoard;", "", "topicId", "", "topicName", "", "rank", "", "heat", "isRecommend", "", "(JLjava/lang/String;IIZ)V", "getHeat", "()I", "()Z", "getRank", "getTopicId", "()J", "getTopicName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TopicBoard {
    private final int heat;
    private final boolean isRecommend;
    private final int rank;
    private final long topicId;

    @NotNull
    private final String topicName;

    public TopicBoard(long j2, @NotNull String topicName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        this.topicId = j2;
        this.topicName = topicName;
        this.rank = i;
        this.heat = i2;
        this.isRecommend = z;
    }

    public static /* synthetic */ TopicBoard copy$default(TopicBoard topicBoard, long j2, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = topicBoard.topicId;
        }
        long j3 = j2;
        if ((i3 & 2) != 0) {
            str = topicBoard.topicName;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = topicBoard.rank;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = topicBoard.heat;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = topicBoard.isRecommend;
        }
        return topicBoard.copy(j3, str2, i4, i5, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeat() {
        return this.heat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public final TopicBoard copy(long topicId, @NotNull String topicName, int rank, int heat, boolean isRecommend) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        return new TopicBoard(topicId, topicName, rank, heat, isRecommend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicBoard)) {
            return false;
        }
        TopicBoard topicBoard = (TopicBoard) other;
        return this.topicId == topicBoard.topicId && Intrinsics.areEqual(this.topicName, topicBoard.topicName) && this.rank == topicBoard.rank && this.heat == topicBoard.heat && this.isRecommend == topicBoard.isRecommend;
    }

    public final int getHeat() {
        return this.heat;
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final String getTopicName() {
        return this.topicName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.topicId) * 31) + this.topicName.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.heat)) * 31;
        boolean z = this.isRecommend;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final boolean isRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public String toString() {
        return "TopicBoard(topicId=" + this.topicId + ", topicName=" + this.topicName + ", rank=" + this.rank + ", heat=" + this.heat + ", isRecommend=" + this.isRecommend + ")";
    }
}
