package io.reactivex.rxjava3.internal.functions;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.e08;
import com.oplus.aiunit.vision.f08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.g08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.h08;
import com.oplus.aiunit.vision.i08;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.w8b;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public final class Functions {
    public static final d08<Object, Object> a = new r();
    public static final Runnable EMPTY_RUNNABLE = new n();
    public static final Cdo EMPTY_ACTION = new k();
    public static final o14<Object> b = new l();
    public static final o14<Throwable> ERROR_CONSUMER = new o();
    public static final o14<Throwable> ON_ERROR_MISSING = new w();
    public static final w8b EMPTY_LONG_CONSUMER = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mpe<Object> f20516c = new x();
    public static final mpe<Object> d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f4j<Object> f20517e = new v();
    public static final o14<c3j> REQUEST_MAX = new u();

    public enum HashSetSupplier implements f4j<Set<Object>> {
        INSTANCE;

        @Override // com.oplus.aiunit.vision.f4j
        public Set<Object> get() {
            return new HashSet();
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class a<T> implements o14<T> {
        public final Cdo i;

        public a(Cdo cdo) {
            this.i = cdo;
        }

        @Override // com.oplus.aiunit.vision.o14
        public void accept(T t) throws Throwable {
            this.i.run();
        }
    }

    public static final class b<T1, T2, R> implements d08<Object[], R> {
        public final md1<? super T1, ? super T2, ? extends R> i;

        public b(md1<? super T1, ? super T2, ? extends R> md1Var) {
            this.i = md1Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 2) {
                return this.i.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class c<T1, T2, T3, R> implements d08<Object[], R> {
        public final e08<T1, T2, T3, R> i;

        public c(e08<T1, T2, T3, R> e08Var) {
            this.i = e08Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 3) {
                return this.i.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements d08<Object[], R> {
        public final f08<T1, T2, T3, T4, R> i;

        public d(f08<T1, T2, T3, T4, R> f08Var) {
            this.i = f08Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.i.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements d08<Object[], R> {
        public final g08<T1, T2, T3, T4, T5, R> i;

        public e(g08<T1, T2, T3, T4, T5, R> g08Var) {
            this.i = g08Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.i.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements d08<Object[], R> {
        public final h08<T1, T2, T3, T4, T5, T6, R> i;

        public f(h08<T1, T2, T3, T4, T5, T6, R> h08Var) {
            this.i = h08Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.i.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, T8, R> implements d08<Object[], R> {
        public final i08<T1, T2, T3, T4, T5, T6, T7, T8, R> i;

        public g(i08<T1, T2, T3, T4, T5, T6, T7, T8, R> i08Var) {
            this.i = i08Var;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.i.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    public static final class h<T> implements f4j<List<T>> {
        public final int i;

        public h(int i) {
            this.i = i;
        }

        @Override // com.oplus.aiunit.vision.f4j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get() {
            return new ArrayList(this.i);
        }
    }

    public static final class i<T, U> implements d08<T, U> {
        public final Class<U> i;

        public i(Class<U> cls) {
            this.i = cls;
        }

        @Override // com.oplus.aiunit.vision.d08
        public U apply(T t) {
            return this.i.cast(t);
        }
    }

    public static final class j<T, U> implements mpe<T> {
        public final Class<U> i;

        public j(Class<U> cls) {
            this.i = cls;
        }

        @Override // com.oplus.aiunit.vision.mpe
        public boolean test(T t) {
            return this.i.isInstance(t);
        }
    }

    public static final class k implements Cdo {
        @Override // com.oplus.aiunit.vision.Cdo
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class l implements o14<Object> {
        @Override // com.oplus.aiunit.vision.o14
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class m implements w8b {
    }

    public static final class n implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class o implements o14<Throwable> {
        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            g4g.u(th);
        }
    }

    public static final class p implements mpe<Object> {
        @Override // com.oplus.aiunit.vision.mpe
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class q implements Cdo {
        public final Future<?> i;

        public q(Future<?> future) {
            this.i = future;
        }

        @Override // com.oplus.aiunit.vision.Cdo
        public void run() throws Exception {
            this.i.get();
        }
    }

    public static final class r implements d08<Object, Object> {
        @Override // com.oplus.aiunit.vision.d08
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class s<T, U> implements Callable<U>, f4j<U>, d08<T, U> {
        public final U i;

        public s(U u) {
            this.i = u;
        }

        @Override // com.oplus.aiunit.vision.d08
        public U apply(T t) {
            return this.i;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.i;
        }

        @Override // com.oplus.aiunit.vision.f4j
        public U get() {
            return this.i;
        }
    }

    public static final class t<T> implements d08<List<T>, List<T>> {
        public final Comparator<? super T> i;

        public t(Comparator<? super T> comparator) {
            this.i = comparator;
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.i);
            return list;
        }
    }

    public static final class u implements o14<c3j> {
        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c3j c3jVar) {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    public static final class v implements f4j<Object> {
        @Override // com.oplus.aiunit.vision.f4j
        public Object get() {
            return null;
        }
    }

    public static final class w implements o14<Throwable> {
        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            g4g.u(new OnErrorNotImplementedException(th));
        }
    }

    public static final class x implements mpe<Object> {
        @Override // com.oplus.aiunit.vision.mpe
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> o14<T> a(Cdo cdo) {
        return new a(cdo);
    }

    public static <T> mpe<T> b() {
        return (mpe<T>) f20516c;
    }

    public static <T, U> d08<T, U> c(Class<U> cls) {
        return new i(cls);
    }

    public static <T> f4j<List<T>> d(int i2) {
        return new h(i2);
    }

    public static <T> o14<T> e() {
        return (o14<T>) b;
    }

    public static Cdo f(Future<?> future) {
        return new q(future);
    }

    public static <T> d08<T, T> g() {
        return (d08<T, T>) a;
    }

    public static <T, U> mpe<T> h(Class<U> cls) {
        return new j(cls);
    }

    public static <T, U> d08<T, U> i(U u2) {
        return new s(u2);
    }

    public static <T> f4j<T> j(T t2) {
        return new s(t2);
    }

    public static <T> d08<List<T>, List<T>> k(Comparator<? super T> comparator) {
        return new t(comparator);
    }

    public static <T1, T2, R> d08<Object[], R> l(md1<? super T1, ? super T2, ? extends R> md1Var) {
        return new b(md1Var);
    }

    public static <T1, T2, T3, R> d08<Object[], R> m(e08<T1, T2, T3, R> e08Var) {
        return new c(e08Var);
    }

    public static <T1, T2, T3, T4, R> d08<Object[], R> n(f08<T1, T2, T3, T4, R> f08Var) {
        return new d(f08Var);
    }

    public static <T1, T2, T3, T4, T5, R> d08<Object[], R> o(g08<T1, T2, T3, T4, T5, R> g08Var) {
        return new e(g08Var);
    }

    public static <T1, T2, T3, T4, T5, T6, R> d08<Object[], R> p(h08<T1, T2, T3, T4, T5, T6, R> h08Var) {
        return new f(h08Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> d08<Object[], R> q(i08<T1, T2, T3, T4, T5, T6, T7, T8, R> i08Var) {
        return new g(i08Var);
    }
}
