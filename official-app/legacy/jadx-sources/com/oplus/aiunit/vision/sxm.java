package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public class sxm {
    public static String a = "xgame_hap_game_cache_manage";
    public static String b = "action_game_cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16810c = "action_query_game_cache";
    public static String d = "action_delete_game_cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f16811e = "action_query_game_pkg_list";
    public static String f = "action_delete_one_game_cache";

    public static class a extends ws2 {
        @Override // com.oplus.aiunit.vision.ws2
        public void a(ws2.a aVar) {
            xzm.a("GameUtil", "wrapCallback onResponse=" + aVar);
        }
    }

    public static class b extends ws2 {
        public ws2 a;
        public Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16812c;
        public Map<String, String> d;

        public b(Context context, String str, ws2 ws2Var, Map<String, String> map) {
            this.a = ws2Var;
            this.b = context;
            this.f16812c = str;
            this.d = map;
        }

        @Override // com.oplus.aiunit.vision.ws2
        public void a(ws2.a aVar) {
            if (aVar != null && aVar.a() == 1) {
                try {
                    xzm.b("GameUtil", "wrapper onResponse " + aVar);
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(bmm.a("Y29tLmhleXRhcC54Z2FtZQ=="), bmm.a("Y29tLm5lYXJtZS5pbnN0YW50LnF1aWNrZ2FtZS5hY3Rpdml0eS5HYW1lVHJhbnNmZXJBY3Rpdml0eQ==")));
                    intent.putExtra("req_uri", this.f16812c);
                    intent.putExtra("tsf_key", this.d.get("tsf_key"));
                    Context context = this.b;
                    if (context instanceof Activity) {
                        xzm.b("task_info", "router task id is " + ((Activity) context).getTaskId());
                    } else {
                        intent.addFlags(268435456);
                    }
                    if (this.d.containsKey("in_one_task") && "1".equals(this.d.get("in_one_task"))) {
                        intent.putExtra("in_one_task", this.d.get("in_one_task"));
                    } else {
                        if (!this.d.containsKey("in_tsf") || !"1".equals(this.d.get("in_tsf"))) {
                            throw new IllegalArgumentException("invalid launch mode.");
                        }
                        intent.putExtra("in_tsf", this.d.get("in_tsf"));
                    }
                    this.b.startActivity(intent);
                } catch (Exception e2) {
                    xzm.b("GameUtil", "wrapper onResponse ex:" + e2.getMessage());
                    aVar = new ws2.a();
                    aVar.d(-4);
                    aVar.e("start transform page failed");
                }
            }
            ws2 ws2Var = this.a;
            if (ws2Var != null) {
                ws2Var.a(aVar);
            }
        }
    }

    public static ws2 a(Context context, String str, ws2 ws2Var, Map<String, String> map) {
        if (ws2Var == null) {
            ws2Var = new a();
        }
        return new b(context, str, ws2Var, map);
    }

    public static String b() {
        return System.currentTimeMillis() + "_" + new Random().nextInt();
    }

    public static boolean c(Context context, String str, Map<String, String> map) {
        return str != null && str.startsWith("hap://game") && w5n.c(context) >= 1003;
    }

    public static boolean d(Context context, String str, Map<String, String> map) {
        if (str == null || !str.startsWith("hap://game") || w5n.c(context) < 1001) {
            return false;
        }
        if (map != null && "1".equals(map.get("in_one_task"))) {
            return true;
        }
        try {
            return "1".equals(Uri.parse(str).getQueryParameter("in_one_task"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
