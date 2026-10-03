package com.heytap.store.homemodule;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.platform.htrouter.facade.service.SerializationService;
import com.heytap.store.platform.htrouter.facade.template.ISyringe;
import com.heytap.store.platform.htrouter.launcher.HTRouter;

/* JADX INFO: loaded from: classes5.dex */
public class HomeEventsActivity$$HTRouter$$AutoWired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.heytap.store.platform.htrouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) HTRouter.getInstance().navigation(SerializationService.class);
        HomeEventsActivity homeEventsActivity = (HomeEventsActivity) obj;
        homeEventsActivity.omsId = homeEventsActivity.getIntent().getExtras() == null ? homeEventsActivity.omsId : homeEventsActivity.getIntent().getExtras().getString("code", homeEventsActivity.omsId);
        homeEventsActivity.themeId = homeEventsActivity.getIntent().getExtras() == null ? homeEventsActivity.themeId : homeEventsActivity.getIntent().getExtras().getString("theme", homeEventsActivity.themeId);
        homeEventsActivity.title = homeEventsActivity.getIntent().getExtras() == null ? homeEventsActivity.title : homeEventsActivity.getIntent().getExtras().getString("title", homeEventsActivity.title);
        homeEventsActivity.fullScreenFlag = homeEventsActivity.getIntent().getExtras() == null ? homeEventsActivity.fullScreenFlag : homeEventsActivity.getIntent().getExtras().getString("isExpanded", homeEventsActivity.fullScreenFlag);
        homeEventsActivity.action = homeEventsActivity.getIntent().getExtras() == null ? homeEventsActivity.action : homeEventsActivity.getIntent().getExtras().getString(DeepLinkInterpreter.KEY_SECTION, homeEventsActivity.action);
    }
}
