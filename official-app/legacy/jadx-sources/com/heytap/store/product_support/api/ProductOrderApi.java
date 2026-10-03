package com.heytap.store.product_support.api;

import com.heytap.store.product_support.data.protobuf.Operation;
import com.heytap.store.product_support.data.protobuf.OrderCartInsertForm;
import com.oplus.aiunit.vision.dx7;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.ia7;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.x97;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003H'¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/api/ProductOrderApi;", "", "", "", "map", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/heytap/store/product_support/data/protobuf/OrderCartInsertForm;", "addBuy", "downPay", "skuId", "type", "Lcom/heytap/store/product_support/data/protobuf/Operation;", "goodsSubscribe", "product-support_release"}, k = 1, mv = {1, 6, 0})
public interface ProductOrderApi {
    @euf(euf.PROTO)
    @m1e("/orders/v1/cart/v1/insert")
    @NotNull
    @dx7
    kbd<OrderCartInsertForm> addBuy(@ia7 @NotNull Map<String, String> map);

    @euf(euf.PROTO)
    @m1e("/orders/v1/cart/insert/downpay")
    @NotNull
    @dx7
    kbd<OrderCartInsertForm> downPay(@ia7 @NotNull Map<String, String> map);

    @euf(euf.PROTO)
    @m1e("/goods/v1/subscribes/goodsSubscribe")
    @NotNull
    @dx7
    kbd<Operation> goodsSubscribe(@x97("skuId") @NotNull String skuId, @x97("type") @NotNull String type);
}
