package com.heytap.store.platform.htrouter.routes;

import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.heytap.store.platform.htrouter.facade.template.IRouteRoot;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTRouter$$Root$$webbrowser_impl implements IRouteRoot {
    @Override // com.heytap.store.platform.htrouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("webcomponent", HTRouter$$Group$$webcomponent.class);
    }
}
