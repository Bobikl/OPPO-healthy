package com.oplus.quickgame.sdk.engine.utils;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.jaf;
import com.oplus.aiunit.vision.jqm;
import com.oplus.aiunit.vision.kt2;
import com.oplus.aiunit.vision.lgm;
import com.oplus.aiunit.vision.lmm;
import com.oplus.aiunit.vision.n8n;
import com.oplus.aiunit.vision.r9n;
import com.oplus.aiunit.vision.y4n;
import com.oplus.aiunit.vision.yan;
import com.oplus.aiunit.vision.z5n;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class a {
    public static boolean a = false;
    public static String b = "SP_GameEngineConfig";
    public static String c = "NEW_ENGINE_CONFIG_NATVIE_CACHE_KEY";
    public static String d = "NEW_ENGINE_CONFIG_NATVIE_CACHE_SAVE_DATE";

    public static class a implements Runnable {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.i(this.i);
        }
    }

    public static void b(Context context, String str) {
        context.getSharedPreferences(b, 0).edit().putString(c, str).putLong(d, System.currentTimeMillis()).apply();
    }

    public static boolean c(String str, long j) {
        JSONObject jSONObject;
        String string;
        boolean z;
        String str2;
        try {
            jSONObject = new JSONObject(new JSONObject(str).getString("data"));
            try {
                string = jSONObject.getString("xgame_open_max_interval");
                z = true;
            } catch (JSONException unused) {
                string = "0";
                z = false;
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        if (!z || jSONObject == null) {
            str2 = "快游戏引擎配置检测失败：不符合json格式";
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > j && jCurrentTimeMillis - j <= (Long.parseLong(string) * 60) * 1000) {
                return true;
            }
            str2 = "快游戏引擎配置检测失败：不符合最大有效时间：" + string + "min，return 空";
        }
        y4n.c("QuickGame", str2);
        return false;
    }

    public static String d(Context context) {
        return context.getSharedPreferences(b, 0).getString(c, "");
    }

    public static long e(Context context) {
        return context.getSharedPreferences(b, 0).getLong(d, 0L);
    }

    public static boolean f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("data"));
            String string = jSONObject.getString("xgame_open_imei_range_2");
            String string2 = jSONObject.getString("xgame_open_phone_black_list");
            String string3 = jSONObject.getString("xgame_open_android_version_black_list");
            String string4 = jSONObject.getString("xgame_open_max_interval");
            d.b("xgame_open_imei_range_2", string);
            d.b("xgame_open_phone_black_list", string2);
            d.b("xgame_open_android_version_black_list", string3);
            d.b("xgame_open_max_interval", string4);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static jaf.c g(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, kt2 kt2Var) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "context =null 或者 url=空";
        } else if (!jaf.c(str)) {
            str2 = "传入的url不支持快游戏引擎启动；url" + str;
        } else if (!jaf.b(context)) {
            str2 = "快游戏引擎未安装，不支持引擎启动；";
        } else if (!jaf.e(context)) {
            str2 = "游戏引擎配置检索失败，不支持引擎启动；";
        } else if (!jaf.d(context)) {
            str2 = "快游戏引擎配置不持支本次引擎启动；请检索日志QgRouterManager";
        } else {
            if (map != null) {
                jaf.a aVarA = jaf.a(map.get("origin"), map.get("secret"));
                aVarA.g(str);
                aVarA.f(kt2Var);
                if (erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(map2.get("sgtp"))) {
                    aVarA.h();
                }
                z5n.n(map, 0, aVarA);
                z5n.n(map2, 1, aVarA);
                z5n.n(map4, 2, aVarA);
                z5n.n(map3, 3, aVarA);
                return aVarA.a();
            }
            str2 = "deepLinkParams = null";
        }
        y4n.c("QuickGame", str2);
        return null;
    }

    public static boolean h(Context context) {
        String str;
        if (yan.d(context)) {
            d.a aVar = d.a.b;
            if (d.d(aVar, context)) {
                y4n.a("QgRouterManager", "open : is in imei range");
                if (d.c(aVar)) {
                    str = "open : is in androidver black list";
                } else {
                    y4n.a("QgRouterManager", "open : is not in androidver black list");
                    if (!d.f(aVar)) {
                        y4n.a("QgRouterManager", "open : is not in phone black list");
                        y4n.a("QgRouterManager", "isUseNewEngine");
                        return true;
                    }
                    str = "open : is in phone black list";
                }
            } else {
                str = "open : is not in imei range";
            }
        } else {
            str = "open : new engine is not installed";
        }
        y4n.a("QgRouterManager", str);
        return false;
    }

    public static void i(Context context) {
        String str;
        a = true;
        jqm jqmVarA = new lgm().a(lmm.d().e(r9n.a()).a(ParserTag.TAG_GET).b("Content-Type", "application/json;charset=UTF-8").b("Accept", "application/json").c());
        if (jqmVarA != null) {
            String strA = jqmVarA.a();
            y4n.c("QuickGame", "快游戏下载引擎配置-> 成功，配置json：" + strA);
            if (f(strA)) {
                b(context, strA);
            } else {
                b(context, "");
                str = "配置数据不符合json格式";
            }
            a = false;
        }
        str = "快游戏下载引擎配置失败";
        y4n.c("QuickGame", str);
        a = false;
    }

    public static boolean j(Context context) {
        return h(context);
    }

    public static String k(Context context) {
        String strD = d(context);
        y4n.c("QuickGame", "从缓存中获取 快游戏引擎配置：" + strD);
        long jE = e(context);
        if (!TextUtils.isEmpty(strD) && c(strD, jE)) {
            y4n.c("QuickGame", "缓存未失效");
            return strD;
        }
        if (a) {
            return "";
        }
        if (n8n.b()) {
            n8n.a(new a(context));
            return "";
        }
        i(context);
        return "";
    }
}
