package com.heytap.store.usercenter;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/heytap/store/usercenter/CreditCallBack;", "", "onFailed", "", "msg", "", "onSuccess", "creditEntity", "Lcom/heytap/store/usercenter/CreditEntity;", "usercenterservices_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CreditCallBack {
    void onFailed(@NotNull String msg);

    void onSuccess(@NotNull CreditEntity creditEntity);
}
