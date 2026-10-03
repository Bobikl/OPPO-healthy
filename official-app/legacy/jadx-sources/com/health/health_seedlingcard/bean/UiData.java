package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u00063"}, d2 = {"Lcom/health/health_seedlingcard/bean/UiData;", "", "sleepWaveInfo", "Lcom/health/health_seedlingcard/bean/SleepWaveInfo;", "sleepWaveInfoPretitle", "", "sleepWaveOpt", "Lcom/health/health_seedlingcard/bean/SleepWaveOpt;", "sleepWaveDarkOpt", "sleepWaveInfotitle", "sleepWaveInfotips", "sleepWaveInfotitleMain", "sleepWaveInfotitleSub", "(Lcom/health/health_seedlingcard/bean/SleepWaveInfo;Ljava/lang/String;Lcom/health/health_seedlingcard/bean/SleepWaveOpt;Lcom/health/health_seedlingcard/bean/SleepWaveOpt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSleepWaveDarkOpt", "()Lcom/health/health_seedlingcard/bean/SleepWaveOpt;", "setSleepWaveDarkOpt", "(Lcom/health/health_seedlingcard/bean/SleepWaveOpt;)V", "getSleepWaveInfo", "()Lcom/health/health_seedlingcard/bean/SleepWaveInfo;", "setSleepWaveInfo", "(Lcom/health/health_seedlingcard/bean/SleepWaveInfo;)V", "getSleepWaveInfoPretitle", "()Ljava/lang/String;", "setSleepWaveInfoPretitle", "(Ljava/lang/String;)V", "getSleepWaveInfotips", "setSleepWaveInfotips", "getSleepWaveInfotitle", "setSleepWaveInfotitle", "getSleepWaveInfotitleMain", "setSleepWaveInfotitleMain", "getSleepWaveInfotitleSub", "setSleepWaveInfotitleSub", "getSleepWaveOpt", "setSleepWaveOpt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UiData {

    @NotNull
    private SleepWaveOpt sleepWaveDarkOpt;

    @NotNull
    private SleepWaveInfo sleepWaveInfo;

    @NotNull
    private String sleepWaveInfoPretitle;

    @NotNull
    private String sleepWaveInfotips;

    @NotNull
    private String sleepWaveInfotitle;

    @NotNull
    private String sleepWaveInfotitleMain;

    @NotNull
    private String sleepWaveInfotitleSub;

    @NotNull
    private SleepWaveOpt sleepWaveOpt;

    public UiData(@NotNull SleepWaveInfo sleepWaveInfo, @NotNull String sleepWaveInfoPretitle, @NotNull SleepWaveOpt sleepWaveOpt, @NotNull SleepWaveOpt sleepWaveDarkOpt, @NotNull String sleepWaveInfotitle, @NotNull String sleepWaveInfotips, @NotNull String sleepWaveInfotitleMain, @NotNull String sleepWaveInfotitleSub) {
        Intrinsics.checkNotNullParameter(sleepWaveInfo, "sleepWaveInfo");
        Intrinsics.checkNotNullParameter(sleepWaveInfoPretitle, "sleepWaveInfoPretitle");
        Intrinsics.checkNotNullParameter(sleepWaveOpt, "sleepWaveOpt");
        Intrinsics.checkNotNullParameter(sleepWaveDarkOpt, "sleepWaveDarkOpt");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitle, "sleepWaveInfotitle");
        Intrinsics.checkNotNullParameter(sleepWaveInfotips, "sleepWaveInfotips");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitleMain, "sleepWaveInfotitleMain");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitleSub, "sleepWaveInfotitleSub");
        this.sleepWaveInfo = sleepWaveInfo;
        this.sleepWaveInfoPretitle = sleepWaveInfoPretitle;
        this.sleepWaveOpt = sleepWaveOpt;
        this.sleepWaveDarkOpt = sleepWaveDarkOpt;
        this.sleepWaveInfotitle = sleepWaveInfotitle;
        this.sleepWaveInfotips = sleepWaveInfotips;
        this.sleepWaveInfotitleMain = sleepWaveInfotitleMain;
        this.sleepWaveInfotitleSub = sleepWaveInfotitleSub;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepWaveInfo getSleepWaveInfo() {
        return this.sleepWaveInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSleepWaveInfoPretitle() {
        return this.sleepWaveInfoPretitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepWaveOpt getSleepWaveOpt() {
        return this.sleepWaveOpt;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SleepWaveOpt getSleepWaveDarkOpt() {
        return this.sleepWaveDarkOpt;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSleepWaveInfotitle() {
        return this.sleepWaveInfotitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSleepWaveInfotips() {
        return this.sleepWaveInfotips;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSleepWaveInfotitleMain() {
        return this.sleepWaveInfotitleMain;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSleepWaveInfotitleSub() {
        return this.sleepWaveInfotitleSub;
    }

    @NotNull
    public final UiData copy(@NotNull SleepWaveInfo sleepWaveInfo, @NotNull String sleepWaveInfoPretitle, @NotNull SleepWaveOpt sleepWaveOpt, @NotNull SleepWaveOpt sleepWaveDarkOpt, @NotNull String sleepWaveInfotitle, @NotNull String sleepWaveInfotips, @NotNull String sleepWaveInfotitleMain, @NotNull String sleepWaveInfotitleSub) {
        Intrinsics.checkNotNullParameter(sleepWaveInfo, "sleepWaveInfo");
        Intrinsics.checkNotNullParameter(sleepWaveInfoPretitle, "sleepWaveInfoPretitle");
        Intrinsics.checkNotNullParameter(sleepWaveOpt, "sleepWaveOpt");
        Intrinsics.checkNotNullParameter(sleepWaveDarkOpt, "sleepWaveDarkOpt");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitle, "sleepWaveInfotitle");
        Intrinsics.checkNotNullParameter(sleepWaveInfotips, "sleepWaveInfotips");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitleMain, "sleepWaveInfotitleMain");
        Intrinsics.checkNotNullParameter(sleepWaveInfotitleSub, "sleepWaveInfotitleSub");
        return new UiData(sleepWaveInfo, sleepWaveInfoPretitle, sleepWaveOpt, sleepWaveDarkOpt, sleepWaveInfotitle, sleepWaveInfotips, sleepWaveInfotitleMain, sleepWaveInfotitleSub);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiData)) {
            return false;
        }
        UiData uiData = (UiData) other;
        return Intrinsics.areEqual(this.sleepWaveInfo, uiData.sleepWaveInfo) && Intrinsics.areEqual(this.sleepWaveInfoPretitle, uiData.sleepWaveInfoPretitle) && Intrinsics.areEqual(this.sleepWaveOpt, uiData.sleepWaveOpt) && Intrinsics.areEqual(this.sleepWaveDarkOpt, uiData.sleepWaveDarkOpt) && Intrinsics.areEqual(this.sleepWaveInfotitle, uiData.sleepWaveInfotitle) && Intrinsics.areEqual(this.sleepWaveInfotips, uiData.sleepWaveInfotips) && Intrinsics.areEqual(this.sleepWaveInfotitleMain, uiData.sleepWaveInfotitleMain) && Intrinsics.areEqual(this.sleepWaveInfotitleSub, uiData.sleepWaveInfotitleSub);
    }

    @NotNull
    public final SleepWaveOpt getSleepWaveDarkOpt() {
        return this.sleepWaveDarkOpt;
    }

    @NotNull
    public final SleepWaveInfo getSleepWaveInfo() {
        return this.sleepWaveInfo;
    }

    @NotNull
    public final String getSleepWaveInfoPretitle() {
        return this.sleepWaveInfoPretitle;
    }

    @NotNull
    public final String getSleepWaveInfotips() {
        return this.sleepWaveInfotips;
    }

    @NotNull
    public final String getSleepWaveInfotitle() {
        return this.sleepWaveInfotitle;
    }

    @NotNull
    public final String getSleepWaveInfotitleMain() {
        return this.sleepWaveInfotitleMain;
    }

    @NotNull
    public final String getSleepWaveInfotitleSub() {
        return this.sleepWaveInfotitleSub;
    }

    @NotNull
    public final SleepWaveOpt getSleepWaveOpt() {
        return this.sleepWaveOpt;
    }

    public int hashCode() {
        return (((((((((((((this.sleepWaveInfo.hashCode() * 31) + this.sleepWaveInfoPretitle.hashCode()) * 31) + this.sleepWaveOpt.hashCode()) * 31) + this.sleepWaveDarkOpt.hashCode()) * 31) + this.sleepWaveInfotitle.hashCode()) * 31) + this.sleepWaveInfotips.hashCode()) * 31) + this.sleepWaveInfotitleMain.hashCode()) * 31) + this.sleepWaveInfotitleSub.hashCode();
    }

    public final void setSleepWaveDarkOpt(@NotNull SleepWaveOpt sleepWaveOpt) {
        Intrinsics.checkNotNullParameter(sleepWaveOpt, "<set-?>");
        this.sleepWaveDarkOpt = sleepWaveOpt;
    }

    public final void setSleepWaveInfo(@NotNull SleepWaveInfo sleepWaveInfo) {
        Intrinsics.checkNotNullParameter(sleepWaveInfo, "<set-?>");
        this.sleepWaveInfo = sleepWaveInfo;
    }

    public final void setSleepWaveInfoPretitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInfoPretitle = str;
    }

    public final void setSleepWaveInfotips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInfotips = str;
    }

    public final void setSleepWaveInfotitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInfotitle = str;
    }

    public final void setSleepWaveInfotitleMain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInfotitleMain = str;
    }

    public final void setSleepWaveInfotitleSub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInfotitleSub = str;
    }

    public final void setSleepWaveOpt(@NotNull SleepWaveOpt sleepWaveOpt) {
        Intrinsics.checkNotNullParameter(sleepWaveOpt, "<set-?>");
        this.sleepWaveOpt = sleepWaveOpt;
    }

    @NotNull
    public String toString() {
        return "UiData(sleepWaveInfo=" + this.sleepWaveInfo + ", sleepWaveInfoPretitle=" + this.sleepWaveInfoPretitle + ", sleepWaveOpt=" + this.sleepWaveOpt + ", sleepWaveDarkOpt=" + this.sleepWaveDarkOpt + ", sleepWaveInfotitle=" + this.sleepWaveInfotitle + ", sleepWaveInfotips=" + this.sleepWaveInfotips + ", sleepWaveInfotitleMain=" + this.sleepWaveInfotitleMain + ", sleepWaveInfotitleSub=" + this.sleepWaveInfotitleSub + ")";
    }
}
