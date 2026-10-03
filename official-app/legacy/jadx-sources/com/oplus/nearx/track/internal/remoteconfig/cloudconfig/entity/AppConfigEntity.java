package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.anotation.FieldIndex;
import com.oplus.aiunit.vision.m04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001J\u0013\u0010=\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006B"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/AppConfigEntity;", "", "uploadIntervalTime", "", "uploadIntervalCount", "", "enableFlush", "", "balanceIntervalTime", "balanceSwitch", "balanceFlushIntervalTime", "balanceHeadSwitch", "hashTimeFrom", "hashTimeUntil", "hashUploadIntervalCount", "disableNetConnectedFlush", "enableHLog", "(JIZJZJJJJIZZ)V", "getBalanceFlushIntervalTime", "()J", "setBalanceFlushIntervalTime", "(J)V", "getBalanceHeadSwitch", "setBalanceHeadSwitch", "getBalanceIntervalTime", "setBalanceIntervalTime", "getBalanceSwitch", "()Z", "setBalanceSwitch", "(Z)V", "getDisableNetConnectedFlush", "setDisableNetConnectedFlush", "getEnableFlush", "setEnableFlush", "getEnableHLog", "setEnableHLog", "getHashTimeFrom", "setHashTimeFrom", "getHashTimeUntil", "setHashTimeUntil", "getHashUploadIntervalCount", "()I", "setHashUploadIntervalCount", "(I)V", "getUploadIntervalCount", "setUploadIntervalCount", "getUploadIntervalTime", "setUploadIntervalTime", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AppConfigEntity {

    @FieldIndex(index = 8)
    private long balanceFlushIntervalTime;

    @FieldIndex(index = 10)
    private long balanceHeadSwitch;

    @FieldIndex(index = 6)
    private long balanceIntervalTime;

    @FieldIndex(index = 7)
    private boolean balanceSwitch;

    @FieldIndex(index = 14)
    private boolean disableNetConnectedFlush;

    @FieldIndex(index = 5)
    private boolean enableFlush;

    @FieldIndex(index = 15)
    private boolean enableHLog;

    @FieldIndex(index = 11)
    private long hashTimeFrom;

    @FieldIndex(index = 12)
    private long hashTimeUntil;

    @FieldIndex(index = 13)
    private int hashUploadIntervalCount;

    @FieldIndex(index = 2)
    private int uploadIntervalCount;

    @FieldIndex(index = 1)
    private long uploadIntervalTime;

    public AppConfigEntity() {
        this(0L, 0, false, 0L, false, 0L, 0L, 0L, 0L, 0, false, false, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUploadIntervalTime() {
        return this.uploadIntervalTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getHashUploadIntervalCount() {
        return this.hashUploadIntervalCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDisableNetConnectedFlush() {
        return this.disableNetConnectedFlush;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getEnableHLog() {
        return this.enableHLog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUploadIntervalCount() {
        return this.uploadIntervalCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableFlush() {
        return this.enableFlush;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBalanceIntervalTime() {
        return this.balanceIntervalTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getBalanceSwitch() {
        return this.balanceSwitch;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBalanceFlushIntervalTime() {
        return this.balanceFlushIntervalTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getBalanceHeadSwitch() {
        return this.balanceHeadSwitch;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getHashTimeFrom() {
        return this.hashTimeFrom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getHashTimeUntil() {
        return this.hashTimeUntil;
    }

    @NotNull
    public final AppConfigEntity copy(long uploadIntervalTime, int uploadIntervalCount, boolean enableFlush, long balanceIntervalTime, boolean balanceSwitch, long balanceFlushIntervalTime, long balanceHeadSwitch, long hashTimeFrom, long hashTimeUntil, int hashUploadIntervalCount, boolean disableNetConnectedFlush, boolean enableHLog) {
        return new AppConfigEntity(uploadIntervalTime, uploadIntervalCount, enableFlush, balanceIntervalTime, balanceSwitch, balanceFlushIntervalTime, balanceHeadSwitch, hashTimeFrom, hashTimeUntil, hashUploadIntervalCount, disableNetConnectedFlush, enableHLog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigEntity)) {
            return false;
        }
        AppConfigEntity appConfigEntity = (AppConfigEntity) other;
        return this.uploadIntervalTime == appConfigEntity.uploadIntervalTime && this.uploadIntervalCount == appConfigEntity.uploadIntervalCount && this.enableFlush == appConfigEntity.enableFlush && this.balanceIntervalTime == appConfigEntity.balanceIntervalTime && this.balanceSwitch == appConfigEntity.balanceSwitch && this.balanceFlushIntervalTime == appConfigEntity.balanceFlushIntervalTime && this.balanceHeadSwitch == appConfigEntity.balanceHeadSwitch && this.hashTimeFrom == appConfigEntity.hashTimeFrom && this.hashTimeUntil == appConfigEntity.hashTimeUntil && this.hashUploadIntervalCount == appConfigEntity.hashUploadIntervalCount && this.disableNetConnectedFlush == appConfigEntity.disableNetConnectedFlush && this.enableHLog == appConfigEntity.enableHLog;
    }

    public final long getBalanceFlushIntervalTime() {
        return this.balanceFlushIntervalTime;
    }

    public final long getBalanceHeadSwitch() {
        return this.balanceHeadSwitch;
    }

    public final long getBalanceIntervalTime() {
        return this.balanceIntervalTime;
    }

    public final boolean getBalanceSwitch() {
        return this.balanceSwitch;
    }

    public final boolean getDisableNetConnectedFlush() {
        return this.disableNetConnectedFlush;
    }

    public final boolean getEnableFlush() {
        return this.enableFlush;
    }

    public final boolean getEnableHLog() {
        return this.enableHLog;
    }

    public final long getHashTimeFrom() {
        return this.hashTimeFrom;
    }

    public final long getHashTimeUntil() {
        return this.hashTimeUntil;
    }

    public final int getHashUploadIntervalCount() {
        return this.hashUploadIntervalCount;
    }

    public final int getUploadIntervalCount() {
        return this.uploadIntervalCount;
    }

    public final long getUploadIntervalTime() {
        return this.uploadIntervalTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.uploadIntervalTime) * 31) + Integer.hashCode(this.uploadIntervalCount)) * 31;
        boolean z = this.enableFlush;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Long.hashCode(this.balanceIntervalTime)) * 31;
        boolean z2 = this.balanceSwitch;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((((((((((iHashCode2 + r2) * 31) + Long.hashCode(this.balanceFlushIntervalTime)) * 31) + Long.hashCode(this.balanceHeadSwitch)) * 31) + Long.hashCode(this.hashTimeFrom)) * 31) + Long.hashCode(this.hashTimeUntil)) * 31) + Integer.hashCode(this.hashUploadIntervalCount)) * 31;
        boolean z3 = this.disableNetConnectedFlush;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i = (iHashCode3 + r3) * 31;
        boolean z4 = this.enableHLog;
        return i + (z4 ? 1 : z4);
    }

    public final void setBalanceFlushIntervalTime(long j2) {
        this.balanceFlushIntervalTime = j2;
    }

    public final void setBalanceHeadSwitch(long j2) {
        this.balanceHeadSwitch = j2;
    }

    public final void setBalanceIntervalTime(long j2) {
        this.balanceIntervalTime = j2;
    }

    public final void setBalanceSwitch(boolean z) {
        this.balanceSwitch = z;
    }

    public final void setDisableNetConnectedFlush(boolean z) {
        this.disableNetConnectedFlush = z;
    }

    public final void setEnableFlush(boolean z) {
        this.enableFlush = z;
    }

    public final void setEnableHLog(boolean z) {
        this.enableHLog = z;
    }

    public final void setHashTimeFrom(long j2) {
        this.hashTimeFrom = j2;
    }

    public final void setHashTimeUntil(long j2) {
        this.hashTimeUntil = j2;
    }

    public final void setHashUploadIntervalCount(int i) {
        this.hashUploadIntervalCount = i;
    }

    public final void setUploadIntervalCount(int i) {
        this.uploadIntervalCount = i;
    }

    public final void setUploadIntervalTime(long j2) {
        this.uploadIntervalTime = j2;
    }

    @NotNull
    public String toString() {
        return "AppConfigEntity(uploadIntervalTime=" + this.uploadIntervalTime + ", uploadIntervalCount=" + this.uploadIntervalCount + ", enableFlush=" + this.enableFlush + ", balanceIntervalTime=" + this.balanceIntervalTime + ", balanceSwitch=" + this.balanceSwitch + ", balanceFlushIntervalTime=" + this.balanceFlushIntervalTime + ", balanceHeadSwitch=" + this.balanceHeadSwitch + ", hashTimeFrom=" + this.hashTimeFrom + ", hashTimeUntil=" + this.hashTimeUntil + ", hashUploadIntervalCount=" + this.hashUploadIntervalCount + ", disableNetConnectedFlush=" + this.disableNetConnectedFlush + ", enableHLog=" + this.enableHLog + ')';
    }

    public AppConfigEntity(long j2, int i, boolean z, long j3, boolean z2, long j4, long j5, long j6, long j7, int i2, boolean z3, boolean z4) {
        this.uploadIntervalTime = j2;
        this.uploadIntervalCount = i;
        this.enableFlush = z;
        this.balanceIntervalTime = j3;
        this.balanceSwitch = z2;
        this.balanceFlushIntervalTime = j4;
        this.balanceHeadSwitch = j5;
        this.hashTimeFrom = j6;
        this.hashTimeUntil = j7;
        this.hashUploadIntervalCount = i2;
        this.disableNetConnectedFlush = z3;
        this.enableHLog = z4;
    }

    public /* synthetic */ AppConfigEntity(long j2, int i, boolean z, long j3, boolean z2, long j4, long j5, long j6, long j7, int i2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? m04.INSTANCE.w() : j2, (i3 & 2) != 0 ? m04.INSTANCE.t() : i, (i3 & 4) != 0 ? m04.INSTANCE.j() : z, (i3 & 8) != 0 ? m04.INSTANCE.e() : j3, (i3 & 16) != 0 ? m04.INSTANCE.h() : z2, (i3 & 32) != 0 ? m04.INSTANCE.a() : j4, (i3 & 64) != 0 ? m04.INSTANCE.d() : j5, (i3 & 128) != 0 ? m04.INSTANCE.p() : j6, (i3 & 256) != 0 ? m04.INSTANCE.s() : j7, (i3 & 512) != 0 ? m04.INSTANCE.m() : i2, (i3 & 1024) != 0 ? m04.INSTANCE.i() : z3, (i3 & 2048) != 0 ? m04.INSTANCE.k() : z4);
    }
}
