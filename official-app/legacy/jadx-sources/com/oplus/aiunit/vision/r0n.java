package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes12.dex */
public final class r0n {
    public volatile b a = new b(0);
    public x2n b = new x2n("HttpsDecisionUtil");

    public static class a {
        public static r0n a = new r0n();
    }

    public static r0n a() {
        return a.a;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith(Const.Scheme.SCHEME_HTTPS)) {
            return str;
        }
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme(Const.Scheme.SCHEME_HTTPS);
            return builderBuildUpon.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void e(Context context) {
        f(context, true);
    }

    public static void f(Context context, boolean z) {
        SharedPreferences.Editor editorC = x2n.c(context, "open_common");
        x2n.k(editorC, "a3", z);
        x2n.f(editorC);
    }

    public static boolean i() {
        return false;
    }

    public final void c(Context context) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        this.a.b(x2n.l(context, "open_common", "a3", true));
        this.a.a(context);
        q1n.a(context).b();
    }

    public final void d(Context context, boolean z) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        f(context, z);
        this.a.b(z);
    }

    public final boolean g() {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        return this.a.c();
    }

    public final boolean h(boolean z) {
        if (i()) {
            return false;
        }
        return z || g();
    }

    public static class b {
        public int a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16010c;
        public boolean d;

        public b() {
            this.a = 0;
            this.b = true;
            this.f16010c = true;
            this.d = false;
        }

        public final void a(Context context) {
            if (context != null && this.a <= 0) {
                this.a = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void b(boolean z) {
            this.b = z;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001b  */
        public final boolean c() {
            boolean z;
            if (!this.d) {
                if (this.b) {
                    int i = this.a;
                    if (i <= 0) {
                        i = 28;
                    }
                    if (i >= 28) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                if (!(z)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }
}
