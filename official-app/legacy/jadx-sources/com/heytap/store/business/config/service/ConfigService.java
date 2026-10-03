package com.heytap.store.business.config.service;

import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.business.config.bean.ConfigResponse;
import com.heytap.store.business.configservice.IConfigViewModel;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.g5f;
import com.oplus.aiunit.vision.kbd;

/* JADX INFO: loaded from: classes4.dex */
public interface ConfigService {
    public static final String HOST_URL = UrlConfig.ENV.serverApiHost;

    @euf("json")
    @g18(IConfigViewModel.CONFIG_CENTER_URL)
    kbd<ConfigResponse> getRemoteConfig(@g5f("channel") String str, @g5f("scenario") String str2);
}
