package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public final class e6m {
    public static c6m a(String str, String str2) throws XMPException {
        if (str == null || str2 == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        c6m c6mVar = new c6m();
        t9e t9eVar = new t9e();
        t9eVar.a = str2;
        c(str, t9eVar, c6mVar);
        while (t9eVar.f16941e < str2.length()) {
            t9eVar.d = t9eVar.f16941e;
            e(str2, t9eVar);
            int i = t9eVar.d;
            t9eVar.f16941e = i;
            f6m f6mVarD = str2.charAt(i) != '[' ? d(t9eVar) : b(t9eVar);
            if (f6mVarD.b() == 1) {
                if (f6mVarD.c().charAt(0) == '@') {
                    f6mVarD.h("?" + f6mVarD.c().substring(1));
                    if (!"?xml:lang".equals(f6mVarD.c())) {
                        throw new XMPException("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (f6mVarD.c().charAt(0) == '?') {
                    t9eVar.b++;
                    f6mVarD.g(2);
                }
            } else {
                if (f6mVarD.b() != 6) {
                    continue;
                } else {
                    if (f6mVarD.c().charAt(1) == '@') {
                        f6mVarD.h("[?" + f6mVarD.c().substring(2));
                        if (!f6mVarD.c().startsWith("[?xml:lang=")) {
                            throw new XMPException("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (f6mVarD.c().charAt(1) == '?') {
                        t9eVar.b++;
                        f6mVarD.g(5);
                    }
                }
                c6mVar.a(f6mVarD);
            }
            f(t9eVar.a.substring(t9eVar.b, t9eVar.f16940c));
            c6mVar.a(f6mVarD);
        }
        return c6mVar;
    }

    public static f6m b(t9e t9eVar) throws XMPException {
        f6m f6mVar;
        int i = t9eVar.f16941e + 1;
        t9eVar.f16941e = i;
        if ('0' > t9eVar.a.charAt(i) || t9eVar.a.charAt(t9eVar.f16941e) > '9') {
            while (t9eVar.f16941e < t9eVar.a.length() && t9eVar.a.charAt(t9eVar.f16941e) != ']' && t9eVar.a.charAt(t9eVar.f16941e) != '=') {
                t9eVar.f16941e++;
            }
            if (t9eVar.f16941e >= t9eVar.a.length()) {
                throw new XMPException("Missing ']' or '=' for array index", 102);
            }
            if (t9eVar.a.charAt(t9eVar.f16941e) != ']') {
                t9eVar.b = t9eVar.d + 1;
                int i2 = t9eVar.f16941e;
                t9eVar.f16940c = i2;
                int i3 = i2 + 1;
                t9eVar.f16941e = i3;
                char cCharAt = t9eVar.a.charAt(i3);
                if (cCharAt != '\'' && cCharAt != '\"') {
                    throw new XMPException("Invalid quote in array selector", 102);
                }
                while (true) {
                    t9eVar.f16941e++;
                    if (t9eVar.f16941e >= t9eVar.a.length()) {
                        break;
                    }
                    if (t9eVar.a.charAt(t9eVar.f16941e) == cCharAt) {
                        if (t9eVar.f16941e + 1 >= t9eVar.a.length() || t9eVar.a.charAt(t9eVar.f16941e + 1) != cCharAt) {
                            break;
                        }
                        t9eVar.f16941e++;
                    }
                }
                if (t9eVar.f16941e >= t9eVar.a.length()) {
                    throw new XMPException("No terminating quote for array selector", 102);
                }
                t9eVar.f16941e++;
                f6mVar = new f6m(null, 6);
            } else {
                if (!"[last()".equals(t9eVar.a.substring(t9eVar.d, t9eVar.f16941e))) {
                    throw new XMPException("Invalid non-numeric array index", 102);
                }
                f6mVar = new f6m(null, 4);
            }
        } else {
            while (t9eVar.f16941e < t9eVar.a.length() && '0' <= t9eVar.a.charAt(t9eVar.f16941e) && t9eVar.a.charAt(t9eVar.f16941e) <= '9') {
                t9eVar.f16941e++;
            }
            f6mVar = new f6m(null, 3);
        }
        if (t9eVar.f16941e >= t9eVar.a.length() || t9eVar.a.charAt(t9eVar.f16941e) != ']') {
            throw new XMPException("Missing ']' for array index", 102);
        }
        int i4 = t9eVar.f16941e + 1;
        t9eVar.f16941e = i4;
        f6mVar.h(t9eVar.a.substring(t9eVar.d, i4));
        return f6mVar;
    }

    public static void c(String str, t9e t9eVar, c6m c6mVar) throws XMPException {
        f6m f6mVar;
        while (t9eVar.f16941e < t9eVar.a.length() && "/[*".indexOf(t9eVar.a.charAt(t9eVar.f16941e)) < 0) {
            t9eVar.f16941e++;
        }
        int i = t9eVar.f16941e;
        int i2 = t9eVar.d;
        if (i == i2) {
            throw new XMPException("Empty initial XMPPath step", 102);
        }
        String strH = h(str, t9eVar.a.substring(i2, i));
        s5m s5mVarD = w5m.a().d(strH);
        if (s5mVarD == null) {
            c6mVar.a(new f6m(str, Integer.MIN_VALUE));
            f6mVar = new f6m(strH, 1);
        } else {
            c6mVar.a(new f6m(s5mVarD.c(), Integer.MIN_VALUE));
            f6m f6mVar2 = new f6m(h(s5mVarD.c(), s5mVarD.a()), 1);
            f6mVar2.e(true);
            f6mVar2.f(s5mVarD.b().d());
            c6mVar.a(f6mVar2);
            if (s5mVarD.b().i()) {
                f6mVar = new f6m("[?xml:lang='x-default']", 5);
            } else if (!s5mVarD.b().h()) {
                return;
            } else {
                f6mVar = new f6m("[1]", 3);
            }
            f6mVar.e(true);
            f6mVar.f(s5mVarD.b().d());
        }
        c6mVar.a(f6mVar);
    }

    public static f6m d(t9e t9eVar) throws XMPException {
        t9eVar.b = t9eVar.d;
        while (t9eVar.f16941e < t9eVar.a.length() && "/[*".indexOf(t9eVar.a.charAt(t9eVar.f16941e)) < 0) {
            t9eVar.f16941e++;
        }
        int i = t9eVar.f16941e;
        t9eVar.f16940c = i;
        int i2 = t9eVar.d;
        if (i != i2) {
            return new f6m(t9eVar.a.substring(i2, i), 1);
        }
        throw new XMPException("Empty XMPPath segment", 102);
    }

    public static void e(String str, t9e t9eVar) throws XMPException {
        if (str.charAt(t9eVar.d) == '/') {
            int i = t9eVar.d + 1;
            t9eVar.d = i;
            if (i >= str.length()) {
                throw new XMPException("Empty XMPPath segment", 102);
            }
        }
        if (str.charAt(t9eVar.d) == '*') {
            int i2 = t9eVar.d + 1;
            t9eVar.d = i2;
            if (i2 >= str.length() || str.charAt(t9eVar.d) != '[') {
                throw new XMPException("Missing '[' after '*'", 102);
            }
        }
    }

    public static void f(String str) throws XMPException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            if (srk.g(strSubstring)) {
                if (w5m.a().c(strSubstring) == null) {
                    throw new XMPException("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new XMPException("Ill-formed qualified name", 102);
    }

    public static void g(String str) throws XMPException {
        if (!srk.f(str)) {
            throw new XMPException("Bad XML name", 102);
        }
    }

    public static String h(String str, String str2) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Schema namespace URI is required", 101);
        }
        if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new XMPException("Top level name must not be a qualifier", 102);
        }
        if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new XMPException("Top level name must be simple", 102);
        }
        String strA = w5m.a().a(str);
        if (strA == null) {
            throw new XMPException("Unregistered schema namespace URI", 101);
        }
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf < 0) {
            g(str2);
            return strA + str2;
        }
        g(str2.substring(0, iIndexOf));
        g(str2.substring(iIndexOf));
        String strSubstring = str2.substring(0, iIndexOf + 1);
        String strA2 = w5m.a().a(str);
        if (strA2 == null) {
            throw new XMPException("Unknown schema namespace prefix", 101);
        }
        if (strSubstring.equals(strA2)) {
            return str2;
        }
        throw new XMPException("Schema namespace URI and prefix mismatch", 101);
    }
}
