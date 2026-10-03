package com.heytap.store.product_support.dispatcher;

import com.heytap.store.product_support.data.OrderParamsData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/NormalPurchaseDispatcher;", "Lcom/heytap/store/product_support/dispatcher/PurchaseDispatcher;", "()V", "finallyAction", "", "orderList", "", "", "orderParams", "Lcom/heytap/store/product_support/data/OrderParamsData;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NormalPurchaseDispatcher extends PurchaseDispatcher {
    @Override // com.heytap.store.product_support.dispatcher.PurchaseDispatcher, com.heytap.store.product_support.dispatcher.BaseDispatcher
    public void finallyAction(@NotNull Map<String, String> orderList, @NotNull OrderParamsData orderParams) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        super.finallyAction(orderList, orderParams);
        startBuyOrder(orderList);
    }
}
