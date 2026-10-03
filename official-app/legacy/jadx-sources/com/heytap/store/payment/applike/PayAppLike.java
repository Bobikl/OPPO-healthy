package com.heytap.store.payment.applike;

import com.heytap.store.platform.applike.annotation.AppLike;
import com.heytap.store.platform.applike.template.IAppLike;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@AppLike
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/payment/applike/PayAppLike;", "Lcom/heytap/store/platform/applike/template/IAppLike;", "()V", "onCreate", "", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PayAppLike implements IAppLike {
    @Override // com.heytap.store.platform.applike.template.IAppLike
    public int getPriority() {
        return IAppLike.DefaultImpls.getPriority(this);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onCreate() {
        HTAliasRouter.INSTANCE.getInstance().addRouteAliasPair(RouterConstKt.DEEP_LINK_PAYMENT_PAGE, RouterConstKt.PAY_ACTIVITY_PATH);
    }

    @Override // com.heytap.store.platform.applike.template.IAppLike
    public void onTerminate() {
        IAppLike.DefaultImpls.onTerminate(this);
    }
}
