package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006&"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/SmartAcConfigVo;", "", "isNeedM4mUpgrade", "", "isNeedInverse", "inverseKeyType", "", "probeCount", "sampleCount", "numDistance", "failRetryNum", "queryKeyTimeInterval", "queryKeyMaxNum", "(ZZIIIIIII)V", "getFailRetryNum", "()I", "getInverseKeyType", "()Z", "getNumDistance", "getProbeCount", "getQueryKeyMaxNum", "getQueryKeyTimeInterval", "getSampleCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SmartAcConfigVo {
    private final int failRetryNum;
    private final int inverseKeyType;
    private final boolean isNeedInverse;
    private final boolean isNeedM4mUpgrade;
    private final int numDistance;
    private final int probeCount;
    private final int queryKeyMaxNum;
    private final int queryKeyTimeInterval;
    private final int sampleCount;

    public SmartAcConfigVo(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.isNeedM4mUpgrade = z;
        this.isNeedInverse = z2;
        this.inverseKeyType = i;
        this.probeCount = i2;
        this.sampleCount = i3;
        this.numDistance = i4;
        this.failRetryNum = i5;
        this.queryKeyTimeInterval = i6;
        this.queryKeyMaxNum = i7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNeedM4mUpgrade() {
        return this.isNeedM4mUpgrade;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNeedInverse() {
        return this.isNeedInverse;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInverseKeyType() {
        return this.inverseKeyType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProbeCount() {
        return this.probeCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNumDistance() {
        return this.numDistance;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFailRetryNum() {
        return this.failRetryNum;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getQueryKeyTimeInterval() {
        return this.queryKeyTimeInterval;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getQueryKeyMaxNum() {
        return this.queryKeyMaxNum;
    }

    @NotNull
    public final SmartAcConfigVo copy(boolean isNeedM4mUpgrade, boolean isNeedInverse, int inverseKeyType, int probeCount, int sampleCount, int numDistance, int failRetryNum, int queryKeyTimeInterval, int queryKeyMaxNum) {
        return new SmartAcConfigVo(isNeedM4mUpgrade, isNeedInverse, inverseKeyType, probeCount, sampleCount, numDistance, failRetryNum, queryKeyTimeInterval, queryKeyMaxNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartAcConfigVo)) {
            return false;
        }
        SmartAcConfigVo smartAcConfigVo = (SmartAcConfigVo) other;
        return this.isNeedM4mUpgrade == smartAcConfigVo.isNeedM4mUpgrade && this.isNeedInverse == smartAcConfigVo.isNeedInverse && this.inverseKeyType == smartAcConfigVo.inverseKeyType && this.probeCount == smartAcConfigVo.probeCount && this.sampleCount == smartAcConfigVo.sampleCount && this.numDistance == smartAcConfigVo.numDistance && this.failRetryNum == smartAcConfigVo.failRetryNum && this.queryKeyTimeInterval == smartAcConfigVo.queryKeyTimeInterval && this.queryKeyMaxNum == smartAcConfigVo.queryKeyMaxNum;
    }

    public final int getFailRetryNum() {
        return this.failRetryNum;
    }

    public final int getInverseKeyType() {
        return this.inverseKeyType;
    }

    public final int getNumDistance() {
        return this.numDistance;
    }

    public final int getProbeCount() {
        return this.probeCount;
    }

    public final int getQueryKeyMaxNum() {
        return this.queryKeyMaxNum;
    }

    public final int getQueryKeyTimeInterval() {
        return this.queryKeyTimeInterval;
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        boolean z = this.isNeedM4mUpgrade;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isNeedInverse;
        return ((((((((((((((i + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.inverseKeyType)) * 31) + Integer.hashCode(this.probeCount)) * 31) + Integer.hashCode(this.sampleCount)) * 31) + Integer.hashCode(this.numDistance)) * 31) + Integer.hashCode(this.failRetryNum)) * 31) + Integer.hashCode(this.queryKeyTimeInterval)) * 31) + Integer.hashCode(this.queryKeyMaxNum);
    }

    public final boolean isNeedInverse() {
        return this.isNeedInverse;
    }

    public final boolean isNeedM4mUpgrade() {
        return this.isNeedM4mUpgrade;
    }

    @NotNull
    public String toString() {
        return "SmartAcConfigVo(isNeedM4mUpgrade=" + this.isNeedM4mUpgrade + ", isNeedInverse=" + this.isNeedInverse + ", inverseKeyType=" + this.inverseKeyType + ", probeCount=" + this.probeCount + ", sampleCount=" + this.sampleCount + ", numDistance=" + this.numDistance + ", failRetryNum=" + this.failRetryNum + ", queryKeyTimeInterval=" + this.queryKeyTimeInterval + ", queryKeyMaxNum=" + this.queryKeyMaxNum + ")";
    }
}
