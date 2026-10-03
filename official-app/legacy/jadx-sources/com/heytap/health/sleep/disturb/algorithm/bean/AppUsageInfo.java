package com.heytap.health.sleep.disturb.algorithm.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/sleep/disturb/algorithm/bean/AppUsageInfo;", "", "packageName", "", SpeechConstant.KEY_TTS_TIMESTAMP, "", "foreground", "", "(Ljava/lang/String;JI)V", "getForeground", "()I", "setForeground", "(I)V", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppUsageInfo {
    public static final int $stable = 8;
    private int foreground;

    @NotNull
    private String packageName;
    private long timeStamp;

    public AppUsageInfo(@NotNull String packageName, long j2, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.timeStamp = j2;
        this.foreground = i;
    }

    public static /* synthetic */ AppUsageInfo copy$default(AppUsageInfo appUsageInfo, String str, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appUsageInfo.packageName;
        }
        if ((i2 & 2) != 0) {
            j2 = appUsageInfo.timeStamp;
        }
        if ((i2 & 4) != 0) {
            i = appUsageInfo.foreground;
        }
        return appUsageInfo.copy(str, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getForeground() {
        return this.foreground;
    }

    @NotNull
    public final AppUsageInfo copy(@NotNull String packageName, long timeStamp, int foreground) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new AppUsageInfo(packageName, timeStamp, foreground);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUsageInfo)) {
            return false;
        }
        AppUsageInfo appUsageInfo = (AppUsageInfo) other;
        return Intrinsics.areEqual(this.packageName, appUsageInfo.packageName) && this.timeStamp == appUsageInfo.timeStamp && this.foreground == appUsageInfo.foreground;
    }

    public final int getForeground() {
        return this.foreground;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Long.hashCode(this.timeStamp)) * 31) + Integer.hashCode(this.foreground);
    }

    public final void setForeground(int i) {
        this.foreground = i;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    @NotNull
    public String toString() {
        return "AppUsageInfo(packageName=" + this.packageName + ", timeStamp=" + this.timeStamp + ", foreground=" + this.foreground + ")";
    }
}
