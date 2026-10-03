package com.heytap.store.sdk.user;

import android.app.Activity;
import android.content.Context;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.usercenter.AccountInfo;
import com.heytap.store.usercenter.CreditCallBack;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.store.usercenter.LoginCallBack;
import com.heytap.store.usercenter.LoginStateChangeListener;
import com.heytap.store.usercenter.OStoreUserCenterProxy;
import com.heytap.store.usercenter.VerifyBack;
import com.heytap.store.usercenter.VipInfoCallBack;
import com.heytap.store.usercenter.login.ILoginCallback;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Route(path = "/usercenter/service")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006+"}, d2 = {"Lcom/heytap/store/sdk/user/StoreSdkUserServiceImpl;", "Lcom/heytap/store/usercenter/IStoreUserService;", "()V", "addLoginStateChangeListener", "", "listener", "Lcom/heytap/store/usercenter/LoginStateChangeListener;", "getAccount", "Lcom/heytap/store/usercenter/AccountInfo;", "getAccountInfoAsync", "", "loginCallBack", "Lcom/heytap/store/usercenter/LoginCallBack;", "getCredit", "context", "Landroid/content/Context;", "creditCallBack", "Lcom/heytap/store/usercenter/CreditCallBack;", AcCommonApiMethod.GET_TOKEN, "", "getVipInfo", "vipInfoCallBack", "Lcom/heytap/store/usercenter/VipInfoCallBack;", "init", "isHeytapBrand", "isLoggingIn", "isLogin", "needLogin", "isLoginInValid", "logout", "removeLoginStateChangeListener", "reqLogin", "startAccountSettingActivity", "startCreditHistoryActivity", "startCreditMarketActivity", "startTeenageVerify", "activity", "Landroid/app/Activity;", "verifyBack", "Lcom/heytap/store/usercenter/VerifyBack;", "startVipLinkActivity", "link", "startVipMainActivity", "heytapstoresdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StoreSdkUserServiceImpl implements IStoreUserService {
    @Override // com.heytap.store.usercenter.IStoreUserService
    public void addLoginStateChangeListener(@NotNull LoginStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OStoreUserCenterProxy.INSTANCE.getInstance().addLoginStateChangeListener(listener);
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    @NotNull
    public AccountInfo getAccount() {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setSsoid(OStoreUserCenterProxy.INSTANCE.getInstance().getSsoid());
        return accountInfo;
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean getAccountInfoAsync(@Nullable LoginCallBack loginCallBack) {
        isLogin(false, loginCallBack);
        return true;
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void getCredit(@NotNull Context context, @NotNull CreditCallBack creditCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(creditCallBack, "creditCallBack");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    @NotNull
    public String getToken() {
        return OStoreUserCenterProxy.INSTANCE.getInstance().getUserToken();
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void getVipInfo(@NotNull Context context, @NotNull VipInfoCallBack vipInfoCallBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vipInfoCallBack, "vipInfoCallBack");
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean isHeytapBrand() {
        return false;
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean isLoggingIn() {
        return OStoreUserCenterProxy.INSTANCE.getInstance().getIsLoginStatus();
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean isLogin() {
        return OStoreUserCenterProxy.INSTANCE.getInstance().getIsLoginStatus();
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void logout() {
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void removeLoginStateChangeListener(@NotNull LoginStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OStoreUserCenterProxy.INSTANCE.getInstance().removeLoginStateChangeListener(listener);
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void reqLogin(@NotNull LoginCallBack loginCallBack) {
        Intrinsics.checkNotNullParameter(loginCallBack, "loginCallBack");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startAccountSettingActivity() {
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startCreditHistoryActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startCreditMarketActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startTeenageVerify(@NotNull Activity activity, @NotNull VerifyBack verifyBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(verifyBack, "verifyBack");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startVipLinkActivity(@NotNull Context context, @NotNull String link) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public void startVipMainActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean isLogin(boolean needLogin, @Nullable LoginCallBack loginCallBack) {
        return isLogin(needLogin, loginCallBack, false);
    }

    @Override // com.heytap.store.usercenter.IStoreUserService
    public boolean isLogin(boolean needLogin, @Nullable final LoginCallBack loginCallBack, boolean isLoginInValid) {
        return OStoreUserCenterProxy.INSTANCE.getInstance().isLogin(needLogin, new ILoginCallback<String>() { // from class: com.heytap.store.sdk.user.StoreSdkUserServiceImpl$isLogin$isLogin$1
            @Override // com.heytap.store.usercenter.login.ILoginCallback
            public void onLoginFailed() {
                LoginCallBack loginCallBack2 = loginCallBack;
                if (loginCallBack2 != null) {
                    loginCallBack2.loginFailed();
                }
            }

            @Override // com.heytap.store.usercenter.login.ILoginCallback
            public void onLoginSuccessed(@Nullable String userInfo) {
                Unit unit;
                if (userInfo != null) {
                    LoginCallBack loginCallBack2 = loginCallBack;
                    AccountInfo accountInfo = new AccountInfo();
                    accountInfo.setAuthToken(userInfo);
                    if (loginCallBack2 != null) {
                        loginCallBack2.loginSuccess(accountInfo);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                LoginCallBack loginCallBack3 = loginCallBack;
                if (loginCallBack3 != null) {
                    loginCallBack3.loginFailed();
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }, isLoginInValid);
    }
}
