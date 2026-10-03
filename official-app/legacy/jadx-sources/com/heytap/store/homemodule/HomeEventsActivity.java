package com.heytap.store.homemodule;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.nearx.uikit.widget.NearAppBarLayout;
import com.heytap.nearx.uikit.widget.NearToolbar;
import com.heytap.store.base.core.activity.StoreBaseActivity;
import com.heytap.store.base.core.databinding.PfCoreBaseToolBarLayoutBinding;
import com.heytap.store.base.core.navigation.SystemUiHelper;
import com.heytap.store.base.core.util.DarkModeUtilsKt;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.app.ActivityStartUtil;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.IStatisticsInfo;
import com.heytap.store.base.core.view.BaseActionBar;
import com.heytap.store.base.widget.databinding.ViewBindingAdapter;
import com.heytap.store.base.widget.view.AlphaControlConstraintLayout;
import com.heytap.store.home.R;
import com.heytap.store.home.databinding.PfHomeEventsActivityLayoutBinding;
import com.heytap.store.homemodule.HomeEventsActivity;
import com.heytap.store.homemodule.adapter.HomeRootPagerAdapter;
import com.heytap.store.homemodule.common.RouterConstKt;
import com.heytap.store.homemodule.data.HomeTabItemBean;
import com.heytap.store.homemodule.utils.BlackCardPageStayReportHelper;
import com.heytap.store.homemodule.utils.ConstantsKt;
import com.heytap.store.homemodule.utils.HomeDisplayUtilsKt;
import com.heytap.store.homeservice.IThemeProvider;
import com.heytap.store.platform.htrouter.facade.annotations.AutoWired;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.FragmentUtils;
import com.heytap.store.platform.tools.SystemUIUtils;
import com.oplus.aiunit.vision.gkj;
import com.oplus.aiunit.vision.vhc;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Route(path = RouterConstKt.HOME_BITEVENT_PATH)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001bB\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u001c\u0010\"\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014J\u0006\u0010#\u001a\u00020\bJ\b\u0010$\u001a\u00020\bH\u0014J\b\u0010%\u001a\u00020\bH\u0014J\b\u0010&\u001a\u00020\bH\u0014J\b\u0010'\u001a\u00020\bH\u0014J\b\u0010(\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020*H\u0016J \u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\fH\u0016J\b\u00103\u001a\u00020.H\u0016J\u0018\u00105\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u00104\u001a\u00020\nH\u0016J\u0012\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u00020*H\u0016R\u0016\u0010:\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010>\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010;R\u0016\u0010?\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u001a\u0010@\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER\u0018\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010O\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bO\u0010G\"\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/heytap/store/homemodule/HomeEventsActivity;", "Lcom/heytap/store/base/core/activity/StoreBaseActivity;", "Lcom/heytap/store/homemodule/HomeEventsViewModel;", "Lcom/heytap/store/home/databinding/PfHomeEventsActivityLayoutBinding;", "Lcom/heytap/store/base/core/util/statistics/IStatisticsInfo;", "Lcom/heytap/store/homemodule/TopbarThemeState;", "Landroid/view/View;", "getSearchView", "", "goSearchActivity", "", "alpha", "", "forceRefresh", "isNeedChangeSearchView", "updateAppBarElementsAlpha", "backToNormal", "updateStatusBarColor", "getUseLightIconFromSubFragment", "Landroid/app/Activity;", "activity", "Lcom/oplus/aiunit/vision/gkj;", "systemBarTintManager", "isLight", "setStatusBarHome", "addFragment", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "createViewModel", "Lcom/heytap/nearx/uikit/widget/NearAppBarLayout;", "appBar", "Lcom/heytap/nearx/uikit/widget/NearToolbar;", "toolbar", "onInitToolBar", "showSearchLayout", "onStart", "onRestart", "onPause", "onDestroy", "initSystemUI", "onCreateActivityFragment", "", "getModuleName", "Landroidx/fragment/app/Fragment;", "fragment", "", "scrollY", "onChildScrollVertically", "useLightIcon", "updateTopBarIconStyle", "onGetParenTopBarHeight", ParserTag.TAG_PERCENT, "onRefreshPullDown", "Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "bean", "applyTabNewData", "getPageId", "omsId", "Ljava/lang/String;", "themeId", "title", "fullScreenFlag", "action", "layoutId", "I", "getLayoutId", "()I", "needAppBar", "Z", "getNeedAppBar", "()Z", "needLoadingView", "getNeedLoadingView", "lastAppBarAlpha", UserInfo.SEX_FEMALE, "isFullScreen", "dividerLine", "Landroid/view/View;", "isBackCardArea", "setBackCardArea", "(Z)V", "Lcom/heytap/store/homemodule/utils/BlackCardPageStayReportHelper;", "blackCardPageStayReportHelper", "Lcom/heytap/store/homemodule/utils/BlackCardPageStayReportHelper;", "mToolBar", "Lcom/heytap/nearx/uikit/widget/NearToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ll_search", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/ImageView;", "img_search", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tv_title", "Landroid/widget/TextView;", "<init>", "()V", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public class HomeEventsActivity extends StoreBaseActivity<HomeEventsViewModel, PfHomeEventsActivityLayoutBinding> implements IStatisticsInfo, TopbarThemeState {

    @NotNull
    private static final String EXPENDED_FLAG = "0";
    private static final float STATUSBAR_CHANGE_THRESHOLD = 0.8f;

    @NotNull
    private static final String TAG = "HomeEventsActivity";

    @Nullable
    private BlackCardPageStayReportHelper blackCardPageStayReportHelper;

    @Nullable
    private View dividerLine;

    @Nullable
    private ImageView img_search;
    private boolean isBackCardArea;
    private float lastAppBarAlpha;

    @Nullable
    private ConstraintLayout ll_search;

    @Nullable
    private NearToolbar mToolBar;
    private final boolean needLoadingView;

    @Nullable
    private TextView tv_title;
    private static final int APPBAR_APPEAR_TRANS_Y_PX = DisplayUtil.dip2px(200.0f);

    @JvmField
    @AutoWired(name = "code")
    @NotNull
    public String omsId = "";

    @JvmField
    @AutoWired(name = "theme")
    @NotNull
    public String themeId = "";

    @JvmField
    @AutoWired(name = "title")
    @NotNull
    public String title = "";

    @JvmField
    @AutoWired(name = "isExpanded")
    @NotNull
    public String fullScreenFlag = "";

    @JvmField
    @AutoWired(name = DeepLinkInterpreter.KEY_SECTION)
    @NotNull
    public String action = "";
    private final int layoutId = R.layout.pf_home_events_activity_layout;
    private final boolean needAppBar = true;
    private boolean isFullScreen = true;

    private final void addFragment() {
        boolean z;
        HomeSubFragment homeSubFragment = new HomeSubFragment();
        this.isFullScreen = !Intrinsics.areEqual("0", this.fullScreenFlag);
        Bundle bundle = new Bundle();
        if (this.isBackCardArea) {
            BlackCardPageStayReportHelper blackCardPageStayReportHelper = new BlackCardPageStayReportHelper();
            this.blackCardPageStayReportHelper = blackCardPageStayReportHelper;
            blackCardPageStayReportHelper.oncreate();
        }
        if (this.isBackCardArea) {
            this.isFullScreen = true;
            z = false;
        } else {
            z = true;
        }
        bundle.putString(HomeRootPagerAdapter.OMS_ID, this.omsId);
        bundle.putString(HomeRootPagerAdapter.TAB_NAME, this.title);
        bundle.putBoolean(HomeRootPagerAdapter.DISABLE_PULL_DOWN_REFRESH, true);
        bundle.putBoolean(HomeRootPagerAdapter.NEED_GOTO_TOP_IMAGE, z);
        bundle.putBoolean(HomeRootPagerAdapter.DISABLE_TOP_BG_IMAGE, false);
        bundle.putBoolean(HomeRootPagerAdapter.IS_TAB_VISIBLE, false);
        bundle.putBoolean(HomeRootPagerAdapter.NEED_CONTENT_TOP_PADDING, false);
        bundle.putBoolean(HomeRootPagerAdapter.IS_FULL_SCREEN, this.isFullScreen);
        bundle.putString(HomeRootPagerAdapter.RECOMMEND_ACTION, this.action);
        bundle.putBoolean(HomeRootPagerAdapter.NEED_TOP_BAR_BG, false);
        bundle.putBoolean(HomeRootPagerAdapter.IS_BLACK_CARD_AREA, this.isBackCardArea);
        homeSubFragment.setArguments(bundle);
        FragmentUtils.INSTANCE.add(getSupportFragmentManager(), homeSubFragment, R.id.events_activity_container);
    }

    private final View getSearchView() {
        View view = LayoutInflater.from(this).inflate(R.layout.pf_home_events_search_layout, (ViewGroup) null);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.ll_search = (ConstraintLayout) view.findViewById(R.id.home_event_search_linearLayout);
        this.img_search = (ImageView) view.findViewById(R.id.img_home_event_search);
        this.tv_title = (TextView) view.findViewById(R.id.tv_home_event_title);
        Boolean bool = AppConfig.getInstance().sdkEnv;
        Intrinsics.checkNotNullExpressionValue(bool, "getInstance().sdkEnv");
        if (bool.booleanValue()) {
            ConstraintLayout constraintLayout = this.ll_search;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
            ImageView imageView = this.img_search;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.ll_search = null;
            this.img_search = null;
        }
        TextView textView = this.tv_title;
        if (textView != null) {
            textView.setText(this.title);
        }
        if (this.isBackCardArea) {
            ImageView imageView2 = this.img_search;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            ConstraintLayout constraintLayout2 = this.ll_search;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(4);
            }
        } else {
            ConstraintLayout constraintLayout3 = this.ll_search;
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.db9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        HomeEventsActivity.m4871getSearchView$lambda3(this.i, view2);
                    }
                });
            }
            ImageView imageView3 = this.img_search;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.eb9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        HomeEventsActivity.m4872getSearchView$lambda4(this.i, view2);
                    }
                });
            }
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: getSearchView$lambda-3, reason: not valid java name */
    public static final void m4871getSearchView$lambda3(HomeEventsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goSearchActivity();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: getSearchView$lambda-4, reason: not valid java name */
    public static final void m4872getSearchView$lambda4(HomeEventsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goSearchActivity();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final boolean getUseLightIconFromSubFragment() {
        ActivityResultCaller activityResultCallerFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.events_activity_container);
        IThemeProvider iThemeProvider = activityResultCallerFindFragmentById instanceof IThemeProvider ? (IThemeProvider) activityResultCallerFindFragmentById : null;
        if (iThemeProvider == null) {
            return false;
        }
        return iThemeProvider.useLightIcon();
    }

    private final void goSearchActivity() {
        ActivityStartUtil.startSearchActivityNew(this, MapsKt__MapsKt.mapOf(TuplesKt.to("index", 4), TuplesKt.to("attach", this.title)));
    }

    private final void setStatusBarHome(Activity activity, gkj systemBarTintManager, boolean isLight) {
        systemBarTintManager.d(true);
        systemBarTintManager.b(false);
        activity.getWindow().setStatusBarColor(0);
        if (isLight) {
            SystemUiHelper.setStatusBarTextWhite(activity);
        } else {
            SystemUiHelper.setStatusBarTextBlack(activity);
        }
    }

    private final void updateAppBarElementsAlpha(float alpha, boolean forceRefresh, boolean isNeedChangeSearchView) {
        ConstraintLayout constraintLayout;
        if (getAppBar() != null) {
            NearAppBarLayout appBar = getAppBar();
            Intrinsics.checkNotNull(appBar);
            if (appBar.getBackground() != null) {
                if (vhc.a(this)) {
                    NearAppBarLayout appBar2 = getAppBar();
                    Intrinsics.checkNotNull(appBar2);
                    appBar2.setBackgroundColor(Color.argb((int) (255 * alpha), 0, 0, 0));
                } else {
                    NearAppBarLayout appBar3 = getAppBar();
                    Intrinsics.checkNotNull(appBar3);
                    appBar3.setBackgroundColor(Color.argb((int) (255 * alpha), UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE));
                }
            }
        }
        TextView textView = this.tv_title;
        if (textView != null) {
            textView.setAlpha(alpha);
        }
        if (isNeedChangeSearchView && !this.isBackCardArea && (constraintLayout = this.ll_search) != null) {
            constraintLayout.setVisibility((alpha > 0.0f ? 1 : (alpha == 0.0f ? 0 : -1)) == 0 ? 0 : 8);
        }
        float f = this.lastAppBarAlpha;
        if ((f < 0.8f || forceRefresh) && alpha >= 0.8f) {
            updateStatusBarColor(true);
            if (this.isBackCardArea) {
                NearToolbar nearToolbar = this.mToolBar;
                if (nearToolbar != null) {
                    nearToolbar.setNavigationIcon(vhc.a(this) ? R.drawable.pf_home_black_card_allow_white_back : R.drawable.pf_home_black_card_allow_black_back);
                }
            } else {
                ImageView imageView = this.img_search;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        } else if ((f > 0.8f || forceRefresh) && alpha <= 0.8f) {
            updateStatusBarColor(false);
            if (this.isBackCardArea) {
                NearToolbar nearToolbar2 = this.mToolBar;
                if (nearToolbar2 != null) {
                    nearToolbar2.setNavigationIcon(R.drawable.pf_home_black_card_allow_white_back);
                }
            } else {
                ImageView imageView2 = this.img_search;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
        }
        this.lastAppBarAlpha = alpha;
    }

    public static /* synthetic */ void updateAppBarElementsAlpha$default(HomeEventsActivity homeEventsActivity, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAppBarElementsAlpha");
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        homeEventsActivity.updateAppBarElementsAlpha(f, z, z2);
    }

    private final void updateStatusBarColor(boolean backToNormal) {
        if (getMSystemBarTintManager() == null) {
            return;
        }
        if (backToNormal) {
            gkj mSystemBarTintManager = getMSystemBarTintManager();
            Intrinsics.checkNotNull(mSystemBarTintManager);
            setStatusBarHome(this, mSystemBarTintManager, vhc.a(this));
        } else {
            gkj mSystemBarTintManager2 = getMSystemBarTintManager();
            Intrinsics.checkNotNull(mSystemBarTintManager2);
            setStatusBarHome(this, mSystemBarTintManager2, this.isBackCardArea ? true : getUseLightIconFromSubFragment());
        }
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    public void applyTabNewData(@Nullable HomeTabItemBean bean) {
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.heytap.store.base.core.util.statistics.IStatisticsInfo
    @NotNull
    public String getModuleName() {
        return this.isBackCardArea ? "黑卡专区" : "原生活动页";
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public boolean getNeedAppBar() {
        return this.needAppBar;
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public boolean getNeedLoadingView() {
        return this.needLoadingView;
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    @NotNull
    public String getPageId() {
        return "";
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public void initSystemUI() {
        super.initSystemUI();
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: isBackCardArea, reason: from getter */
    public final boolean getIsBackCardArea() {
        return this.isBackCardArea;
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    public void onChildScrollVertically(@NotNull Fragment fragment, int scrollY, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.isFullScreen) {
            updateAppBarElementsAlpha$default(this, Math.min(RangesKt___RangesKt.coerceAtLeast((-scrollY) / APPBAR_APPEAR_TRANS_Y_PX, 0.0f), 1.0f), forceRefresh, false, 4, null);
        }
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity, com.heytap.store.platform.mvvm.ViewModelActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        HTAliasRouter.INSTANCE.getInstance().inject(this);
        super.onCreate(savedInstanceState);
        if (!DisplayUtil.isPad()) {
            setRequestedOrientation(1);
        }
        int navigationBarHeight = DisplayUtil.getNavigationBarHeight(this);
        if (navigationBarHeight == 0 || navigationBarHeight >= 50) {
            return;
        }
        getWindow().setNavigationBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(768);
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public void onCreateActivityFragment() {
        boolean zAreEqual = Intrinsics.areEqual(this.omsId, ConstantsKt.BLACK_CARD_OMS_ID);
        this.isBackCardArea = zAreEqual;
        if (zAreEqual) {
            getDelegate().setLocalNightMode(1);
        }
        initSystemUI();
        addFragment();
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BlackCardPageStayReportHelper blackCardPageStayReportHelper = this.blackCardPageStayReportHelper;
        if (blackCardPageStayReportHelper == null) {
            return;
        }
        blackCardPageStayReportHelper.onDestory();
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    public int onGetParenTopBarHeight() {
        return 0;
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity
    public void onInitToolBar(@Nullable NearAppBarLayout appBar, @Nullable NearToolbar toolbar) {
        int childCount;
        PfCoreBaseToolBarLayoutBinding dataBinding;
        super.onInitToolBar(appBar, toolbar);
        AlphaControlConstraintLayout alphaControlConstraintLayout = null;
        ViewGroup.LayoutParams layoutParams = appBar == null ? null : appBar.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = HomeDisplayUtilsKt.getToolbarHeightPx(this) + SystemUIUtils.INSTANCE.getStatusBarHeight();
        }
        this.mToolBar = toolbar;
        BaseActionBar actionBarView = getActionBarView();
        if (actionBarView != null && (dataBinding = actionBarView.getDataBinding()) != null) {
            alphaControlConstraintLayout = dataBinding.baseToolbarLayout;
        }
        if (alphaControlConstraintLayout != null) {
            alphaControlConstraintLayout.setVisibility(8);
        }
        if (toolbar != null) {
            DarkModeUtilsKt.disableForceDark(toolbar);
        }
        if (toolbar != null) {
            toolbar.setContentInsetStartWithNavigation(0);
        }
        if (this.isBackCardArea) {
            if (toolbar != null) {
                toolbar.setNavigationIcon(R.drawable.pf_home_black_card_allow_white_back);
            }
        } else if (toolbar != null) {
            toolbar.setNavigationIcon(R.drawable.pf_home_icon_event_back);
        }
        if (toolbar != null) {
            toolbar.addView(getSearchView());
        }
        if (toolbar != null && (childCount = toolbar.getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = toolbar.getChildAt(i);
                if (childAt != null && childAt.getId() == R.id.toolbar_title) {
                    childAt.setPadding(0, 0, 0, 0);
                }
                if (i == childCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (appBar != null) {
            appBar.setBackgroundColor(getResources().getColor(R.color.pf_home_recommend_bg_color));
        }
        if (appBar != null) {
            appBar.setElevation(0.0f);
        }
        if (this.isFullScreen) {
            updateAppBarElementsAlpha(0.0f, true, false);
            return;
        }
        if (this.isBackCardArea && toolbar != null) {
            toolbar.setNavigationIcon(vhc.a(this) ? R.drawable.pf_home_black_card_allow_white_back : R.drawable.pf_home_black_card_allow_black_back);
        }
        updateAppBarElementsAlpha(1.0f, true, false);
        View viewFindViewById = findViewById(R.id.events_activity_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById<ViewGroup>(…vents_activity_container)");
        ViewBindingAdapter.bindPadding$default(viewFindViewById, null, Integer.valueOf(HomeDisplayUtilsKt.getToolbarHeightPx(this) + SystemUIUtils.INSTANCE.getStatusBarHeight()), null, null, 13, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        BlackCardPageStayReportHelper blackCardPageStayReportHelper = this.blackCardPageStayReportHelper;
        if (blackCardPageStayReportHelper == null) {
            return;
        }
        blackCardPageStayReportHelper.onPause();
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    public void onRefreshPullDown(@NotNull Fragment fragment, float percent) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        BlackCardPageStayReportHelper blackCardPageStayReportHelper = this.blackCardPageStayReportHelper;
        if (blackCardPageStayReportHelper == null) {
            return;
        }
        blackCardPageStayReportHelper.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        BlackCardPageStayReportHelper blackCardPageStayReportHelper = this.blackCardPageStayReportHelper;
        if (blackCardPageStayReportHelper == null) {
            return;
        }
        blackCardPageStayReportHelper.onStart();
    }

    public final void setBackCardArea(boolean z) {
        this.isBackCardArea = z;
    }

    public final void showSearchLayout() {
        if (this.isBackCardArea) {
            return;
        }
        if (this.isFullScreen) {
            ConstraintLayout constraintLayout = this.ll_search;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            ImageView imageView = this.img_search;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        ConstraintLayout constraintLayout2 = this.ll_search;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(4);
        }
        ImageView imageView2 = this.img_search;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // com.heytap.store.homemodule.TopbarThemeState
    public void updateTopBarIconStyle(boolean useLightIcon) {
    }

    @Override // com.heytap.store.platform.mvvm.ViewModelActivity
    @NotNull
    public HomeEventsViewModel createViewModel() {
        return (HomeEventsViewModel) getActivityScopeViewModel(HomeEventsViewModel.class);
    }
}
