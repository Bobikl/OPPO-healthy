package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u008f\u0001\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lcom/heytap/health/insight/signs/SignsBeanItem;", "", "baseLineInfo", "", "Lcom/heytap/health/insight/signs/BaseLineInfo;", "code", "", "date", "", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/health/insight/signs/Info;", LogSenderConst.SUBTYPE, "translateText", "Lcom/heytap/health/insight/signs/TranslateText;", "type", "icon", "updateTime", "", "link", "chartType", "chart", "(Ljava/util/List;Ljava/lang/String;ILcom/heytap/health/insight/signs/Info;ILcom/heytap/health/insight/signs/TranslateText;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseLineInfo", "()Ljava/util/List;", "getChart", "()Ljava/lang/String;", "getChartType", "getCode", "getDate", "()I", "getIcon", "getInfo", "()Lcom/heytap/health/insight/signs/Info;", "getLink", "getSubType", "getTranslateText", "()Lcom/heytap/health/insight/signs/TranslateText;", "getType", "getUpdateTime", "()J", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SignsBeanItem {
    public static final int $stable = 8;

    @Nullable
    private final List<BaseLineInfo> baseLineInfo;

    @NotNull
    private final String chart;

    @NotNull
    private final String chartType;

    @Nullable
    private final String code;
    private final int date;

    @NotNull
    private final String icon;

    @Nullable
    private final Info info;

    @NotNull
    private final String link;
    private final int subType;

    @Nullable
    private final TranslateText translateText;
    private final int type;
    private final long updateTime;

    public SignsBeanItem(@Nullable List<BaseLineInfo> list, @Nullable String str, int i, @Nullable Info info, int i2, @Nullable TranslateText translateText, int i3, @NotNull String icon, long j2, @NotNull String link, @NotNull String chartType, @NotNull String chart) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.baseLineInfo = list;
        this.code = str;
        this.date = i;
        this.info = info;
        this.subType = i2;
        this.translateText = translateText;
        this.type = i3;
        this.icon = icon;
        this.updateTime = j2;
        this.link = link;
        this.chartType = chartType;
        this.chart = chart;
    }

    @Nullable
    public final List<BaseLineInfo> component1() {
        return this.baseLineInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChartType() {
        return this.chartType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getChart() {
        return this.chart;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Info getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TranslateText getTranslateText() {
        return this.translateText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final SignsBeanItem copy(@Nullable List<BaseLineInfo> baseLineInfo, @Nullable String code, int date, @Nullable Info info, int subType, @Nullable TranslateText translateText, int type, @NotNull String icon, long updateTime, @NotNull String link, @NotNull String chartType, @NotNull String chart) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new SignsBeanItem(baseLineInfo, code, date, info, subType, translateText, type, icon, updateTime, link, chartType, chart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignsBeanItem)) {
            return false;
        }
        SignsBeanItem signsBeanItem = (SignsBeanItem) other;
        return Intrinsics.areEqual(this.baseLineInfo, signsBeanItem.baseLineInfo) && Intrinsics.areEqual(this.code, signsBeanItem.code) && this.date == signsBeanItem.date && Intrinsics.areEqual(this.info, signsBeanItem.info) && this.subType == signsBeanItem.subType && Intrinsics.areEqual(this.translateText, signsBeanItem.translateText) && this.type == signsBeanItem.type && Intrinsics.areEqual(this.icon, signsBeanItem.icon) && this.updateTime == signsBeanItem.updateTime && Intrinsics.areEqual(this.link, signsBeanItem.link) && Intrinsics.areEqual(this.chartType, signsBeanItem.chartType) && Intrinsics.areEqual(this.chart, signsBeanItem.chart);
    }

    @Nullable
    public final List<BaseLineInfo> getBaseLineInfo() {
        return this.baseLineInfo;
    }

    @NotNull
    public final String getChart() {
        return this.chart;
    }

    @NotNull
    public final String getChartType() {
        return this.chartType;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Info getInfo() {
        return this.info;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final int getSubType() {
        return this.subType;
    }

    @Nullable
    public final TranslateText getTranslateText() {
        return this.translateText;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        List<BaseLineInfo> list = this.baseLineInfo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.date)) * 31;
        Info info = this.info;
        int iHashCode3 = (((iHashCode2 + (info == null ? 0 : info.hashCode())) * 31) + Integer.hashCode(this.subType)) * 31;
        TranslateText translateText = this.translateText;
        return ((((((((((((iHashCode3 + (translateText != null ? translateText.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + this.icon.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.link.hashCode()) * 31) + this.chartType.hashCode()) * 31) + this.chart.hashCode();
    }

    @NotNull
    public String toString() {
        return "SignsBeanItem(baseLineInfo=" + this.baseLineInfo + ", code=" + this.code + ", date=" + this.date + ", info=" + this.info + ", subType=" + this.subType + ", translateText=" + this.translateText + ", type=" + this.type + ", icon=" + this.icon + ", updateTime=" + this.updateTime + ", link=" + this.link + ", chartType=" + this.chartType + ", chart=" + this.chart + ")";
    }
}
