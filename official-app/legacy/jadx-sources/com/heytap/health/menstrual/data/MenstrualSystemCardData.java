package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\u0081\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001b¨\u0006B"}, d2 = {"Lcom/heytap/health/menstrual/data/MenstrualSystemCardData;", "", "code", "", "feedInfoTitle", "", "feedInfoUrl", "cardTitle", "cardTip", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "", "predictDate", "cycleDays", "periodSettingDays", "symptomFlow", "symptomDysmenorrhea", "listData", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIILjava/lang/String;)V", "getCardTip", "()Ljava/lang/String;", "setCardTip", "(Ljava/lang/String;)V", "getCardTitle", "setCardTitle", "getCode", "()I", "setCode", "(I)V", "getCycleDays", "()J", "setCycleDays", "(J)V", "getFeedInfoTitle", "setFeedInfoTitle", "getFeedInfoUrl", "setFeedInfoUrl", "getListData", "setListData", "getPeriodSettingDays", "setPeriodSettingDays", "getPredictDate", "setPredictDate", "getStartDate", "setStartDate", "getSymptomDysmenorrhea", "setSymptomDysmenorrhea", "getSymptomFlow", "setSymptomFlow", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualSystemCardData {

    @NotNull
    private String cardTip;

    @NotNull
    private String cardTitle;
    private int code;
    private long cycleDays;

    @NotNull
    private String feedInfoTitle;

    @NotNull
    private String feedInfoUrl;

    @NotNull
    private String listData;
    private long periodSettingDays;
    private long predictDate;
    private long startDate;
    private int symptomDysmenorrhea;
    private int symptomFlow;

    public MenstrualSystemCardData(int i, @NotNull String feedInfoTitle, @NotNull String feedInfoUrl, @NotNull String cardTitle, @NotNull String cardTip, long j2, long j3, long j4, long j5, int i2, int i3, @NotNull String listData) {
        Intrinsics.checkNotNullParameter(feedInfoTitle, "feedInfoTitle");
        Intrinsics.checkNotNullParameter(feedInfoUrl, "feedInfoUrl");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(cardTip, "cardTip");
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.code = i;
        this.feedInfoTitle = feedInfoTitle;
        this.feedInfoUrl = feedInfoUrl;
        this.cardTitle = cardTitle;
        this.cardTip = cardTip;
        this.startDate = j2;
        this.predictDate = j3;
        this.cycleDays = j4;
        this.periodSettingDays = j5;
        this.symptomFlow = i2;
        this.symptomDysmenorrhea = i3;
        this.listData = listData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSymptomFlow() {
        return this.symptomFlow;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSymptomDysmenorrhea() {
        return this.symptomDysmenorrhea;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getListData() {
        return this.listData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedInfoTitle() {
        return this.feedInfoTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeedInfoUrl() {
        return this.feedInfoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardTip() {
        return this.cardTip;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPredictDate() {
        return this.predictDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCycleDays() {
        return this.cycleDays;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getPeriodSettingDays() {
        return this.periodSettingDays;
    }

    @NotNull
    public final MenstrualSystemCardData copy(int code, @NotNull String feedInfoTitle, @NotNull String feedInfoUrl, @NotNull String cardTitle, @NotNull String cardTip, long startDate, long predictDate, long cycleDays, long periodSettingDays, int symptomFlow, int symptomDysmenorrhea, @NotNull String listData) {
        Intrinsics.checkNotNullParameter(feedInfoTitle, "feedInfoTitle");
        Intrinsics.checkNotNullParameter(feedInfoUrl, "feedInfoUrl");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(cardTip, "cardTip");
        Intrinsics.checkNotNullParameter(listData, "listData");
        return new MenstrualSystemCardData(code, feedInfoTitle, feedInfoUrl, cardTitle, cardTip, startDate, predictDate, cycleDays, periodSettingDays, symptomFlow, symptomDysmenorrhea, listData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualSystemCardData)) {
            return false;
        }
        MenstrualSystemCardData menstrualSystemCardData = (MenstrualSystemCardData) other;
        return this.code == menstrualSystemCardData.code && Intrinsics.areEqual(this.feedInfoTitle, menstrualSystemCardData.feedInfoTitle) && Intrinsics.areEqual(this.feedInfoUrl, menstrualSystemCardData.feedInfoUrl) && Intrinsics.areEqual(this.cardTitle, menstrualSystemCardData.cardTitle) && Intrinsics.areEqual(this.cardTip, menstrualSystemCardData.cardTip) && this.startDate == menstrualSystemCardData.startDate && this.predictDate == menstrualSystemCardData.predictDate && this.cycleDays == menstrualSystemCardData.cycleDays && this.periodSettingDays == menstrualSystemCardData.periodSettingDays && this.symptomFlow == menstrualSystemCardData.symptomFlow && this.symptomDysmenorrhea == menstrualSystemCardData.symptomDysmenorrhea && Intrinsics.areEqual(this.listData, menstrualSystemCardData.listData);
    }

    @NotNull
    public final String getCardTip() {
        return this.cardTip;
    }

    @NotNull
    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getCycleDays() {
        return this.cycleDays;
    }

    @NotNull
    public final String getFeedInfoTitle() {
        return this.feedInfoTitle;
    }

    @NotNull
    public final String getFeedInfoUrl() {
        return this.feedInfoUrl;
    }

    @NotNull
    public final String getListData() {
        return this.listData;
    }

    public final long getPeriodSettingDays() {
        return this.periodSettingDays;
    }

    public final long getPredictDate() {
        return this.predictDate;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final int getSymptomDysmenorrhea() {
        return this.symptomDysmenorrhea;
    }

    public final int getSymptomFlow() {
        return this.symptomFlow;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.code) * 31) + this.feedInfoTitle.hashCode()) * 31) + this.feedInfoUrl.hashCode()) * 31) + this.cardTitle.hashCode()) * 31) + this.cardTip.hashCode()) * 31) + Long.hashCode(this.startDate)) * 31) + Long.hashCode(this.predictDate)) * 31) + Long.hashCode(this.cycleDays)) * 31) + Long.hashCode(this.periodSettingDays)) * 31) + Integer.hashCode(this.symptomFlow)) * 31) + Integer.hashCode(this.symptomDysmenorrhea)) * 31) + this.listData.hashCode();
    }

    public final void setCardTip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardTip = str;
    }

    public final void setCardTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardTitle = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setCycleDays(long j2) {
        this.cycleDays = j2;
    }

    public final void setFeedInfoTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.feedInfoTitle = str;
    }

    public final void setFeedInfoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.feedInfoUrl = str;
    }

    public final void setListData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.listData = str;
    }

    public final void setPeriodSettingDays(long j2) {
        this.periodSettingDays = j2;
    }

    public final void setPredictDate(long j2) {
        this.predictDate = j2;
    }

    public final void setStartDate(long j2) {
        this.startDate = j2;
    }

    public final void setSymptomDysmenorrhea(int i) {
        this.symptomDysmenorrhea = i;
    }

    public final void setSymptomFlow(int i) {
        this.symptomFlow = i;
    }

    @NotNull
    public String toString() {
        return "MenstrualSystemCardData(code=" + this.code + ", feedInfoTitle=" + this.feedInfoTitle + ", feedInfoUrl=" + this.feedInfoUrl + ", cardTitle=" + this.cardTitle + ", cardTip=" + this.cardTip + ", startDate=" + this.startDate + ", predictDate=" + this.predictDate + ", cycleDays=" + this.cycleDays + ", periodSettingDays=" + this.periodSettingDays + ", symptomFlow=" + this.symptomFlow + ", symptomDysmenorrhea=" + this.symptomDysmenorrhea + ", listData=" + this.listData + ")";
    }

    public /* synthetic */ MenstrualSystemCardData(int i, String str, String str2, String str3, String str4, long j2, long j3, long j4, long j5, int i2, int i3, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0L : j2, (i4 & 64) != 0 ? 0L : j3, (i4 & 128) != 0 ? 0L : j4, (i4 & 256) == 0 ? j5 : 0L, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? 0 : i3, (i4 & 2048) == 0 ? str5 : "");
    }
}
