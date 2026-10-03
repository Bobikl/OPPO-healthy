package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/heytap/sports/partner/bean/Highlights;", "", "achievement", "Lcom/heytap/sports/partner/bean/Achievement;", "commentList", "", "Lcom/heytap/sports/partner/bean/Comment;", "todayLiked", "", "likeCount", "(Lcom/heytap/sports/partner/bean/Achievement;Ljava/util/List;II)V", "getAchievement", "()Lcom/heytap/sports/partner/bean/Achievement;", "getCommentList", "()Ljava/util/List;", "getLikeCount", "()I", "getTodayLiked", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Highlights {
    public static final int $stable = 8;

    @NotNull
    private final Achievement achievement;

    @NotNull
    private final List<Comment> commentList;
    private final int likeCount;
    private final int todayLiked;

    public Highlights() {
        this(null, null, 0, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Highlights copy$default(Highlights highlights, Achievement achievement, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            achievement = highlights.achievement;
        }
        if ((i3 & 2) != 0) {
            list = highlights.commentList;
        }
        if ((i3 & 4) != 0) {
            i = highlights.todayLiked;
        }
        if ((i3 & 8) != 0) {
            i2 = highlights.likeCount;
        }
        return highlights.copy(achievement, list, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Achievement getAchievement() {
        return this.achievement;
    }

    @NotNull
    public final List<Comment> component2() {
        return this.commentList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTodayLiked() {
        return this.todayLiked;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLikeCount() {
        return this.likeCount;
    }

    @NotNull
    public final Highlights copy(@NotNull Achievement achievement, @NotNull List<Comment> commentList, int todayLiked, int likeCount) {
        Intrinsics.checkNotNullParameter(achievement, "achievement");
        Intrinsics.checkNotNullParameter(commentList, "commentList");
        return new Highlights(achievement, commentList, todayLiked, likeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Highlights)) {
            return false;
        }
        Highlights highlights = (Highlights) other;
        return Intrinsics.areEqual(this.achievement, highlights.achievement) && Intrinsics.areEqual(this.commentList, highlights.commentList) && this.todayLiked == highlights.todayLiked && this.likeCount == highlights.likeCount;
    }

    @NotNull
    public final Achievement getAchievement() {
        return this.achievement;
    }

    @NotNull
    public final List<Comment> getCommentList() {
        return this.commentList;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final int getTodayLiked() {
        return this.todayLiked;
    }

    public int hashCode() {
        return (((((this.achievement.hashCode() * 31) + this.commentList.hashCode()) * 31) + Integer.hashCode(this.todayLiked)) * 31) + Integer.hashCode(this.likeCount);
    }

    @NotNull
    public String toString() {
        return "Highlights(achievement=" + this.achievement + ", commentList=" + this.commentList + ", todayLiked=" + this.todayLiked + ", likeCount=" + this.likeCount + ")";
    }

    public Highlights(@NotNull Achievement achievement, @NotNull List<Comment> commentList, int i, int i2) {
        Intrinsics.checkNotNullParameter(achievement, "achievement");
        Intrinsics.checkNotNullParameter(commentList, "commentList");
        this.achievement = achievement;
        this.commentList = commentList;
        this.todayLiked = i;
        this.likeCount = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Highlights(Achievement achievement, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Achievement achievement2 = (i3 & 1) != 0 ? new Achievement(null, null, null, 0, null, 0, null, 0L, 255, null) : achievement;
        List listEmptyList = (i3 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        int i4 = 0;
        int i5 = (i3 & 4) != 0 ? 0 : i;
        if ((i3 & 8) == 0) {
            i4 = i2;
        }
        this(achievement2, listEmptyList, i5, i4);
    }
}
