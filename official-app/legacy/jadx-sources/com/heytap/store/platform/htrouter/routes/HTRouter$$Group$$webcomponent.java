package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.oppo.store.web.component.serviceImp.WebServiceImpl;
import com.oppo.store.web.constant.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$webcomponent implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(Constants.SERVICE_PATH, RouteMeta.build(RouteType.PROVIDER, WebServiceImpl.class, Constants.SERVICE_PATH, "webcomponent", null, -1, Integer.MIN_VALUE));
    }
}
