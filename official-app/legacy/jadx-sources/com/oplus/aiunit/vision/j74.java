package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j74 implements l56, j9e, v51.b, joa {
    public final Paint a;
    public final RectF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f12781c;
    public final Path d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f12782e;
    public final String f;
    public final boolean g;
    public final List<e74> h;
    public final LottieDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<j9e> f12783j;

    @Nullable
    public v9k k;

    public j74(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, nyg nygVar, k9b k9bVar) {
        this(lottieDrawable, aVar, nygVar.c(), nygVar.d(), b(lottieDrawable, k9bVar, aVar, nygVar.b()), i(nygVar.b()));
    }

    public static List<e74> b(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar, List<l84> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            e74 e74VarA = list.get(i).a(lottieDrawable, k9bVar, aVar);
            if (e74VarA != null) {
                arrayList.add(e74VarA);
            }
        }
        return arrayList;
    }

    @Nullable
    public static f50 i(List<l84> list) {
        for (int i = 0; i < list.size(); i++) {
            l84 l84Var = list.get(i);
            if (l84Var instanceof f50) {
                return (f50) l84Var;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.l56
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f12781c.set(matrix);
        v9k v9kVar = this.k;
        if (v9kVar != null) {
            this.f12781c.preConcat(v9kVar.f());
        }
        this.f12782e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            e74 e74Var = this.h.get(size);
            if (e74Var instanceof l56) {
                ((l56) e74Var).a(this.f12782e, this.f12781c, z);
                rectF.union(this.f12782e);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.l56
    public void c(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.f12781c.set(matrix);
        v9k v9kVar = this.k;
        if (v9kVar != null) {
            this.f12781c.preConcat(v9kVar.f());
            i = (int) (((((this.k.h() == null ? 100 : this.k.h().h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.o0() && m() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.b, this.f12781c, true);
            this.a.setAlpha(i);
            frk.n(canvas, this.b, this.a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            e74 e74Var = this.h.get(size);
            if (e74Var instanceof l56) {
                ((l56) e74Var).c(canvas, this.f12781c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.oplus.aiunit.vision.v51.b
    public void d() {
        this.i.invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.e74
    public void e(List<e74> list, List<e74> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            e74 e74Var = this.h.get(size);
            e74Var.e(arrayList, this.h.subList(0, size));
            arrayList.add(e74Var);
        }
    }

    @Override // com.oplus.aiunit.vision.joa
    public void f(hoa hoaVar, int i, List<hoa> list, hoa hoaVar2) {
        if (hoaVar.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                hoaVar2 = hoaVar2.a(getName());
                if (hoaVar.c(getName(), i)) {
                    list.add(hoaVar2.i(this));
                }
            }
            if (hoaVar.h(getName(), i)) {
                int iE = i + hoaVar.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    e74 e74Var = this.h.get(i2);
                    if (e74Var instanceof joa) {
                        ((joa) e74Var).f(hoaVar, iE, list, hoaVar2);
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.e74
    public String getName() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.j9e
    public Path getPath() {
        this.f12781c.reset();
        v9k v9kVar = this.k;
        if (v9kVar != null) {
            this.f12781c.set(v9kVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            e74 e74Var = this.h.get(size);
            if (e74Var instanceof j9e) {
                this.d.addPath(((j9e) e74Var).getPath(), this.f12781c);
            }
        }
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.joa
    public <T> void h(T t, @Nullable mbb<T> mbbVar) {
        v9k v9kVar = this.k;
        if (v9kVar != null) {
            v9kVar.c(t, mbbVar);
        }
    }

    public List<e74> j() {
        return this.h;
    }

    public List<j9e> k() {
        if (this.f12783j == null) {
            this.f12783j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                e74 e74Var = this.h.get(i);
                if (e74Var instanceof j9e) {
                    this.f12783j.add((j9e) e74Var);
                }
            }
        }
        return this.f12783j;
    }

    public Matrix l() {
        v9k v9kVar = this.k;
        if (v9kVar != null) {
            return v9kVar.f();
        }
        this.f12781c.reset();
        return this.f12781c;
    }

    public final boolean m() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof l56) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public j74(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, String str, boolean z, List<e74> list, @Nullable f50 f50Var) {
        this.a = new yra();
        this.b = new RectF();
        this.f12781c = new Matrix();
        this.d = new Path();
        this.f12782e = new RectF();
        this.f = str;
        this.i = lottieDrawable;
        this.g = z;
        this.h = list;
        if (f50Var != null) {
            v9k v9kVarB = f50Var.b();
            this.k = v9kVarB;
            v9kVarB.a(aVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            e74 e74Var = list.get(size);
            if (e74Var instanceof yb8) {
                arrayList.add((yb8) e74Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((yb8) arrayList.get(size2)).b(list.listIterator(list.size()));
        }
    }
}
