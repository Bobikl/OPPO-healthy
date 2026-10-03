package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.d2e, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018BÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b6\u00107JÓ\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b&\u0010)R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b\"\u0010)R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b*\u00100R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u00100R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00100R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b1\u00100R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b5\u00100R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b3\u00100¨\u00068"}, d2 = {"Lcom/oplus/aiunit/vision/d2e;", "", "", "generalReview", "generalReviewHighlight", "Lkotlin/Pair;", "", "nearPace", "nearPaceStr", "avgPace", "avgOther", "selectedIndex", "", "showNearPace", "", "Lcom/oplus/aiunit/vision/d2e$a;", "items", "validIndex", "paceHighlightIndex", "otherHighlightIndex", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "paceList", "otherList", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "b", "f", "c", "Lkotlin/Pair;", b2n.g, "()Lkotlin/Pair;", "d", "i", "I", "()I", b2n.f, "n", "Z", "o", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "j", LogFieldKey.PROCESS_NAME_KEY, MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;IIIZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaceContrastBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReview;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReviewHighlight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Pair<Integer, Integer> nearPace;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String nearPaceStr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int avgPace;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int avgOther;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final int selectedIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean showNearPace;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Item> items;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<Integer> validIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Integer> paceHighlightIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<Integer> otherHighlightIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<TimeStampedData> paceList;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<TimeStampedData> otherList;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.d2e$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/d2e$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Feedback.WIDGET_LABEL, "b", "value", "c", "valueStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Item {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String valueStr;

        public Item(@NotNull String label, @NotNull String value, @NotNull String valueStr) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(valueStr, "valueStr");
            this.label = label;
            this.value = value;
            this.valueStr = valueStr;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValueStr() {
            return this.valueStr;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.label, item.label) && Intrinsics.areEqual(this.value, item.value) && Intrinsics.areEqual(this.valueStr, item.valueStr);
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + this.valueStr.hashCode();
        }

        @NotNull
        public String toString() {
            return "Item(label=" + this.label + ", value=" + this.value + ", valueStr=" + this.valueStr + ")";
        }
    }

    public PaceContrastBean() {
        this(null, null, null, null, 0, 0, 0, false, null, null, null, null, null, null, 16383, null);
    }

    @NotNull
    public final PaceContrastBean a(@NotNull String generalReview, @NotNull String generalReviewHighlight, @Nullable Pair<Integer, Integer> nearPace, @NotNull String nearPaceStr, int avgPace, int avgOther, int selectedIndex, boolean showNearPace, @Nullable List<Item> items, @Nullable List<Integer> validIndex, @Nullable List<Integer> paceHighlightIndex, @Nullable List<Integer> otherHighlightIndex, @Nullable List<? extends TimeStampedData> paceList, @Nullable List<? extends TimeStampedData> otherList) {
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(generalReviewHighlight, "generalReviewHighlight");
        Intrinsics.checkNotNullParameter(nearPaceStr, "nearPaceStr");
        return new PaceContrastBean(generalReview, generalReviewHighlight, nearPace, nearPaceStr, avgPace, avgOther, selectedIndex, showNearPace, items, validIndex, paceHighlightIndex, otherHighlightIndex, paceList, otherList);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAvgOther() {
        return this.avgOther;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAvgPace() {
        return this.avgPace;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getGeneralReview() {
        return this.generalReview;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceContrastBean)) {
            return false;
        }
        PaceContrastBean paceContrastBean = (PaceContrastBean) other;
        return Intrinsics.areEqual(this.generalReview, paceContrastBean.generalReview) && Intrinsics.areEqual(this.generalReviewHighlight, paceContrastBean.generalReviewHighlight) && Intrinsics.areEqual(this.nearPace, paceContrastBean.nearPace) && Intrinsics.areEqual(this.nearPaceStr, paceContrastBean.nearPaceStr) && this.avgPace == paceContrastBean.avgPace && this.avgOther == paceContrastBean.avgOther && this.selectedIndex == paceContrastBean.selectedIndex && this.showNearPace == paceContrastBean.showNearPace && Intrinsics.areEqual(this.items, paceContrastBean.items) && Intrinsics.areEqual(this.validIndex, paceContrastBean.validIndex) && Intrinsics.areEqual(this.paceHighlightIndex, paceContrastBean.paceHighlightIndex) && Intrinsics.areEqual(this.otherHighlightIndex, paceContrastBean.otherHighlightIndex) && Intrinsics.areEqual(this.paceList, paceContrastBean.paceList) && Intrinsics.areEqual(this.otherList, paceContrastBean.otherList);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGeneralReviewHighlight() {
        return this.generalReviewHighlight;
    }

    @Nullable
    public final List<Item> g() {
        return this.items;
    }

    @Nullable
    public final Pair<Integer, Integer> h() {
        return this.nearPace;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37 */
    public int hashCode() {
        int iHashCode = ((this.generalReview.hashCode() * 31) + this.generalReviewHighlight.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.nearPace;
        int iHashCode2 = (((((((((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31) + this.nearPaceStr.hashCode()) * 31) + Integer.hashCode(this.avgPace)) * 31) + Integer.hashCode(this.avgOther)) * 31) + Integer.hashCode(this.selectedIndex)) * 31;
        boolean z = this.showNearPace;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        List<Item> list = this.items;
        int iHashCode3 = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.validIndex;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.paceHighlightIndex;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.otherHighlightIndex;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TimeStampedData> list5 = this.paceList;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TimeStampedData> list6 = this.otherList;
        return iHashCode7 + (list6 != null ? list6.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getNearPaceStr() {
        return this.nearPaceStr;
    }

    @Nullable
    public final List<Integer> j() {
        return this.otherHighlightIndex;
    }

    @Nullable
    public final List<TimeStampedData> k() {
        return this.otherList;
    }

    @Nullable
    public final List<Integer> l() {
        return this.paceHighlightIndex;
    }

    @Nullable
    public final List<TimeStampedData> m() {
        return this.paceList;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShowNearPace() {
        return this.showNearPace;
    }

    @Nullable
    public final List<Integer> p() {
        return this.validIndex;
    }

    @NotNull
    public String toString() {
        return "PaceContrastBean(generalReview=" + this.generalReview + ", generalReviewHighlight=" + this.generalReviewHighlight + ", nearPace=" + this.nearPace + ", nearPaceStr=" + this.nearPaceStr + ", avgPace=" + this.avgPace + ", avgOther=" + this.avgOther + ", selectedIndex=" + this.selectedIndex + ", showNearPace=" + this.showNearPace + ", items=" + this.items + ", validIndex=" + this.validIndex + ", paceHighlightIndex=" + this.paceHighlightIndex + ", otherHighlightIndex=" + this.otherHighlightIndex + ", paceList=" + this.paceList + ", otherList=" + this.otherList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaceContrastBean(@NotNull String generalReview, @NotNull String generalReviewHighlight, @Nullable Pair<Integer, Integer> pair, @NotNull String nearPaceStr, int i, int i2, int i3, boolean z, @Nullable List<Item> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable List<? extends TimeStampedData> list5, @Nullable List<? extends TimeStampedData> list6) {
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(generalReviewHighlight, "generalReviewHighlight");
        Intrinsics.checkNotNullParameter(nearPaceStr, "nearPaceStr");
        this.generalReview = generalReview;
        this.generalReviewHighlight = generalReviewHighlight;
        this.nearPace = pair;
        this.nearPaceStr = nearPaceStr;
        this.avgPace = i;
        this.avgOther = i2;
        this.selectedIndex = i3;
        this.showNearPace = z;
        this.items = list;
        this.validIndex = list2;
        this.paceHighlightIndex = list3;
        this.otherHighlightIndex = list4;
        this.paceList = list5;
        this.otherList = list6;
    }

    public /* synthetic */ PaceContrastBean(String str, String str2, Pair pair, String str3, int i, int i2, int i3, boolean z, List list, List list2, List list3, List list4, List list5, List list6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? null : pair, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? -1 : i, (i4 & 32) != 0 ? -1 : i2, (i4 & 64) == 0 ? i3 : -1, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : list2, (i4 & 1024) != 0 ? null : list3, (i4 & 2048) != 0 ? null : list4, (i4 & 4096) != 0 ? null : list5, (i4 & 8192) == 0 ? list6 : null);
    }
}
