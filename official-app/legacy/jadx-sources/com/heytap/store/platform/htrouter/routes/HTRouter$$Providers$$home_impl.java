package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.homemodule.service.HomeServiceImpl;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$home_impl implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.heytap.store.homeservice.IHomeService", RouteMeta.build(RouteType.PROVIDER, HomeServiceImpl.class, "/homecomponent/homeservice", "homecomponent", null, -1, Integer.MIN_VALUE));
    }
}
