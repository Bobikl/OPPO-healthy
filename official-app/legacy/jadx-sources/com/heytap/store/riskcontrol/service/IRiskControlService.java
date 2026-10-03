package com.heytap.store.riskcontrol.service;

import android.content.Context;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/riskcontrol/service/IRiskControlService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "getCommonSignHeaders", "", "", "context", "Landroid/content/Context;", "httpMethod", "body", "url", "headers", "isRelease", "", "getTokeSync", "", "callBack", "Lcom/heytap/store/riskcontrol/service/StoreRiskTokenCallBack;", "getTokenAsync", "initSdk", "config", "Lcom/heytap/store/riskcontrol/service/StoreRiskConfig;", "riskcontrol-service_release"}, k = 1, mv = {1, 4, 2})
public interface IRiskControlService extends IProvider {
    @NotNull
    Map<String, String> getCommonSignHeaders(@NotNull Context context, @Nullable String httpMethod, @Nullable String body, @Nullable String url, @Nullable Map<String, String> headers, boolean isRelease);

    void getTokeSync(@NotNull StoreRiskTokenCallBack callBack);

    void getTokenAsync(@NotNull StoreRiskTokenCallBack callBack);

    boolean initSdk(@NotNull Context context, @NotNull StoreRiskConfig config);
}
