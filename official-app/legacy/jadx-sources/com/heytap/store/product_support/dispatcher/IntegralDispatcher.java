package com.heytap.store.product_support.dispatcher;

import com.heytap.store.product_support.data.OrderParamsData;
import com.heytap.store.product_support.data.OrderResponseData;
import com.heytap.store.product_support.data.OrderType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/IntegralDispatcher;", "Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "()V", "type", "Lcom/heytap/store/product_support/data/OrderType;", "getType", "()Lcom/heytap/store/product_support/data/OrderType;", "finallyAction", "", "orderList", "", "", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class IntegralDispatcher extends BaseDispatcher {

    @NotNull
    private final OrderType type = OrderType.ORDER_TYPE_INTEGRAL_ORDER;

    @Override // com.heytap.store.product_support.dispatcher.BaseDispatcher
    public void finallyAction(@NotNull Map<String, String> orderList, @NotNull OrderParamsData orderParams) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        Function1<OrderResponseData, Unit> resultCallback = getResultCallback();
        if (resultCallback == null) {
            return;
        }
        OrderResponseData orderResponseData = new OrderResponseData(null, 0, null, false, null, null, null, 0, 255, null);
        orderResponseData.setSuccess(true);
        orderResponseData.setType(getType());
        orderResponseData.setCode(200);
        resultCallback.invoke(orderResponseData);
    }

    @NotNull
    public OrderType getType() {
        return this.type;
    }
}
