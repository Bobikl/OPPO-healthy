package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import com.heytap.store.base.core.http.HttpUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class tqm {
    public static String a;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append(HttpUtils.EQUAL_SIGN);
        }
        a = sb.toString();
    }

    public static void a() {
        e(a);
        e("当前使用的自定义地图样式文件和目前版本不匹配，请到官网(lbs.amap.com)更新新版样式文件");
        e(a);
    }

    public static void b(Context context, String str) {
        e(a);
        if (context != null) {
            d("key:" + n0n.j(context));
        }
        e(str);
        e(a);
    }

    public static void c(String str) {
        e(a);
        e(str);
        e(a);
    }

    public static void d(String str) {
        if (str.length() >= 78) {
            e("|" + str.substring(0, 78) + "|");
            d(str.substring(78));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append(str);
        for (int i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        e(sb.toString());
    }

    public static void e(String str) {
        Log.i("authErrLog", str);
    }
}
