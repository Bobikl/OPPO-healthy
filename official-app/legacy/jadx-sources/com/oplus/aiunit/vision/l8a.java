package com.oplus.aiunit.vision;

import androidx.core.net.MailTo;
import com.oplus.weatherservicesdk.data.Weather;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class l8a implements h8a {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f13573j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f13574l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f13575n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Character, b95> f13576c;
    public final i8a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13577e;
    public int f;
    public z85 g;
    public j52 h;

    public static class a {
        public final int a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f13578c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.f13578c = z;
            this.b = z2;
        }
    }

    public l8a(i8a i8aVar) {
        Map<Character, b95> mapF = f(i8aVar.b());
        this.f13576c = mapF;
        BitSet bitSetD = d(mapF.keySet());
        this.b = bitSetD;
        this.a = g(bitSetD);
        this.d = i8aVar;
    }

    public static void b(char c2, b95 b95Var, Map<Character, b95> map) {
        if (map.put(Character.valueOf(c2), b95Var) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    public static void c(Iterable<b95> iterable, Map<Character, b95> map) {
        nli nliVar;
        for (b95 b95Var : iterable) {
            char c2 = b95Var.c();
            char cA = b95Var.a();
            if (c2 == cA) {
                b95 b95Var2 = map.get(Character.valueOf(c2));
                if (b95Var2 == null || b95Var2.c() != b95Var2.a()) {
                    b(c2, b95Var, map);
                } else {
                    if (b95Var2 instanceof nli) {
                        nliVar = (nli) b95Var2;
                    } else {
                        nli nliVar2 = new nli(c2);
                        nliVar2.f(b95Var2);
                        nliVar = nliVar2;
                    }
                    nliVar.f(b95Var);
                    map.put(Character.valueOf(c2), nliVar);
                }
            } else {
                b(c2, b95Var, map);
                b(cA, b95Var, map);
            }
        }
    }

    public static BitSet d(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, b95> f(List<b95> list) {
        HashMap map = new HashMap();
        c(Arrays.asList(new ni0(), new jik()), map);
        c(list, map);
        return map;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    public final ltc A() {
        int i2 = this.f;
        int length = this.f13577e.length();
        while (true) {
            int i3 = this.f;
            if (i3 == length || this.a.get(this.f13577e.charAt(i3))) {
                break;
            }
            this.f++;
        }
        int i4 = this.f;
        if (i2 != i4) {
            return M(this.f13577e, i2, i4);
        }
        return null;
    }

    public final char B() {
        if (this.f < this.f13577e.length()) {
            return this.f13577e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void C(z85 z85Var) {
        boolean z;
        HashMap map = new HashMap();
        z85 z85Var2 = this.g;
        while (z85Var2 != null) {
            z85 z85Var3 = z85Var2.f19315e;
            if (z85Var3 == z85Var) {
                break;
            } else {
                z85Var2 = z85Var3;
            }
        }
        while (z85Var2 != null) {
            char c2 = z85Var2.b;
            b95 b95Var = this.f13576c.get(Character.valueOf(c2));
            if (!z85Var2.d || b95Var == null) {
                z85Var2 = z85Var2.f;
            } else {
                char c3 = b95Var.c();
                z85 z85Var4 = z85Var2.f19315e;
                int iE = 0;
                boolean z2 = false;
                while (true) {
                    if (z85Var4 == null || z85Var4 == z85Var || z85Var4 == map.get(Character.valueOf(c2))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (z85Var4.f19314c && z85Var4.b == c3) {
                        iE = b95Var.e(z85Var4, z85Var2);
                        z2 = true;
                        if (iE > 0) {
                            z = true;
                            break;
                        }
                    }
                    z85Var4 = z85Var4.f19315e;
                }
                if (z2) {
                    zrj zrjVar = z85Var4.a;
                    zrj zrjVar2 = z85Var2.a;
                    z85Var4.g -= iE;
                    z85Var2.g -= iE;
                    zrjVar.n(zrjVar.m().substring(0, zrjVar.m().length() - iE));
                    zrjVar2.n(zrjVar2.m().substring(0, zrjVar2.m().length() - iE));
                    G(z85Var4, z85Var2);
                    k(zrjVar, zrjVar2);
                    b95Var.d(zrjVar, zrjVar2, iE);
                    if (z85Var4.g == 0) {
                        E(z85Var4);
                    }
                    if (z85Var2.g == 0) {
                        z85 z85Var5 = z85Var2.f;
                        E(z85Var2);
                        z85Var2 = z85Var5;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c2), z85Var2.f19315e);
                        if (!z85Var2.f19314c) {
                            F(z85Var2);
                        }
                    }
                    z85Var2 = z85Var2.f;
                }
            }
        }
        while (true) {
            z85 z85Var6 = this.g;
            if (z85Var6 == null || z85Var6 == z85Var) {
                return;
            } else {
                F(z85Var6);
            }
        }
    }

    public final void D(z85 z85Var) {
        z85 z85Var2 = z85Var.f19315e;
        if (z85Var2 != null) {
            z85Var2.f = z85Var.f;
        }
        z85 z85Var3 = z85Var.f;
        if (z85Var3 == null) {
            this.g = z85Var2;
        } else {
            z85Var3.f19315e = z85Var2;
        }
    }

    public final void E(z85 z85Var) {
        z85Var.a.l();
        D(z85Var);
    }

    public final void F(z85 z85Var) {
        D(z85Var);
    }

    public final void G(z85 z85Var, z85 z85Var2) {
        z85 z85Var3 = z85Var2.f19315e;
        while (z85Var3 != null && z85Var3 != z85Var) {
            z85 z85Var4 = z85Var3.f19315e;
            F(z85Var3);
            z85Var3 = z85Var4;
        }
    }

    public final void H() {
        this.h = this.h.d;
    }

    public void I(String str) {
        this.f13577e = str;
        this.f = 0;
        this.g = null;
        this.h = null;
    }

    public final a J(b95 b95Var, char c2) {
        boolean z;
        int i2 = this.f;
        boolean z2 = false;
        int i3 = 0;
        while (B() == c2) {
            i3++;
            this.f++;
        }
        if (i3 < b95Var.b()) {
            this.f = i2;
            return null;
        }
        String strValueOf = Weather.SEPARATOR;
        String strSubstring = i2 == 0 ? Weather.SEPARATOR : this.f13577e.substring(i2 - 1, i2);
        char cB = B();
        if (cB != 0) {
            strValueOf = String.valueOf(cB);
        }
        Pattern pattern = i;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = r;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z3 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z4 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c2 == '_') {
            z = z3 && (!z4 || zMatches);
            if (z4 && (!z3 || zMatches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c2 == b95Var.c();
            if (z4 && c2 == b95Var.a()) {
                z2 = true;
            }
            z = z5;
        }
        this.f = i2;
        return new a(i3, z, z2);
    }

    public final void K() {
        h(q);
    }

    public final zrj L(String str) {
        return new zrj(str);
    }

    public final zrj M(String str, int i2, int i3) {
        return new zrj(str.substring(i2, i3));
    }

    public final void a(j52 j52Var) {
        j52 j52Var2 = this.h;
        if (j52Var2 != null) {
            j52Var2.g = true;
        }
        this.h = j52Var;
    }

    @Override // com.oplus.aiunit.vision.h8a
    public void e(String str, ltc ltcVar) {
        I(str.trim());
        ltc ltcVarU = null;
        while (true) {
            ltcVarU = u(ltcVarU);
            if (ltcVarU == null) {
                C(null);
                i(ltcVar);
                return;
            }
            ltcVar.b(ltcVarU);
        }
    }

    public final String h(Pattern pattern) {
        if (this.f >= this.f13577e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f13577e);
        matcher.region(this.f, this.f13577e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    public final void i(ltc ltcVar) {
        if (ltcVar.c() == ltcVar.d()) {
            return;
        }
        l(ltcVar.c(), ltcVar.d());
    }

    public final void j(zrj zrjVar, zrj zrjVar2, int i2) {
        if (zrjVar == null || zrjVar2 == null || zrjVar == zrjVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(zrjVar.m());
        ltc ltcVarE = zrjVar.e();
        ltc ltcVarE2 = zrjVar2.e();
        while (ltcVarE != ltcVarE2) {
            sb.append(((zrj) ltcVarE).m());
            ltc ltcVarE3 = ltcVarE.e();
            ltcVarE.l();
            ltcVarE = ltcVarE3;
        }
        zrjVar.n(sb.toString());
    }

    public final void k(ltc ltcVar, ltc ltcVar2) {
        if (ltcVar == ltcVar2 || ltcVar.e() == ltcVar2) {
            return;
        }
        l(ltcVar.e(), ltcVar2.g());
    }

    public final void l(ltc ltcVar, ltc ltcVar2) {
        zrj zrjVar = null;
        zrj zrjVar2 = null;
        int length = 0;
        while (ltcVar != null) {
            if (ltcVar instanceof zrj) {
                zrjVar2 = (zrj) ltcVar;
                if (zrjVar == null) {
                    zrjVar = zrjVar2;
                }
                length += zrjVar2.m().length();
            } else {
                j(zrjVar, zrjVar2, length);
                zrjVar = null;
                zrjVar2 = null;
                length = 0;
            }
            if (ltcVar == ltcVar2) {
                break;
            } else {
                ltcVar = ltcVar.e();
            }
        }
        j(zrjVar, zrjVar2, length);
    }

    public final ltc m() {
        String strH = h(o);
        if (strH != null) {
            String strSubstring = strH.substring(1, strH.length() - 1);
            kxa kxaVar = new kxa(MailTo.MAILTO_SCHEME + strSubstring, null);
            kxaVar.b(new zrj(strSubstring));
            return kxaVar;
        }
        String strH2 = h(p);
        if (strH2 == null) {
            return null;
        }
        String strSubstring2 = strH2.substring(1, strH2.length() - 1);
        kxa kxaVar2 = new kxa(strSubstring2, null);
        kxaVar2.b(new zrj(strSubstring2));
        return kxaVar2;
    }

    public final ltc n() {
        this.f++;
        if (B() == '\n') {
            hh8 hh8Var = new hh8();
            this.f++;
            return hh8Var;
        }
        if (this.f < this.f13577e.length()) {
            Pattern pattern = k;
            String str = this.f13577e;
            int i2 = this.f;
            if (pattern.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.f13577e;
                int i3 = this.f;
                zrj zrjVarM = M(str2, i3, i3 + 1);
                this.f++;
                return zrjVarM;
            }
        }
        return L("\\");
    }

    public final ltc o() {
        String strH;
        String strH2 = h(f13575n);
        if (strH2 == null) {
            return null;
        }
        int i2 = this.f;
        do {
            strH = h(m);
            if (strH == null) {
                this.f = i2;
                return L(strH2);
            }
        } while (!strH.equals(strH2));
        zj3 zj3Var = new zj3();
        String strReplace = this.f13577e.substring(i2, this.f - strH2.length()).replace('\n', StringUtil.SPACE);
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && m8e.e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        zj3Var.n(strReplace);
        return zj3Var;
    }

    public final ltc p() {
        int i2 = this.f;
        this.f = i2 + 1;
        if (B() != '[') {
            return L("!");
        }
        this.f++;
        zrj zrjVarL = L("![");
        a(j52.a(zrjVarL, i2 + 1, this.h, this.g));
        return zrjVarL;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    public final ltc q() {
        boolean z;
        String strM;
        String strO;
        boolean z2 = true;
        int i2 = this.f + 1;
        this.f = i2;
        j52 j52Var = this.h;
        if (j52Var == null) {
            return L("]");
        }
        if (!j52Var.f) {
            H();
            return L("]");
        }
        String strSubstring = null;
        if (B() == '(') {
            this.f++;
            K();
            strM = v();
            if (strM != null) {
                K();
                Pattern pattern = s;
                String str = this.f13577e;
                int i3 = this.f;
                if (pattern.matcher(str.substring(i3 - 1, i3)).matches()) {
                    strO = x();
                    K();
                } else {
                    strO = null;
                }
                if (B() == ')') {
                    this.f++;
                    z = true;
                } else {
                    this.f = i2;
                    z = false;
                }
            } else {
                z = false;
                strO = null;
            }
        } else {
            z = false;
            strM = null;
            strO = null;
        }
        if (z) {
            z2 = z;
        } else {
            int i4 = this.f;
            w();
            int i5 = this.f - i4;
            if (i5 > 2) {
                strSubstring = this.f13577e.substring(i4, i5 + i4);
            } else if (!j52Var.g) {
                strSubstring = this.f13577e.substring(j52Var.b, i2);
            }
            if (strSubstring != null) {
                oxa oxaVarA = this.d.a(up6.c(strSubstring));
                if (oxaVarA != null) {
                    strM = oxaVarA.m();
                    strO = oxaVarA.o();
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
        }
        if (!z2) {
            this.f = i2;
            H();
            return L("]");
        }
        ltc p2aVar = j52Var.f12757c ? new p2a(strM, strO) : new kxa(strM, strO);
        ltc ltcVarE = j52Var.a.e();
        while (ltcVarE != null) {
            ltc ltcVarE2 = ltcVarE.e();
            p2aVar.b(ltcVarE);
            ltcVarE = ltcVarE2;
        }
        C(j52Var.f12758e);
        i(p2aVar);
        j52Var.a.l();
        H();
        if (!j52Var.f12757c) {
            for (j52 j52Var2 = this.h; j52Var2 != null; j52Var2 = j52Var2.d) {
                if (!j52Var2.f12757c) {
                    j52Var2.f = false;
                }
            }
        }
        return p2aVar;
    }

    public final ltc r(b95 b95Var, char c2) {
        a aVarJ = J(b95Var, c2);
        if (aVarJ == null) {
            return null;
        }
        int i2 = aVarJ.a;
        int i3 = this.f;
        int i4 = i3 + i2;
        this.f = i4;
        zrj zrjVarM = M(this.f13577e, i3, i4);
        z85 z85Var = new z85(zrjVarM, c2, aVarJ.f13578c, aVarJ.b, this.g);
        this.g = z85Var;
        z85Var.g = i2;
        z85Var.h = i2;
        z85 z85Var2 = z85Var.f19315e;
        if (z85Var2 != null) {
            z85Var2.f = z85Var;
        }
        return zrjVarM;
    }

    public final ltc s() {
        String strH = h(f13574l);
        if (strH != null) {
            return L(vi9.a(strH));
        }
        return null;
    }

    public final ltc t() {
        String strH = h(f13573j);
        if (strH == null) {
            return null;
        }
        yi9 yi9Var = new yi9();
        yi9Var.m(strH);
        return yi9Var;
    }

    public final ltc u(ltc ltcVar) {
        ltc ltcVarY;
        char cB = B();
        if (cB == 0) {
            return null;
        }
        if (cB == '\n') {
            ltcVarY = y(ltcVar);
        } else if (cB == '!') {
            ltcVarY = p();
        } else if (cB == '&') {
            ltcVarY = s();
        } else if (cB == '<') {
            ltcVarY = m();
            if (ltcVarY == null) {
                ltcVarY = t();
            }
        } else if (cB != '`') {
            switch (cB) {
                case '[':
                    ltcVarY = z();
                    break;
                case '\\':
                    ltcVarY = n();
                    break;
                case ']':
                    ltcVarY = q();
                    break;
                default:
                    ltcVarY = !this.b.get(cB) ? A() : r(this.f13576c.get(Character.valueOf(cB)), cB);
                    break;
            }
        } else {
            ltcVarY = o();
        }
        if (ltcVarY != null) {
            return ltcVarY;
        }
        this.f++;
        return L(String.valueOf(cB));
    }

    public final String v() {
        int iA = rxa.a(this.f13577e, this.f);
        if (iA == -1) {
            return null;
        }
        String strSubstring = B() == '<' ? this.f13577e.substring(this.f + 1, iA - 1) : this.f13577e.substring(this.f, iA);
        this.f = iA;
        return up6.e(strSubstring);
    }

    public int w() {
        if (this.f < this.f13577e.length() && this.f13577e.charAt(this.f) == '[') {
            int i2 = this.f + 1;
            int iC = rxa.c(this.f13577e, i2);
            int i3 = iC - i2;
            if (iC != -1 && i3 <= 999 && iC < this.f13577e.length() && this.f13577e.charAt(iC) == ']') {
                this.f = iC + 1;
                return i3 + 2;
            }
        }
        return 0;
    }

    public final String x() {
        int iD = rxa.d(this.f13577e, this.f);
        if (iD == -1) {
            return null;
        }
        String strSubstring = this.f13577e.substring(this.f + 1, iD - 1);
        this.f = iD;
        return up6.e(strSubstring);
    }

    public final ltc y(ltc ltcVar) {
        this.f++;
        if (ltcVar instanceof zrj) {
            zrj zrjVar = (zrj) ltcVar;
            if (zrjVar.m().endsWith(" ")) {
                String strM = zrjVar.m();
                Matcher matcher = t.matcher(strM);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    zrjVar.n(strM.substring(0, strM.length() - iEnd));
                }
                return iEnd >= 2 ? new hh8() : new s1i();
            }
        }
        return new s1i();
    }

    public final ltc z() {
        int i2 = this.f;
        this.f = i2 + 1;
        zrj zrjVarL = L("[");
        a(j52.b(zrjVarL, i2, this.h, this.g));
        return zrjVarL;
    }
}
