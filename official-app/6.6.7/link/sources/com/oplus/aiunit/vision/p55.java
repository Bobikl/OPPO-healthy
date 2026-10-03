package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class p55 implements it9 {
    public static final boolean b = sj5.g();
    public static final boolean c = j();
    public boolean a = false;

    public static boolean j() {
        return Log.isLoggable("WebLog", 2);
    }

    @Override // com.oplus.aiunit.vision.it9
    public void a(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.w(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.it9
    public void b(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.e(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.it9
    public void c(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.d(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.it9
    public void d(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.i(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.it9
    public void e(boolean z) {
        this.a = z;
    }

    public final Throwable f(Throwable... thArr) {
        if ((thArr == null || thArr.length == 0) ? false : true) {
            return thArr[0];
        }
        return null;
    }

    public final String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "WebLog";
        }
        return "WebLog." + str;
    }

    public final String h(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public boolean i() {
        return this.a || b || c;
    }
}
