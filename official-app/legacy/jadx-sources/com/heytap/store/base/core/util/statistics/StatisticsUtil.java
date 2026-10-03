package com.heytap.store.base.core.util.statistics;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.Acache;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.KeyMaps;
import com.heytap.store.base.core.util.OSUtils;
import com.heytap.store.base.core.util.SpUtil;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.SensorCommonPropertyJson;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.core.util.statistics.bean.StatisticsBean;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.base.facade.HTStoreFacade;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.GsonUtils;
import com.heytap.store.platform.tools.ToastUtils;
import com.heytap.store.platform.track.EventData;
import com.heytap.store.platform.track.IStatistics;
import com.heytap.store.platform.trackdomestic.OBusStatisticManager;
import com.heytap.store.product_support.util.RecommendProductDataReportKt;
import com.heytap.store.sdk.channel.config.SDKSensorSwitch;
import com.oplus.aiunit.vision.dj8;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import com.oplus.nearx.track.TrackApi;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticsUtil {
    public static final String ACTION_CLICK = "CampaignClick";
    public static final String ACTIVITY_PAGE_VIEW = "ActivityPageView";
    public static final String AD_CLICK = "102";
    public static final String AD_SHOW = "101";
    public static final String AppClick = "AppClick";
    public static final String AppViewScreen = "AppViewScreen";
    public static final String BOTTOM_TAB_MIDDLE_CLICK = "208";
    public static final String CASH_REGISTER = "cashregister";
    public static final String CASH_REGISTER_CLICK = "cashregisterclick";
    public static final String CHECK_IN_CLICK = "301";
    public static final String CLASSIFICATION_GOODS_SHOW = "901";
    public static final String CLASSIFICATION_NAV_TYPE_CLICK = "903";
    public static final String CLASSIFICATION_VIEW_TYPE_CLICK = "902";
    public static final String COUPON_CLICK = "303";
    public static final String COUPON_GET = "coupon_get";
    public static final String DEEPLINK = "DeepLink";
    public static final String ELEMENT_CLICK = "ElementClick";
    public static final String EXCEPTIONMONITORING = "ExceptionMonitoring";
    public static final String ElementClick = "ElementClick";
    public static final String ElementExposure = "ElementExposure";
    public static final String FILTER_CONDITION = "FilterCondition";
    public static final String HOME_PAGE_GOODS_SHOW = "801";
    public static final String HOME_PAGE_NAV_CLICK = "803";
    public static final String HOME_PAGE_VIEW_TYPE_ITEM_CLICK = "802";
    public static final String HOME_TAB_CLICK = "204";
    public static final String INTEGRAL_CLICK = "305";
    public static String LATEST_UTM_CAMPAIGN = "direct";
    public static String LATEST_UTM_MEDIUM = "direct";
    public static String LATEST_UTM_SOURCE = "direct";
    public static String LATEST_UTM_TERM = "direct";
    public static final String LAUNCH_APP = "1101";
    public static final String LB_MODULE_CLK = "LBModuleClk";
    public static final String LOGIN_BUTTON_CLICK = "227";
    public static final String LOG_AD_ID = "ad_id";
    public static final String LOG_CARD_CODE = "card_code";
    public static final String LOG_CARD_POS = "card_pos";
    public static final String LOG_CLASS_ID = "class_id";
    public static final String LOG_DP_URL = "dp_url";
    public static final String LOG_ENTER_ID = "enter_id";
    public static final String LOG_ENTER_TYPE = "enter_type";
    public static final String LOG_ITEM_ID = "item_id";
    public static final String LOG_ITEM_POS = "item_pos";
    public static final String LOG_MODULE_ID = "module_id";
    public static final String LOG_OPT_OBJ = "opt_obj";
    public static final String LOG_PAGE_CODE = "page_code";
    public static final String LOG_PAGE_ID = "page_id";
    public static final String LOG_TAG_CLASSIFICATION_301109 = "301109";
    public static final String LOG_TAG_CLICK_301102 = "301102";
    public static final String LOG_TAG_LAUNCH_APP = "301111";
    public static final String LOG_TAG_MAIN_FRAGMENT_301108 = "301108";
    public static final String LOG_TAG_MAIN_TAB_301110 = "301110";
    public static final String LOG_TAG_OWN_301103 = "301103";
    public static final String LOG_TAG_SETTING_301102 = "301112";
    public static final String LOG_TAG_SHOW_301101 = "301101";
    public static final String LOG_TIME = "Time";
    public static final String LOG_USER_STATUS = "user_status";
    public static final String MAIN_TAB_CLICK = "1001";
    private static final int MAX_REQUEST_TIME = 3;
    public static final int MODULE_MESSAGE = 11;
    public static final int MODULE_SEARCH = 12;
    public static final String MY_AD_CLICK = "308";
    public static final String MY_AD_SHOW = "309";
    public static final String MY_ORDERS_CLICK = "306";
    public static final String MY_SERVICE_CLICK = "307";
    public static final String MY_SETTING_CLICK = "310";
    public static final String OPEN_AD_SKIP_CLICK = "203";
    public static final String PAGE_LOAD = "page_load";
    public static final String PAGE_VIEW_SCREEN = "PageViewScreen";
    public static final String PAYSUCCESSPAGE = "paysuccesspage";
    public static final String PAY_RESULT = "payresult";
    public static final String PRODUCT_LIST_CLICK = "ProductListClick";
    public static final String PRODUCT_LIST_PAGE = "ProductListPage";
    public static final String PopView = "PopView";
    public static final String RECOVERY_GOLD_CLICK = "304";
    public static final String RELOAD_PAGE = "ReloadPage";
    public static final String RESERVE_CLICK = "ReserveClick";
    public static final String RESERVE_SUCCESS = "ReserveSuccess";
    public static final String SA_SERVER_URL_DEBUG = "https://sa.opposhop.cn/sa";
    public static final String SA_SERVER_URL_RELEASE = "https://sa.opposhop.cn/sa?project=production";
    public static final String SEARCHKEYWORDS = "searchkeywords";
    public static final String SENSORS_PAGE_CLICK = "ProductPageClick";
    public static final String SENSORS_PRODUCT_PAGE_EXPOSURE = "ProductPageExposure";
    public static final String SENSORS_REPORT_DATA_CHANNEL = "dataReportChannel";
    public static final String SENSORS_STOREAPP_AD_CLK = "storeapp_ad_clk";
    public static final String SENSORS_STOREAPP_AD_EXP = "storeapp_ad_exp";
    public static final String SENSORS_STOREAPP_LOGIN_RESULT = "loginResult";
    public static final String SENSORS_STOREAPP_MODULE_CLK = "storeapp_module_clk";
    public static final String SENSORS_STOREAPP_MODULE_EXP = "storeapp_module_exp";
    public static final String SENSORS_STOREAPP_MODULE_EXP_CLICK = "storeapp_module_exp_click";
    public static final String SENSORS_STOREAPP_PAGE = "storeapp_page";
    public static final String SENSORS_VIEW_PRODUCT_PAGE = "viewProductPage";
    public static final String SETTING_ITEM_CLICK = "1201";
    public static final String SF_SERVER_URL_DEBUG = "https://sfn.opposhop.cn/api/v2";
    public static final String SF_SERVER_URL_RELEASE = "https://sfn.opposhop.cn/api/v2";
    public static final String SHARE_CLICK = "ShareClick";
    public static final String SHARE_FLOATLAYER_CLICK = "ShareFloatLayerClick";
    public static final String SHARE_RESULT = "ShareResult";
    public static final String SNAP_UP_PAGE_CLICK = "Snap_upPageClick";
    public static final String TAG = "StatisticsUtil";
    public static String UC = "direct";
    public static String UM = "direct";
    public static String US = "direct";
    public static String UT = "direct";
    public static String experimentId = "";
    private static int experimentRequestCount = 0;
    public static boolean hasCtaPermission = false;
    private static boolean hasResetId = false;
    private static Set<LoginIdChangeListener> loginIdChangeListeners = new HashSet();
    public static IRequestAgain requestAgainListener;
    private static String sLoginId;
    public static String tempCommonSChannel;
    public static String tempCommonSourceType;

    public interface LoginIdChangeListener {
        void onLoginIdChangeListener();
    }

    public static void actionClick(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", "活动-" + str2);
        sensorsBean.setValue(SensorsBean.AD_POSITION, str4);
        sensorsBean.setValue("adId", str5);
        sensorsBean.setValue("adName", str6);
        sensorsBean.setValue(SensorsBean.AD_DETAIL, str7);
        sensorsStatistics(ACTION_CLICK, sensorsBean);
    }

    public static void addLoginIdChangeListener(LoginIdChangeListener loginIdChangeListener) {
        loginIdChangeListeners.add(loginIdChangeListener);
    }

    public static void calendarRemindClk(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue(SensorsBean.ATTACH2, str2);
        }
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void calendarRemindExp(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue(SensorsBean.COPYWRITING, str2);
        }
        sensorsStatistics(SENSORS_STOREAPP_MODULE_EXP, sensorsBean);
    }

    public static void changeLoginState(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_login", z);
            registerSuperProperties(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void clickCartCount(long j2, int i) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", getString(R.string.statistics_module_cart_right_top));
        sensorsBean.setValue("attach", getSourceName(i));
        sensorsBean.setValue(SensorsBean.ATTACH2, j2 + "");
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void clickMessageOrSearch(int i, int i2) {
        clickMessageOrSearch(i, i2, 0L);
    }

    public static void clickShortcut(String str) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("attach", str);
        sensorsBean.setValue("module", getString(R.string.statistics_desk_shortcut));
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void deepLinkStatistcs(String str, boolean z) {
        String str2 = z ? "外部拉起" : "内部拉起";
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.DEEPLINK_URL, str);
        sensorsBean.setValue(SensorsBean.PULLUP_METHOD, str2);
        sensorsStatisticsAndEraseDefaultProperty(DEEPLINK, sensorsBean);
    }

    public static void enterAppModule(String str, boolean z, int i, String str2) {
        String string;
        if (i == 1) {
            string = getString(R.string.statistics_storeapp_page_source_launch);
        } else if (i == 2) {
            string = getString(R.string.statistics_storeapp_page_source_click);
        } else if (i == 3) {
            string = getString(R.string.statistics_storeapp_page_source_link);
        } else if (i != 4) {
            string = i != 5 ? "" : getString(R.string.statistics_storeapp_page_source_browse_mode);
        } else {
            string = getString(R.string.statistics_storeapp_page_source_background);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        sensorsBean.setValue(SensorsBean.MODULE_SOURCE, string);
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue("attach", str2);
            sensorsBean.setValue("attach", str2);
        }
        sensorsStatistics(SENSORS_STOREAPP_PAGE, sensorsBean);
    }

    private static void eraseJSONObjectDefaultProperty(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.optString("pay_amount"))) {
                jSONObject.put("pay_amount", (Object) null);
            }
            if (TextUtils.isEmpty(jSONObject.optString("molecular_loan_amount"))) {
                jSONObject.put("molecular_loan_amount", (Object) null);
            }
            if (!"loginResult".equals(str)) {
                jSONObject.put("loginResult", (Object) null);
            }
            if (!SHARE_RESULT.equals(str) && !"payresult".equals(str) && !PAYSUCCESSPAGE.equals(str)) {
                jSONObject.put("is_success", (Object) null);
            }
            jSONObject.put("loanFreeAmount", (Object) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void exposure(String str, JSONObject jSONObject) {
        sensorsStatistics(str, jSONObject);
    }

    public static void exposureCommonProperties(JSONObject jSONObject) {
        registerSuperProperties(jSONObject);
    }

    public static String getAnonymousId() {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            return (AppConfig.getInstance().isSensorSDKReport.booleanValue() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) ? SensorsDataAPI.sharedInstance().getAnonymousId() : "";
        }
        return "";
    }

    public static String getDistinctId() {
        if (!SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            return "";
        }
        if (!TextUtils.isEmpty(sLoginId)) {
            return sLoginId;
        }
        String loginId = getLoginId();
        if (!TextUtils.isEmpty(loginId)) {
            return loginId;
        }
        if (AppConfig.getInstance().isSensorSDKReport.booleanValue() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            String anonymousId = SensorsDataAPI.sharedInstance().getAnonymousId();
            if (!TextUtils.isEmpty(anonymousId)) {
                return anonymousId;
            }
        }
        return "";
    }

    public static String getExperimentId() {
        if (TextUtils.isEmpty(experimentId) && requestAgainListener != null && experimentRequestCount < 3) {
            synchronized (StatisticsUtil.class) {
                experimentRequestCount++;
                requestAgainListener.requestExperimentId();
            }
        }
        return experimentId;
    }

    public static String getLoginId() {
        if (!SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            return "";
        }
        if (!TextUtils.isEmpty(sLoginId)) {
            return sLoginId;
        }
        if (AppConfig.getInstance().isSensorSDKReport.booleanValue() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            String loginId = SensorsDataAPI.sharedInstance().getLoginId();
            if (!TextUtils.isEmpty(loginId)) {
                return loginId;
            }
        }
        return "";
    }

    public static String getSourceName(int i) {
        if (i == 0) {
            return GlobalParams.isStoreAPP() ? getString(R.string.statistics_storeapp_page_source_home_click) : getString(R.string.statistics_storeapp_page_source_mall_click);
        }
        if (i == 1) {
            return GlobalParams.isStoreAPP() ? getString(R.string.statistics_storeapp_page_source_category_click) : getString(R.string.statistics_storeapp_page_source_mall_click);
        }
        if (i == 2) {
            return GlobalParams.isStoreAPP() ? getString(R.string.statistics_module_community_page) : getString(R.string.statistics_storeapp_page_source_home_click);
        }
        if (i == 3) {
            return getString(R.string.statistics_module_service_page);
        }
        if (i != 4) {
            return i != 5 ? "" : getString(R.string.statistics_storeapp_page_source_link);
        }
        return getString(R.string.statistics_storeapp_page_source_own_click);
    }

    public static String getString(@StringRes int i) {
        return ContextGetterUtils.INSTANCE.getApp().getString(i);
    }

    public static void homeUserSign(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("attach", str);
        sensorsBean.setValue(SensorsBean.ATTACH2, str2);
        sensorsBean.setValue(SensorsBean.TOOL_ID, dj8.PRODUCT_ID);
        sensorsBean.setValue("module", getString(R.string.statistics_newcomer_benefits));
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    private static void initSensorsDataSDK(Context context) {
        initSensorsDataSDKWithUrl(context, UrlConfig.STATISTICS_IS_DEBUG ? SA_SERVER_URL_DEBUG : SA_SERVER_URL_RELEASE);
    }

    public static void initSensorsDataSDKWithUrl(Context context, String str) {
        if (!AppConfig.getInstance().isSensorSDKReport.booleanValue()) {
            ReportManager.INSTANCE.init();
            if (!AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                return;
            }
        }
        SAConfigOptions sAConfigOptions = new SAConfigOptions(str);
        sAConfigOptions.setAutoTrackEventType(7).enableLog(UrlConfig.STATISTICS_IS_ENABLE_LOG);
        sAConfigOptions.enableTrackPush(true);
        sAConfigOptions.enableTrackPageLeave(true);
        sAConfigOptions.setRemoteConfigUrl("");
        SensorsDataAPI.startWithConfigOptions(context, sAConfigOptions);
        SpUtil.getStringAsync("guid", "", new SpUtil.SpResultSubscriber<String>() { // from class: com.heytap.store.base.core.util.statistics.StatisticsUtil.1
            @Override // com.heytap.store.base.core.util.SpUtil.SpResultSubscriber
            public void onSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                StatisticsUtil.resetStaticsID(str2);
            }
        });
        if (!hasCtaPermission) {
            SensorsDataAPI.sharedInstance().enableNetworkRequest(false);
        }
        if (UrlConfig.STATISTICS_IS_DEBUG) {
            ToastUtils.INSTANCE.show("神策为测试模式", 0, 0, 0);
            SensorsDataAPI.sharedInstance().enableLog(true);
        }
        registerSuperProperties(context);
    }

    public static void initStatistics(Application application, boolean z) {
        hasCtaPermission = z;
        initSensorsDataSDK(application);
    }

    public static boolean isLogin() {
        return !TextUtils.isEmpty(sLoginId);
    }

    public static void login(String str) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            if (!AppConfig.getInstance().isSensorSDKReport.booleanValue() && !AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                if (str != null && !str.equals(sLoginId)) {
                    notifyLoginIdChanged();
                }
                sLoginId = str;
                return;
            }
            sLoginId = str;
            if (str != null && str.equals(SensorsDataAPI.sharedInstance().getLoginId())) {
                notifyLoginIdChanged();
            }
            SensorsDataAPI.sharedInstance().login(str);
        }
    }

    public static void logout() {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            sLoginId = null;
            if (AppConfig.getInstance().isSensorSDKReport.booleanValue() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                SensorsDataAPI.sharedInstance().logout();
                OBusStatisticManager.INSTANCE.loginOut();
            }
        }
    }

    public static void mainPageVisit(int i, int i2) {
        String str;
        if (i == 1) {
            str = "002";
        } else if (i == 2) {
            str = BOTTOM_TAB_MIDDLE_CLICK;
        } else if (i != 3) {
            str = i != 4 ? "001" : "004";
        } else {
            str = "003";
        }
        new StatisticsBean(LOG_TAG_MAIN_TAB_301110, "1001").setModuleId(str).setEnterType(String.valueOf(i2)).statistics();
    }

    public static void nagvationClk(String str, String str2, String str3) {
        SensorsBean sensorsBean = new SensorsBean();
        if (!TextUtils.isEmpty(str)) {
            sensorsBean.setValue("module", "定制导航栏-" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue("attach", "定制导航栏：" + str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sensorsBean.setValue(SensorsBean.ATTACH2, "定制导航栏：" + str3);
        }
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    private static void notifyLoginIdChanged() {
        try {
            Iterator<LoginIdChangeListener> it = loginIdChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onLoginIdChangeListener();
            }
        } catch (Exception unused) {
        }
    }

    private static void preHandleSensorBean(String str, SensorsBean sensorsBean) {
        if (sensorsBean == null) {
            return;
        }
        if ("storeapp_ad_clk".equals(str) || SENSORS_STOREAPP_AD_EXP.equals(str)) {
            PagePathMap.PathInfo pathInfo = PagePathMap.getPathInfo(sensorsBean.getValue("module"));
            if (pathInfo != null) {
                sensorsBean.setValue(RecommendProductDataReportKt.FIRST_LVL_PATH, pathInfo.fistPath);
                String value = sensorsBean.getValue("title");
                if (TextUtils.isEmpty(value)) {
                    sensorsBean.setValue(RecommendProductDataReportKt.SECOND_LVL_PATH, pathInfo.secondPath);
                } else {
                    sensorsBean.setValue(RecommendProductDataReportKt.SECOND_LVL_PATH, pathInfo.secondPath + "-" + value);
                }
            }
            sensorsBean.setValue(SensorsBean.PAGE_DETAIL, (String) null);
            sensorsBean.setValue(SensorsBean.PRODUCT_ID, (String) null);
            sensorsBean.setValue(SensorsBean.PAGE_POSITION, (String) null);
        }
    }

    public static void productListClick(SensorsBean sensorsBean) {
        sensorsStatisticsAndEraseDefaultProperty(PRODUCT_LIST_CLICK, sensorsBean);
    }

    public static void productListPage(SensorsBean sensorsBean) {
        sensorsStatisticsAndEraseDefaultProperty(ACTIVITY_PAGE_VIEW, sensorsBean);
    }

    public static void profileSet(JSONObject jSONObject) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            HTStoreFacade.Companion companion = HTStoreFacade.INSTANCE;
            if (companion.getInstance().getTrackProxy() != null) {
                companion.getInstance().getTrackProxy().setUserProperties(jSONObject);
            }
        }
    }

    public static void registerPushId(String str) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            setUserPushId(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pur", str);
                registerSuperProperties(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void registerSuperProperties(JSONObject jSONObject) {
        if (AppConfig.getInstance().isSensorSDKReport.booleanValue()) {
            registerSuperPropertiesOnlyToSensor(jSONObject);
            return;
        }
        ReportManager.INSTANCE.setCommonProperties(jSONObject);
        if (AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            registerSuperPropertiesOnlyToSensor(jSONObject);
        }
    }

    private static void registerSuperPropertiesAction(Context context) {
        final String[] strArr = {""};
        SpUtil.getStringAsync(Constants.KEY_OPUSH_REG_ID, "", new SpUtil.SpResultSubscriber<String>() { // from class: com.heytap.store.base.core.util.statistics.StatisticsUtil.3
            @Override // com.heytap.store.base.core.util.SpUtil.SpResultSubscriber
            public void onSuccess(String str) {
                strArr[0] = str;
            }
        });
        String string = getString(R.string.statistics_open_app_source_icon);
        String string2 = SpUtil.getString(Constants.STATISTICS_UTM, "");
        if (!TextUtils.isEmpty(string2)) {
            UtmBean utmBean = (UtmBean) GsonUtils.INSTANCE.fromJson(string2, UtmBean.class);
            LATEST_UTM_SOURCE = utmBean.getLatest_utm_source();
            LATEST_UTM_MEDIUM = utmBean.getLatest_utm_medium();
            LATEST_UTM_CAMPAIGN = utmBean.getLatest_utm_campaign();
            LATEST_UTM_TERM = utmBean.getLatest_utm_term();
        }
        try {
            SensorCommonPropertyJson sensorCommonPropertyJson = new SensorCommonPropertyJson();
            sensorCommonPropertyJson.setSource_type(GlobalParams.getRealSourceType());
            sensorCommonPropertyJson.setSource(string);
            sensorCommonPropertyJson.setRom(OSUtils.getRomType());
            sensorCommonPropertyJson.setRom_version(OSUtils.getRomVersion());
            sensorCommonPropertyJson.setLatest_utm_source(LATEST_UTM_SOURCE);
            sensorCommonPropertyJson.setLatest_utm_medium(LATEST_UTM_MEDIUM);
            sensorCommonPropertyJson.setLatest_utm_campaign(LATEST_UTM_CAMPAIGN);
            sensorCommonPropertyJson.setLatest_utm_term(LATEST_UTM_TERM);
            sensorCommonPropertyJson.setUs(US);
            sensorCommonPropertyJson.setUm(UM);
            sensorCommonPropertyJson.setUc(UC);
            sensorCommonPropertyJson.setUt(UT);
            sensorCommonPropertyJson.setS_channel(DeviceInfoUtil.getAppMetaData(ContextGetterUtils.INSTANCE.getApp(), "STORE_CHANNEL"));
            if (!AppConfig.getInstance().isSensorSDKReport.booleanValue()) {
                ReportManager.INSTANCE.setCommonProperties(sensorCommonPropertyJson.getSensorCommonProperty());
            }
            String str = tempCommonSourceType;
            if (str != null) {
                sensorCommonPropertyJson.setSource_type(str);
            }
            String str2 = tempCommonSChannel;
            if (str2 != null) {
                sensorCommonPropertyJson.setS_channel(str2);
            }
            registerSuperPropertiesOnlyToSensor(sensorCommonPropertyJson.getSensorCommonProperty());
            setUserPushId(strArr[0]);
        } catch (Exception unused) {
        }
    }

    public static void registerSuperPropertiesOnlySensor(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
            registerSuperProperties(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void registerSuperPropertiesOnlyToSensor(JSONObject jSONObject) {
        final EventData eventData = new EventData();
        eventData.setData(jSONObject);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.util.statistics.StatisticsUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    HTStoreFacade.Companion companion = HTStoreFacade.INSTANCE;
                    if (companion.getInstance().getTrackProxy() != null) {
                        companion.getInstance().getTrackProxy().setCommonProperties("", eventData);
                    }
                }
            });
            return;
        }
        HTStoreFacade.Companion companion = HTStoreFacade.INSTANCE;
        if (companion.getInstance().getTrackProxy() != null) {
            companion.getInstance().getTrackProxy().setCommonProperties("", eventData);
        }
    }

    public static void reloadPage(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        sensorsBean.setValue(SensorsBean.RELOAD_RESULT, str2);
        sensorsStatistics(RELOAD_PAGE, sensorsBean);
    }

    public static void removeLoginIdChangeListener(LoginIdChangeListener loginIdChangeListener) {
        loginIdChangeListeners.remove(loginIdChangeListener);
    }

    public static void resetStaticsID(String str) {
        SensorsDataAPI.sharedInstance().identify(str);
        TrackApi.t(OBusStatisticManager.INSTANCE.getMAppId()).F(str);
        hasResetId = true;
    }

    public static void searchFilterCondition(String str, String str2, String str3) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.PRICE_RANGE, str3);
        sensorsBean.setValue("brand", str);
        sensorsBean.setValue("category", str2);
        sensorsStatisticsAndEraseDefaultProperty(FILTER_CONDITION, sensorsBean);
    }

    public static void searchOrderClick(String str) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.TOOL_ID, dj8.PRODUCT_ID);
        sensorsBean.setValue("module", str);
        sensorsStatisticsAndEraseDefaultProperty("storeapp_module_clk", sensorsBean);
    }

    public static void searchResult(int i, int i2, int i3, String str, String str2) {
        String string;
        String string2;
        String string3 = "";
        if (i == 0) {
            string = getString(R.string.statistics_search_not_product);
        } else if (i != 1) {
            string = i != 2 ? "" : getString(R.string.statistics_search_jupm_webview);
        } else {
            string = getString(R.string.statistics_search_has_product);
        }
        if (i2 == 0) {
            string2 = getString(R.string.statistics_module_home_page);
        } else if (i2 != 1) {
            string2 = i2 != 2 ? "" : getString(R.string.statistics_storeapp_page_source_link);
        } else {
            string2 = getString(R.string.statistics_module_category_page);
        }
        if (i3 == 0) {
            string3 = getString(R.string.statistics_search_source_of_hot);
        } else if (i3 == 1) {
            string3 = getString(R.string.statistics_search_source_of_quick);
        } else if (i3 == 2) {
            string3 = getString(R.string.statistics_search_source_of_active);
        } else if (i3 == 3) {
            string3 = getString(R.string.statistics_search_source_of_history);
        } else if (i3 == 4) {
            string3 = getString(R.string.statistics_search_source_of_word);
        }
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.SEARCH_NAME, str);
        sensorsBean.setValue(SensorsBean.SEARCH_RESULT, string);
        sensorsBean.setValue("searchPlace", string2);
        sensorsBean.setValue(SensorsBean.SEARCH_SOURCE, string3);
        sensorsBean.setValue(SensorsBean.SEARCHID, str2);
        sensorsStatistics(SEARCHKEYWORDS, sensorsBean);
    }

    public static void sensorsLoginResult(boolean z, String str) {
        changeLoginState(z);
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("loginResult", z);
        sensorsBean.setValue("loginResult", z);
        if (!z) {
            sensorsBean.setValue("fail_reason", str);
        }
        sensorsStatistics("loginResult", sensorsBean);
    }

    public static void sensorsStatistics(String str, SensorsBean sensorsBean) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport() && sensorsBean != null) {
            setSensorsBeanToolId(str, sensorsBean);
            preHandleSensorBean(str, sensorsBean);
            sensorsStatistics(str, sensorsBean.getJsonObject());
        }
    }

    public static void sensorsStatisticsAndEraseDefaultProperty(String str, SensorsBean sensorsBean) {
        if (sensorsBean == null) {
            return;
        }
        setSensorsBeanToolId(str, sensorsBean);
        JSONObject jsonObject = sensorsBean.getJsonObject();
        eraseJSONObjectDefaultProperty(str, jsonObject);
        sensorsStatistics(str, jsonObject);
    }

    public static void setExperimentId(String str) {
        if (!TextUtils.isEmpty(str)) {
            experimentId = str;
        }
        registerSuperProperties(SensorsBean.EXPERIMENT_ID, str);
    }

    public static void setLatestPayOrderTime() {
        setUserInfo("", "", -1L, -1L, -1, -1, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()), "", -1L);
    }

    public static void setLaunchSource(boolean z) {
        String string = z ? getString(R.string.statistics_open_app_source_link) : getString(R.string.statistics_open_app_source_icon);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", string);
            registerSuperProperties(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void setOpenNetWork() {
        if (!hasResetId && !TextUtils.isEmpty(DeviceInfoUtil.guid)) {
            resetStaticsID(DeviceInfoUtil.guid);
        }
        if (hasCtaPermission) {
            return;
        }
        hasCtaPermission = true;
        HTStoreFacade.Companion companion = HTStoreFacade.INSTANCE;
        if (companion.getInstance().getTrackProxy() != null) {
            companion.getInstance().getTrackProxy().reportEnable(true);
        }
    }

    private static void setSensorsBeanToolId(String str, SensorsBean sensorsBean) {
        if (sensorsBean == null) {
            return;
        }
        if (SENSORS_STOREAPP_PAGE.equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, "0");
        }
        if (SENSORS_STOREAPP_MODULE_EXP.equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, "00");
        }
        if ("storeapp_module_clk".equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, dj8.PRODUCT_ID);
        }
        if (SENSORS_STOREAPP_AD_EXP.equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, OpenIdUtils.DEFAULT_VALUE);
        }
        if (RELOAD_PAGE.equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, "0000000");
        }
        if (EXCEPTIONMONITORING.equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, "000000");
        }
        if ("storeapp_ad_clk".equals(str)) {
            sensorsBean.setValue(SensorsBean.TOOL_ID, "00000");
        }
    }

    public static void setUnreadMessage(int i) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bubble", i);
                registerSuperProperties(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setUserCheckIn(boolean z) {
        setUserInfo("", "", -1L, -1L, -1, z ? 1 : 0, "", "", -1L);
    }

    public static void setUserCouponsAndVouchers(Long l2, Long l3) {
        setUserInfo("", "", l2, l3, -1, -1, "", "", -1L);
    }

    public static void setUserEicCardWarrantyPeriod(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("warranty_start_time", str);
            jSONObject.put("warranty_over_time", str2);
            profileSet(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private static void setUserInfo(String str, String str2, Long l2, Long l3, int i, int i2, String str3, String str4, Long l4) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("name", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(SensorsBean.MEMBERSHIP_LEVEL, str2);
            }
            if (l2.longValue() != -1) {
                jSONObject.put("coupon", l2);
            }
            if (l3.longValue() != -1) {
                jSONObject.put("recycling_voucher", l3);
            }
            if (i != -1) {
                jSONObject.put("integral", i);
            }
            if (i2 != -1) {
                boolean z = true;
                if (i2 != 1) {
                    z = false;
                }
                jSONObject.put("check_in", z);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("lastestPayOrderTime", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("loanStatus", str4);
            }
            if (l4.longValue() != -1) {
                jSONObject.put("loanFreeAmount", l4);
            }
            profileSet(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void setUserIntegral(int i) {
        setUserInfo("", "", -1L, -1L, i, -1, "", "", -1L);
    }

    public static void setUserLevel(String str) {
        setUserInfo("", str, -1L, -1L, -1, -1, "", "", -1L);
    }

    public static void setUserName(String str) {
        setUserInfo(str, "", -1L, -1L, -1, -1, "", "", -1L);
    }

    private static void setUserPushId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("opushid", str);
            profileSet(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void shareClick(String str, String str2, String str3) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.SHARE_URL, str);
        sensorsBean.setValue(SensorsBean.PAGE_TITLE, str2);
        sensorsBean.setValue(SensorsBean.SHARE_POSITION, str3);
        sensorsStatistics(SHARE_CLICK, sensorsBean);
    }

    public static void sharePlatformClick(String str, String str2, String str3, String str4) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", getString(R.string.statistics_share_floatlayer_click));
        sensorsBean.setValue(SensorsBean.SHARE_URL, str);
        sensorsBean.setValue(SensorsBean.SHARE_CHANNEL, str2);
        sensorsBean.setValue(SensorsBean.PAGE_TITLE, str3);
        sensorsBean.setValue(SensorsBean.SHARE_TYPE, str4);
        sensorsStatistics(SHARE_FLOATLAYER_CLICK, sensorsBean);
    }

    public static void shareResult(String str, int i, String str2, String str3, boolean z, boolean z2) {
        String str4;
        String string;
        if (z2) {
            str4 = "口令";
        } else {
            str4 = i > 9 ? "海报" : "标准含海报";
        }
        switch (i) {
            case 1:
                string = getString(R.string.statistics_share_wx);
                break;
            case 2:
                string = getString(R.string.statistics_share_wx_friends);
                break;
            case 3:
                string = getString(R.string.statistics_share_wx);
                break;
            case 4:
                string = getString(R.string.statistics_share_qq);
                break;
            case 5:
                string = getString(R.string.statistics_share_zone);
                break;
            case 6:
                string = getString(R.string.statistics_share_wb);
                break;
            default:
                switch (i) {
                    case 91:
                        string = "海报：微信好友";
                        break;
                    case 92:
                        string = "海报：朋友圈";
                        break;
                    case 93:
                        string = "海报：保存图片";
                        break;
                    default:
                        string = getString(R.string.statistics_share_wx);
                        break;
                }
                break;
        }
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.SHARE_URL, str);
        sensorsBean.setValue(SensorsBean.PAGE_TITLE, str2);
        sensorsBean.setValue("is_success", z);
        sensorsBean.setValue(SensorsBean.SHARE_CHANNEL, string);
        sensorsBean.setValue(SensorsBean.SHARE_TYPE, str4);
        sensorsBean.setValue(SensorsBean.SHARE_POSITION, str3);
        sensorsStatistics(SHARE_RESULT, sensorsBean);
    }

    public static void showUpWebView(Object obj) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            if (AppConfig.getInstance().isSensorSDKReport.booleanValue() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                SensorsDataAPI.sharedInstance().showUpX5WebView(obj, null, false, true);
            }
        }
    }

    public static void snapUpPageClick(SensorsBean sensorsBean) {
        sensorsStatisticsAndEraseDefaultProperty(SNAP_UP_PAGE_CLICK, sensorsBean);
    }

    public static void statistics(@NonNull StatisticsBean statisticsBean) {
        statistics(ContextGetterUtils.INSTANCE.getApp(), statisticsBean.getLogTag(), statisticsBean.getEventId(), statisticsBean2HashMap(statisticsBean));
    }

    @NonNull
    public static HashMap<String, String> statisticsBean2HashMap(@NonNull StatisticsBean statisticsBean) {
        HashMap<String, String> map = new HashMap<>();
        if (!TextUtils.isEmpty(statisticsBean.getPageId())) {
            map.put("page_id", statisticsBean.getPageId());
        }
        if (!TextUtils.isEmpty(statisticsBean.getOptObj())) {
            map.put(LOG_OPT_OBJ, statisticsBean.getOptObj());
        }
        if (!TextUtils.isEmpty(statisticsBean.getEnterId())) {
            map.put(LOG_ENTER_ID, statisticsBean.getEnterId());
        }
        if (!TextUtils.isEmpty(statisticsBean.getTime())) {
            map.put("Time", statisticsBean.getTime());
        }
        if (!TextUtils.isEmpty(statisticsBean.getPageCode())) {
            map.put(LOG_PAGE_CODE, statisticsBean.getPageCode());
        }
        if (!TextUtils.isEmpty(statisticsBean.getCardCode())) {
            map.put(LOG_CARD_CODE, statisticsBean.getCardCode());
        }
        if (!TextUtils.isEmpty(statisticsBean.getCardPos())) {
            map.put(LOG_CARD_POS, statisticsBean.getCardPos());
        }
        if (!TextUtils.isEmpty(statisticsBean.getItemId())) {
            map.put("item_id", statisticsBean.getItemId());
        }
        if (!TextUtils.isEmpty(statisticsBean.getItemPos())) {
            map.put(LOG_ITEM_POS, statisticsBean.getItemPos());
        }
        if (!TextUtils.isEmpty(statisticsBean.getAdId())) {
            map.put(LOG_AD_ID, statisticsBean.getAdId());
        }
        if (!TextUtils.isEmpty(statisticsBean.getModuleId())) {
            map.put("module_id", statisticsBean.getModuleId());
        }
        if (!TextUtils.isEmpty(statisticsBean.getUserStatus())) {
            map.put(LOG_USER_STATUS, statisticsBean.getUserStatus());
        }
        if (!TextUtils.isEmpty(statisticsBean.getEnterType())) {
            map.put("enter_type", statisticsBean.getEnterType());
        }
        if (!TextUtils.isEmpty(statisticsBean.getDp_url())) {
            map.put(LOG_DP_URL, statisticsBean.getDp_url());
        }
        return map;
    }

    public static void storeAppAdClick(SensorsBean sensorsBean) {
        sensorsBean.setValue(SensorsBean.TOOL_ID, "00000");
        sensorsStatisticsAndEraseDefaultProperty("storeapp_ad_clk", sensorsBean);
    }

    public static void tokenDialogClk(String str) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void tokenDialogExp(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            sensorsBean.setValue(SensorsBean.COPYWRITING, str2);
        }
        sensorsStatistics(SENSORS_STOREAPP_MODULE_EXP, sensorsBean);
    }

    public static void updateInternalUtmParam(String str, String str2, String str3, String str4) {
        if (UrlConfig.DEBUG) {
            Log.d(TAG, "updateInternalUtmParam us " + str + ",um " + str2 + ",uc " + str3 + ",ut " + str4);
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = UtmBean.DEFAULT;
        }
        UT = str4;
        if (TextUtils.isEmpty(str)) {
            str = UtmBean.DEFAULT;
        }
        US = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = UtmBean.DEFAULT;
        }
        UM = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = UtmBean.DEFAULT;
        }
        UC = str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UtmBean.US, US);
            jSONObject.put(UtmBean.UM, UM);
            jSONObject.put(UtmBean.UC, UC);
            jSONObject.put(UtmBean.UT, UT);
            registerSuperProperties(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void updateUtmParam(String str, String str2, String str3, String str4) {
        if (UrlConfig.DEBUG) {
            Log.d(TAG, "updateInternalUtmParam source " + str + ",medium " + str2 + ",campaign " + str3 + ",term " + str4);
        }
        LATEST_UTM_SOURCE = str;
        LATEST_UTM_MEDIUM = str2;
        LATEST_UTM_CAMPAIGN = str3;
        LATEST_UTM_TERM = str4;
        try {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                str = UtmBean.DEFAULT;
            }
            jSONObject.put("latest_utm_source", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = UtmBean.DEFAULT;
            }
            jSONObject.put("latest_utm_medium", str2);
            if (TextUtils.isEmpty(str3)) {
                str3 = UtmBean.DEFAULT;
            }
            jSONObject.put(DeepLinkInterpreter.KEY_ACTION_UTM_CAMPAIGN, str3);
            if (TextUtils.isEmpty(str4)) {
                str4 = UtmBean.DEFAULT;
            }
            jSONObject.put(DeepLinkInterpreter.KEY_ACTION_UTM_TERM, str4);
            registerSuperProperties(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void vipClk(String str, String str2, String str3) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        if (!TextUtils.isEmpty(str3)) {
            sensorsBean.setValue(SensorsBean.ATTACH2, "会员卡片的状态：" + str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue("attach", "我的-会员卡片：" + str2);
        }
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void clickMessageOrSearch(int i, int i2, Long l2) {
        String string = i == 11 ? getString(R.string.statistics_module_message_page) : getString(R.string.statistics_module_search_page);
        String sourceName = getSourceName(i2);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", string);
        sensorsBean.setValue(SensorsBean.MODULE_SOURCE, sourceName);
        sensorsStatistics(SENSORS_STOREAPP_PAGE, sensorsBean);
    }

    public static void statistics(Context context, String str, String str2, @NonNull HashMap<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (String str3 : map.keySet()) {
            try {
                jSONObject.put(str3, map.get(str3));
            } catch (JSONException unused) {
            }
        }
        sensorsStatistics(str2, jSONObject);
    }

    public static void calendarRemindClk(String str) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.ATTACH2, str);
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    public static void calendarRemindExp(String str) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.COPYWRITING, str);
        sensorsStatistics(SENSORS_STOREAPP_MODULE_EXP, sensorsBean);
    }

    public static void registerSuperProperties(String str, String str2) {
        if (!SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            ReportManager.INSTANCE.setCommonProperty(str, str2);
            if (AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                registerSuperPropertiesOnlySensor(str, str2);
                return;
            }
            return;
        }
        registerSuperPropertiesOnlySensor(str, str2);
    }

    private static void sensorsStatistics(String str, JSONObject jSONObject) {
        if (SDKSensorSwitch.INSTANCE.isNeedSensorReport()) {
            boolean z = !AppConfig.getInstance().isSensorSDKReport.booleanValue();
            if (AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
                try {
                    z = !jSONObject.optBoolean(SENSORS_REPORT_DATA_CHANNEL, false);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                ReportManager.INSTANCE.reportData(str, jSONObject);
                return;
            }
            if (SENSORS_PAGE_CLICK.equals(str)) {
                String str2 = Acache.INSTANCE.get(KeyMaps.BD_VID);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        jSONObject.put(HttpConst.UTM_CHNL_BACK, str2);
                    } catch (JSONException unused) {
                    }
                }
            }
            jSONObject.remove(SensorsBean.EXPERIMENT_ID);
            EventData eventData = new EventData();
            eventData.setData(jSONObject);
            IStatistics trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy();
            if (trackProxy != null) {
                trackProxy.report(str, eventData);
            }
        }
    }

    public static void nagvationClk(String str, String str2) {
        SensorsBean sensorsBean = new SensorsBean();
        if (!TextUtils.isEmpty(str)) {
            sensorsBean.setValue("attach", "定制导航栏：" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sensorsBean.setValue(SensorsBean.ATTACH2, "定制导航栏：" + str2);
        }
        sensorsStatistics("storeapp_module_clk", sensorsBean);
    }

    private static void registerSuperProperties(Context context) {
        if (!SDKSensorSwitch.INSTANCE.isNeedSensorReport() || AppConfig.getInstance().isSensorCommonProperty.booleanValue()) {
            registerSuperPropertiesAction(context);
        }
    }

    public static void updateInternalUtmParam(String str) {
        if (TextUtils.isEmpty(str)) {
            str = UtmBean.DEFAULT;
        }
        UT = str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UtmBean.UT, UT);
            registerSuperProperties(jSONObject);
        } catch (JSONException unused) {
        }
    }
}
