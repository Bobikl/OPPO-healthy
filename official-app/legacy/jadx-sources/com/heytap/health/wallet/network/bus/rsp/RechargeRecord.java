package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/RechargeRecord;", "", "payChannel", "", "orderNo", "orderRealAmount", "", "orderStatus", "createTime", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCreateTime", "()Ljava/lang/String;", "getOrderNo", "getOrderRealAmount", "()I", "getOrderStatus", "getPayChannel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RechargeRecord {

    @Nullable
    private final String createTime;

    @NotNull
    private final String orderNo;
    private final int orderRealAmount;

    @NotNull
    private final String orderStatus;

    @Nullable
    private final String payChannel;

    public RechargeRecord(@Nullable String str, @NotNull String orderNo, int i, @NotNull String orderStatus, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        this.payChannel = str;
        this.orderNo = orderNo;
        this.orderRealAmount = i;
        this.orderStatus = orderStatus;
        this.createTime = str2;
    }

    public static /* synthetic */ RechargeRecord copy$default(RechargeRecord rechargeRecord, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rechargeRecord.payChannel;
        }
        if ((i2 & 2) != 0) {
            str2 = rechargeRecord.orderNo;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = rechargeRecord.orderRealAmount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = rechargeRecord.orderStatus;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = rechargeRecord.createTime;
        }
        return rechargeRecord.copy(str, str5, i3, str6, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayChannel() {
        return this.payChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrderRealAmount() {
        return this.orderRealAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final RechargeRecord copy(@Nullable String payChannel, @NotNull String orderNo, int orderRealAmount, @NotNull String orderStatus, @Nullable String createTime) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        return new RechargeRecord(payChannel, orderNo, orderRealAmount, orderStatus, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RechargeRecord)) {
            return false;
        }
        RechargeRecord rechargeRecord = (RechargeRecord) other;
        return Intrinsics.areEqual(this.payChannel, rechargeRecord.payChannel) && Intrinsics.areEqual(this.orderNo, rechargeRecord.orderNo) && this.orderRealAmount == rechargeRecord.orderRealAmount && Intrinsics.areEqual(this.orderStatus, rechargeRecord.orderStatus) && Intrinsics.areEqual(this.createTime, rechargeRecord.createTime);
    }

    @Nullable
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getOrderRealAmount() {
        return this.orderRealAmount;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getPayChannel() {
        return this.payChannel;
    }

    public int hashCode() {
        String str = this.payChannel;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + Integer.hashCode(this.orderRealAmount)) * 31) + this.orderStatus.hashCode()) * 31;
        String str2 = this.createTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RechargeRecord(payChannel=" + this.payChannel + ", orderNo=" + this.orderNo + ", orderRealAmount=" + this.orderRealAmount + ", orderStatus=" + this.orderStatus + ", createTime=" + this.createTime + ")";
    }
}
