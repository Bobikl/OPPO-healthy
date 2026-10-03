package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.tools.device.OpenIDHelper;

/* JADX INFO: loaded from: classes12.dex */
public class eam {
    public static boolean a() {
        if (p9m.a) {
            return p9m.b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (p9m.a) {
            return com.alipay.sdk.m.a.b.C0147b.a.a(context.getApplicationContext(), OpenIDHelper.OUID);
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        p9m.b = com.alipay.sdk.m.a.b.C0147b.a.b(context.getApplicationContext());
        p9m.a = true;
    }
}
