package com.heytap.store.usercenter;

import android.app.Activity;
import android.content.Context;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\tH&J\b\u0010\u0017\u001a\u00020\tH&J\b\u0010\u0018\u001a\u00020\tH&J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J$\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0012H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006)"}, d2 = {"Lcom/heytap/store/usercenter/IStoreUserService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "addLoginStateChangeListener", "", "listener", "Lcom/heytap/store/usercenter/LoginStateChangeListener;", "getAccount", "Lcom/heytap/store/usercenter/AccountInfo;", "getAccountInfoAsync", "", "loginCallBack", "Lcom/heytap/store/usercenter/LoginCallBack;", "getCredit", "context", "Landroid/content/Context;", "creditCallBack", "Lcom/heytap/store/usercenter/CreditCallBack;", AcCommonApiMethod.GET_TOKEN, "", "getVipInfo", "vipInfoCallBack", "Lcom/heytap/store/usercenter/VipInfoCallBack;", "isHeytapBrand", "isLoggingIn", "isLogin", "needLogin", "isForceLogin", "logout", "removeLoginStateChangeListener", "reqLogin", "startAccountSettingActivity", "startCreditHistoryActivity", "startCreditMarketActivity", "startTeenageVerify", "activity", "Landroid/app/Activity;", "verifyBack", "Lcom/heytap/store/usercenter/VerifyBack;", "startVipLinkActivity", "link", "startVipMainActivity", "usercenterservices_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IStoreUserService extends IProvider {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean isLogin$default(IStoreUserService iStoreUserService, boolean z, LoginCallBack loginCallBack, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isLogin");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return iStoreUserService.isLogin(z, loginCallBack, z2);
        }
    }

    void addLoginStateChangeListener(@NotNull LoginStateChangeListener listener);

    @NotNull
    AccountInfo getAccount();

    boolean getAccountInfoAsync(@Nullable LoginCallBack loginCallBack);

    void getCredit(@NotNull Context context, @NotNull CreditCallBack creditCallBack);

    @NotNull
    String getToken();

    void getVipInfo(@NotNull Context context, @NotNull VipInfoCallBack vipInfoCallBack);

    boolean isHeytapBrand();

    boolean isLoggingIn();

    boolean isLogin();

    boolean isLogin(boolean needLogin, @Nullable LoginCallBack loginCallBack);

    boolean isLogin(boolean needLogin, @Nullable LoginCallBack loginCallBack, boolean isForceLogin);

    void logout();

    void removeLoginStateChangeListener(@NotNull LoginStateChangeListener listener);

    void reqLogin(@NotNull LoginCallBack loginCallBack);

    void startAccountSettingActivity();

    void startCreditHistoryActivity(@NotNull Context context);

    void startCreditMarketActivity(@NotNull Context context);

    void startTeenageVerify(@NotNull Activity activity, @NotNull VerifyBack verifyBack);

    void startVipLinkActivity(@NotNull Context context, @NotNull String link);

    void startVipMainActivity(@NotNull Context context);
}
