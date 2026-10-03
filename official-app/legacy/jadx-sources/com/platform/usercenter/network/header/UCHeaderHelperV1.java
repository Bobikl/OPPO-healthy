package com.platform.usercenter.network.header;

import android.content.Context;
import android.util.Base64;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.algorithm.Base64Helper;
import com.platform.usercenter.tools.datastructure.Maps;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.device.UCDeviceTypeFactory;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.net.NetInfoHelper;
import com.platform.usercenter.tools.os.MultiUserUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.tools.ui.DisplayUtil;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class UCHeaderHelperV1 {
    public static final String DEFAULT_NULL = "";
    public static final String HEADER_ACCEPT_LANGUAGE = "accept-language";
    public static final String HEADER_APP = "Ext-App";
    public static final String HEADER_INSTANT_VERSION = "Ext-Instant-Version";
    public static final String HEADER_MOBILE = "Ext-Mobile";
    public static final String HEADER_SYSTEM = "Ext-System";

    @Deprecated
    public static final String HEADER_USER = "Ext-USER";
    public static final String HEADER_X_BUSINESS_SYSTEM = "X-BusinessSystem";
    public static final String HEADER_X_CLIENT_COLOR_OSVERSION = "X-Client-HTOSVersion";
    public static final String HEADER_X_CLIENT_COUNTRY = "X-Client-Country";
    public static final String HEADER_X_CLIENT_DEVICE = "X-Client-Device";

    @Deprecated
    public static final String HEADER_X_CLIENT_DEVICE_NAME = "X-Client-DeviceName";
    public static final String HEADER_X_CLIENT_LOCALE = "X-Client-Locale";
    public static final String HEADER_X_CLIENT_PACKAGE = "X-Client-package";
    public static final String HEADER_X_CLIENT_REGISTER_ID = "X-Client-Registerid";
    public static final String HEADER_X_CLIENT_TIME_ZONE = "X-Client-Timezone";

    @Deprecated
    public static final String HEADER_X_CLIENT_WIFISSID = "X-Client-Wifissid";
    public static final String HEADER_X_DEVICE = "X-Device";
    public static final String HEADER_X_FROM_HT = "X-From-HT";
    public static final String HEADER_X_I_V = "X-I-V";
    public static final String HEADER_X_KEY = UCCommonXor8Provider.getProviderXKeyXor8();
    public static final String HEADER_X_SECURITY = "X-Security";
    public static final String HEADER_X_SYSTEM = "X-System";

    private static Map<String, String> buildCommonHeader(Context context, IBizHeaderManager iBizHeaderManager) {
        HashMap mapNewHashMap = Maps.newHashMap();
        mapNewHashMap.put("Ext-System", createExtSystem(context, iBizHeaderManager));
        mapNewHashMap.put("Ext-Mobile", createExtMobile(false, context, iBizHeaderManager));
        mapNewHashMap.put("accept-language", UCDeviceInfoUtil.getLanguageTag());
        mapNewHashMap.put("X-From-HT", SpeechConstant.TRUE_STR);
        mapNewHashMap.put("X-Client-package", context.getPackageName());
        mapNewHashMap.put("X-Client-Country", UCDeviceInfoUtil.getCurRegion());
        mapNewHashMap.put("X-Client-Locale", Locale.getDefault().toString());
        mapNewHashMap.put("X-Client-Timezone", Calendar.getInstance().getTimeZone().getID());
        mapNewHashMap.put("X-Client-HTOSVersion", String.valueOf(UCRuntimeEnvironment.mRomVersionCode));
        mapNewHashMap.put("X-BusinessSystem", UCRuntimeEnvironment.getXBusinessSystem());
        mapNewHashMap.put("X-Security", DeviceSecurityHeader.getDeviceSecurityHeader(context, iBizHeaderManager));
        mapNewHashMap.put("X-System", createXSystem(context, iBizHeaderManager));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DeepLinkInterpreter.KEY_SEARCH_WD, DisplayUtil.getRealScreenWidth(context));
            jSONObject.put("ht", DisplayUtil.getRealScreenHeight(context));
            jSONObject.put("devicetype", UCDeviceTypeFactory.getDeviceType(context));
            mapNewHashMap.put("X-Device", Base64Helper.base64Encode(jSONObject.toString()));
        } catch (JSONException unused) {
        }
        return mapNewHashMap;
    }

    public static synchronized Map<String, String> buildHeader(Context context, IBizHeaderManager iBizHeaderManager) {
        HashMap mapNewHashMap;
        if (iBizHeaderManager == null) {
            iBizHeaderManager = new UCDefaultBizHeader();
        }
        mapNewHashMap = Maps.newHashMap();
        mapNewHashMap.putAll(buildCommonHeader(context, iBizHeaderManager));
        mapNewHashMap.put("X-Client-Device", iBizHeaderManager.userDeviceID());
        mapNewHashMap.put("X-Client-Registerid", iBizHeaderManager.pushId());
        mapNewHashMap.put("Ext-Instant-Version", String.valueOf(iBizHeaderManager.instantVerson()));
        mapNewHashMap.put("Ext-App", iBizHeaderManager.extApp());
        return mapNewHashMap;
    }

    public static String createExtApp(Context context, String str, int i, String str2) {
        return str + "/" + i + "/" + str2;
    }

    public static String createExtMobile(boolean z, Context context, IBizHeaderManager iBizHeaderManager) {
        String serialNum = iBizHeaderManager != null ? iBizHeaderManager.getSerialNum() : "";
        StringBuilder sb = new StringBuilder();
        if (!z) {
            serialNum = "";
        }
        sb.append(serialNum);
        sb.append("/");
        sb.append("");
        sb.append("/");
        sb.append("");
        sb.append("/");
        sb.append(UCRuntimeEnvironment.sIsExp ? "0" : "1");
        sb.append("/");
        sb.append(UCDeviceInfoUtil.getCurRegion());
        return sb.toString();
    }

    public static String createExtSystem(Context context, IBizHeaderManager iBizHeaderManager) {
        String operators = iBizHeaderManager != null ? iBizHeaderManager.getOperators(context) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(UCDeviceInfoUtil.getModel());
        sb.append("/");
        sb.append(UCDeviceInfoUtil.getOsVersionRelease());
        sb.append("/");
        sb.append(UCRuntimeEnvironment.sIsExp ? "" : Integer.valueOf(NetInfoHelper.getNetTypeId(context)));
        sb.append("/");
        sb.append(UCRuntimeEnvironment.sIsExp ? "" : UCDeviceInfoUtil.getManufactureBySystemInfo());
        sb.append("/");
        sb.append(UCOSVersionUtil.getOsVersion());
        sb.append("/");
        sb.append(operators);
        sb.append("/");
        sb.append(ApkInfoHelper.getVersionCode(context));
        sb.append("/");
        return sb.toString();
    }

    public static String createXSystem(Context context, IBizHeaderManager iBizHeaderManager) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(TriggerEvent.EXTRA_UID, String.valueOf(MultiUserUtil.getUserId()));
            if (iBizHeaderManager != null) {
                jSONObject.putOpt("usn", String.valueOf(iBizHeaderManager.getSerialNumberForUser(context)));
            }
            jSONObject.putOpt("utype", MultiUserUtil.getUserType(context));
            jSONObject.put("rpname", UCDeviceInfoUtil.getRomProductName());
            jSONObject.put("rotaver", UCDeviceInfoUtil.getRomBuildOtaVersion());
            return Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2);
        } catch (JSONException e2) {
            UCLogUtil.e(e2);
            return null;
        }
    }
}
