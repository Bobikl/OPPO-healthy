package com.oppo.store.web.jsbridge.jscalljava;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.GotoSettingsUtil;
import com.heytap.store.base.core.util.RxBus;
import com.heytap.store.base.core.util.WeakActivityHandler;
import com.heytap.store.base.core.util.app.ActivityStartUtil;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.deeplink.UrlParse;
import com.heytap.store.base.core.util.permission.PermissionUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.product.service.IProductService;
import com.heytap.store.usercenter.AccountInfo;
import com.oplus.aiunit.vision.ys3;
import com.oppo.store.web.AbstractWebCallbackActivity;
import com.oppo.store.web.WebBrowserActivity;
import com.oppo.store.web.WebBrowserFragment;
import com.oppo.store.web.bean.ClientTitleBean;
import com.oppo.store.web.jsbridge.TopRightControlBean;
import com.oppo.store.web.jsbridge.javacalljs.JavaCallJs;
import com.oppo.store.web.listener.IChangeWebCallbackListener;
import com.oppo.store.web.listener.IWebCallbackListener;
import com.oppo.store.web.util.CustomerLoginResult;
import com.oppo.store.web.util.LoginUtilKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes9.dex */
public final class JsCallJavaMessageHandler {
    public static final int JS_NAVIGATION = 63;
    public static final int JS_NAVIGATION_VERSRION = 64;
    public static final int JS_SAVE_SKUID = 67;
    public static final int MSG_ACCOUNT = 38;
    public static final int MSG_ACTIVATE = 26;
    public static final int MSG_ANALYZE_INNER_LINK = 0;
    public static final int MSG_CALENDAR_ID = 66;
    public static final int MSG_CALENDAR_REMIND = 65;
    public static final int MSG_CALL_PHONE = 40;
    public static final int MSG_CHANGE_TAB_TYPE = 72;
    public static final int MSG_CHECK_APP_INSTALLED = 73;
    public static final int MSG_CHECK_LOCATION_PERMISSION = 41;
    public static final int MSG_CREDIT_HISTORY = 9;
    public static final int MSG_CREDIT_INSTRUCTION = 10;
    public static final int MSG_CREDIT_MARKET = 11;
    public static final int MSG_CREDIT_SCORE = 70;
    public static final int MSG_CUSTOM_WEBVIEW_NAVIGATION = 75;
    public static final int MSG_DELETE_CALENDAR = 74;
    public static final int MSG_DOWNLOAD_PDF = 50;
    public static final int MSG_FINISH = 12;
    public static final int MSG_FIX_RECORD = 33;
    public static final int MSG_GET_CALENDAR = 68;
    public static final int MSG_HIDE_APP_BAR = 51;
    public static final int MSG_HOME_PAGE = 24;
    public static final int MSG_IS_LOGIN = 21;
    public static final int MSG_LOGIN = 2147483644;
    public static final int MSG_NEARBY_STORE = 34;
    public static final int MSG_OPPO_NOTICE = 27;
    public static final int MSG_ORDER_FIX = 32;
    public static final int MSG_PAYMENTS = 60;
    public static final int MSG_PHOTO_VIEW_PAGER = 13;
    public static final int MSG_SCAN = 30;
    public static final int MSG_SET = 39;
    public static final int MSG_SET_TITLE = 2147483645;
    public static final int MSG_SHARE = 2147483643;
    public static final int MSG_SHOW_CALENDAR_ALERT = 69;
    public static final int MSG_START_OTHER_BROWSER = 14;
    public static final int MSG_START_PHOTO = 20;
    public static final int MSG_STATUS_TYPE = 71;
    public static final int MSG_TOP_RIGHT_CONTROL = 2147483646;
    public static final int MSG_WX_OAUTH = 76;
    public static final int OPEN_NAVIGATION = 61;
    public static final String PARAM_PACKAGE_INSTALLED = "installed";
    public static final String PARAM_PACKAGE_NAME = "packageName";
    public static final int UPDATE_CART_COUNT = 62;
    private ys3 mCompositeDisposable;
    private final IProductService platformProduct = (IProductService) HTAliasRouter.getInstance().getService(IProductService.class);
    private WeakReference<WebBrowserFragment> sWeakFragmentHandler;
    private WeakActivityHandler<Activity> sWeakHandler;

