package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class mla {
    public static final char SEPARATOR = '/';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mla f14117e = new mla();
    public final mla a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14118c;
    public final int d;

    public mla() {
        this.a = null;
        this.f14118c = "";
        this.d = -1;
        this.b = "";
    }

    public static void a(StringBuilder sb, char c2) {
        if (c2 == '0') {
            c2 = '~';
        } else if (c2 == '1') {
            c2 = SEPARATOR;
        } else {
            sb.append('~');
        }
        sb.append(c2);
    }

    public static final int b(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || mzc.l(str) <= 2147483647L) {
            return mzc.j(str);
        }
        return -1;
    }

    public static mla c(String str, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(Math.max(16, length));
        if (i > 2) {
            sb.append((CharSequence) str, 1, i - 1);
        }
        int i2 = i + 1;
        a(sb, str.charAt(i));
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/') {
                return new mla(str, sb.toString(), d(str.substring(i2)));
            }
            i2++;
            if (cCharAt != '~' || i2 >= length) {
                sb.append(cCharAt);
            } else {
                a(sb, str.charAt(i2));
                i2++;
            }
        }
        return new mla(str, sb.toString(), f14117e);
    }

    public static mla d(String str) {
        int length = str.length();
        int i = 1;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                return new mla(str, str.substring(1, i), d(str.substring(i)));
            }
            i++;
            if (cCharAt == '~' && i < length) {
                return c(str, i);
            }
        }
        return new mla(str, str.substring(1), f14117e);
    }

    public static mla e(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return f14117e;
        }
        if (str.charAt(0) == '/') {
            return d(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof mla)) {
            return this.b.equals(((mla) obj).b);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public String g() {
        return this.f14118c;
    }

    public mla h(int i) {
        if (i != this.d || i < 0) {
            return null;
        }
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public mla i(String str) {
        if (this.a == null || !this.f14118c.equals(str)) {
            return null;
        }
        return this.a;
    }

    public boolean j() {
        return this.a == null;
    }

    public mla k() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }

    public mla(String str, String str2, mla mlaVar) {
        this.b = str;
        this.a = mlaVar;
        this.f14118c = str2;
        this.d = b(str2);
    }
}
