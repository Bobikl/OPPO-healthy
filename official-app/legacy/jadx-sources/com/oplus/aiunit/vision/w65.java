package com.oplus.aiunit.vision;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.AlphabetRegistrationException;
import org.scilab.forge.jlatexmath.FontAlreadyLoadedException;
import org.scilab.forge.jlatexmath.ResourceParseException;
import org.scilab.forge.jlatexmath.SymbolMappingNotFoundException;
import org.scilab.forge.jlatexmath.TextStyleMappingNotFoundException;
import org.scilab.forge.jlatexmath.XMLResourceParseException;

/* JADX INFO: loaded from: classes11.dex */
public class w65 implements spj {
    public static String[] h = null;
    public static Map<String, x73[]> i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Map<String, x73> f18136j = null;
    public static lw7[] k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Map<String, Float> f18137l = null;
    public static Map<String, Number> m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f18138n = true;
    public float a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18139c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18140e;
    public boolean f;
    public final float g;
    public static List<Character.UnicodeBlock> loadedAlphabets = new ArrayList();
    public static Map<Character.UnicodeBlock, z00> registeredAlphabets = new HashMap();

    static {
        k = new lw7[0];
        x65 x65Var = new x65();
        loadedAlphabets.add(Character.UnicodeBlock.of('a'));
        k = x65Var.j(k);
        f18137l = x65Var.m();
        i = x65Var.p();
        h = x65Var.h();
        f18136j = x65Var.o();
        Map<String, Number> mapL = x65Var.l();
        m = mapL;
        mapL.put("textfactor", 1);
        int iIntValue = m.get(x65.MUFONTID_ATTR).intValue();
        if (iIntValue >= 0) {
            lw7[] lw7VarArr = k;
            if (iIntValue < lw7VarArr.length && lw7VarArr[iIntValue] != null) {
                return;
            }
        }
        throw new XMLResourceParseException(x65.RESOURCE_NAME, x65.GEN_SET_EL, x65.MUFONTID_ATTR, "contains an unknown font id!");
    }

    public w65(float f) {
        this.a = 1.0f;
        this.b = false;
        this.f18139c = false;
        this.d = false;
        this.f18140e = false;
        this.f = false;
        this.g = f;
    }

