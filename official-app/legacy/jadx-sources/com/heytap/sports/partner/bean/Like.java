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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/partner/bean/Like;", "", "likeList", "", "Lcom/heytap/sports/partner/bean/LikeItem;", "todayLiked", "", "(Ljava/util/List;I)V", "getLikeList", "()Ljava/util/List;", "getTodayLiked", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Like {
    public static final int $stable = 8;

    @NotNull
    private final List<LikeItem> likeList;
    private final int todayLiked;

    /* JADX WARN: Multi-variable type inference failed */
    public Like() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Like copy$default(Like like, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = like.likeList;
        }
        if ((i2 & 2) != 0) {
            i = like.todayLiked;
        }
        return like.copy(list, i);
    }

    @NotNull
    public final List<LikeItem> component1() {
        return this.likeList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTodayLiked() {
        return this.todayLiked;
    }

    @NotNull
    public final Like copy(@NotNull List<LikeItem> likeList, int todayLiked) {
        Intrinsics.checkNotNullParameter(likeList, "likeList");
        return new Like(likeList, todayLiked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Like)) {
            return false;
        }
        Like like = (Like) other;
        return Intrinsics.areEqual(this.likeList, like.likeList) && this.todayLiked == like.todayLiked;
    }

    @NotNull
    public final List<LikeItem> getLikeList() {
        return this.likeList;
    }

    public final int getTodayLiked() {
        return this.todayLiked;
    }

    public int hashCode() {
        return (this.likeList.hashCode() * 31) + Integer.hashCode(this.todayLiked);
    }

    @NotNull
    public String toString() {
        return "Like(likeList=" + this.likeList + ", todayLiked=" + this.todayLiked + ")";
    }

    public Like(@NotNull List<LikeItem> likeList, int i) {
        Intrinsics.checkNotNullParameter(likeList, "likeList");
        this.likeList = likeList;
        this.todayLiked = i;
    }

    public /* synthetic */ Like(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
