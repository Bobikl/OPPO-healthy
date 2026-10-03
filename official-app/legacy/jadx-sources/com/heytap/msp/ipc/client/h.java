package com.heytap.msp.ipc.client;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public class h {
    public static IMspIPCLog a;

    public static void a(String str, String str2) {
        e(3, str, str2, null);
    }

    public static void b(String str, String str2) {
        e(6, str, str2, null);
    }

    public static void c(String str, String str2, Throwable th) {
        e(6, str, str2, th);
    }

    public static void d(String str, String str2) {
        e(4, str, str2, null);
    }

    public static void e(int i, String str, String str2, Throwable th) {
        if (a == null || TextUtils.isEmpty(str2)) {
            return;
        }
        if (th != null) {
            str2 = str2 + '\n' + Log.getStackTraceString(th);
        }
        int length = str2.length();
        int i2 = length / 1100;
        if (i2 <= 0) {
            a.println(i, str, str2);
            return;
        }
        int i3 = 1100;
        a.println(i, str, str2.substring(0, 1100));
        int i4 = 1;
        while (i4 < i2) {
            int i5 = i3 + 1100;
            a.println(i, str, str2.substring(i3, i5));
            i4++;
            i3 = i5;
        }
        if (i3 != length) {
            a.println(i, str, str2.substring(i3, length));
        }
    }

    public static void f(IMspIPCLog iMspIPCLog) {
        a = iMspIPCLog;
    }

    public static void g(String str, String str2) {
        e(2, str, str2, null);
    }
}
