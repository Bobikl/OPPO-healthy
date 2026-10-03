package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class zh8 {

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
            } catch (Exception e2) {
                e2.printStackTrace();
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
                jSONObject.put("country", fie.e());
                jSONObject.put("maskRegion", "");
                jSONObject.put(ConnectIdLogic.PARAM_TIMEZONE, Calendar.getInstance().getTimeZone().getID());
                jSONObject.put(CityBean.LOCALE, Locale.getDefault().toString());
                linkedHashMap.put(UCHeaderHelperV2.HeaderXContext.X_CONTEXT, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                e2.printStackTrace();
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
                jSONObject.put("ht", tu5.a(context.getApplicationContext()));
                jSONObject.put(DeepLinkInterpreter.KEY_SEARCH_WD, tu5.b(context.getApplicationContext()));
                jSONObject.put("brand", Build.BRAND);
                jSONObject.put("hardwareType", sh5.c(context.getApplicationContext()));
                linkedHashMap.put(UCHeaderHelperV2.HeaderXDevice.X_DEVICE, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                e2.printStackTrace();
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
                jSONObject.put(ServiceNodeBundleKeys.DEVICE_NAME, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return jSONObject.toString();
        }

        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(UCHeaderHelperV2.X_SAFETY, b());
            return linkedHashMap;
        }
    }

    public static final class e {
        @NotNull
        public Map<String, String> a(@NotNull Context context) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                linkedHashMap.put(UCHeaderHelperV2.HeaderXSDK.X_SDK, URLEncoder.encode(new JSONObject().toString(), "utf-8"));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
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
                jSONObject.put("romVersion", fie.c());
                jSONObject.put("osVersion", fie.h());
                jSONObject.put("androidVersion", fie.i());
                jSONObject.put("osVersionCode", fie.g());
                jSONObject.put("osBuildTime", fie.b());
                jSONObject.put("ouid", "");
                jSONObject.put(HttpConst.AUID, "");
                jSONObject.put("duid", "");
                jSONObject.put("guid", "");
                jSONObject.put(HttpConst.APID, "");
                linkedHashMap.put(UCHeaderHelperV2.HeaderXSystem.X_SYSTEM, URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e2) {
                e2.printStackTrace();
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
        sb.append(Soundex.SILENT_MARKER);
        sb.append(locale.getCountry());
        linkedHashMap.put("Accept-Language", sb.toString());
        return linkedHashMap;
    }
}
