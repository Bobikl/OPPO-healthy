package com.heytap.nearx.tangramconfig.impl;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.IConfigStateListener;
import com.heytap.nearx.tangramconfig.bean.ConfigData;
import com.oplus.smartenginehelper.entity.VideoEntity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J*\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¨\u0006\u001e"}, d2 = {"Lcom/heytap/nearx/tangramconfig/impl/EmptyConfigStateListener;", "Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;", "()V", "addConfigStateListener", "", VideoEntity.STATE_LISTENER, "onCacheConfigLoaded", "configIdList", "", "Lcom/heytap/nearx/tangramconfig/bean/ConfigData;", "onConfigBuild", "", "onConfigLoadFailed", "configType", "", "configId", "errorCode", MapSchema.FIELD_NAME_ENTRY, "", "onConfigLoading", "status", "onConfigNewVersion", "version", "onConfigUpdated", "configData", "path", "onConfigVersionChecking", "onHardCodeLoaded", "onNetStateChanged", "networkType", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public class EmptyConfigStateListener implements IConfigStateListener {
    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void addConfigStateListener(@NotNull IConfigStateListener stateListener) {
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onCacheConfigLoaded(@NotNull List<ConfigData> configIdList) {
        Intrinsics.checkNotNullParameter(configIdList, "configIdList");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigBuild(@NotNull List<String> configIdList) {
        Intrinsics.checkNotNullParameter(configIdList, "configIdList");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigLoadFailed(int configType, @NotNull String configId, int errorCode, @Nullable Throwable e2) {
        Intrinsics.checkNotNullParameter(configId, "configId");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigLoading(int configType, @NotNull String configId, int status) {
        Intrinsics.checkNotNullParameter(configId, "configId");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigNewVersion(int configType, @NotNull String configId, int version) {
        Intrinsics.checkNotNullParameter(configId, "configId");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigUpdated(int configType, @NotNull String configId, int version, @NotNull String path) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigVersionChecking(@NotNull String configId) {
        Intrinsics.checkNotNullParameter(configId, "configId");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onHardCodeLoaded(@NotNull List<ConfigData> configIdList) {
        Intrinsics.checkNotNullParameter(configIdList, "configIdList");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onNetStateChanged(@NotNull String networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
    }

    @Override // com.heytap.nearx.tangramconfig.api.IConfigStateListener
    public void onConfigUpdated(@NotNull ConfigData configData, @NotNull String path) {
        Intrinsics.checkNotNullParameter(configData, "configData");
        Intrinsics.checkNotNullParameter(path, "path");
    }
}
