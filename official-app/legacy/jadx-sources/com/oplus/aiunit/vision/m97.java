package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class m97 extends w5 {
    public final l97 a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f13988c;

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            int iD = l8eVar.d();
            if (iD >= m8e.CODE_BLOCK_INDENT) {
                return di1.c();
            }
            int iC = l8eVar.c();
            m97 m97VarK = m97.k(l8eVar.b(), iC, iD);
            return m97VarK != null ? di1.d(m97VarK).b(iC + m97VarK.a.p()) : di1.c();
        }
    }

    public m97(char c2, int i, int i2) {
        l97 l97Var = new l97();
        this.a = l97Var;
        this.f13988c = new StringBuilder();
        l97Var.s(c2);
        l97Var.u(i);
        l97Var.t(i2);
    }

    public static m97 k(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (m8e.b('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new m97('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new m97('~', i4, i2);
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
        } else {
            this.f13988c.append(charSequence);
            this.f13988c.append('\n');
        }
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void g() {
        this.a.v(up6.e(this.b.trim()));
        this.a.w(this.f13988c.toString());
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        int iC = l8eVar.c();
        int index = l8eVar.getIndex();
        CharSequence charSequenceB = l8eVar.b();
        if (l8eVar.d() < m8e.CODE_BLOCK_INDENT && l(charSequenceB, iC)) {
            return th1.c();
        }
        int length = charSequenceB.length();
        for (int iO = this.a.o(); iO > 0 && index < length && charSequenceB.charAt(index) == ' '; iO--) {
            index++;
        }
        return th1.b(index);
    }

    public final boolean l(CharSequence charSequence, int i) {
        char cN = this.a.n();
        int iP = this.a.p();
        int iK = m8e.k(cN, charSequence, i, charSequence.length()) - i;
        return iK >= iP && m8e.m(charSequence, i + iK, charSequence.length()) == charSequence.length();
    }
}
