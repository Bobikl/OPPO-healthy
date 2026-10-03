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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/sports/partner/bean/Comment;", "", "commmenterSsoid", "", "commmenterName", "commont", "publishTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCommmenterName", "()Ljava/lang/String;", "getCommmenterSsoid", "getCommont", "getPublishTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Comment {
    public static final int $stable = 0;

    @NotNull
    private final String commmenterName;

    @NotNull
    private final String commmenterSsoid;

    @NotNull
    private final String commont;
    private final long publishTime;

    public Comment() {
        this(null, null, null, 0L, 15, null);
    }

    public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, String str3, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comment.commmenterSsoid;
        }
        if ((i & 2) != 0) {
            str2 = comment.commmenterName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = comment.commont;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j2 = comment.publishTime;
        }
        return comment.copy(str, str4, str5, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCommmenterSsoid() {
        return this.commmenterSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommmenterName() {
        return this.commmenterName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommont() {
        return this.commont;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPublishTime() {
        return this.publishTime;
    }

    @NotNull
    public final Comment copy(@NotNull String commmenterSsoid, @NotNull String commmenterName, @NotNull String commont, long publishTime) {
        Intrinsics.checkNotNullParameter(commmenterSsoid, "commmenterSsoid");
        Intrinsics.checkNotNullParameter(commmenterName, "commmenterName");
        Intrinsics.checkNotNullParameter(commont, "commont");
        return new Comment(commmenterSsoid, commmenterName, commont, publishTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) other;
        return Intrinsics.areEqual(this.commmenterSsoid, comment.commmenterSsoid) && Intrinsics.areEqual(this.commmenterName, comment.commmenterName) && Intrinsics.areEqual(this.commont, comment.commont) && this.publishTime == comment.publishTime;
    }

    @NotNull
    public final String getCommmenterName() {
        return this.commmenterName;
    }

    @NotNull
    public final String getCommmenterSsoid() {
        return this.commmenterSsoid;
    }

    @NotNull
    public final String getCommont() {
        return this.commont;
    }

    public final long getPublishTime() {
        return this.publishTime;
    }

    public int hashCode() {
        return (((((this.commmenterSsoid.hashCode() * 31) + this.commmenterName.hashCode()) * 31) + this.commont.hashCode()) * 31) + Long.hashCode(this.publishTime);
    }

    @NotNull
    public String toString() {
        return "Comment(commmenterSsoid=" + this.commmenterSsoid + ", commmenterName=" + this.commmenterName + ", commont=" + this.commont + ", publishTime=" + this.publishTime + ")";
    }

    public Comment(@NotNull String commmenterSsoid, @NotNull String commmenterName, @NotNull String commont, long j2) {
        Intrinsics.checkNotNullParameter(commmenterSsoid, "commmenterSsoid");
        Intrinsics.checkNotNullParameter(commmenterName, "commmenterName");
        Intrinsics.checkNotNullParameter(commont, "commont");
        this.commmenterSsoid = commmenterSsoid;
        this.commmenterName = commmenterName;
        this.commont = commont;
        this.publishTime = j2;
    }

    public /* synthetic */ Comment(String str, String str2, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j2);
    }
}
