package com.heytap.store.product_support.dispatcher;

import com.heytap.store.product_support.data.OrderType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/PreOrdainDispatcher;", "Lcom/heytap/store/product_support/dispatcher/SubscribeDispatcher;", "()V", "responseType", "Lcom/heytap/store/product_support/data/OrderType;", "getResponseType", "()Lcom/heytap/store/product_support/data/OrderType;", "setResponseType", "(Lcom/heytap/store/product_support/data/OrderType;)V", "subscribeType", "", "getSubscribeType", "()Ljava/lang/String;", "setSubscribeType", "(Ljava/lang/String;)V", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PreOrdainDispatcher extends SubscribeDispatcher {

    @NotNull
    private String subscribeType = "1";

    @NotNull
    private OrderType responseType = OrderType.ORDER_TYPE_PRE_ORDAIN;

    @Override // com.heytap.store.product_support.dispatcher.SubscribeDispatcher
    @NotNull
    public OrderType getResponseType() {
        return this.responseType;
    }

    @Override // com.heytap.store.product_support.dispatcher.SubscribeDispatcher
    @NotNull
    public String getSubscribeType() {
        return this.subscribeType;
    }

    @Override // com.heytap.store.product_support.dispatcher.SubscribeDispatcher
    public void setResponseType(@NotNull OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<set-?>");
        this.responseType = orderType;
    }

    @Override // com.heytap.store.product_support.dispatcher.SubscribeDispatcher
    public void setSubscribeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribeType = str;
    }
}
