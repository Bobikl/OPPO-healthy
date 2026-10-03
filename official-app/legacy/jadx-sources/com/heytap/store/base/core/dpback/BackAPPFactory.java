package com.heytap.store.base.core.dpback;

import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/dpback/BackAPPFactory;", "", "()V", "createBackAPP", "Lcom/heytap/store/base/core/dpback/IBackAPP;", "urlParams", "", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BackAPPFactory {
    @Nullable
    public final IBackAPP createBackAPP(@Nullable Map<String, String> urlParams) {
        DefaultBack defaultBack = new DefaultBack();
        TencentBack tencentBack = new TencentBack();
        ByteDanceBack byteDanceBack = new ByteDanceBack();
        InnerBack innerBack = new InnerBack();
        if (tencentBack.match(urlParams)) {
            return tencentBack;
        }
        if (byteDanceBack.match(urlParams)) {
            return byteDanceBack;
        }
        if (defaultBack.match(urlParams)) {
            return defaultBack;
        }
        if (innerBack.match(urlParams)) {
            return innerBack;
        }
        return null;
    }
}
