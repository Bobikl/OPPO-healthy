package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class jgb implements h8a, kgb {
    public static final Pattern k = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f12889l = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern m = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f12890n = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern o = Pattern.compile("\\s+");
    public final i8a a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BitSet f12891c;
    public final Map<Character, List<n8a>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Character, b95> f12892e;
    public ltc f;
    public String g;
    public int h;
    public z85 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j52 f12893j;

    public static class a {
        public final int a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12894c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.f12894c = z;
            this.b = z2;
        }
    }

    public interface b {
        @NonNull
        b a(@NonNull n8a n8aVar);

        @NonNull
        k8a build();
    }

    public static class c implements b {
        public final List<n8a> a = new ArrayList(3);
        public final List<b95> b = new ArrayList(3);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12895c;

        @Override // com.oplus.aiunit.vision.jgb.b
        @NonNull
        public b a(@NonNull n8a n8aVar) {
            this.a.add(n8aVar);
            return this;
        }

        @NonNull
        public b b() {
            this.f12895c = true;
            this.a.addAll(Arrays.asList(new vo0(), new xr0(), new yr0(), new sx0(), new kh3(), new rn6(), new zi9(), new hqc(), new cld()));
            this.b.addAll(Arrays.asList(new ni0(), new jik()));
            return this;
        }

        @Override // com.oplus.aiunit.vision.jgb.b
        @NonNull
        public k8a build() {
            return new d(this.f12895c, this.a, this.b);
        }
    }

    public static class d implements k8a {
        public final boolean a;
        public final List<n8a> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b95> f12896c;

        public d(boolean z, @NonNull List<n8a> list, @NonNull List<b95> list2) {
            this.a = z;
            this.b = list;
            this.f12896c = list2;
        }

        @Override // com.oplus.aiunit.vision.k8a
        public h8a a(i8a i8aVar) {
            List arrayList;
            List<b95> listB = i8aVar.b();
            int size = listB != null ? listB.size() : 0;
            if (size > 0) {
                arrayList = new ArrayList(size + this.f12896c.size());
                arrayList.addAll(this.f12896c);
                arrayList.addAll(listB);
            } else {
                arrayList = this.f12896c;
            }
            return new jgb(i8aVar, this.a, this.b, arrayList);
        }
    }

    public jgb(@NonNull i8a i8aVar, boolean z, @NonNull List<n8a> list, @NonNull List<b95> list2) {
        this.a = i8aVar;
        this.b = z;
        Map<Character, List<n8a>> mapT = t(list);
        this.d = mapT;
        Map<Character, b95> mapS = s(list2);
        this.f12892e = mapS;
        this.f12891c = u(mapT.keySet(), mapS.keySet());
    }

    public static void q(char c2, b95 b95Var, Map<Character, b95> map) {
        if (map.put(Character.valueOf(c2), b95Var) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    public static void r(Iterable<b95> iterable, Map<Character, b95> map) {
        oli oliVar;
        for (b95 b95Var : iterable) {
            char c2 = b95Var.c();
            char cA = b95Var.a();
            if (c2 == cA) {
                b95 b95Var2 = map.get(Character.valueOf(c2));
                if (b95Var2 == null || b95Var2.c() != b95Var2.a()) {
                    q(c2, b95Var, map);
                } else {
                    if (b95Var2 instanceof oli) {
                        oliVar = (oli) b95Var2;
                    } else {
                        oli oliVar2 = new oli(c2);
                        oliVar2.f(b95Var2);
                        oliVar = oliVar2;
                    }
                    oliVar.f(b95Var);
                    map.put(Character.valueOf(c2), oliVar);
                }
            } else {
                q(c2, b95Var, map);
                q(cA, b95Var, map);
            }
        }
    }

    public static Map<Character, b95> s(List<b95> list) {
        HashMap map = new HashMap();
        r(list, map);
        return map;
    }

    @NonNull
    public static Map<Character, List<n8a>> t(@NonNull List<n8a> list) {
        HashMap map = new HashMap(list.size());
        for (n8a n8aVar : list) {
            char cM = n8aVar.m();
            List arrayList = (List) map.get(Character.valueOf(cM));
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(Character.valueOf(cM), arrayList);
            }
            arrayList.add(n8aVar);
        }
        return map;
    }

    @NonNull
    public static BitSet u(Set<Character> set, Set<Character> set2) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        Iterator<Character> it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(it2.next().charValue());
        }
        return bitSet;
    }

    @NonNull
    public static b v() {
        return new c().b();
    }

    public final void A(z85 z85Var) {
        z85Var.a.l();
        z(z85Var);
    }

    public final void B(z85 z85Var) {
        z(z85Var);
    }

    public final void C(z85 z85Var, z85 z85Var2) {
        z85 z85Var3 = z85Var2.f19315e;
        while (z85Var3 != null && z85Var3 != z85Var) {
            z85 z85Var4 = z85Var3.f19315e;
            B(z85Var3);
            z85Var3 = z85Var4;
        }
    }

    public final void D(String str) {
        this.g = str;
        this.h = 0;
        this.i = null;
        this.f12893j = null;
    }

    public final a E(b95 b95Var, char c2) {
        boolean z;
        int i = this.h;
        boolean z2 = false;
        int i2 = 0;
        while (peek() == c2) {
            i2++;
            this.h++;
        }
        if (i2 < b95Var.b()) {
            this.h = i;
            return null;
        }
        String strValueOf = Weather.SEPARATOR;
        String strSubstring = i == 0 ? Weather.SEPARATOR : this.g.substring(i - 1, i);
        char cPeek = peek();
        if (cPeek != 0) {
            strValueOf = String.valueOf(cPeek);
        }
        Pattern pattern = k;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = m;
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
        this.h = i;
        return new a(i2, z, z2);
    }

    @Override // com.oplus.aiunit.vision.kgb
    @Nullable
    public oxa a(String str) {
        if (this.b) {
            return this.a.a(str);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.kgb
    @Nullable
    public String b(@NonNull Pattern pattern) {
        if (this.h >= this.g.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.g);
        matcher.region(this.h, this.g.length());
        if (!matcher.find()) {
            return null;
        }
        this.h = matcher.end();
        return matcher.group();
    }

    @Override // com.oplus.aiunit.vision.kgb
    public void c() {
        b(f12889l);
    }

    @Override // com.oplus.aiunit.vision.kgb
    public void d(j52 j52Var) {
        j52 j52Var2 = this.f12893j;
        if (j52Var2 != null) {
            j52Var2.g = true;
        }
        this.f12893j = j52Var;
    }

    @Override // com.oplus.aiunit.vision.h8a
    public void e(String str, ltc ltcVar) {
        D(str.trim());
        this.f = ltcVar;
        while (true) {
            ltc ltcVarX = x();
            if (ltcVarX == null) {
                p(null);
                m8a.a(ltcVar);
                return;
            }
            ltcVar.b(ltcVarX);
        }
    }

    @Override // com.oplus.aiunit.vision.kgb
    public j52 f() {
        return this.f12893j;
    }

    @Override // com.oplus.aiunit.vision.kgb
    @Nullable
    public String g() {
        int iD = rxa.d(this.g, this.h);
        if (iD == -1) {
            return null;
        }
        String strSubstring = this.g.substring(this.h + 1, iD - 1);
        this.h = iD;
        return up6.e(strSubstring);
    }

    @Override // com.oplus.aiunit.vision.kgb
    @Nullable
    public String h() {
        int iA = rxa.a(this.g, this.h);
        if (iA == -1) {
            return null;
        }
        String strSubstring = peek() == '<' ? this.g.substring(this.h + 1, iA - 1) : this.g.substring(this.h, iA);
        this.h = iA;
        return up6.e(strSubstring);
    }

    @Override // com.oplus.aiunit.vision.kgb
    @NonNull
    public ltc i() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.kgb
    public int index() {
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.kgb
    @NonNull
    public String j() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.kgb
    @NonNull
    public zrj k(@NonNull String str) {
        return new zrj(str);
    }

    @Override // com.oplus.aiunit.vision.kgb
    public int l() {
        if (this.h < this.g.length() && this.g.charAt(this.h) == '[') {
            int i = this.h + 1;
            int iC = rxa.c(this.g, i);
            int i2 = iC - i;
            if (iC != -1 && i2 <= 999 && iC < this.g.length() && this.g.charAt(iC) == ']') {
                this.h = iC + 1;
                return i2 + 2;
            }
        }
        return 0;
    }

    @Override // com.oplus.aiunit.vision.kgb
    public z85 m() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.kgb
    public void n() {
        this.f12893j = this.f12893j.d;
    }

    @Override // com.oplus.aiunit.vision.kgb
    @NonNull
    public zrj o(@NonNull String str, int i, int i2) {
        return new zrj(str.substring(i, i2));
    }

    @Override // com.oplus.aiunit.vision.kgb
    public void p(z85 z85Var) {
        boolean z;
        HashMap map = new HashMap();
        z85 z85Var2 = this.i;
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
            b95 b95Var = this.f12892e.get(Character.valueOf(c2));
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
                    C(z85Var4, z85Var2);
                    m8a.c(zrjVar, zrjVar2);
                    b95Var.d(zrjVar, zrjVar2, iE);
                    if (z85Var4.g == 0) {
                        A(z85Var4);
                    }
                    if (z85Var2.g == 0) {
                        z85 z85Var5 = z85Var2.f;
                        A(z85Var2);
                        z85Var2 = z85Var5;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c2), z85Var2.f19315e);
                        if (!z85Var2.f19314c) {
                            B(z85Var2);
                        }
                    }
                    z85Var2 = z85Var2.f;
                }
            }
        }
        while (true) {
            z85 z85Var6 = this.i;
            if (z85Var6 == null || z85Var6 == z85Var) {
                return;
            } else {
                B(z85Var6);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.kgb
    public char peek() {
        if (this.h < this.g.length()) {
            return this.g.charAt(this.h);
        }
        return (char) 0;
    }

    @Override // com.oplus.aiunit.vision.kgb
    public void setIndex(int i) {
        this.h = i;
    }

    @Nullable
    public final ltc w(b95 b95Var, char c2) {
        a aVarE = E(b95Var, c2);
        if (aVarE == null) {
            return null;
        }
        int i = aVarE.a;
        int i2 = this.h;
        int i3 = i2 + i;
        this.h = i3;
        zrj zrjVarO = o(this.g, i2, i3);
        z85 z85Var = new z85(zrjVarO, c2, aVarE.f12894c, aVarE.b, this.i);
        this.i = z85Var;
        z85Var.g = i;
        z85Var.h = i;
        z85 z85Var2 = z85Var.f19315e;
        if (z85Var2 != null) {
            z85Var2.f = z85Var;
        }
        return zrjVarO;
    }

    @Nullable
    public final ltc x() {
        char cPeek = peek();
        ltc ltcVarW = null;
        if (cPeek == 0) {
            return null;
        }
        List<n8a> list = this.d.get(Character.valueOf(cPeek));
        if (list != null) {
            int i = this.h;
            Iterator<n8a> it = list.iterator();
            while (it.hasNext() && (ltcVarW = it.next().f(this)) == null) {
                this.h = i;
            }
        } else {
            b95 b95Var = this.f12892e.get(Character.valueOf(cPeek));
            ltcVarW = b95Var != null ? w(b95Var, cPeek) : y();
        }
        if (ltcVarW != null) {
            return ltcVarW;
        }
        this.h++;
        return k(String.valueOf(cPeek));
    }

    public final ltc y() {
        int i = this.h;
        int length = this.g.length();
        while (true) {
            int i2 = this.h;
            if (i2 == length || this.f12891c.get(this.g.charAt(i2))) {
                break;
            }
            this.h++;
        }
        int i3 = this.h;
        if (i != i3) {
            return o(this.g, i, i3);
        }
        return null;
    }

    public final void z(z85 z85Var) {
        z85 z85Var2 = z85Var.f19315e;
        if (z85Var2 != null) {
            z85Var2.f = z85Var.f;
        }
        z85 z85Var3 = z85Var.f;
        if (z85Var3 == null) {
            this.i = z85Var2;
        } else {
            z85Var3.f19315e = z85Var2;
        }
    }
}
