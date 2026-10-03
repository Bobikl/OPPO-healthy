package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class xqc {
    public static final boolean a = sj5.g();

    public static vgd a(Context context) {
        vgd.a aVar = new vgd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vgd.a aVarB0 = aVar.g(10L, timeUnit).X(30L, timeUnit).b0(30L, timeUnit);
        aVarB0.a(new kj8(context.getApplicationContext()));
        if (a) {
            aVarB0.a(new s7b());
        }
        return aVarB0.c();
    }
}
