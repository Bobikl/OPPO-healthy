package com.heytap.store.product_support.dispatcher;

import com.heytap.store.base.core.util.RequestUtilsKt;
import com.heytap.store.product_support.api.ProductOrderApi;
import com.heytap.store.product_support.data.OrderParamsData;
import com.heytap.store.product_support.data.OrderResponseData;
import com.heytap.store.product_support.data.OrderType;
import com.heytap.store.product_support.data.protobuf.Meta;
import com.heytap.store.product_support.data.protobuf.Operation;
import com.oplus.aiunit.vision.ovf;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/SubscribeDispatcher;", "Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "()V", "responseType", "Lcom/heytap/store/product_support/data/OrderType;", "getResponseType", "()Lcom/heytap/store/product_support/data/OrderType;", "setResponseType", "(Lcom/heytap/store/product_support/data/OrderType;)V", "subscribeType", "", "getSubscribeType", "()Ljava/lang/String;", "setSubscribeType", "(Ljava/lang/String;)V", "finallyAction", "", "orderList", "", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "startPreOrdain", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SubscribeDispatcher extends BaseDispatcher {

    @NotNull
    private String subscribeType = "1";

    @NotNull
    private OrderType responseType = OrderType.ORDER_TYPE_PRE_ORDAIN;

    private final void startPreOrdain(OrderParamsData orderParams) {
        final OrderResponseData orderResponseData = new OrderResponseData(null, 0, null, false, null, null, null, 0, 255, null);
        orderResponseData.setType(getResponseType());
        RequestUtilsKt.request(((ProductOrderApi) ovf.e(ovf.INSTANCE, ProductOrderApi.class, null, 2, null)).goodsSubscribe(orderParams.getSkuId(), getSubscribeType()), null, new Function1<Throwable, Unit>() { // from class: com.heytap.store.product_support.dispatcher.SubscribeDispatcher.startPreOrdain.1
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
                Function1<OrderResponseData, Unit> resultCallback = SubscribeDispatcher.this.getResultCallback();
                if (resultCallback == null) {
                    return;
                }
                OrderResponseData orderResponseData2 = orderResponseData;
                orderResponseData2.setSuccess(false);
                orderResponseData2.setThrowable(it);
                resultCallback.invoke(orderResponseData2);
            }
        }, new Function1<Operation, Unit>() { // from class: com.heytap.store.product_support.dispatcher.SubscribeDispatcher.startPreOrdain.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Operation operation) {
                invoke2(operation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Operation it) {
                Integer num;
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                Function1<OrderResponseData, Unit> resultCallback = SubscribeDispatcher.this.getResultCallback();
                if (resultCallback == null) {
                    return;
                }
                OrderResponseData orderResponseData2 = orderResponseData;
                orderResponseData2.setSuccess(true);
                Meta meta = it.meta;
                String str2 = "";
                if (meta != null && (str = meta.errorMessage) != null) {
                    str2 = str;
                }
                orderResponseData2.setErrorMessage(str2);
                Meta meta2 = it.meta;
                int iIntValue = -1;
                if (meta2 != null && (num = meta2.code) != null) {
                    iIntValue = num.intValue();
                }
                orderResponseData2.setCode(iIntValue);
                resultCallback.invoke(orderResponseData2);
            }
        });
    }

    @Override // com.heytap.store.product_support.dispatcher.BaseDispatcher
    public void finallyAction(@NotNull Map<String, String> orderList, @NotNull OrderParamsData orderParams) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        startPreOrdain(orderParams);
    }

    @NotNull
    public OrderType getResponseType() {
        return this.responseType;
    }

    @NotNull
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public void setResponseType(@NotNull OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<set-?>");
        this.responseType = orderType;
    }

    public void setSubscribeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribeType = str;
    }
}