    /* JADX INFO: renamed from: com.oppo.store.web.jsbridge.jscalljava.JsCallJavaMessageHandler$1, reason: invalid class name */
    public class AnonymousClass1 extends WeakActivityHandler<Activity> {
        public AnonymousClass1(Activity activity) {
            super(activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startCreditHistoryActivity(getReference());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$1(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startCreditInstructionsActivity(getReference());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$2(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startCreditMarketActivity(getReference());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$handleMessage$3(AccountInfo accountInfo) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$4(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startReserveFillInActivity(getReference());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$5(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startReserveRecordActivity(getReference());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$handleMessage$6(AccountInfo accountInfo) {
            if (accountInfo != null) {
                ActivityStartUtil.startAccountActivity();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (getReference() == null) {
                return;
            }
            super.handleMessage(message);
            try {
                int i = message.what;
                if (i == 0) {
                    String str = (String) message.obj;
                    if (new DeepLinkInterpreter(str).getDeepLinkCommand().getDeepLinkUrlType() == 119) {
                        Map<String, String> urlParams = new UrlParse().getUrlParams(str);
                        String str2 = urlParams.get("transparent");
                        SensorsBean.Companion companion = SensorsBean.INSTANCE;
                        companion.setTransparent(str2);
                        if (TextUtils.isEmpty(str2)) {
                            companion.setSection_id(urlParams.get(SensorsBean.SECTION_ID));
                            companion.setScene_id(urlParams.get("scene_id"));
                            companion.setExp_id(urlParams.get(SensorsBean.EXP_ID));
                            companion.setStrategy_id(urlParams.get(SensorsBean.STRATEGY_ID));
                            companion.setRetrieve_id(urlParams.get(SensorsBean.RETRIEVE_ID));
                            companion.setLog_id(urlParams.get(SensorsBean.LOG_ID));
                        }
                    }
                    HTAliasRouter.getInstance().navigation(str, getReference(), null);
                    return;
                }
                if (i == 14) {
                    ActivityStartUtil.startOtherWebBrowserByActionView(getReference(), (String) message.obj);
                    return;
                }
                if (i == 24) {
                    ActivityStartUtil.startMainActivity(getReference(), message.arg1, message.arg2);
                    return;
                }
                if (i == 30) {
                    ActivityStartUtil.startCaptureActivity(getReference());
                    return;
                }
                if (i == 20) {
                    ActivityStartUtil.startPhotoPickerActivity(getReference());
                    return;
                }
                if (i == 21) {
                    LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.d
                        @Override // com.oppo.store.web.util.CustomerLoginResult
                        public final void onResult(AccountInfo accountInfo) {
                            JsCallJavaMessageHandler.AnonymousClass1.lambda$handleMessage$3(accountInfo);
                        }
                    });
                    return;
                }
                if (i == 32) {
                    LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.e
                        @Override // com.oppo.store.web.util.CustomerLoginResult
                        public final void onResult(AccountInfo accountInfo) {
                            this.a.lambda$handleMessage$4(accountInfo);
                        }
                    });
                    return;
                }
                if (i == 33) {
                    LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.f
                        @Override // com.oppo.store.web.util.CustomerLoginResult
                        public final void onResult(AccountInfo accountInfo) {
                            this.a.lambda$handleMessage$5(accountInfo);
                        }
                    });
                    return;
                }
                if (i == 50) {
                    String string = message.getData().getString("url");
                    if (getReference() instanceof WebBrowserActivity) {
                        ((WebBrowserActivity) getReference()).downLoadFile(string);
                        return;
                    }
                    return;
                }
                if (i == 51) {
                    boolean z = message.getData().getBoolean(CardAction.LIFE_CIRCLE_VALUE_HIDE);
                    if (getReference() instanceof WebBrowserActivity) {
                        ((WebBrowserActivity) getReference()).hideAppBar(z, null);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 9:
                        LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.a
                            @Override // com.oppo.store.web.util.CustomerLoginResult
                            public final void onResult(AccountInfo accountInfo) {
                                this.a.lambda$handleMessage$0(accountInfo);
                            }
                        });
                        return;
                    case 10:
                        LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.b
                            @Override // com.oppo.store.web.util.CustomerLoginResult
                            public final void onResult(AccountInfo accountInfo) {
                                this.a.lambda$handleMessage$1(accountInfo);
                            }
                        });
                        return;
                    case 11:
                        LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.c
                            @Override // com.oppo.store.web.util.CustomerLoginResult
                            public final void onResult(AccountInfo accountInfo) {
                                this.a.lambda$handleMessage$2(accountInfo);
                            }
                        });
                        return;
                    case 12:
                        getReference().finish();
                        return;
                    default:
                        switch (i) {
                            case 38:
                                LoginUtilKt.checkLogin(true, new CustomerLoginResult() { // from class: com.oppo.store.web.jsbridge.jscalljava.g
                                    @Override // com.oppo.store.web.util.CustomerLoginResult
                                    public final void onResult(AccountInfo accountInfo) {
                                        JsCallJavaMessageHandler.AnonymousClass1.lambda$handleMessage$6(accountInfo);
                                    }
                                });
                                return;
                            case 39:
                                ActivityStartUtil.startSettingActivity(getReference());
                                return;
                            case 40:
                                ActivityStartUtil.callPhone(getReference(), (String) message.obj);
                                return;
                            case 41:
                                try {
                                    if (getReference() instanceof WebBrowserActivity) {
                                        JavaCallJs javaCallJs = (JavaCallJs) message.obj;
                                        if (PermissionUtil.checkAndRequestLocationPermission(getReference())) {
                                            javaCallJs.call(true, null, null);
                                        } else if (getReference() != null) {
                                            ((WebBrowserActivity) getReference()).setCheckLocationPermissionCb(javaCallJs);
                                        }
                                    }
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            default:
                                switch (i) {
                                    case 61:
                                        if (getReference() instanceof WebBrowserActivity) {
                                            GotoSettingsUtil.goToSettings(ContextGetterUtils.INSTANCE.getApp());
                                            ((WebBrowserActivity) getReference()).goToSetting(true);
                                            return;
                                        }
                                        return;
                                    case 62:
                                        String name = getReference().getClass().getName();
                                        if ("com.oppo.store.NoBgWindowMainActivity".equals(name) || "com.oppo.store.MainActivity".equals(name)) {
                                            RxBus.get().post(new RxBus.Event(Constants.UPDATE_CART, null));
                                            return;
                                        }
                                        return;
                                    case 63:
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).JSNavigation();
                                            return;
                                        }
                                        return;
                                    case 64:
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).jsGetVersionValue();
                                            return;
                                        }
                                        return;
                                    case 65:
                                        String string2 = message.getData().getString("data");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            new Bundle().putString("data", string2);
                                            ((WebBrowserActivity) getReference()).setCalendarRemind(string2, (JavaCallJs) message.obj);
                                            return;
                                        }
                                        return;
                                    case 66:
                                        String string3 = message.getData().getString("calendarId");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            new Bundle().putString("calendarId", string3);
                                            Object obj = message.obj;
                                            if (obj != null) {
                                                ((WebBrowserActivity) getReference()).setCalendarRemind(string3, (JavaCallJs) obj);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 67:
                                        String string4 = message.getData().getString("skuId");
                                        if (JsCallJavaMessageHandler.this.platformProduct != null) {
                                            JsCallJavaMessageHandler.this.platformProduct.saveProductBrowseHistory(string4);
                                            return;
                                        }
                                        return;
                                    case 68:
                                        String string5 = message.getData().getString("calendarTitle");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).getCalendarRemind(string5, (JavaCallJs) message.obj);
                                            return;
                                        }
                                        return;
                                    case 69:
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).showCalendarRemindAlert((JavaCallJs) message.obj);
                                            return;
                                        }
                                        return;
                                    case 70:
                                        String string6 = message.getData().getString("newScore");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).updataScore(string6);
                                        }
                                        if (DisplayUtil.isRealSpitWindow()) {
                                            RxBus.get().post(new RxBus.Event(RxBus.UPDATE_SIGN_STATUS, ""));
                                            return;
                                        }
                                        return;
                                    case 71:
                                        String string7 = message.getData().getString("statusType");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).changeNavgationStatu(string7);
                                            return;
                                        }
                                        return;
                                    case 72:
                                        String string8 = message.getData().getString("notifyClientEventValue");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).notifyClientEventValue(string8);
                                            return;
                                        }
                                        return;
                                    case 73:
                                        try {
                                            if (getReference() instanceof WebBrowserActivity) {
                                                JavaCallJs javaCallJs2 = (JavaCallJs) message.obj;
                                                boolean zHasInstalledApk = DeviceInfoUtil.hasInstalledApk(getReference(), message.getData().getString("packageName"));
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put(JsCallJavaMessageHandler.PARAM_PACKAGE_INSTALLED, zHasInstalledApk);
                                                javaCallJs2.call(true, jSONObject, null);
                                                return;
                                            }
                                            return;
                                        } catch (Exception e3) {
                                            e3.printStackTrace();
                                            return;
                                        }
                                    case 74:
                                        String string9 = message.getData().getString("calendarTitle");
                                        if (getReference() instanceof WebBrowserActivity) {
                                            ((WebBrowserActivity) getReference()).deleteCalendarRemind(string9, (JavaCallJs) message.obj);
                                            return;
                                        }
                                        return;
                                    case 75:
                                        boolean z2 = message.getData().getBoolean("isHidden");
                                        float f = message.getData().getFloat("colorPercent");
                                        if (getReference() instanceof IChangeWebCallbackListener) {
                                            ((IChangeWebCallbackListener) getReference()).customWebviewNavigation(f, z2);
                                            return;
                                        }
                                        return;
                                    default:
                                        switch (i) {
                                            case JsCallJavaMessageHandler.MSG_LOGIN /* 2147483644 */:
                                                Object obj2 = message.obj;
                                                if (obj2 != null) {
                                                    JavaCallJs javaCallJs3 = (JavaCallJs) obj2;
                                                    Bundle data = message.getData();
                                                    WebBrowserFragment webFragment = JsCallJavaMessageHandler.this.getWebFragment();
                                                    boolean z3 = data != null ? data.getBoolean("isRefresh", false) : true;
                                                    if (getReference() instanceof AbstractWebCallbackActivity) {
                                                        ((AbstractWebCallbackActivity) getReference()).doLogin(javaCallJs3, z3);
                                                    } else if (webFragment != null) {
                                                        webFragment.doLogin(javaCallJs3, z3);
                                                    } else if (getReference() instanceof IWebCallbackListener) {
                                                        ((IWebCallbackListener) getReference()).doLogin(javaCallJs3, z3);
                                                    }
                                                }
                                                break;
                                            case JsCallJavaMessageHandler.MSG_SET_TITLE /* 2147483645 */:
                                                ClientTitleBean clientTitleBean = (ClientTitleBean) message.getData().getSerializable("clientTitle");
                                                if ((getReference() instanceof WebBrowserActivity) && clientTitleBean != null) {
                                                    ((WebBrowserActivity) getReference()).setMenu(clientTitleBean);
                                                    break;
                                                }
                                                break;
                                            case JsCallJavaMessageHandler.MSG_TOP_RIGHT_CONTROL /* 2147483646 */:
                                                if (getReference() instanceof WebBrowserActivity) {
                                                    ((WebBrowserActivity) getReference()).controlTopRight((TopRightControlBean) message.obj);
                                                }
                                                break;
                                        }
                                        return;
                                }
                        }
                }
                e.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private ys3 getDisposables() {
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new ys3();
        }
        return this.mCompositeDisposable;
    }

    public boolean checkNotSafe() {
        WeakActivityHandler<Activity> weakActivityHandler = this.sWeakHandler;
        return weakActivityHandler == null || weakActivityHandler.getReference() == null || this.sWeakHandler.getReference().isFinishing();
    }

    public WeakActivityHandler<Activity> getWeakHandler() {
        return this.sWeakHandler;
    }

    public WebBrowserFragment getWebFragment() {
        WeakReference<WebBrowserFragment> weakReference = this.sWeakFragmentHandler;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @SuppressLint({"HandlerLeak"})
    public void initHandler(Activity activity) {
        this.sWeakHandler = new AnonymousClass1(activity);
    }

    public void release() {
        WeakActivityHandler<Activity> weakActivityHandler = this.sWeakHandler;
        if (weakActivityHandler != null) {
            weakActivityHandler.removeCallbacks(null);
            this.sWeakHandler.clear();
            this.sWeakHandler = null;
        }
        ys3 ys3Var = this.mCompositeDisposable;
        if (ys3Var != null) {
            ys3Var.dispose();
        }
    }

    public void setFragment(WebBrowserFragment webBrowserFragment) {
        if (webBrowserFragment != null) {
            this.sWeakFragmentHandler = new WeakReference<>(webBrowserFragment);
        }
    }
}
