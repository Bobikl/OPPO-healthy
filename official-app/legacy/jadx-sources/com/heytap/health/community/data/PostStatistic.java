package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/community/data/PostStatistic;", "", "commentCount", "", "dialogueCount", "likeCount", "(JJJ)V", "getCommentCount", "()J", "setCommentCount", "(J)V", "getDialogueCount", "setDialogueCount", "getLikeCount", "setLikeCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PostStatistic {
    private long commentCount;
    private long dialogueCount;
    private long likeCount;

    public PostStatistic(long j2, long j3, long j4) {
        this.commentCount = j2;
        this.dialogueCount = j3;
        this.likeCount = j4;
    }

    public static /* synthetic */ PostStatistic copy$default(PostStatistic postStatistic, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = postStatistic.commentCount;
        }
        long j5 = j2;
        if ((i & 2) != 0) {
            j3 = postStatistic.dialogueCount;
        }
        long j6 = j3;
        if ((i & 4) != 0) {
            j4 = postStatistic.likeCount;
        }
        return postStatistic.copy(j5, j6, j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCommentCount() {
        return this.commentCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDialogueCount() {
        return this.dialogueCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLikeCount() {
        return this.likeCount;
    }

    @NotNull
    public final PostStatistic copy(long commentCount, long dialogueCount, long likeCount) {
        return new PostStatistic(commentCount, dialogueCount, likeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostStatistic)) {
            return false;
        }
        PostStatistic postStatistic = (PostStatistic) other;
        return this.commentCount == postStatistic.commentCount && this.dialogueCount == postStatistic.dialogueCount && this.likeCount == postStatistic.likeCount;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final long getDialogueCount() {
        return this.dialogueCount;
    }

    public final long getLikeCount() {
        return this.likeCount;
    }

    public int hashCode() {
        return (((Long.hashCode(this.commentCount) * 31) + Long.hashCode(this.dialogueCount)) * 31) + Long.hashCode(this.likeCount);
    }

    public final void setCommentCount(long j2) {
        this.commentCount = j2;
    }

    public final void setDialogueCount(long j2) {
        this.dialogueCount = j2;
    }

    public final void setLikeCount(long j2) {
        this.likeCount = j2;
    }

    @NotNull
    public String toString() {
        return "PostStatistic(commentCount=" + this.commentCount + ", dialogueCount=" + this.dialogueCount + ", likeCount=" + this.likeCount + ")";
    }
}
