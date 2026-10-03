package com.heytap.store.homemodule;

import com.heytap.store.homemodule.common.RouterConstKt;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Route(path = RouterConstKt.HOME_BLACKCARD_PATH)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/homemodule/BlackCardAreaActivity;", "Lcom/heytap/store/homemodule/HomeEventsActivity;", "()V", "onCreateActivityFragment", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BlackCardAreaActivity extends HomeEventsActivity {
    @Override // com.heytap.store.homemodule.HomeEventsActivity, com.heytap.store.base.core.activity.StoreBaseActivity
    public void onCreateActivityFragment() {
        setBackCardArea(true);
        super.onCreateActivityFragment();
    }
}
