package com.heytap.store.platform.htrouter.facade.service;

import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/service/InterceptorService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "doInterceptions", "", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "callback", "Lcom/heytap/store/platform/htrouter/facade/callback/InterceptorCallback;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public interface InterceptorService extends IProvider {
    void doInterceptions(@NotNull PostCard postcard, @NotNull InterceptorCallback callback);
}
