package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/partner/bean/LikeItem;", "", "memberSsoid", "", "date", "", "likeCount", "(Ljava/lang/String;II)V", "getDate", "()I", "getLikeCount", "getMemberSsoid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LikeItem {
    public static final int $stable = 0;
    private final int date;
    private final int likeCount;

    @NotNull
    private final String memberSsoid;

    public LikeItem() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ LikeItem copy$default(LikeItem likeItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = likeItem.memberSsoid;
        }
        if ((i3 & 2) != 0) {
            i = likeItem.date;
        }
        if ((i3 & 4) != 0) {
            i2 = likeItem.likeCount;
        }
        return likeItem.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLikeCount() {
        return this.likeCount;
    }

    @NotNull
    public final LikeItem copy(@NotNull String memberSsoid, int date, int likeCount) {
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        return new LikeItem(memberSsoid, date, likeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LikeItem)) {
            return false;
        }
        LikeItem likeItem = (LikeItem) other;
        return Intrinsics.areEqual(this.memberSsoid, likeItem.memberSsoid) && this.date == likeItem.date && this.likeCount == likeItem.likeCount;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    @NotNull
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    public int hashCode() {
        return (((this.memberSsoid.hashCode() * 31) + Integer.hashCode(this.date)) * 31) + Integer.hashCode(this.likeCount);
    }

    @NotNull
    public String toString() {
        return "LikeItem(memberSsoid=" + this.memberSsoid + ", date=" + this.date + ", likeCount=" + this.likeCount + ")";
    }

    public LikeItem(@NotNull String memberSsoid, int i, int i2) {
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        this.memberSsoid = memberSsoid;
        this.date = i;
        this.likeCount = i2;
    }

    public /* synthetic */ LikeItem(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
