package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.heytap.store.sdk.user.OStoreSdkInitServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$ostoresdk implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/ostoresdk/service", RouteMeta.build(RouteType.PROVIDER, OStoreSdkInitServiceImpl.class, "/ostoresdk/service", "ostoresdk", null, -1, Integer.MIN_VALUE));
    }
}
