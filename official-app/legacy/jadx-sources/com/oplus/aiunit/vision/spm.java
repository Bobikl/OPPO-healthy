package com.oplus.aiunit.vision;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes10.dex */
public class spm {
    public static spm a;

    public static synchronized spm a() {
        if (a == null) {
            a = new spm();
        }
        return a;
    }

    public void b(int i, String str, String str2, String str3, String str4, Long l2, int i2, int i3, String str5) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - l2.longValue();
        if (l2.longValue() == 0 || jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        StringBuffer stringBuffer = new StringBuffer("https://huatuocode.huatuo.qq.com");
        stringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=");
        stringBuffer.append(i);
        stringBuffer.append("&code=");
        stringBuffer.append(i2);
        stringBuffer.append("&time=");
        stringBuffer.append(jElapsedRealtime);
        stringBuffer.append("&rate=");
        stringBuffer.append(i3);
        stringBuffer.append("&uin=");
        stringBuffer.append(str2);
        stringBuffer.append("&data=");
        rxm.b().f(stringBuffer.toString(), "GET", com.tencent.open.utils.b.e(String.valueOf(i), String.valueOf(i2), String.valueOf(jElapsedRealtime), String.valueOf(i3), str, str2, str3, str4, str5), true);
    }

    public void c(String str, String str2, String str3, String str4, String str5, String str6) {
        rxm.b().c(com.tencent.open.utils.b.d(str, str3, str4, str5, str2, str6), str2, true);
    }

    public void d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        rxm.b().c(com.tencent.open.utils.b.f(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
