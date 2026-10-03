package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/OrderDetailParam;", "", j7l.KEY_CPLC, "", "orderNo", "(Ljava/lang/String;Ljava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "getOrderNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderDetailParam {

    @Nullable
    private String cplc;

    @Nullable
    private final String orderNo;

    public OrderDetailParam(@Nullable String str, @Nullable String str2) {
        this.cplc = str;
        this.orderNo = str2;
    }

    public static /* synthetic */ OrderDetailParam copy$default(OrderDetailParam orderDetailParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderDetailParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = orderDetailParam.orderNo;
        }
        return orderDetailParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    public final OrderDetailParam copy(@Nullable String cplc, @Nullable String orderNo) {
        return new OrderDetailParam(cplc, orderNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailParam)) {
            return false;
        }
        OrderDetailParam orderDetailParam = (OrderDetailParam) other;
        return Intrinsics.areEqual(this.cplc, orderDetailParam.cplc) && Intrinsics.areEqual(this.orderNo, orderDetailParam.orderNo);
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderNo;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    @NotNull
    public String toString() {
        return "OrderDetailParam(cplc=" + this.cplc + ", orderNo=" + this.orderNo + ")";
    }
}
