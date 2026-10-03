package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public final class fpc {
    public static final boolean a = wi5.g();

    public static efd a(Context context) {
        efd.a aVar = new efd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        efd.a aVarB0 = aVar.g(10L, timeUnit).X(30L, timeUnit).b0(30L, timeUnit);
        aVarB0.a(new hi8(context.getApplicationContext()));
        if (a) {
            aVarB0.a(new g6b());
        }
        return aVarB0.c();
    }
}
