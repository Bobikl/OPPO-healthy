package com.heytap.sports.coach.tips.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u0013\u0010!R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"Lcom/heytap/sports/coach/tips/bean/BurnFatCardUIBean;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/sports/coach/tips/bean/BurnFatCardType;", "a", "Lcom/heytap/sports/coach/tips/bean/BurnFatCardType;", "b", "()Lcom/heytap/sports/coach/tips/bean/BurnFatCardType;", "cardType", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "level", "c", "Ljava/lang/String;", b2n.f, "()Ljava/lang/String;", "tipTitle", "d", "f", "tipContent", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "lastValue", "avgValue", "Lcom/heytap/sports/coach/tips/bean/BurnFatChartUIBean;", "Lcom/heytap/sports/coach/tips/bean/BurnFatChartUIBean;", "()Lcom/heytap/sports/coach/tips/bean/BurnFatChartUIBean;", "chartData", "Lkotlin/Function1;", b2n.g, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "valueFormatter", "<init>", "(Lcom/heytap/sports/coach/tips/bean/BurnFatCardType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/heytap/sports/coach/tips/bean/BurnFatChartUIBean;Lkotlin/jvm/functions/Function1;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BurnFatCardUIBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final BurnFatCardType cardType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int level;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String tipTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String tipContent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Integer lastValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer avgValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final BurnFatChartUIBean chartData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Integer, String> valueFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public BurnFatCardUIBean(@NotNull BurnFatCardType cardType, int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @NotNull BurnFatChartUIBean chartData, @NotNull Function1<? super Integer, String> valueFormatter) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(valueFormatter, "valueFormatter");
        this.cardType = cardType;
        this.level = i;
        this.tipTitle = str;
        this.tipContent = str2;
        this.lastValue = num;
        this.avgValue = num2;
        this.chartData = chartData;
        this.valueFormatter = valueFormatter;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BurnFatCardType getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BurnFatChartUIBean getChartData() {
        return this.chartData;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getLastValue() {
        return this.lastValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurnFatCardUIBean)) {
            return false;
        }
        BurnFatCardUIBean burnFatCardUIBean = (BurnFatCardUIBean) other;
        return this.cardType == burnFatCardUIBean.cardType && this.level == burnFatCardUIBean.level && Intrinsics.areEqual(this.tipTitle, burnFatCardUIBean.tipTitle) && Intrinsics.areEqual(this.tipContent, burnFatCardUIBean.tipContent) && Intrinsics.areEqual(this.lastValue, burnFatCardUIBean.lastValue) && Intrinsics.areEqual(this.avgValue, burnFatCardUIBean.avgValue) && Intrinsics.areEqual(this.chartData, burnFatCardUIBean.chartData) && Intrinsics.areEqual(this.valueFormatter, burnFatCardUIBean.valueFormatter);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTipContent() {
        return this.tipContent;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTipTitle() {
        return this.tipTitle;
    }

    @NotNull
    public final Function1<Integer, String> h() {
        return this.valueFormatter;
    }

    public int hashCode() {
        int iHashCode = ((this.cardType.hashCode() * 31) + Integer.hashCode(this.level)) * 31;
        String str = this.tipTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tipContent;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.lastValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.avgValue;
        return ((((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.chartData.hashCode()) * 31) + this.valueFormatter.hashCode();
    }

    @NotNull
    public String toString() {
        return "BurnFatCardUIBean(cardType=" + this.cardType + ", level=" + this.level + ", tipTitle=" + this.tipTitle + ", tipContent=" + this.tipContent + ", lastValue=" + this.lastValue + ", avgValue=" + this.avgValue + ", chartData=" + this.chartData + ", valueFormatter=" + this.valueFormatter + ")";
    }

    public /* synthetic */ BurnFatCardUIBean(BurnFatCardType burnFatCardType, int i, String str, String str2, Integer num, Integer num2, BurnFatChartUIBean burnFatChartUIBean, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(burnFatCardType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num, (i2 & 32) == 0 ? num2 : null, (i2 & 64) != 0 ? new BurnFatChartUIBean(0, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : burnFatChartUIBean, (i2 & 128) != 0 ? new Function1<Integer, String>() { // from class: com.heytap.sports.coach.tips.bean.BurnFatCardUIBean.1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Integer num3) {
                return invoke(num3.intValue());
            }

            @NotNull
            public final String invoke(int i3) {
                return String.valueOf(i3);
            }
        } : function1);
    }
}
