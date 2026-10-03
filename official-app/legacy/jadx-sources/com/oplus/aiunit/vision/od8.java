package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.heytap.webview.extension.protocol.ThemeConst;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class od8 {
    public static final WeakHashMap<huj, Boolean> a = new WeakHashMap<>();
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f14895c = false;
    public static final ContentObserver d = new a(new Handler(Looper.getMainLooper()));

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            od8.k();
        }
    }

    public static boolean c(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 16;
    }

    public static void d(final e1a e1aVar, boolean z) {
        if (e1aVar == null) {
            return;
        }
        boolean zE = (f14895c || e1aVar.getContext() == null) ? b : e(e1aVar.getContext().getResources().getConfiguration());
        huj hujVar = new huj(e1aVar, z, zE);
        e1aVar.addJavascriptInterface(hujVar, ThemeConst.ObjectName.JS_INTERFACE_THEME);
        e1aVar.setForceDarkAllowed(false);
        i(hujVar);
        mwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.md8
            @Override // java.lang.Runnable
            public final void run() {
                od8.j(e1aVar);
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
        for (huj hujVar : a.keySet()) {
            if (activity == hujVar.b()) {
                hujVar.f(z);
            }
        }
    }

    public static void i(huj hujVar) {
        a.put(hujVar, Boolean.TRUE);
    }

    public static void j(e1a e1aVar) {
        if (e1aVar == null || e1aVar.getContext() == null) {
            return;
        }
        e1aVar.getContext().getApplicationContext().getContentResolver().registerContentObserver(Settings.Global.getUriFor("DarkMode_BackgroundMaxL"), true, d);
    }

    public static void k() {
        Iterator<huj> it = a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }
}
