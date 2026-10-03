package com.oplus.aiunit.vision;

import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes11.dex */
public class kj8 extends w5 {
    public final jj8 a;
    public final String b;

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            CharSequence charSequenceB;
            if (l8eVar.d() >= m8e.CODE_BLOCK_INDENT) {
                return di1.c();
            }
            CharSequence charSequenceB2 = l8eVar.b();
            int iC = l8eVar.c();
            kj8 kj8VarK = kj8.k(charSequenceB2, iC);
            if (kj8VarK != null) {
                return di1.d(kj8VarK).b(charSequenceB2.length());
            }
            int iL = kj8.l(charSequenceB2, iC);
            return (iL <= 0 || (charSequenceB = hhbVar.b()) == null) ? di1.c() : di1.d(new kj8(iL, charSequenceB.toString())).b(charSequenceB2.length()).e();
        }
    }

    public kj8(int i, String str) {
        jj8 jj8Var = new jj8();
        this.a = jj8Var;
        jj8Var.o(i);
        this.b = str;
    }

    public static kj8 k(CharSequence charSequence, int i) {
        int iK = m8e.k('#', charSequence, i, charSequence.length()) - i;
        if (iK == 0 || iK > 6) {
            return null;
        }
        int i2 = i + iK;
        if (i2 >= charSequence.length()) {
            return new kj8(iK, "");
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iN = m8e.n(charSequence, charSequence.length() - 1, i2);
        int iL = m8e.l('#', charSequence, iN, i2);
        int iN2 = m8e.n(charSequence, iL, i2);
        return iN2 != iL ? new kj8(iK, charSequence.subSequence(i2, iN2 + 1).toString()) : new kj8(iK, charSequence.subSequence(i2, iN + 1).toString());
    }

    public static int l(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (m(charSequence, i + 1, kam.h)) {
                return 1;
            }
        }
        return m(charSequence, i + 1, Soundex.SILENT_MARKER) ? 2 : 0;
    }

    public static boolean m(CharSequence charSequence, int i, char c2) {
        return m8e.m(charSequence, m8e.k(c2, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void f(h8a h8aVar) {
        h8aVar.e(this.b, this.a);
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        return th1.d();
    }
}
