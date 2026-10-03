package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class l2n {
    public static String a = "xgame_hap_game_cache_manage";
    public static String b = "action_game_cache";
    public static String c = "action_query_game_cache";
    public static String d = "action_delete_game_cache";
    public static String e = "action_query_game_pkg_list";
    public static String f = "action_delete_one_game_cache";

    public static class a extends kt2 {
        @Override // com.oplus.aiunit.vision.kt2
        public void a(kt2.a aVar) {
            y4n.a("GameUtil", "wrapCallback onResponse=" + aVar);
        }
    }

    public static class b extends kt2 {
        public kt2 a;
        public Context b;
        public String c;
        public Map<String, String> d;

        public b(Context context, String str, kt2 kt2Var, Map<String, String> map) {
            this.a = kt2Var;
            this.b = context;
            this.c = str;
            this.d = map;
        }

        @Override // com.oplus.aiunit.vision.kt2
        public void a(kt2.a aVar) {
            if (aVar != null && aVar.a() == 1) {
                try {
                    y4n.b("GameUtil", "wrapper onResponse " + aVar);
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(kqm.a("Y29tLmhleXRhcC54Z2FtZQ=="), kqm.a("Y29tLm5lYXJtZS5pbnN0YW50LnF1aWNrZ2FtZS5hY3Rpdml0eS5HYW1lVHJhbnNmZXJBY3Rpdml0eQ==")));
                    intent.putExtra("req_uri", this.c);
                    intent.putExtra("tsf_key", this.d.get("tsf_key"));
                    Context context = this.b;
                    if (context instanceof Activity) {
                        y4n.b("task_info", "router task id is " + ((Activity) context).getTaskId());
                    } else {
                        intent.addFlags(SauAarConstants.L);
                    }
                    if (this.d.containsKey("in_one_task") && erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(this.d.get("in_one_task"))) {
                        intent.putExtra("in_one_task", this.d.get("in_one_task"));
                    } else {
                        if (!this.d.containsKey("in_tsf") || !erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(this.d.get("in_tsf"))) {
                            throw new IllegalArgumentException("invalid launch mode.");
                        }
                        intent.putExtra("in_tsf", this.d.get("in_tsf"));
                    }
                    this.b.startActivity(intent);
                } catch (Exception e) {
                    y4n.b("GameUtil", "wrapper onResponse ex:" + e.getMessage());
                    aVar = new kt2.a();
                    aVar.d(-4);
                    aVar.e("start transform page failed");
                }
            }
            kt2 kt2Var = this.a;
            if (kt2Var != null) {
                kt2Var.a(aVar);
            }
        }
    }

    public static kt2 a(Context context, String str, kt2 kt2Var, Map<String, String> map) {
        if (kt2Var == null) {
            kt2Var = new a();
        }
        return new b(context, str, kt2Var, map);
    }

    public static String b() {
        return System.currentTimeMillis() + "_" + new Random().nextInt();
    }

    public static boolean c(Context context, String str, Map<String, String> map) {
        return str != null && str.startsWith("hap://game") && yan.c(context) >= 1003;
    }

    public static boolean d(Context context, String str, Map<String, String> map) {
        if (str == null || !str.startsWith("hap://game") || yan.c(context) < 1001) {
            return false;
        }
        if (map != null && erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(map.get("in_one_task"))) {
            return true;
        }
        try {
            return erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE.equals(Uri.parse(str).getQueryParameter("in_one_task"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
