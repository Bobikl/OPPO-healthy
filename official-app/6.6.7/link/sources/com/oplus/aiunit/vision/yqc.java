package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.pay.opensdk.statistic.network.Interceptor.SecurityRequestInterceptor;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class yqc {
    public static boolean a() {
        return noj.a("persist.sys.assert.panic").equalsIgnoreCase("true") || noj.a(SystemSettingsUtilsKt.LOG_ON_MKT).equalsIgnoreCase("true");
    }

    @NotNull
    public final vgd b(Context context, boolean z) {
        vgd.a aVar = new vgd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vgd.a aVarB0 = aVar.g(10L, timeUnit).X(30L, timeUnit).b0(30L, timeUnit);
        aVarB0.a(new jj8(context.getApplicationContext()));
        if (a() && z) {
            aVarB0.a(new r7b());
        }
        return aVarB0.c();
    }

    @NotNull
    public final vgd c(Context context, String str, boolean z) {
        vgd.a aVar = new vgd.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vgd.a aVarB0 = aVar.g(10L, timeUnit).X(30L, timeUnit).b0(30L, timeUnit);
        aVarB0.a(new jj8(context.getApplicationContext()));
        if (a() && z) {
            aVarB0.a(new r7b());
        }
        aVarB0.a(new SecurityRequestInterceptor(str));
        return aVarB0.c();
    }
}
