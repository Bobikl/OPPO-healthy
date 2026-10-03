package com.alipay.apmobilesecuritysdk.b;

import com.oplus.aiunit.vision.iqm;
import com.oplus.aiunit.vision.vam;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static a b = new a();
    public int a = 0;

    public static a a() {
        return b;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        String str;
        String strB = iqm.b();
        if (vam.f(strB)) {
            return strB;
        }
        int i = this.a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public final void a(int i) {
        this.a = i;
    }
}
