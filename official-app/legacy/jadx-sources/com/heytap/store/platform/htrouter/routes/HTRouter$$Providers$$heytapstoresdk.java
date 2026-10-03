package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import com.heytap.store.sdk.service.GlobalDegradeService;
import com.heytap.store.sdk.user.OStoreSdkInitServiceImpl;
import com.heytap.store.sdk.user.StoreSdkUserServiceImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$heytapstoresdk implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.heytap.store.platform.htrouter.facade.service.DegradeService", RouteMeta.build(routeType, GlobalDegradeService.class, "/service/GlobalDegradeService", "service", null, -1, Integer.MIN_VALUE));
        map.put("com.heytap.store.base.core.sdk.IOStoreSdkInitService", RouteMeta.build(routeType, OStoreSdkInitServiceImpl.class, "/ostoresdk/service", "ostoresdk", null, -1, Integer.MIN_VALUE));
        map.put("com.heytap.store.usercenter.IStoreUserService", RouteMeta.build(routeType, StoreSdkUserServiceImpl.class, "/usercenter/service", "usercenter", null, -1, Integer.MIN_VALUE));
    }
}
