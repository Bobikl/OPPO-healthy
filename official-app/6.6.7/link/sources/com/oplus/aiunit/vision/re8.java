package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class re8 {
    public static final WeakHashMap<jyj, Boolean> a = new WeakHashMap<>();
    public static boolean b = false;
    public static boolean c = false;
    public static final ContentObserver d = new a(new Handler(Looper.getMainLooper()));

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            re8.k();
        }
    }

    public static boolean c(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    public static void d(final l2a l2aVar, boolean z) {
        if (l2aVar == null) {
            return;
        }
        boolean zE = (c || l2aVar.getContext() == null) ? b : e(l2aVar.getContext().getResources().getConfiguration());
        jyj jyjVar = new jyj(l2aVar, z, zE);
        l2aVar.addJavascriptInterface(jyjVar, "HeytapTheme");
        l2aVar.setForceDarkAllowed(false);
        i(jyjVar);
        o0k.k(new Runnable() { // from class: com.oplus.aiunit.vision.pe8
            @Override // java.lang.Runnable
            public final void run() {
                re8.j(l2aVar);
            }
        });
    }

    public static boolean e(Configuration configuration) {
        return 32 == (configuration.uiMode & 48);
    }

    public static void g(Activity activity, Configuration configuration) {
        h(activity, e(configuration));
    }

    public static void h(Activity activity, boolean z) {
        for (jyj jyjVar : a.keySet()) {
            if (activity == jyjVar.b()) {
                jyjVar.f(z);
            }
        }
    }

    public static void i(jyj jyjVar) {
        a.put(jyjVar, Boolean.TRUE);
    }

    public static void j(l2a l2aVar) {
        if (l2aVar == null || l2aVar.getContext() == null) {
            return;
        }
        l2aVar.getContext().getApplicationContext().getContentResolver().registerContentObserver(Settings.Global.getUriFor(jyj.KEY_BACKGROUNDMAXL), true, d);
    }

    public static void k() {
        Iterator<jyj> it = a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }
}
