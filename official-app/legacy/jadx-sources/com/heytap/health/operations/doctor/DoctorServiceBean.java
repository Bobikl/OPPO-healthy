package com.heytap.health.operations.doctor;

import androidx.annotation.Keep;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/health/operations/doctor/DoctorServiceBean;", "", "beginAt", "", DebugModeEntity.KEY_END_AT, "payChannel", "", "renewal", "Lcom/heytap/health/operations/doctor/Renewal;", "codeRedeemed", "", "(JJILcom/heytap/health/operations/doctor/Renewal;Z)V", "getBeginAt", "()J", "getCodeRedeemed", "()Z", "getEndAt", "getPayChannel", "()I", "getRenewal", "()Lcom/heytap/health/operations/doctor/Renewal;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DoctorServiceBean {
    private final long beginAt;
    private final boolean codeRedeemed;
    private final long endAt;
    private final int payChannel;

    @Nullable
    private final Renewal renewal;

    public DoctorServiceBean(long j2, long j3, int i, @Nullable Renewal renewal, boolean z) {
        this.beginAt = j2;
        this.endAt = j3;
        this.payChannel = i;
        this.renewal = renewal;
        this.codeRedeemed = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBeginAt() {
        return this.beginAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndAt() {
        return this.endAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Renewal getRenewal() {
        return this.renewal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCodeRedeemed() {
        return this.codeRedeemed;
    }

    @NotNull
    public final DoctorServiceBean copy(long beginAt, long endAt, int payChannel, @Nullable Renewal renewal, boolean codeRedeemed) {
        return new DoctorServiceBean(beginAt, endAt, payChannel, renewal, codeRedeemed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoctorServiceBean)) {
            return false;
        }
        DoctorServiceBean doctorServiceBean = (DoctorServiceBean) other;
        return this.beginAt == doctorServiceBean.beginAt && this.endAt == doctorServiceBean.endAt && this.payChannel == doctorServiceBean.payChannel && Intrinsics.areEqual(this.renewal, doctorServiceBean.renewal) && this.codeRedeemed == doctorServiceBean.codeRedeemed;
    }

    public final long getBeginAt() {
        return this.beginAt;
    }

    public final boolean getCodeRedeemed() {
        return this.codeRedeemed;
    }

    public final long getEndAt() {
        return this.endAt;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    @Nullable
    public final Renewal getRenewal() {
        return this.renewal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.beginAt) * 31) + Long.hashCode(this.endAt)) * 31) + Integer.hashCode(this.payChannel)) * 31;
        Renewal renewal = this.renewal;
        int iHashCode2 = (iHashCode + (renewal == null ? 0 : renewal.hashCode())) * 31;
        boolean z = this.codeRedeemed;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    @NotNull
    public String toString() {
        return "DoctorServiceBean(beginAt=" + this.beginAt + ", endAt=" + this.endAt + ", payChannel=" + this.payChannel + ", renewal=" + this.renewal + ", codeRedeemed=" + this.codeRedeemed + ")";
    }
}
