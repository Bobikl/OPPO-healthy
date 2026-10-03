package com.heytap.health.sleep.disturb.algorithm.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.mq8;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/sleep/disturb/algorithm/bean/ActivityEventInfo;", "", "packageName", "", DeepLinkInterpreter.KEY_ACTIVITY_NAME, SpeechConstant.KEY_TTS_TIMESTAMP, "", "foreground", "", "(Ljava/lang/String;Ljava/lang/String;JI)V", "getActivityName", "()Ljava/lang/String;", "getForeground", "()I", "setForeground", "(I)V", "getPackageName", "getTimeStamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getStr", "hashCode", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ActivityEventInfo {
    public static final int $stable = 8;

    @NotNull
    private final String activityName;
    private int foreground;

    @NotNull
    private final String packageName;
    private final long timeStamp;

    public ActivityEventInfo(@NotNull String packageName, @NotNull String activityName, long j2, int i) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.packageName = packageName;
        this.activityName = activityName;
        this.timeStamp = j2;
        this.foreground = i;
    }

    public static /* synthetic */ ActivityEventInfo copy$default(ActivityEventInfo activityEventInfo, String str, String str2, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activityEventInfo.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = activityEventInfo.activityName;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j2 = activityEventInfo.timeStamp;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            i = activityEventInfo.foreground;
        }
        return activityEventInfo.copy(str, str3, j3, i);
    }

    private final String getStr(int foreground) {
        if (foreground == 1) {
            return "resumed";
        }
        if (foreground != 2) {
            return foreground != 23 ? String.valueOf(foreground) : Action.LIFE_CIRCLE_VALUE_STOP;
        }
        return "paused";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getForeground() {
        return this.foreground;
    }

    @NotNull
    public final ActivityEventInfo copy(@NotNull String packageName, @NotNull String activityName, long timeStamp, int foreground) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        return new ActivityEventInfo(packageName, activityName, timeStamp, foreground);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityEventInfo)) {
            return false;
        }
        ActivityEventInfo activityEventInfo = (ActivityEventInfo) other;
        return Intrinsics.areEqual(this.packageName, activityEventInfo.packageName) && Intrinsics.areEqual(this.activityName, activityEventInfo.activityName) && this.timeStamp == activityEventInfo.timeStamp && this.foreground == activityEventInfo.foreground;
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
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
        return (((((this.packageName.hashCode() * 31) + this.activityName.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + Integer.hashCode(this.foreground);
    }

    public final void setForeground(int i) {
        this.foreground = i;
    }

    @NotNull
    public String toString() {
        return "ActivityEventInfo{packageName='" + this.packageName + "', activityName='" + this.activityName + "', timeStamp=" + mq8.INSTANCE.y(this.timeStamp, "yyyy-MM-dd HH:mm:ss") + "，" + this.timeStamp + ", foreground=" + getStr(this.foreground) + "}";
    }
}
