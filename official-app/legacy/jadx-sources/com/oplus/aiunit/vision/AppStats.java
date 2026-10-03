package com.oplus.aiunit.vision;

import com.heytap.log.config.StdDtoConst;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ic0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b$\u0010\u001dR\"\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b)\u0010\u0016¨\u0006-"}, d2 = {"Lcom/oplus/aiunit/vision/ic0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "packageName", "", "b", "J", b2n.f, "()J", "o", "(J)V", "totalTimeUsed", "c", "I", "d", "()I", LogFieldKey.LEVEL_KEY, "(I)V", "count", "i", StdDtoConst.BEGIN_TIME_KEY, MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "endTime", MapSchema.FIELD_NAME_KEY, "bucketType", b2n.g, "setTransformTime", "transformTime", "j", "bucketTime", "<init>", "(Ljava/lang/String;JIJJIJJ)V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class AppStats {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long totalTimeUsed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int count;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long beginTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long endTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int bucketType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long transformTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public long bucketTime;

    public AppStats(@NotNull String packageName, long j2, int i, long j3, long j4, int i2, long j5, long j6) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.totalTimeUsed = j2;
        this.count = i;
        this.beginTime = j3;
        this.endTime = j4;
        this.bucketType = i2;
        this.transformTime = j5;
        this.bucketTime = j6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBucketTime() {
        return this.bucketTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBucketType() {
        return this.bucketType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStats)) {
            return false;
        }
        AppStats appStats = (AppStats) other;
        return Intrinsics.areEqual(this.packageName, appStats.packageName) && this.totalTimeUsed == appStats.totalTimeUsed && this.count == appStats.count && this.beginTime == appStats.beginTime && this.endTime == appStats.endTime && this.bucketType == appStats.bucketType && this.transformTime == appStats.transformTime && this.bucketTime == appStats.bucketTime;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTotalTimeUsed() {
        return this.totalTimeUsed;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTransformTime() {
        return this.transformTime;
    }

    public int hashCode() {
        return (((((((((((((this.packageName.hashCode() * 31) + Long.hashCode(this.totalTimeUsed)) * 31) + Integer.hashCode(this.count)) * 31) + Long.hashCode(this.beginTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.bucketType)) * 31) + Long.hashCode(this.transformTime)) * 31) + Long.hashCode(this.bucketTime);
    }

    public final void i(long j2) {
        this.beginTime = j2;
    }

    public final void j(long j2) {
        this.bucketTime = j2;
    }

    public final void k(int i) {
        this.bucketType = i;
    }

    public final void l(int i) {
        this.count = i;
    }

    public final void m(long j2) {
        this.endTime = j2;
    }

    public final void n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void o(long j2) {
        this.totalTimeUsed = j2;
    }

    @NotNull
    public String toString() {
        return "AppStats(packageName=" + ((Object) e3e.f(this.packageName)) + ", totalTimeUsed=" + this.totalTimeUsed + ", count=" + this.count + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", bucketType=" + this.bucketType + ", transformTime=" + this.transformTime + ", bucketTime=" + this.bucketTime + ')';
    }

    public /* synthetic */ AppStats(String str, long j2, int i, long j3, long j4, int i2, long j5, long j6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? 0L : j4, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? 0L : j5, (i3 & 128) == 0 ? j6 : 0L);
    }
}
