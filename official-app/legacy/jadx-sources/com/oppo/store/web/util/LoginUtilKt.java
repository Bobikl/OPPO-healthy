package com.oppo.store.web.util;

import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.usercenter.AccountInfo;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.store.usercenter.LoginCallBack;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"checkLogin", "", "isNeedLogin", "", "callback", "Lcom/oppo/store/web/util/CustomerLoginResult;", "isWebLoginCall", "webbrowser-impl_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LoginUtilKt {
    public static final void checkLogin(boolean z, @NotNull final CustomerLoginResult callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.INSTANCE.getInstance().getService(IStoreUserService.class);
        if (iStoreUserService != null) {
            IStoreUserService.DefaultImpls.isLogin$default(iStoreUserService, z, new LoginCallBack() { // from class: com.oppo.store.web.util.LoginUtilKt.checkLogin.1
                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginFailed() {
                    callback.onResult(null);
                }

                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginSuccess(@NotNull AccountInfo accountInfo) {
                    Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
                    callback.onResult(accountInfo);
                }
            }, false, 4, null);
        } else {
            callback.onResult(null);
        }
    }

    public static /* synthetic */ void checkLogin$default(boolean z, CustomerLoginResult customerLoginResult, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        checkLogin(z, customerLoginResult, z2);
    }

    public static final void checkLogin(boolean z, @NotNull final CustomerLoginResult callback, boolean z2) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.INSTANCE.getInstance().getService(IStoreUserService.class);
        if (iStoreUserService != null) {
            iStoreUserService.isLogin(z, new LoginCallBack() { // from class: com.oppo.store.web.util.LoginUtilKt.checkLogin.2
                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginFailed() {
                    callback.onResult(null);
                }

                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginSuccess(@NotNull AccountInfo accountInfo) {
                    Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
                    callback.onResult(accountInfo);
                }
            }, z2);
        } else {
            callback.onResult(null);
        }
    }
}