    public static void P(z00 z00Var) {
        if (z00Var != null) {
            try {
                Q(z00Var.getPackage(), z00Var.b(), z00Var.a());
            } catch (AlphabetRegistrationException e2) {
                System.err.println(e2.toString());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }

    public static void Q(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) throws ResourceParseException {
        boolean z = false;
        for (int i2 = 0; !z && i2 < unicodeBlockArr.length; i2++) {
            z = loadedAlphabets.contains(unicodeBlockArr[i2]) || z;
        }
        if (z) {
            return;
        }
        wpj.f18348n = true;
        R(obj, pha.b(str), str);
        for (Character.UnicodeBlock unicodeBlock : unicodeBlockArr) {
            loadedAlphabets.add(unicodeBlock);
        }
        wpj.f18348n = false;
    }

    public static void R(Object obj, InputStream inputStream, String str) throws ResourceParseException {
        x65 x65Var = new x65(obj, inputStream, str);
        k = x65Var.j(k);
        x65Var.i();
        i.putAll(x65Var.p());
        f18136j.putAll(x65Var.o());
    }

    public static float U(String str) {
        Float f = f18137l.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static float V(int i2) {
        if (i2 < 2) {
            return 1.0f;
        }
        if (i2 < 4) {
            return m.get("textfactor").floatValue();
        }
        return i2 < 6 ? m.get("scriptfactor").floatValue() : m.get("scriptscriptfactor").floatValue();
    }

    public static void W(z00 z00Var) {
        for (Character.UnicodeBlock unicodeBlock : z00Var.b()) {
            registeredAlphabets.put(unicodeBlock, z00Var);
        }
    }

    public static void X(float f) {
        if (f18138n) {
            vpj.magFactor = f / 1000.0f;
        }
    }

    public static void Y(float f, float f2, float f3, float f4) {
        if (f18138n) {
            m.put("scriptfactor", Float.valueOf(Math.abs(f3 / f)));
            m.put("scriptscriptfactor", Float.valueOf(Math.abs(f4 / f)));
            m.put("textfactor", Float.valueOf(Math.abs(f2 / f)));
            vpj.defaultSize = Math.abs(f);
        }
    }

    @Override // com.oplus.aiunit.vision.spj
    public float A(int i2) {
        return U("num3") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float B(int i2) {
        return U("bigopspacing2") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public x73 C(x73 x73Var, x73 x73Var2) {
        int i2 = x73Var.b;
        if (i2 == x73Var2.b) {
            return k[i2].i(x73Var.a, x73Var2.a);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float D(int i2) {
        return U("bigopspacing4") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float E(int i2) {
        return U("bigopspacing3") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float F(int i2) {
        return U("bigopspacing5") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public u73 G(char c2, String str, int i2) throws TextStyleMappingNotFoundException {
        x73[] x73VarArr = i.get(str);
        if (x73VarArr != null) {
            return S(c2, x73VarArr, i2);
        }
        throw new TextStyleMappingNotFoundException(str);
    }

    @Override // com.oplus.aiunit.vision.spj
    public void H(boolean z) {
        this.b = z;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float I(int i2) {
        return U("sup1") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public oz6 J(u73 u73Var, int i2) {
        bw7 bw7VarD = u73Var.d();
        int iE = u73Var.e();
        float fV = V(i2);
        int[] iArrD = k[iE].d(u73Var.a());
        u73[] u73VarArr = new u73[iArrD.length];
        for (int i3 = 0; i3 < iArrD.length; i3++) {
            int i4 = iArrD[i3];
            if (i4 == -1) {
                u73VarArr[i3] = null;
            } else {
                u73VarArr[i3] = new u73((char) i4, bw7VarD, iE, T(new x73((char) i4, iE), fV));
            }
        }
        return new oz6(u73VarArr[0], u73VarArr[1], u73VarArr[2], u73VarArr[3]);
    }

    @Override // com.oplus.aiunit.vision.spj
    public boolean K(u73 u73Var) {
        return k[u73Var.e()].k(u73Var.a()) != null;
    }

    @Override // com.oplus.aiunit.vision.spj
    public int L() {
        return m.get(x65.MUFONTID_ATTR).intValue();
    }

    @Override // com.oplus.aiunit.vision.spj
    public float M(int i2) {
        return U("sup3") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float N(int i2) {
        return U("sup2") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float O(int i2) {
        return U("bigopspacing1") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    public final u73 S(char c2, x73[] x73VarArr, int i2) {
        char c3;
        int i3;
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
            c3 = 0;
        } else if (c2 >= 'a' && c2 <= 'z') {
            i3 = c2 - 'a';
            c3 = 2;
        } else if (c2 < 'A' || c2 > 'Z') {
            c3 = 3;
            i3 = c2;
        } else {
            i3 = c2 - 'A';
            c3 = 1;
        }
        x73 x73Var = x73VarArr[c3];
        return x73Var == null ? h(c2, i2) : q(new x73((char) (x73Var.a + i3), x73Var.b), i2);
    }

    public final pzb T(x73 x73Var, float f) {
        float[] fArrJ = k[x73Var.b].j(x73Var.a);
        return new pzb(fArrJ[0], fArrJ[1], fArrJ[2], fArrJ[3], f * tpj.PIXELS_PER_POINT, f);
    }

    @Override // com.oplus.aiunit.vision.spj
    public void a(boolean z) {
        this.f18140e = z;
    }

    @Override // com.oplus.aiunit.vision.spj
    public void b(boolean z) {
        this.f = z;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float c(int i2) {
        return U("subdrop") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public spj copy() {
        return new w65(this.g, this.a, this.b, this.f18139c, this.d, this.f18140e, this.f);
    }

    @Override // com.oplus.aiunit.vision.spj
    public float d(int i2) {
        return U("axisheight") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float e(int i2) {
        return k[m.get(x65.SPACEFONTID_ATTR).intValue()].o(V(i2) * tpj.PIXELS_PER_POINT);
    }

    @Override // com.oplus.aiunit.vision.spj
    public u73 f(u73 u73Var, int i2) {
        x73 x73VarK = k[u73Var.e()].k(u73Var.a());
        return new u73(x73VarK.a, k[x73VarK.b].e(), x73VarK.b, T(x73VarK, V(i2)));
    }

    @Override // com.oplus.aiunit.vision.spj
    public boolean g(u73 u73Var) {
        return k[u73Var.e()].d(u73Var.a()) != null;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float getScaleFactor() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float getSize() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.spj
    public u73 h(char c2, int i2) {
        if (c2 < '0' || c2 > '9') {
            return (c2 < 'a' || c2 > 'z') ? G(c2, h[1], i2) : G(c2, h[2], i2);
        }
        return G(c2, h[0], i2);
    }

    @Override // com.oplus.aiunit.vision.spj
    public float i(int i2) {
        return U("num1") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.spj
    public float j(x73 x73Var, int i2) {
        char cN = k[x73Var.b].n();
        if (cN == -1) {
            return 0.0f;
        }
        return p(x73Var, new x73(cN, x73Var.b), i2);
    }

    @Override // com.oplus.aiunit.vision.spj
    public void k(boolean z) {
        this.d = z;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float l(int i2) {
        return U("defaultrulethickness") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float m(int i2, int i3) {
        return k[i3].l(V(i2) * tpj.PIXELS_PER_POINT);
    }

    @Override // com.oplus.aiunit.vision.spj
    public void n(boolean z) {
        this.f18139c = z;
    }

    @Override // com.oplus.aiunit.vision.spj
    public boolean o(int i2) {
        return k[i2].s();
    }

    @Override // com.oplus.aiunit.vision.spj
    public float p(x73 x73Var, x73 x73Var2, int i2) {
        int i3 = x73Var.b;
        if (i3 == x73Var2.b) {
            return k[i3].h(x73Var.a, x73Var2.a, V(i2) * tpj.PIXELS_PER_POINT);
        }
        return 0.0f;
    }

    @Override // com.oplus.aiunit.vision.spj
    public u73 q(x73 x73Var, int i2) {
        float fV = V(i2);
        boolean z = this.b;
        int iG = z ? x73Var.f18518c : x73Var.b;
        lw7 lw7Var = k[iG];
        if (z && x73Var.b == x73Var.f18518c) {
            iG = lw7Var.c();
            lw7Var = k[iG];
            x73Var = new x73(x73Var.a, iG, i2);
        }
        if (this.f18139c) {
            iG = lw7Var.m();
            lw7Var = k[iG];
            x73Var = new x73(x73Var.a, iG, i2);
        }
        if (this.d) {
            iG = lw7Var.p();
            lw7Var = k[iG];
            x73Var = new x73(x73Var.a, iG, i2);
        }
        if (this.f18140e) {
            iG = lw7Var.q();
            lw7Var = k[iG];
            x73Var = new x73(x73Var.a, iG, i2);
        }
        if (this.f) {
            iG = lw7Var.g();
            lw7Var = k[iG];
            x73Var = new x73(x73Var.a, iG, i2);
        }
        return new u73(x73Var.a, lw7Var.e(), iG, T(x73Var, this.a * fV));
    }

    @Override // com.oplus.aiunit.vision.spj
    public float r(int i2) {
        return U("denom1") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public u73 s(String str, int i2) throws SymbolMappingNotFoundException {
        x73 x73Var = f18136j.get(str);
        if (x73Var != null) {
            return q(x73Var, i2);
        }
        throw new SymbolMappingNotFoundException(str);
    }

    @Override // com.oplus.aiunit.vision.spj
    public float t(int i2) {
        return V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float u(int i2) {
        return U("denom2") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float v(int i2) {
        return U("supdrop") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float w(int i2) {
        return U("sub2") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float x(int i2) {
        return U("num2") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    @Override // com.oplus.aiunit.vision.spj
    public float y(int i2, int i3) {
        return k[i3].r(V(i2) * tpj.PIXELS_PER_POINT);
    }

    @Override // com.oplus.aiunit.vision.spj
    public float z(int i2) {
        return U("sub1") * V(i2) * tpj.PIXELS_PER_POINT;
    }

    public w65(float f, float f2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.g = f;
        this.a = f2;
        this.b = z;
        this.f18139c = z2;
        this.d = z3;
        this.f18140e = z4;
        this.f = z5;
    }
}
