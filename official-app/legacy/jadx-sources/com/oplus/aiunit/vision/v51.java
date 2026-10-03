package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v51<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<K> f17710c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public mbb<A> f17711e;
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

        @Override // com.oplus.aiunit.vision.v51.d
        public yoa<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float b() {
            return 0.0f;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean d(float f) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float e() {
            return 1.0f;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean isEmpty() {
            return true;
        }
    }

    public interface d<T> {
        yoa<T> a();

        @FloatRange(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f);

        boolean d(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    public static final class e<T> implements d<T> {
        public final List<? extends yoa<T>> a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public yoa<T> f17712c = null;
        public float d = -1.0f;

        @NonNull
        public yoa<T> b = f(0.0f);

        public e(List<? extends yoa<T>> list) {
            this.a = list;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        @NonNull
        public yoa<T> a() {
            return this.b;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float b() {
            return this.a.get(0).f();
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean c(float f) {
            yoa<T> yoaVar = this.f17712c;
            yoa<T> yoaVar2 = this.b;
            if (yoaVar == yoaVar2 && this.d == f) {
                return true;
            }
            this.f17712c = yoaVar2;
            this.d = f;
            return false;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean d(float f) {
            if (this.b.a(f)) {
                return !this.b.i();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float e() {
            List<? extends yoa<T>> list = this.a;
            return list.get(list.size() - 1).c();
        }

        public final yoa<T> f(float f) {
            List<? extends yoa<T>> list = this.a;
            yoa<T> yoaVar = list.get(list.size() - 1);
            if (f >= yoaVar.f()) {
                return yoaVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                yoa<T> yoaVar2 = this.a.get(size);
                if (this.b != yoaVar2 && yoaVar2.a(f)) {
                    return yoaVar2;
                }
            }
            return this.a.get(0);
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f<T> implements d<T> {

        @NonNull
        public final yoa<T> a;
        public float b = -1.0f;

        public f(List<? extends yoa<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public yoa<T> a() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float b() {
            return this.a.f();
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean c(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean d(float f) {
            return !this.a.i();
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public float e() {
            return this.a.c();
        }

        @Override // com.oplus.aiunit.vision.v51.d
        public boolean isEmpty() {
            return false;
        }
    }

    public v51(List<? extends yoa<K>> list) {
        this.f17710c = p(list);
    }

    public static <T> d<T> p(List<? extends yoa<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public yoa<K> b() {
        if (gqa.g()) {
            gqa.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        yoa<K> yoaVarA = this.f17710c.a();
        if (gqa.g()) {
            gqa.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return yoaVarA;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    @SuppressLint({"Range"})
    public float c() {
        if (this.h == -1.0f) {
            this.h = this.f17710c.e();
        }
        return this.h;
    }

    public float d() {
        Interpolator interpolator;
        yoa<K> yoaVarB = b();
        if (yoaVarB == null || yoaVarB.i() || (interpolator = yoaVarB.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        yoa<K> yoaVarB = b();
        if (yoaVarB.i()) {
            return 0.0f;
        }
        return (this.d - yoaVarB.f()) / (yoaVarB.c() - yoaVarB.f());
    }

    public float f() {
        return this.d;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    @SuppressLint({"Range"})
    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.f17710c.b();
        }
        return this.g;
    }

    public A h() {
        float fE = e();
        if (this.f17711e == null && this.f17710c.c(fE)) {
            return this.f;
        }
        yoa<K> yoaVarB = b();
        Interpolator interpolator = yoaVarB.f19087e;
        A aI = (interpolator == null || yoaVarB.f == null) ? i(yoaVarB, d()) : j(yoaVarB, fE, interpolator.getInterpolation(fE), yoaVarB.f.getInterpolation(fE));
        this.f = aI;
        return aI;
    }

    public abstract A i(yoa<K> yoaVar, float f2);

    public A j(yoa<K> yoaVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f17711e != null;
    }

    public void l() {
        if (gqa.g()) {
            gqa.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).d();
        }
        if (gqa.g()) {
            gqa.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.b = true;
    }

    public void n(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (gqa.g()) {
            gqa.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f17710c.isEmpty()) {
            if (gqa.g()) {
                gqa.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            if (gqa.g()) {
                gqa.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.d = f2;
            if (this.f17710c.d(f2)) {
                l();
            }
            if (gqa.g()) {
                gqa.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(@Nullable mbb<A> mbbVar) {
        mbb<A> mbbVar2 = this.f17711e;
        if (mbbVar2 != null) {
            mbbVar2.c(null);
        }
        this.f17711e = mbbVar;
        if (mbbVar != null) {
            mbbVar.c(this);
        }
    }
}
