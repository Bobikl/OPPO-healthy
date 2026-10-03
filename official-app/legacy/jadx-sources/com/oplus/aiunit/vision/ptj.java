package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.ParserTag;
import java.io.BufferedReader;
import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class ptj implements bv5 {
    public final com.badlogic.gdx.utils.j<Texture> i = new com.badlogic.gdx.utils.j<>(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wg0<a> f15480j = new wg0<>();

    public static class c {
        public final wg0<p> a = new wg0<>();
        public final wg0<q> b = new wg0<>();

        public class a implements o<q> {
            public final /* synthetic */ String[] a;

            public a(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.i = Integer.parseInt(this.a[1]);
                qVar.f15491j = Integer.parseInt(this.a[2]);
            }
        }

        public class b implements o<q> {
            public final /* synthetic */ String[] a;

            public b(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.g = Integer.parseInt(this.a[1]);
                qVar.h = Integer.parseInt(this.a[2]);
                qVar.i = Integer.parseInt(this.a[3]);
                qVar.f15491j = Integer.parseInt(this.a[4]);
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.ptj$c$c, reason: collision with other inner class name */
        public class C0915c implements o<q> {
            public final /* synthetic */ String[] a;

            public C0915c(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                String str = this.a[1];
                if (str.equals(SpeechConstant.TRUE_STR)) {
                    qVar.k = 90;
                } else if (!str.equals(SpeechConstant.FALSE_STR)) {
                    qVar.k = Integer.parseInt(str);
                }
                qVar.f15492l = qVar.k == 90;
            }
        }

        public class d implements o<q> {
            public final /* synthetic */ String[] a;
            public final /* synthetic */ boolean[] b;

            public d(String[] strArr, boolean[] zArr) {
                this.a = strArr;
                this.b = zArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                int i = Integer.parseInt(this.a[1]);
                qVar.m = i;
                if (i != -1) {
                    this.b[0] = true;
                }
            }
        }

        public class e implements Comparator<q> {
            public e() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(q qVar, q qVar2) {
                int i = qVar.m;
                if (i == -1) {
                    i = Integer.MAX_VALUE;
                }
                int i2 = qVar2.m;
                return i - (i2 != -1 ? i2 : Integer.MAX_VALUE);
            }
        }

        public class f implements o<p> {
            public final /* synthetic */ String[] a;

            public f(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.d = Integer.parseInt(this.a[1]);
                pVar.f15486e = Integer.parseInt(this.a[2]);
            }
        }

        public class g implements o<p> {
            public final /* synthetic */ String[] a;

            public g(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.g = Pixmap.Format.valueOf(this.a[1]);
            }
        }

        public class h implements o<p> {
            public final /* synthetic */ String[] a;

            public h(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.h = Texture.TextureFilter.valueOf(this.a[1]);
                pVar.i = Texture.TextureFilter.valueOf(this.a[2]);
                pVar.f = pVar.h.isMipMap();
            }
        }

        public class i implements o<p> {
            public final /* synthetic */ String[] a;

            public i(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                if (this.a[1].indexOf(120) != -1) {
                    pVar.f15487j = Texture.TextureWrap.Repeat;
                }
                if (this.a[1].indexOf(121) != -1) {
                    pVar.k = Texture.TextureWrap.Repeat;
                }
            }
        }

        public class j implements o<p> {
            public final /* synthetic */ String[] a;

            public j(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.f15488l = this.a[1].equals(SpeechConstant.TRUE_STR);
            }
        }

        public class k implements o<q> {
            public final /* synthetic */ String[] a;

            public k(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f15489c = Integer.parseInt(this.a[1]);
                qVar.d = Integer.parseInt(this.a[2]);
            }
        }

        public class l implements o<q> {
            public final /* synthetic */ String[] a;

            public l(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f15490e = Integer.parseInt(this.a[1]);
                qVar.f = Integer.parseInt(this.a[2]);
            }
        }

        public class m implements o<q> {
            public final /* synthetic */ String[] a;

            public m(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f15489c = Integer.parseInt(this.a[1]);
                qVar.d = Integer.parseInt(this.a[2]);
                qVar.f15490e = Integer.parseInt(this.a[3]);
                qVar.f = Integer.parseInt(this.a[4]);
            }
        }

        public class n implements o<q> {
            public final /* synthetic */ String[] a;

            public n(String[] strArr) {
                this.a = strArr;
            }

            @Override // com.oplus.aiunit.vision.ptj.c.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.g = Integer.parseInt(this.a[1]);
                qVar.h = Integer.parseInt(this.a[2]);
            }
        }

        public interface o<T> {
            void a(T t);
        }

        public static class p {
            public String a;
            public kb7 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Texture f15485c;
            public float d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f15486e;
            public boolean f;
            public Pixmap.Format g = Pixmap.Format.RGBA8888;
            public Texture.TextureFilter h;
            public Texture.TextureFilter i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Texture.TextureWrap f15487j;
            public Texture.TextureWrap k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public boolean f15488l;

            public p() {
                Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
                this.h = textureFilter;
                this.i = textureFilter;
                Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
                this.f15487j = textureWrap;
                this.k = textureWrap;
            }
        }

        public static class q {
            public p a;
            public String b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f15489c;
            public int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f15490e;
            public int f;
            public float g;
            public float h;
            public int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f15491j;
            public int k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public boolean f15492l;
            public int m = -1;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public String[] f15493n;
            public int[][] o;
            public boolean p;
        }

        public c(kb7 kb7Var, kb7 kb7Var2, boolean z) {
            b(kb7Var, kb7Var2, z);
        }

        public static int c(String[] strArr, String str) {
            int iIndexOf;
            if (str == null) {
                return 0;
            }
            String strTrim = str.trim();
            if (strTrim.length() == 0 || (iIndexOf = strTrim.indexOf(58)) == -1) {
                return 0;
            }
            strArr[0] = strTrim.substring(0, iIndexOf).trim();
            int i2 = 1;
            int i3 = iIndexOf + 1;
            while (true) {
                int iIndexOf2 = strTrim.indexOf(44, i3);
                if (iIndexOf2 == -1) {
                    strArr[i2] = strTrim.substring(i3).trim();
                    return i2;
                }
                strArr[i2] = strTrim.substring(i3, iIndexOf2).trim();
                i3 = iIndexOf2 + 1;
                if (i2 == 4) {
                    return 4;
                }
                i2++;
            }
        }

        public wg0<p> a() {
            return this.a;
        }

        public void b(kb7 kb7Var, kb7 kb7Var2, boolean z) {
            String str;
            String str2;
            String[] strArr = new String[5];
            com.badlogic.gdx.utils.i iVar = new com.badlogic.gdx.utils.i(15, 0.99f);
            iVar.h("size", new f(strArr));
            iVar.h("format", new g(strArr));
            iVar.h("filter", new h(strArr));
            iVar.h("repeat", new i(strArr));
            iVar.h("pma", new j(strArr));
            boolean z2 = true;
            int i2 = 0;
            boolean[] zArr = {false};
            com.badlogic.gdx.utils.i iVar2 = new com.badlogic.gdx.utils.i(127, 0.99f);
            iVar2.h("xy", new k(strArr));
            iVar2.h("size", new l(strArr));
            iVar2.h("bounds", new m(strArr));
            iVar2.h(TypedValues.CycleType.S_WAVE_OFFSET, new n(strArr));
            iVar2.h("orig", new a(strArr));
            iVar2.h(ParserTag.TAG_OFFSETS, new b(strArr));
            iVar2.h("rotate", new C0915c(strArr));
            iVar2.h("index", new d(strArr, zArr));
            BufferedReader bufferedReaderQ = kb7Var.q(1024);
            try {
                try {
                    String line = bufferedReaderQ.readLine();
                    while (line != null) {
                        try {
                            if (line.trim().length() != 0) {
                                break;
                            } else {
                                line = bufferedReaderQ.readLine();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = line;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error reading texture atlas file: ");
                            sb.append(kb7Var);
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = "\nLine: " + str;
                            }
                            sb.append(str2);
                            throw new GdxRuntimeException(sb.toString(), e);
                        }
                    }
                    while (line != null && line.trim().length() != 0 && c(strArr, line) != 0) {
                        line = bufferedReaderQ.readLine();
                    }
                    p pVar = null;
                    wg0 wg0Var = null;
                    wg0 wg0Var2 = null;
                    while (line != null) {
                        if (line.trim().length() == 0) {
                            line = bufferedReaderQ.readLine();
                            pVar = null;
                        } else if (pVar == null) {
                            pVar = new p();
                            pVar.a = line;
                            pVar.b = kb7Var2.a(line);
                            while (true) {
                                line = bufferedReaderQ.readLine();
                                if (c(strArr, line) == 0) {
                                    break;
                                }
                                o oVar = (o) iVar.get(strArr[i2]);
                                if (oVar != null) {
                                    oVar.a(pVar);
                                }
                            }
                            this.a.a(pVar);
                        } else {
                            q qVar = new q();
                            qVar.a = pVar;
                            qVar.b = line.trim();
                            if (z) {
                                qVar.p = z2;
                            }
                            while (true) {
                                line = bufferedReaderQ.readLine();
                                int iC = c(strArr, line);
                                if (iC == 0) {
                                    break;
                                }
                                o oVar2 = (o) iVar2.get(strArr[i2]);
                                if (oVar2 != null) {
                                    oVar2.a(qVar);
                                } else {
                                    if (wg0Var == null) {
                                        wg0Var = new wg0(8);
                                        wg0Var2 = new wg0(8);
                                    }
                                    wg0Var.a(strArr[i2]);
                                    int[] iArr = new int[iC];
                                    while (i2 < iC) {
                                        int i3 = i2 + 1;
                                        try {
                                            iArr[i2] = Integer.parseInt(strArr[i3]);
                                        } catch (NumberFormatException unused) {
                                        }
                                        i2 = i3;
                                    }
                                    wg0Var2.a(iArr);
                                }
                                z2 = true;
                                i2 = 0;
                            }
                            if (qVar.i == 0 && qVar.f15491j == 0) {
                                qVar.i = qVar.f15490e;
                                qVar.f15491j = qVar.f;
                            }
                            if (wg0Var != null && wg0Var.f18241j > 0) {
                                qVar.f15493n = (String[]) wg0Var.m(String.class);
                                qVar.o = (int[][]) wg0Var2.m(int[].class);
                                wg0Var.clear();
                                wg0Var2.clear();
                            }
                            this.b.a(qVar);
                        }
                    }
                    nwi.a(bufferedReaderQ);
                    if (zArr[i2]) {
                        this.b.sort(new e());
                    }
                } catch (Exception e3) {
                    e = e3;
                    str = null;
                }
            } catch (Throwable th) {
                nwi.a(bufferedReaderQ);
                throw th;
            }
        }
    }

    public ptj() {
    }

    public uki b(String str) {
        int i = this.f15480j.f18241j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15480j.get(i2).i.equals(str)) {
                return p(this.f15480j.get(i2));
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        com.badlogic.gdx.utils.j.a<Texture> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.i.b(0);
    }

    public a i(String str) {
        int i = this.f15480j.f18241j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15480j.get(i2).i.equals(str)) {
                return this.f15480j.get(i2);
            }
        }
        return null;
    }

    public wg0<a> n() {
        return this.f15480j;
    }

    public void o(c cVar) {
        this.i.c(cVar.a.f18241j);
        wg0.b<c.p> it = cVar.a.iterator();
        while (it.hasNext()) {
            c.p next = it.next();
            if (next.f15485c == null) {
                next.f15485c = new Texture(next.b, next.g, next.f);
            }
            next.f15485c.s(next.h, next.i);
            next.f15485c.t(next.f15487j, next.k);
            this.i.add(next.f15485c);
        }
        this.f15480j.e(cVar.b.f18241j);
        wg0.b<c.q> it2 = cVar.b.iterator();
        while (it2.hasNext()) {
            c.q next2 = it2.next();
            Texture texture = next2.a.f15485c;
            int i = next2.f15489c;
            int i2 = next2.d;
            boolean z = next2.f15492l;
            a aVar = new a(texture, i, i2, z ? next2.f : next2.f15490e, z ? next2.f15490e : next2.f);
            aVar.h = next2.m;
            aVar.i = next2.b;
            aVar.f15481j = next2.g;
            aVar.k = next2.h;
            aVar.o = next2.f15491j;
            aVar.f15483n = next2.i;
            aVar.p = next2.f15492l;
            aVar.q = next2.k;
            aVar.r = next2.f15493n;
            aVar.s = next2.o;
            if (next2.p) {
                aVar.a(false, true);
            }
            this.f15480j.a(aVar);
        }
    }

    public final uki p(a aVar) {
        if (aVar.f15482l != aVar.f15483n || aVar.m != aVar.o) {
            return new b(aVar);
        }
        if (!aVar.p) {
            return new uki(aVar);
        }
        uki ukiVar = new uki(aVar);
        ukiVar.v(0.0f, 0.0f, aVar.b(), aVar.c());
        ukiVar.s(true);
        return ukiVar;
    }

    public ptj(c cVar) {
        o(cVar);
    }

    public static class a extends xtj {
        public int h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f15481j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15482l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15483n;
        public int o;
        public boolean p;
        public int q;
        public String[] r;
        public int[][] s;

        public a(Texture texture, int i, int i2, int i3, int i4) {
            super(texture, i, i2, i3, i4);
            this.h = -1;
            this.f15483n = i3;
            this.o = i4;
            this.f15482l = i3;
            this.m = i4;
        }

        @Override // com.oplus.aiunit.vision.xtj
        public void a(boolean z, boolean z2) {
            super.a(z, z2);
            if (z) {
                this.f15481j = (this.f15483n - this.f15481j) - m();
            }
            if (z2) {
                this.k = (this.o - this.k) - l();
            }
        }

        public int[] k(String str) {
            String[] strArr = this.r;
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (str.equals(this.r[i])) {
                    return this.s[i];
                }
            }
            return null;
        }

        public float l() {
            return this.p ? this.f15482l : this.m;
        }

        public float m() {
            return this.p ? this.m : this.f15482l;
        }

        public String toString() {
            return this.i;
        }

        public a(a aVar) {
            this.h = -1;
            i(aVar);
            this.h = aVar.h;
            this.i = aVar.i;
            this.f15481j = aVar.f15481j;
            this.k = aVar.k;
            this.f15482l = aVar.f15482l;
            this.m = aVar.m;
            this.f15483n = aVar.f15483n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
            this.s = aVar.s;
        }
    }

    public static class b extends uki {
        public final a u;
        public float v;
        public float w;

        public b(a aVar) {
            this.u = new a(aVar);
            this.v = aVar.f15481j;
            this.w = aVar.k;
            i(aVar);
            A(aVar.f15483n / 2.0f, aVar.o / 2.0f);
            int iC = aVar.c();
            int iB = aVar.b();
            if (aVar.p) {
                super.s(true);
                super.v(aVar.f15481j, aVar.k, iB, iC);
            } else {
                super.v(aVar.f15481j, aVar.k, iC, iB);
            }
            y(1.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void A(float f, float f2) {
            a aVar = this.u;
            super.A(f - aVar.f15481j, f2 - aVar.k);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void B() {
            float f = this.m / 2.0f;
            a aVar = this.u;
            super.A(f - aVar.f15481j, (this.f17512n / 2.0f) - aVar.k);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void C(float f, float f2) {
            a aVar = this.u;
            super.C(f + aVar.f15481j, f2 + aVar.k);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void E(float f, float f2) {
            v(q(), r(), f, f2);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void F(float f) {
            super.F(f + this.u.f15481j);
        }

        @Override // com.oplus.aiunit.vision.uki
        public void G(float f) {
            super.G(f + this.u.k);
        }

        public float I() {
            return super.l() / this.u.l();
        }

        public float J() {
            return super.p() / this.u.m();
        }

        @Override // com.oplus.aiunit.vision.uki
        public float l() {
            return (super.l() / this.u.l()) * this.u.o;
        }

        @Override // com.oplus.aiunit.vision.uki
        public float m() {
            return super.m() + this.u.f15481j;
        }

        @Override // com.oplus.aiunit.vision.uki
        public float n() {
            return super.n() + this.u.k;
        }

        @Override // com.oplus.aiunit.vision.uki
        public float p() {
            return (super.p() / this.u.m()) * this.u.f15483n;
        }

        @Override // com.oplus.aiunit.vision.uki
        public float q() {
            return super.q() - this.u.f15481j;
        }

        @Override // com.oplus.aiunit.vision.uki
        public float r() {
            return super.r() - this.u.k;
        }

        @Override // com.oplus.aiunit.vision.uki
        public void s(boolean z) {
            super.s(z);
            float fM = m();
            float fN = n();
            a aVar = this.u;
            float f = aVar.f15481j;
            float f2 = aVar.k;
            float fJ = J();
            float fI = I();
            if (z) {
                a aVar2 = this.u;
                aVar2.f15481j = f2;
                aVar2.k = ((aVar2.o * fI) - f) - (aVar2.f15482l * fJ);
            } else {
                a aVar3 = this.u;
                aVar3.f15481j = ((aVar3.f15483n * fJ) - f2) - (aVar3.m * fI);
                aVar3.k = f;
            }
            a aVar4 = this.u;
            H(aVar4.f15481j - f, aVar4.k - f2);
            A(fM, fN);
        }

        public String toString() {
            return this.u.toString();
        }

        @Override // com.oplus.aiunit.vision.uki
        public void v(float f, float f2, float f3, float f4) {
            a aVar = this.u;
            float f5 = f3 / aVar.f15483n;
            float f6 = f4 / aVar.o;
            float f7 = this.v * f5;
            aVar.f15481j = f7;
            float f8 = this.w * f6;
            aVar.k = f8;
            boolean z = aVar.p;
            super.v(f + f7, f2 + f8, (z ? aVar.m : aVar.f15482l) * f5, (z ? aVar.f15482l : aVar.m) * f6);
        }

        public b(b bVar) {
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            t(bVar);
        }
    }
}
