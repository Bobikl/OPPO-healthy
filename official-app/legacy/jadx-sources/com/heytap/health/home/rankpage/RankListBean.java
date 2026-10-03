package com.heytap.health.home.rankpage;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.h27;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B%\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/heytap/health/home/rankpage/RankListBean;", "", "", "isUserListResult", "component1", "", "component2", "", "Lcom/heytap/health/home/rankpage/RankListBean$a;", "component3", "userListResult", "rank", "rankList", "copy", "", "toString", "hashCode", "other", "equals", "Z", "getUserListResult", "()Z", "setUserListResult", "(Z)V", "I", "getRank", "()I", "setRank", "(I)V", "Ljava/util/List;", "getRankList", "()Ljava/util/List;", "setRankList", "(Ljava/util/List;)V", "<init>", "(ZILjava/util/List;)V", "a", "home_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RankListBean {
    public static final int $stable = 8;

    @SerializedName("rank")
    private int rank;

    @SerializedName("rankList")
    @NotNull
    private List<RankList> rankList;

    @SerializedName("listResult")
    private boolean userListResult;

    /* JADX INFO: renamed from: com.heytap.health.home.rankpage.RankListBean$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0019\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/home/rankpage/RankListBean$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "d", "()I", "setSteps", "(I)V", "steps", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "c", "setRank", "rank", "setAvatar", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "home_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RankList {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("totalSteps")
        private int steps;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("userName")
        @NotNull
        private String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("rank")
        private int rank;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @SerializedName(h27.FAMILY_KEY_PUSH_FRIEND_AVATAR)
        @NotNull
        private String avatar;

        public RankList(int i, @NotNull String name, int i2, @NotNull String avatar) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            this.steps = i;
            this.name = name;
            this.rank = i2;
            this.avatar = avatar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSteps() {
            return this.steps;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RankList)) {
                return false;
            }
            RankList rankList = (RankList) other;
            return this.steps == rankList.steps && Intrinsics.areEqual(this.name, rankList.name) && this.rank == rankList.rank && Intrinsics.areEqual(this.avatar, rankList.avatar);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.steps) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + this.avatar.hashCode();
        }

        @NotNull
        public String toString() {
            return "RankList(steps=" + this.steps + ", name=" + this.name + ", rank=" + this.rank + ", avatar=" + this.avatar + ")";
        }
    }

    public RankListBean(boolean z, int i, @NotNull List<RankList> rankList) {
        Intrinsics.checkNotNullParameter(rankList, "rankList");
        this.userListResult = z;
        this.rank = i;
        this.rankList = rankList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankListBean copy$default(RankListBean rankListBean, boolean z, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = rankListBean.userListResult;
        }
        if ((i2 & 2) != 0) {
            i = rankListBean.rank;
        }
        if ((i2 & 4) != 0) {
            list = rankListBean.rankList;
        }
        return rankListBean.copy(z, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUserListResult() {
        return this.userListResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final List<RankList> component3() {
        return this.rankList;
    }

    @NotNull
    public final RankListBean copy(boolean userListResult, int rank, @NotNull List<RankList> rankList) {
        Intrinsics.checkNotNullParameter(rankList, "rankList");
        return new RankListBean(userListResult, rank, rankList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankListBean)) {
            return false;
        }
        RankListBean rankListBean = (RankListBean) other;
        return this.userListResult == rankListBean.userListResult && this.rank == rankListBean.rank && Intrinsics.areEqual(this.rankList, rankListBean.rankList);
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final List<RankList> getRankList() {
        return this.rankList;
    }

    public final boolean getUserListResult() {
        return this.userListResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.userListResult;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.rank)) * 31) + this.rankList.hashCode();
    }

    public final boolean isUserListResult() {
        return this.userListResult;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setRankList(@NotNull List<RankList> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rankList = list;
    }

    public final void setUserListResult(boolean z) {
        this.userListResult = z;
    }

    @NotNull
    public String toString() {
        return "RankListBean(userListResult=" + this.userListResult + ", rank=" + this.rank + ", rankList=" + this.rankList + ")";
    }
}
