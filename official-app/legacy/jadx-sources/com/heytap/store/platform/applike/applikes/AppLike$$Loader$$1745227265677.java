package com.heytap.store.platform.applike.applikes;

import com.heytap.store.payment.applike.PayAppLike;
import com.heytap.store.platform.applike.template.IAppLike;
import com.heytap.store.platform.applike.template.IAppLikeLoader;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AppLike$$Loader$$1745227265677 implements IAppLikeLoader {
    @Override // com.heytap.store.platform.applike.template.IAppLikeLoader
    public void loadInto(List<IAppLike> list) {
        list.add(new PayAppLike());
    }
}
