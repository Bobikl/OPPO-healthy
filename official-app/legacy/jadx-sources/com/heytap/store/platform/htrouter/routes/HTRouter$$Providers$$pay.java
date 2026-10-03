package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.payment.applike.RouterConstKt;
import com.heytap.store.payment.service.StorePayServiceImpl;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$pay implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.heytap.store.pay.IStorePayService", RouteMeta.build(RouteType.PROVIDER, StorePayServiceImpl.class, RouterConstKt.SERVICE_PATH, "payment", null, -1, Integer.MIN_VALUE));
    }
}
