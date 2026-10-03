package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/community/data/UserStatistic;", "", "followCount", "", "fansCount", "likedCount", "postCount", "(JJJJ)V", "getFansCount", "()J", "setFansCount", "(J)V", "getFollowCount", "getLikedCount", "getPostCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserStatistic {
    private long fansCount;
    private final long followCount;
    private final long likedCount;
    private final long postCount;

    public UserStatistic(long j2, long j3, long j4, long j5) {
        this.followCount = j2;
        this.fansCount = j3;
        this.likedCount = j4;
        this.postCount = j5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFollowCount() {
        return this.followCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFansCount() {
        return this.fansCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLikedCount() {
        return this.likedCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPostCount() {
        return this.postCount;
    }

    @NotNull
    public final UserStatistic copy(long followCount, long fansCount, long likedCount, long postCount) {
        return new UserStatistic(followCount, fansCount, likedCount, postCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatistic)) {
            return false;
        }
        UserStatistic userStatistic = (UserStatistic) other;
        return this.followCount == userStatistic.followCount && this.fansCount == userStatistic.fansCount && this.likedCount == userStatistic.likedCount && this.postCount == userStatistic.postCount;
    }

    public final long getFansCount() {
        return this.fansCount;
    }

    public final long getFollowCount() {
        return this.followCount;
    }

    public final long getLikedCount() {
        return this.likedCount;
    }

    public final long getPostCount() {
        return this.postCount;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.followCount) * 31) + Long.hashCode(this.fansCount)) * 31) + Long.hashCode(this.likedCount)) * 31) + Long.hashCode(this.postCount);
    }

    public final void setFansCount(long j2) {
        this.fansCount = j2;
    }

    @NotNull
    public String toString() {
        return "UserStatistic(followCount=" + this.followCount + ", fansCount=" + this.fansCount + ", likedCount=" + this.likedCount + ", postCount=" + this.postCount + ")";
    }
}
