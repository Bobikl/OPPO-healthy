package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.home.bean.HomeIconColorType;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wji, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b'\u0010(Ji\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b$\u0010\u0017R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b#\u0010&¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/wji;", "", "", "accountNick", "avatarUrl", "", "fatReduceHr", "", "isShowNoData", y15.PARAMS_RECORD_COUNT, "hasEvaluate", "generalReview", "coachInfo", "", "Lcom/oplus/aiunit/vision/wji$a;", "items", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "Z", "i", "()Z", b2n.g, "f", "getHasEvaluate", b2n.f, "getCoachInfo", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportsHomeGeneralReviewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String accountNick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String avatarUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int fatReduceHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isShowNoData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int recordCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean hasEvaluate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReview;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final String coachInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Items> items;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.wji$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040$\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u0010<\u001a\u000207\u0012\b\b\u0002\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\t\u0010 \"\u0004\b!\u0010\"R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010%\u001a\u0004\b\u0011\u0010&\"\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\n\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\"\u0010<\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00108\u001a\u0004\b9\u0010:\"\u0004\b*\u0010;R\"\u0010>\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b=\u0010\u000e¨\u0006A"}, d2 = {"Lcom/oplus/aiunit/vision/wji$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getType", "()I", "setType", "(I)V", "type", "Lcom/heytap/sports/home/bean/HomeIconColorType;", "b", "Lcom/heytap/sports/home/bean/HomeIconColorType;", "c", "()Lcom/heytap/sports/home/bean/HomeIconColorType;", LogFieldKey.LEVEL_KEY, "(Lcom/heytap/sports/home/bean/HomeIconColorType;)V", "iconColorType", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", LogFieldKey.MESSAGE_KEY, "(Z)V", "isImprovement", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "evaluate", "", "Ljava/util/List;", "()Ljava/util/List;", MapSchema.FIELD_NAME_KEY, "(Ljava/util/List;)V", "evaluateDesc", "f", "Ljava/lang/Object;", "getChartData", "()Ljava/lang/Object;", b2n.f, "(Ljava/lang/Object;)V", "chartData", "getChartSelectedIndex", b2n.g, "chartSelectedIndex", "getChartType", "i", "chartType", "", UserInfo.SEX_FEMALE, "getAvg", "()F", "(F)V", "avg", "n", "textPriority", "<init>", "(ILcom/heytap/sports/home/bean/HomeIconColorType;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/util/List;IFI)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Items {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public int type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public HomeIconColorType iconColorType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean isImprovement;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public String evaluate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public List<String> evaluateDesc;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        public Object chartData;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public List<Integer> chartSelectedIndex;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public int chartType;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public float avg;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public int textPriority;

        public Items() {
            this(0, null, false, null, null, null, null, 0, 0.0f, 0, 1023, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEvaluate() {
            return this.evaluate;
        }

        @NotNull
        public final List<String> b() {
            return this.evaluateDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final HomeIconColorType getIconColorType() {
            return this.iconColorType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTextPriority() {
            return this.textPriority;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsImprovement() {
            return this.isImprovement;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Items)) {
                return false;
            }
            Items items = (Items) other;
            return this.type == items.type && this.iconColorType == items.iconColorType && this.isImprovement == items.isImprovement && Intrinsics.areEqual(this.evaluate, items.evaluate) && Intrinsics.areEqual(this.evaluateDesc, items.evaluateDesc) && Intrinsics.areEqual(this.chartData, items.chartData) && Intrinsics.areEqual(this.chartSelectedIndex, items.chartSelectedIndex) && this.chartType == items.chartType && Float.compare(this.avg, items.avg) == 0 && this.textPriority == items.textPriority;
        }

        public final void f(float f) {
            this.avg = f;
        }

        public final void g(@Nullable Object obj) {
            this.chartData = obj;
        }

        public final void h(@NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.chartSelectedIndex = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.type) * 31;
            HomeIconColorType homeIconColorType = this.iconColorType;
            int iHashCode2 = (iHashCode + (homeIconColorType == null ? 0 : homeIconColorType.hashCode())) * 31;
            boolean z = this.isImprovement;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int iHashCode3 = (((((iHashCode2 + r1) * 31) + this.evaluate.hashCode()) * 31) + this.evaluateDesc.hashCode()) * 31;
            Object obj = this.chartData;
            return ((((((((iHashCode3 + (obj != null ? obj.hashCode() : 0)) * 31) + this.chartSelectedIndex.hashCode()) * 31) + Integer.hashCode(this.chartType)) * 31) + Float.hashCode(this.avg)) * 31) + Integer.hashCode(this.textPriority);
        }

        public final void i(int i) {
            this.chartType = i;
        }

        public final void j(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.evaluate = str;
        }

        public final void k(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.evaluateDesc = list;
        }

        public final void l(@Nullable HomeIconColorType homeIconColorType) {
            this.iconColorType = homeIconColorType;
        }

        public final void m(boolean z) {
            this.isImprovement = z;
        }

        public final void n(int i) {
            this.textPriority = i;
        }

        @NotNull
        public String toString() {
            return "Items(type=" + this.type + ", iconColorType=" + this.iconColorType + ", isImprovement=" + this.isImprovement + ", evaluate=" + this.evaluate + ", evaluateDesc=" + this.evaluateDesc + ", chartData=" + this.chartData + ", chartSelectedIndex=" + this.chartSelectedIndex + ", chartType=" + this.chartType + ", avg=" + this.avg + ", textPriority=" + this.textPriority + ")";
        }

        public Items(int i, @Nullable HomeIconColorType homeIconColorType, boolean z, @NotNull String evaluate, @NotNull List<String> evaluateDesc, @Nullable Object obj, @NotNull List<Integer> chartSelectedIndex, int i2, float f, int i3) {
            Intrinsics.checkNotNullParameter(evaluate, "evaluate");
            Intrinsics.checkNotNullParameter(evaluateDesc, "evaluateDesc");
            Intrinsics.checkNotNullParameter(chartSelectedIndex, "chartSelectedIndex");
            this.type = i;
            this.iconColorType = homeIconColorType;
            this.isImprovement = z;
            this.evaluate = evaluate;
            this.evaluateDesc = evaluateDesc;
            this.chartData = obj;
            this.chartSelectedIndex = chartSelectedIndex;
            this.chartType = i2;
            this.avg = f;
            this.textPriority = i3;
        }

        public /* synthetic */ Items(int i, HomeIconColorType homeIconColorType, boolean z, String str, List list, Object obj, List list2, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? null : homeIconColorType, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 32) != 0 ? null : obj, (i4 & 64) != 0 ? new ArrayList() : list2, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0.0f : f, (i4 & 512) != 0 ? 1 : i3);
        }
    }

    public SportsHomeGeneralReviewBean() {
        this(null, null, 0, false, 0, false, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final SportsHomeGeneralReviewBean a(@NotNull String accountNick, @NotNull String avatarUrl, int fatReduceHr, boolean isShowNoData, int recordCount, boolean hasEvaluate, @NotNull String generalReview, @NotNull String coachInfo, @NotNull List<Items> items) {
        Intrinsics.checkNotNullParameter(accountNick, "accountNick");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(coachInfo, "coachInfo");
        Intrinsics.checkNotNullParameter(items, "items");
        return new SportsHomeGeneralReviewBean(accountNick, avatarUrl, fatReduceHr, isShowNoData, recordCount, hasEvaluate, generalReview, coachInfo, items);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccountNick() {
        return this.accountNick;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFatReduceHr() {
        return this.fatReduceHr;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsHomeGeneralReviewBean)) {
            return false;
        }
        SportsHomeGeneralReviewBean sportsHomeGeneralReviewBean = (SportsHomeGeneralReviewBean) other;
        return Intrinsics.areEqual(this.accountNick, sportsHomeGeneralReviewBean.accountNick) && Intrinsics.areEqual(this.avatarUrl, sportsHomeGeneralReviewBean.avatarUrl) && this.fatReduceHr == sportsHomeGeneralReviewBean.fatReduceHr && this.isShowNoData == sportsHomeGeneralReviewBean.isShowNoData && this.recordCount == sportsHomeGeneralReviewBean.recordCount && this.hasEvaluate == sportsHomeGeneralReviewBean.hasEvaluate && Intrinsics.areEqual(this.generalReview, sportsHomeGeneralReviewBean.generalReview) && Intrinsics.areEqual(this.coachInfo, sportsHomeGeneralReviewBean.coachInfo) && Intrinsics.areEqual(this.items, sportsHomeGeneralReviewBean.items);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGeneralReview() {
        return this.generalReview;
    }

    @NotNull
    public final List<Items> g() {
        return this.items;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRecordCount() {
        return this.recordCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.accountNick.hashCode() * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.fatReduceHr)) * 31;
        boolean z = this.isShowNoData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.recordCount)) * 31;
        boolean z2 = this.hasEvaluate;
        return ((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.generalReview.hashCode()) * 31) + this.coachInfo.hashCode()) * 31) + this.items.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsShowNoData() {
        return this.isShowNoData;
    }

    @NotNull
    public String toString() {
        return "SportsHomeGeneralReviewBean(accountNick=" + this.accountNick + ", avatarUrl=" + this.avatarUrl + ", fatReduceHr=" + this.fatReduceHr + ", isShowNoData=" + this.isShowNoData + ", recordCount=" + this.recordCount + ", hasEvaluate=" + this.hasEvaluate + ", generalReview=" + this.generalReview + ", coachInfo=" + this.coachInfo + ", items=" + this.items + ")";
    }

    public SportsHomeGeneralReviewBean(@NotNull String accountNick, @NotNull String avatarUrl, int i, boolean z, int i2, boolean z2, @NotNull String generalReview, @NotNull String coachInfo, @NotNull List<Items> items) {
        Intrinsics.checkNotNullParameter(accountNick, "accountNick");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(coachInfo, "coachInfo");
        Intrinsics.checkNotNullParameter(items, "items");
        this.accountNick = accountNick;
        this.avatarUrl = avatarUrl;
        this.fatReduceHr = i;
        this.isShowNoData = z;
        this.recordCount = i2;
        this.hasEvaluate = z2;
        this.generalReview = generalReview;
        this.coachInfo = coachInfo;
        this.items = items;
    }

    public /* synthetic */ SportsHomeGeneralReviewBean(String str, String str2, int i, boolean z, int i2, boolean z2, String str3, String str4, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? new ArrayList() : list);
    }
}
