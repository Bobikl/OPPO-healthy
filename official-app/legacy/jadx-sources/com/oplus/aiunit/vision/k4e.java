package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class k4e {

    public interface a {
        String a(int i);
    }

    public static void a(String str, String str2, int i, int i2, a aVar) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < i) {
            sb.append(aVar.a(i3));
            i3++;
            if (i3 % i2 == 0) {
                a7b.f(str, str2 + " pageIndex=" + i3 + " data=" + sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            a7b.f(str, str2 + " pageIndex=" + i3 + " data=" + sb.toString());
        }
    }
}
