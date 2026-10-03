package com.heytap.health.home.rankpage;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/home/rankpage/UserRankBean;", "", "listResult", "", "userRank", "", "rankStep", "(ZII)V", "getListResult", "()Z", "setListResult", "(Z)V", "getRankStep", "()I", "setRankStep", "(I)V", "getUserRank", "setUserRank", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserRankBean {
    public static final int $stable = 8;

    @SerializedName("listResult")
    private boolean listResult;
    private int rankStep;

    @SerializedName("rank")
    private int userRank;

    public UserRankBean(boolean z, int i, int i2) {
        this.listResult = z;
        this.userRank = i;
        this.rankStep = i2;
    }

    public static /* synthetic */ UserRankBean copy$default(UserRankBean userRankBean, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = userRankBean.listResult;
        }
        if ((i3 & 2) != 0) {
            i = userRankBean.userRank;
        }
        if ((i3 & 4) != 0) {
            i2 = userRankBean.rankStep;
        }
        return userRankBean.copy(z, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getListResult() {
        return this.listResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserRank() {
        return this.userRank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRankStep() {
        return this.rankStep;
    }

    @NotNull
    public final UserRankBean copy(boolean listResult, int userRank, int rankStep) {
        return new UserRankBean(listResult, userRank, rankStep);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRankBean)) {
            return false;
        }
        UserRankBean userRankBean = (UserRankBean) other;
        return this.listResult == userRankBean.listResult && this.userRank == userRankBean.userRank && this.rankStep == userRankBean.rankStep;
    }

    public final boolean getListResult() {
        return this.listResult;
    }

    public final int getRankStep() {
        return this.rankStep;
    }

    public final int getUserRank() {
        return this.userRank;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.listResult;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.userRank)) * 31) + Integer.hashCode(this.rankStep);
    }

    public final void setListResult(boolean z) {
        this.listResult = z;
    }

    public final void setRankStep(int i) {
        this.rankStep = i;
    }

    public final void setUserRank(int i) {
        this.userRank = i;
    }

    @NotNull
    public String toString() {
        return "UserRankBean(listResult=" + this.listResult + ", userRank=" + this.userRank + ", rankStep=" + this.rankStep + ")";
    }
}
