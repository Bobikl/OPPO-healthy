package com.heytap.health.insight.data.datasource.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.insight.signs.BaseLineInfo;
import com.heytap.health.insight.signs.Info;
import com.heytap.health.insight.signs.TranslateText;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.y15;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J¢\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b'\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)¨\u0006>"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "", y15.PARAMS_DATA_TYPE, "", "baseLineInfo", "", "Lcom/heytap/health/insight/signs/BaseLineInfo;", "code", "", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/health/insight/signs/Info;", LogSenderConst.SUBTYPE, "translateText", "Lcom/heytap/health/insight/signs/TranslateText;", "type", "icon", "updateTime", "", "link", "chartType", "chart", "(ILjava/util/List;Ljava/lang/String;Lcom/heytap/health/insight/signs/Info;Ljava/lang/Integer;Lcom/heytap/health/insight/signs/TranslateText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseLineInfo", "()Ljava/util/List;", "getChart", "()Ljava/lang/String;", "getChartType", "getCode", "getDataType", "()I", "getIcon", "getInfo", "()Lcom/heytap/health/insight/signs/Info;", "getLink", "getSubType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTranslateText", "()Lcom/heytap/health/insight/signs/TranslateText;", "getType", "getUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/util/List;Ljava/lang/String;Lcom/heytap/health/insight/signs/Info;Ljava/lang/Integer;Lcom/heytap/health/insight/signs/TranslateText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IntegrateDataListItem {
    public static final int $stable = 8;

    @Nullable
    private final List<BaseLineInfo> baseLineInfo;

    @Nullable
    private final String chart;

    @Nullable
    private final String chartType;

    @Nullable
    private final String code;
    private final int dataType;

    @Nullable
    private final String icon;

    @Nullable
    private final Info info;

    @Nullable
    private final String link;

    @Nullable
    private final Integer subType;

    @Nullable
    private final TranslateText translateText;

    @Nullable
    private final Integer type;

    @Nullable
    private final Long updateTime;

    public IntegrateDataListItem(int i, @Nullable List<BaseLineInfo> list, @Nullable String str, @Nullable Info info, @Nullable Integer num, @Nullable TranslateText translateText, @Nullable Integer num2, @Nullable String str2, @Nullable Long l2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.dataType = i;
        this.baseLineInfo = list;
        this.code = str;
        this.info = info;
        this.subType = num;
        this.translateText = translateText;
        this.type = num2;
        this.icon = str2;
        this.updateTime = l2;
        this.link = str3;
        this.chartType = str4;
        this.chart = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChartType() {
        return this.chartType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getChart() {
        return this.chart;
    }

    @Nullable
    public final List<BaseLineInfo> component2() {
        return this.baseLineInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Info getInfo() {
        return this.info;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TranslateText getTranslateText() {
        return this.translateText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final IntegrateDataListItem copy(int dataType, @Nullable List<BaseLineInfo> baseLineInfo, @Nullable String code, @Nullable Info info, @Nullable Integer subType, @Nullable TranslateText translateText, @Nullable Integer type, @Nullable String icon, @Nullable Long updateTime, @Nullable String link, @Nullable String chartType, @Nullable String chart) {
        return new IntegrateDataListItem(dataType, baseLineInfo, code, info, subType, translateText, type, icon, updateTime, link, chartType, chart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrateDataListItem)) {
            return false;
        }
        IntegrateDataListItem integrateDataListItem = (IntegrateDataListItem) other;
        return this.dataType == integrateDataListItem.dataType && Intrinsics.areEqual(this.baseLineInfo, integrateDataListItem.baseLineInfo) && Intrinsics.areEqual(this.code, integrateDataListItem.code) && Intrinsics.areEqual(this.info, integrateDataListItem.info) && Intrinsics.areEqual(this.subType, integrateDataListItem.subType) && Intrinsics.areEqual(this.translateText, integrateDataListItem.translateText) && Intrinsics.areEqual(this.type, integrateDataListItem.type) && Intrinsics.areEqual(this.icon, integrateDataListItem.icon) && Intrinsics.areEqual(this.updateTime, integrateDataListItem.updateTime) && Intrinsics.areEqual(this.link, integrateDataListItem.link) && Intrinsics.areEqual(this.chartType, integrateDataListItem.chartType) && Intrinsics.areEqual(this.chart, integrateDataListItem.chart);
    }

    @Nullable
    public final List<BaseLineInfo> getBaseLineInfo() {
        return this.baseLineInfo;
    }

    @Nullable
    public final String getChart() {
        return this.chart;
    }

    @Nullable
    public final String getChartType() {
        return this.chartType;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Info getInfo() {
        return this.info;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Integer getSubType() {
        return this.subType;
    }

    @Nullable
    public final TranslateText getTranslateText() {
        return this.translateText;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dataType) * 31;
        List<BaseLineInfo> list = this.baseLineInfo;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.code;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Info info = this.info;
        int iHashCode4 = (iHashCode3 + (info == null ? 0 : info.hashCode())) * 31;
        Integer num = this.subType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        TranslateText translateText = this.translateText;
        int iHashCode6 = (iHashCode5 + (translateText == null ? 0 : translateText.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.updateTime;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.chartType;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chart;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IntegrateDataListItem(dataType=" + this.dataType + ", baseLineInfo=" + this.baseLineInfo + ", code=" + this.code + ", info=" + this.info + ", subType=" + this.subType + ", translateText=" + this.translateText + ", type=" + this.type + ", icon=" + this.icon + ", updateTime=" + this.updateTime + ", link=" + this.link + ", chartType=" + this.chartType + ", chart=" + this.chart + ")";
    }
}
