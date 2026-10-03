package com.platform.usercenter.network.header;

import android.content.Context;
import android.util.Base64;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.net.NetInfoHelper;
import com.platform.usercenter.tools.os.MultiUserUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public class UCHeaderHelper {
    private static final String DEFAULT_NULL = "";
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
    public static final String HEADER_X_SECURITY = "X-Security";
    public static final String HEADER_X_SYSTEM = "X-System";

    public static String createExtApp(Context context) {
        if (context == null) {
            return "";
        }
        return "/" + ApkInfoHelper.getVersionCode(context) + "/" + context.getApplicationContext().getPackageName();
    }

    public static String createExtMobile(Context context, boolean z, IBizHeaderManager iBizHeaderManager) {
        String serialNum = iBizHeaderManager != null ? iBizHeaderManager.getSerialNum() : "";
        StringBuilder sb = new StringBuilder();
        if (z) {
            serialNum = "";
        }
        sb.append(serialNum);
        sb.append("/");
        sb.append("");
        sb.append("/");
        sb.append("");
        sb.append("/");
        sb.append(z ? "0" : "1");
        sb.append("/");
        sb.append(UCOSVersionUtil.getCurRegion());
        return sb.toString();
    }

    public static String createExtSystem(Context context, boolean z, IBizHeaderManager iBizHeaderManager) {
        String operators = iBizHeaderManager != null ? iBizHeaderManager.getOperators(context) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(UCDeviceInfoUtil.getModel());
        sb.append("/");
        sb.append(z ? "" : UCDeviceInfoUtil.getAndroidVersion());
        sb.append("/");
        sb.append(z ? "" : Integer.valueOf(NetInfoHelper.getNetTypeId(context)));
        sb.append("/");
        sb.append(z ? "" : UCDeviceInfoUtil.getManufacture());
        sb.append("/");
        sb.append(z ? "" : UCOSVersionUtil.getOsVersion());
        sb.append("/");
        sb.append(z ? "" : operators);
        sb.append("/");
        sb.append(ApkInfoHelper.getVersionCode(context));
        sb.append("/");
        return sb.toString();
    }

    public static String createExtUser(Context context, boolean z, IBizHeaderManager iBizHeaderManager) {
        if (context == null || iBizHeaderManager == null) {
            return "";
        }
        String imei = iBizHeaderManager.getImei(context);
        return (!StringUtil.isEmpty(imei) && z) ? MD5Util.md5Hex(imei) : imei;
    }

    @Deprecated
    public static String createXSystem(Context context, IBizHeaderManager iBizHeaderManager) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(TriggerEvent.EXTRA_UID, String.valueOf(MultiUserUtil.getUserId()));
            if (iBizHeaderManager != null) {
                jSONObject.putOpt("usn", String.valueOf(iBizHeaderManager.getSerialNumberForUser(context)));
            }
            jSONObject.putOpt("utype", MultiUserUtil.getUserType(context));
            return Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2);
        } catch (JSONException e2) {
            UCLogUtil.e(e2);
            return null;
        }
    }

    @Deprecated
    public static String getHeaderXBusinessSystem(boolean z) {
        return z ? UCCommonXor8Provider.getBrandOrange() : UCCommonXor8Provider.getBrandGreen();
    }

    public static HashMap<String, String> getHeaders(Context context) throws Exception {
        return getHeaders(context, null);
    }

    public static HashMap<String, String> getHeaders(Context context, IBizHeaderManager iBizHeaderManager) throws Exception {
        boolean z = UCRuntimeEnvironment.sIsExp;
        HashMap<String, String> map = new HashMap<>();
        String strCreateExtSystem = createExtSystem(context, z, iBizHeaderManager);
        String strCreateExtUser = createExtUser(context, z, iBizHeaderManager);
        String strCreateExtApp = createExtApp(context);
        String strCreateExtMobile = createExtMobile(context, z, iBizHeaderManager);
        map.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        map.put("Ext-System", strCreateExtSystem);
        map.put("Ext-USER", strCreateExtUser);
        map.put("Ext-App", strCreateExtApp);
        map.put("Ext-Mobile", strCreateExtMobile);
        int oSVersionCode = UCOSVersionUtil.getOSVersionCode();
        map.put("accept-language", UCDeviceInfoUtil.getLanguageTag());
        map.put("X-BusinessSystem", UCRuntimeEnvironment.getXBusinessSystem());
        map.put("X-Client-HTOSVersion", String.valueOf(oSVersionCode));
        map.put("X-Client-Country", UCOSVersionUtil.getCurRegion());
        map.put("X-Client-Locale", Locale.getDefault().toString());
        map.put("X-Client-Timezone", Calendar.getInstance().getTimeZone().getID());
        return map;
    }
}
