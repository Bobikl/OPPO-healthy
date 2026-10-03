package com.heytap.nearx.cloudconfig.impl;

import com.heytap.nearx.cloudconfig.CloudConfigCtrl;
import com.heytap.nearx.cloudconfig.api.AreaHost;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/nearx/cloudconfig/impl/FixedAreaCodeHost;", "Lcom/heytap/nearx/cloudconfig/api/AreaHost;", Fields.CONFIG_URL, "", "(Ljava/lang/String;)V", "getConfigUpdateUrl", "onAttach", "", "cloudConfig", "Lcom/heytap/nearx/cloudconfig/CloudConfigCtrl;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class FixedAreaCodeHost implements AreaHost {
    private final String configUrl;

    public FixedAreaCodeHost(@NotNull String configUrl) {
        Intrinsics.checkParameterIsNotNull(configUrl, "configUrl");
        this.configUrl = configUrl;
    }

    @Override // com.heytap.nearx.cloudconfig.api.AreaHost
    @NotNull
    /* JADX INFO: renamed from: getConfigUpdateUrl, reason: from getter */
    public String getConfigUrl() {
        return this.configUrl;
    }

    @Override // com.heytap.nearx.cloudconfig.api.AreaHost
    public void onAttach(@NotNull CloudConfigCtrl cloudConfig) {
        Intrinsics.checkParameterIsNotNull(cloudConfig, "cloudConfig");
    }
}
