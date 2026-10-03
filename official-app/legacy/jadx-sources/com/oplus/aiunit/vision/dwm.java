package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.customer.feedback.sdk.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class dwm {
    public static void a(String str) {
        vwm vwmVar = vwm.feedbackd;
        synchronized (vwmVar) {
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith("/")) {
                    vwmVar.a = str;
                } else {
                    vwmVar.a = str.concat("/");
                }
            }
        }
    }

    public static void b(String str, int i) {
        int iLastIndexOf;
        int i2;
        String className = "";
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace != null && stackTrace.length > 1 && (className = stackTrace[1].getClassName()) != null && (iLastIndexOf = className.lastIndexOf(46)) > -1 && (i2 = iLastIndexOf + 1) < className.length()) {
            className = className.substring(i2);
        }
        lwm lwmVar = new lwm(System.currentTimeMillis(), i, className, str);
        vwm vwmVar = vwm.feedbackd;
        if (vwmVar.a == null) {
            LogUtil.e("FbLogUpdater", "log saved path is null.");
            return;
        }
        if (vwmVar.b == null) {
            synchronized (vwmVar) {
                if (vwmVar.b == null) {
                    Thread thread = new Thread(new uwm(vwmVar));
                    vwmVar.b = thread;
                    thread.setDaemon(true);
                    vwmVar.b.start();
                }
            }
        }
        try {
            vwmVar.f18023c.put(lwmVar);
        } catch (InterruptedException e2) {
            LogUtil.e("FbLogUpdater", "exceptionInfo：" + e2);
        }
    }
}
