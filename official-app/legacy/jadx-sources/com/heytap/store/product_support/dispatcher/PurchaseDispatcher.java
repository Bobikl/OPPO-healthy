package com.heytap.store.product_support.dispatcher;

import com.heytap.store.base.core.util.RequestUtilsKt;
import com.heytap.store.product_support.api.ProductOrderApi;
import com.heytap.store.product_support.data.OrderParamsData;
import com.heytap.store.product_support.data.OrderParamsDataKt;
import com.heytap.store.product_support.data.OrderResponseData;
import com.heytap.store.product_support.data.OrderType;
import com.heytap.store.product_support.data.protobuf.Meta;
import com.heytap.store.product_support.data.protobuf.OrderCartInsertForm;
import com.oplus.aiunit.vision.ovf;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/PurchaseDispatcher;", "Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "()V", "finallyAction", "", "orderList", "", "", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "startBuyOrder", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PurchaseDispatcher extends BaseDispatcher {
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
    }

    public final void startBuyOrder(@NotNull Map<String, String> orderList) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        final OrderResponseData orderResponseData = new OrderResponseData(null, 0, null, false, null, null, null, 0, 255, null);
        orderResponseData.setType(OrderType.ORDER_TYPE_ADD_BUY);
        Function1<Map<String, String>, Unit> parameterCallback = getParameterCallback();
        if (parameterCallback != null) {
            parameterCallback.invoke(orderList);
        }
        RequestUtilsKt.request(((ProductOrderApi) ovf.e(ovf.INSTANCE, ProductOrderApi.class, null, 2, null)).addBuy(orderList), null, new Function1<Throwable, Unit>() { // from class: com.heytap.store.product_support.dispatcher.PurchaseDispatcher.startBuyOrder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<OrderResponseData, Unit> resultCallback = PurchaseDispatcher.this.getResultCallback();
                if (resultCallback == null) {
                    return;
                }
                OrderResponseData orderResponseData2 = orderResponseData;
                orderResponseData2.setSuccess(false);
                orderResponseData2.setThrowable(it);
                resultCallback.invoke(orderResponseData2);
            }
        }, new Function1<OrderCartInsertForm, Unit>() { // from class: com.heytap.store.product_support.dispatcher.PurchaseDispatcher.startBuyOrder.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OrderCartInsertForm orderCartInsertForm) {
                invoke2(orderCartInsertForm);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OrderCartInsertForm it) {
                String str;
                Integer num;
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<OrderResponseData, Unit> resultCallback = PurchaseDispatcher.this.getResultCallback();
                if (resultCallback == null) {
                    return;
                }
                OrderResponseData orderResponseData2 = orderResponseData;
                orderResponseData2.setSuccess(true);
                Meta meta = it.meta;
                if (meta == null || (str = meta.errorMessage) == null) {
                    str = "";
                }
                orderResponseData2.setErrorMessage(str);
                Meta meta2 = it.meta;
                int iIntValue = -1;
                if (meta2 != null && (num = meta2.code) != null) {
                    iIntValue = num.intValue();
                }
                orderResponseData2.setCode(iIntValue);
                String str2 = it.cartDraftMark;
                orderResponseData2.setCartDraftMark(str2 != null ? str2 : "");
                resultCallback.invoke(orderResponseData2);
            }
        });
    }
}
