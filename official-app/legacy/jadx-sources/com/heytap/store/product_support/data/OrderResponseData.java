package com.heytap.store.product_support.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J[\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00102\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00066"}, d2 = {"Lcom/heytap/store/product_support/data/OrderResponseData;", "", "type", "Lcom/heytap/store/product_support/data/OrderType;", "code", "", "errorMessage", "", "isSuccess", "", "throwable", "", "cartId", "cartDraftMark", "buttonType", "(Lcom/heytap/store/product_support/data/OrderType;ILjava/lang/String;ZLjava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;I)V", "getButtonType", "()I", "setButtonType", "(I)V", "getCartDraftMark", "()Ljava/lang/String;", "setCartDraftMark", "(Ljava/lang/String;)V", "getCartId", "setCartId", "getCode", "setCode", "getErrorMessage", "setErrorMessage", "()Z", "setSuccess", "(Z)V", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "getType", "()Lcom/heytap/store/product_support/data/OrderType;", "setType", "(Lcom/heytap/store/product_support/data/OrderType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrderResponseData {
    private int buttonType;

    @NotNull
    private String cartDraftMark;

    @NotNull
    private String cartId;
    private int code;

    @NotNull
    private String errorMessage;
    private boolean isSuccess;

    @Nullable
    private Throwable throwable;

    @NotNull
    private OrderType type;

    public OrderResponseData() {
        this(null, 0, null, false, null, null, null, 0, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCartDraftMark() {
        return this.cartDraftMark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getButtonType() {
        return this.buttonType;
    }

    @NotNull
    public final OrderResponseData copy(@NotNull OrderType type, int code, @NotNull String errorMessage, boolean isSuccess, @Nullable Throwable throwable, @NotNull String cartId, @NotNull String cartDraftMark, int buttonType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(cartId, "cartId");
        Intrinsics.checkNotNullParameter(cartDraftMark, "cartDraftMark");
        return new OrderResponseData(type, code, errorMessage, isSuccess, throwable, cartId, cartDraftMark, buttonType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResponseData)) {
            return false;
        }
        OrderResponseData orderResponseData = (OrderResponseData) other;
        return this.type == orderResponseData.type && this.code == orderResponseData.code && Intrinsics.areEqual(this.errorMessage, orderResponseData.errorMessage) && this.isSuccess == orderResponseData.isSuccess && Intrinsics.areEqual(this.throwable, orderResponseData.throwable) && Intrinsics.areEqual(this.cartId, orderResponseData.cartId) && Intrinsics.areEqual(this.cartDraftMark, orderResponseData.cartDraftMark) && this.buttonType == orderResponseData.buttonType;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    @NotNull
    public final String getCartDraftMark() {
        return this.cartDraftMark;
    }

    @NotNull
    public final String getCartId() {
        return this.cartId;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    public final OrderType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.errorMessage.hashCode()) * 31;
        boolean z = this.isSuccess;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Throwable th = this.throwable;
        return ((((((i + (th == null ? 0 : th.hashCode())) * 31) + this.cartId.hashCode()) * 31) + this.cartDraftMark.hashCode()) * 31) + Integer.hashCode(this.buttonType);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setButtonType(int i) {
        this.buttonType = i;
    }

    public final void setCartDraftMark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cartDraftMark = str;
    }

    public final void setCartId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cartId = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setThrowable(@Nullable Throwable th) {
        this.throwable = th;
    }

    public final void setType(@NotNull OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<set-?>");
        this.type = orderType;
    }

    @NotNull
    public String toString() {
        return "OrderResponseData(type=" + this.type + ", code=" + this.code + ", errorMessage=" + this.errorMessage + ", isSuccess=" + this.isSuccess + ", throwable=" + this.throwable + ", cartId=" + this.cartId + ", cartDraftMark=" + this.cartDraftMark + ", buttonType=" + this.buttonType + ')';
    }

    public OrderResponseData(@NotNull OrderType type, int i, @NotNull String errorMessage, boolean z, @Nullable Throwable th, @NotNull String cartId, @NotNull String cartDraftMark, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(cartId, "cartId");
        Intrinsics.checkNotNullParameter(cartDraftMark, "cartDraftMark");
        this.type = type;
        this.code = i;
        this.errorMessage = errorMessage;
        this.isSuccess = z;
        this.throwable = th;
        this.cartId = cartId;
        this.cartDraftMark = cartDraftMark;
        this.buttonType = i2;
    }

    public /* synthetic */ OrderResponseData(OrderType orderType, int i, String str, boolean z, Throwable th, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? OrderType.ORDER_TYPE_ADD_BUY : orderType, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : th, (i3 & 32) != 0 ? "" : str2, (i3 & 64) == 0 ? str3 : "", (i3 & 128) != 0 ? 1 : i2);
    }
}
