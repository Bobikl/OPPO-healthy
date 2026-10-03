package com.heytap.store.homemodule.api;

import com.heytap.store.homemodule.data.protobuf.Operation;
import com.oplus.aiunit.vision.dx7;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.x97;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/api/HomeTempProductDetailApi;", "", "", "skuId", "type", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/heytap/store/homemodule/data/protobuf/Operation;", "getGoodsSubscribe", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public interface HomeTempProductDetailApi {
    @euf(euf.PROTO)
    @m1e("/goods/v1/subscribes/goodsSubscribe")
    @NotNull
    @dx7
    kbd<Operation> getGoodsSubscribe(@x97("skuId") @NotNull String skuId, @x97("type") @NotNull String type);
}
