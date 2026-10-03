package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class dj8 {

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
            } catch (Exception e) {
                y8b.d("HeaderHelper", "HeaderXAPP: " + e.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class b {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("country", mke.e());
                jSONObject.put("maskRegion", pi5.g());
                jSONObject.put("timeZone", Calendar.getInstance().getTimeZone().getID());
                jSONObject.put("locale", Locale.getDefault().toString());
                linkedHashMap.put("X-Context", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                y8b.d("HeaderHelper", "HeaderXContext: " + e.getMessage());
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
                jSONObject.put("ht", qv5.a(context.getApplicationContext()));
                jSONObject.put("wd", qv5.b(context.getApplicationContext()));
                jSONObject.put("brand", Build.BRAND);
                jSONObject.put("hardwareType", pi5.c(context.getApplicationContext()));
                linkedHashMap.put("X-Device-Info", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                y8b.d("HeaderHelper", "HeaderXDeviceInfo: " + e.getMessage());
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
                linkedHashMap.put("X-SDK", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                y8b.d("HeaderHelper", "HeaderXSdk: " + e.getMessage());
            }
            return linkedHashMap;
        }
    }

    public static final class e {
        public Map<String, String> a(Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("romVersion", mke.c());
                jSONObject.put("osVersion", mke.h());
                jSONObject.put("androidVersion", mke.i());
                jSONObject.put("osVersionCode", mke.g());
                jSONObject.put("osBuildTime", mke.b());
                jSONObject.put(rde.PAY_SDK_OUID, pi5.e());
                jSONObject.put("auid", "");
                jSONObject.put("duid", "");
                jSONObject.put(rde.PAY_SDK_GUID, pi5.d());
                jSONObject.put("apid", "");
                linkedHashMap.put("X-Sys", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                y8b.d("HeaderHelper", "HeaderXSystem: " + e.getMessage());
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
        sb.append('-');
        sb.append(locale.getCountry());
        linkedHashMap.put("Accept-Language", sb.toString());
        return linkedHashMap;
    }
}
