package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes14.dex */
public class x45 implements ds9 {
    public static boolean a;

    public static boolean h() {
        return a;
    }

    public static void i(boolean z) {
        a = z;
    }

    @Override // com.oplus.aiunit.vision.ds9
    public void a(String str, String str2, Throwable... thArr) {
        if (h()) {
            Log.w(f(str), g(str2), e(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.ds9
    public void b(String str, String str2, Throwable... thArr) {
        if (h()) {
            Log.e(f(str), g(str2), e(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.ds9
    public void c(String str, String str2, Throwable... thArr) {
        if (h()) {
            Log.d(f(str), g(str2), e(thArr));
        }
    }

    @Override // com.oplus.aiunit.vision.ds9
    public void d(String str, String str2, Throwable... thArr) {
        if (h()) {
            Log.i(f(str), g(str2), e(thArr));
        }
    }

    public final Throwable e(Throwable... thArr) {
        if ((thArr == null || thArr.length == 0) ? false : true) {
            return thArr[0];
        }
        return null;
    }

    public final String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "WebPro";
        }
        return "WebPro." + str;
    }

    public final String g(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }
}
