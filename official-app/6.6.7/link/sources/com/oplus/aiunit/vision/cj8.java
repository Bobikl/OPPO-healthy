package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class cj8 {

    public static final class a {
        public static String b(Context context, String str) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (Exception unused) {
                return "";
            }
        }

        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                String packageName = context.getPackageName();
                linkedHashMap.put("hostPackage", packageName);
                linkedHashMap.put("hostVersion", b(context, packageName));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return linkedHashMap;
        }
    }

    public static final class b {
        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("country", nke.e());
                jSONObject.put("maskRegion", "");
                jSONObject.put("timeZone", Calendar.getInstance().getTimeZone().getID());
                jSONObject.put("locale", Locale.getDefault().toString());
                linkedHashMap.put("X-Context", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return linkedHashMap;
        }
    }

    public static final class c {
        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("ht", rv5.a(context.getApplicationContext()));
                jSONObject.put("wd", rv5.b(context.getApplicationContext()));
                jSONObject.put("brand", Build.BRAND);
                jSONObject.put("hardwareType", oi5.c(context.getApplicationContext()));
                linkedHashMap.put("X-Device-Info", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return linkedHashMap;
        }
    }

    public static final class d {
        @NotNull
        public static String b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("imei", "");
                jSONObject.put("mac", "");
                jSONObject.put("serialNum", "");
                jSONObject.put("hasPermission", "");
                jSONObject.put("wifissid", "");
                jSONObject.put("deviceName", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }

        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("X-Safety", b());
            return linkedHashMap;
        }
    }

    public static final class e {
        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                linkedHashMap.put("X-SDK", URLEncoder.encode(new JSONObject().toString(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return linkedHashMap;
        }
    }

    public static final class f {
        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("romVersion", nke.c());
                jSONObject.put("osVersion", nke.h());
                jSONObject.put("androidVersion", nke.i());
                jSONObject.put("osVersionCode", nke.g());
                jSONObject.put("osBuildTime", nke.b());
                jSONObject.put(rde.PAY_SDK_OUID, "");
                jSONObject.put("auid", "");
                jSONObject.put("duid", "");
                jSONObject.put(rde.PAY_SDK_GUID, "");
                jSONObject.put("apid", "");
                linkedHashMap.put("X-Sys", URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return linkedHashMap;
        }
    }

    public static Map<String, String> a(@NotNull Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(new d().a(context));
        linkedHashMap.putAll(new f().a(context));
        linkedHashMap.putAll(new b().a(context));
        linkedHashMap.putAll(new c().a(context));
        linkedHashMap.putAll(new e().a(context));
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
