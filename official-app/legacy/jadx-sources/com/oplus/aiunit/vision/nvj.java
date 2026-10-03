package com.oplus.aiunit.vision;

import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public final class nvj {
    public static void a(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            ml4.a("WES_Service.", str + ": " + str2);
            return;
        }
        ml4.a("WES_Service.", str + ": " + String.format(Locale.US, str2, objArr));
    }

    public static void b(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            ml4.c("WES_Service.", str + ": " + str2);
            return;
        }
        ml4.c("WES_Service.", str + ": " + String.format(Locale.US, str2, objArr));
    }

    public static void c(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            ml4.d("WES_Service.", str + ": " + str2);
            return;
        }
        ml4.d("WES_Service.", str + ": " + String.format(Locale.US, str2, objArr));
    }

    public static void d(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            ml4.e("WES_Service.", str + ": " + str2);
            return;
        }
        ml4.e("WES_Service.", str + ": " + String.format(Locale.US, str2, objArr));
    }
}
