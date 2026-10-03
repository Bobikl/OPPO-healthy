package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import com.oplus.utrace.lib.ConstValuesKt;

/* JADX INFO: loaded from: classes19.dex */
public class v25 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile v25 f17675c = null;
    public static boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f17676e = false;
    public boolean a = false;
    public Context b;

    public class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = v25.f17676e = v25.this.d();
            i1e.b("Change MODE to debug mode : " + v25.f17676e);
        }

        public b() {
            super(null);
        }
    }

    public static v25 e() {
        if (f17675c == null) {
            synchronized (v25.class) {
                if (f17675c == null) {
                    f17675c = new v25();
                }
            }
        }
        return f17675c;
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
        f17676e = d();
        context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("oplus_appplatform_debug"), false, new b());
        i1e.c("Current MODE is debug mode : " + f17676e);
    }

    public boolean g() {
        return !d && f17676e;
    }
}
