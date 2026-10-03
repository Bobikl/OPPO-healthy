package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.oplus.anim.EffectiveAnimationDrawable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class i74 implements k56, i9e, w51.b, ioa {
    public final Paint a;
    public final RectF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f12407c;
    public final Path d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f12408e;
    public final String f;
    public final boolean g;
    public final List<d74> h;
    public final EffectiveAnimationDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<i9e> f12409j;

    @Nullable
    public u9k k;

    public i74(EffectiveAnimationDrawable effectiveAnimationDrawable, com.oplus.anim.model.layer.a aVar, myg mygVar, wg6 wg6Var) {
        this(effectiveAnimationDrawable, aVar, mygVar.c(), mygVar.d(), b(effectiveAnimationDrawable, wg6Var, aVar, mygVar.b()), i(mygVar.b()));
    }

    public static List<d74> b(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar, List<k84> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            d74 d74VarA = list.get(i).a(effectiveAnimationDrawable, wg6Var, aVar);
            if (d74VarA != null) {
                arrayList.add(d74VarA);
            }
        }
        return arrayList;
    }

    @Nullable
    public static e50 i(List<k84> list) {
        for (int i = 0; i < list.size(); i++) {
            k84 k84Var = list.get(i);
            if (k84Var instanceof e50) {
                return (e50) k84Var;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.k56
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f12407c.set(matrix);
        u9k u9kVar = this.k;
        if (u9kVar != null) {
            this.f12407c.preConcat(u9kVar.f());
        }
        this.f12408e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            d74 d74Var = this.h.get(size);
            if (d74Var instanceof k56) {
                ((k56) d74Var).a(this.f12408e, this.f12407c, z);
                rectF.union(this.f12408e);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.k56
    public void c(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.f12407c.set(matrix);
        u9k u9kVar = this.k;
        if (u9kVar != null) {
            this.f12407c.preConcat(u9kVar.f());
            i = (int) (((((this.k.h() == null ? 100 : this.k.h().h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.b0() && m() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.b, this.f12407c, true);
            this.a.setAlpha(i);
            prk.o(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            d74 d74Var = this.h.get(size);
            if (d74Var instanceof k56) {
                ((k56) d74Var).c(canvas, this.f12407c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.oplus.aiunit.vision.w51.b
    public void d() {
        this.i.invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.d74
    public void e(List<d74> list, List<d74> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            d74 d74Var = this.h.get(size);
            d74Var.e(arrayList, this.h.subList(0, size));
            arrayList.add(d74Var);
        }
    }

    @Override // com.oplus.aiunit.vision.ioa
    public <T> void g(T t, @Nullable mi6<T> mi6Var) {
        u9k u9kVar = this.k;
        if (u9kVar != null) {
            u9kVar.c(t, mi6Var);
        }
    }

    @Override // com.oplus.aiunit.vision.d74
    public String getName() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.i9e
    public Path getPath() {
        this.f12407c.reset();
        u9k u9kVar = this.k;
        if (u9kVar != null) {
            this.f12407c.set(u9kVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            d74 d74Var = this.h.get(size);
            if (d74Var instanceof i9e) {
                this.d.addPath(((i9e) d74Var).getPath(), this.f12407c);
            }
        }
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.ioa
    public void h(goa goaVar, int i, List<goa> list, goa goaVar2) {
        if (goaVar.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                goaVar2 = goaVar2.a(getName());
                if (goaVar.c(getName(), i)) {
                    list.add(goaVar2.i(this));
                }
            }
            if (goaVar.h(getName(), i)) {
                int iE = i + goaVar.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    d74 d74Var = this.h.get(i2);
                    if (d74Var instanceof ioa) {
                        ((ioa) d74Var).h(goaVar, iE, list, goaVar2);
                    }
                }
            }
        }
    }

    public List<d74> j() {
        return this.h;
    }

    public List<i9e> k() {
        if (this.f12409j == null) {
            this.f12409j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                d74 d74Var = this.h.get(i);
                if (d74Var instanceof i9e) {
                    this.f12409j.add((i9e) d74Var);
                }
            }
        }
        return this.f12409j;
    }

    public Matrix l() {
        u9k u9kVar = this.k;
        if (u9kVar != null) {
            return u9kVar.f();
        }
        this.f12407c.reset();
        return this.f12407c;
    }

    public final boolean m() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof k56) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public i74(EffectiveAnimationDrawable effectiveAnimationDrawable, com.oplus.anim.model.layer.a aVar, String str, boolean z, List<d74> list, @Nullable e50 e50Var) {
        this.a = new xra();
        this.b = new RectF();
        this.f12407c = new Matrix();
        this.d = new Path();
        this.f12408e = new RectF();
        this.f = str;
        this.i = effectiveAnimationDrawable;
        this.g = z;
        this.h = list;
        if (e50Var != null) {
            u9k u9kVarB = e50Var.b();
            this.k = u9kVarB;
            u9kVarB.a(aVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            d74 d74Var = list.get(size);
            if (d74Var instanceof xb8) {
                arrayList.add((xb8) d74Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((xb8) arrayList.get(size2)).b(list.listIterator(list.size()));
        }
    }
}
