package com.heytap.store.platform.htrouter.facade.template;

import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback;

/* JADX INFO: loaded from: classes6.dex */
public interface IInterceptor extends IProvider {
    void process(PostCard postCard, InterceptorCallback interceptorCallback);
}
