package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class f83 {
    public static final int HASH_MULT = 33;
    public final f83 a;
    public final AtomicReference<b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11253c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11254e;
    public String[] f;
    public a[] g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11255j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11256l;
    public BitSet m;

    public static final class a {
        public final String a;
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11257c;

        public a(String str, a aVar) {
            this.a = str;
            this.b = aVar;
            this.f11257c = aVar != null ? 1 + aVar.f11257c : 1;
        }

        public String a(char[] cArr, int i, int i2) {
            if (this.a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.a;
                }
            }
            return null;
        }
    }

    public f83(int i) {
        this.a = null;
        this.f11253c = i;
        this.f11254e = true;
        this.d = -1;
        this.f11256l = false;
        this.k = 0;
        this.b = new AtomicReference<>(b.a(64));
    }

    public static int f(int i) {
        return i - (i >> 2);
    }

    public static f83 j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return k((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static f83 k(int i) {
        return new f83(i);
    }

    public final String a(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.f11256l) {
            i();
            this.f11256l = false;
        } else if (this.h >= this.i) {
            q();
            i4 = d(h(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.d)) {
            str = InternCache.instance.intern(str);
        }
        this.h++;
        String[] strArr = this.f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            a aVar = new a(str, this.g[i5]);
            int i6 = aVar.f11257c;
            if (i6 > 150) {
                c(i5, aVar, i4);
            } else {
                this.g[i5] = aVar;
                this.k = Math.max(i6, this.k);
            }
        }
        return str;
    }

    public final String b(char[] cArr, int i, int i2, a aVar) {
        while (aVar != null) {
            String strA = aVar.a(cArr, i, i2);
            if (strA != null) {
                return strA;
            }
            aVar = aVar.b;
        }
        return null;
    }

    public final void c(int i, a aVar, int i2) {
        BitSet bitSet = this.m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.d)) {
                e(150);
            }
            this.f11254e = false;
        } else {
            this.m.set(i);
        }
        this.f[i2] = aVar.a;
        this.g[i] = null;
        this.h -= aVar.f11257c;
        this.k = -1;
    }

    public int d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return this.f11255j & (i3 + (i3 >>> 3));
    }

    public void e(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public int g(String str) {
        int length = str.length();
        int iCharAt = this.f11253c;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    public int h(char[] cArr, int i, int i2) {
        int i3 = this.f11253c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final void i() {
        String[] strArr = this.f;
        this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.g;
        this.g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public String l(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f11254e) {
            return new String(cArr, i, i2);
        }
        int iD = d(i3);
        String str = this.f[iD];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            a aVar = this.g[iD >> 1];
            if (aVar != null) {
                String strA = aVar.a(cArr, i, i2);
                if (strA != null) {
                    return strA;
                }
                String strB = b(cArr, i, i2, aVar.b);
                if (strB != null) {
                    return strB;
                }
            }
        }
        return a(cArr, i, i2, i3, iD);
    }

    public int m() {
        return this.f11253c;
    }

    public f83 n(int i) {
        return new f83(this, i, this.f11253c, this.b.get());
    }

    public boolean o() {
        return !this.f11256l;
    }

    public final void p(b bVar) {
        int i = bVar.a;
        b bVar2 = this.b.get();
        if (i == bVar2.a) {
            return;
        }
        if (i > 12000) {
            bVar = b.a(64);
        }
        fue.a(this.b, bVar2, bVar);
    }

    public final void q() {
        String[] strArr = this.f;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.h = 0;
            this.f11254e = false;
            this.f = new String[64];
            this.g = new a[32];
            this.f11255j = 63;
            this.f11256l = false;
            return;
        }
        a[] aVarArr = this.g;
        this.f = new String[i];
        this.g = new a[i >> 1];
        this.f11255j = i - 1;
        this.i = f(i);
        int i2 = 0;
        int iMax = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int iD = d(g(str));
                String[] strArr2 = this.f;
                if (strArr2[iD] == null) {
                    strArr2[iD] = str;
                } else {
                    int i3 = iD >> 1;
                    a aVar = new a(str, this.g[i3]);
                    this.g[i3] = aVar;
                    iMax = Math.max(iMax, aVar.f11257c);
                }
            }
        }
        int i4 = length >> 1;
        for (int i5 = 0; i5 < i4; i5++) {
            for (a aVar2 = aVarArr[i5]; aVar2 != null; aVar2 = aVar2.b) {
                i2++;
                String str2 = aVar2.a;
                int iD2 = d(g(str2));
                String[] strArr3 = this.f;
                if (strArr3[iD2] == null) {
                    strArr3[iD2] = str2;
                } else {
                    int i6 = iD2 >> 1;
                    a aVar3 = new a(str2, this.g[i6]);
                    this.g[i6] = aVar3;
                    iMax = Math.max(iMax, aVar3.f11257c);
                }
            }
        }
        this.k = iMax;
        this.m = null;
        if (i2 != this.h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.h), Integer.valueOf(i2)));
        }
    }

    public void r() {
        f83 f83Var;
        if (o() && (f83Var = this.a) != null && this.f11254e) {
            f83Var.p(new b(this));
            this.f11256l = true;
        }
    }

    public static final class b {
        public final int a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f11258c;
        public final a[] d;

        public b(int i, int i2, String[] strArr, a[] aVarArr) {
            this.a = i;
            this.b = i2;
            this.f11258c = strArr;
            this.d = aVarArr;
        }

        public static b a(int i) {
            return new b(0, 0, new String[i], new a[i >> 1]);
        }

        public b(f83 f83Var) {
            this.a = f83Var.h;
            this.b = f83Var.k;
            this.f11258c = f83Var.f;
            this.d = f83Var.g;
        }
    }

    public f83(f83 f83Var, int i, int i2, b bVar) {
        this.a = f83Var;
        this.f11253c = i2;
        this.b = null;
        this.d = i;
        this.f11254e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = bVar.f11258c;
        this.f = strArr;
        this.g = bVar.d;
        this.h = bVar.a;
        this.k = bVar.b;
        int length = strArr.length;
        this.i = f(length);
        this.f11255j = length - 1;
        this.f11256l = true;
    }
}
