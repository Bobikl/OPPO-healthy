package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.uqg, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u001b\u0012\b\b\u0002\u0010$\u001a\u00020\u001b\u0012\b\b\u0002\u0010'\u001a\u00020\u001b\u0012\b\b\u0002\u0010+\u001a\u00020\u001b\u0012\b\b\u0002\u0010/\u001a\u00020\u001b\u0012\b\b\u0002\u00103\u001a\u00020\u001b\u0012\b\b\u0002\u00107\u001a\u00020\u001b\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010;\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\b\b\u0002\u0010A\u001a\u00020\u0004\u0012\b\b\u0002\u0010C\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010'\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010+\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\"\u0010/\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\"\u00103\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\"\u00107\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b(\u0010\f\"\u0004\b8\u0010\u000eR\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\n\u001a\u0004\b4\u0010\f\"\u0004\b:\u0010\u000eR\"\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\n\u001a\u0004\b0\u0010\f\"\u0004\b<\u0010\u000eR\"\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b>\u0010\u000eR\"\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b@\u0010\u000eR\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\bB\u0010\u000eR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010D\u001a\u0004\b,\u0010E\"\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/oplus/aiunit/vision/uqg;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "v", "(I)V", "date", "b", "d", "u", "code", "c", "Z", LogFieldKey.LEVEL_KEY, "()Z", "C", "(Z)V", "supportMobilePhoneSleep", "", "J", MapSchema.FIELD_NAME_KEY, "()J", c8l.KEY_B, "(J)V", "startSleepTime", "f", "w", "endSleepTime", LogFieldKey.PROCESS_NAME_KEY, "G", "totalSleepTime", b2n.f, "q", "H", "totalWakeTime", b2n.g, LogFieldKey.MESSAGE_KEY, "D", "totalDeepSleepTime", "i", "n", ExifInterface.LONGITUDE_EAST, "totalLightlySleepTime", "j", "o", UserInfo.SEX_FEMALE, "totalREMSleepTime", "x", "score", "A", "sleepHeartRateRangeLow", "z", "sleepHeartRateRangeHigh", "r", "avgHr", "t", "avgSleepBreathRangeLow", "s", "avgSleepBreathRangeHigh", "Ljava/lang/String;", "()Ljava/lang/String;", "y", "(Ljava/lang/String;)V", "sleepData", "<init>", "(IIZJJJJJJJIIIIIILjava/lang/String;)V", "health_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SeedlingCardSleepData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean supportMobilePhoneSleep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long startSleepTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long endSleepTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public long totalSleepTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long totalWakeTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public long totalDeepSleepTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public long totalLightlySleepTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public long totalREMSleepTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public int score;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public int sleepHeartRateRangeLow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public int sleepHeartRateRangeHigh;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public int avgHr;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    public int avgSleepBreathRangeLow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    public int avgSleepBreathRangeHigh;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @NotNull
    public String sleepData;

    public SeedlingCardSleepData() {
        this(0, 0, false, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, null, 131071, null);
    }

    public final void A(int i) {
        this.sleepHeartRateRangeLow = i;
    }

    public final void B(long j2) {
        this.startSleepTime = j2;
    }

    public final void C(boolean z) {
        this.supportMobilePhoneSleep = z;
    }

    public final void D(long j2) {
        this.totalDeepSleepTime = j2;
    }

    public final void E(long j2) {
        this.totalLightlySleepTime = j2;
    }

    public final void F(long j2) {
        this.totalREMSleepTime = j2;
    }

    public final void G(long j2) {
        this.totalSleepTime = j2;
    }

    public final void H(long j2) {
        this.totalWakeTime = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvgSleepBreathRangeHigh() {
        return this.avgSleepBreathRangeHigh;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAvgSleepBreathRangeLow() {
        return this.avgSleepBreathRangeLow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingCardSleepData)) {
            return false;
        }
        SeedlingCardSleepData seedlingCardSleepData = (SeedlingCardSleepData) other;
        return this.date == seedlingCardSleepData.date && this.code == seedlingCardSleepData.code && this.supportMobilePhoneSleep == seedlingCardSleepData.supportMobilePhoneSleep && this.startSleepTime == seedlingCardSleepData.startSleepTime && this.endSleepTime == seedlingCardSleepData.endSleepTime && this.totalSleepTime == seedlingCardSleepData.totalSleepTime && this.totalWakeTime == seedlingCardSleepData.totalWakeTime && this.totalDeepSleepTime == seedlingCardSleepData.totalDeepSleepTime && this.totalLightlySleepTime == seedlingCardSleepData.totalLightlySleepTime && this.totalREMSleepTime == seedlingCardSleepData.totalREMSleepTime && this.score == seedlingCardSleepData.score && this.sleepHeartRateRangeLow == seedlingCardSleepData.sleepHeartRateRangeLow && this.sleepHeartRateRangeHigh == seedlingCardSleepData.sleepHeartRateRangeHigh && this.avgHr == seedlingCardSleepData.avgHr && this.avgSleepBreathRangeLow == seedlingCardSleepData.avgSleepBreathRangeLow && this.avgSleepBreathRangeHigh == seedlingCardSleepData.avgSleepBreathRangeHigh && Intrinsics.areEqual(this.sleepData, seedlingCardSleepData.sleepData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getEndSleepTime() {
        return this.endSleepTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSleepData() {
        return this.sleepData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.code)) * 31;
        boolean z = this.supportMobilePhoneSleep;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((((((((((((((iHashCode + r1) * 31) + Long.hashCode(this.startSleepTime)) * 31) + Long.hashCode(this.endSleepTime)) * 31) + Long.hashCode(this.totalSleepTime)) * 31) + Long.hashCode(this.totalWakeTime)) * 31) + Long.hashCode(this.totalDeepSleepTime)) * 31) + Long.hashCode(this.totalLightlySleepTime)) * 31) + Long.hashCode(this.totalREMSleepTime)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.sleepHeartRateRangeLow)) * 31) + Integer.hashCode(this.sleepHeartRateRangeHigh)) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.avgSleepBreathRangeLow)) * 31) + Integer.hashCode(this.avgSleepBreathRangeHigh)) * 31) + this.sleepData.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSleepHeartRateRangeHigh() {
        return this.sleepHeartRateRangeHigh;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSleepHeartRateRangeLow() {
        return this.sleepHeartRateRangeLow;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getStartSleepTime() {
        return this.startSleepTime;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSupportMobilePhoneSleep() {
        return this.supportMobilePhoneSleep;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getTotalWakeTime() {
        return this.totalWakeTime;
    }

    public final void r(int i) {
        this.avgHr = i;
    }

    public final void s(int i) {
        this.avgSleepBreathRangeHigh = i;
    }

    public final void t(int i) {
        this.avgSleepBreathRangeLow = i;
    }

    @NotNull
    public String toString() {
        return "SeedlingCardSleepData(date=" + this.date + ", code=" + this.code + ", supportMobilePhoneSleep=" + this.supportMobilePhoneSleep + ", startSleepTime=" + this.startSleepTime + ", endSleepTime=" + this.endSleepTime + ", totalSleepTime=" + this.totalSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", score=" + this.score + ", sleepHeartRateRangeLow=" + this.sleepHeartRateRangeLow + ", sleepHeartRateRangeHigh=" + this.sleepHeartRateRangeHigh + ", avgHr=" + this.avgHr + ", avgSleepBreathRangeLow=" + this.avgSleepBreathRangeLow + ", avgSleepBreathRangeHigh=" + this.avgSleepBreathRangeHigh + ", sleepData=" + this.sleepData + ")";
    }

    public final void u(int i) {
        this.code = i;
    }

    public final void v(int i) {
        this.date = i;
    }

    public final void w(long j2) {
        this.endSleepTime = j2;
    }

    public final void x(int i) {
        this.score = i;
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepData = str;
    }

    public final void z(int i) {
        this.sleepHeartRateRangeHigh = i;
    }

    public SeedlingCardSleepData(int i, int i2, boolean z, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, int i6, int i7, int i8, @NotNull String sleepData) {
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        this.date = i;
        this.code = i2;
        this.supportMobilePhoneSleep = z;
        this.startSleepTime = j2;
        this.endSleepTime = j3;
        this.totalSleepTime = j4;
        this.totalWakeTime = j5;
        this.totalDeepSleepTime = j6;
        this.totalLightlySleepTime = j7;
        this.totalREMSleepTime = j8;
        this.score = i3;
        this.sleepHeartRateRangeLow = i4;
        this.sleepHeartRateRangeHigh = i5;
        this.avgHr = i6;
        this.avgSleepBreathRangeLow = i7;
        this.avgSleepBreathRangeHigh = i8;
        this.sleepData = sleepData;
    }

    public /* synthetic */ SeedlingCardSleepData(int i, int i2, boolean z, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? false : z, (i9 & 8) != 0 ? 0L : j2, (i9 & 16) != 0 ? 0L : j3, (i9 & 32) != 0 ? 0L : j4, (i9 & 64) != 0 ? 0L : j5, (i9 & 128) != 0 ? 0L : j6, (i9 & 256) != 0 ? 0L : j7, (i9 & 512) == 0 ? j8 : 0L, (i9 & 1024) != 0 ? 0 : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (i9 & 32768) != 0 ? 0 : i8, (i9 & 65536) != 0 ? "" : str);
    }
}
