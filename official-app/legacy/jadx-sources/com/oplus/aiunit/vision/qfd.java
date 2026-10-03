package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes5.dex */
public class qfd implements wil.a {
    @Override // com.oplus.aiunit.vision.wil.a
    public void println(int i, String str, String str2) {
        if (i == 4) {
            a7b.f(str, str2);
        } else if (i == 5) {
            a7b.m(str, str2);
        } else {
            if (i != 6) {
                return;
            }
            a7b.b(str, str2);
        }
    }

    @Override // com.oplus.aiunit.vision.wil.a
    public void println(int i, String str, String str2, Throwable th) {
        println(i, str, str2 + a7b.e(th));
    }
}
