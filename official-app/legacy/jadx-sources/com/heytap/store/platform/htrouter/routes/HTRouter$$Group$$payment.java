package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.payment.PaymentActivity;
import com.heytap.store.payment.applike.RouterConstKt;
import com.heytap.store.payment.service.StorePayServiceImpl;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$payment implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(RouterConstKt.PAY_ACTIVITY_PATH, RouteMeta.build(RouteType.ACTIVITY, PaymentActivity.class, RouterConstKt.PAY_ACTIVITY_PATH, "payment", null, -1, Integer.MIN_VALUE));
        map.put(RouterConstKt.SERVICE_PATH, RouteMeta.build(RouteType.PROVIDER, StorePayServiceImpl.class, RouterConstKt.SERVICE_PATH, "payment", null, -1, Integer.MIN_VALUE));
    }
}
