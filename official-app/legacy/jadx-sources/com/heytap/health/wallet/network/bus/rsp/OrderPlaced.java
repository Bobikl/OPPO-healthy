package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/OrderPlaced;", "", "orderNo", "", "signedData", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "getSignedData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderPlaced {

    @Nullable
    private final String orderNo;

    @Nullable
    private final String signedData;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderPlaced() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrderPlaced copy$default(OrderPlaced orderPlaced, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderPlaced.orderNo;
        }
        if ((i & 2) != 0) {
            str2 = orderPlaced.signedData;
        }
        return orderPlaced.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignedData() {
        return this.signedData;
    }

    @NotNull
    public final OrderPlaced copy(@Nullable String orderNo, @Nullable String signedData) {
        return new OrderPlaced(orderNo, signedData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPlaced)) {
            return false;
        }
        OrderPlaced orderPlaced = (OrderPlaced) other;
        return Intrinsics.areEqual(this.orderNo, orderPlaced.orderNo) && Intrinsics.areEqual(this.signedData, orderPlaced.signedData);
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getSignedData() {
        return this.signedData;
    }

    public int hashCode() {
        String str = this.orderNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signedData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderPlaced(orderNo=" + this.orderNo + ", signedData=" + this.signedData + ")";
    }

    public OrderPlaced(@Nullable String str, @Nullable String str2) {
        this.orderNo = str;
        this.signedData = str2;
    }

    public /* synthetic */ OrderPlaced(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
