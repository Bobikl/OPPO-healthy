package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class buj extends w5 {
    public final auj a = new auj();

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            if (l8eVar.d() >= 4) {
                return di1.c();
            }
            int iC = l8eVar.c();
            CharSequence charSequenceB = l8eVar.b();
            return buj.j(charSequenceB, iC) ? di1.d(new buj()).b(charSequenceB.length()) : di1.c();
        }
    }

    public static boolean j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i4++;
                } else if (cCharAt == '-') {
                    i2++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        return th1.d();
    }
}
