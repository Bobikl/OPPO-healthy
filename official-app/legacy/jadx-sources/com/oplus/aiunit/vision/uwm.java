package com.oplus.aiunit.vision;

import com.customer.feedback.sdk.util.LogUtil;
import com.oplus.weatherservicesdk.data.Weather;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public final class uwm implements Runnable {
    public final /* synthetic */ vwm i;

    public uwm(vwm vwmVar) {
        this.i = vwmVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            try {
                lwm lwmVarTake = this.i.f18023c.take();
                synchronized (vwm.feedbackd) {
                    String str = lwmVarTake.a() + Weather.SEPARATOR;
                    String str2 = this.i.a;
                    long j2 = lwmVarTake.a;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(v05.TIME_ZONE_8));
                    rwm.c(str, str2, simpleDateFormat.format(new Date(j2)));
                }
            } catch (InterruptedException e2) {
                LogUtil.e("FbLogUpdater", "exceptionInfo：" + e2);
            }
        }
    }
}
