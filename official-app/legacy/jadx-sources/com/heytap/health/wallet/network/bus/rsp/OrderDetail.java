package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.sbe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u008d\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/OrderDetail;", "", "orderType", "", "orderAmount", "orderRealAmount", sbe.PAY_SDK_PRODUCTNAME, "", "orderTime", "orderNo", "orderStatusDesc", "orderStatus", "appCode", "paymentChannel", "payee", "serviceTel", "invoiceAuthCode", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "getInvoiceAuthCode", "getOrderAmount", "()I", "getOrderNo", "getOrderRealAmount", "getOrderStatus", "getOrderStatusDesc", "getOrderTime", "getOrderType", "getPayee", "getPaymentChannel", "getProductName", "getServiceTel", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderDetail {

    @NotNull
    private final String appCode;

    @Nullable
    private final String invoiceAuthCode;
    private final int orderAmount;

    @NotNull
    private final String orderNo;
    private final int orderRealAmount;

    @NotNull
    private final String orderStatus;

    @NotNull
    private final String orderStatusDesc;

    @NotNull
    private final String orderTime;
    private final int orderType;

    @NotNull
    private final String payee;

    @NotNull
    private final String paymentChannel;

    @NotNull
    private final String productName;

    @NotNull
    private final String serviceTel;

    public OrderDetail(int i, int i2, int i3, @NotNull String productName, @NotNull String orderTime, @NotNull String orderNo, @NotNull String orderStatusDesc, @NotNull String orderStatus, @NotNull String appCode, @NotNull String paymentChannel, @NotNull String payee, @NotNull String serviceTel, @Nullable String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(orderTime, "orderTime");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderStatusDesc, "orderStatusDesc");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(paymentChannel, "paymentChannel");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(serviceTel, "serviceTel");
        this.orderType = i;
        this.orderAmount = i2;
        this.orderRealAmount = i3;
        this.productName = productName;
        this.orderTime = orderTime;
        this.orderNo = orderNo;
        this.orderStatusDesc = orderStatusDesc;
        this.orderStatus = orderStatus;
        this.appCode = appCode;
        this.paymentChannel = paymentChannel;
        this.payee = payee;
        this.serviceTel = serviceTel;
        this.invoiceAuthCode = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayee() {
        return this.payee;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getServiceTel() {
        return this.serviceTel;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInvoiceAuthCode() {
        return this.invoiceAuthCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOrderAmount() {
        return this.orderAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrderRealAmount() {
        return this.orderRealAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderTime() {
        return this.orderTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final OrderDetail copy(int orderType, int orderAmount, int orderRealAmount, @NotNull String productName, @NotNull String orderTime, @NotNull String orderNo, @NotNull String orderStatusDesc, @NotNull String orderStatus, @NotNull String appCode, @NotNull String paymentChannel, @NotNull String payee, @NotNull String serviceTel, @Nullable String invoiceAuthCode) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(orderTime, "orderTime");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderStatusDesc, "orderStatusDesc");
        Intrinsics.checkNotNullParameter(orderStatus, "orderStatus");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(paymentChannel, "paymentChannel");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(serviceTel, "serviceTel");
        return new OrderDetail(orderType, orderAmount, orderRealAmount, productName, orderTime, orderNo, orderStatusDesc, orderStatus, appCode, paymentChannel, payee, serviceTel, invoiceAuthCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetail)) {
            return false;
        }
        OrderDetail orderDetail = (OrderDetail) other;
        return this.orderType == orderDetail.orderType && this.orderAmount == orderDetail.orderAmount && this.orderRealAmount == orderDetail.orderRealAmount && Intrinsics.areEqual(this.productName, orderDetail.productName) && Intrinsics.areEqual(this.orderTime, orderDetail.orderTime) && Intrinsics.areEqual(this.orderNo, orderDetail.orderNo) && Intrinsics.areEqual(this.orderStatusDesc, orderDetail.orderStatusDesc) && Intrinsics.areEqual(this.orderStatus, orderDetail.orderStatus) && Intrinsics.areEqual(this.appCode, orderDetail.appCode) && Intrinsics.areEqual(this.paymentChannel, orderDetail.paymentChannel) && Intrinsics.areEqual(this.payee, orderDetail.payee) && Intrinsics.areEqual(this.serviceTel, orderDetail.serviceTel) && Intrinsics.areEqual(this.invoiceAuthCode, orderDetail.invoiceAuthCode);
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getInvoiceAuthCode() {
        return this.invoiceAuthCode;
    }

    public final int getOrderAmount() {
        return this.orderAmount;
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

    @NotNull
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @NotNull
    public final String getOrderTime() {
        return this.orderTime;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPayee() {
        return this.payee;
    }

    @NotNull
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    @NotNull
    public final String getProductName() {
        return this.productName;
    }

    @NotNull
    public final String getServiceTel() {
        return this.serviceTel;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((Integer.hashCode(this.orderType) * 31) + Integer.hashCode(this.orderAmount)) * 31) + Integer.hashCode(this.orderRealAmount)) * 31) + this.productName.hashCode()) * 31) + this.orderTime.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + this.orderStatusDesc.hashCode()) * 31) + this.orderStatus.hashCode()) * 31) + this.appCode.hashCode()) * 31) + this.paymentChannel.hashCode()) * 31) + this.payee.hashCode()) * 31) + this.serviceTel.hashCode()) * 31;
        String str = this.invoiceAuthCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrderDetail(orderType=" + this.orderType + ", orderAmount=" + this.orderAmount + ", orderRealAmount=" + this.orderRealAmount + ", productName=" + this.productName + ", orderTime=" + this.orderTime + ", orderNo=" + this.orderNo + ", orderStatusDesc=" + this.orderStatusDesc + ", orderStatus=" + this.orderStatus + ", appCode=" + this.appCode + ", paymentChannel=" + this.paymentChannel + ", payee=" + this.payee + ", serviceTel=" + this.serviceTel + ", invoiceAuthCode=" + this.invoiceAuthCode + ")";
    }
}
