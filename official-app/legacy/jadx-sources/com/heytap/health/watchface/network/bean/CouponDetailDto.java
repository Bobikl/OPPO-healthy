package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00016B_\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b3\u00104J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003Jw\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\u0013\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b+\u0010$R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b,\u0010'R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b.\u0010'R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b/\u0010'R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b0\u0010'R\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b2\u0010*¨\u00067"}, d2 = {"Lcom/heytap/health/watchface/network/bean/CouponDetailDto;", "", "", "isCouponUsed", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "id", "couponName", "couponType", "jumpType", "jumpRes", "effectiveTime", "expirationTime", "useRules", "amount", "balance", "status", "copy", "toString", "hashCode", "other", "equals", "J", "getId", "()J", "Ljava/lang/String;", "getCouponName", "()Ljava/lang/String;", "I", "getCouponType", "()I", "getJumpType", "getJumpRes", "getEffectiveTime", "getExpirationTime", "getUseRules", "getAmount", "getBalance", "getStatus", "<init>", "(JLjava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CouponDetailDto {
    public static final int STATUS_COUPON_NOT_USE = 0;
    public static final int STATUS_COUPON_USED = 1;

    @NotNull
    private final String amount;

    @NotNull
    private final String balance;

    @NotNull
    private final String couponName;
    private final int couponType;

    @NotNull
    private final String effectiveTime;

    @NotNull
    private final String expirationTime;
    private final long id;

    @NotNull
    private final String jumpRes;
    private final long jumpType;
    private final int status;

    @NotNull
    private final String useRules;

    public CouponDetailDto(long j2, @NotNull String couponName, int i, long j3, @NotNull String jumpRes, @NotNull String effectiveTime, @NotNull String expirationTime, @NotNull String useRules, @NotNull String amount, @NotNull String balance, int i2) {
        Intrinsics.checkNotNullParameter(couponName, "couponName");
        Intrinsics.checkNotNullParameter(jumpRes, "jumpRes");
        Intrinsics.checkNotNullParameter(effectiveTime, "effectiveTime");
        Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
        Intrinsics.checkNotNullParameter(useRules, "useRules");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.id = j2;
        this.couponName = couponName;
        this.couponType = i;
        this.jumpType = j3;
        this.jumpRes = jumpRes;
        this.effectiveTime = effectiveTime;
        this.expirationTime = expirationTime;
        this.useRules = useRules;
        this.amount = amount;
        this.balance = balance;
        this.status = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCouponName() {
        return this.couponName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCouponType() {
        return this.couponType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getJumpType() {
        return this.jumpType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJumpRes() {
        return this.jumpRes;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEffectiveTime() {
        return this.effectiveTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUseRules() {
        return this.useRules;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final CouponDetailDto copy(long id, @NotNull String couponName, int couponType, long jumpType, @NotNull String jumpRes, @NotNull String effectiveTime, @NotNull String expirationTime, @NotNull String useRules, @NotNull String amount, @NotNull String balance, int status) {
        Intrinsics.checkNotNullParameter(couponName, "couponName");
        Intrinsics.checkNotNullParameter(jumpRes, "jumpRes");
        Intrinsics.checkNotNullParameter(effectiveTime, "effectiveTime");
        Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
        Intrinsics.checkNotNullParameter(useRules, "useRules");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        return new CouponDetailDto(id, couponName, couponType, jumpType, jumpRes, effectiveTime, expirationTime, useRules, amount, balance, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDetailDto)) {
            return false;
        }
        CouponDetailDto couponDetailDto = (CouponDetailDto) other;
        return this.id == couponDetailDto.id && Intrinsics.areEqual(this.couponName, couponDetailDto.couponName) && this.couponType == couponDetailDto.couponType && this.jumpType == couponDetailDto.jumpType && Intrinsics.areEqual(this.jumpRes, couponDetailDto.jumpRes) && Intrinsics.areEqual(this.effectiveTime, couponDetailDto.effectiveTime) && Intrinsics.areEqual(this.expirationTime, couponDetailDto.expirationTime) && Intrinsics.areEqual(this.useRules, couponDetailDto.useRules) && Intrinsics.areEqual(this.amount, couponDetailDto.amount) && Intrinsics.areEqual(this.balance, couponDetailDto.balance) && this.status == couponDetailDto.status;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getCouponName() {
        return this.couponName;
    }

    public final int getCouponType() {
        return this.couponType;
    }

    @NotNull
    public final String getEffectiveTime() {
        return this.effectiveTime;
    }

    @NotNull
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getJumpRes() {
        return this.jumpRes;
    }

    public final long getJumpType() {
        return this.jumpType;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUseRules() {
        return this.useRules;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + this.couponName.hashCode()) * 31) + Integer.hashCode(this.couponType)) * 31) + Long.hashCode(this.jumpType)) * 31) + this.jumpRes.hashCode()) * 31) + this.effectiveTime.hashCode()) * 31) + this.expirationTime.hashCode()) * 31) + this.useRules.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.balance.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    public final boolean isCouponUsed() {
        return this.status == 1;
    }

    @NotNull
    public String toString() {
        return "CouponDetailDto(id=" + this.id + ", couponName=" + this.couponName + ", couponType=" + this.couponType + ", jumpType=" + this.jumpType + ", jumpRes=" + this.jumpRes + ", effectiveTime=" + this.effectiveTime + ", expirationTime=" + this.expirationTime + ", useRules=" + this.useRules + ", amount=" + this.amount + ", balance=" + this.balance + ", status=" + this.status + ")";
    }
}
