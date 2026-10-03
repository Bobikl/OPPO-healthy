package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.v9g;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u0099\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\b\u0010>\u001a\u00020\bH\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006?"}, d2 = {"Lcom/heytap/health/health/insight/DevSignsData;", "", "updateTime", "", "signsType", "", "status", "code", "", "appTitle", "appContent", "deviceTitle", "deviceContent", "icon", "link", "signsDataContent", "Lcom/heytap/health/health/insight/SignsDataContent;", "signsChartContent", "Lcom/heytap/health/health/insight/SignsChart;", BaseDataPack.KEY_EXTRA_MSG, "Lcom/google/gson/JsonObject;", "ssoid", "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/health/insight/SignsDataContent;Lcom/heytap/health/health/insight/SignsChart;Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "getAppContent", "()Ljava/lang/String;", "getAppTitle", "getCode", "getDeviceContent", "getDeviceTitle", "getExtraMsg", "()Lcom/google/gson/JsonObject;", "getIcon", "getLink", "getSignsChartContent", "()Lcom/heytap/health/health/insight/SignsChart;", "getSignsDataContent", "()Lcom/heytap/health/health/insight/SignsDataContent;", "getSignsType", "()I", "getSsoid", "getStatus", "getUpdateTime", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevSignsData {

    @NotNull
    private final String appContent;

    @NotNull
    private final String appTitle;

    @NotNull
    private final String code;

    @NotNull
    private final String deviceContent;

    @NotNull
    private final String deviceTitle;

    @Nullable
    private final JsonObject extraMsg;

    @NotNull
    private final String icon;

    @NotNull
    private final String link;

    @Nullable
    private final SignsChart signsChartContent;

    @NotNull
    private final SignsDataContent signsDataContent;
    private final int signsType;

    @NotNull
    private final String ssoid;
    private final int status;
    private final long updateTime;

    public DevSignsData(long j2, int i, int i2, @NotNull String code, @NotNull String appTitle, @NotNull String appContent, @NotNull String deviceTitle, @NotNull String deviceContent, @NotNull String icon, @NotNull String link, @NotNull SignsDataContent signsDataContent, @Nullable SignsChart signsChart, @Nullable JsonObject jsonObject, @NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(appTitle, "appTitle");
        Intrinsics.checkNotNullParameter(appContent, "appContent");
        Intrinsics.checkNotNullParameter(deviceTitle, "deviceTitle");
        Intrinsics.checkNotNullParameter(deviceContent, "deviceContent");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(signsDataContent, "signsDataContent");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.updateTime = j2;
        this.signsType = i;
        this.status = i2;
        this.code = code;
        this.appTitle = appTitle;
        this.appContent = appContent;
        this.deviceTitle = deviceTitle;
        this.deviceContent = deviceContent;
        this.icon = icon;
        this.link = link;
        this.signsDataContent = signsDataContent;
        this.signsChartContent = signsChart;
        this.extraMsg = jsonObject;
        this.ssoid = ssoid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SignsDataContent getSignsDataContent() {
        return this.signsDataContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SignsChart getSignsChartContent() {
        return this.signsChartContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final JsonObject getExtraMsg() {
        return this.extraMsg;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSignsType() {
        return this.signsType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppTitle() {
        return this.appTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppContent() {
        return this.appContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceTitle() {
        return this.deviceTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceContent() {
        return this.deviceContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final DevSignsData copy(long updateTime, int signsType, int status, @NotNull String code, @NotNull String appTitle, @NotNull String appContent, @NotNull String deviceTitle, @NotNull String deviceContent, @NotNull String icon, @NotNull String link, @NotNull SignsDataContent signsDataContent, @Nullable SignsChart signsChartContent, @Nullable JsonObject extraMsg, @NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(appTitle, "appTitle");
        Intrinsics.checkNotNullParameter(appContent, "appContent");
        Intrinsics.checkNotNullParameter(deviceTitle, "deviceTitle");
        Intrinsics.checkNotNullParameter(deviceContent, "deviceContent");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(signsDataContent, "signsDataContent");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new DevSignsData(updateTime, signsType, status, code, appTitle, appContent, deviceTitle, deviceContent, icon, link, signsDataContent, signsChartContent, extraMsg, ssoid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevSignsData)) {
            return false;
        }
        DevSignsData devSignsData = (DevSignsData) other;
        return this.updateTime == devSignsData.updateTime && this.signsType == devSignsData.signsType && this.status == devSignsData.status && Intrinsics.areEqual(this.code, devSignsData.code) && Intrinsics.areEqual(this.appTitle, devSignsData.appTitle) && Intrinsics.areEqual(this.appContent, devSignsData.appContent) && Intrinsics.areEqual(this.deviceTitle, devSignsData.deviceTitle) && Intrinsics.areEqual(this.deviceContent, devSignsData.deviceContent) && Intrinsics.areEqual(this.icon, devSignsData.icon) && Intrinsics.areEqual(this.link, devSignsData.link) && Intrinsics.areEqual(this.signsDataContent, devSignsData.signsDataContent) && Intrinsics.areEqual(this.signsChartContent, devSignsData.signsChartContent) && Intrinsics.areEqual(this.extraMsg, devSignsData.extraMsg) && Intrinsics.areEqual(this.ssoid, devSignsData.ssoid);
    }

    @NotNull
    public final String getAppContent() {
        return this.appContent;
    }

    @NotNull
    public final String getAppTitle() {
        return this.appTitle;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getDeviceContent() {
        return this.deviceContent;
    }

    @NotNull
    public final String getDeviceTitle() {
        return this.deviceTitle;
    }

    @Nullable
    public final JsonObject getExtraMsg() {
        return this.extraMsg;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final SignsChart getSignsChartContent() {
        return this.signsChartContent;
    }

    @NotNull
    public final SignsDataContent getSignsDataContent() {
        return this.signsDataContent;
    }

    public final int getSignsType() {
        return this.signsType;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((Long.hashCode(this.updateTime) * 31) + Integer.hashCode(this.signsType)) * 31) + Integer.hashCode(this.status)) * 31) + this.code.hashCode()) * 31) + this.appTitle.hashCode()) * 31) + this.appContent.hashCode()) * 31) + this.deviceTitle.hashCode()) * 31) + this.deviceContent.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.link.hashCode()) * 31) + this.signsDataContent.hashCode()) * 31;
        SignsChart signsChart = this.signsChartContent;
        int iHashCode2 = (iHashCode + (signsChart == null ? 0 : signsChart.hashCode())) * 31;
        JsonObject jsonObject = this.extraMsg;
        return ((iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0)) * 31) + this.ssoid.hashCode();
    }

    @NotNull
    public String toString() {
        return "DevSignsData:(updateTime:" + this.updateTime + ",signsType:" + this.signsType + ",status:" + this.status + ",code:" + this.code + ",appTitle:" + this.appTitle + ",appContent:" + this.appContent + ",deviceTitle:" + this.deviceTitle + ",deviceContent:" + this.deviceContent + ",icon:" + this.icon + ",extraMsg:" + this.extraMsg + ",signsDataContent:" + this.signsDataContent + ",signsChartContent:" + this.signsChartContent + ",)";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DevSignsData(long j2, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, SignsDataContent signsDataContent, SignsChart signsChart, JsonObject jsonObject, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        JsonObject jsonObject2 = (i3 & 4096) != 0 ? null : jsonObject;
        if ((i3 & 8192) != 0) {
            String strE = v9g.w().E("user_ssoid", g3k.DEFAULT_SSOID);
            Intrinsics.checkNotNullExpressionValue(strE, "getInstance()\n        .g…ristHelper.DEFAULT_SSOID)");
            str9 = strE;
        } else {
            str9 = str8;
        }
        this(j2, i, i2, str, str2, str3, str4, str5, str6, str7, signsDataContent, signsChart, jsonObject2, str9);
    }
}
