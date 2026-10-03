package com.heytap.store.homemodule.delegate;

import android.os.Bundle;
import android.view.ViewGroup;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.state.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/J\u000e\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020/J\u0006\u00109\u001a\u00020/J\u0006\u0010:\u001a\u00020/J\u0010\u0010;\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010>\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010=R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lcom/heytap/store/homemodule/delegate/DelegateManagement;", "", HttpConst.SERVER_ENV, "Lcom/heytap/store/homemodule/delegate/DelegateEnv;", "(Lcom/heytap/store/homemodule/delegate/DelegateEnv;)V", "delegateList", "", "Lcom/heytap/store/homemodule/delegate/IHomeSubFragmentDelegate;", "getEnv", "()Lcom/heytap/store/homemodule/delegate/DelegateEnv;", "floatingAdManager", "Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;", "getFloatingAdManager", "()Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;", "setFloatingAdManager", "(Lcom/heytap/store/homemodule/delegate/HomeFloatingAdsController;)V", "loginDelegate", "Lcom/heytap/store/homemodule/delegate/LoginDelegate;", "getLoginDelegate", "()Lcom/heytap/store/homemodule/delegate/LoginDelegate;", "setLoginDelegate", "(Lcom/heytap/store/homemodule/delegate/LoginDelegate;)V", "recycleDelegate", "Lcom/heytap/store/homemodule/delegate/RecycleDelegate;", "getRecycleDelegate", "()Lcom/heytap/store/homemodule/delegate/RecycleDelegate;", "setRecycleDelegate", "(Lcom/heytap/store/homemodule/delegate/RecycleDelegate;)V", "refreshAndBgDelegate", "Lcom/heytap/store/homemodule/delegate/RefreshAndBackgroundDelegate;", "getRefreshAndBgDelegate", "()Lcom/heytap/store/homemodule/delegate/RefreshAndBackgroundDelegate;", "setRefreshAndBgDelegate", "(Lcom/heytap/store/homemodule/delegate/RefreshAndBackgroundDelegate;)V", "themeDelegate", "Lcom/heytap/store/homemodule/delegate/ThemeDelegate;", "getThemeDelegate", "()Lcom/heytap/store/homemodule/delegate/ThemeDelegate;", "setThemeDelegate", "(Lcom/heytap/store/homemodule/delegate/ThemeDelegate;)V", "webDelegate", "Lcom/heytap/store/homemodule/delegate/WebDelegate;", "getWebDelegate", "()Lcom/heytap/store/homemodule/delegate/WebDelegate;", "setWebDelegate", "(Lcom/heytap/store/homemodule/delegate/WebDelegate;)V", "createDelegate", "", "createFloatAdDelegate", "viewGroup", "Landroid/view/ViewGroup;", "createRecycleDelegate", "createWebDelegate", "initArgs", "args", "Landroid/os/Bundle;", "onConfigurationChanged", "onDestroy", "onViewCreated", "proLoadBubbleLinkAgeUrl", "url", "", "setFloatAdBottomImgAnim", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DelegateManagement {

    @NotNull
    private final List<IHomeSubFragmentDelegate> delegateList;

    @NotNull
    private final DelegateEnv env;

    @Nullable
    private HomeFloatingAdsController floatingAdManager;

    @Nullable
    private LoginDelegate loginDelegate;

    @Nullable
    private RecycleDelegate recycleDelegate;

    @Nullable
    private RefreshAndBackgroundDelegate refreshAndBgDelegate;

    @Nullable
    private ThemeDelegate themeDelegate;

    @Nullable
    private WebDelegate webDelegate;

    public DelegateManagement(@NotNull DelegateEnv env) {
        Intrinsics.checkNotNullParameter(env, "env");
        this.env = env;
        this.delegateList = new ArrayList();
    }

    public final void createDelegate() {
        RefreshAndBackgroundDelegate refreshAndBackgroundDelegate = new RefreshAndBackgroundDelegate(this.env);
        this.delegateList.add(refreshAndBackgroundDelegate);
        this.refreshAndBgDelegate = refreshAndBackgroundDelegate;
        ThemeDelegate themeDelegate = new ThemeDelegate(this.env);
        this.delegateList.add(themeDelegate);
        this.themeDelegate = themeDelegate;
        LoginDelegate loginDelegate = new LoginDelegate(this.env);
        this.delegateList.add(loginDelegate);
        this.loginDelegate = loginDelegate;
        Iterator<T> it = this.delegateList.iterator();
        while (it.hasNext()) {
            ((IHomeSubFragmentDelegate) it.next()).setDelegateManagement(this);
        }
    }

    public final void createFloatAdDelegate(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        HomeFloatingAdsController homeFloatingAdsController = this.floatingAdManager;
        if (homeFloatingAdsController != null) {
            this.delegateList.remove(homeFloatingAdsController);
        }
        if (Intrinsics.areEqual(Constants.STORE_APP_PACKAGE_NAME, viewGroup.getContext().getPackageName())) {
            HomeFloatingAdsController homeFloatingAdsController2 = new HomeFloatingAdsController(viewGroup, this.env);
            this.delegateList.add(homeFloatingAdsController2);
            this.floatingAdManager = homeFloatingAdsController2;
        }
    }

    public final void createRecycleDelegate() {
        RecycleDelegate recycleDelegate = new RecycleDelegate(this.env);
        this.delegateList.add(recycleDelegate);
        recycleDelegate.setDelegateManagement(this);
        this.recycleDelegate = recycleDelegate;
    }

    public final void createWebDelegate() {
        WebDelegate webDelegate = new WebDelegate(this.env);
        this.delegateList.add(webDelegate);
        webDelegate.setDelegateManagement(this);
        this.webDelegate = webDelegate;
    }

    @NotNull
    public final DelegateEnv getEnv() {
        return this.env;
    }

    @Nullable
    public final HomeFloatingAdsController getFloatingAdManager() {
        return this.floatingAdManager;
    }

    @Nullable
    public final LoginDelegate getLoginDelegate() {
        return this.loginDelegate;
    }

    @Nullable
    public final RecycleDelegate getRecycleDelegate() {
        return this.recycleDelegate;
    }

    @Nullable
    public final RefreshAndBackgroundDelegate getRefreshAndBgDelegate() {
        return this.refreshAndBgDelegate;
    }

    @Nullable
    public final ThemeDelegate getThemeDelegate() {
        return this.themeDelegate;
    }

    @Nullable
    public final WebDelegate getWebDelegate() {
        return this.webDelegate;
    }

    public final void initArgs(@NotNull Bundle args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Iterator<T> it = this.delegateList.iterator();
        while (it.hasNext()) {
            ((IHomeSubFragmentDelegate) it.next()).initArgs(args);
        }
    }

    public final void onConfigurationChanged() {
        HomeFloatingAdsController homeFloatingAdsController = this.floatingAdManager;
        if (homeFloatingAdsController == null) {
            return;
        }
        homeFloatingAdsController.onConfigurationChanged();
    }

    public final void onDestroy() {
        Iterator<T> it = this.delegateList.iterator();
        while (it.hasNext()) {
            ((IHomeSubFragmentDelegate) it.next()).onDestroy();
        }
    }

    public final void onViewCreated() {
        Iterator<T> it = this.delegateList.iterator();
        while (it.hasNext()) {
            ((IHomeSubFragmentDelegate) it.next()).onViewCreated();
        }
    }

    public final void proLoadBubbleLinkAgeUrl(@Nullable String url) {
        HomeFloatingAdsController homeFloatingAdsController;
        if ((url == null || url.length() == 0) || (homeFloatingAdsController = this.floatingAdManager) == null) {
            return;
        }
        homeFloatingAdsController.proLoadBubbleLinkAgeUrl(url);
    }

    public final void setFloatAdBottomImgAnim(@Nullable String url) {
        HomeFloatingAdsController homeFloatingAdsController;
        if ((url == null || url.length() == 0) || (homeFloatingAdsController = this.floatingAdManager) == null) {
            return;
        }
        homeFloatingAdsController.startImgAnimation(url);
    }

    public final void setFloatingAdManager(@Nullable HomeFloatingAdsController homeFloatingAdsController) {
        this.floatingAdManager = homeFloatingAdsController;
    }

    public final void setLoginDelegate(@Nullable LoginDelegate loginDelegate) {
        this.loginDelegate = loginDelegate;
    }

    public final void setRecycleDelegate(@Nullable RecycleDelegate recycleDelegate) {
        this.recycleDelegate = recycleDelegate;
    }

    public final void setRefreshAndBgDelegate(@Nullable RefreshAndBackgroundDelegate refreshAndBackgroundDelegate) {
        this.refreshAndBgDelegate = refreshAndBackgroundDelegate;
    }

    public final void setThemeDelegate(@Nullable ThemeDelegate themeDelegate) {
        this.themeDelegate = themeDelegate;
    }

    public final void setWebDelegate(@Nullable WebDelegate webDelegate) {
        this.webDelegate = webDelegate;
    }
}
