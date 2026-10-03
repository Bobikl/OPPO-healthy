package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class zh1 extends w5 {
    public final yh1 a = new yh1();

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            int iC = l8eVar.c();
            if (!zh1.k(l8eVar, iC)) {
                return di1.c();
            }
            int column = l8eVar.getColumn() + l8eVar.d() + 1;
            if (m8e.i(l8eVar.b(), iC + 1)) {
                column++;
            }
            return di1.d(new zh1()).a(column);
        }
    }

    public static boolean k(l8e l8eVar, int i) {
        CharSequence charSequenceB = l8eVar.b();
        return l8eVar.d() < m8e.CODE_BLOCK_INDENT && i < charSequenceB.length() && charSequenceB.charAt(i) == '>';
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean a(qh1 qh1Var) {
        return true;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean b() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        int iC = l8eVar.c();
        if (!k(l8eVar, iC)) {
            return th1.d();
        }
        int column = l8eVar.getColumn() + l8eVar.d() + 1;
        if (m8e.i(l8eVar.b(), iC + 1)) {
            column++;
        }
        return th1.a(column);
    }

    @Override // com.oplus.aiunit.vision.wh1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public yh1 d() {
        return this.a;
    }
}
