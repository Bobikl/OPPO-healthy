package com.platform.usercenter.network.header;

import android.content.Context;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.sports.move.treadmill.ui.treadmill.SportDeviceConnectionActivity;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.sbe;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.platform.usercenter.basic.BuildConfig;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.Maps;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.device.UCDeviceTypeFactory;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.MultiUserUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.tools.storage.SPreferenceCommonHelper;
import com.platform.usercenter.tools.ui.DisplayUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class UCHeaderHelperV2 {
    private static final String TAG = "UCHeaderHelperV2";
    public static final String UTF_8 = "utf-8";
    public static final String X_OP_UPGRADE = "X-Op-Upgrade";
    public static final String X_PROTOCOL_VERSION = "X-Protocol-Ver";
    public static final String X_SAFETY = "X-Safety";
    private static HashMap<String, String> sConstantMap;

    public static class HeaderXApp {
        public static final String X_APP = "X-APP";

        public static HashMap<String, String> buildHeader(Context context, IBizHeaderManager iBizHeaderManager) {
            HashMap<String, String> mapNewHashMap = Maps.newHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("hostPackage", context.getPackageName());
                jSONObject.put("hostVersion", ApkInfoHelper.getVersionCode(context));
                jSONObject.put("ucVersion", ApkInfoHelper.getUcVersion(context));
                jSONObject.put("ucPackage", ApkInfoHelper.getUcPackage(context));
                jSONObject.put("acVersion", ApkInfoHelper.getAcVersion(context));
                jSONObject.put("acPackage", ApkInfoHelper.getAcPackage(context));
                jSONObject.put("fromHT", SpeechConstant.TRUE_STR);
                jSONObject.put("overseaClient", String.valueOf(UCRuntimeEnvironment.sIsExp));
                jSONObject.put("appPackage", iBizHeaderManager.fromPkg(context));
                jSONObject.put("deviceId", iBizHeaderManager.userDeviceID());
                jSONObject.put(SpeechConstant.KEY_APP_VERSION, iBizHeaderManager.fromPkgVersion(context, context.getPackageName()));
                jSONObject.put("registerId", iBizHeaderManager.pushId());
                jSONObject.put("instantVersion", iBizHeaderManager.instantVerson());
                jSONObject.put("payVersion", ApkInfoHelper.getPayApkVersionCode(context));
                jSONObject.put("foldMode", UCDeviceInfoUtil.getFoldMode(context));
                Map<String, String> appMap = iBizHeaderManager.getAppMap();
                if (appMap != null) {
                    for (Map.Entry<String, String> entry : appMap.entrySet()) {
                        if (!StringUtil.isEmpty(entry.getKey()) && !StringUtil.isEmpty(entry.getValue())) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                mapNewHashMap.put(X_APP, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (UnsupportedEncodingException | JSONException e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
            }
            return mapNewHashMap;
        }
    }

    public static class HeaderXContext {
        public static final String X_CONTEXT = "X-Context";

        public static HashMap<String, String> buildHeader(Context context) {
            HashMap<String, String> mapNewHashMap = Maps.newHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("country", UCOSVersionUtil.getCurRegion());
                jSONObject.put("maskRegion", UCDeviceInfoUtil.getRegionMark());
                jSONObject.put(ConnectIdLogic.PARAM_TIMEZONE, Calendar.getInstance().getTimeZone().getID());
                jSONObject.put(CityBean.LOCALE, Locale.getDefault().toString());
                mapNewHashMap.put(X_CONTEXT, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (UnsupportedEncodingException | JSONException e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
            }
            return mapNewHashMap;
        }
    }

    public static class HeaderXDevice extends JSONObject {
        public static final String X_DEVICE = "X-Device-Info";

        public static HashMap<String, String> buildHeader(Context context) {
            HashMap<String, String> mapNewHashMap = Maps.newHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("model", UCDeviceInfoUtil.getModel());
                jSONObject.put("ht", DisplayUtil.getRealScreenHeight(context));
                jSONObject.put(DeepLinkInterpreter.KEY_SEARCH_WD, DisplayUtil.getRealScreenWidth(context));
                jSONObject.put("brand", UCDeviceInfoUtil.getBrand());
                jSONObject.put("hardwareType", UCDeviceTypeFactory.getDeviceType(context));
                jSONObject.put(SportDeviceConnectionActivity.BUNDLE_NFC, UCDeviceInfoUtil.hasNfcFeature(context));
                jSONObject.put("lsd", UCDeviceInfoUtil.isLargeScreenDevice(context));
                mapNewHashMap.put(X_DEVICE, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (UnsupportedEncodingException | JSONException e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
            }
            return mapNewHashMap;
        }
    }

    public static class HeaderXLocation {
        private static final String KEY_LAST_LOCATION = "last_location_info";
        private static final String LATITUDE = "latitude";
        private static final String LONGITUDE = "longitude";
        public static final String X_LOCATION = "X-Location";

        /* JADX INFO: Access modifiers changed from: private */
        public static HashMap<String, String> buildHeader(Context context) {
            HashMap<String, String> mapNewHashMap = Maps.newHashMap();
            try {
                JSONObject jSONObject = new JSONObject(SPreferenceCommonHelper.getString(context, "last_location_info"));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("latitude", jSONObject.optString("latitude"));
                jSONObject2.put("longitude", jSONObject.optString("longitude"));
                mapNewHashMap.put(X_LOCATION, URLEncoder.encode(jSONObject2.toString(), "utf-8"));
            } catch (Exception e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
            }
            return mapNewHashMap;
        }
    }

    public static class HeaderXProtocol {
        public static final String X_PROTOCOL = "X-Protocol";
        public String key;
        public String sessionTicket;

        public static String buildHeader(Context context, String str, String str2, String str3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(UCCommonXor8Provider.getProviderKeyXor8(), str);
                jSONObject.put("iv", str3);
                jSONObject.put("sessionTicket", str2);
                return URLEncoder.encode(jSONObject.toString(), "utf-8");
            } catch (UnsupportedEncodingException | JSONException e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
                return "";
            }
        }
    }

    public static class HeaderXSDK {
        private static final int HEADER_REVISED_VERSION = 1;
        public static final String SDK_NAME = "UCBasic";
        public static final String X_SDK = "X-SDK";

        public static HashMap<String, String> buildHeader() {
            HashMap<String, String> mapNewHashMap = Maps.newHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdkName", SDK_NAME);
                jSONObject.put("sdkBuildTime", BuildConfig.SDK_BUILD_TIME);
                jSONObject.put(sbe.PAY_SDK_VERSION_NAME, BuildConfig.ucbasicVersion);
                jSONObject.put("headerRevisedVersion", 1);
                mapNewHashMap.put(X_SDK, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
            }
            return mapNewHashMap;
        }
    }

    public static class HeaderXSystem {
        public static final String X_SYSTEM = "X-Sys";
        private static JSONObject sConstantJSONObject;
        private static HashMap<String, String> xSys;

        public static HashMap<String, String> buildHeader(Context context, IBizHeaderManager iBizHeaderManager) {
            if (xSys == null) {
                xSys = Maps.newHashMap();
            }
            if (sConstantJSONObject == null) {
                JSONObject jSONObject = new JSONObject();
                sConstantJSONObject = jSONObject;
                try {
                    jSONObject.put("romVersion", UCOSVersionUtil.getOsVersion());
                    sConstantJSONObject.put("osVersion", UCDeviceInfoUtil.getOsVersionRelease());
                    sConstantJSONObject.put("androidVersion", UCDeviceInfoUtil.getOsVersionSDK());
                    sConstantJSONObject.put("osVersionCode", UCOSVersionUtil.getOSVersionCode());
                    sConstantJSONObject.put("osBuildTime", UCDeviceInfoUtil.getBuildTime());
                    sConstantJSONObject.put(TriggerEvent.EXTRA_UID, String.valueOf(MultiUserUtil.getUserId()));
                    if (iBizHeaderManager != null) {
                        sConstantJSONObject.put("usn", String.valueOf(iBizHeaderManager.getSerialNumberForUser(context)));
                    }
                    sConstantJSONObject.put("utype", MultiUserUtil.getUserType(context));
                    sConstantJSONObject.put("betaEnv", UCDeviceInfoUtil.checkBetaEnv(context));
                    sConstantJSONObject.put("rpname", UCDeviceInfoUtil.getRomProductName());
                    sConstantJSONObject.put("rotaver", UCDeviceInfoUtil.getRomBuildOtaVersion());
                    xSys.put(X_SYSTEM, URLEncoder.encode(sConstantJSONObject.toString(), "utf-8"));
                } catch (UnsupportedEncodingException | JSONException e2) {
                    UCLogUtil.e(UCHeaderHelperV2.TAG, e2);
                }
            }
            try {
                if (!sConstantJSONObject.has("guid") && !sConstantJSONObject.has(HttpConst.APID)) {
                    UcOpenIdHeaderHelper ucOpenIdHeaderHelper = new UcOpenIdHeaderHelper(iBizHeaderManager);
                    ucOpenIdHeaderHelper.getOpenIdHeader(context);
                    if (!StringUtil.isEmpty(ucOpenIdHeaderHelper.getGUID()) || !StringUtil.isEmpty(ucOpenIdHeaderHelper.getAPID())) {
                        sConstantJSONObject.put(HttpConst.AUID, ucOpenIdHeaderHelper.getAUID());
                        sConstantJSONObject.put("ouid", ucOpenIdHeaderHelper.getOUID());
                        sConstantJSONObject.put("duid", ucOpenIdHeaderHelper.getDUID());
                        sConstantJSONObject.put("guid", ucOpenIdHeaderHelper.getGUID());
                        sConstantJSONObject.put(HttpConst.APID, ucOpenIdHeaderHelper.getAPID());
                        xSys.put(X_SYSTEM, URLEncoder.encode(sConstantJSONObject.toString(), "utf-8"));
                    }
                }
            } catch (UnsupportedEncodingException | JSONException e3) {
                UCLogUtil.e(UCHeaderHelperV2.TAG, e3);
            }
            return xSys;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x000e, B:11:0x003c, B:10:0x0014), top: B:17:0x0005 }] */
    public static synchronized HashMap<String, String> buildHeader(Context context, IBizHeaderManager iBizHeaderManager) {
        HashMap<String, String> map;
        if (iBizHeaderManager == null) {
            iBizHeaderManager = new UCDefaultBizHeader();
            map = sConstantMap;
            if (map != null || map.size() == 0) {
                HashMap<String, String> mapNewHashMap = Maps.newHashMap();
                sConstantMap = mapNewHashMap;
                mapNewHashMap.putAll(HeaderXDevice.buildHeader(context));
                sConstantMap.putAll(HeaderXContext.buildHeader(context));
                sConstantMap.putAll(HeaderXSDK.buildHeader());
                sConstantMap.putAll(HeaderXLocation.buildHeader(context));
            }
            sConstantMap.putAll(HeaderXSystem.buildHeader(context, iBizHeaderManager));
            sConstantMap.put("accept-language", UCDeviceInfoUtil.getLanguageTag());
            sConstantMap.put(X_SAFETY, DeviceSecurityHeader.getDeviceSecurityHeader(context, iBizHeaderManager));
            sConstantMap.putAll(HeaderXApp.buildHeader(context, iBizHeaderManager));
            sConstantMap.put(X_OP_UPGRADE, SpeechConstant.TRUE_STR);
        } else {
            map = sConstantMap;
            if (map != null) {
                HashMap<String, String> mapNewHashMap2 = Maps.newHashMap();
                sConstantMap = mapNewHashMap2;
                mapNewHashMap2.putAll(HeaderXDevice.buildHeader(context));
                sConstantMap.putAll(HeaderXContext.buildHeader(context));
                sConstantMap.putAll(HeaderXSDK.buildHeader());
                sConstantMap.putAll(HeaderXLocation.buildHeader(context));
            } else {
                HashMap<String, String> mapNewHashMap3 = Maps.newHashMap();
                sConstantMap = mapNewHashMap3;
                mapNewHashMap3.putAll(HeaderXDevice.buildHeader(context));
                sConstantMap.putAll(HeaderXContext.buildHeader(context));
                sConstantMap.putAll(HeaderXSDK.buildHeader());
                sConstantMap.putAll(HeaderXLocation.buildHeader(context));
            }
            sConstantMap.putAll(HeaderXSystem.buildHeader(context, iBizHeaderManager));
            sConstantMap.put("accept-language", UCDeviceInfoUtil.getLanguageTag());
            sConstantMap.put(X_SAFETY, DeviceSecurityHeader.getDeviceSecurityHeader(context, iBizHeaderManager));
            sConstantMap.putAll(HeaderXApp.buildHeader(context, iBizHeaderManager));
            sConstantMap.put(X_OP_UPGRADE, SpeechConstant.TRUE_STR);
        }
        throw th;
        return sConstantMap;
    }
}
