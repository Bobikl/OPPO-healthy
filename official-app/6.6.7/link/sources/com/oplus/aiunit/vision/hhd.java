package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hhd implements uml.a {
    @Override // com.oplus.aiunit.vision.uml.a
    public void println(int i, String str, String str2) {
        if (i == 4) {
            m8b.f(str, str2);
        } else if (i == 5) {
            m8b.m(str, str2);
        } else {
            if (i != 6) {
                return;
            }
            m8b.b(str, str2);
        }
    }

    @Override // com.oplus.aiunit.vision.uml.a
    public void println(int i, String str, String str2, Throwable th) {
        println(i, str, str2 + m8b.e(th));
    }
}
