package com.oplus.aiunit.vision;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class gsj {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f11879l = new char[0];
    public final z72 a;
    public char[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11880c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<char[]> f11881e;
    public boolean f;
    public int g;
    public char[] h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11882j;
    public char[] k;

    public gsj(z72 z72Var) {
        this.a = z72Var;
    }

    public static gsj q(char[] cArr) {
        return new gsj(null, cArr);
    }

    public void A(char[] cArr, int i, int i2) {
        this.f11882j = null;
        this.k = null;
        this.b = cArr;
        this.f11880c = i;
        this.d = i2;
        if (this.f) {
            f();
        }
    }

    public void B(String str) {
        this.b = null;
        this.f11880c = -1;
        this.d = 0;
        this.f11882j = str;
        this.k = null;
        if (this.f) {
            f();
        }
        this.i = 0;
    }

    public final char[] C() {
        int i;
        String str = this.f11882j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f11880c;
        if (i2 >= 0) {
            int i3 = this.d;
            if (i3 < 1) {
                return f11879l;
            }
            return i2 == 0 ? Arrays.copyOf(this.b, i3) : Arrays.copyOfRange(this.b, i2, i3 + i2);
        }
        int iF = F();
        if (iF < 1) {
            return f11879l;
        }
        char[] cArrE = e(iF);
        ArrayList<char[]> arrayList = this.f11881e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.f11881e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, cArrE, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.h, 0, cArrE, i, this.i);
        return cArrE;
    }

    public String D(int i) {
        this.i = i;
        if (this.g > 0) {
            return l();
        }
        String str = i == 0 ? "" : new String(this.h, 0, i);
        this.f11882j = str;
        return str;
    }

    public void E(int i) {
        this.i = i;
    }

    public int F() {
        if (this.f11880c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f11882j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final void G(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.f11880c;
        this.f11880c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = d(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public void a(char c2) {
        if (this.f11880c >= 0) {
            G(16);
        }
        this.f11882j = null;
        this.k = null;
        char[] cArr = this.h;
        if (this.i >= cArr.length) {
            n(1);
            cArr = this.h;
        }
        int i = this.i;
        this.i = i + 1;
        cArr[i] = c2;
    }

    public void b(String str, int i, int i2) {
        if (this.f11880c >= 0) {
            G(i2);
        }
        this.f11882j = null;
        this.k = null;
        char[] cArr = this.h;
        int length = cArr.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            n(i2);
            int iMin = Math.min(this.h.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.h, 0);
            this.i += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public void c(char[] cArr, int i, int i2) {
        if (this.f11880c >= 0) {
            G(i2);
        }
        this.f11882j = null;
        this.k = null;
        char[] cArr2 = this.h;
        int length = cArr2.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            n(i2);
            int iMin = Math.min(this.h.length, i2);
            System.arraycopy(cArr, i, this.h, 0, iMin);
            this.i += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final char[] d(int i) {
        z72 z72Var = this.a;
        return z72Var != null ? z72Var.d(2, i) : new char[Math.max(i, 500)];
    }

    public final char[] e(int i) {
        return new char[i];
    }

    public final void f() {
        this.f = false;
        this.f11881e.clear();
        this.g = 0;
        this.i = 0;
    }

    public char[] g() {
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrC = C();
        this.k = cArrC;
        return cArrC;
    }

    public BigDecimal h() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.k;
        if (cArr3 != null) {
            return mzc.g(cArr3);
        }
        int i = this.f11880c;
        if (i < 0 || (cArr2 = this.b) == null) {
            return (this.g != 0 || (cArr = this.h) == null) ? mzc.g(g()) : mzc.h(cArr, 0, this.i);
        }
        return mzc.h(cArr2, i, this.d);
    }

    public double i() throws NumberFormatException {
        return mzc.i(l());
    }

    public int j(boolean z) {
        char[] cArr;
        int i = this.f11880c;
        if (i < 0 || (cArr = this.b) == null) {
            return z ? -mzc.k(this.h, 1, this.i - 1) : mzc.k(this.h, 0, this.i);
        }
        return z ? -mzc.k(cArr, i + 1, this.d - 1) : mzc.k(cArr, i, this.d);
    }

    public long k(boolean z) {
        char[] cArr;
        int i = this.f11880c;
        if (i < 0 || (cArr = this.b) == null) {
            return z ? -mzc.m(this.h, 1, this.i - 1) : mzc.m(this.h, 0, this.i);
        }
        return z ? -mzc.m(cArr, i + 1, this.d - 1) : mzc.m(cArr, i, this.d);
    }

    public String l() {
        if (this.f11882j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.f11882j = new String(cArr);
            } else {
                int i = this.f11880c;
                if (i >= 0) {
                    int i2 = this.d;
                    if (i2 < 1) {
                        this.f11882j = "";
                        return "";
                    }
                    this.f11882j = new String(this.b, i, i2);
                } else {
                    int i3 = this.g;
                    int i4 = this.i;
                    if (i3 == 0) {
                        this.f11882j = i4 != 0 ? new String(this.h, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.f11881e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.f11881e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.h, 0, this.i);
                        this.f11882j = sb.toString();
                    }
                }
            }
        }
        return this.f11882j;
    }

    public char[] m() {
        this.f11880c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.f11882j = null;
        this.k = null;
        if (this.f) {
            f();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrD = d(0);
        this.h = cArrD;
        return cArrD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r0
  0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n(int i) {
        if (this.f11881e == null) {
            this.f11881e = new ArrayList<>();
        }
        char[] cArr = this.h;
        this.f = true;
        this.f11881e.add(cArr);
        this.g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = 65536;
            if (i2 > 65536) {
                i2 = i3;
            }
        }
        this.h = e(i2);
    }

    public char[] o() {
        char[] cArr = this.h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        this.h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] p() {
        if (this.f11881e == null) {
            this.f11881e = new ArrayList<>();
        }
        this.f = true;
        this.f11881e.add(this.h);
        int length = this.h.length;
        this.g += length;
        this.i = 0;
        int i = length + (length >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = 65536;
            if (i > 65536) {
                i = i2;
            }
        }
        char[] cArrE = e(i);
        this.h = cArrE;
        return cArrE;
    }

    public char[] r() {
        return this.h;
    }

    public char[] s() {
        if (this.f11880c >= 0) {
            G(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = d(0);
            } else if (this.i >= cArr.length) {
                n(1);
            }
        }
        return this.h;
    }

    public int t() {
        return this.i;
    }

    public String toString() {
        return l();
    }

    public char[] u() {
        if (this.f11880c >= 0) {
            return this.b;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f11882j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        if (this.f) {
            return g();
        }
        char[] cArr2 = this.h;
        return cArr2 == null ? f11879l : cArr2;
    }

    public int v() {
        int i = this.f11880c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public boolean w() {
        return this.f11880c >= 0 || this.k != null || this.f11882j == null;
    }

    public void x() {
        char[] cArr;
        this.f11880c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if (this.f) {
            f();
        }
        z72 z72Var = this.a;
        if (z72Var == null || (cArr = this.h) == null) {
            return;
        }
        this.h = null;
        z72Var.j(2, cArr);
    }

    public void y(String str, int i, int i2) {
        this.b = null;
        this.f11880c = -1;
        this.d = 0;
        this.f11882j = null;
        this.k = null;
        if (this.f) {
            f();
        } else if (this.h == null) {
            this.h = d(i2);
        }
        this.g = 0;
        this.i = 0;
        b(str, i, i2);
    }

    public void z(char[] cArr, int i, int i2) {
        this.b = null;
        this.f11880c = -1;
        this.d = 0;
        this.f11882j = null;
        this.k = null;
        if (this.f) {
            f();
        } else if (this.h == null) {
            this.h = d(i2);
        }
        this.g = 0;
        this.i = 0;
        c(cArr, i, i2);
    }

    public gsj(z72 z72Var, char[] cArr) {
        this.a = z72Var;
        this.h = cArr;
        this.i = cArr.length;
        this.f11880c = -1;
    }
}
