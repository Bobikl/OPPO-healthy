package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class uum {
    public static Context a;

    public static final Context a() {
        Context context = a;
        if (context == null) {
            return null;
        }
        return context;
    }

    public static final File b(String str) {
        return com.tencent.open.utils.b.I(a(), str);
    }

    public static final void c(Context context) {
        a = context;
    }

    public static final String d() {
        return a() == null ? "" : a().getPackageName();
    }

    public static final File e() {
        if (a() == null) {
            return null;
        }
        return a().getFilesDir();
    }

    public static final File f() {
        Context contextA = a();
        if (contextA != null) {
            return contextA.getCacheDir();
        }
        return null;
    }

    public static final File g() {
        return b(null);
    }
}
