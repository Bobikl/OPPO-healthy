package com.oplus.anim.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.a2i;
import com.oplus.aiunit.vision.atj;
import com.oplus.aiunit.vision.d74;
import com.oplus.aiunit.vision.eyg;
import com.oplus.aiunit.vision.fzc;
import com.oplus.aiunit.vision.goa;
import com.oplus.aiunit.vision.ioa;
import com.oplus.aiunit.vision.k56;
import com.oplus.aiunit.vision.kt7;
import com.oplus.aiunit.vision.m56;
import com.oplus.aiunit.vision.mi6;
import com.oplus.aiunit.vision.prk;
import com.oplus.aiunit.vision.rpa;
import com.oplus.aiunit.vision.tyg;
import com.oplus.aiunit.vision.u7b;
import com.oplus.aiunit.vision.u9k;
import com.oplus.aiunit.vision.uu1;
import com.oplus.aiunit.vision.vgb;
import com.oplus.aiunit.vision.w51;
import com.oplus.aiunit.vision.wg6;
import com.oplus.aiunit.vision.xra;
import com.oplus.aiunit.vision.z3a;
import com.oplus.anim.EffectiveAnimationDrawable;
import com.oplus.anim.model.content.Mask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a implements k56, w51.b, ioa {

    @Nullable
    public Paint A;
    public float B;

    @Nullable
    public BlurMaskFilter C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19640c = new Matrix();
    public final Paint d = new xra(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f19641e = new xra(1, PorterDuff.Mode.DST_IN);
    public final Paint f = new xra(1, PorterDuff.Mode.DST_OUT);
    public final Paint g;
    public final Paint h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f19642j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f19643l;
    public final RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f19644n;
    public final Matrix o;
    public final EffectiveAnimationDrawable p;
    public final Layer q;

    @Nullable
    public vgb r;

    @Nullable
    public kt7 s;

    @Nullable
    public a t;

    @Nullable
    public a u;
    public List<a> v;
    public final List<w51<?, ?>> w;
    public final u9k x;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: com.oplus.anim.model.layer.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0951a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(EffectiveAnimationDrawable effectiveAnimationDrawable, Layer layer) {
        xra xraVar = new xra(1);
        this.g = xraVar;
        this.h = new xra(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.f19642j = new RectF();
        this.k = new RectF();
        this.f19643l = new RectF();
        this.m = new RectF();
        this.o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = effectiveAnimationDrawable;
        this.q = layer;
        this.f19644n = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            xraVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            xraVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        u9k u9kVarB = layer.w().b();
        this.x = u9kVarB;
        u9kVarB.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            vgb vgbVar = new vgb(layer.g());
            this.r = vgbVar;
            Iterator<w51<eyg, Path>> it = vgbVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (w51<Integer, Integer> w51Var : this.r.c()) {
                i(w51Var);
                w51Var.a(this);
            }
        }
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        M(this.s.p() == 1.0f);
    }

    @Nullable
    public static a u(b bVar, Layer layer, EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var) {
        switch (C0951a.a[layer.f().ordinal()]) {
            case 1:
                return new tyg(effectiveAnimationDrawable, layer, bVar, wg6Var);
            case 2:
                return new b(effectiveAnimationDrawable, layer, wg6Var.o(layer.m()), wg6Var);
            case 3:
                return new a2i(effectiveAnimationDrawable, layer);
            case 4:
                return new z3a(effectiveAnimationDrawable, layer);
            case 5:
                return new fzc(effectiveAnimationDrawable, layer);
            case 6:
                return new atj(effectiveAnimationDrawable, layer);
            default:
                u7b.c("Unknown layer type " + layer.f());
                return null;
        }
    }

    public boolean A() {
        return this.t != null;
    }

    public final void B(RectF rectF, Matrix matrix) {
        this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.r.b().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.r.b().get(i);
                Path pathH = this.r.a().get(i).h();
                if (pathH != null) {
                    this.a.set(pathH);
                    this.a.transform(matrix);
                    int i2 = C0951a.b[mask.a().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.d()) {
                        return;
                    }
                    this.a.computeBounds(this.m, false);
                    if (i == 0) {
                        this.k.set(this.m);
                    } else {
                        RectF rectF2 = this.k;
                        rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void C(RectF rectF, Matrix matrix) {
        if (A() && this.q.h() != Layer.MatteType.INVERT) {
            this.f19643l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.a(this.f19643l, matrix, true);
            if (rectF.intersect(this.f19643l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void D() {
        this.p.invalidateSelf();
    }

    public final void F(float f) {
        this.p.G().n().a(this.q.i(), f);
    }

    public void G(w51<?, ?> w51Var) {
        this.w.remove(w51Var);
    }

    public void H(goa goaVar, int i, List<goa> list, goa goaVar2) {
    }

    public void I(@Nullable a aVar) {
        this.t = aVar;
    }

    public void J(boolean z) {
        if (z && this.A == null) {
            this.A = new xra();
        }
        this.z = z;
    }

    public void K(@Nullable a aVar) {
        this.u = aVar;
    }

    public void L(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.x.j(f);
        if (this.r != null) {
            for (int i = 0; i < this.r.a().size(); i++) {
                this.r.a().get(i).m(f);
            }
        }
        kt7 kt7Var = this.s;
        if (kt7Var != null) {
            kt7Var.m(f);
        }
        a aVar = this.t;
        if (aVar != null) {
            aVar.L(f);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            this.w.get(i2).m(f);
        }
    }

    public final void M(boolean z) {
        if (z != this.y) {
            this.y = z;
            D();
        }
    }

    public final void N() {
        if (this.q.e().isEmpty()) {
            M(true);
            return;
        }
        kt7 kt7Var = new kt7(this.q.e());
        this.s = kt7Var;
        kt7Var.l();
        this.s.a(new w51.b() { // from class: com.oplus.aiunit.vision.x51
            @Override // com.oplus.aiunit.vision.w51.b
            public final void d() {
                this.a.E();
            }
        });
        M(this.s.h().floatValue() == 1.0f);
        i(this.s);
    }

    @Override // com.oplus.aiunit.vision.k56
    @CallSuper
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.o.set(matrix);
        if (z) {
            List<a> list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.o.preConcat(this.v.get(size).x.f());
                }
            } else {
                a aVar = this.u;
                if (aVar != null) {
                    this.o.preConcat(aVar.x.f());
                }
            }
        }
        this.o.preConcat(this.x.f());
    }

    @Override // com.oplus.aiunit.vision.k56
    public void c(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numH;
        rpa.a(this.f19644n);
        if (!this.y || this.q.x()) {
            rpa.b(this.f19644n);
            return;
        }
        r();
        rpa.a("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.v.get(size).x.f());
        }
        rpa.b("Layer#parentMatrix");
        w51<?, Integer> w51VarH = this.x.h();
        int iIntValue = (int) ((((i / 255.0f) * ((w51VarH == null || (numH = w51VarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!A() && !z()) {
            this.b.preConcat(this.x.f());
            rpa.a("Layer#drawLayer");
            t(canvas, this.b, iIntValue);
            rpa.b("Layer#drawLayer");
            F(rpa.b(this.f19644n));
            return;
        }
        rpa.a("Layer#computeBounds");
        a(this.i, this.b, false);
        C(this.i, matrix);
        this.b.preConcat(this.x.f());
        B(this.i, this.b);
        this.f19642j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f19640c);
        if (!this.f19640c.isIdentity()) {
            Matrix matrix2 = this.f19640c;
            matrix2.invert(matrix2);
            this.f19640c.mapRect(this.f19642j);
        }
        if (!this.i.intersect(this.f19642j)) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        rpa.b("Layer#computeBounds");
        if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
            rpa.a("Layer#saveLayer");
            this.d.setAlpha(255);
            prk.o(canvas, this.i, this.d);
            rpa.b("Layer#saveLayer");
            s(canvas);
            rpa.a("Layer#drawLayer");
            t(canvas, this.b, iIntValue);
            rpa.b("Layer#drawLayer");
            if (z()) {
                o(canvas, this.b);
            }
            if (A()) {
                rpa.a("Layer#drawMatte");
                rpa.a("Layer#saveLayer");
                prk.p(canvas, this.i, this.g, 19);
                rpa.b("Layer#saveLayer");
                s(canvas);
                this.t.c(canvas, matrix, iIntValue);
                rpa.a("Layer#restoreLayer");
                canvas.restore();
                rpa.b("Layer#restoreLayer");
                rpa.b("Layer#drawMatte");
            }
            rpa.a("Layer#restoreLayer");
            canvas.restore();
            rpa.b("Layer#restoreLayer");
        }
        if (this.z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.i, this.A);
        }
        F(rpa.b(this.f19644n));
    }

    @Override // com.oplus.aiunit.vision.w51.b
    public void d() {
        D();
    }

    @Override // com.oplus.aiunit.vision.d74
    public void e(List<d74> list, List<d74> list2) {
    }

    @CallSuper
    public <T> void g(T t, @Nullable mi6<T> mi6Var) {
        this.x.c(t, mi6Var);
    }

    @Override // com.oplus.aiunit.vision.d74
    public String getName() {
        return this.q.i();
    }

    @Override // com.oplus.aiunit.vision.ioa
    public void h(goa goaVar, int i, List<goa> list, goa goaVar2) {
        a aVar = this.t;
        if (aVar != null) {
            goa goaVarA = goaVar2.a(aVar.getName());
            if (goaVar.c(this.t.getName(), i)) {
                list.add(goaVarA.i(this.t));
            }
            if (goaVar.h(getName(), i)) {
                this.t.H(goaVar, goaVar.e(this.t.getName(), i) + i, list, goaVarA);
            }
        }
        if (goaVar.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                goaVar2 = goaVar2.a(getName());
                if (goaVar.c(getName(), i)) {
                    list.add(goaVar2.i(this));
                }
            }
            if (goaVar.h(getName(), i)) {
                H(goaVar, i + goaVar.e(getName(), i), list, goaVar2);
            }
        }
    }

    public void i(@Nullable w51<?, ?> w51Var) {
        if (w51Var == null) {
            return;
        }
        this.w.add(w51Var);
    }

    public final void j(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var, w51<Integer, Integer> w51Var2) {
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (w51Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
    }

    public final void k(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var, w51<Integer, Integer> w51Var2) {
        prk.o(canvas, this.i, this.f19641e);
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (w51Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var, w51<Integer, Integer> w51Var2) {
        prk.o(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (w51Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var, w51<Integer, Integer> w51Var2) {
        prk.o(canvas, this.i, this.f19641e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (w51Var2.h().intValue() * 2.55f));
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var, w51<Integer, Integer> w51Var2) {
        prk.o(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (w51Var2.h().intValue() * 2.55f));
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix) {
        rpa.a("Layer#saveLayer");
        prk.p(canvas, this.i, this.f19641e, 19);
        rpa.b("Layer#saveLayer");
        for (int i = 0; i < this.r.b().size(); i++) {
            Mask mask = this.r.b().get(i);
            w51<eyg, Path> w51Var = this.r.a().get(i);
            w51<Integer, Integer> w51Var2 = this.r.c().get(i);
            int i2 = C0951a.b[mask.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, w51Var, w51Var2);
                    } else {
                        p(canvas, matrix, w51Var);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, w51Var, w51Var2);
                        } else {
                            j(canvas, matrix, w51Var, w51Var2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, w51Var, w51Var2);
                } else {
                    k(canvas, matrix, w51Var, w51Var2);
                }
            } else if (q()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        rpa.a("Layer#restoreLayer");
        canvas.restore();
        rpa.b("Layer#restoreLayer");
    }

    public final void p(Canvas canvas, Matrix matrix, w51<eyg, Path> w51Var) {
        this.a.set(w51Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
    }

    public final boolean q() {
        if (this.r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            if (this.r.b().get(i).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void r() {
        if (this.v != null) {
            return;
        }
        if (this.u == null) {
            this.v = Collections.emptyList();
            return;
        }
        this.v = new ArrayList();
        for (a aVar = this.u; aVar != null; aVar = aVar.u) {
            this.v.add(aVar);
        }
    }

    public final void s(Canvas canvas) {
        rpa.a("Layer#clearLayer");
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        rpa.b("Layer#clearLayer");
    }

    public abstract void t(Canvas canvas, Matrix matrix, int i);

    @Nullable
    public uu1 v() {
        return this.q.a();
    }

    public BlurMaskFilter w(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    @Nullable
    public m56 x() {
        return this.q.c();
    }

    public Layer y() {
        return this.q;
    }

    public boolean z() {
        vgb vgbVar = this.r;
        return (vgbVar == null || vgbVar.a().isEmpty()) ? false : true;
    }
}
