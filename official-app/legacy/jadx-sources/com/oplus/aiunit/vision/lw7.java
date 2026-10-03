package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import p010kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public class lw7 {
    public static final int NUMBER_OF_CHAR_CODES = 256;
    public static Map<Integer, lw7> z = new HashMap();
    public final int a;
    public bw7 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13857c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13858e;
    public float[][] h;
    public x73[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[][] f13859j;
    public HashMap<Character, Character> k;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f13861n;
    public final float o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final Map<a, Character> f = new HashMap();
    public final Map<a, Float> g = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public char f13860l = CharCompanionObject.MAX_VALUE;

    public class a {
        public final char a;
        public final char b;

        public a(char c2, char c3) {
            this.a = c2;
            this.b = c3;
        }

        public boolean equals(Object obj) {
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a + this.b) % 128;
        }
    }

    public lw7(int i, Object obj, String str, String str2, int i2, float f, float f2, float f3, String str3, String str4, String str5, String str6, String str7) {
        this.k = null;
        this.a = i;
        this.f13857c = obj;
        this.d = str;
        this.f13858e = str2;
        this.m = f;
        this.f13861n = f2;
        this.o = f3;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = str6;
        this.y = str7;
        if (i2 != 0) {
            this.k = new HashMap<>(i2);
        } else {
            i2 = 256;
        }
        this.h = new float[i2][];
        this.i = new x73[i2];
        this.f13859j = new int[i2][];
        z.put(Integer.valueOf(i), this);
    }

    public static bw7 f(int i) {
        return z.get(Integer.valueOf(i)).e();
    }

    public void A(int i) {
        if (i == -1) {
            i = this.a;
        }
        this.r = i;
    }

    public void B(int i) {
        if (i == -1) {
            i = this.a;
        }
        this.s = i;
    }

    public void a(char c2, char c3, float f) {
        this.g.put(new a(c2, c3), new Float(f));
    }

    public void b(char c2, char c3, char c4) {
        this.f.put(new a(c2, c3), new Character(c4));
    }

    public int c() {
        return this.p;
    }

    public int[] d(char c2) {
        HashMap<Character, Character> map = this.k;
        return map == null ? this.f13859j[c2] : this.f13859j[map.get(Character.valueOf(c2)).charValue()];
    }

    public bw7 e() {
        if (this.b == null) {
            if (this.f13857c == null) {
                this.b = x65.b(this.d);
            } else {
                this.b = x65.b(this.d);
            }
        }
        return this.b;
    }

    public int g() {
        return this.t;
    }

    public float h(char c2, char c3, float f) {
        Float f2 = this.g.get(new a(c2, c3));
        if (f2 == null) {
            return 0.0f;
        }
        return f2.floatValue() * f;
    }

    public x73 i(char c2, char c3) {
        Character ch = this.f.get(new a(c2, c3));
        if (ch == null) {
            return null;
        }
        return new x73(ch.charValue(), this.a);
    }

    public float[] j(char c2) {
        HashMap<Character, Character> map = this.k;
        return map == null ? this.h[c2] : this.h[map.get(Character.valueOf(c2)).charValue()];
    }

    public x73 k(char c2) {
        HashMap<Character, Character> map = this.k;
        return map == null ? this.i[c2] : this.i[map.get(Character.valueOf(c2)).charValue()];
    }

    public float l(float f) {
        return this.o * f;
    }

    public int m() {
        return this.q;
    }

    public char n() {
        return this.f13860l;
    }

    public float o(float f) {
        return this.f13861n * f;
    }

    public int p() {
        return this.r;
    }

    public int q() {
        return this.s;
    }

    public float r(float f) {
        return this.m * f;
    }

    public boolean s() {
        return this.f13861n > 1.0E-7f;
    }

    public void t(int i) {
        if (i == -1) {
            i = this.a;
        }
        this.p = i;
    }

    public void u(char c2, int[] iArr) {
        HashMap<Character, Character> map = this.k;
        if (map == null) {
            this.f13859j[c2] = iArr;
        } else {
            if (map.containsKey(Character.valueOf(c2))) {
                this.f13859j[this.k.get(Character.valueOf(c2)).charValue()] = iArr;
                return;
            }
            char size = (char) this.k.size();
            this.k.put(Character.valueOf(c2), Character.valueOf(size));
            this.f13859j[size] = iArr;
        }
    }

    public void v(int i) {
        if (i == -1) {
            i = this.a;
        }
        this.t = i;
    }

    public void w(char c2, float[] fArr) {
        HashMap<Character, Character> map = this.k;
        if (map == null) {
            this.h[c2] = fArr;
        } else {
            if (map.containsKey(Character.valueOf(c2))) {
                this.h[this.k.get(Character.valueOf(c2)).charValue()] = fArr;
                return;
            }
            char size = (char) this.k.size();
            this.k.put(Character.valueOf(c2), Character.valueOf(size));
            this.h[size] = fArr;
        }
    }

    public void x(char c2, char c3, int i) {
        HashMap<Character, Character> map = this.k;
        if (map == null) {
            this.i[c2] = new x73(c3, i);
        } else {
            if (map.containsKey(Character.valueOf(c2))) {
                this.i[this.k.get(Character.valueOf(c2)).charValue()] = new x73(c3, i);
                return;
            }
            char size = (char) this.k.size();
            this.k.put(Character.valueOf(c2), Character.valueOf(size));
            this.i[size] = new x73(c3, i);
        }
    }

    public void y(int i) {
        if (i == -1) {
            i = this.a;
        }
        this.q = i;
    }

    public void z(char c2) {
        this.f13860l = c2;
    }
}
