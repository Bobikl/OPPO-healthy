package com.heytap.store.base.core.http;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.Acache;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.KeyMaps;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.base.core.util.OSUtils;
import com.heytap.store.base.core.util.TimeUtil;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.app.HostDomainCenter;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.heytap.store.base.facade.HTStoreFacade;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.GsonUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.track.EventData;
import com.heytap.store.platform.track.IStatistics;
import com.heytap.store.product.service.IProductService;
import com.heytap.store.usercenter.IStoreUserService;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.cdd;
import com.oplus.aiunit.vision.dcd;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.p14;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HttpUtils {
    public static final String CLEAR_COOKIE = "clear_cookie";
    public static final String EQUAL_SIGN = "=";
    public static final String TAG = "HttpUtils";
    private static IProductService productService;

    private HttpUtils() {
    }

    @SuppressLint({"CheckResult"})
    public static void checkCookieTokenIsTrue(final String str, final String str2) {
        kbd.p("1").d(2000L, TimeUnit.MILLISECONDS).r(e30.a()).x(new p14<String>() { // from class: com.heytap.store.base.core.http.HttpUtils.4
            @Override // com.oplus.aiunit.vision.p14
            public void accept(String str3) {
                try {
                    String cookieValue = HttpUtils.getCookieValue(str2, HttpConst.TOKEN_SID);
                    if (cookieValue == null || cookieValue.equals(str)) {
                        return;
                    }
                    IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
                    HashMap defaultCookieReportData = HttpUtils.getDefaultCookieReportData("cookie_diff", str2, iStoreUserService != null ? iStoreUserService.getAccount().getSsoid() : "");
                    defaultCookieReportData.put("cookieToken", cookieValue);
                    defaultCookieReportData.put(SpeechConstant.KEY_USER_TOKEN, str);
                    HttpUtils.reportCookieError(defaultCookieReportData);
                } catch (Exception unused) {
                }
            }
        });
    }

    private static String getAppParam() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", DeviceInfoUtil.getModel());
            jSONObject.put("brand", GlobalParams.BRAND);
            jSONObject.put(HttpConst.ROM, OSUtils.getRomType());
            jSONObject.put("guid", DeviceInfoUtil.getCachedGUID());
            jSONObject.put("ouid", DeviceInfoUtil.getCachedOUID());
            jSONObject.put("duid", DeviceInfoUtil.getCachedDUID());
            jSONObject.put(HttpConst.UDID, DeviceInfoUtil.getCachedUDID());
            jSONObject.put(HttpConst.APID, DeviceInfoUtil.getCachedAPID());
            jSONObject.put(HttpConst.SA_DEVICE_ID, StatisticsUtil.getAnonymousId());
            jSONObject.put("romVersion", OSUtils.getRomVersion());
            jSONObject.put("apkPkg", ContextGetterUtils.INSTANCE.getApp().getPackageName());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getCookieValue(String str, String str2) {
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            return null;
        }
        for (String str3 : cookie.split(";")) {
            String[] strArrSplit = str3.trim().split(EQUAL_SIGN);
            if (strArrSplit.length == 2 && strArrSplit[0].equals(str2)) {
                return strArrSplit[1];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap getDefaultCookieReportData(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("event", str);
        map.put("ssoid", str3);
        map.put("url", str2);
        map.put(ClickApiEntity.TIME, TimeUtil.currentDateString());
        map.put("OS", DeviceInfoUtil.getSysVersion());
        map.put("AppVersion", Integer.valueOf(DeviceInfoUtil.getApkVersion()));
        map.put("SDKVersion", GlobalParams.APK_VERSION);
        return map;
    }

    private static String getInnerUtmCookie() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UtmBean.US, StatisticsUtil.US);
            jSONObject.put(UtmBean.UM, StatisticsUtil.UM);
            jSONObject.put(UtmBean.UC, StatisticsUtil.UC);
            jSONObject.put(UtmBean.UT, StatisticsUtil.UT);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return UtmBean.DEFAULT;
        }
    }

    private static IProductService getProductService() {
        if (productService == null) {
            productService = (IProductService) HTAliasRouter.getInstance().getService(IProductService.class);
        }
        return productService;
    }

    public static String getUrlDomain(String str) {
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host)) {
            return "";
        }
        boolean z = true;
        if (!host.contains(HostDomainCenter.OPPO_COM) && !host.contains(HostDomainCenter.OPPOSHOP_CN) && !host.contains(HostDomainCenter.WANYOL_COM) && !host.contains(HostDomainCenter.MYOAS_NET) && !host.contains(HostDomainCenter.REALME_COM)) {
            z = false;
        }
        return z ? host.substring(host.indexOf("."), host.length()) : host;
    }

    private static String getUtmToCookie() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("utm_source", StatisticsUtil.LATEST_UTM_SOURCE);
            jSONObject.put("utm_medium", StatisticsUtil.LATEST_UTM_MEDIUM);
            jSONObject.put(UtmBean.UTM_CAMPAIGN, StatisticsUtil.LATEST_UTM_CAMPAIGN);
            jSONObject.put(UtmBean.UTM_TERM, StatisticsUtil.LATEST_UTM_TERM);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static boolean isCCBBackUrl(String str) {
        return !TextUtils.isEmpty(str) && str.contains("https://ibsbjstar.ccb.com.cn");
    }

    public static boolean isHttpUrl(String str) {
        return !TextUtils.isEmpty(str) && (str.startsWith("http") || str.startsWith(Const.Scheme.SCHEME_HTTPS));
    }

    public static boolean isPrivacyUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(UrlConfig.URL_USER_PROTOCOL) || str.equals(UrlConfig.URL_PRIVACY_POLICY) || str.equals(UrlConfig.getPrivacyPolicyUrl()) || str.equals(UrlConfig.URL_PRIVACY_NOTICEOFINFRINGEMENT) || str.equals(UrlConfig.URL_PRIVACY_AGAINSTNOTIFICATION) || str.equals(UrlConfig.URL_PRIVACY_PRIVACY);
    }

    public static void removeCookie(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
        CookieSyncManager.getInstance().sync();
    }

    public static void reportCookieError(@NotNull Map<String, Object> map) {
        try {
            IStatistics trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0);
            if (trackProxy == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("c1", "cookieError");
            jSONObject.put("c3", GsonUtils.INSTANCE.toJson(map));
            EventData eventData = new EventData();
            eventData.setData(jSONObject);
            trackProxy.reportByOBus("monitor", "custom_monitor", eventData);
            LogUtils.INSTANCE.d("cookieErrorReport", jSONObject.toString());
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(e2.toString());
        }
    }

    public static void setCookieWithToken(final String str, final Context context) {
        if (str == null || str.isEmpty() || str.endsWith(".webp") || str.endsWith(".gif") || str.endsWith(".jpg") || str.endsWith(".png") || context == null) {
            return;
        }
        kbd.p("").q(new j08<String, String>() { // from class: com.heytap.store.base.core.http.HttpUtils.3
            @Override // com.oplus.aiunit.vision.j08
            public String apply(String str2) throws Exception {
                Uri uri = Uri.parse(str);
                String urlDomain = HttpUtils.getUrlDomain(str);
                String scheme = uri.getScheme();
                IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
                String ssoid = iStoreUserService != null ? iStoreUserService.getAccount().getSsoid() : "";
                String token = iStoreUserService != null ? iStoreUserService.getToken() : "";
                if (TextUtils.isEmpty(urlDomain)) {
                    Log.w(HttpUtils.TAG, "同步token时host为空, url: " + str);
                    HashMap defaultCookieReportData = HttpUtils.getDefaultCookieReportData("cookie_sync_error", str, ssoid);
                    defaultCookieReportData.put("syncMsg", "同步token时host为空");
                    HttpUtils.reportCookieError(defaultCookieReportData);
                    return str2;
                }
                if (!HostDomainCenter.allowWebViewActivity(str)) {
                    Log.w(HttpUtils.TAG, "url 不在白名单内, 不同步token, url: " + str);
                    HashMap defaultCookieReportData2 = HttpUtils.getDefaultCookieReportData("cookie_sync_error", str, ssoid);
                    defaultCookieReportData2.put("syncMsg", "url 不在白名单内, 不同步token");
                    HttpUtils.reportCookieError(defaultCookieReportData2);
                } else {
                    if (UrlConfig.ENV.isRelease() && !Const.Scheme.SCHEME_HTTPS.equals(scheme)) {
                        Log.w(HttpUtils.TAG, "正式环境下url 的schmem必须是https才会同步token, url: " + str);
                        return str2;
                    }
                    HttpUtils.syncCookie(context, urlDomain, "TOKENSID=" + token, "ENCODE_TOKENSID=" + token);
                    LogUtils.INSTANCE.i(HttpUtils.TAG, "同步token,url: " + str);
                }
                return token;
            }
        }).B(e30.a()).r(e30.a()).y(new p14<String>() { // from class: com.heytap.store.base.core.http.HttpUtils.1
            @Override // com.oplus.aiunit.vision.p14
            public void accept(String str2) throws Exception {
                LogUtils.INSTANCE.w("同步执行成功");
                HttpUtils.checkCookieTokenIsTrue(str2, str);
            }
        }, new p14<Throwable>() { // from class: com.heytap.store.base.core.http.HttpUtils.2
            @Override // com.oplus.aiunit.vision.p14
            public void accept(Throwable th) throws Exception {
                LogUtils.INSTANCE.w(HttpUtils.TAG, "同步token报错,url: " + str);
                th.printStackTrace();
                IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
                HashMap defaultCookieReportData = HttpUtils.getDefaultCookieReportData("cookie_sync_error", str, iStoreUserService != null ? iStoreUserService.getAccount().getSsoid() : "");
                defaultCookieReportData.put("syncMsg", th.getMessage());
                HttpUtils.reportCookieError(defaultCookieReportData);
            }
        });
    }

    public static void setDefaultCookieAsync(String str, Context context) {
        String realSourceType = GlobalParams.getRealSourceType();
        if (AppConfig.getInstance().getSdkEnv().booleanValue()) {
            realSourceType = "502";
        }
        setDefaultCookieAsync(str, context, realSourceType, GlobalParams.CHANNEL, GlobalParams.APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void syncCookie(Context context, String str, String... strArr) {
        if (NullObjectUtil.isNullOrEmpty(strArr)) {
            return;
        }
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                cookieManager.setCookie(str, str2);
            }
        }
        CookieManager.getInstance().flush();
    }

    public static void updateCookieDistinctId(final Context context, final String str, final String str2) {
        kbd.c(new cdd() { // from class: com.heytap.store.base.core.http.HttpUtils.5
            @Override // com.oplus.aiunit.vision.cdd
            public void subscribe(dcd dcdVar) throws Exception {
                String urlDomain = HttpUtils.getUrlDomain(str);
                IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
                String ssoid = iStoreUserService != null ? iStoreUserService.getAccount().getSsoid() : "";
                if (TextUtils.isEmpty(urlDomain)) {
                    return;
                }
                HttpUtils.syncCookie(context, urlDomain, "sa_distinct_id=" + str2);
                HttpUtils.syncCookie(context, urlDomain, "oppo_track_id=" + ssoid);
                HttpUtils.syncCookie(context, urlDomain, "path=/");
            }
        }).B(ifg.b()).r(e30.a()).w();
    }

    public static void setDefaultCookieAsync(String str, Context context, String str2, String str3, String str4) {
        String urlDomain = getUrlDomain(str);
        try {
            if (TextUtils.isEmpty(urlDomain)) {
                return;
            }
            CookieSyncManager.createInstance(context);
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            String queryParameter = Uri.parse(str).getQueryParameter(HttpConst.SOURCE_TYPE);
            if (TextUtils.isEmpty(str4)) {
                str4 = DeviceInfoUtil.getApkVersion() + "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = GlobalParams.getRealSourceType();
            }
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = GlobalParams.CHANNEL;
            }
            if (AppConfig.getInstance().getSdkEnv().booleanValue() && queryParameter.equals(GlobalParams.getRealSourceType())) {
                str4 = GlobalParams.APK_VERSION;
            }
            Acache acache = Acache.INSTANCE;
            String str5 = acache.get(KeyMaps.BD_VID);
            if (!TextUtils.isEmpty(str5)) {
                cookieManager.setCookie(urlDomain, HttpConst.UTM_CHNL_BACK + EQUAL_SIGN + str5);
            }
            cookieManager.setCookie(urlDomain, "source_type=" + queryParameter);
            cookieManager.setCookie(urlDomain, "sa_distinct_id=" + StatisticsUtil.getDistinctId());
            cookieManager.setCookie(urlDomain, "s_channel=" + str3);
            cookieManager.setCookie(urlDomain, "s_version=" + str4);
            cookieManager.setCookie(urlDomain, "app_utm=" + getUtmToCookie());
            cookieManager.setCookie(urlDomain, "app_innerutm=" + getInnerUtmCookie());
            cookieManager.setCookie(urlDomain, "app_param=" + getAppParam());
            cookieManager.setCookie(urlDomain, "apkPkg=" + ContextGetterUtils.INSTANCE.getApp().getPackageName());
            cookieManager.setCookie(urlDomain, "Personalized=" + GlobalParams.personalized);
            cookieManager.setCookie(urlDomain, "Personalized=" + GlobalParams.personalized);
            cookieManager.setCookie(urlDomain, "path=/");
            SensorsBean.Companion companion = SensorsBean.INSTANCE;
            if (!TextUtils.isEmpty(companion.getAdid())) {
                cookieManager.setCookie(urlDomain, "adid=" + companion.getAdid());
            }
            if (!TextUtils.isEmpty(StatisticsUtil.getExperimentId())) {
                cookieManager.setCookie(urlDomain, "experiment_id=" + StatisticsUtil.experimentId);
            }
            if (getProductService() != null && !TextUtils.isEmpty(getProductService().getSearchId())) {
                cookieManager.setCookie(urlDomain, "search_id=" + getProductService().getSearchId());
            }
            if (!TextUtils.isEmpty(companion.getTransparent())) {
                cookieManager.setCookie(urlDomain, "transparent=" + companion.getTransparent());
            }
            if (!UrlConfig.ENV.isRelease()) {
                StringBuilder sb = new StringBuilder();
                sb.append("env=");
                sb.append(UrlConfig.ENV.getCurrentEnv() == 0 ? "release" : "test");
                cookieManager.setCookie(urlDomain, sb.toString());
            }
            String str6 = acache.get(KeyMaps.REFERER);
            if (!TextUtils.isEmpty(str6)) {
                cookieManager.setCookie(urlDomain, "referer=" + str6);
            }
            IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
            cookieManager.setCookie(urlDomain, "oppo_track_id=" + (iStoreUserService != null ? iStoreUserService.getAccount().getSsoid() : ""));
            CookieManager.getInstance().flush();
        } catch (Exception unused) {
        }
    }
}
