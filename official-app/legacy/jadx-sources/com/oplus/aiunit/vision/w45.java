package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class w45 implements cs9 {
    public static final boolean b = wi5.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18111c = j();
    public boolean a = false;

    public static boolean j() {
        return Log.isLoggable("WebLog", 2);
    }

    @Override // com.oplus.aiunit.vision.cs9
    public void a(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.w(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.cs9
    public void b(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.e(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.cs9
    public void c(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.d(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.cs9
    public void d(String str, String str2, Throwable... thArr) {
        if (i()) {
            Log.i(g(str), h(str2), f(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.cs9
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
        return this.a || b || f18111c;
    }
}
