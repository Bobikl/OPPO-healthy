package com.oplus.seedling.sdk.seedling;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/IPluginUpdateObserver;", "", "onPluginCheckUpdateResult", "", "status", "", "pluginType", "newVersion", "oldVersion", "downloadSize", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IPluginUpdateObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPluginCheckUpdateResult(@NotNull IPluginUpdateObserver iPluginUpdateObserver, int i, int i2) {
        }
    }

    void onPluginCheckUpdateResult(int status, int pluginType);

    void onPluginCheckUpdateResult(int status, int newVersion, int oldVersion, long downloadSize);
}
