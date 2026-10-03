package com.oplus.aiunit.vision;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w51<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<K> f18121c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public mi6<A> f18122e;
    public final List<b> a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;

    @Nullable
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public interface b {
        void d();
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public xoa<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float b() {
            return 0.0f;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean d(float f) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float e() {
            return 1.0f;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        xoa<T> a();

        @FloatRange(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f);

        boolean d(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {
        public final List<? extends xoa<T>> a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public xoa<T> f18123c = null;
        public float d = -1.0f;

        @NonNull
        public xoa<T> b = f(0.0f);

        public e(List<? extends xoa<T>> list) {
            this.a = list;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        @NonNull
        public xoa<T> a() {
            return this.b;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float b() {
            return this.a.get(0).f();
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean c(float f) {
            xoa<T> xoaVar = this.f18123c;
            xoa<T> xoaVar2 = this.b;
            if (xoaVar == xoaVar2 && this.d == f) {
                return true;
            }
            this.f18123c = xoaVar2;
            this.d = f;
            return false;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean d(float f) {
            if (this.b.a(f)) {
                return !this.b.i();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float e() {
            List<? extends xoa<T>> list = this.a;
            return list.get(list.size() - 1).c();
        }

        public final xoa<T> f(float f) {
            List<? extends xoa<T>> list = this.a;
            xoa<T> xoaVar = list.get(list.size() - 1);
            if (f >= xoaVar.f()) {
                return xoaVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                xoa<T> xoaVar2 = this.a.get(size);
                if (this.b != xoaVar2 && xoaVar2.a(f)) {
                    return xoaVar2;
                }
            }
            return this.a.get(0);
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        @NonNull
        public final xoa<T> a;
        public float b = -1.0f;

        public f(List<? extends xoa<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public xoa<T> a() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float b() {
            return this.a.f();
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean c(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean d(float f) {
            return !this.a.i();
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public float e() {
            return this.a.c();
        }

        @Override // com.oplus.aiunit.vision.w51.d
        public boolean isEmpty() {
            return false;
        }
    }

    public w51(List<? extends xoa<K>> list) {
        this.f18121c = o(list);
    }

    public static <T> d<T> o(List<? extends xoa<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public xoa<K> b() {
        rpa.a("BaseKeyframeAnimation#getCurrentKeyframe");
        xoa<K> xoaVarA = this.f18121c.a();
        rpa.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return xoaVarA;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.f18121c.e();
        }
        return this.h;
    }

    public float d() {
        xoa<K> xoaVarB = b();
        if (xoaVarB == null || xoaVarB.i()) {
            return 0.0f;
        }
        return xoaVarB.d.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        xoa<K> xoaVarB = b();
        if (xoaVarB.i()) {
            return 0.0f;
        }
        return (this.d - xoaVarB.f()) / (xoaVarB.c() - xoaVarB.f());
    }

    public float f() {
        return this.d;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.f18121c.b();
        }
        return this.g;
    }

    public A h() {
        float fE = e();
        if (this.f18122e == null && this.f18121c.c(fE)) {
            return this.f;
        }
        xoa<K> xoaVarB = b();
        Interpolator interpolator = xoaVarB.f18705e;
        A aI = (interpolator == null || xoaVarB.f == null) ? i(xoaVarB, d()) : j(xoaVarB, fE, interpolator.getInterpolation(fE), xoaVarB.f.getInterpolation(fE));
        this.f = aI;
        return aI;
    }

    public abstract A i(xoa<K> xoaVar, float f2);

    public A j(xoa<K> xoaVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).d();
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.f18121c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.f18121c.d(f2)) {
            k();
        }
    }

    public void n(@Nullable mi6<A> mi6Var) {
        mi6<A> mi6Var2 = this.f18122e;
        if (mi6Var2 != null) {
            mi6Var2.c(null);
        }
        this.f18122e = mi6Var;
        if (mi6Var != null) {
            mi6Var.c(this);
        }
    }
}
