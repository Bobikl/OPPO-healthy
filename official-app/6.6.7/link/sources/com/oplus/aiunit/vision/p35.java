package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import com.oplus.utrace.lib.ConstValuesKt;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class p35 {
    public static volatile p35 c = null;
    public static boolean d = true;
    public static boolean e = false;
    public boolean a = false;
    public Context b;

    public class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = p35.e = p35.this.d();
            e3e.b("Change MODE to debug mode : " + p35.e);
        }

        public b() {
            super(null);
        }
    }

    public static p35 e() {
        if (c == null) {
            synchronized (p35.class) {
                if (c == null) {
                    c = new p35();
                }
            }
        }
        return c;
    }

    public final boolean d() {
        return Settings.Secure.getInt(this.b.getContentResolver(), "oplus_appplatform_debug", 0) == 1;
    }

    public void f(Context context) {
        if (this.a) {
            return;
        }
        this.a = true;
        boolean z = SystemProperties.getBoolean(ConstValuesKt.RO_BUILD_RELEASE_TYPE, true);
        d = z;
        if (z) {
            return;
        }
        this.b = context;
        e = d();
        context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("oplus_appplatform_debug"), false, new b());
        e3e.c("Current MODE is debug mode : " + e);
    }

    public boolean g() {
        return !d && e;
    }
}
