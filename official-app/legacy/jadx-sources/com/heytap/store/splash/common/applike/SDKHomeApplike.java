package com.heytap.store.splash.common.applike;

import androidx.annotation.Keep;
import com.heytap.store.platform.applike.annotation.AppLike;
import com.heytap.store.platform.applike.template.IAppLike;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.splash.common.RouteConstKt;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@AppLike
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/splash/common/applike/SDKHomeApplike;", "Lcom/heytap/store/platform/applike/template/IAppLike;", "()V", "onCreate", "", "homeCompent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SDKHomeApplike implements IAppLike {
    @Override // com.heytap.store.platform.applike.template.IAppLike
    public int getPriority() {
        return IAppLike.DefaultImpls.getPriority(this);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onCreate() {
        IAppLike.DefaultImpls.onCreate(this);
        HTAliasRouter.Companion companion = HTAliasRouter.INSTANCE;
        companion.getInstance().addRouteAliasPair("oppostore://www.opposhop.cn/app/store/home", RouteConstKt.SDK_HOME_PATH);
        companion.getInstance().addRouteAliasPair("oppostore://www.heytap.com/app/store/home", RouteConstKt.SDK_HOME_PATH);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onTerminate() {
        IAppLike.DefaultImpls.onTerminate(this);
    }
}
