package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ani {
    public static boolean a = false;
    public static List<i70> b = new ArrayList();

    public static void a() {
        e();
    }

    public static void b(Context context, List<i70> list) {
        a();
        if (a) {
            d(list);
        } else {
            c(context, list);
        }
    }

    public static synchronized void c(Context context, List<i70> list) {
        try {
            if (!b.isEmpty()) {
                list.addAll(b);
                return;
            }
            System.currentTimeMillis();
            Pattern patternCompile = Pattern.compile("^com.oplus.health.apiprovider.interral.gen.Config_[\\w_]+_[\\w_]+_$");
            for (String str : pc3.a(context, "com.oplus.health.apiprovider.interral.gen")) {
                if (patternCompile.matcher(str).matches()) {
                    Class.forName(str).getMethod("loadConfig", List.class).invoke(null, b);
                }
            }
            list.addAll(b);
        } catch (Exception e2) {
            throw new RuntimeException("StaticConfig_ loadByDexFind file " + e2.getMessage());
        }
    }

    public static void d(List<i70> list) {
        ow3.a(list);
        gw3.a(list);
        wv3.a(list);
        lv3.a(list);
        av3.a(list);
        kw3.a(list);
        lw3.a(list);
        pv3.a(list);
        rv3.a(list);
        vw3.a(list);
        aw3.a(list);
        jv3.a(list);
        uw3.a(list);
        nw3.a(list);
        iw3.a(list);
        bw3.a(list);
        fv3.a(list);
        ew3.a(list);
        bv3.a(list);
        zu3.a(list);
        iv3.a(list);
        vv3.a(list);
        zv3.a(list);
        sw3.a(list);
        nv3.a(list);
        rw3.a(list);
        qw3.a(list);
        pw3.a(list);
        yv3.a(list);
        tv3.a(list);
        jw3.a(list);
        mw3.a(list);
        uv3.a(list);
        hv3.a(list);
        qv3.a(list);
        dv3.a(list);
        yu3.a(list);
        tw3.a(list);
        xv3.a(list);
        hw3.a(list);
        mv3.a(list);
        dw3.a(list);
        cw3.a(list);
        ev3.a(list);
        fw3.a(list);
        gv3.a(list);
        kv3.a(list);
        sv3.a(list);
        cv3.a(list);
        ov3.a(list);
    }

    public static void e() {
        a = true;
    }
}
