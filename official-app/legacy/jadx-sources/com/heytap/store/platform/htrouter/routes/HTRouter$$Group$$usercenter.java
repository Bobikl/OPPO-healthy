package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.heytap.store.sdk.user.StoreSdkUserServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$usercenter implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/usercenter/service", RouteMeta.build(RouteType.PROVIDER, StoreSdkUserServiceImpl.class, "/usercenter/service", "usercenter", null, -1, Integer.MIN_VALUE));
    }
}
