package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/UserVipInfoVo;", "", "userId", "", "status", "", "actDetailbenefitCount", "benefitTotal", "(JIII)V", "getActDetailbenefitCount", "()I", "setActDetailbenefitCount", "(I)V", "getBenefitTotal", "setBenefitTotal", "getStatus", "setStatus", "getUserId", "()J", "setUserId", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class UserVipInfoVo {
    private int actDetailbenefitCount;
    private int benefitTotal;
    private int status;
    private long userId;

    public UserVipInfoVo() {
        this(0L, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ UserVipInfoVo copy$default(UserVipInfoVo userVipInfoVo, long j2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j2 = userVipInfoVo.userId;
        }
        long j3 = j2;
        if ((i4 & 2) != 0) {
            i = userVipInfoVo.status;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = userVipInfoVo.actDetailbenefitCount;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = userVipInfoVo.benefitTotal;
        }
        return userVipInfoVo.copy(j3, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActDetailbenefitCount() {
        return this.actDetailbenefitCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBenefitTotal() {
        return this.benefitTotal;
    }

    @NotNull
    public final UserVipInfoVo copy(long userId, int status, int actDetailbenefitCount, int benefitTotal) {
        return new UserVipInfoVo(userId, status, actDetailbenefitCount, benefitTotal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserVipInfoVo)) {
            return false;
        }
        UserVipInfoVo userVipInfoVo = (UserVipInfoVo) other;
        return this.userId == userVipInfoVo.userId && this.status == userVipInfoVo.status && this.actDetailbenefitCount == userVipInfoVo.actDetailbenefitCount && this.benefitTotal == userVipInfoVo.benefitTotal;
    }

    public final int getActDetailbenefitCount() {
        return this.actDetailbenefitCount;
    }

    public final int getBenefitTotal() {
        return this.benefitTotal;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.userId) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.actDetailbenefitCount)) * 31) + Integer.hashCode(this.benefitTotal);
    }

    public final void setActDetailbenefitCount(int i) {
        this.actDetailbenefitCount = i;
    }

    public final void setBenefitTotal(int i) {
        this.benefitTotal = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUserId(long j2) {
        this.userId = j2;
    }

    @NotNull
    public String toString() {
        return "UserVipInfoVo(userId=" + this.userId + ", status=" + this.status + ", actDetailbenefitCount=" + this.actDetailbenefitCount + ", benefitTotal=" + this.benefitTotal + ')';
    }

    public UserVipInfoVo(long j2, int i, int i2, int i3) {
        this.userId = j2;
        this.status = i;
        this.actDetailbenefitCount = i2;
        this.benefitTotal = i3;
    }

    public /* synthetic */ UserVipInfoVo(long j2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
