package com.caverock.androidsvg;

import android.util.Log;
import com.oplus.aiunit.vision.hca;
import com.oplus.aiunit.vision.kam;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes13.dex */
public class CSSParser {
    public MediaType a;
    public Source b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1443c;

    public enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, PseudoClassIdents> cache = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    cache.put(pseudoClassIdents.name().replace('_', Soundex.SILENT_MARKER), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = cache.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    public enum Source {
        Document,
        RenderOptions
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            b = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            a = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static class b {
        public final String a;
        public final AttribOp b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1444c;

        public b(String str, AttribOp attribOp, String str2) {
            this.a = str;
            this.b = attribOp;
            this.f1444c = str2;
        }
    }

    public static class c extends SVGParser.g {

        public static class a {
            public int a;
            public int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        public c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public final int C(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }

        public final a D() throws CSSParseException {
            hca hcaVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            int i2 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i3 = (!f('+') && f(Soundex.SILENT_MARKER)) ? -1 : 1;
                    hca hcaVarC2 = hca.c(this.a, this.b, this.f1477c, false);
                    if (hcaVarC2 != null) {
                        this.b = hcaVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (hcaVarC2 == null) {
                            hcaVarC2 = new hca(1L, this.b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f(Soundex.SILENT_MARKER))) {
                            i2 = -1;
                        }
                        if (zF) {
                            A();
                            hcaVarC = hca.c(this.a, this.b, this.f1477c, false);
                            if (hcaVarC == null) {
                                this.b = i;
                                return null;
                            }
                            this.b = hcaVarC.a();
                        } else {
                            hcaVarC = null;
                        }
                        int i4 = i2;
                        i2 = i3;
                        i3 = i4;
                    } else {
                        hcaVarC = hcaVarC2;
                        hcaVarC2 = null;
                    }
                    aVar = new a(hcaVarC2 == null ? 0 : i2 * hcaVarC2.d(), hcaVarC != null ? i3 * hcaVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.b = i;
            return null;
        }

        public final String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        public String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.a.charAt(this.b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i = 1; i <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb.toString();
        }

        public final List<String> G() throws CSSParseException {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.b = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.b = i;
            return null;
        }

        public String H() {
            int iP = P();
            int i = this.b;
            if (iP == i) {
                return null;
            }
            String strSubstring = this.a.substring(i, iP);
            this.b = iP;
            return strSubstring;
        }

        public String I() {
            char cCharAt;
            int iC;
            StringBuilder sb = new StringBuilder();
            while (!h() && (cCharAt = this.a.charAt(this.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.a;
                        int i = this.b;
                        this.b = i + 1;
                        cCharAt = str.charAt(i);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !h() && (iC = C(this.a.charAt(this.b))) != -1; i2++) {
                                    this.b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        public String J() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int iCharAt = this.a.charAt(i);
            int i2 = i;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i2 = this.b + 1;
                }
                iCharAt = a();
            }
            if (this.b > i) {
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        public final List<o> K() throws CSSParseException {
            List<p> list;
            List<d> list2;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            List<o> listL = L();
            if (listL == null) {
                this.b = i;
                return null;
            }
            if (!f(')')) {
                this.b = i;
                return null;
            }
            Iterator<o> it = listL.iterator();
            while (it.hasNext() && (list = it.next().a) != null) {
                Iterator<p> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().d) != null) {
                    Iterator<d> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof g) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        public final List<o> L() throws CSSParseException {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            o oVar = new o(aVar);
            while (!h() && M(oVar)) {
                if (z()) {
                    arrayList.add(oVar);
                    oVar = new o(aVar);
                }
            }
            if (!oVar.f()) {
                arrayList.add(oVar);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        public boolean M(o oVar) throws CSSParseException {
            Combinator combinator;
            p pVar;
            AttribOp attribOp;
            String strE;
            if (h()) {
                return false;
            }
            int i = this.b;
            if (oVar.f()) {
                combinator = null;
            } else if (f(Typography.greater)) {
                combinator = Combinator.CHILD;
                A();
            } else if (f('+')) {
                combinator = Combinator.FOLLOWS;
                A();
            } else {
                combinator = null;
            }
            if (f('*')) {
                pVar = new p(combinator, null);
            } else {
                String strH = H();
                if (strH != null) {
                    p pVar2 = new p(combinator, strH);
                    oVar.c();
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
            }
            while (!h()) {
                if (!f('.')) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(':')) {
                                break;
                            }
                            if (pVar == null) {
                                pVar = new p(combinator, null);
                            }
                            O(oVar, pVar);
                        } else {
                            if (pVar == null) {
                                pVar = new p(combinator, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            A();
                            if (f(kam.h)) {
                                attribOp = AttribOp.EQUALS;
                            } else if (g("~=")) {
                                attribOp = AttribOp.INCLUDES;
                            } else {
                                attribOp = g("|=") ? AttribOp.DASHMATCH : null;
                            }
                            if (attribOp != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new CSSParseException("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new CSSParseException("Invalid attribute simpleSelectors");
                            }
                            if (attribOp == null) {
                                attribOp = AttribOp.EXISTS;
                            }
                            pVar.a(strH2, attribOp, strE);
                            oVar.b();
                        }
                    } else {
                        if (pVar == null) {
                            pVar = new p(combinator, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new CSSParseException("Invalid \"#id\" simpleSelectors");
                        }
                        pVar.a("id", AttribOp.EQUALS, strH3);
                        oVar.d();
                    }
                } else {
                    if (pVar == null) {
                        pVar = new p(combinator, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors");
                    }
                    pVar.a("class", AttribOp.EQUALS, strH4);
                    oVar.b();
                }
            }
            if (pVar != null) {
                oVar.a(pVar);
                return true;
            }
            this.b = i;
            return false;
        }

        public String N() {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.b = i;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.b = i;
            return null;
        }

        public final void O(o oVar, p pVar) throws CSSParseException {
            d dVar;
            d dVar2;
            String strH = H();
            if (strH == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents pseudoClassIdentsFromString = PseudoClassIdents.fromString(strH);
            a aVar = null;
            switch (a.b[pseudoClassIdentsFromString.ordinal()]) {
                case 1:
                    d eVar = new e(0, 1, true, false, null);
                    oVar.b();
                    dVar2 = eVar;
                    pVar.b(dVar2);
                    return;
                case 2:
                    d eVar2 = new e(0, 1, false, false, null);
                    oVar.b();
                    dVar2 = eVar2;
                    pVar.b(dVar2);
                    return;
                case 3:
                    d iVar = new i(false, null);
                    oVar.b();
                    dVar2 = iVar;
                    pVar.b(dVar2);
                    return;
                case 4:
                    d eVar3 = new e(0, 1, true, true, pVar.b);
                    oVar.b();
                    dVar2 = eVar3;
                    pVar.b(dVar2);
                    return;
                case 5:
                    d eVar4 = new e(0, 1, false, true, pVar.b);
                    oVar.b();
                    dVar2 = eVar4;
                    pVar.b(dVar2);
                    return;
                case 6:
                    d iVar2 = new i(true, pVar.b);
                    oVar.b();
                    dVar2 = iVar2;
                    pVar.b(dVar2);
                    return;
                case 7:
                    d jVar = new j(aVar);
                    oVar.b();
                    dVar2 = jVar;
                    pVar.b(dVar2);
                    return;
                case 8:
                    d fVar = new f(aVar);
                    oVar.b();
                    dVar2 = fVar;
                    pVar.b(dVar2);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type;
                    boolean z2 = pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    d eVar5 = new e(aVarD.a, aVarD.b, z, z2, pVar.b);
                    oVar.b();
                    dVar = eVar5;
                    dVar2 = dVar;
                    pVar.b(dVar2);
                    return;
                case 13:
                    List<o> listK = K();
                    if (listK == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    g gVar = new g(listK);
                    oVar.b = gVar.b();
                    dVar = gVar;
                    dVar2 = dVar;
                    pVar.b(dVar2);
                    return;
                case 14:
                    d kVar = new k(aVar);
                    oVar.b();
                    dVar2 = kVar;
                    pVar.b(dVar2);
                    return;
                case 15:
                    G();
                    d hVar = new h(strH);
                    oVar.b();
                    dVar2 = hVar;
                    pVar.b(dVar2);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    d hVar2 = new h(strH);
                    oVar.b();
                    dVar2 = hVar2;
                    pVar.b(dVar2);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + strH);
            }
        }

        public final int P() {
            int i;
            if (h()) {
                return this.b;
            }
            int i2 = this.b;
            int iCharAt = this.a.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i = this.b;
            }
            this.b = i2;
            return i;
        }
    }

    public interface d {
        boolean a(m mVar, SVG.j0 j0Var);
    }

    public static class e implements d {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1445c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1446e;

        public e(int i, int i2, boolean z, boolean z2, String str) {
            this.a = i;
            this.b = i2;
            this.f1445c = z;
            this.d = z2;
            this.f1446e = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i;
            int i2;
            String strM = (this.d && this.f1446e == null) ? j0Var.m() : this.f1446e;
            SVG.h0 h0Var = j0Var.b;
            if (h0Var != null) {
                Iterator<SVG.l0> it = h0Var.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) it.next();
                    if (j0Var2 == j0Var) {
                        i = i2;
                    }
                    if (strM == null || j0Var2.m().equals(strM)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.f1445c ? i + 1 : i2 - i;
            int i4 = this.a;
            if (i4 == 0) {
                return i3 == this.b;
            }
            int i5 = this.b;
            if ((i3 - i5) % i4 == 0) {
                return Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.b) == Integer.signum(this.a);
            }
            return false;
        }

        public String toString() {
            String str = this.f1445c ? "" : "last-";
            return this.d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.a), Integer.valueOf(this.b), this.f1446e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    public static class f implements d {
        public f() {
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return !(j0Var instanceof SVG.h0) || ((SVG.h0) j0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    public static class g implements d {
        public List<o> a;

        public g(List<o> list) {
            this.a = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            Iterator<o> it = this.a.iterator();
            while (it.hasNext()) {
                if (CSSParser.l(mVar, it.next(), j0Var)) {
                    return false;
                }
            }
            return true;
        }

        public int b() {
            Iterator<o> it = this.a.iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i2 = it.next().b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.a + ")";
        }
    }

    public static class h implements d {
        public String a;

        public h(String str) {
            this.a = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    public static class i implements d {
        public boolean a;
        public String b;

        public i(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i;
            String strM = (this.a && this.b == null) ? j0Var.m() : this.b;
            SVG.h0 h0Var = j0Var.b;
            if (h0Var != null) {
                Iterator<SVG.l0> it = h0Var.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) it.next();
                    if (strM == null || j0Var2.m().equals(strM)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            return this.a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    public static class j implements d {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return j0Var.b == null;
        }

        public String toString() {
            return "root";
        }
    }

    public static class k implements d {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return mVar != null && j0Var == mVar.a;
        }

        public String toString() {
            return "target";
        }
    }

    public static class l {
        public o a;
        public SVG.Style b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Source f1447c;

        public l(o oVar, SVG.Style style, Source source) {
            this.a = oVar;
            this.b = style;
            this.f1447c = source;
        }

        public String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.f1447c + ")";
        }
    }

    public static class m {
        public SVG.j0 a;

        public String toString() {
            SVG.j0 j0Var = this.a;
            return j0Var != null ? String.format("<%s id=\"%s\">", j0Var.m(), this.a.f1465c) : "";
        }
    }

    public static class n {
        public List<l> a = null;

        public void a(l lVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).a.b > lVar.a.b) {
                    this.a.add(i, lVar);
                    return;
                }
            }
            this.a.add(lVar);
        }

        public void b(n nVar) {
            if (nVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(nVar.a.size());
            }
            Iterator<l> it = nVar.a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<l> c() {
            return this.a;
        }

        public boolean d() {
            List<l> list = this.a;
            return list == null || list.isEmpty();
        }

        public void e(Source source) {
            List<l> list = this.a;
            if (list == null) {
                return;
            }
            Iterator<l> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f1447c == source) {
                    it.remove();
                }
            }
        }

        public int f() {
            List<l> list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator<l> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public static class p {
        public Combinator a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<b> f1448c = null;
        public List<d> d = null;

        public p(Combinator combinator, String str) {
            this.a = null;
            this.b = null;
            this.a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.b = str;
        }

        public void a(String str, AttribOp attribOp, String str2) {
            if (this.f1448c == null) {
                this.f1448c = new ArrayList();
            }
            this.f1448c.add(new b(str, attribOp, str2));
        }

        public void b(d dVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(dVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.a;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<b> list = this.f1448c;
            if (list != null) {
                for (b bVar : list) {
                    sb.append('[');
                    sb.append(bVar.a);
                    int i = a.a[bVar.b.ordinal()];
                    if (i == 1) {
                        sb.append(kam.h);
                        sb.append(bVar.f1444c);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(bVar.f1444c);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(bVar.f1444c);
                    }
                    sb.append(']');
                }
            }
            List<d> list2 = this.d;
            if (list2 != null) {
                for (d dVar : list2) {
                    sb.append(':');
                    sb.append(dVar);
                }
            }
            return sb.toString();
        }
    }

    public CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    public static int a(List<SVG.h0> list, int i2, SVG.j0 j0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        SVG.h0 h0Var = list.get(i2);
        SVG.h0 h0Var2 = j0Var.b;
        if (h0Var != h0Var2) {
            return -1;
        }
        Iterator<SVG.l0> it = h0Var2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == j0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static boolean b(String str, MediaType mediaType) {
        c cVar = new c(str);
        cVar.A();
        return c(h(cVar), mediaType);
    }

    public static boolean c(List<MediaType> list, MediaType mediaType) {
        for (MediaType mediaType2 : list) {
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    public static List<String> f(String str) {
        c cVar = new c(str);
        ArrayList arrayList = null;
        while (!cVar.h()) {
            String strR = cVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                cVar.A();
            }
        }
        return arrayList;
    }

    public static List<MediaType> h(c cVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!cVar.h() && (strW = cVar.w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean k(m mVar, o oVar, int i2, List<SVG.h0> list, int i3, SVG.j0 j0Var) {
        p pVarE = oVar.e(i2);
        if (!n(mVar, pVarE, list, i3, j0Var)) {
            return false;
        }
        Combinator combinator = pVarE.a;
        if (combinator == Combinator.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (m(mVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i2 - 1, list, i3);
        }
        int iA = a(list, i3, j0Var);
        if (iA <= 0) {
            return false;
        }
        return k(mVar, oVar, i2 - 1, list, i3, (SVG.j0) j0Var.b.getChildren().get(iA - 1));
    }

    public static boolean l(m mVar, o oVar, SVG.j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = j0Var.b; obj != null; obj = ((SVG.l0) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return oVar.g() == 1 ? n(mVar, oVar.e(0), arrayList, size, j0Var) : k(mVar, oVar, oVar.g() - 1, arrayList, size, j0Var);
    }

    public static boolean m(m mVar, o oVar, int i2, List<SVG.h0> list, int i3) {
        p pVarE = oVar.e(i2);
        SVG.j0 j0Var = (SVG.j0) list.get(i3);
        if (!n(mVar, pVarE, list, i3, j0Var)) {
            return false;
        }
        Combinator combinator = pVarE.a;
        if (combinator == Combinator.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (m(mVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i2 - 1, list, i3 - 1);
        }
        int iA = a(list, i3, j0Var);
        if (iA <= 0) {
            return false;
        }
        return k(mVar, oVar, i2 - 1, list, i3, (SVG.j0) j0Var.b.getChildren().get(iA - 1));
    }

    public static boolean n(m mVar, p pVar, List<SVG.h0> list, int i2, SVG.j0 j0Var) {
        List<String> list2;
        String str = pVar.b;
        if (str != null && !str.equals(j0Var.m().toLowerCase(Locale.US))) {
            return false;
        }
        List<b> list3 = pVar.f1448c;
        if (list3 != null) {
            for (b bVar : list3) {
                String str2 = bVar.a;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!bVar.f1444c.equals(j0Var.f1465c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = j0Var.g) == null || !list2.contains(bVar.f1444c)) {
                    return false;
                }
            }
        }
        List<d> list4 = pVar.d;
        if (list4 == null) {
            return true;
        }
        Iterator<d> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(mVar, j0Var)) {
                return false;
            }
        }
        return true;
    }

    public static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    public n d(String str) {
        c cVar = new c(str);
        cVar.A();
        return j(cVar);
    }

    public final void e(n nVar, c cVar) throws CSSParseException {
        String strH = cVar.H();
        cVar.A();
        if (strH == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.f1443c && strH.equals("media")) {
            List<MediaType> listH = h(cVar);
            if (!cVar.f('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cVar.A();
            if (c(listH, this.a)) {
                this.f1443c = true;
                nVar.b(j(cVar));
                this.f1443c = false;
            } else {
                j(cVar);
            }
            if (!cVar.h() && !cVar.f('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f1443c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(cVar);
        } else {
            String strN = cVar.N();
            if (strN == null) {
                strN = cVar.F();
            }
            if (strN == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cVar.A();
            h(cVar);
            if (!cVar.h() && !cVar.f(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            SVG.k();
        }
        cVar.A();
    }

    public final SVG.Style g(c cVar) throws CSSParseException {
        SVG.Style style = new SVG.Style();
        do {
            String strH = cVar.H();
            cVar.A();
            if (!cVar.f(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cVar.A();
            String strJ = cVar.J();
            if (strJ == null) {
                throw new CSSParseException("Expected property value");
            }
            cVar.A();
            if (cVar.f('!')) {
                cVar.A();
                if (!cVar.g("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cVar.A();
            }
            cVar.f(';');
            SVGParser.S0(style, strH, strJ);
            cVar.A();
            if (cVar.h()) {
                break;
            }
        } while (!cVar.f('}'));
        return style;
    }

    public final boolean i(n nVar, c cVar) throws CSSParseException {
        List listL = cVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!cVar.f('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cVar.A();
        SVG.Style styleG = g(cVar);
        cVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            nVar.a(new l((o) it.next(), styleG, this.b));
        }
        return true;
    }

    public final n j(c cVar) {
        n nVar = new n();
        while (!cVar.h()) {
            try {
                if (!cVar.g("<!--") && !cVar.g("-->")) {
                    if (!cVar.f('@')) {
                        if (!i(nVar, cVar)) {
                            break;
                        }
                    } else {
                        e(nVar, cVar);
                    }
                }
            } catch (CSSParseException e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
            }
        }
        return nVar;
    }

    public final void o(c cVar) {
        int i2 = 0;
        while (!cVar.h()) {
            int iIntValue = cVar.l().intValue();
            if (iIntValue == 59 && i2 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i2++;
            } else if (iIntValue == 125 && i2 > 0 && (i2 = i2 - 1) == 0) {
                return;
            }
        }
    }

    public CSSParser(MediaType mediaType, Source source) {
        this.f1443c = false;
        this.a = mediaType;
        this.b = source;
    }

    public static class o {
        public List<p> a;
        public int b;

        public o() {
            this.a = null;
            this.b = 0;
        }

        public void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(pVar);
        }

        public void b() {
            this.b += 1000;
        }

        public void c() {
            this.b++;
        }

        public void d() {
            this.b += 1000000;
        }

        public p e(int i) {
            return this.a.get(i);
        }

        public boolean f() {
            List<p> list = this.a;
            return list == null || list.isEmpty();
        }

        public int g() {
            List<p> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<p> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(StringUtil.SPACE);
            }
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }

        public /* synthetic */ o(a aVar) {
            this();
        }
    }
}
