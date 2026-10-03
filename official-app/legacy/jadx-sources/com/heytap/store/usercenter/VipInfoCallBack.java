package com.heytap.store.usercenter;

import com.heytap.vip.sdk.mvvm.model.data.VIPAccount;
import com.heytap.vip.sdk.mvvm.model.data.VIPCardOperationResult;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/heytap/store/usercenter/VipInfoCallBack;", "", "onVIPCardOperationResult", "", "vipCardOperationResult", "Lcom/heytap/vip/sdk/mvvm/model/data/VIPCardOperationResult;", "onVipAccountResult", "vipAccount", "Lcom/heytap/vip/sdk/mvvm/model/data/VIPAccount;", "onVipInfoError", "usercenterservices_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface VipInfoCallBack {
    void onVIPCardOperationResult(@NotNull VIPCardOperationResult vipCardOperationResult);

    void onVipAccountResult(@NotNull VIPAccount vipAccount);

    void onVipInfoError();
}
