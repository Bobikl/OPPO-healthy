package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class os0 {
    public static os0 a;

    public static os0 a() {
        if (a == null) {
            synchronized (os0.class) {
                if (a == null) {
                    a = new os0();
                }
            }
        }
        return a;
    }

    public int b(String str, String str2) {
        if (v13.h(str)) {
            return c(str2);
        }
        if (str2 == null) {
            return 0;
        }
        return e1j.f(e1j.e(str2.substring(2, str2.length() - 4)));
    }

    public final int c(String str) {
        int i = (int) (Long.parseLong(str.substring(0, 8), 16) - Long.parseLong(str.substring(12, 18), 16));
        t6b.b("parseShangHai", "balance:" + i);
        return i;
    }
}
