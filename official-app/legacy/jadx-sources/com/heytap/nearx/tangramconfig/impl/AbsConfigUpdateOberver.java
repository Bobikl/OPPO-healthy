package com.heytap.nearx.tangramconfig.impl;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.CheckUpdateStatus;
import com.heytap.nearx.tangramconfig.api.IConfigUpdateListener;
import com.heytap.nearx.tangramconfig.bean.CheckupdateInfo;
import com.heytap.nearx.tangramconfig.bean.ConfigVersionInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/tangramconfig/impl/AbsConfigUpdateOberver;", "Lcom/heytap/nearx/tangramconfig/api/IConfigUpdateListener;", "()V", "addConfigUpdateListener", "", "updateListener", "onCheckUpdateStatus", "status", "Lcom/heytap/nearx/tangramconfig/api/CheckUpdateStatus;", "onConfigUpdateAfter", "state", "Lcom/heytap/nearx/tangramconfig/bean/ConfigVersionInfo;", "onConfigUpdateFailed", "onConfigUpdateProgress", "checkupdateInfo", "Lcom/heytap/nearx/tangramconfig/bean/CheckupdateInfo;", "configVersionInfo", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbsConfigUpdateOberver implements IConfigUpdateListener {
    @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
    public void addConfigUpdateListener(@NotNull IConfigUpdateListener updateListener) {
        Intrinsics.checkNotNullParameter(updateListener, "updateListener");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
    public void onCheckUpdateStatus(@NotNull CheckUpdateStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
    public void onConfigUpdateAfter(@NotNull ConfigVersionInfo state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
    public void onConfigUpdateFailed(@NotNull ConfigVersionInfo state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
    public void onConfigUpdateProgress(@NotNull CheckupdateInfo checkupdateInfo, @NotNull ConfigVersionInfo configVersionInfo) {
        Intrinsics.checkNotNullParameter(checkupdateInfo, "checkupdateInfo");
        Intrinsics.checkNotNullParameter(configVersionInfo, "configVersionInfo");
    }
}
