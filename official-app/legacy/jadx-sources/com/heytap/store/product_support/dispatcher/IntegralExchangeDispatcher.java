package com.heytap.store.product_support.dispatcher;

import com.heytap.store.product_support.data.OrderType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/IntegralExchangeDispatcher;", "Lcom/heytap/store/product_support/dispatcher/IntegralDispatcher;", "()V", "type", "Lcom/heytap/store/product_support/data/OrderType;", "getType", "()Lcom/heytap/store/product_support/data/OrderType;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntegralExchangeDispatcher extends IntegralDispatcher {

    @NotNull
    private final OrderType type = OrderType.ORDER_TYPE_INTEGRAL_ORDER;

    @Override // com.heytap.store.product_support.dispatcher.IntegralDispatcher
    @NotNull
    public OrderType getType() {
        return this.type;
    }
}
