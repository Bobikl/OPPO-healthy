package com.heytap.store.homemodule.common;

import com.heytap.store.platform.applike.annotation.AppLike;
import com.heytap.store.platform.applike.template.IAppLike;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@AppLike
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/homemodule/common/HomeApplike;", "Lcom/heytap/store/platform/applike/template/IAppLike;", "()V", "onCreate", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeApplike implements IAppLike {
    @Override // com.heytap.store.platform.applike.template.IAppLike
    public int getPriority() {
        return IAppLike.DefaultImpls.getPriority(this);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onCreate() {
        IAppLike.DefaultImpls.onCreate(this);
        HTAliasRouter.Companion companion = HTAliasRouter.INSTANCE;
        companion.getInstance().addRouteAliasPair(RouterConstKt.HOME_BIGEVENT_DP, RouterConstKt.HOME_BITEVENT_PATH);
        companion.getInstance().addRouteAliasPair(RouterConstKt.HOME_BIGEVENT_HEYTAP_DP, RouterConstKt.HOME_BITEVENT_PATH);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onTerminate() {
        IAppLike.DefaultImpls.onTerminate(this);
    }
}
