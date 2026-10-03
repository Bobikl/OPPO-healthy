package com.heytap.store.base.core.util.deeplink;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.http.HttpResultSubscriber;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.base.core.util.deeplink.command.DeepLinkCommand;
import com.heytap.store.base.core.util.deeplink.command.DeepLinkCommandReceiverImpl;
import com.heytap.store.base.core.util.deeplink.interceptor.IInterceptor;
import com.heytap.store.base.core.util.deeplink.interceptor.InterceptorCallback;
import com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback;
import com.heytap.store.base.core.util.statistics.DeepLinkParamsUtil;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.StatisticsBean;
import com.heytap.store.message.service.IMessageService;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouterKt;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.usercenter.AccountInfo;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.store.usercenter.LoginCallBack;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class DeepLinkInterpreter {
    public static final String KEY_ACTION_BG_COLOR = "bgcolor";
    public static final int KEY_ACTION_PAGE = 1;
    public static final String KEY_ACTION_UTM_CAMPAIGN = "latest_utm_campaign";
    public static final String KEY_ACTION_UTM_MEDIUM = "utm_medium";
    public static final String KEY_ACTION_UTM_SOURCE = "utm_source";
    public static final String KEY_ACTION_UTM_TERM = "latest_utm_term";
    public static final String KEY_ACTIVITY_ID = "activityId";
    public static final String KEY_ACTIVITY_NAME = "activityName";
    public static final String KEY_APPID = "appid";
    public static final String KEY_ATTACH = "attach";
    public static final String KEY_CODE = "code";
    public static final String KEY_COUPON_ACTIVITY_ID = "couponsActivityId";
    public static final String KEY_COUPON_CODE = "code";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_DEEP_LINK = "deepLink";
    public static final String KEY_DP_SKIP = "dp_skip";
    public static final String KEY_EXPAND = "isExpanded";
    public static final String KEY_HTML5_URL = "html5Url";
    public static final String KEY_INDEX_SOURCE = "index_source";
    public static final int KEY_INTEGRAL_PAGE = 3;
    public static final String KEY_IS_FULL_SCREEN = "isExpanded";
    public static final String KEY_JUMP_SOURCE = "jump_source";
    public static final String KEY_ORIGINAL_LINK = "original_link";
    public static final String KEY_OUT_TRADE_NO = "out_trade_no";
    public static final String KEY_PHONE_NUM = "phoneNum";
    public static final String KEY_PRODUCT_PURCHASE_LITE_LIST_ID = "listid";
    public static final String KEY_PRODUCT_PURCHASE_LITE_TOP_SKU = "topsku";
    public static final String KEY_RANKID = "rankId";
    public static final int KEY_RECOMMEND_PAGE = 2;
    public static final String KEY_SEARCH_CAT = "cat";
    public static final String KEY_SEARCH_HINT = "search_hint";
    public static final String KEY_SEARCH_PLACE = "searchPlace";
    public static final String KEY_SEARCH_WD = "wd";
    public static final String KEY_SECTION = "section";
    public static final String KEY_SERIAL = "serial";
    public static final String KEY_STATUS_BAR_COLOR = "statusbar_color";
    public static final String KEY_TAB = "tab";
    public static final String KEY_TAB_1 = "tab1";
    public static final String KEY_TAB_2 = "tab2";
    public static final String KEY_TAB_CHANNEL = "tab_channel_link";
    public static final String KEY_TAB_CODE = "tabcode";
    public static final String KEY_THEME = "theme";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOTAL_AMOUNT = "total_amount";
    public static final String KEY_TRADE_NO = "trade_no";
    public static final String KEY_USERID = "userId";
    public static final String TAG = "DeepLinkInterpreter";
    public static DeepLinkInterpreter sCurrent;
    private DeepLinkCommand deepLinkCommand;
    private final DeepLinkCommandReceiverImpl deepLinkCommandReceiver;
    private int enter_id;
    private IInterceptor iInterceptor;
    private boolean isOutSidePull;
    private String mOriginalLink;
    private Map<String, String> urlParams;
    private String ut;

    public DeepLinkInterpreter(String str, IInterceptor iInterceptor) {
        this.deepLinkCommandReceiver = DeepLinkCommandReceiverImpl.getInstance();
        this.mOriginalLink = "";
        this.enter_id = 3;
        this.ut = null;
        this.iInterceptor = iInterceptor;
        initOriginalLink(str, "");
    }

    private void beforeDpAction(Activity activity, NavigationCallback navigationCallback) {
        DeepLinkCommand deepLinkCommand = getDeepLinkCommand();
        if (NullObjectUtil.notNull(deepLinkCommand.getInterceptor())) {
            handleInterceptorBeforeOperate(activity, deepLinkCommand.getInterceptor(), navigationCallback);
        } else {
            handleNoInterceptorBeforeOperate(activity, navigationCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String checkNewRouterUrl(String str) {
        return (!str.contains(DeepLinkUrlPath.URL_RANKING_DETAIL) || str.contains("dranking_detail")) ? str : str.replace(DeepLinkUrlPath.URL_RANKING_DETAIL, "dranking_detail");
    }

    private String compatDPUrl(String str) {
        if (str.startsWith(DeepLinkUrlPath.SPECIAL_WEB_URL_1)) {
            return str.replace(DeepLinkUrlPath.SPECIAL_WEB_URL_1, "");
        }
        if (str.startsWith(DeepLinkUrlPath.SPECIAL_WEB_URL_2)) {
            return str.replace(DeepLinkUrlPath.SPECIAL_WEB_URL_2, "");
        }
        return str.startsWith(DeepLinkUrlPath.SPECIAL_WEB_URL_3) ? str.replace(DeepLinkUrlPath.SPECIAL_WEB_URL_3, "") : str;
    }

    public static void deepLinkStatistcsForOppo(final String str, final int i) {
        IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
        if (iStoreUserService != null) {
            iStoreUserService.isLogin(false, new LoginCallBack() { // from class: com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter.3
                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginFailed() {
                    new StatisticsBean(StatisticsUtil.LOG_TAG_LAUNCH_APP, StatisticsUtil.LAUNCH_APP).setEnterType(i + "").setUserStatus("0").setDp_url(str).statistics();
                }

                @Override // com.heytap.store.usercenter.LoginCallBack
                public void loginSuccess(@NotNull AccountInfo accountInfo) {
                    new StatisticsBean(StatisticsUtil.LOG_TAG_LAUNCH_APP, StatisticsUtil.LAUNCH_APP).setEnterType(i + "").setUserStatus("1").setDp_url(str).statistics();
                }
            }, false);
        }
    }

    private void handleInterceptorBeforeOperate(final Activity activity, IInterceptor iInterceptor, final NavigationCallback navigationCallback) {
        if (isUnknownLink(navigationCallback)) {
            return;
        }
        if (iInterceptor != null) {
            iInterceptor.process(this, new InterceptorCallback() { // from class: com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter.2
                @Override // com.heytap.store.base.core.util.deeplink.interceptor.InterceptorCallback
                public void onContinue(DeepLinkInterpreter deepLinkInterpreter) {
                    DeepLinkInterpreter.this.deepLinkCommandReceiver.runCommand(activity, DeepLinkInterpreter.this, null, null);
                    NavigationCallback navigationCallback2 = navigationCallback;
                    if (navigationCallback2 != null) {
                        navigationCallback2.onArrival(deepLinkInterpreter);
                    }
                }

                @Override // com.heytap.store.base.core.util.deeplink.interceptor.InterceptorCallback
                public void onInterrupt(DeepLinkInterpreter deepLinkInterpreter) {
                    NavigationCallback navigationCallback2 = navigationCallback;
                    if (navigationCallback2 != null) {
                        navigationCallback2.onInterrupt(deepLinkInterpreter);
                    }
                }
            });
        } else {
            handleNoInterceptorBeforeOperate(activity, navigationCallback);
        }
    }

    private void handleNoInterceptorBeforeOperate(Activity activity, NavigationCallback navigationCallback) {
        sCurrent = null;
        if (isUnknownLink(navigationCallback)) {
            return;
        }
        this.deepLinkCommandReceiver.runCommand(activity, this, null, null);
        if (navigationCallback != null) {
            navigationCallback.onArrival(this);
        }
    }

    private void initOriginalLink(String str, String str2) {
        this.ut = str2;
        this.mOriginalLink = compatDPUrl(!TextUtils.isEmpty(str) ? str.trim() : "");
        this.deepLinkCommand = match();
    }

    private boolean isUnknownLink(NavigationCallback navigationCallback) {
        if (getDeepLinkCommand() != null && getDeepLinkCommand().getDeepLinkUrlType() != -1) {
            return false;
        }
        if (navigationCallback == null) {
            return true;
        }
        navigationCallback.onUnArrival(this, ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.pf_core_base_params_type_unknow));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$operate$0(NavigationCallback navigationCallback, String str) throws Exception {
        deepLinkStatistics(this.ut);
        return Boolean.valueOf(!isUnknownLink(navigationCallback));
    }

    private DeepLinkCommand match() {
        String originalLink = getOriginalLink();
        if (TextUtils.isEmpty(originalLink)) {
            DeepLinkCommand deepLinkCommandLookupCommandByType = DeepLinkCommandReceiverImpl.getInstance().lookupCommandByType(-1);
            this.deepLinkCommand = deepLinkCommandLookupCommandByType;
            return deepLinkCommandLookupCommandByType;
        }
        DeepLinkCommand deepLinkCommandLookupCommandByAddress = DeepLinkCommandReceiverImpl.getInstance().lookupCommandByAddress(originalLink);
        this.deepLinkCommand = deepLinkCommandLookupCommandByAddress;
        if (deepLinkCommandLookupCommandByAddress == null) {
            DeepLinkCommand deepLinkCommandLookupCommandByType2 = DeepLinkCommandReceiverImpl.getInstance().lookupCommandByType(0);
            this.deepLinkCommand = deepLinkCommandLookupCommandByType2;
            deepLinkCommandLookupCommandByType2.setInterceptor(this.iInterceptor);
        }
        return this.deepLinkCommand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onlineCustomerInterceptor(Activity activity, PostCard postCard, NavigationCallback navigationCallback) {
        IMessageService iMessageService = (IMessageService) HTAliasRouter.getInstance().getService(IMessageService.class);
        String originalUrl = HTAliasRouterKt.getOriginalUrl(postCard);
        if (iMessageService == null || !iMessageService.onlineCustomerInterceptor(originalUrl)) {
            beforeDpAction(activity, navigationCallback);
            return;
        }
        iMessageService.openCCPChat(activity, originalUrl);
        if (navigationCallback != null) {
            navigationCallback.onArrival(this);
        }
    }

    public void deepLinkStatistics(String str) {
        if (TextUtils.isEmpty(this.mOriginalLink)) {
            return;
        }
        this.urlParams = new UrlParse().getUrlParams(this.mOriginalLink);
        if (UrlConfig.DEBUG) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String str2 = TAG;
            logUtils.d(str2, "deepLink:" + this.mOriginalLink);
            logUtils.d(str2, "get deepLink Params" + this.urlParams);
        }
        DeepLinkParamsUtil.parse(this.urlParams, str);
        deepLinkStatistcsForOppo(this.mOriginalLink, this.enter_id);
        StatisticsUtil.deepLinkStatistcs(this.mOriginalLink, this.isOutSidePull);
    }

    public boolean findCommand() {
        String originalLink = getOriginalLink();
        return (TextUtils.isEmpty(originalLink) || DeepLinkCommandReceiverImpl.getInstance().lookupCommandByAddress(originalLink) == null) ? false : true;
    }

    public String getDeepLinkChannelParameter(String str) {
        if (TextUtils.isEmpty(getOriginalLink())) {
            return "";
        }
        String[] strArrSplit = getOriginalLink().split(str + HttpUtils.EQUAL_SIGN);
        return strArrSplit.length >= 2 ? strArrSplit[strArrSplit.length - 1] : "";
    }

    public DeepLinkCommand getDeepLinkCommand() {
        return this.deepLinkCommand;
    }

    public String getDeepLinkParameter(String str) {
        Map<String, String> map = this.urlParams;
        if (map != null) {
            return map.get(str);
        }
        if (TextUtils.isEmpty(getOriginalLink())) {
            return "";
        }
        try {
            return Uri.parse(getOriginalLink()).getQueryParameter(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getOriginalLink() {
        return this.mOriginalLink;
    }

    public Map<String, String> getUrlParams() {
        return this.urlParams;
    }

    public void operate(final Activity activity, final NavigationCallback navigationCallback) {
        if (UrlConfig.DEBUG) {
            Log.d(TAG, "jumpLink:" + this.mOriginalLink);
        }
        kbd.p("").B(ifg.c()).q(new j08() { // from class: com.oplus.aiunit.vision.f35
            @Override // com.oplus.aiunit.vision.j08
            public final Object apply(Object obj) {
                return this.i.lambda$operate$0(navigationCallback, (String) obj);
            }
        }).r(e30.a()).subscribe(new HttpResultSubscriber<Boolean>() { // from class: com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter.1
            @Override // com.heytap.store.base.core.http.HttpResultSubscriber
            public void onSuccess(Boolean bool) throws InterruptedException {
                if (bool.booleanValue()) {
                    DeepLinkInterpreter deepLinkInterpreter = DeepLinkInterpreter.this;
                    String strCheckNewRouterUrl = deepLinkInterpreter.checkNewRouterUrl(deepLinkInterpreter.getOriginalLink());
                    Bundle bundle = new Bundle();
                    bundle.putString("original_link", DeepLinkInterpreter.this.getOriginalLink());
                    HTAliasRouter.getInstance().navigation(strCheckNewRouterUrl, activity, null, bundle, new com.heytap.store.platform.htrouter.facade.callback.NavigationCallback() { // from class: com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter.1.1
                        @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                        public void onArrival(@NotNull PostCard postCard) {
                            if (UrlConfig.DEBUG) {
                                Log.d(DeepLinkInterpreter.TAG, "HTAliasRouter jumpLink onArrival");
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            NavigationCallback navigationCallback2 = navigationCallback;
                            if (navigationCallback2 != null) {
                                navigationCallback2.onArrival(DeepLinkInterpreter.this);
                            }
                        }

                        @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                        public void onFound(@NotNull PostCard postCard) {
                        }

                        @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                        public void onInterrupt(@NotNull PostCard postCard) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            NavigationCallback navigationCallback2 = navigationCallback;
                            if (navigationCallback2 != null) {
                                navigationCallback2.onArrival(DeepLinkInterpreter.this);
                            }
                            if (UrlConfig.DEBUG) {
                                Log.d(DeepLinkInterpreter.TAG, "HTAliasRouter jumpLink onInterrupt");
                            }
                        }

                        @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                        public void onLost(@NotNull PostCard postCard) {
                            if (UrlConfig.DEBUG) {
                                Log.d(DeepLinkInterpreter.TAG, "HTAliasRouter jumpLink onLost");
                            }
                            DeeplinkHelper deeplinkHelper = DeeplinkHelper.INSTANCE;
                            if (deeplinkHelper.getOnRnGlobalInterceptorListener() == null) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                DeepLinkInterpreter.this.onlineCustomerInterceptor(activity, postCard, navigationCallback);
                            } else {
                                if (!deeplinkHelper.getOnRnGlobalInterceptorListener().onInterceptor(activity, postCard)) {
                                    AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                    DeepLinkInterpreter.this.onlineCustomerInterceptor(activity, postCard, navigationCallback);
                                    return;
                                }
                                AnonymousClass1 anonymousClass3 = AnonymousClass1.this;
                                NavigationCallback navigationCallback2 = navigationCallback;
                                if (navigationCallback2 != null) {
                                    navigationCallback2.onArrival(DeepLinkInterpreter.this);
                                }
                            }
                        }
                    });
                }
            }
        });
    }

    public DeepLinkInterpreter(String str, IInterceptor iInterceptor, boolean z, int i) {
        this.deepLinkCommandReceiver = DeepLinkCommandReceiverImpl.getInstance();
        this.mOriginalLink = "";
        this.ut = null;
        this.iInterceptor = iInterceptor;
        this.isOutSidePull = z;
        this.enter_id = i;
        initOriginalLink(str, "");
    }

    public DeepLinkInterpreter(String str) {
        this.deepLinkCommandReceiver = DeepLinkCommandReceiverImpl.getInstance();
        this.mOriginalLink = "";
        this.enter_id = 3;
        this.ut = null;
        initOriginalLink(str, "");
    }

    public DeepLinkInterpreter(String str, String str2) {
        this.deepLinkCommandReceiver = DeepLinkCommandReceiverImpl.getInstance();
        this.mOriginalLink = "";
        this.enter_id = 3;
        this.ut = null;
        initOriginalLink(str, str2);
    }
}
