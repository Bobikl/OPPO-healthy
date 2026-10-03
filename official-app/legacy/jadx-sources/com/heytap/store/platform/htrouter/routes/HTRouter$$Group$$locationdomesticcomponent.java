package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.heytap.store.platform.location.AndroidLocation;
import com.heytap.store.platform.location.p007const.RouterConstKt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$locationdomesticcomponent implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(RouterConstKt.SERVICE_PATH, RouteMeta.build(RouteType.PROVIDER, AndroidLocation.class, RouterConstKt.SERVICE_PATH, "locationdomesticcomponent", null, -1, Integer.MIN_VALUE));
    }
}
