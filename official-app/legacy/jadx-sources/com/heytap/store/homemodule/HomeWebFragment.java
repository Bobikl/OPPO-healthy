package com.heytap.store.homemodule;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import com.heytap.log.config.StdDtoConst;
import com.heytap.store.homemodule.adapter.HomeRootPagerAdapter;
import com.heytap.store.homemodule.utils.HomeDisplayUtilsKt;
import com.oppo.store.web.WebBrowserFragment;
import com.oppo.store.web.bean.ClientTitleBean;
import com.oppo.store.web.widget.ScrollInterceptWebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0006\u0010\u001b\u001a\u00020\rJ\b\u0010\u001c\u001a\u00020\rH\u0014J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000RL\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/store/homemodule/HomeWebFragment;", "Lcom/oppo/store/web/WebBrowserFragment;", "()V", "isFirstCreate", "", "isTabVisible", "onScrollListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "scrollY", StdDtoConst.FORCE_KEY, "", "getOnScrollListener", "()Lkotlin/jvm/functions/Function2;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function2;)V", "initArguments", "needLoadingProgress", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "scrollChangeUi", "dy", "scrollToTop", "setFitsSystemWindowIfNeeded", "setLayoutPadding", "setMenu", "isSetDark", "clientTitleBean", "Lcom/oppo/store/web/bean/ClientTitleBean;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeWebFragment extends WebBrowserFragment {

    @Nullable
    private Function2<? super Integer, ? super Boolean, Unit> onScrollListener;
    private int scrollY;
    private boolean isTabVisible = true;
    private boolean isFirstCreate = true;

    @Nullable
    public final Function2<Integer, Boolean, Unit> getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    public void initArguments() {
        super.initArguments();
        Bundle arguments = getArguments();
        this.isTabVisible = arguments != null ? arguments.getBoolean(HomeRootPagerAdapter.IS_TAB_VISIBLE, true) : true;
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    /* JADX INFO: renamed from: needLoadingProgress */
    public boolean getShowProgressBar() {
        return false;
    }

    @Override // com.oppo.store.web.WebBrowserFragment, com.heytap.store.platform.mvvm.ViewModelFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getParentFragment() instanceof TopbarThemeState) {
            ActivityResultCaller parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.homemodule.TopbarThemeState");
            }
            ((TopbarThemeState) parentFragment).onChildScrollVertically(this, this.scrollY, false);
        }
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    public void scrollChangeUi(int dy) {
        super.scrollChangeUi(dy);
        int i = this.scrollY + dy;
        this.scrollY = i;
        Function2<? super Integer, ? super Boolean, Unit> function2 = this.onScrollListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(i), Boolean.FALSE);
    }

    public final void scrollToTop() {
        ScrollInterceptWebView scrollInterceptWebView = this.mWebView;
        if (scrollInterceptWebView == null) {
            return;
        }
        scrollInterceptWebView.scrollTo(0, 0);
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    public void setFitsSystemWindowIfNeeded() {
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    public void setLayoutPadding() {
        View view;
        if (this.isNeedOpenByNewBrowser && (view = getView()) != null) {
            int paddingBottom = view.getPaddingBottom() + 0;
            int topBarBgHeightPx = HomeDisplayUtilsKt.getTopBarBgHeightPx(getContext(), this.isTabVisible);
            if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                ((FrameLayout.LayoutParams) layoutParams).topMargin = topBarBgHeightPx;
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), paddingBottom);
        }
    }

    @Override // com.oppo.store.web.WebBrowserFragment
    public void setMenu(boolean isSetDark, @NotNull ClientTitleBean clientTitleBean) {
        Intrinsics.checkNotNullParameter(clientTitleBean, "clientTitleBean");
    }

    public final void setOnScrollListener(@Nullable Function2<? super Integer, ? super Boolean, Unit> function2) {
        this.onScrollListener = function2;
    }
}
