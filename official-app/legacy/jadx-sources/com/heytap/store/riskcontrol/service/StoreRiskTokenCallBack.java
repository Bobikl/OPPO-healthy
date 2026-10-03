package com.heytap.store.riskcontrol.service;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/riskcontrol/service/StoreRiskTokenCallBack;", "", "onResultFail", "", "code", "", "onResultSuccess", "isOnlineData", "", "token", "", "riskcontrol-service_release"}, k = 1, mv = {1, 4, 2})
public interface StoreRiskTokenCallBack {
    void onResultFail(int code);

    void onResultSuccess(int code, boolean isOnlineData, @NotNull String token);
}
