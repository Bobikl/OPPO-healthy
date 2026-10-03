package com.heytap.health.sleep.disturb.algorithm.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.config.StdDtoConst;
import com.oplus.aiunit.vision.mq8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010$\u001a\u00020\u0003H\u0002J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\b\u0010&\u001a\u00020\u0003H\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, d2 = {"Lcom/heytap/health/sleep/disturb/algorithm/bean/AppStats;", "", "packageName", "", "totalTimeUsed", "", "count", "", StdDtoConst.BEGIN_TIME_KEY, "endTime", "(Ljava/lang/String;JIJJ)V", "getBeginTime", "()J", "setBeginTime", "(J)V", "getCount", "()I", "setCount", "(I)V", "getEndTime", "setEndTime", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "getTotalTimeUsed", "setTotalTimeUsed", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getTotalTimeUsedSecond", "hashCode", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppStats {
    public static final int $stable = 8;
    private long beginTime;
    private int count;
    private long endTime;

    @NotNull
    private String packageName;
    private long totalTimeUsed;

    public AppStats(@NotNull String packageName, long j2, int i, long j3, long j4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.totalTimeUsed = j2;
        this.count = i;
        this.beginTime = j3;
        this.endTime = j4;
    }

    private final String getTotalTimeUsedSecond() {
        int i = (int) (this.totalTimeUsed / ((long) 1000));
        if (i < 60) {
            return i + "秒";
        }
        if (i < 3600) {
            return (i / 60) + "分" + (i % 60) + "秒";
        }
        int i2 = i / 3600;
        return i2 + "时" + ((i - (i2 * 3600)) / 60) + "分" + (i % 60) + "秒";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalTimeUsed() {
        return this.totalTimeUsed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final AppStats copy(@NotNull String packageName, long totalTimeUsed, int count, long beginTime, long endTime) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new AppStats(packageName, totalTimeUsed, count, beginTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStats)) {
            return false;
        }
        AppStats appStats = (AppStats) other;
        return Intrinsics.areEqual(this.packageName, appStats.packageName) && this.totalTimeUsed == appStats.totalTimeUsed && this.count == appStats.count && this.beginTime == appStats.beginTime && this.endTime == appStats.endTime;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final long getTotalTimeUsed() {
        return this.totalTimeUsed;
    }

    public int hashCode() {
        return (((((((this.packageName.hashCode() * 31) + Long.hashCode(this.totalTimeUsed)) * 31) + Integer.hashCode(this.count)) * 31) + Long.hashCode(this.beginTime)) * 31) + Long.hashCode(this.endTime);
    }

    public final void setBeginTime(long j2) {
        this.beginTime = j2;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setTotalTimeUsed(long j2) {
        this.totalTimeUsed = j2;
    }

    @NotNull
    public String toString() {
        String str = this.packageName;
        long j2 = this.totalTimeUsed;
        String totalTimeUsedSecond = getTotalTimeUsedSecond();
        mq8 mq8Var = mq8.INSTANCE;
        return "AppStats(packageName='" + str + "', totalTimeUsed=" + j2 + "毫秒, " + totalTimeUsedSecond + ", beginTime=" + mq8Var.y(this.beginTime, "yyyy-MM-dd HH:mm:ss") + ", endTime=" + mq8Var.y(this.endTime, "yyyy-MM-dd HH:mm:ss") + ")";
    }

    public /* synthetic */ AppStats(String str, long j2, int i, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) == 0 ? j4 : 0L);
    }
}
