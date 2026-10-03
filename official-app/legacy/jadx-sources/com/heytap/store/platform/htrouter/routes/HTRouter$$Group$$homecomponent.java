package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.homemodule.BlackCardAreaActivity;
import com.heytap.store.homemodule.HomeEventsActivity;
import com.heytap.store.homemodule.common.RouterConstKt;
import com.heytap.store.homemodule.service.HomeServiceImpl;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Group$$homecomponent implements IRouteGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put(RouterConstKt.HOME_BLACKCARD_PATH, RouteMeta.build(routeType, BlackCardAreaActivity.class, "/homecomponent/blackcardareaactivity", "homecomponent", null, -1, Integer.MIN_VALUE));
        map.put(RouterConstKt.HOME_BITEVENT_PATH, RouteMeta.build(routeType, HomeEventsActivity.class, "/homecomponent/homeeventsactivity", "homecomponent", new HashMap<String, Integer>() { // from class: com.heytap.store.platform.htrouter.routes.HTRouter$$Group$$homecomponent.1
            {
                put("isExpanded", 8);
                put("code", 8);
                put("theme", 8);
                put(DeepLinkInterpreter.KEY_SECTION, 8);
                put("title", 8);
            }
        }, -1, Integer.MIN_VALUE));
        map.put("/homecomponent/homeservice", RouteMeta.build(RouteType.PROVIDER, HomeServiceImpl.class, "/homecomponent/homeservice", "homecomponent", null, -1, Integer.MIN_VALUE));
    }
}
