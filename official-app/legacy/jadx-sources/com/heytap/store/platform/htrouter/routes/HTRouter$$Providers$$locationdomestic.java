package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import com.heytap.store.platform.location.AndroidLocation;
import com.heytap.store.platform.location.p007const.RouterConstKt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$locationdomestic implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.heytap.store.platform.location.base.ILocation", RouteMeta.build(RouteType.PROVIDER, AndroidLocation.class, RouterConstKt.SERVICE_PATH, "locationdomesticcomponent", null, -1, Integer.MIN_VALUE));
    }
}
