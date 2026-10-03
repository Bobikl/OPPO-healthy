package com.oplus.aiunit.vision;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class jcm {
    public static Class<?> a = null;
    public static Class<?> b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f12845c = null;
    public static Method d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f12846e = null;
    public static Method f = null;
    public static boolean g = false;

    public static void a(Context context, p4f p4fVar, String str, String... strArr) {
        if (g) {
            c(context, p4fVar);
            try {
                d.invoke(b, context, str, strArr);
            } catch (Exception e2) {
                q8g.f("OpenConfig", "trackCustomEvent exception: " + e2.toString());
            }
        }
    }

    public static boolean b(Context context, p4f p4fVar) {
        return com.tencent.open.utils.a.d(context, p4fVar.h()).j("Common_ta_enable");
    }

    public static void c(Context context, p4f p4fVar) {
        try {
            if (b(context, p4fVar)) {
                f.invoke(a, Boolean.TRUE);
            } else {
                f.invoke(a, Boolean.FALSE);
            }
        } catch (Exception e2) {
            q8g.f("OpenConfig", "checkStatStatus exception: " + e2.toString());
        }
    }

    public static void d(Context context, p4f p4fVar) {
        String str = "Aqc" + p4fVar.h();
        try {
            a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            b = cls;
            f12845c = cls.getMethod("reportQQ", Context.class, String.class);
            d = b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class<?> cls2 = b;
            Class<?> cls3 = Integer.TYPE;
            f12846e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class<?> cls4 = a;
            Class<?> cls5 = Boolean.TYPE;
            f = cls4.getMethod("setEnableStatService", cls5);
            c(context, p4fVar);
            a.getMethod("setAutoExceptionCaught", cls5).invoke(a, Boolean.FALSE);
            a.getMethod("setEnableSmartReporting", cls5).invoke(a, Boolean.TRUE);
            a.getMethod("setSendPeriodMinutes", cls3).invoke(a, Integer.valueOf(weg.WINDOW_NIGHT_END));
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            a.getMethod("setStatSendStrategy", cls6).invoke(a, cls6.getField("PERIOD").get(null));
            b.getMethod("startStatService", Context.class, String.class, String.class).invoke(b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            g = true;
        } catch (Exception e2) {
            q8g.f("OpenConfig", "start4QQConnect exception: " + e2.toString());
        }
    }
}
