package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.bodyfat.R$drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ow1 {
    public static List<String> a;
    public static Map<String, Integer> b;

    public static List<String> a() {
        List<String> list = a;
        if (list == null || list.size() == 0) {
            b();
        }
        return a;
    }

    public static void b() {
        a = new ArrayList();
        b = new HashMap();
        a.add("red");
        a.add("yellow");
        a.add("green");
        a.add("cyan_blue");
        a.add("orange");
        a.add("blue");
        b.put("red", Integer.valueOf(R$drawable.health_body_fat_ic_logo_red));
        b.put("yellow", Integer.valueOf(R$drawable.health_body_fat_ic_logo_yellow));
        b.put("green", Integer.valueOf(R$drawable.health_body_fat_ic_logo_green));
        b.put("cyan_blue", Integer.valueOf(R$drawable.health_body_fat_ic_logo_cyan_blue));
        b.put("orange", Integer.valueOf(R$drawable.health_body_fat_ic_logo_orange));
        b.put("blue", Integer.valueOf(R$drawable.health_body_fat_ic_logo_blue));
    }

    public static int c(String str) {
        if (a == null && b == null) {
            b();
        }
        return (TextUtils.isEmpty(str) || !b.containsKey(str)) ? R$drawable.health_body_fat_ic_logo_red : b.get(str).intValue();
    }
}
