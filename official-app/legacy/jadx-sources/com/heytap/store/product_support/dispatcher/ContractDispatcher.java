package com.heytap.store.product_support.dispatcher;

import com.heytap.store.product_support.data.OrderParamsData;
import com.heytap.store.product_support.data.OrderParamsDataKt;
import com.heytap.store.product_support.data.OrderResponseData;
import com.heytap.store.product_support.data.OrderType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/ContractDispatcher;", "Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "()V", "finallyAction", "", "orderList", "", "", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ContractDispatcher extends BaseDispatcher {
    @Override // com.heytap.store.product_support.dispatcher.BaseDispatcher
    public void finallyAction(@NotNull Map<String, String> orderList, @NotNull OrderParamsData orderParams) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        String id = orderParams.getId();
        if (id == null) {
            id = "";
        }
        orderList.put("id", id);
        orderList.put(OrderParamsDataKt.ORDER_PARAMS_KEY_QUICK_BUY, "1");
        orderList.put(OrderParamsDataKt.ORDER_PARAMS_KEY_PIN_GOU_ENABLE, "0");
        Function1<Map<String, String>, Unit> parameterCallback = getParameterCallback();
        if (parameterCallback != null) {
            parameterCallback.invoke(orderList);
        }
        Function1<OrderResponseData, Unit> resultCallback = getResultCallback();
        if (resultCallback == null) {
            return;
        }
        OrderResponseData orderResponseData = new OrderResponseData(null, 0, null, false, null, null, null, 0, 255, null);
        orderResponseData.setSuccess(true);
        orderResponseData.setType(OrderType.CONTRACT);
        orderResponseData.setCode(200);
        resultCallback.invoke(orderResponseData);
    }
}
