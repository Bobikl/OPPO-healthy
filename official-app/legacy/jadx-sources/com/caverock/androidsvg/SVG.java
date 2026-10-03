package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.hag;
import com.oplus.channel.client.data.Action;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class SVG {
    public static boolean g = true;
    public d0 a = null;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1449c = "";
    public float d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CSSParser.n f1450e = new CSSParser.n();
    public Map<String, j0> f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {
        public TextDecoration A;
        public TextDirection B;
        public TextAnchor C;
        public Boolean D;
        public c E;
        public String F;
        public String G;
        public String H;
        public Boolean I;
        public Boolean J;
        public m0 K;
        public Float L;
        public String M;
        public FillRule N;
        public String O;
        public m0 P;
        public Float Q;
        public m0 R;
        public Float S;
        public VectorEffect T;
        public RenderQuality U;
        public long i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public m0 f1451j;
        public FillRule k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Float f1452l;
        public m0 m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Float f1453n;
        public o o;
        public LineCap p;
        public LineJoin q;
        public Float r;
        public o[] s;
        public o t;
        public Float u;
        public f v;
        public List<String> w;
        public o x;
        public Integer y;
        public FontStyle z;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        public static Style a() {
            Style style = new Style();
            style.i = -1L;
            f fVar = f.f1457j;
            style.f1451j = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.k = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f1452l = fValueOf;
            style.m = null;
            style.f1453n = fValueOf;
            style.o = new o(1.0f);
            style.p = LineCap.Butt;
            style.q = LineJoin.Miter;
            style.r = Float.valueOf(4.0f);
            style.s = null;
            style.t = new o(0.0f);
            style.u = fValueOf;
            style.v = fVar;
            style.w = null;
            style.x = new o(12.0f, Unit.pt);
            style.y = 400;
            style.z = FontStyle.Normal;
            style.A = TextDecoration.None;
            style.B = TextDirection.LTR;
            style.C = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.D = bool;
            style.E = null;
            style.F = null;
            style.G = null;
            style.H = null;
            style.I = bool;
            style.J = bool;
            style.K = fVar;
            style.L = fValueOf;
            style.M = null;
            style.N = fillRule;
            style.O = null;
            style.P = null;
            style.Q = fValueOf;
            style.R = null;
            style.S = fValueOf;
            style.T = VectorEffect.None;
            style.U = RenderQuality.auto;
            return style;
        }

        public void b(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.I = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.D = bool;
            this.E = null;
            this.M = null;
            this.u = Float.valueOf(1.0f);
            this.K = f.f1457j;
            this.L = Float.valueOf(1.0f);
            this.O = null;
            this.P = null;
            this.Q = Float.valueOf(1.0f);
            this.R = null;
            this.S = Float.valueOf(1.0f);
            this.T = VectorEffect.None;
        }

        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            o[] oVarArr = this.s;
            if (oVarArr != null) {
                style.s = (o[]) oVarArr.clone();
            }
            return style;
        }
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Unit.values().length];
            a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends k {
        public o o;
        public o p;
        public o q;
        public o r;
        public o s;
        public o t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "rect";
        }
    }

    public static class a1 extends l0 implements v0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1454c;
        public z0 d;

        public a1(String str) {
            this.f1454c = str;
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.d;
        }

        public String toString() {
            return "TextChild: '" + this.f1454c + "'";
        }
    }

    public static class b0 extends j0 implements h0 {
        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void h(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "solidColor";
        }
    }

    public static class b1 extends l {
        public String p;
        public o q;
        public o r;
        public o s;
        public o t;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String m() {
            return "use";
        }
    }

    public static class c {
        public o a;
        public o b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f1456c;
        public o d;

        public c(o oVar, o oVar2, o oVar3, o oVar4) {
            this.a = oVar;
            this.b = oVar2;
            this.f1456c = oVar3;
            this.d = oVar4;
        }
    }

    public static class c0 extends j0 implements h0 {
        public Float h;

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> getChildren() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void h(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return Action.LIFE_CIRCLE_VALUE_STOP;
        }
    }

    public static class c1 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "view";
        }
    }

    public static class d extends k {
        public o o;
        public o p;
        public o q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "circle";
        }
    }

    public static class d0 extends p0 {
        public o q;
        public o r;
        public o s;
        public o t;
        public String u;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "svg";
        }
    }

    public static class e extends l implements s {
        public Boolean p;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String m() {
            return "clipPath";
        }
    }

    public interface e0 {
        String a();

        void b(Set<String> set);

        void d(Set<String> set);

        Set<String> e();

        Set<String> f();

        void g(Set<String> set);

        Set<String> getRequiredFeatures();

        void i(Set<String> set);

        void j(String str);

        Set<String> l();
    }

    public static class f extends m0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final f f1457j = new f(-16777216);
        public static final f k = new f(0);
        public int i;

        public f(int i) {
            this.i = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.i));
        }
    }

    public static abstract class f0 extends i0 implements h0, e0 {
        public List<l0> i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f1458j = null;
        public String k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f1459l = null;
        public Set<String> m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f1460n = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.f1460n = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.f1459l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.m;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.f1458j = set;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> getChildren() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.f1458j;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void h(l0 l0Var) throws SVGParseException {
            this.i.add(l0Var);
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(Set<String> set) {
            this.m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void j(String str) {
            this.k = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> l() {
            return this.f1460n;
        }
    }

    public static class g extends m0 {
        public static g i = new g();

        public static g a() {
            return i;
        }
    }

    public static abstract class g0 extends i0 implements e0 {
        public Set<String> i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f1461j = null;
        public Set<String> k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f1462l = null;
        public Set<String> m = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.f1461j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.k = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.f1462l;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return this.k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.i = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(Set<String> set) {
            this.f1462l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void j(String str) {
            this.f1461j = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> l() {
            return this.m;
        }
    }

    public static class h extends l implements s {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String m() {
            return "defs";
        }
    }

    public interface h0 {
        List<l0> getChildren();

        void h(l0 l0Var) throws SVGParseException;
    }

    public static class i extends k {
        public o o;
        public o p;
        public o q;
        public o r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends j0 {
        public b h = null;
    }

    public static abstract class j extends j0 implements h0 {
        public List<l0> h = new ArrayList();
        public Boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f1463j;
        public GradientSpread k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f1464l;

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> getChildren() {
            return this.h;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void h(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof c0) {
                this.h.add(l0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + l0Var + " elements.");
        }
    }

    public static abstract class j0 extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1465c = null;
        public Boolean d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Style f1466e = null;
        public Style f = null;
        public List<String> g = null;

        public String toString() {
            return m();
        }
    }

    public static abstract class k extends g0 implements m {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f1467n;

        @Override // com.caverock.androidsvg.SVG.m
        public void k(Matrix matrix) {
            this.f1467n = matrix;
        }
    }

    public static class k0 extends j {
        public o m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f1468n;
        public o o;
        public o p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "linearGradient";
        }
    }

    public static class l extends f0 implements m {
        public Matrix o;

        @Override // com.caverock.androidsvg.SVG.m
        public void k(Matrix matrix) {
            this.o = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "group";
        }
    }

    public static class l0 {
        public SVG a;
        public h0 b;

        public String m() {
            return "";
        }
    }

    public interface m {
        void k(Matrix matrix);
    }

    public static abstract class m0 implements Cloneable {
    }

    public static class n extends n0 implements m {
        public String p;
        public o q;
        public o r;
        public o s;
        public o t;
        public Matrix u;

        @Override // com.caverock.androidsvg.SVG.m
        public void k(Matrix matrix) {
            this.u = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return c8l.IMAGE_KEY;
        }
    }

    public static abstract class n0 extends f0 {
        public PreserveAspectRatio o = null;
    }

    public static class o0 extends j {
        public o m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f1470n;
        public o o;
        public o p;
        public o q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "radialGradient";
        }
    }

    public static class p extends k {
        public o o;
        public o p;
        public o q;
        public o r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "line";
        }
    }

    public static abstract class p0 extends n0 {
        public b p;
    }

    public static class q extends p0 implements s {
        public boolean q;
        public o r;
        public o s;
        public o t;
        public o u;
        public Float v;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "marker";
        }
    }

    public static class q0 extends l {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String m() {
            return "switch";
        }
    }

    public static class r extends f0 implements s {
        public Boolean o;
        public Boolean p;
        public o q;
        public o r;
        public o s;
        public o t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "mask";
        }
    }

    public static class r0 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "symbol";
        }
    }

    public interface s {
    }

    public static class s0 extends w0 implements v0 {
        public String o;
        public z0 p;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.p;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "tref";
        }

        public void n(z0 z0Var) {
            this.p = z0Var;
        }
    }

    public static class t extends m0 {
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public m0 f1471j;

        public t(String str, m0 m0Var) {
            this.i = str;
            this.f1471j = m0Var;
        }

        public String toString() {
            return this.i + " " + this.f1471j;
        }
    }

    public static class t0 extends y0 implements v0 {
        public z0 s;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.s;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "tspan";
        }

        public void n(z0 z0Var) {
            this.s = z0Var;
        }
    }

    public static class u extends k {
        public v o;
        public Float p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "path";
        }
    }

    public static class u0 extends y0 implements z0, m {
        public Matrix s;

        @Override // com.caverock.androidsvg.SVG.m
        public void k(Matrix matrix) {
            this.s = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "text";
        }
    }

    public static class v implements w {
        public int b = 0;
        public int d = 0;
        public byte[] a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f1472c = new float[16];

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f, float f2, float f3, float f4) {
            c((byte) 3);
            d(4);
            float[] fArr = this.f1472c;
            int i = this.d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            this.d = i4 + 1;
            fArr[i4] = f4;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            c((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            d(5);
            float[] fArr = this.f1472c;
            int i = this.d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            this.d = i5 + 1;
            fArr[i5] = f5;
        }

        public final void c(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            c((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            c((byte) 2);
            d(6);
            float[] fArr = this.f1472c;
            int i = this.d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            fArr[i5] = f5;
            this.d = i6 + 1;
            fArr[i6] = f6;
        }

        public final void d(int i) {
            float[] fArr = this.f1472c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f1472c = fArr2;
            }
        }

        public void e(w wVar) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.b; i3++) {
                byte b = this.a[i3];
                if (b != 0) {
                    if (b == 1) {
                        float[] fArr = this.f1472c;
                        int i4 = i2 + 1;
                        i = i4 + 1;
                        wVar.lineTo(fArr[i2], fArr[i4]);
                    } else if (b == 2) {
                        float[] fArr2 = this.f1472c;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        wVar.cubicTo(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.f1472c;
                        int i10 = i2 + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        wVar.a(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                        i2 = i12 + 1;
                    } else if (b != 8) {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        float[] fArr4 = this.f1472c;
                        int i13 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i14 = i13 + 1;
                        float f7 = fArr4[i13];
                        int i15 = i14 + 1;
                        float f8 = fArr4[i14];
                        int i16 = i15 + 1;
                        wVar.b(f6, f7, f8, z, z2, fArr4[i15], fArr4[i16]);
                        i2 = i16 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.f1472c;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    wVar.moveTo(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        public boolean f() {
            return this.b == 0;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void lineTo(float f, float f2) {
            c((byte) 1);
            d(2);
            float[] fArr = this.f1472c;
            int i = this.d;
            int i2 = i + 1;
            fArr[i] = f;
            this.d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void moveTo(float f, float f2) {
            c((byte) 0);
            d(2);
            float[] fArr = this.f1472c;
            int i = this.d;
            int i2 = i + 1;
            fArr[i] = f;
            this.d = i2 + 1;
            fArr[i2] = f2;
        }
    }

    public interface v0 {
        z0 c();
    }

    public interface w {
        void a(float f, float f2, float f3, float f4);

        void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);
    }

    public static abstract class w0 extends f0 {
        @Override // com.caverock.androidsvg.SVG.f0, com.caverock.androidsvg.SVG.h0
        public void h(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof v0) {
                this.i.add(l0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + l0Var + " elements.");
        }
    }

    public static class x extends p0 implements s {
        public Boolean q;
        public Boolean r;
        public Matrix s;
        public o t;
        public o u;
        public o v;
        public o w;
        public String x;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "pattern";
        }
    }

    public static class x0 extends w0 implements v0 {
        public String o;
        public o p;
        public z0 q;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.q;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "textPath";
        }

        public void n(z0 z0Var) {
            this.q = z0Var;
        }
    }

    public static class y extends k {
        public float[] o;

        @Override // com.caverock.androidsvg.SVG.l0
        public String m() {
            return "polyline";
        }
    }

    public static abstract class y0 extends w0 {
        public List<o> o;
        public List<o> p;
        public List<o> q;
        public List<o> r;
    }

    public static class z extends y {
        @Override // com.caverock.androidsvg.SVG.y, com.caverock.androidsvg.SVG.l0
        public String m() {
            return "polygon";
        }
    }

    public interface z0 {
    }

    public static hag k() {
        return null;
    }

    public static SVG l(InputStream inputStream) throws SVGParseException {
        return new SVGParser().z(inputStream, g);
    }

    public static SVG m(Context context, int i2) throws SVGParseException {
        return n(context.getResources(), i2);
    }

    public static SVG n(Resources resources, int i2) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i2);
        try {
            return sVGParser.z(inputStreamOpenRawResource, g);
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG o(String str) throws SVGParseException {
        return new SVGParser().z(new ByteArrayInputStream(str.getBytes()), g);
    }

    public void A(String str) {
        this.b = str;
    }

    public void a(CSSParser.n nVar) {
        this.f1450e.b(nVar);
    }

    public void b() {
        this.f1450e.e(CSSParser.Source.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", Weather.SEPARATOR);
    }

    public List<CSSParser.l> d() {
        return this.f1450e.c();
    }

    public final b e(float f2) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fB;
        Unit unit5;
        d0 d0Var = this.a;
        o oVar = d0Var.s;
        o oVar2 = d0Var.t;
        if (oVar == null || oVar.j() || (unit = oVar.f1469j) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = oVar.b(f2);
        if (oVar2 == null) {
            b bVar = this.a.p;
            fB = bVar != null ? (bVar.d * fB2) / bVar.f1455c : fB2;
        } else {
            if (oVar2.j() || (unit5 = oVar2.f1469j) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = oVar2.b(f2);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.a != null) {
            return e(this.d).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = d0Var.p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.a != null) {
            return e(this.d).f1455c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0 i(h0 h0Var, String str) {
        j0 j0VarI;
        j0 j0Var = (j0) h0Var;
        if (str.equals(j0Var.f1465c)) {
            return j0Var;
        }
        for (Object obj : h0Var.getChildren()) {
            if (obj instanceof j0) {
                j0 j0Var2 = (j0) obj;
                if (str.equals(j0Var2.f1465c)) {
                    return j0Var2;
                }
                if ((obj instanceof h0) && (j0VarI = i((h0) obj, str)) != null) {
                    return j0VarI;
                }
            }
        }
        return null;
    }

    public j0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.a.f1465c)) {
            return this.a;
        }
        if (this.f.containsKey(str)) {
            return this.f.get(str);
        }
        j0 j0VarI = i(this.a, str);
        this.f.put(str, j0VarI);
        return j0VarI;
    }

    public d0 p() {
        return this.a;
    }

    public boolean q() {
        return !this.f1450e.d();
    }

    public void r(Canvas canvas, com.caverock.androidsvg.a aVar) {
        if (aVar == null) {
            aVar = new com.caverock.androidsvg.a();
        }
        if (!aVar.g()) {
            aVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.b(canvas, this.d).G0(this, aVar);
    }

    public Picture s(int i2, int i3, com.caverock.androidsvg.a aVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i2, i3);
        if (aVar == null || aVar.f == null) {
            aVar = aVar == null ? new com.caverock.androidsvg.a() : new com.caverock.androidsvg.a(aVar);
            aVar.h(0.0f, 0.0f, i2, i3);
        }
        new com.caverock.androidsvg.b(canvasBeginRecording, this.d).G0(this, aVar);
        picture.endRecording();
        return picture;
    }

    public Picture t(com.caverock.androidsvg.a aVar) {
        o oVar;
        b bVar = (aVar == null || !aVar.f()) ? this.a.p : aVar.d;
        if (aVar != null && aVar.g()) {
            return s((int) Math.ceil(aVar.f.b()), (int) Math.ceil(aVar.f.c()), aVar);
        }
        d0 d0Var = this.a;
        o oVar2 = d0Var.s;
        if (oVar2 != null) {
            Unit unit = oVar2.f1469j;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (oVar = d0Var.t) != null && oVar.f1469j != unit2) {
                return s((int) Math.ceil(oVar2.b(this.d)), (int) Math.ceil(this.a.t.b(this.d)), aVar);
            }
        }
        if (oVar2 != null && bVar != null) {
            float fB = oVar2.b(this.d);
            return s((int) Math.ceil(fB), (int) Math.ceil((bVar.d * fB) / bVar.f1455c), aVar);
        }
        o oVar3 = d0Var.t;
        if (oVar3 == null || bVar == null) {
            return s(512, 512, aVar);
        }
        float fB2 = oVar3.b(this.d);
        return s((int) Math.ceil((bVar.f1455c * fB2) / bVar.d), (int) Math.ceil(fB2), aVar);
    }

    public l0 u(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    public void v(String str) {
        this.f1449c = str;
    }

    public void w(String str) throws SVGParseException {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.t = SVGParser.o0(str);
    }

    public void x(float f2, float f3, float f4, float f5) {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.p = new b(f2, f3, f4, f5);
    }

    public void y(String str) throws SVGParseException {
        d0 d0Var = this.a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.s = SVGParser.o0(str);
    }

    public void z(d0 d0Var) {
        this.a = d0Var;
    }

    public static class o implements Cloneable {
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Unit f1469j;

        public o(float f, Unit unit) {
            this.i = f;
            this.f1469j = unit;
        }

        public float a() {
            return this.i;
        }

        public float b(float f) {
            int i = a.a[this.f1469j.ordinal()];
            if (i == 1) {
                return this.i;
            }
            switch (i) {
                case 4:
                    return this.i * f;
                case 5:
                    return (this.i * f) / 2.54f;
                case 6:
                    return (this.i * f) / 25.4f;
                case 7:
                    return (this.i * f) / 72.0f;
                case 8:
                    return (this.i * f) / 6.0f;
                default:
                    return this.i;
            }
        }

        public float c(com.caverock.androidsvg.b bVar) {
            float fSqrt;
            if (this.f1469j != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            if (bVarS == null) {
                return this.i;
            }
            float f = bVarS.f1455c;
            float f2 = bVarS.d;
            if (f == f2) {
                fSqrt = this.i * f;
            } else {
                fSqrt = this.i * ((float) (Math.sqrt((f * f) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public float d(com.caverock.androidsvg.b bVar, float f) {
            return this.f1469j == Unit.percent ? (this.i * f) / 100.0f : e(bVar);
        }

        public float e(com.caverock.androidsvg.b bVar) {
            switch (a.a[this.f1469j.ordinal()]) {
                case 1:
                    return this.i;
                case 2:
                    return this.i * bVar.Q();
                case 3:
                    return this.i * bVar.R();
                case 4:
                    return this.i * bVar.T();
                case 5:
                    return (this.i * bVar.T()) / 2.54f;
                case 6:
                    return (this.i * bVar.T()) / 25.4f;
                case 7:
                    return (this.i * bVar.T()) / 72.0f;
                case 8:
                    return (this.i * bVar.T()) / 6.0f;
                case 9:
                    b bVarS = bVar.S();
                    return bVarS == null ? this.i : (this.i * bVarS.f1455c) / 100.0f;
                default:
                    return this.i;
            }
        }

        public float f(com.caverock.androidsvg.b bVar) {
            if (this.f1469j != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            return bVarS == null ? this.i : (this.i * bVarS.d) / 100.0f;
        }

        public boolean i() {
            return this.i < 0.0f;
        }

        public boolean j() {
            return this.i == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.i) + this.f1469j;
        }

        public o(float f) {
            this.i = f;
            this.f1469j = Unit.px;
        }
    }

    public static class b {
        public float a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1455c;
        public float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.f1455c = f3;
            this.d = f4;
        }

        public static b a(float f, float f2, float f3, float f4) {
            return new b(f, f2, f3 - f, f4 - f2);
        }

        public float b() {
            return this.a + this.f1455c;
        }

        public float c() {
            return this.b + this.d;
        }

        public RectF d() {
            return new RectF(this.a, this.b, b(), c());
        }

        public void e(b bVar) {
            float f = bVar.a;
            if (f < this.a) {
                this.a = f;
            }
            float f2 = bVar.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            if (bVar.b() > b()) {
                this.f1455c = bVar.b() - this.a;
            }
            if (bVar.c() > c()) {
                this.d = bVar.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.a + " " + this.b + " " + this.f1455c + " " + this.d + "]";
        }

        public b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.f1455c = bVar.f1455c;
            this.d = bVar.d;
        }
    }
}
