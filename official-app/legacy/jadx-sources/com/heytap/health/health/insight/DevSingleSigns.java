package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\u008f\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lcom/heytap/health/health/insight/DevSingleSigns;", "", "signsDataType", "", "appLegend", "", "deviceLegend", "yDesc", "baseDesc", "valueList", "", "baseLines", "safeUpperLimits", "safeLowerLimit", "totalBaseLineDays", "curBaseLineDays", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;II)V", "getAppLegend", "()Ljava/lang/String;", "getBaseDesc", "getBaseLines", "()Ljava/util/List;", "getCurBaseLineDays", "()I", "getDeviceLegend", "getSafeLowerLimit", "getSafeUpperLimits", "getSignsDataType", "getTotalBaseLineDays", "getValueList", "getYDesc", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevSingleSigns {

    @NotNull
    private final String appLegend;

    @NotNull
    private final String baseDesc;

    @NotNull
    private final List<String> baseLines;
    private final int curBaseLineDays;

    @NotNull
    private final String deviceLegend;

    @NotNull
    private final List<String> safeLowerLimit;

    @NotNull
    private final List<String> safeUpperLimits;
    private final int signsDataType;
    private final int totalBaseLineDays;

    @NotNull
    private final List<String> valueList;

    @NotNull
    private final String yDesc;

    public DevSingleSigns(int i, @NotNull String appLegend, @NotNull String deviceLegend, @NotNull String yDesc, @NotNull String baseDesc, @NotNull List<String> valueList, @NotNull List<String> baseLines, @NotNull List<String> safeUpperLimits, @NotNull List<String> safeLowerLimit, int i2, int i3) {
        Intrinsics.checkNotNullParameter(appLegend, "appLegend");
        Intrinsics.checkNotNullParameter(deviceLegend, "deviceLegend");
        Intrinsics.checkNotNullParameter(yDesc, "yDesc");
        Intrinsics.checkNotNullParameter(baseDesc, "baseDesc");
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        Intrinsics.checkNotNullParameter(baseLines, "baseLines");
        Intrinsics.checkNotNullParameter(safeUpperLimits, "safeUpperLimits");
        Intrinsics.checkNotNullParameter(safeLowerLimit, "safeLowerLimit");
        this.signsDataType = i;
        this.appLegend = appLegend;
        this.deviceLegend = deviceLegend;
        this.yDesc = yDesc;
        this.baseDesc = baseDesc;
        this.valueList = valueList;
        this.baseLines = baseLines;
        this.safeUpperLimits = safeUpperLimits;
        this.safeLowerLimit = safeLowerLimit;
        this.totalBaseLineDays = i2;
        this.curBaseLineDays = i3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSignsDataType() {
        return this.signsDataType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTotalBaseLineDays() {
        return this.totalBaseLineDays;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getCurBaseLineDays() {
        return this.curBaseLineDays;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppLegend() {
        return this.appLegend;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceLegend() {
        return this.deviceLegend;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getYDesc() {
        return this.yDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseDesc() {
        return this.baseDesc;
    }

    @NotNull
    public final List<String> component6() {
        return this.valueList;
    }

    @NotNull
    public final List<String> component7() {
        return this.baseLines;
    }

    @NotNull
    public final List<String> component8() {
        return this.safeUpperLimits;
    }

    @NotNull
    public final List<String> component9() {
        return this.safeLowerLimit;
    }

    @NotNull
    public final DevSingleSigns copy(int signsDataType, @NotNull String appLegend, @NotNull String deviceLegend, @NotNull String yDesc, @NotNull String baseDesc, @NotNull List<String> valueList, @NotNull List<String> baseLines, @NotNull List<String> safeUpperLimits, @NotNull List<String> safeLowerLimit, int totalBaseLineDays, int curBaseLineDays) {
        Intrinsics.checkNotNullParameter(appLegend, "appLegend");
        Intrinsics.checkNotNullParameter(deviceLegend, "deviceLegend");
        Intrinsics.checkNotNullParameter(yDesc, "yDesc");
        Intrinsics.checkNotNullParameter(baseDesc, "baseDesc");
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        Intrinsics.checkNotNullParameter(baseLines, "baseLines");
        Intrinsics.checkNotNullParameter(safeUpperLimits, "safeUpperLimits");
        Intrinsics.checkNotNullParameter(safeLowerLimit, "safeLowerLimit");
        return new DevSingleSigns(signsDataType, appLegend, deviceLegend, yDesc, baseDesc, valueList, baseLines, safeUpperLimits, safeLowerLimit, totalBaseLineDays, curBaseLineDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevSingleSigns)) {
            return false;
        }
        DevSingleSigns devSingleSigns = (DevSingleSigns) other;
        return this.signsDataType == devSingleSigns.signsDataType && Intrinsics.areEqual(this.appLegend, devSingleSigns.appLegend) && Intrinsics.areEqual(this.deviceLegend, devSingleSigns.deviceLegend) && Intrinsics.areEqual(this.yDesc, devSingleSigns.yDesc) && Intrinsics.areEqual(this.baseDesc, devSingleSigns.baseDesc) && Intrinsics.areEqual(this.valueList, devSingleSigns.valueList) && Intrinsics.areEqual(this.baseLines, devSingleSigns.baseLines) && Intrinsics.areEqual(this.safeUpperLimits, devSingleSigns.safeUpperLimits) && Intrinsics.areEqual(this.safeLowerLimit, devSingleSigns.safeLowerLimit) && this.totalBaseLineDays == devSingleSigns.totalBaseLineDays && this.curBaseLineDays == devSingleSigns.curBaseLineDays;
    }

    @NotNull
    public final String getAppLegend() {
        return this.appLegend;
    }

    @NotNull
    public final String getBaseDesc() {
        return this.baseDesc;
    }

    @NotNull
    public final List<String> getBaseLines() {
        return this.baseLines;
    }

    public final int getCurBaseLineDays() {
        return this.curBaseLineDays;
    }

    @NotNull
    public final String getDeviceLegend() {
        return this.deviceLegend;
    }

    @NotNull
    public final List<String> getSafeLowerLimit() {
        return this.safeLowerLimit;
    }

    @NotNull
    public final List<String> getSafeUpperLimits() {
        return this.safeUpperLimits;
    }

    public final int getSignsDataType() {
        return this.signsDataType;
    }

    public final int getTotalBaseLineDays() {
        return this.totalBaseLineDays;
    }

    @NotNull
    public final List<String> getValueList() {
        return this.valueList;
    }

    @NotNull
    public final String getYDesc() {
        return this.yDesc;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.signsDataType) * 31) + this.appLegend.hashCode()) * 31) + this.deviceLegend.hashCode()) * 31) + this.yDesc.hashCode()) * 31) + this.baseDesc.hashCode()) * 31) + this.valueList.hashCode()) * 31) + this.baseLines.hashCode()) * 31) + this.safeUpperLimits.hashCode()) * 31) + this.safeLowerLimit.hashCode()) * 31) + Integer.hashCode(this.totalBaseLineDays)) * 31) + Integer.hashCode(this.curBaseLineDays);
    }

    @NotNull
    public String toString() {
        return "DevSingleSigns(signsDataType=" + this.signsDataType + ", appLegend=" + this.appLegend + ", deviceLegend=" + this.deviceLegend + ", yDesc=" + this.yDesc + ", baseDesc=" + this.baseDesc + ", valueList=" + this.valueList + ", baseLines=" + this.baseLines + ", safeUpperLimits=" + this.safeUpperLimits + ", safeLowerLimit=" + this.safeLowerLimit + ", totalBaseLineDays=" + this.totalBaseLineDays + ", curBaseLineDays=" + this.curBaseLineDays + ")";
    }
}
