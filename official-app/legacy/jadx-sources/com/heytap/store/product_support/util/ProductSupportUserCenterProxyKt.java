package com.heytap.store.product_support.util;

import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.usercenter.AccountInfo;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.store.usercenter.LoginCallBack;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\"\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0010"}, d2 = {"userCenterProxy", "Lcom/heytap/store/usercenter/IStoreUserService;", "getUserCenterProxy", "()Lcom/heytap/store/usercenter/IStoreUserService;", "userCenterProxy$delegate", "Lkotlin/Lazy;", "getSsoId", "", AcCommonApiMethod.GET_TOKEN, "isLoginAsync", "", "needLogin", "", "loginSuccess", "Lkotlin/Function0;", "loginFailed", "product-support_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProductSupportUserCenterProxyKt {

    @NotNull
    private static final Lazy userCenterProxy$delegate = LazyKt__LazyJVMKt.lazy(new Function0<IStoreUserService>() { // from class: com.heytap.store.product_support.util.ProductSupportUserCenterProxyKt$userCenterProxy$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final IStoreUserService invoke() {
            return (IStoreUserService) HTAliasRouter.INSTANCE.getInstance().getService(IStoreUserService.class);
        }
    });

    @NotNull
    public static final String getSsoId() {
        AccountInfo account;
        String ssoid;
        IStoreUserService userCenterProxy = getUserCenterProxy();
        return (userCenterProxy == null || (account = userCenterProxy.getAccount()) == null || (ssoid = account.getSsoid()) == null) ? "" : ssoid;
    }

    @NotNull
    public static final String getToken() {
        String token;
        IStoreUserService userCenterProxy = getUserCenterProxy();
        return (userCenterProxy == null || (token = userCenterProxy.getToken()) == null) ? "" : token;
    }

    private static final IStoreUserService getUserCenterProxy() {
        return (IStoreUserService) userCenterProxy$delegate.getValue();
    }

    public static final void isLoginAsync(boolean z, @NotNull Function0<Unit> loginSuccess, @NotNull Function0<Unit> loginFailed) {
        Intrinsics.checkNotNullParameter(loginSuccess, "loginSuccess");
        Intrinsics.checkNotNullParameter(loginFailed, "loginFailed");
        final WeakReference weakReference = new WeakReference(loginSuccess);
        final WeakReference weakReference2 = new WeakReference(loginFailed);
        IStoreUserService userCenterProxy = getUserCenterProxy();
        if (userCenterProxy == null) {
            return;
        }
        userCenterProxy.isLogin(z, new LoginCallBack() { // from class: com.heytap.store.product_support.util.ProductSupportUserCenterProxyKt.isLoginAsync.3
            @Override // com.heytap.store.usercenter.LoginCallBack
            public void loginFailed() {
                Function0<Unit> function0 = weakReference2.get();
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }

            @Override // com.heytap.store.usercenter.LoginCallBack
            public void loginSuccess(@NotNull AccountInfo account) {
                Intrinsics.checkNotNullParameter(account, "account");
                Function0<Unit> function0 = weakReference.get();
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }
        });
    }

    public static /* synthetic */ void isLoginAsync$default(boolean z, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.heytap.store.product_support.util.ProductSupportUserCenterProxyKt.isLoginAsync.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = new Function0<Unit>() { // from class: com.heytap.store.product_support.util.ProductSupportUserCenterProxyKt.isLoginAsync.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        isLoginAsync(z, function0, function1);
    }
}
