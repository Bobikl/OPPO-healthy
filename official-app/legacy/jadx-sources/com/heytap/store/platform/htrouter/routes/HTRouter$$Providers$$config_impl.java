package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.business.config.component.service.ConfigServiceImpl;
import com.heytap.store.business.config.constant.Constants;
import com.heytap.store.platform.htrouter.facade.enums.RouteType;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IProviderGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Providers$$config_impl implements IProviderGroup {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.heytap.store.business.configservice.IConfigService", RouteMeta.build(RouteType.PROVIDER, ConfigServiceImpl.class, Constants.SERVICE_PATH, "serivicecomponent", null, -1, Integer.MIN_VALUE));
    }
}
