package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/health/health_seedlingcard/bean/TodayStepCheckinItem;", "", "checkInBtnText", "", "today1x2Title", "today2x2Title", "todayStepNum", "todayStepTips", "today1x2Tips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckInBtnText", "()Ljava/lang/String;", "setCheckInBtnText", "(Ljava/lang/String;)V", "getToday1x2Tips", "setToday1x2Tips", "getToday1x2Title", "setToday1x2Title", "getToday2x2Title", "setToday2x2Title", "getTodayStepNum", "setTodayStepNum", "getTodayStepTips", "setTodayStepTips", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TodayStepCheckinItem {

    @NotNull
    private String checkInBtnText;

    @NotNull
    private String today1x2Tips;

    @NotNull
    private String today1x2Title;

    @NotNull
    private String today2x2Title;

    @NotNull
    private String todayStepNum;

    @NotNull
    private String todayStepTips;

    public TodayStepCheckinItem(@NotNull String checkInBtnText, @NotNull String today1x2Title, @NotNull String today2x2Title, @NotNull String todayStepNum, @NotNull String todayStepTips, @NotNull String today1x2Tips) {
        Intrinsics.checkNotNullParameter(checkInBtnText, "checkInBtnText");
        Intrinsics.checkNotNullParameter(today1x2Title, "today1x2Title");
        Intrinsics.checkNotNullParameter(today2x2Title, "today2x2Title");
        Intrinsics.checkNotNullParameter(todayStepNum, "todayStepNum");
        Intrinsics.checkNotNullParameter(todayStepTips, "todayStepTips");
        Intrinsics.checkNotNullParameter(today1x2Tips, "today1x2Tips");
        this.checkInBtnText = checkInBtnText;
        this.today1x2Title = today1x2Title;
        this.today2x2Title = today2x2Title;
        this.todayStepNum = todayStepNum;
        this.todayStepTips = todayStepTips;
        this.today1x2Tips = today1x2Tips;
    }

    public static /* synthetic */ TodayStepCheckinItem copy$default(TodayStepCheckinItem todayStepCheckinItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = todayStepCheckinItem.checkInBtnText;
        }
        if ((i & 2) != 0) {
            str2 = todayStepCheckinItem.today1x2Title;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = todayStepCheckinItem.today2x2Title;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = todayStepCheckinItem.todayStepNum;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = todayStepCheckinItem.todayStepTips;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = todayStepCheckinItem.today1x2Tips;
        }
        return todayStepCheckinItem.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCheckInBtnText() {
        return this.checkInBtnText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToday1x2Title() {
        return this.today1x2Title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToday2x2Title() {
        return this.today2x2Title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTodayStepNum() {
        return this.todayStepNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTodayStepTips() {
        return this.todayStepTips;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToday1x2Tips() {
        return this.today1x2Tips;
    }

    @NotNull
    public final TodayStepCheckinItem copy(@NotNull String checkInBtnText, @NotNull String today1x2Title, @NotNull String today2x2Title, @NotNull String todayStepNum, @NotNull String todayStepTips, @NotNull String today1x2Tips) {
        Intrinsics.checkNotNullParameter(checkInBtnText, "checkInBtnText");
        Intrinsics.checkNotNullParameter(today1x2Title, "today1x2Title");
        Intrinsics.checkNotNullParameter(today2x2Title, "today2x2Title");
        Intrinsics.checkNotNullParameter(todayStepNum, "todayStepNum");
        Intrinsics.checkNotNullParameter(todayStepTips, "todayStepTips");
        Intrinsics.checkNotNullParameter(today1x2Tips, "today1x2Tips");
        return new TodayStepCheckinItem(checkInBtnText, today1x2Title, today2x2Title, todayStepNum, todayStepTips, today1x2Tips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodayStepCheckinItem)) {
            return false;
        }
        TodayStepCheckinItem todayStepCheckinItem = (TodayStepCheckinItem) other;
        return Intrinsics.areEqual(this.checkInBtnText, todayStepCheckinItem.checkInBtnText) && Intrinsics.areEqual(this.today1x2Title, todayStepCheckinItem.today1x2Title) && Intrinsics.areEqual(this.today2x2Title, todayStepCheckinItem.today2x2Title) && Intrinsics.areEqual(this.todayStepNum, todayStepCheckinItem.todayStepNum) && Intrinsics.areEqual(this.todayStepTips, todayStepCheckinItem.todayStepTips) && Intrinsics.areEqual(this.today1x2Tips, todayStepCheckinItem.today1x2Tips);
    }

    @NotNull
    public final String getCheckInBtnText() {
        return this.checkInBtnText;
    }

    @NotNull
    public final String getToday1x2Tips() {
        return this.today1x2Tips;
    }

    @NotNull
    public final String getToday1x2Title() {
        return this.today1x2Title;
    }

    @NotNull
    public final String getToday2x2Title() {
        return this.today2x2Title;
    }

    @NotNull
    public final String getTodayStepNum() {
        return this.todayStepNum;
    }

    @NotNull
    public final String getTodayStepTips() {
        return this.todayStepTips;
    }

    public int hashCode() {
        return (((((((((this.checkInBtnText.hashCode() * 31) + this.today1x2Title.hashCode()) * 31) + this.today2x2Title.hashCode()) * 31) + this.todayStepNum.hashCode()) * 31) + this.todayStepTips.hashCode()) * 31) + this.today1x2Tips.hashCode();
    }

    public final void setCheckInBtnText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.checkInBtnText = str;
    }

    public final void setToday1x2Tips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.today1x2Tips = str;
    }

    public final void setToday1x2Title(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.today1x2Title = str;
    }

    public final void setToday2x2Title(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.today2x2Title = str;
    }

    public final void setTodayStepNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.todayStepNum = str;
    }

    public final void setTodayStepTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.todayStepTips = str;
    }

    @NotNull
    public String toString() {
        return "TodayStepCheckinItem(checkInBtnText=" + this.checkInBtnText + ", today1x2Title=" + this.today1x2Title + ", today2x2Title=" + this.today2x2Title + ", todayStepNum=" + this.todayStepNum + ", todayStepTips=" + this.todayStepTips + ", today1x2Tips=" + this.today1x2Tips + ")";
    }
}
