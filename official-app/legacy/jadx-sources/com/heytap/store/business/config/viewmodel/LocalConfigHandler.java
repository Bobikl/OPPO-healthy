package com.heytap.store.business.config.viewmodel;

import com.heytap.store.business.configservice.LocalConfigDbService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/business/config/viewmodel/LocalConfigHandler;", "", "()V", "localConfigService", "Lcom/heytap/store/business/configservice/LocalConfigDbService;", "getLocalConfigService", "()Lcom/heytap/store/business/configservice/LocalConfigDbService;", "setLocalConfigService", "(Lcom/heytap/store/business/configservice/LocalConfigDbService;)V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "getMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "config-impl_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LocalConfigHandler {

    @Nullable
    private static LocalConfigDbService localConfigService;

    @NotNull
    public static final LocalConfigHandler INSTANCE = new LocalConfigHandler();

    @NotNull
    private static final ConcurrentHashMap<String, Map<String, String>> map = new ConcurrentHashMap<>();

    private LocalConfigHandler() {
    }

    @Nullable
    public final LocalConfigDbService getLocalConfigService() {
        return localConfigService;
    }

    @NotNull
    public final ConcurrentHashMap<String, Map<String, String>> getMap() {
        return map;
    }

    public final void setLocalConfigService(@Nullable LocalConfigDbService localConfigDbService) {
        localConfigService = localConfigDbService;
    }
}
