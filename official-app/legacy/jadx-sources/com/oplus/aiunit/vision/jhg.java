package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public final class jhg {
    public static Map<String, String> a = new HashMap();
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, String> f12906c = new HashMap();

    public static void a() {
        e();
    }

    public static void b(Context context, Map<String, String> map) {
        a();
        if (b) {
            a7b.f("Schemehourse", "loadByPlugin");
            d(map);
        } else {
            a7b.f("Schemehourse", "loadByDexFind");
            c(context, map);
        }
    }

    public static synchronized void c(Context context, Map<String, String> map) {
        try {
            if (!f12906c.isEmpty()) {
                a7b.f("Schemehourse", "loadByDexFind for cache");
                map.putAll(f12906c);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Pattern patternCompile = Pattern.compile("^com.heytap.health.scheme.SchemeRegister\\$\\$\\w+$");
            for (String str : pc3.a(context, "com.heytap.health.scheme")) {
                a7b.f("Schemehourse", "loadByDexFind: " + str);
                if (patternCompile.matcher(str).matches()) {
                    Class.forName(str).getMethod("registerScheme", Map.class).invoke(null, f12906c);
                    a7b.f("Schemehourse", "loadByDexFind matches:" + str);
                }
            }
            map.putAll(f12906c);
            a7b.f("Schemehourse", "loadByDexFind cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e2) {
            throw new RuntimeException("StaticConfig_ loadByDexFind file " + e2.getMessage());
        }
    }

    public static void d(Map<String, String> map) {
        zfg.a(map);
        ngg.a(map);
        bgg.a(map);
        yfg.a(map);
        sfg.a(map);
        ahg.a(map);
        fgg.a(map);
        xgg.a(map);
        lgg.a(map);
        xfg.a(map);
        wgg.a(map);
        tgg.a(map);
        egg.a(map);
        rgg.a(map);
        kgg.a(map);
        ghg.a(map);
        chg.a(map);
        ggg.a(map);
        mgg.a(map);
        pgg.a(map);
        fhg.a(map);
        dhg.a(map);
        vgg.a(map);
        vfg.a(map);
        igg.a(map);
        tfg.a(map);
        ugg.a(map);
        agg.a(map);
        ogg.a(map);
        sgg.a(map);
        jgg.a(map);
        cgg.a(map);
        bhg.a(map);
        qgg.a(map);
        dgg.a(map);
        zgg.a(map);
        ufg.a(map);
        hgg.a(map);
        ygg.a(map);
        wfg.a(map);
        ehg.a(map);
    }

    public static void e() {
        b = true;
    }
}
