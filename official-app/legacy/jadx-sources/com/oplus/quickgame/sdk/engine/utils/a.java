package com.oplus.quickgame.sdk.engine.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.oplus.aiunit.vision.amm;
import com.oplus.aiunit.vision.ccm;
import com.oplus.aiunit.vision.eim;
import com.oplus.aiunit.vision.l3n;
import com.oplus.aiunit.vision.p4n;
import com.oplus.aiunit.vision.w5n;
import com.oplus.aiunit.vision.ws2;
import com.oplus.aiunit.vision.x7f;
import com.oplus.aiunit.vision.xzm;
import com.oplus.aiunit.vision.z0n;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static boolean a = false;
    public static String b = "SP_GameEngineConfig";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f20083c = "NEW_ENGINE_CONFIG_NATVIE_CACHE_KEY";
    public static String d = "NEW_ENGINE_CONFIG_NATVIE_CACHE_SAVE_DATE";

    /* JADX INFO: renamed from: com.oplus.quickgame.sdk.engine.utils.a$a, reason: collision with other inner class name */
    public static class RunnableC0980a implements Runnable {
        public final /* synthetic */ Context i;

        public RunnableC0980a(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.i(this.i);
        }
    }

    public static void b(Context context, String str) {
        context.getSharedPreferences(b, 0).edit().putString(f20083c, str).putLong(d, System.currentTimeMillis()).apply();
    }

    public static boolean c(String str, long j2) {
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
            if (jCurrentTimeMillis > j2 && jCurrentTimeMillis - j2 <= (Long.parseLong(string) * 60) * 1000) {
                return true;
            }
            str2 = "快游戏引擎配置检测失败：不符合最大有效时间：" + string + "min，return 空";
        }
        xzm.c("QuickGame", str2);
        return false;
    }

    public static String d(Context context) {
        return context.getSharedPreferences(b, 0).getString(f20083c, "");
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
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static x7f.c g(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, ws2 ws2Var) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "context =null 或者 url=空";
        } else if (!x7f.c(str)) {
            str2 = "传入的url不支持快游戏引擎启动；url" + str;
        } else if (!x7f.b(context)) {
            str2 = "快游戏引擎未安装，不支持引擎启动；";
        } else if (!x7f.e(context)) {
            str2 = "游戏引擎配置检索失败，不支持引擎启动；";
        } else if (!x7f.d(context)) {
            str2 = "快游戏引擎配置不持支本次引擎启动；请检索日志QgRouterManager";
        } else {
            if (map != null) {
                x7f.a aVarA = x7f.a(map.get("origin"), map.get(CloudDownloadWorker.KEY_SECRET));
                aVarA.g(str);
                aVarA.f(ws2Var);
                if ("1".equals(map2.get("sgtp"))) {
                    aVarA.h();
                }
                z0n.n(map, 0, aVarA);
                z0n.n(map2, 1, aVarA);
                z0n.n(map4, 2, aVarA);
                z0n.n(map3, 3, aVarA);
                return aVarA.a();
            }
            str2 = "deepLinkParams = null";
        }
        xzm.c("QuickGame", str2);
        return null;
    }

    public static boolean h(Context context) {
        String str;
        if (w5n.d(context)) {
            d.a aVar = d.a.OPEN;
            if (d.d(aVar, context)) {
                xzm.a("QgRouterManager", "open : is in imei range");
                if (d.c(aVar)) {
                    str = "open : is in androidver black list";
                } else {
                    xzm.a("QgRouterManager", "open : is not in androidver black list");
                    if (!d.f(aVar)) {
                        xzm.a("QgRouterManager", "open : is not in phone black list");
                        xzm.a("QgRouterManager", "isUseNewEngine");
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
        xzm.a("QgRouterManager", str);
        return false;
    }

    public static void i(Context context) {
        String str;
        a = true;
        amm ammVarA = new ccm().a(eim.d().e(p4n.a()).a(ParserTag.TAG_GET).b("Content-Type", FastJsonJsonView.DEFAULT_CONTENT_TYPE).b("Accept", "application/json").c());
        if (ammVarA != null) {
            String strA = ammVarA.a();
            xzm.c("QuickGame", "快游戏下载引擎配置-> 成功，配置json：" + strA);
            if (f(strA)) {
                b(context, strA);
            } else {
                b(context, "");
                str = "配置数据不符合json格式";
            }
            a = false;
        }
        str = "快游戏下载引擎配置失败";
        xzm.c("QuickGame", str);
        a = false;
    }

    public static boolean j(Context context) {
        return h(context);
    }

    public static String k(Context context) {
        String strD = d(context);
        xzm.c("QuickGame", "从缓存中获取 快游戏引擎配置：" + strD);
        long jE = e(context);
        if (!TextUtils.isEmpty(strD) && c(strD, jE)) {
            xzm.c("QuickGame", "缓存未失效");
            return strD;
        }
        if (a) {
            return "";
        }
        if (l3n.b()) {
            l3n.a(new RunnableC0980a(context));
            return "";
        }
        i(context);
        return "";
    }
}
