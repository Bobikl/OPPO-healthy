package xcrash;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.caverock.androidsvg.SVGParser;
import com.oplus.aiunit.vision.fp;
import com.oplus.aiunit.vision.ko9;
import com.oplus.aiunit.vision.n1k;
import com.oplus.aiunit.vision.qqk;
import com.oplus.aiunit.vision.vb7;
import com.oplus.aiunit.vision.vr9;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"StaticFieldLeak"})
class NativeHandler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final NativeHandler f20847j = new NativeHandler();
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20848c;
    public ko9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20849e;
    public boolean f;
    public ko9 g;
    public ko9 h;
    public long a = 25000;
    public boolean i = false;

    public static NativeHandler a() {
        return f20847j;
    }

    public static String b(boolean z, String str) {
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if ((z && key.getName().equals("main")) || (!z && key.getName().contains(str))) {
                    StringBuilder sb = new StringBuilder();
                    StackTraceElement[] value = entry.getValue();
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("    at ");
                        sb.append(stackTraceElement.toString());
                        sb.append(Weather.SEPARATOR);
                    }
                    return sb.toString();
                }
            }
            return null;
        } catch (Exception e2) {
            b.c().e("xcrash", "NativeHandler getStacktraceByThreadName failed", e2);
            return null;
        }
    }

    private static void crashCallback(String str, String str2, boolean z, boolean z2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                String strB = b(z2, str3);
                if (!TextUtils.isEmpty(strB)) {
                    n1k.a(str, TombstoneParser.keyJavaStacktrace, strB);
                }
            }
            n1k.a(str, TombstoneParser.keyMemoryInfo, qqk.o());
            n1k.a(str, "foreground", fp.d().f() ? "yes" : SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        }
        ko9 ko9Var = a().d;
        if (ko9Var != null) {
            try {
                ko9Var.a(str, str2);
            } catch (Exception e2) {
                b.c().w("xcrash", "NativeHandler native crash callback.onCrash failed", e2);
            }
        }
        if (a().f20848c) {
            return;
        }
        fp.d().c();
    }

    private static native int nativeInit(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, String[] strArr, boolean z8, boolean z9, int i6, int i7, int i8, boolean z10, boolean z11);

    private static native void nativeNotifyJavaCrashed();

    private static native void nativeTestCrash(int i);

    private static void traceCallback(String str, String str2) {
        Log.i("xcrash", "trace slow callback time: " + System.currentTimeMillis());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n1k.a(str, TombstoneParser.keyMemoryInfo, qqk.o());
        n1k.a(str, "foreground", fp.d().f() ? "yes" : SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        if (a().f && !qqk.b(a().b, a().a)) {
            vb7.l().q(new File(str));
            return;
        }
        if (vb7.l().p()) {
            String str3 = str.substring(0, str.length() - 13) + ".anr.xcrash";
            File file = new File(str);
            if (!file.renameTo(new File(str3))) {
                vb7.l().q(file);
                return;
            }
            ko9 ko9Var = a().g;
            if (ko9Var != null) {
                try {
                    ko9Var.a(str3, str2);
                } catch (Exception e2) {
                    b.c().w("xcrash", "NativeHandler ANR callback.onCrash failed", e2);
                }
            }
        }
    }

    private static void traceCallbackBeforeDump() {
        Log.i("xcrash", "trace fast callback time: " + System.currentTimeMillis());
        ko9 ko9Var = a().h;
        if (ko9Var != null) {
            try {
                ko9Var.a(null, null);
            } catch (Exception e2) {
                b.c().w("xcrash", "NativeHandler ANR callback.onCrash failed", e2);
            }
        }
    }

    public int c(Context context, vr9 vr9Var, String str, String str2, String str3, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, String[] strArr, ko9 ko9Var, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, boolean z11, boolean z12, ko9 ko9Var2, ko9 ko9Var3) {
        if (vr9Var == null) {
            try {
                System.loadLibrary("xcrash");
            } catch (Throwable th) {
                b.c().e("xcrash", "NativeHandler System.loadLibrary failed", th);
                return -2;
            }
        } else {
            try {
                vr9Var.a("xcrash");
            } catch (Throwable th2) {
                b.c().e("xcrash", "NativeHandler ILibLoader.loadLibrary failed", th2);
                return -2;
            }
        }
        this.b = context;
        this.f20848c = z2;
        this.d = ko9Var;
        this.f20849e = z8;
        this.f = z10;
        this.g = ko9Var2;
        this.h = ko9Var3;
        this.a = z9 ? 25000L : 45000L;
        try {
            if (nativeInit(Build.VERSION.SDK_INT, Build.VERSION.RELEASE, qqk.c(), Build.MANUFACTURER, Build.BRAND, qqk.m(), Build.FINGERPRINT, str, str2, context.getApplicationInfo().nativeLibraryDir, str3, z, z2, i, i2, i3, z3, z4, z5, z6, z7, i4, strArr, z8, z9, i5, i6, i7, z11, z12) != 0) {
                b.c().e("xcrash", "NativeHandler init failed");
                return -3;
            }
            this.i = true;
            return 0;
        } catch (Throwable th3) {
            b.c().e("xcrash", "NativeHandler init failed", th3);
            return -3;
        }
    }

    public void d() {
        if (this.i && this.f20849e) {
            nativeNotifyJavaCrashed();
        }
    }

    public void e(boolean z) {
        if (this.i) {
            nativeTestCrash(z ? 1 : 0);
        }
    }
}
