package com.oplus.aiunit.vision;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class snb extends gj0 {
    public static final int ALIGN = 2;
    public static final int ALIGNAT = 3;
    public static final int ALIGNED = 6;
    public static final int ALIGNEDAT = 7;
    public static final int ARRAY = 0;
    public static final int FLALIGN = 4;
    public static final int MATRIX = 1;
    public static final int SMALLMATRIX = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public bh0 f16657l;
    public int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map<Integer, g2l> f16658n;
    public int o;
    public boolean p;
    public boolean q;
    public static d4i hsep = new d4i(0, 1.0f, 0.0f, 0.0f);
    public static d4i semihsep = new d4i(0, 0.5f, 0.0f, 0.0f);
    public static d4i vsep_in = new d4i(1, 0.0f, 1.0f, 0.0f);
    public static d4i vsep_ext_top = new d4i(1, 0.0f, 0.4f, 0.0f);
    public static d4i vsep_ext_bot = new d4i(1, 0.0f, 0.4f, 0.0f);
    public static final t22 r = new s1j(0.0f, 0.0f, 0.0f, 0.0f);
    public static d4i t = new d4i(2);

    public snb(boolean z, bh0 bh0Var, String str, boolean z2) {
        this.f16658n = new HashMap();
        this.p = z;
        this.f16657l = bh0Var;
        this.o = 0;
        this.q = z2;
        j(new StringBuffer(str));
    }

    /* JADX WARN: Code duplicated, block: B:87:0x032b  */
    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        rpj rpjVar2;
        float f;
        t22 t22Var;
        int i;
        af9 af9Var;
        boolean zK;
        int i2;
        boolean z;
        int i3;
        gj0 gj0Var;
        bh0 bh0Var = this.f16657l;
        int i4 = bh0Var.i;
        int i5 = bh0Var.h;
        t22[][] t22VarArr = (t22[][]) Array.newInstance((Class<?>) t22.class, i4, i5);
        float[] fArr = new float[i4];
        float[] fArr2 = new float[i4];
        float[] fArr3 = new float[i5];
        float fL = rpjVar.n().l(rpjVar.m());
        if (this.o == 5) {
            rpj rpjVarA = rpjVar.a();
            rpjVarA.z(4);
            rpjVar2 = rpjVarA;
        } else {
            rpjVar2 = rpjVar;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (true) {
            f = 0.0f;
            if (i6 >= i4) {
                break;
            }
            fArr[i6] = 0.0f;
            fArr2[i6] = 0.0f;
            int i7 = 0;
            while (i7 < i5) {
                try {
                    gj0Var = this.f16657l.g.get(i6).get(i7);
                } catch (Exception unused) {
                    t22VarArr[i6][i7 - 1].h = 11;
                    i7 = i5 - 1;
                    gj0Var = null;
                }
                t22VarArr[i6][i7] = gj0Var == null ? r : gj0Var.c(rpjVar2);
                fArr[i6] = Math.max(t22VarArr[i6][i7].g(), fArr[i6]);
                fArr2[i6] = Math.max(t22VarArr[i6][i7].h(), fArr2[i6]);
                t22 t22Var2 = t22VarArr[i6][i7];
                if (t22Var2.h != 12) {
                    fArr3[i7] = Math.max(t22Var2.k(), fArr3[i7]);
                } else {
                    h8c h8cVar = (h8c) gj0Var;
                    h8cVar.q(i6, i7);
                    arrayList.add(h8cVar);
                }
                i7++;
            }
            i6++;
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            h8c h8cVar2 = (h8c) arrayList.get(i8);
            int iF = h8cVar2.f();
            int i9 = h8cVar2.i();
            int iJ = h8cVar2.j();
            int i10 = iF;
            float f2 = f;
            while (true) {
                i3 = iF + iJ;
                if (i10 >= i3) {
                    break;
                }
                f2 += fArr3[i10];
                i10++;
            }
            if (t22VarArr[i9][iF].k() > f2) {
                float fK = (t22VarArr[i9][iF].k() - f2) / iJ;
                while (iF < i3) {
                    fArr3[iF] = fArr3[iF] + fK;
                    iF++;
                }
            }
            i8++;
            f = 0.0f;
        }
        float f3 = 0.0f;
        for (int i11 = 0; i11 < i5; i11++) {
            f3 += fArr3[i11];
        }
        t22[] t22VarArrI = i(rpjVar2, f3);
        float fK2 = f3;
        for (int i12 = 0; i12 < i5 + 1; i12++) {
            fK2 += t22VarArrI[i12].k();
            if (this.f16658n.get(Integer.valueOf(i12)) != null) {
                fK2 += this.f16658n.get(Integer.valueOf(i12)).f(rpjVar2);
            }
        }
        tvk tvkVar = new tvk();
        t22 t22VarC = vsep_in.c(rpjVar2);
        tvkVar.b(vsep_ext_top.c(rpjVar2));
        int i13 = 0;
        while (i13 < i4) {
            af9 af9Var2 = new af9();
            int i14 = 0;
            while (i14 < i5) {
                tvk tvkVar2 = tvkVar;
                int i15 = t22VarArr[i13][i14].h;
                int i16 = i4;
                t22[] t22VarArr2 = t22VarArrI;
                if (i15 != -1) {
                    switch (i15) {
                        case 11:
                            z = false;
                            float fP = rpjVar2.p();
                            if (fP == Float.POSITIVE_INFINITY) {
                                fP = fArr3[i14];
                            }
                            af9 af9Var3 = new af9(t22VarArr[i13][i14], fP, 0);
                            i14 = i5 - 1;
                            af9Var2 = af9Var3;
                            fArr3 = fArr3;
                            tvkVar2 = tvkVar2;
                            i2 = 1;
                            break;
                        case 12:
                            i = 0;
                            break;
                        case 13:
                            t99 t99Var = (t99) this.f16657l.g.get(i13).get(i14);
                            t99Var.i(fK2);
                            if (i13 < 1 || !(this.f16657l.g.get(i13 - 1).get(i14) instanceof t99)) {
                                z = false;
                                t99Var.f((-t22VarC.h()) / 2.0f);
                            } else {
                                z = false;
                                af9Var2.b(new s1j(0.0f, fL * 2.0f, 0.0f, 0.0f));
                                t99Var.f(((-t22VarC.h()) / 2.0f) + fL);
                            }
                            af9Var2.b(t99Var.c(rpjVar2));
                            i14 = i5;
                            fArr3 = fArr3;
                            tvkVar2 = tvkVar2;
                            i2 = 1;
                            break;
                        default:
                            t22VarC = t22VarC;
                            fK2 = fK2;
                            fArr3 = fArr3;
                            i2 = 1;
                            tvkVar2 = tvkVar2;
                            break;
                    }
                    i14 += i2;
                    tvkVar = tvkVar2;
                    fK2 = fK2;
                    i4 = i16;
                    t22VarArrI = t22VarArr2;
                    fArr3 = fArr3;
                    t22VarC = t22VarC;
                } else {
                    i = 0;
                }
                if (i14 == 0) {
                    if (this.f16658n.get(Integer.valueOf(i)) != null) {
                        g2l g2lVar = this.f16658n.get(Integer.valueOf(i));
                        g2lVar.i(fArr2[i13] + fArr[i13] + t22VarC.h());
                        g2lVar.j(fArr[i13] + (t22VarC.h() / 2.0f));
                        t22 t22VarC2 = g2lVar.c(rpjVar2);
                        af9Var2.b(new af9(t22VarC2, t22VarArr2[0].k() + t22VarC2.k(), 0));
                    } else {
                        af9Var2.b(t22VarArr2[i]);
                    }
                }
                if (t22VarArr[i13][i14].h == -1) {
                    af9Var2.b(new af9(t22VarArr[i13][i14], fArr3[i14], this.m[i14]));
                    af9Var = af9Var2;
                    zK = true;
                } else {
                    int i17 = i14;
                    af9Var = af9Var2;
                    int i18 = i13;
                    t22 t22VarF = f(rpjVar2, t22VarArr2, fArr3, i18, i17);
                    i13 = i18;
                    h8c h8cVar3 = (h8c) this.f16657l.g.get(i13).get(i17);
                    int iJ2 = (h8cVar3.j() - 1) + i17;
                    af9Var.b(t22VarF);
                    zK = h8cVar3.k();
                    i14 = iJ2;
                }
                if (zK) {
                    int i19 = i14 + 1;
                    if (this.f16658n.get(Integer.valueOf(i19)) != null) {
                        g2l g2lVar2 = this.f16658n.get(Integer.valueOf(i19));
                        g2lVar2.i(fArr2[i13] + fArr[i13] + t22VarC.h());
                        g2lVar2.j(fArr[i13] + (t22VarC.h() / 2.0f));
                        t22 t22VarC3 = g2lVar2.c(rpjVar2);
                        if (i14 < i5 - 1) {
                            af9Var.b(new af9(t22VarC3, t22VarArr2[i19].k() + t22VarC3.k(), 2));
                        } else {
                            af9Var.b(new af9(t22VarC3, t22VarArr2[i19].k() + t22VarC3.k(), 1));
                        }
                    } else {
                        af9Var.b(t22VarArr2[i14 + 1]);
                    }
                } else {
                    af9Var.b(t22VarArr2[i14 + 1]);
                }
                af9Var2 = af9Var;
                i2 = 1;
                i14 += i2;
                tvkVar = tvkVar2;
                fK2 = fK2;
                i4 = i16;
                t22VarArrI = t22VarArr2;
                fArr3 = fArr3;
                t22VarC = t22VarC;
            }
            t22 t22Var3 = t22VarC;
            float f4 = fK2;
            int i20 = i4;
            float[] fArr4 = fArr3;
            t22[] t22VarArr3 = t22VarArrI;
            af9 af9Var4 = af9Var2;
            tvk tvkVar3 = tvkVar;
            if (t22VarArr[i13][0].h != 13) {
                af9Var4.n(fArr2[i13]);
                af9Var4.m(fArr[i13]);
                tvkVar3.b(af9Var4);
                t22Var = t22Var3;
                if (i13 < i20 - 1) {
                    tvkVar3.b(t22Var);
                }
            } else {
                t22Var = t22Var3;
                tvkVar3.b(af9Var4);
            }
            i13++;
            t22VarC = t22Var;
            tvkVar = tvkVar3;
            fK2 = f4;
            i4 = i20;
            t22VarArrI = t22VarArr3;
            fArr3 = fArr4;
        }
        tvk tvkVar4 = tvkVar;
        tvkVar4.b(vsep_ext_bot.c(rpjVar2));
        float fH = tvkVar4.h() + tvkVar4.g();
        float fD = rpjVar2.n().d(rpjVar2.m());
        float f5 = fH / 2.0f;
        tvkVar4.n(f5 + fD);
        tvkVar4.m(f5 - fD);
        return tvkVar4;
    }

    public final t22 f(rpj rpjVar, t22[] t22VarArr, float[] fArr, int i, int i2) {
        h8c h8cVar = (h8c) this.f16657l.g.get(i).get(i2);
        int iJ = h8cVar.j();
        int i3 = i2;
        float fK = 0.0f;
        while (i3 < (i2 + iJ) - 1) {
            float f = fArr[i3];
            i3++;
            fK += f + t22VarArr[i3].k();
            if (this.f16658n.get(Integer.valueOf(i3)) != null) {
                fK += this.f16658n.get(Integer.valueOf(i3)).f(rpjVar);
            }
        }
        float f2 = fK + fArr[i3];
        h8cVar.r(h8cVar.c(rpjVar).k() <= f2 ? f2 : 0.0f);
        return h8cVar.c(rpjVar);
    }

    public t22[] i(rpj rpjVar, float f) {
        int i = this.f16657l.h;
        t22[] t22VarArr = new t22[i + 1];
        float fP = rpjVar.p();
        int i2 = this.o;
        if (i2 == 6 || i2 == 7) {
            fP = Float.POSITIVE_INFINITY;
        }
        int i3 = 2;
        int i4 = 1;
        switch (i2) {
            case 0:
                if (this.m[0] == 5) {
                    t22VarArr[1] = new s1j(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    i3 = 1;
                }
                if (this.q) {
                    t22VarArr[0] = semihsep.c(rpjVar);
                } else {
                    t22VarArr[0] = new s1j(0.0f, 0.0f, 0.0f, 0.0f);
                }
                t22VarArr[i] = t22VarArr[0];
                t22 t22VarC = hsep.c(rpjVar);
                while (i3 < i) {
                    if (this.m[i3] == 5) {
                        s1j s1jVar = new s1j(0.0f, 0.0f, 0.0f, 0.0f);
                        t22VarArr[i3] = s1jVar;
                        i3++;
                        t22VarArr[i3] = s1jVar;
                    } else {
                        t22VarArr[i3] = t22VarC;
                    }
                    i3++;
                }
                return t22VarArr;
            case 1:
            case 5:
                t22 t22Var = r;
                t22VarArr[0] = t22Var;
                t22VarArr[i] = t22Var;
                t22 t22VarC2 = hsep.c(rpjVar);
                while (i4 < i) {
                    t22VarArr[i4] = t22VarC2;
                    i4++;
                }
                return t22VarArr;
            case 2:
            case 6:
                t22 t22VarC3 = t.c(rpjVar);
                t22 s1jVar2 = fP != Float.POSITIVE_INFINITY ? new s1j(Math.max(((fP - f) - ((i / 2) * t22VarC3.k())) / ((float) Math.floor((i + 3) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.c(rpjVar);
                t22VarArr[i] = s1jVar2;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 % 2 == 0) {
                        t22VarArr[i5] = s1jVar2;
                    } else {
                        t22VarArr[i5] = t22VarC3;
                    }
                }
                break;
            case 3:
            case 7:
                float fMax = fP != Float.POSITIVE_INFINITY ? Math.max((fP - f) / 2.0f, 0.0f) : 0.0f;
                t22 t22VarC4 = t.c(rpjVar);
                t22 t22Var2 = r;
                s1j s1jVar3 = new s1j(fMax, 0.0f, 0.0f, 0.0f);
                t22VarArr[0] = s1jVar3;
                t22VarArr[i] = s1jVar3;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        t22VarArr[i4] = t22Var2;
                    } else {
                        t22VarArr[i4] = t22VarC4;
                    }
                    i4++;
                }
                break;
            case 4:
                t22 t22VarC5 = t.c(rpjVar);
                t22 s1jVar4 = fP != Float.POSITIVE_INFINITY ? new s1j(Math.max(((fP - f) - ((i / 2) * t22VarC5.k())) / ((float) Math.floor((i - 1) / 2)), 0.0f), 0.0f, 0.0f, 0.0f) : hsep.c(rpjVar);
                t22 t22Var3 = r;
                t22VarArr[0] = t22Var3;
                t22VarArr[i] = t22Var3;
                while (i4 < i) {
                    if (i4 % 2 == 0) {
                        t22VarArr[i4] = s1jVar4;
                    } else {
                        t22VarArr[i4] = t22VarC5;
                    }
                    i4++;
                }
                break;
        }
        if (fP == Float.POSITIVE_INFINITY) {
            t22 t22Var4 = r;
            t22VarArr[0] = t22Var4;
            t22VarArr[i] = t22Var4;
        }
        return t22VarArr;
    }

    public final void j(StringBuffer stringBuffer) {
        int iU;
        int length = stringBuffer.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < length) {
            char cCharAt = stringBuffer.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    int i2 = i + 1;
                    wpj wpjVar = new wpj(this.p, stringBuffer.substring(i2), new tpj(), false);
                    String[] strArrS = wpjVar.s(2, 0);
                    iU = i2 + wpjVar.u();
                    int i3 = Integer.parseInt(strArrS[1]);
                    String str = "";
                    for (int i4 = 0; i4 < i3; i4++) {
                        str = str + strArrS[2];
                    }
                    stringBuffer.insert(iU, str);
                    length = stringBuffer.length();
                } else if (cCharAt == '@') {
                    int i5 = i + 1;
                    wpj wpjVar2 = new wpj(this.p, stringBuffer.substring(i5), new tpj(), false);
                    gj0 gj0VarG = wpjVar2.g();
                    this.f16657l.h++;
                    int i6 = 0;
                    while (true) {
                        bh0 bh0Var = this.f16657l;
                        if (i6 >= bh0Var.i) {
                            break;
                        }
                        bh0Var.g.get(i6).add(arrayList.size(), gj0VarG);
                        i6++;
                    }
                    arrayList.add(5);
                    iU = i5 + wpjVar2.u();
                } else if (cCharAt == 'c') {
                    arrayList.add(2);
                } else if (cCharAt == 'l') {
                    arrayList.add(0);
                } else if (cCharAt == 'r') {
                    arrayList.add(1);
                } else if (cCharAt != '|') {
                    arrayList.add(2);
                } else {
                    int i7 = 1;
                    while (true) {
                        i++;
                        if (i >= length) {
                            break;
                        }
                        if (stringBuffer.charAt(i) != '|') {
                            i--;
                            break;
                        }
                        i7++;
                    }
                    this.f16658n.put(Integer.valueOf(arrayList.size()), new g2l(i7));
                }
                i = iU - 1;
            }
            i++;
        }
        for (int size = arrayList.size(); size < this.f16657l.h; size++) {
            arrayList.add(2);
        }
        if (arrayList.size() == 0) {
            this.m = new int[]{2};
            return;
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.m = new int[numArr.length];
        for (int i8 = 0; i8 < numArr.length; i8++) {
            this.m[i8] = numArr[i8].intValue();
        }
    }

    public snb(boolean z, bh0 bh0Var, String str) {
        this(z, bh0Var, str, false);
    }

    public snb(boolean z, bh0 bh0Var, int i) {
        this(z, bh0Var, i, false);
    }

    public snb(boolean z, bh0 bh0Var, int i, boolean z2) {
        this.f16658n = new HashMap();
        this.p = z;
        this.f16657l = bh0Var;
        this.o = i;
        this.q = z2;
        if (i != 1 && i != 5) {
            this.m = new int[bh0Var.h];
            int i2 = 0;
            while (true) {
                int i3 = this.f16657l.h;
                if (i2 >= i3) {
                    return;
                }
                int[] iArr = this.m;
                iArr[i2] = 1;
                int i4 = i2 + 1;
                if (i4 < i3) {
                    iArr[i4] = 0;
                }
                i2 += 2;
            }
        } else {
            this.m = new int[bh0Var.h];
            for (int i5 = 0; i5 < this.f16657l.h; i5++) {
                this.m[i5] = 2;
            }
        }
    }
}
