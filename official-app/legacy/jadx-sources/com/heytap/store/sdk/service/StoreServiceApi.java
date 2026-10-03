package com.heytap.store.sdk.service;

import com.heytap.store.product_support.data.protobuf.Products;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.h9e;
import com.oplus.aiunit.vision.kbd;

/* JADX INFO: loaded from: classes7.dex */
public interface StoreServiceApi {
    @g18("/goods/v1/products/{code}")
    kbd<Products> getProduct(@h9e("code") String str);
}
