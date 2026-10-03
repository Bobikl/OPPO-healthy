package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.core.AutoWiredServiceImpl;
import com.heytap.store.platform.htrouter.core.InterceptorServiceImpl;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$htrouter_api implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.heytap.store.platform.htrouter.facade.service.AutoWiredService", RouteMeta.build(routeType, AutoWiredServiceImpl.class, "/htrouter/service/autowired", "htrouter", null, -1, Integer.MIN_VALUE));
        map.put("com.heytap.store.platform.htrouter.facade.service.InterceptorService", RouteMeta.build(routeType, InterceptorServiceImpl.class, "/htrouter/service/interceptor", "htrouter", null, -1, Integer.MIN_VALUE));
    }
}
