package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class erk {
    public static String a(Throwable th) {
        return TextUtils.isEmpty(th.getMessage()) ? a7b.e(th) : th.getMessage();
    }

    public static String b() {
        return v9g.w().E("user_ssoid", "default");
    }

    public static String c(String str) {
        String strB = b() != null ? vbb.b(b()) : "";
        String strJ = r3.j();
        return String.format("%s_%s_%s", str, strB, TextUtils.isEmpty(strJ) ? "" : vbb.b(strJ));
    }

    public static HLatLng d(double d, double d2) {
        return zne.b(d, d2);
    }

    public static String e(Object obj) {
        return Objects.toString(obj, "");
    }

    public static void f(Object obj) {
        zlj.b("手表的数据  ReponseData --> " + Objects.toString(obj, "数据为null"));
    }

    public static void g(Object obj) {
        zlj.b("发送的数据  sendData --> " + Objects.toString(obj, "数据为null"));
    }
}
