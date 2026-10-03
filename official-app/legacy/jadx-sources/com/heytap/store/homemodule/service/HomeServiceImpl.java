package com.heytap.store.homemodule.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.base.core.protobuf.IconDetails;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import com.heytap.store.home.R;
import com.heytap.store.homemodule.HomeRootFragment;
import com.heytap.store.homemodule.HomeSubFragment;
import com.heytap.store.homemodule.callback.HomeCallbackManager;
import com.heytap.store.homemodule.delegate.DelegateEnv;
import com.heytap.store.homemodule.delegate.DelegateManagement;
import com.heytap.store.homemodule.delegate.HomeFloatingAdsController;
import com.heytap.store.homemodule.delegate.RecycleDelegate;
import com.heytap.store.homemodule.helper.BubbleJumpTabViewAnimationHelper;
import com.heytap.store.homemodule.helper.DeepLinkHelper;
import com.heytap.store.homemodule.model.HomeRootModel;
import com.heytap.store.homemodule.utils.GrayManager;
import com.heytap.store.homeservice.IFragmentAction;
import com.heytap.store.homeservice.IHomeCallback;
import com.heytap.store.homeservice.IHomePreloadCallback;
import com.heytap.store.homeservice.IHomeService;
import com.heytap.store.homeservice.IMainBottomTabLocationGetter;
import com.heytap.store.homeservice.bean.ColorConfig;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.usercenter.AccountInfo;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.store.usercenter.LoginCallBack;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Route(path = "/homecomponent/homeservice")
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J(\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\nH\u0016J\u0012\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001c\u0010,\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u000200H\u0016J(\u00101\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00182\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020'H\u0016J\u0010\u0010<\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010=\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020\u0018H\u0016J\u0010\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020BH\u0016J\u001e\u0010C\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016J\u0010\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020IH\u0016J\u001c\u0010J\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010K\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0018H\u0016J\u0018\u0010O\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020MH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006P"}, d2 = {"Lcom/heytap/store/homemodule/service/HomeServiceImpl;", "Lcom/heytap/store/homeservice/IHomeService;", "()V", "floatAd", "Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;", "getFloatAd", "()Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;", "setFloatAd", "(Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;)V", "addHomeCallback", "", "callback", "Lcom/heytap/store/homeservice/IHomeCallback;", "doLogin", "fragment", "Landroidx/fragment/app/Fragment;", "jsCallback", "", "isRefresh", "", "getColorConfigLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/store/homeservice/bean/ColorConfig;", "getCurrentTabName", "", "getHomeFragment", "Ljava/lang/Class;", "getSubTabName", "h5Share", "shareBeanString", "isRightCorner", "init", "context", "Landroid/content/Context;", "isCanBubbleLinkAge", "isInteralStartMain", "isInteralStart", "onFloatAScroll", "scrolly", "", "onFloatAdGuideHide", "preloadData", "preloadCallback", "Lcom/heytap/store/homeservice/IHomePreloadCallback;", "proLoadBubbleLinkAgeUrl", "imgUrl", "refreshFloatAView", "parent", "Landroid/view/ViewGroup;", "refreshRecommend", "exitSource", "action", "Lkotlin/Function0;", "registerMainBottomTabGetter", "iMainBottomTabLocationGetter", "Lcom/heytap/store/homeservice/IMainBottomTabLocationGetter;", "removeHomeCallback", "resetRedDotAnim", "scrollToPosition", "itemIndex", "scrollToTop", "setCurrentTabIndex", "currentTabIndex", "channel", "setFloatScrollListener", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setSearchData", "list", "", "Lcom/heytap/store/base/core/protobuf/IconDetails;", "setViewGray", "view", "Landroid/view/View;", "showBubbleLinkAgeAnim", "updateCartCount", "count", "", "cartLink", "updateMessage", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeServiceImpl implements IHomeService {

    @Nullable
    private HomeFloatingAdsController floatAd;

    @Override // com.heytap.store.homeservice.IHomeService
    public void addHomeCallback(@NotNull IHomeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        HomeCallbackManager.INSTANCE.addCallback(callback);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void doLogin(@NotNull Fragment fragment, @NotNull Object jsCallback, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(jsCallback, "jsCallback");
        if (fragment instanceof HomeRootFragment) {
            ((HomeRootFragment) fragment).doLogin(jsCallback, isRefresh);
        }
    }

    @Override // com.heytap.store.homeservice.IHomeService
    @NotNull
    public MutableLiveData<ColorConfig> getColorConfigLiveData() {
        return HomeRootModel.INSTANCE.getColorConfigLiveData();
    }

    @Override // com.heytap.store.homeservice.IHomeService
    @NotNull
    public String getCurrentTabName(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof HomeRootFragment) {
            return ((HomeRootFragment) fragment).getCurrentTabName();
        }
        String string = ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.pf_home_statistics_default_tab_name);
        Intrinsics.checkNotNullExpressionValue(string, "{\n            ContextGet…fault_tab_name)\n        }");
        return string;
    }

    @Nullable
    public final HomeFloatingAdsController getFloatAd() {
        return this.floatAd;
    }

    @Override // com.heytap.store.homeservice.IHomeService
    @NotNull
    public Class<?> getHomeFragment() {
        return HomeRootFragment.class;
    }

    @Override // com.heytap.store.homeservice.IHomeService
    @NotNull
    public String getSubTabName() {
        return HomeRootModel.INSTANCE.getTabString();
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void h5Share(@NotNull Fragment fragment, @NotNull String shareBeanString, boolean isRightCorner, @NotNull Object jsCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(shareBeanString, "shareBeanString");
        Intrinsics.checkNotNullParameter(jsCallback, "jsCallback");
        if (fragment instanceof HomeRootFragment) {
            ((HomeRootFragment) fragment).h5Share(shareBeanString, isRightCorner, jsCallback);
        }
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public boolean isCanBubbleLinkAge(@Nullable Fragment fragment) {
        if (fragment != null && (fragment instanceof HomeRootFragment)) {
            return ((HomeRootFragment) fragment).isCanBubbleLinkAge();
        }
        return false;
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void isInteralStartMain(@NotNull Fragment fragment, boolean isInteralStart) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof HomeRootFragment) {
            ((HomeRootFragment) fragment).isInteralStartMain(isInteralStart);
        }
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void onFloatAScroll(int scrolly) {
        HomeFloatingAdsController homeFloatingAdsController = this.floatAd;
        if (homeFloatingAdsController == null) {
            return;
        }
        homeFloatingAdsController.onScroll(scrolly);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void onFloatAdGuideHide() {
        HomeFloatingAdsController homeFloatingAdsController = this.floatAd;
        if (homeFloatingAdsController == null) {
            return;
        }
        homeFloatingAdsController.onGuideHide();
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void preloadData(@Nullable IHomePreloadCallback preloadCallback) {
        HomeRootModel.INSTANCE.getTabs(null, true);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void proLoadBubbleLinkAgeUrl(@Nullable Fragment fragment, @Nullable String imgUrl) {
        if (fragment != null && (fragment instanceof HomeRootFragment)) {
            ((HomeRootFragment) fragment).proLoadBubbleLinkAgeUrl(imgUrl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // com.heytap.store.homeservice.IHomeService
    public void refreshFloatAView(@NotNull ViewGroup parent) {
        boolean z;
        Intrinsics.checkNotNullParameter(parent, "parent");
        HomeFloatingAdsController homeFloatingAdsController = this.floatAd;
        if (homeFloatingAdsController == null) {
            this.floatAd = new HomeFloatingAdsController(parent, new DelegateEnv(false, false, false, false, false, false, "", "", null, StateConstantsKt.SCENE_HOME));
        } else {
            if (homeFloatingAdsController != null) {
                z = homeFloatingAdsController.isFinish();
            }
            if (z) {
                this.floatAd = new HomeFloatingAdsController(parent, new DelegateEnv(false, false, false, false, false, false, "", "", null, StateConstantsKt.SCENE_HOME));
            }
        }
        IStoreUserService iStoreUserService = (IStoreUserService) ((IProvider) HTAliasRouter.INSTANCE.getInstance().getService(IStoreUserService.class));
        if (iStoreUserService == null) {
            return;
        }
        iStoreUserService.isLogin(false, new LoginCallBack() { // from class: com.heytap.store.homemodule.service.HomeServiceImpl.refreshFloatAView.1
            @Override // com.heytap.store.usercenter.LoginCallBack
            public void loginFailed() {
                HomeFloatingAdsController floatAd = HomeServiceImpl.this.getFloatAd();
                if (floatAd == null) {
                    return;
                }
                HomeFloatingAdsController.onLogout$default(floatAd, false, 1, null);
            }

            @Override // com.heytap.store.usercenter.LoginCallBack
            public void loginSuccess(@NotNull AccountInfo account) {
                Intrinsics.checkNotNullParameter(account, "account");
                HomeFloatingAdsController floatAd = HomeServiceImpl.this.getFloatAd();
                if (floatAd == null) {
                    return;
                }
                HomeFloatingAdsController.onLogin$default(floatAd, false, 1, null);
            }
        });
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void refreshRecommend(@NotNull Fragment fragment, @NotNull String exitSource, @Nullable Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(exitSource, "exitSource");
        HomeRootFragment homeRootFragment = fragment instanceof HomeRootFragment ? (HomeRootFragment) fragment : null;
        if (homeRootFragment == null) {
            return;
        }
        homeRootFragment.refreshRecommend(exitSource, action);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void registerMainBottomTabGetter(@NotNull IMainBottomTabLocationGetter iMainBottomTabLocationGetter) {
        Intrinsics.checkNotNullParameter(iMainBottomTabLocationGetter, "iMainBottomTabLocationGetter");
        BubbleJumpTabViewAnimationHelper.INSTANCE.registerGetTabLocationCallBack(iMainBottomTabLocationGetter);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void removeHomeCallback(@NotNull IHomeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        HomeCallbackManager.INSTANCE.removeCallback(callback);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void resetRedDotAnim(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        HomeRootFragment homeRootFragment = fragment instanceof HomeRootFragment ? (HomeRootFragment) fragment : null;
        if (homeRootFragment == null) {
            return;
        }
        homeRootFragment.resetRedDotAnim();
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void scrollToPosition(@NotNull Fragment fragment, int itemIndex) {
        DelegateManagement delegateManagement;
        RecycleDelegate recycleDelegate;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        HomeSubFragment homeSubFragment = fragment instanceof HomeSubFragment ? (HomeSubFragment) fragment : null;
        if (homeSubFragment == null || (delegateManagement = homeSubFragment.getDelegateManagement()) == null || (recycleDelegate = delegateManagement.getRecycleDelegate()) == null) {
            return;
        }
        recycleDelegate.scrollToPosition(itemIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.store.homeservice.IHomeService
    public void scrollToTop(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        IFragmentAction iFragmentAction = fragment instanceof IFragmentAction ? (IFragmentAction) fragment : null;
        if (iFragmentAction == null) {
            return;
        }
        iFragmentAction.scrollToTop();
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void setCurrentTabIndex(@NotNull Fragment fragment, int currentTabIndex, @NotNull String channel) {
        DeepLinkHelper deepLinkHelper;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (!(fragment instanceof HomeRootFragment) || (deepLinkHelper = ((HomeRootFragment) fragment).getDeepLinkHelper()) == null) {
            return;
        }
        deepLinkHelper.deepLinkToTab(currentTabIndex, channel);
    }

    public final void setFloatAd(@Nullable HomeFloatingAdsController homeFloatingAdsController) {
        this.floatAd = homeFloatingAdsController;
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void setFloatScrollListener(@NotNull RecyclerView recyclerView) {
        RecyclerView.OnScrollListener scrollListener;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        HomeFloatingAdsController homeFloatingAdsController = this.floatAd;
        if (homeFloatingAdsController == null || (scrollListener = homeFloatingAdsController.getScrollListener()) == null) {
            return;
        }
        recyclerView.addOnScrollListener(scrollListener);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void setSearchData(@NotNull Fragment fragment, @NotNull List<IconDetails> list) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(list, "list");
        HomeRootFragment homeRootFragment = fragment instanceof HomeRootFragment ? (HomeRootFragment) fragment : null;
        if (homeRootFragment == null) {
            return;
        }
        homeRootFragment.setSearchData(list);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void setViewGray(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GrayManager.INSTANCE.setLayerGrayType(view);
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void showBubbleLinkAgeAnim(@Nullable Fragment fragment, @Nullable String imgUrl) {
        if (fragment != null && (fragment instanceof HomeRootFragment)) {
            ((HomeRootFragment) fragment).showBubbleLinkAgeAnim(imgUrl);
        }
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void updateCartCount(@Nullable Fragment fragment, long count, @NotNull String cartLink) {
        Intrinsics.checkNotNullParameter(cartLink, "cartLink");
        if (fragment instanceof HomeRootFragment) {
            ((HomeRootFragment) fragment).updateCartCount(count, cartLink);
        }
    }

    @Override // com.heytap.store.homeservice.IHomeService
    public void updateMessage(@NotNull Fragment fragment, long count) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        HomeRootFragment homeRootFragment = fragment instanceof HomeRootFragment ? (HomeRootFragment) fragment : null;
        if (homeRootFragment == null) {
            return;
        }
        homeRootFragment.updateMessage(count);
    }
}
