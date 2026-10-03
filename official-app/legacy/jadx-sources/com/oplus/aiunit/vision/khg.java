package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.health.core.operation.IOperationDeviceInfoService;
import com.heytap.health.router.RouterActivity;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes16.dex */
public class khg {
    public static final String KEY_SHOW_PROGRESS = "showProgress";
    public static IOperationDeviceInfoService a;

    public static String a(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str2);
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        if (str.contains(str2 + HttpUtils.EQUAL_SIGN)) {
            return str;
        }
        return str + e(str) + str2 + HttpUtils.EQUAL_SIGN + queryParameter;
    }

    public static Bundle b(Bundle bundle) {
        if (a == null) {
            a = (IOperationDeviceInfoService) x0.d().b("/device_settings/connect/operation").navigation();
        }
        if (!TextUtils.isEmpty(a.P7())) {
            bundle.putString("currentMac", a.P7());
        }
        if (bundle.containsKey("needModel") && !TextUtils.isEmpty(a.e6())) {
            bundle.putString("model", a.e6());
        }
        if (bundle.containsKey("needSoftVersion") && !TextUtils.isEmpty(a.I9())) {
            bundle.putString("softVersion", a.I9());
        }
        if (bundle.containsKey("needBleMac") && !TextUtils.isEmpty(a.ab())) {
            bundle.putString("ble_mac", a.ab());
        }
        if (bundle.containsKey("isConnected")) {
            bundle.putBoolean("isConnected", bundle.getString("isConnected").equalsIgnoreCase(SpeechConstant.TRUE_STR));
        }
        if (bundle.containsKey("needConnectionState")) {
            bundle.putInt("connectionState", a.c3());
        }
        if (bundle.containsKey("needDeviceName")) {
            bundle.putString(ServiceNodeBundleKeys.DEVICE_NAME, a.D5());
        }
        if (bundle.containsKey("needDeviceIcon")) {
            bundle.putParcelable("deviceIcon", a.I5());
        }
        if (bundle.containsKey("needDeviceIconPath")) {
            bundle.putString("deviceIconPath", a.P1());
        }
        if (bundle.containsKey("needOtaVersion")) {
            bundle.putString(HttpConst.OTA_VERSION, a.k5());
        }
        if (bundle.containsKey("needDeviceType")) {
            bundle.putInt("deviceType", a.j9());
        }
        if (bundle.containsKey("needDeviceUniqueId")) {
            bundle.putString(t04.DEVICE_UNIQUE_ID, a.e1());
        }
        if (bundle.containsKey("needHardwareVersion")) {
            bundle.putString("hardwareVersion", a.s7());
        }
        if (bundle.containsKey("needDeviceSn")) {
            bundle.putString("deviceSn", a.m8());
        }
        if (bundle.containsKey("needDeviceImei")) {
            bundle.putString("imei", a.V9());
        }
        if (bundle.containsKey("needDeviceBleSecret")) {
            bundle.putString("bleSecretMetadata", a.m3());
        }
        if (bundle.containsKey("needAppTerminalId")) {
            bundle.putString("appTerminalId", a.ca());
        }
        if (bundle.containsKey("needDeviceBindingTime")) {
            bundle.putLong("bindingTime", a.O7());
        }
        if (bundle.containsKey("needDeviceSku")) {
            bundle.putString("sku", a.f0());
        }
        if (bundle.containsKey("needDeviceSkuCode")) {
            bundle.putString(e36.PARAM_SKU_CODE, a.Ha());
        }
        if (bundle.containsKey("needDeviceManageIdImage")) {
            bundle.putString("deviceManageIdImage", a.z8());
        }
        if (bundle.containsKey("needDeviceMarketMode")) {
            bundle.putInt("marketMode", a.S8());
        }
        if (bundle.containsKey("needMarketModeTimestamp")) {
            bundle.putLong("marketModeTimestamp", a.i3());
        }
        if (bundle.containsKey("needProjectId")) {
            bundle.putString("projectId", a.ma());
        }
        if (bundle.containsKey("needBoardId")) {
            bundle.putString("boardId", a.u2());
        }
        if (bundle.containsKey("needSubDeviceType")) {
            bundle.putInt("subDeviceType", a.J1());
        }
        if (bundle.containsKey("needDeviceOsVersion")) {
            bundle.putString("deviceOsVersion", a.b7());
        }
        if (bundle.containsKey("needDeviceMarketName")) {
            bundle.putString("deviceMarketName", a.n8());
        }
        if (bundle.containsKey("needSkuMarketName")) {
            bundle.putString("skuMarketName", a.q4());
        }
        if (bundle.containsKey("needConnectionState")) {
            bundle.putInt("connectionState", a.c3());
        }
        if (bundle.containsKey("needCapacityPercent")) {
            bundle.putInt("capacityPercent", a.va());
        }
        if (bundle.containsKey("needClickable")) {
            bundle.putBoolean(ViewEntity.CLICKABLE, a.xa());
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044 A[PHI: r2
  0x0044: PHI (r2v18 java.lang.String) = (r2v7 java.lang.String), (r2v8 java.lang.String) binds: [B:9:0x0042, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    public static Bundle c(Uri uri) {
        String str;
        Bundle bundle = new Bundle();
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            return bundle;
        }
        String strSubstring = string.substring(string.indexOf("?") + 1, string.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return bundle;
        }
        String strReplaceAll = strSubstring.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        sb.append("queryUri = ");
        sb.append(strReplaceAll);
        String str2 = NetWorkOfficeWebViewActivity.EXTRA_WEBSITE;
        if (!strReplaceAll.contains(NetWorkOfficeWebViewActivity.EXTRA_WEBSITE)) {
            str2 = "jumpUrl";
            str = strReplaceAll.contains("jumpUrl") ? str2 : "";
        }
        if (!TextUtils.isEmpty(str)) {
            String strD = d(uri, strReplaceAll.substring(strReplaceAll.indexOf(str) + str.length() + 1));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("paramBundleMapping: jumpUrl = ");
            sb2.append(strD);
            bundle.putString(str, strD);
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.indexOf(str));
        }
        if (TextUtils.isEmpty(strReplaceAll)) {
            return bundle;
        }
        String[] strArrSplit = strReplaceAll.split("&");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            String strSubstring2 = str3.substring(0, str3.indexOf(HttpUtils.EQUAL_SIGN));
            String str4 = strArrSplit[i];
            String strSubstring3 = str4.substring(str4.indexOf(HttpUtils.EQUAL_SIGN) + 1, strArrSplit[i].length());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strSubstring2);
            sb3.append(" = ");
            sb3.append(strSubstring3);
            bundle.putString(strSubstring2, strSubstring3);
        }
        return bundle.containsKey(pfg.NEED_MAC) ? b(bundle) : bundle;
    }

    public static String d(Uri uri, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("urlAddTrackParam:uri = ");
        sb.append(uri.toString());
        return (str.contains(zv8.H5_PATH) || uri.toString().contains("healthap://app/path=113?")) ? a(uri, a(uri, a(uri, a(uri, str, RouterActivity.VISIT_FROM), "vfm"), "vfc"), "vfs") : str;
    }

    public static String e(String str) {
        return str.contains("?") ? "&" : "?";
    }
}
