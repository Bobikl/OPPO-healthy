package com.heytap.store.product.service;

import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/product/service/IOldProductService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "getFirstCategory", "", "getProductId", "getProductIdSpu", "getSecondCategory", "product-service_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IOldProductService extends IProvider {
    @NotNull
    String getFirstCategory();

    @NotNull
    String getProductId();

    @NotNull
    String getProductIdSpu();

    @NotNull
    String getSecondCategory();
}
