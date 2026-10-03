package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class ai8 {

    public static final class a {
        public static String b(Context context, String str) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (Exception unused) {
                return "";
            }
        }

        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                String packageName = context.getPackageName();
                linkedHashMap.put("hostPackage", packageName);
                linkedHashMap.put("hostVersion", b(context, packageName));
            } catch (Exception e2) {
                m7b.d("HeaderHelper", "HeaderXAPP: " + e2.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class b {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("country", eie.e());
                jSONObject.put("maskRegion", th5.g());
                jSONObject.put(ConnectIdLogic.PARAM_TIMEZONE, Calendar.getInstance().getTimeZone().getID());
                jSONObject.put(CityBean.LOCALE, Locale.getDefault().toString());
                linkedHashMap.put(UCHeaderHelperV2.HeaderXContext.X_CONTEXT, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                m7b.d("HeaderHelper", "HeaderXContext: " + e2.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class c {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("ht", su5.a(context.getApplicationContext()));
                jSONObject.put(DeepLinkInterpreter.KEY_SEARCH_WD, su5.b(context.getApplicationContext()));
                jSONObject.put("brand", Build.BRAND);
                jSONObject.put("hardwareType", th5.c(context.getApplicationContext()));
                linkedHashMap.put(UCHeaderHelperV2.HeaderXDevice.X_DEVICE, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                m7b.d("HeaderHelper", "HeaderXDeviceInfo: " + e2.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class d {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("web_version_name", "1.0.19");
                jSONObject.put("web_version_code", "10019");
                linkedHashMap.put(UCHeaderHelperV2.HeaderXSDK.X_SDK, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                m7b.d("HeaderHelper", "HeaderXSdk: " + e2.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class e {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("romVersion", eie.c());
                jSONObject.put("osVersion", eie.h());
                jSONObject.put("androidVersion", eie.i());
                jSONObject.put("osVersionCode", eie.g());
                jSONObject.put("osBuildTime", eie.b());
                jSONObject.put("ouid", th5.e());
                jSONObject.put(HttpConst.AUID, "");
                jSONObject.put("duid", "");
                jSONObject.put("guid", th5.d());
                jSONObject.put(HttpConst.APID, "");
                linkedHashMap.put(UCHeaderHelperV2.HeaderXSystem.X_SYSTEM, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                m7b.d("HeaderHelper", "HeaderXSystem: " + e2.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static Map<String, String> a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(new e().a(context));
        linkedHashMap.putAll(new b().a(context));
        linkedHashMap.putAll(new c().a(context));
        linkedHashMap.putAll(new d().a(context));
        linkedHashMap.putAll(new a().a(context));
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.getDefault();
        sb.append(locale.getLanguage());
        sb.append(Soundex.SILENT_MARKER);
        sb.append(locale.getCountry());
        linkedHashMap.put("Accept-Language", sb.toString());
        return linkedHashMap;
    }
}
