package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.bean.ConfigData;
import com.oplus.smartenginehelper.entity.VideoEntity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH&J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\rH&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH&J(\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\nH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH&¨\u0006\u001d"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;", "", "addConfigStateListener", "", VideoEntity.STATE_LISTENER, "onCacheConfigLoaded", "configIdList", "", "Lcom/heytap/nearx/tangramconfig/bean/ConfigData;", "onConfigBuild", "", "onConfigLoadFailed", "configType", "", "configId", "errorCode", MapSchema.FIELD_NAME_ENTRY, "", "onConfigLoading", "status", "onConfigNewVersion", "version", "onConfigUpdated", "configData", "path", "onConfigVersionChecking", "onHardCodeLoaded", "onNetStateChanged", "networkType", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IConfigStateListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onConfigLoadFailed$default(IConfigStateListener iConfigStateListener, int i, String str, int i2, Throwable th, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConfigLoadFailed");
            }
            if ((i3 & 8) != 0) {
                th = null;
            }
            iConfigStateListener.onConfigLoadFailed(i, str, i2, th);
        }
    }

    void addConfigStateListener(@NotNull IConfigStateListener stateListener);

    void onCacheConfigLoaded(@NotNull List<ConfigData> configIdList);

    void onConfigBuild(@NotNull List<String> configIdList);

    void onConfigLoadFailed(int configType, @NotNull String configId, int errorCode, @Nullable Throwable e2);

    void onConfigLoading(int configType, @NotNull String configId, int status);

    void onConfigNewVersion(int configType, @NotNull String configId, int version);

    void onConfigUpdated(int configType, @NotNull String configId, int version, @NotNull String path);

    void onConfigUpdated(@NotNull ConfigData configData, @NotNull String path);

    void onConfigVersionChecking(@NotNull String configId);

    void onHardCodeLoaded(@NotNull List<ConfigData> configIdList);

    void onNetStateChanged(@NotNull String networkType);
}
