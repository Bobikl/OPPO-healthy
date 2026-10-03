package com.heytap.store.base.core.http;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.Acache;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.KeyMaps;
import com.heytap.store.base.core.util.OSUtils;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.file.MD5Sign;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.product.service.IProductService;
import com.heytap.store.usercenter.IStoreUserService;
import com.oplus.aiunit.vision.gj8;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class GlobalParams {
    private static String ANDROID_VERSION = "";
    public static String APID = "";
    public static String APK_VERSION = "";
    public static String APP_CHANNEL = "";
    public static String APP_ID = "";
    public static String APP_KEY = "";
    public static String AUID = "";
    public static String BRAND = "";
    public static String CHANNEL = "";
    public static String CLIENT_PACKAGE_NAME = "";
    public static String CLIENT_VERSION_CODE = "";
    public static String COLOROS_VERSION = "";
    public static String DISTINCT_ID = "";
    public static String DUID = "";
    public static String GUID = "";
    public static String IMEI = "";
    private static String LANGUAGE = "";
    public static String MODEL = "";
    public static String NETWORK_TYPE = "";
    public static String OS = "";
    public static String OTA_VERSION = "";
    public static String OUID = "";
    public static String PHONE_ANDROID_SDK = "";
    public static String PHONE_MARKER = "";
    public static final String PLATFORM = "android";
    public static String ROM = "";
    public static String ROM_VERSION = "";
    public static String SA_DEVICE_ID = "";
    public static String SCREEN_SIZE = "";
    public static String TOKEN = "";
    public static String UA = "";
    public static String UDID = "";
    public static String encriptKey = null;
    public static final String format = "_t=%s&imei=%s&modal=%s&networktype=%s&os=%s&s_version=%s&screen_size=%s";
    public static int personalized = 1;
    private static IProductService productService = null;
    private static boolean sHasCtaPermission = false;

    public static gj8.a addCommonHeaderForRequest(gj8.a aVar) throws Exception {
        initGlobalParams();
        getRealSourceType();
        String str = CHANNEL;
        if (str == null) {
            str = "";
        }
        gj8.a aVarB = aVar.b(HttpConst.CHANNEL, str).b(HttpConst.UA, UA).b(HttpConst.MODEL, MODEL).b("os", OS).b(HttpConst.APK_VERSION, APK_VERSION).b(HttpConst.NETWORK_TYPE, NETWORK_TYPE).b("imei", IMEI).b("duid", DUID).b(HttpConst.UDID, UDID).b("ouid", OUID).b("guid", GUID).b(HttpConst.AUID, AUID).b(HttpConst.APID, APID).b(HttpConst.ROM, ROM).b(HttpConst.PHONE_MARKER, PHONE_MARKER).b(HttpConst.OS_SYSTEM, "android").b("brand", BRAND).b("romVersion", ROM_VERSION).b(HttpConst.SOURCE_TYPE, AppConfig.getInstance().getSdkEnv().booleanValue() ? "502" : "501").b(HttpConst.TOKEN_SID, TOKEN).b(HttpConst.CLIENT_PACKAGE, CLIENT_PACKAGE_NAME);
        String str2 = HttpConst.LATEST_UTM_SOURCE;
        String str3 = StatisticsUtil.LATEST_UTM_SOURCE;
        if (str3 == null) {
            str3 = "";
        }
        gj8.a aVarB2 = aVarB.b(str2, str3);
        String str4 = HttpConst.LATEST_UTM_MEDIUM;
        String str5 = StatisticsUtil.LATEST_UTM_MEDIUM;
        if (str5 == null) {
            str5 = "";
        }
        gj8.a aVarB3 = aVarB2.b(str4, str5);
        String str6 = HttpConst.LATEST_UTM_CAMPAIGN;
        String str7 = StatisticsUtil.LATEST_UTM_CAMPAIGN;
        if (str7 == null) {
            str7 = "";
        }
        gj8.a aVarB4 = aVarB3.b(str6, str7).b(HttpConst.US, StatisticsUtil.US).b(HttpConst.UM, StatisticsUtil.UM).b(HttpConst.UC, StatisticsUtil.UC).b(HttpConst.UT, StatisticsUtil.UT).b(HttpConst.PERSONALIZED, String.valueOf(personalized));
        SensorsBean.Companion companion = SensorsBean.INSTANCE;
        aVarB4.b(SensorsBean.LOG_ID, companion.getLog_id() != null ? companion.getLog_id() : "").b(HttpConst.SERVER_ENV, UrlConfig.ENV.isRelease() ? "release" : "test");
        if (AppConfig.getInstance().getSdkEnv().booleanValue()) {
            aVar.b("appId", APP_ID).b(HttpConst.APP_KEY, APP_KEY).b(HttpConst.CHANNEL, APP_CHANNEL);
        }
        String str8 = Acache.INSTANCE.get(KeyMaps.BD_VID);
        if (!TextUtils.isEmpty(str8)) {
            aVar.b("utmChnlBack", str8);
        }
        if (!TextUtils.isEmpty(companion.getSection_id())) {
            aVar.b(SensorsBean.SECTION_ID, companion.getSection_id());
        }
        if (!TextUtils.isEmpty(companion.getScene_id())) {
            aVar.b("scene_id", companion.getScene_id());
        }
        if (!TextUtils.isEmpty(companion.getExp_id())) {
            aVar.b(SensorsBean.EXP_ID, companion.getExp_id());
        }
        if (!TextUtils.isEmpty(companion.getStrategy_id())) {
            aVar.b(SensorsBean.STRATEGY_ID, companion.getStrategy_id());
        }
        if (!TextUtils.isEmpty(companion.getRetrieve_id())) {
            aVar.b(SensorsBean.RETRIEVE_ID, companion.getRetrieve_id());
        }
        if (!TextUtils.isEmpty(companion.getAdid())) {
            aVar.b(KeyMaps.OCPX_ADID, companion.getAdid());
        }
        if (!TextUtils.isEmpty(StatisticsUtil.experimentId)) {
            aVar.b(HttpConst.EXPERIMENT_ID, StatisticsUtil.experimentId);
        }
        if (getProductService() != null && !TextUtils.isEmpty(getProductService().getSearchId())) {
            aVar.b(HttpConst.SEARCH_ID, getProductService().getSearchId());
        }
        if (!TextUtils.isEmpty(companion.getTransparent())) {
            aVar.b(HttpConst.TRANSPARENT, companion.getTransparent());
        }
        if (TextUtils.isEmpty(GUID)) {
            aVar.b(HttpConst.DEVICE_ID, StatisticsUtil.getAnonymousId());
        } else {
            aVar.b(HttpConst.DEVICE_ID, GUID);
        }
        if (TextUtils.isEmpty(aVar.h(HttpConst.SCREEN_SIZE))) {
            aVar.b(HttpConst.SCREEN_SIZE, SCREEN_SIZE);
        }
        return aVar;
    }

    public static Map<String, String> addCommonParamsToHeaderForH5() {
        initGlobalParams();
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("Accept-Language", "zh");
        map.put(HttpConst.UA, UA);
        map.put(HttpConst.MODEL, MODEL);
        map.put(HttpConst.SCREEN_SIZE, SCREEN_SIZE);
        map.put("os", OS);
        map.put("brand", BRAND);
        map.put(HttpConst.PHONE_MARKER, PHONE_MARKER);
        map.put(HttpConst.OS_SYSTEM, "android");
        map.put(HttpConst.APK_VERSION, APK_VERSION);
        map.put(HttpConst.NETWORK_TYPE, NETWORK_TYPE);
        map.put(HttpConst.CURRENT_SERVICE_TIME_KEY, String.valueOf(getServerTime()));
        map.put(HttpConst.OTA_VERSION, OTA_VERSION);
        map.put("romVersion", PHONE_ANDROID_SDK);
        map.put(HttpConst.COLOR_OS_VERSION, COLOROS_VERSION);
        map.put("androidVersion", ANDROID_VERSION);
        map.put(HttpConst.U_LANG, LANGUAGE);
        map.put(HttpConst.CLIENT_VERSION_CODE, CLIENT_VERSION_CODE);
        map.put(HttpConst.CLIENT_PACKAGE, CLIENT_PACKAGE_NAME);
        map.put(HttpConst.PERSONALIZED, String.valueOf(personalized));
        if (!UrlConfig.ENV.isRelease()) {
            map.put(HttpConst.SERVER_ENV, UrlConfig.ENV.getCurrentEnv() == 0 ? "release" : "test");
        }
        return map;
    }

    @Deprecated
    public static String addCommonParamsToUrlForH5(String str) {
        initGlobalParams();
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        String fragment = uri.getFragment();
        String str2 = "";
        if (!TextUtils.isEmpty(fragment)) {
            String str3 = "#" + fragment;
            String str4 = "%23" + fragment;
            if (str.contains(str3)) {
                str = str.replace(str3, "");
                str2 = str3;
            } else if (str.contains(str4)) {
                str = str.replace("%23" + fragment, "");
                str2 = str4;
            }
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        } else if (!str.endsWith("&")) {
            sb.append("&");
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (!queryParameterNames.contains("platform")) {
            sb.append("platform");
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append("android");
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.UA)) {
            sb.append(HttpConst.UA);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(UA);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.PHONE_MARKER)) {
            sb.append(HttpConst.PHONE_MARKER);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(PHONE_MARKER);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.OS_SYSTEM)) {
            sb.append(HttpConst.OS_SYSTEM);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append("android");
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.MODEL)) {
            sb.append(HttpConst.MODEL);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(MODEL);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.SCREEN_SIZE)) {
            sb.append(HttpConst.SCREEN_SIZE);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(SCREEN_SIZE);
            sb.append("&");
        }
        if (!queryParameterNames.contains("os")) {
            sb.append("os");
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(OS);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.APK_VERSION)) {
            sb.append(HttpConst.APK_VERSION);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(APK_VERSION);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.NETWORK_TYPE)) {
            sb.append(HttpConst.NETWORK_TYPE);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(NETWORK_TYPE);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.CURRENT_SERVICE_TIME_KEY)) {
            sb.append(HttpConst.CURRENT_SERVICE_TIME_KEY);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(String.valueOf(getServerTime()));
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.U_LANG)) {
            sb.append(HttpConst.U_LANG);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(LANGUAGE);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.CLIENT_VERSION_CODE)) {
            sb.append(HttpConst.CLIENT_VERSION_CODE);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(CLIENT_VERSION_CODE);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.CLIENT_PACKAGE)) {
            sb.append(HttpConst.CLIENT_PACKAGE);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(CLIENT_PACKAGE_NAME);
            sb.append("&");
        }
        if (!queryParameterNames.contains(HttpConst.SERVER_ENV)) {
            sb.append(HttpConst.SERVER_ENV);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(UrlConfig.ENV.isRelease() ? "release" : "test");
            sb.append("&");
        }
        if (!TextUtils.isEmpty(fragment)) {
            sb.append(str2);
        }
        return sb.toString();
    }

    private static String byteToHexString(byte b) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        return new String(new char[]{cArr[(b >>> 4) & 15], cArr[b & 15]});
    }

    public static String getAppName() {
        return AppConfig.getInstance().getSdkEnv().booleanValue() ? DeviceInfoUtil.getAppName(ContextGetterUtils.INSTANCE.getApp()) : ContextGetterUtils.INSTANCE.getApp().getString(R.string.pf_core_base_store_app_name);
    }

    public static String getKey() {
        if (!TextUtils.isEmpty(encriptKey)) {
            return encriptKey;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getKey1());
        stringBuffer.append(getKey2());
        stringBuffer.append(getKey3());
        return stringBuffer.toString();
    }

    private static String getKey1() {
        return UrlConfig.ENV.getCurrentEnv() == 0 ? ContextGetterUtils.INSTANCE.getApp().getString(R.string.pf_core_base_release_part1_key) : ContextGetterUtils.INSTANCE.getApp().getString(R.string.pf_core_base_test_part1_key);
    }

    private static String getKey2() {
        return UrlConfig.ENV.getCurrentEnv() == 0 ? "teGCONGuPcGLB" : "HwkbeL1Kg";
    }

    private static String getKey3() {
        return UrlConfig.ENV.getCurrentEnv() == 0 ? ContextGetterUtils.INSTANCE.getApp().getString(R.string.pf_core_base_release_part3_key) : ContextGetterUtils.INSTANCE.getApp().getString(R.string.pf_core_base_test_part3_key);
    }

    private static IProductService getProductService() {
        if (productService == null) {
            productService = (IProductService) HTAliasRouter.getInstance().getService(IProductService.class);
        }
        return productService;
    }

    public static String getRealSourceType() {
        return (!AppConfig.getInstance().getSdkEnv().booleanValue() && isCommunityAPP()) ? "506" : "502";
    }

    public static long getServerTime() {
        return TimeSynCheck.getInstance().getServiceTime();
    }

    public static String getSignature(String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "HmacSHA1");
        Mac mac = null;
        try {
            mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
        }
        byte[] bArrDoFinal = mac.doFinal(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(byteToHexString(b));
        }
        return sb.toString();
    }

    public static String getSortParams(Map<String, String> map) {
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() { // from class: com.heytap.store.base.core.http.GlobalParams.1
            @Override // java.util.Comparator
            public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                return entry.getKey().toString().compareTo(entry2.getKey());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : arrayList) {
            sb.append(((String) entry.getKey()) + HttpUtils.EQUAL_SIGN + ((String) entry.getValue()));
            sb.append("&");
        }
        String string = sb.toString();
        return !string.isEmpty() ? string.substring(0, string.length() - 1) : string;
    }

    public static void initGlobalParams() {
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        Application app = contextGetterUtils.getApp();
        if (TextUtils.isEmpty(CHANNEL)) {
            CHANNEL = DeviceInfoUtil.getAppMetaData(app, "STORE_CHANNEL");
        }
        if (TextUtils.isEmpty(NETWORK_TYPE)) {
            NETWORK_TYPE = DeviceInfoUtil.getNetworkType();
        }
        if (TextUtils.isEmpty(UA)) {
            UA = DeviceInfoUtil.getUA(null);
        }
        if (TextUtils.isEmpty(MODEL)) {
            MODEL = DeviceInfoUtil.getPhoneModel();
        }
        SCREEN_SIZE = DisplayUtil.getNetNeedScreenSize(app);
        if (TextUtils.isEmpty(OS)) {
            OS = DeviceInfoUtil.getSysVersion();
        }
        if (TextUtils.isEmpty(BRAND)) {
            BRAND = DeviceInfoUtil.getStoreBrand();
        }
        if (TextUtils.isEmpty(APK_VERSION)) {
            APK_VERSION = String.valueOf(DeviceInfoUtil.getApkVersion());
        }
        if (TextUtils.isEmpty(IMEI)) {
            IMEI = DeviceInfoUtil.getImei(app);
        }
        if (TextUtils.isEmpty(DUID)) {
            DUID = DeviceInfoUtil.getCachedDUID();
        }
        if (TextUtils.isEmpty(UDID)) {
            UDID = DeviceInfoUtil.getCachedUDID();
        }
        if (TextUtils.isEmpty(OUID)) {
            OUID = DeviceInfoUtil.getCachedOUID();
        }
        if (TextUtils.isEmpty(GUID)) {
            GUID = DeviceInfoUtil.getCachedGUID();
        }
        if (TextUtils.isEmpty(AUID)) {
            AUID = DeviceInfoUtil.getCachedAUID();
        }
        if (TextUtils.isEmpty(APID)) {
            APID = DeviceInfoUtil.getCachedAPID();
        }
        if (TextUtils.isEmpty(PHONE_MARKER)) {
            PHONE_MARKER = DeviceInfoUtil.getManufacture();
        }
        if (TextUtils.isEmpty(ROM)) {
            ROM = OSUtils.getRomType();
        }
        if (TextUtils.isEmpty(ROM_VERSION)) {
            ROM_VERSION = OSUtils.getRomVersion();
        }
        IStoreUserService iStoreUserService = (IStoreUserService) HTAliasRouter.getInstance().getService(IStoreUserService.class);
        TOKEN = iStoreUserService != null ? iStoreUserService.getToken() : "";
        if (TextUtils.isEmpty(OTA_VERSION)) {
            OTA_VERSION = DeviceInfoUtil.getProperty("ro.build.version.ota", "");
        }
        if (TextUtils.isEmpty(PHONE_ANDROID_SDK)) {
            PHONE_ANDROID_SDK = String.valueOf(DeviceInfoUtil.getPhoneAndroidSDK());
        }
        if (TextUtils.isEmpty(COLOROS_VERSION)) {
            COLOROS_VERSION = String.valueOf(DeviceInfoUtil.getColorOSVersion());
        }
        if (TextUtils.isEmpty(ANDROID_VERSION)) {
            ANDROID_VERSION = DeviceInfoUtil.getSysVersion();
        }
        if (TextUtils.isEmpty(LANGUAGE)) {
            LANGUAGE = DeviceInfoUtil.getLanguage();
        }
        if (TextUtils.isEmpty(CLIENT_VERSION_CODE)) {
            CLIENT_VERSION_CODE = String.valueOf(DeviceInfoUtil.getApkVersionCode(contextGetterUtils.getApp()));
        }
        if (TextUtils.isEmpty(CLIENT_PACKAGE_NAME)) {
            CLIENT_PACKAGE_NAME = contextGetterUtils.getApp().getPackageName();
        }
    }

    public static boolean isAddGlobalUrl(String str) {
        return str.contains(UrlConfig.ENV.serverApiHost) || ((str.contains("https://xcx3rd.oppo.cn/portal/offlineStore/area/list") || str.contains(UrlConfig.ENV.h5Host) || str.contains(UrlConfig.ENV.liveApiHost) || str.contains(UrlConfig.ENV.imApiHost) || str.contains("recyclePrice") || str.contains(UrlConfig.H5_HOST_RELEASE_NEW)) && !str.contains(HttpConst.SIGN_KEY));
    }

    public static boolean isCommunityAPP() {
        return Constants.COMMUNITY_APP_PACKAGE_NAME.equals(ContextGetterUtils.INSTANCE.getApp().getPackageName());
    }

    public static boolean isStoreAPP() {
        return Constants.STORE_APP_PACKAGE_NAME.equals(ContextGetterUtils.INSTANCE.getApp().getPackageName());
    }

    public static String veritySign(LinkedHashMap<String, Object> linkedHashMap, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && !"".equals(value)) {
                stringBuffer.append(key + HttpUtils.EQUAL_SIGN + value + "&");
            }
        }
        stringBuffer.append("key=" + str);
        String string = stringBuffer.toString();
        if ("O0C6EoB4/MY4ylCVvTzOlw==".equals(str)) {
            return MD5Sign.md5Hex(string);
        }
        String string2 = stringBuffer.toString();
        int iIntValue = 0;
        for (char c2 : string2.toCharArray()) {
            iIntValue += Integer.valueOf(c2).intValue();
        }
        int i = (iIntValue % 3) + 3;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                string2 = MD5Sign.md5Hex(string2.getBytes("utf-8")).toUpperCase();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return string2;
    }
}
