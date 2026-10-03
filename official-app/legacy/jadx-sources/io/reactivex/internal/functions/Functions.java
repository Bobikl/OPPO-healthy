package io.reactivex.internal.functions;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.npe;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.x8b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class Functions {
    public static final j08<Object, Object> a = new h();
    public static final Runnable EMPTY_RUNNABLE = new e();
    public static final eo EMPTY_ACTION = new b();
    public static final p14<Object> b = new c();
    public static final p14<Throwable> ERROR_CONSUMER = new f();
    public static final p14<Throwable> ON_ERROR_MISSING = new l();
    public static final x8b EMPTY_LONG_CONSUMER = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final npe<Object> f20464c = new m();
    public static final npe<Object> d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Callable<Object> f20465e = new k();
    public static final Comparator<Object> f = new j();
    public static final p14<c3j> REQUEST_MAX = new i();

    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
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

    public static final class a<T1, T2, R> implements j08<Object[], R> {
        public final nd1<? super T1, ? super T2, ? extends R> i;

        public a(nd1<? super T1, ? super T2, ? extends R> nd1Var) {
            this.i = nd1Var;
        }

        @Override // com.oplus.aiunit.vision.j08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.i.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class b implements eo {
        @Override // com.oplus.aiunit.vision.eo
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class c implements p14<Object> {
        @Override // com.oplus.aiunit.vision.p14
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class d implements x8b {
    }

    public static final class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class f implements p14<Throwable> {
        @Override // com.oplus.aiunit.vision.p14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            h4g.r(th);
        }
    }

    public static final class g implements npe<Object> {
        @Override // com.oplus.aiunit.vision.npe
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class h implements j08<Object, Object> {
        @Override // com.oplus.aiunit.vision.j08
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class i implements p14<c3j> {
        @Override // com.oplus.aiunit.vision.p14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(c3j c3jVar) throws Exception {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    public static final class j implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class k implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class l implements p14<Throwable> {
        @Override // com.oplus.aiunit.vision.p14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            h4g.r(new OnErrorNotImplementedException(th));
        }
    }

    public static final class m implements npe<Object> {
        @Override // com.oplus.aiunit.vision.npe
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> p14<T> a() {
        return (p14<T>) b;
    }

    public static <T1, T2, R> j08<Object[], R> b(nd1<? super T1, ? super T2, ? extends R> nd1Var) {
        abd.d(nd1Var, "f is null");
        return new a(nd1Var);
    }
}
