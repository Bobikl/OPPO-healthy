package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepReminderWaveInfo;", "", "title", "", "tips", "remindertitle", "reminder2x2tips", "reminder1x2tips", "sleepWaveInforemindertitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReminder1x2tips", "()Ljava/lang/String;", "setReminder1x2tips", "(Ljava/lang/String;)V", "getReminder2x2tips", "setReminder2x2tips", "getRemindertitle", "setRemindertitle", "getSleepWaveInforemindertitle", "setSleepWaveInforemindertitle", "getTips", "setTips", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepReminderWaveInfo {

    @NotNull
    private String reminder1x2tips;

    @NotNull
    private String reminder2x2tips;

    @NotNull
    private String remindertitle;

    @NotNull
    private String sleepWaveInforemindertitle;

    @NotNull
    private String tips;

    @NotNull
    private String title;

    public SleepReminderWaveInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "tips");
        Intrinsics.checkNotNullParameter(str3, "remindertitle");
        Intrinsics.checkNotNullParameter(str4, "reminder2x2tips");
        Intrinsics.checkNotNullParameter(str5, "reminder1x2tips");
        Intrinsics.checkNotNullParameter(str6, "sleepWaveInforemindertitle");
        this.title = str;
        this.tips = str2;
        this.remindertitle = str3;
        this.reminder2x2tips = str4;
        this.reminder1x2tips = str5;
        this.sleepWaveInforemindertitle = str6;
    }

    public static /* synthetic */ SleepReminderWaveInfo copy$default(SleepReminderWaveInfo sleepReminderWaveInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepReminderWaveInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = sleepReminderWaveInfo.tips;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = sleepReminderWaveInfo.remindertitle;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = sleepReminderWaveInfo.reminder2x2tips;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = sleepReminderWaveInfo.reminder1x2tips;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = sleepReminderWaveInfo.sleepWaveInforemindertitle;
        }
        return sleepReminderWaveInfo.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemindertitle() {
        return this.remindertitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReminder2x2tips() {
        return this.reminder2x2tips;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReminder1x2tips() {
        return this.reminder1x2tips;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSleepWaveInforemindertitle() {
        return this.sleepWaveInforemindertitle;
    }

    @NotNull
    public final SleepReminderWaveInfo copy(@NotNull String title, @NotNull String tips, @NotNull String remindertitle, @NotNull String reminder2x2tips, @NotNull String reminder1x2tips, @NotNull String sleepWaveInforemindertitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(remindertitle, "remindertitle");
        Intrinsics.checkNotNullParameter(reminder2x2tips, "reminder2x2tips");
        Intrinsics.checkNotNullParameter(reminder1x2tips, "reminder1x2tips");
        Intrinsics.checkNotNullParameter(sleepWaveInforemindertitle, "sleepWaveInforemindertitle");
        return new SleepReminderWaveInfo(title, tips, remindertitle, reminder2x2tips, reminder1x2tips, sleepWaveInforemindertitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepReminderWaveInfo)) {
            return false;
        }
        SleepReminderWaveInfo sleepReminderWaveInfo = (SleepReminderWaveInfo) other;
        return Intrinsics.areEqual(this.title, sleepReminderWaveInfo.title) && Intrinsics.areEqual(this.tips, sleepReminderWaveInfo.tips) && Intrinsics.areEqual(this.remindertitle, sleepReminderWaveInfo.remindertitle) && Intrinsics.areEqual(this.reminder2x2tips, sleepReminderWaveInfo.reminder2x2tips) && Intrinsics.areEqual(this.reminder1x2tips, sleepReminderWaveInfo.reminder1x2tips) && Intrinsics.areEqual(this.sleepWaveInforemindertitle, sleepReminderWaveInfo.sleepWaveInforemindertitle);
    }

    @NotNull
    public final String getReminder1x2tips() {
        return this.reminder1x2tips;
    }

    @NotNull
    public final String getReminder2x2tips() {
        return this.reminder2x2tips;
    }

    @NotNull
    public final String getRemindertitle() {
        return this.remindertitle;
    }

    @NotNull
    public final String getSleepWaveInforemindertitle() {
        return this.sleepWaveInforemindertitle;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.tips.hashCode()) * 31) + this.remindertitle.hashCode()) * 31) + this.reminder2x2tips.hashCode()) * 31) + this.reminder1x2tips.hashCode()) * 31) + this.sleepWaveInforemindertitle.hashCode();
    }

    public final void setReminder1x2tips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reminder1x2tips = str;
    }

    public final void setReminder2x2tips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reminder2x2tips = str;
    }

    public final void setRemindertitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remindertitle = str;
    }

    public final void setSleepWaveInforemindertitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepWaveInforemindertitle = str;
    }

    public final void setTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tips = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "SleepReminderWaveInfo(title=" + this.title + ", tips=" + this.tips + ", remindertitle=" + this.remindertitle + ", reminder2x2tips=" + this.reminder2x2tips + ", reminder1x2tips=" + this.reminder1x2tips + ", sleepWaveInforemindertitle=" + this.sleepWaveInforemindertitle + ")";
    }

    public /* synthetic */ SleepReminderWaveInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, str5, str6);
    }
}
