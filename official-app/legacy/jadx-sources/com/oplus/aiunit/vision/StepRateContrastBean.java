package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.sports.coach.tips.bean.CoachTipsRunningCourseBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bti, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010-J\u0097\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b)\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b'\u0010+¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/bti;", "", "", "generalReview", "generalReviewHighlight", "", "selectedIndex", "chartDesc", "", "Lcom/oplus/aiunit/vision/bti$a;", "items", "validIndex", "highlightIndex", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "stepRateList", "touchdownTimeList", "Lcom/heytap/sports/coach/tips/bean/CoachTipsRunningCourseBean;", "runningCourseDetailBean", "a", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", MapSchema.FIELD_NAME_ENTRY, "c", "I", "i", "()I", "Ljava/util/List;", b2n.f, "()Ljava/util/List;", "f", LogFieldKey.LEVEL_KEY, b2n.g, "j", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/sports/coach/tips/bean/CoachTipsRunningCourseBean;", "()Lcom/heytap/sports/coach/tips/bean/CoachTipsRunningCourseBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/heytap/sports/coach/tips/bean/CoachTipsRunningCourseBean;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StepRateContrastBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReview;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReviewHighlight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int selectedIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String chartDesc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<Item> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Integer> validIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Integer> highlightIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<TimeStampedData> stepRateList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<TimeStampedData> touchdownTimeList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final CoachTipsRunningCourseBean runningCourseDetailBean;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bti$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/bti$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Feedback.WIDGET_LABEL, "b", "value", "c", "valueStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
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

    public StepRateContrastBean() {
        this(null, null, 0, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final StepRateContrastBean a(@NotNull String generalReview, @NotNull String generalReviewHighlight, int selectedIndex, @NotNull String chartDesc, @Nullable List<Item> items, @Nullable List<Integer> validIndex, @Nullable List<Integer> highlightIndex, @Nullable List<? extends TimeStampedData> stepRateList, @Nullable List<? extends TimeStampedData> touchdownTimeList, @Nullable CoachTipsRunningCourseBean runningCourseDetailBean) {
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(generalReviewHighlight, "generalReviewHighlight");
        Intrinsics.checkNotNullParameter(chartDesc, "chartDesc");
        return new StepRateContrastBean(generalReview, generalReviewHighlight, selectedIndex, chartDesc, items, validIndex, highlightIndex, stepRateList, touchdownTimeList, runningCourseDetailBean);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChartDesc() {
        return this.chartDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGeneralReview() {
        return this.generalReview;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getGeneralReviewHighlight() {
        return this.generalReviewHighlight;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepRateContrastBean)) {
            return false;
        }
        StepRateContrastBean stepRateContrastBean = (StepRateContrastBean) other;
        return Intrinsics.areEqual(this.generalReview, stepRateContrastBean.generalReview) && Intrinsics.areEqual(this.generalReviewHighlight, stepRateContrastBean.generalReviewHighlight) && this.selectedIndex == stepRateContrastBean.selectedIndex && Intrinsics.areEqual(this.chartDesc, stepRateContrastBean.chartDesc) && Intrinsics.areEqual(this.items, stepRateContrastBean.items) && Intrinsics.areEqual(this.validIndex, stepRateContrastBean.validIndex) && Intrinsics.areEqual(this.highlightIndex, stepRateContrastBean.highlightIndex) && Intrinsics.areEqual(this.stepRateList, stepRateContrastBean.stepRateList) && Intrinsics.areEqual(this.touchdownTimeList, stepRateContrastBean.touchdownTimeList) && Intrinsics.areEqual(this.runningCourseDetailBean, stepRateContrastBean.runningCourseDetailBean);
    }

    @Nullable
    public final List<Integer> f() {
        return this.highlightIndex;
    }

    @Nullable
    public final List<Item> g() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final CoachTipsRunningCourseBean getRunningCourseDetailBean() {
        return this.runningCourseDetailBean;
    }

    public int hashCode() {
        int iHashCode = ((((((this.generalReview.hashCode() * 31) + this.generalReviewHighlight.hashCode()) * 31) + Integer.hashCode(this.selectedIndex)) * 31) + this.chartDesc.hashCode()) * 31;
        List<Item> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.validIndex;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.highlightIndex;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TimeStampedData> list4 = this.stepRateList;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TimeStampedData> list5 = this.touchdownTimeList;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        CoachTipsRunningCourseBean coachTipsRunningCourseBean = this.runningCourseDetailBean;
        return iHashCode6 + (coachTipsRunningCourseBean != null ? coachTipsRunningCourseBean.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Nullable
    public final List<TimeStampedData> j() {
        return this.stepRateList;
    }

    @Nullable
    public final List<TimeStampedData> k() {
        return this.touchdownTimeList;
    }

    @Nullable
    public final List<Integer> l() {
        return this.validIndex;
    }

    @NotNull
    public String toString() {
        return "StepRateContrastBean(generalReview=" + this.generalReview + ", generalReviewHighlight=" + this.generalReviewHighlight + ", selectedIndex=" + this.selectedIndex + ", chartDesc=" + this.chartDesc + ", items=" + this.items + ", validIndex=" + this.validIndex + ", highlightIndex=" + this.highlightIndex + ", stepRateList=" + this.stepRateList + ", touchdownTimeList=" + this.touchdownTimeList + ", runningCourseDetailBean=" + this.runningCourseDetailBean + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepRateContrastBean(@NotNull String generalReview, @NotNull String generalReviewHighlight, int i, @NotNull String chartDesc, @Nullable List<Item> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<? extends TimeStampedData> list4, @Nullable List<? extends TimeStampedData> list5, @Nullable CoachTipsRunningCourseBean coachTipsRunningCourseBean) {
        Intrinsics.checkNotNullParameter(generalReview, "generalReview");
        Intrinsics.checkNotNullParameter(generalReviewHighlight, "generalReviewHighlight");
        Intrinsics.checkNotNullParameter(chartDesc, "chartDesc");
        this.generalReview = generalReview;
        this.generalReviewHighlight = generalReviewHighlight;
        this.selectedIndex = i;
        this.chartDesc = chartDesc;
        this.items = list;
        this.validIndex = list2;
        this.highlightIndex = list3;
        this.stepRateList = list4;
        this.touchdownTimeList = list5;
        this.runningCourseDetailBean = coachTipsRunningCourseBean;
    }

    public /* synthetic */ StepRateContrastBean(String str, String str2, int i, String str3, List list, List list2, List list3, List list4, List list5, CoachTipsRunningCourseBean coachTipsRunningCourseBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : list3, (i2 & 128) != 0 ? null : list4, (i2 & 256) != 0 ? null : list5, (i2 & 512) != 0 ? null : coachTipsRunningCourseBean);
    }
}
