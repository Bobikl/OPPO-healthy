package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepWaveInfo;", "", "title", "", "tips", "(Ljava/lang/String;Ljava/lang/String;)V", "getTips", "()Ljava/lang/String;", "setTips", "(Ljava/lang/String;)V", "getTitle", "setTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepWaveInfo {

    @NotNull
    private String tips;

    @NotNull
    private String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepWaveInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SleepWaveInfo copy$default(SleepWaveInfo sleepWaveInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepWaveInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = sleepWaveInfo.tips;
        }
        return sleepWaveInfo.copy(str, str2);
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
    public final SleepWaveInfo copy(@NotNull String title, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        return new SleepWaveInfo(title, tips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepWaveInfo)) {
            return false;
        }
        SleepWaveInfo sleepWaveInfo = (SleepWaveInfo) other;
        return Intrinsics.areEqual(this.title, sleepWaveInfo.title) && Intrinsics.areEqual(this.tips, sleepWaveInfo.tips);
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
        return (this.title.hashCode() * 31) + this.tips.hashCode();
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
        return "SleepWaveInfo(title=" + this.title + ", tips=" + this.tips + ")";
    }

    public SleepWaveInfo(@NotNull String title, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.title = title;
        this.tips = tips;
    }

    public /* synthetic */ SleepWaveInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
