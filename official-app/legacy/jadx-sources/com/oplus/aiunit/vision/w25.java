package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import com.oplus.utrace.lib.ConstValuesKt;

/* JADX INFO: loaded from: classes8.dex */
public class w25 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile w25 f18085c = null;
    public static boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f18086e = false;
    public boolean a = false;
    public Context b;

    public class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = w25.f18086e = w25.this.d();
            j1e.b("Change MODE to debug mode : " + w25.f18086e);
        }

        public b() {
            super(null);
        }
    }

    public static w25 e() {
        if (f18085c == null) {
            synchronized (w25.class) {
                if (f18085c == null) {
                    f18085c = new w25();
                }
            }
        }
        return f18085c;
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
        f18086e = d();
        context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("oplus_appplatform_debug"), false, new b());
        j1e.c("Current MODE is debug mode : " + f18086e);
    }

    public boolean g() {
        return !d && f18086e;
    }
}
