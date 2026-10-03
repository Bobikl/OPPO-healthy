package com.heytap.sports.tabEdit.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006#"}, d2 = {"Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq;", "", "", "component1", "", "Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq$a;", "component2", "component3", "catalog", "cardInfoList", "hideCardInfoList", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getCatalog", "()I", "setCatalog", "(I)V", "Ljava/util/List;", "getCardInfoList", "()Ljava/util/List;", "setCardInfoList", "(Ljava/util/List;)V", "getHideCardInfoList", "setHideCardInfoList", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "a", "b", "c", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UserSportsConfigReq {
    public static final int $stable = 8;

    @SerializedName("cardInfoList")
    @NotNull
    private List<CardInfo> cardInfoList;

    @SerializedName("catalog")
    private int catalog;

    @SerializedName("hideCardInfoList")
    @NotNull
    private List<CardInfo> hideCardInfoList;

    /* JADX INFO: renamed from: com.heytap.sports.tabEdit.net.UserSportsConfigReq$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setCardCode", "(Ljava/lang/String;)V", "cardCode", "b", "I", "()I", "setSort", "(I)V", DBIndicatorStat.SORT, "<init>", "(Ljava/lang/String;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CardInfo {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("cardCode")
        @NotNull
        private String cardCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName(DBIndicatorStat.SORT)
        private int sort;

        public CardInfo(@NotNull String cardCode, int i) {
            Intrinsics.checkNotNullParameter(cardCode, "cardCode");
            this.cardCode = cardCode;
            this.sort = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCardCode() {
            return this.cardCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSort() {
            return this.sort;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardInfo)) {
                return false;
            }
            CardInfo cardInfo = (CardInfo) other;
            return Intrinsics.areEqual(this.cardCode, cardInfo.cardCode) && this.sort == cardInfo.sort;
        }

        public int hashCode() {
            return (this.cardCode.hashCode() * 31) + Integer.hashCode(this.sort);
        }

        @NotNull
        public String toString() {
            return "CardInfo(cardCode=" + this.cardCode + ", sort=" + this.sort + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.tabEdit.net.UserSportsConfigReq$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getCatalog", "()I", "setCatalog", "(I)V", "catalog", "<init>", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class QueryConfigReq {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("catalog")
        private int catalog;

        public QueryConfigReq(int i) {
            this.catalog = i;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QueryConfigReq) && this.catalog == ((QueryConfigReq) other).catalog;
        }

        public int hashCode() {
            return Integer.hashCode(this.catalog);
        }

        @NotNull
        public String toString() {
            return "QueryConfigReq(catalog=" + this.catalog + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.tabEdit.net.UserSportsConfigReq$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTimeStamp", "()Ljava/lang/String;", "setTimeStamp", "(Ljava/lang/String;)V", SpeechConstant.KEY_TTS_TIMESTAMP, "", "Lcom/heytap/sports/tabEdit/net/UserSportsConfigReq$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "setUserCardList", "(Ljava/util/List;)V", "userCardList", "c", "getHideUserCardList", "setHideUserCardList", "hideUserCardList", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class QueryResult {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("modifiedTimeStamp")
        @NotNull
        private String timeStamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("userCardList")
        @Nullable
        private List<CardInfo> userCardList;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("hideUserCardList")
        @Nullable
        private List<CardInfo> hideUserCardList;

        @Nullable
        public final List<CardInfo> a() {
            return this.userCardList;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QueryResult)) {
                return false;
            }
            QueryResult queryResult = (QueryResult) other;
            return Intrinsics.areEqual(this.timeStamp, queryResult.timeStamp) && Intrinsics.areEqual(this.userCardList, queryResult.userCardList) && Intrinsics.areEqual(this.hideUserCardList, queryResult.hideUserCardList);
        }

        public int hashCode() {
            int iHashCode = this.timeStamp.hashCode() * 31;
            List<CardInfo> list = this.userCardList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<CardInfo> list2 = this.hideUserCardList;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "QueryResult(timeStamp=" + this.timeStamp + ", userCardList=" + this.userCardList + ", hideUserCardList=" + this.hideUserCardList + ")";
        }
    }

    public UserSportsConfigReq(int i, @NotNull List<CardInfo> cardInfoList, @NotNull List<CardInfo> hideCardInfoList) {
        Intrinsics.checkNotNullParameter(cardInfoList, "cardInfoList");
        Intrinsics.checkNotNullParameter(hideCardInfoList, "hideCardInfoList");
        this.catalog = i;
        this.cardInfoList = cardInfoList;
        this.hideCardInfoList = hideCardInfoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSportsConfigReq copy$default(UserSportsConfigReq userSportsConfigReq, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSportsConfigReq.catalog;
        }
        if ((i2 & 2) != 0) {
            list = userSportsConfigReq.cardInfoList;
        }
        if ((i2 & 4) != 0) {
            list2 = userSportsConfigReq.hideCardInfoList;
        }
        return userSportsConfigReq.copy(i, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCatalog() {
        return this.catalog;
    }

    @NotNull
    public final List<CardInfo> component2() {
        return this.cardInfoList;
    }

    @NotNull
    public final List<CardInfo> component3() {
        return this.hideCardInfoList;
    }

    @NotNull
    public final UserSportsConfigReq copy(int catalog, @NotNull List<CardInfo> cardInfoList, @NotNull List<CardInfo> hideCardInfoList) {
        Intrinsics.checkNotNullParameter(cardInfoList, "cardInfoList");
        Intrinsics.checkNotNullParameter(hideCardInfoList, "hideCardInfoList");
        return new UserSportsConfigReq(catalog, cardInfoList, hideCardInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSportsConfigReq)) {
            return false;
        }
        UserSportsConfigReq userSportsConfigReq = (UserSportsConfigReq) other;
        return this.catalog == userSportsConfigReq.catalog && Intrinsics.areEqual(this.cardInfoList, userSportsConfigReq.cardInfoList) && Intrinsics.areEqual(this.hideCardInfoList, userSportsConfigReq.hideCardInfoList);
    }

    @NotNull
    public final List<CardInfo> getCardInfoList() {
        return this.cardInfoList;
    }

    public final int getCatalog() {
        return this.catalog;
    }

    @NotNull
    public final List<CardInfo> getHideCardInfoList() {
        return this.hideCardInfoList;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.catalog) * 31) + this.cardInfoList.hashCode()) * 31) + this.hideCardInfoList.hashCode();
    }

    public final void setCardInfoList(@NotNull List<CardInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cardInfoList = list;
    }

    public final void setCatalog(int i) {
        this.catalog = i;
    }

    public final void setHideCardInfoList(@NotNull List<CardInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.hideCardInfoList = list;
    }

    @NotNull
    public String toString() {
        return "UserSportsConfigReq(catalog=" + this.catalog + ", cardInfoList=" + this.cardInfoList + ", hideCardInfoList=" + this.hideCardInfoList + ")";
    }
}
