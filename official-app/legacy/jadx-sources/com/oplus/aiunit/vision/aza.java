package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class aza extends w5 {
    public final zya a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9532c;

    public static class a extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            wh1 wh1VarA = hhbVar.a();
            if (l8eVar.d() >= m8e.CODE_BLOCK_INDENT) {
                return di1.c();
            }
            b bVarN = aza.n(l8eVar.b(), l8eVar.c(), l8eVar.getColumn() + l8eVar.d(), hhbVar.b() != null);
            if (bVarN == null) {
                return di1.c();
            }
            int i = bVarN.b;
            hza hzaVar = new hza(i - l8eVar.getColumn());
            if ((wh1VarA instanceof aza) && aza.m((zya) wh1VarA.d(), bVarN.a)) {
                return di1.d(hzaVar).a(i);
            }
            aza azaVar = new aza(bVarN.a);
            bVarN.a.o(true);
            return di1.d(azaVar, hzaVar).a(i);
        }
    }

    public static class b {
        public final zya a;
        public final int b;

        public b(zya zyaVar, int i) {
            this.a = zyaVar;
            this.b = i;
        }
    }

    public static class c {
        public final zya a;
        public final int b;

        public c(zya zyaVar, int i) {
            this.a = zyaVar;
            this.b = i;
        }
    }

    public aza(zya zyaVar) {
        this.a = zyaVar;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean l(CharSequence charSequence, int i) {
        char cCharAt;
        return i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\t' || cCharAt == ' ';
    }

    public static boolean m(zya zyaVar, zya zyaVar2) {
        if ((zyaVar instanceof o82) && (zyaVar2 instanceof o82)) {
            return k(Character.valueOf(((o82) zyaVar).p()), Character.valueOf(((o82) zyaVar2).p()));
        }
        if ((zyaVar instanceof nrd) && (zyaVar2 instanceof nrd)) {
            return k(Character.valueOf(((nrd) zyaVar).p()), Character.valueOf(((nrd) zyaVar2).p()));
        }
        return false;
    }

    public static b n(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        c cVarO = o(charSequence, i);
        if (cVarO == null) {
            return null;
        }
        zya zyaVar = cVarO.a;
        int i3 = cVarO.b;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int iA = i4;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z2 = true;
                    break;
                }
                iA++;
            } else {
                iA += m8e.a(iA);
            }
            i3++;
        }
        if (z && (((zyaVar instanceof nrd) && ((nrd) zyaVar).q() != 1) || !z2)) {
            return null;
        }
        if (!z2 || iA - i4 > m8e.CODE_BLOCK_INDENT) {
            iA = i4 + 1;
        }
        return new b(zyaVar, iA);
    }

    public static c o(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return p(charSequence, i);
        }
        int i2 = i + 1;
        if (!l(charSequence, i2)) {
            return null;
        }
        o82 o82Var = new o82();
        o82Var.q(cCharAt);
        return new c(o82Var, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:5:0x0009  */
    public static c p(CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        for (int i4 = i; i4 < length; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt != ')' || cCharAt == '.') {
                if (i3 >= 1) {
                    i2 = i4 + 1;
                    if (l(charSequence, i2)) {
                        String string = charSequence.subSequence(i, i4).toString();
                        nrd nrdVar = new nrd();
                        nrdVar.s(Integer.parseInt(string));
                        nrdVar.r(cCharAt);
                        return new c(nrdVar, i2);
                    }
                }
                return null;
            }
            switch (cCharAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i3++;
                    if (i3 > 9) {
                        return null;
                    }
                    break;
                    break;
                default:
                    return null;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 != ')') {
                }
                if (i3 >= 1) {
                    i2 = i4 + 1;
                    if (l(charSequence, i2)) {
                        String string2 = charSequence.subSequence(i, i4).toString();
                        nrd nrdVar2 = new nrd();
                        nrdVar2.s(Integer.parseInt(string2));
                        nrdVar2.r(cCharAt2);
                        return new c(nrdVar2, i2);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean a(qh1 qh1Var) {
        if (!(qh1Var instanceof fza)) {
            return false;
        }
        if (this.b && this.f9532c == 1) {
            this.a.o(false);
            this.b = false;
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean b() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        if (l8eVar.a()) {
            this.b = true;
            this.f9532c = 0;
        } else if (this.b) {
            this.f9532c++;
        }
        return th1.b(l8eVar.getIndex());
    }
}
