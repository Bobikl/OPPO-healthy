package com.heytap.msp.sdk.base.interfaces;

import com.heytap.msp.bean.BaseRequest;
import com.heytap.msp.bean.GlobalConfig;

/* JADX INFO: loaded from: classes19.dex */
public interface ISdkConfig {
    GlobalConfig getGlobalConfig();

    boolean hasUseAppBiz();

    void initCompatibleInfo();

    void initOnSubThread();

    boolean isNeedPrestartAppBySdkMeta();

    boolean shouldUseApp(BaseRequest baseRequest);

    void tryToReqGlobalConfig();
}
