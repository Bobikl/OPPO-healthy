package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.cv6;
import com.oplus.aiunit.vision.nn6;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.t68;
import com.oplus.aiunit.vision.umi;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.x07;
import com.oplus.aiunit.vision.zsf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class g<R> implements DecodeJob.b<R>, x07.f {
    public static final c H = new c();
    public boolean A;
    public GlideException B;
    public boolean C;
    public h<?> D;
    public DecodeJob<R> E;
    public volatile boolean F;
    public boolean G;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final umi f1385j;
    public final h.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Pools.Pool<g<?>> f1386l;
    public final c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nn6 f1387n;
    public final t68 o;
    public final t68 p;
    public final t68 q;
    public final t68 r;
    public final AtomicInteger s;
    public ona t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public usf<?> y;
    public DataSource z;

    public class a implements Runnable {
        public final zsf i;

        public a(zsf zsfVar) {
            this.i = zsfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.i.g()) {
                synchronized (g.this) {
                    if (g.this.i.b(this.i)) {
                        g.this.f(this.i);
                    }
                    g.this.i();
                }
            }
        }
    }

    public class b implements Runnable {
        public final zsf i;

        public b(zsf zsfVar) {
            this.i = zsfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.i.g()) {
                synchronized (g.this) {
                    if (g.this.i.b(this.i)) {
                        g.this.D.b();
                        g.this.g(this.i);
                        g.this.r(this.i);
                    }
                    g.this.i();
                }
            }
        }
    }

    @VisibleForTesting
    public static class c {
        public <R> h<R> a(usf<R> usfVar, boolean z, ona onaVar, h.a aVar) {
            return new h<>(usfVar, z, true, onaVar, aVar);
        }
    }

    public static final class d {
        public final zsf a;
        public final Executor b;

        public d(zsf zsfVar, Executor executor) {
            this.a = zsfVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final List<d> i;

        public e() {
            this(new ArrayList(2));
        }

        public static d d(zsf zsfVar) {
            return new d(zsfVar, cv6.a());
        }

        public void a(zsf zsfVar, Executor executor) {
            this.i.add(new d(zsfVar, executor));
        }

        public boolean b(zsf zsfVar) {
            return this.i.contains(d(zsfVar));
        }

        public e c() {
            return new e(new ArrayList(this.i));
        }

        public void clear() {
            this.i.clear();
        }

        public void e(zsf zsfVar) {
            this.i.remove(d(zsfVar));
        }

        public boolean isEmpty() {
            return this.i.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.i.iterator();
        }

        public int size() {
            return this.i.size();
        }

        public e(List<d> list) {
            this.i = list;
        }
    }

    public g(t68 t68Var, t68 t68Var2, t68 t68Var3, t68 t68Var4, nn6 nn6Var, h.a aVar, Pools.Pool<g<?>> pool) {
        this(t68Var, t68Var2, t68Var3, t68Var4, nn6Var, aVar, pool, H);
    }

    public synchronized void a(zsf zsfVar, Executor executor) {
        this.f1385j.c();
        this.i.a(zsfVar, executor);
        boolean z = true;
        if (this.A) {
            k(1);
            executor.execute(new b(zsfVar));
        } else if (this.C) {
            k(1);
            executor.execute(new a(zsfVar));
        } else {
            if (this.F) {
                z = false;
            }
            cpe.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.B = glideException;
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void c(usf<R> usfVar, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.y = usfVar;
            this.z = dataSource;
            this.G = z;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.b
    public void d(DecodeJob<?> decodeJob) {
        j().execute(decodeJob);
    }

    @Override // com.oplus.aiunit.vision.x07.f
    @NonNull
    public umi e() {
        return this.f1385j;
    }

    @GuardedBy("this")
    public void f(zsf zsfVar) {
        try {
            zsfVar.b(this.B);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    @GuardedBy("this")
    public void g(zsf zsfVar) {
        try {
            zsfVar.c(this.D, this.z, this.G);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    public void h() {
        if (m()) {
            return;
        }
        this.F = true;
        this.E.h();
        this.f1387n.d(this, this.t);
    }

    public void i() {
        h<?> hVar;
        synchronized (this) {
            this.f1385j.c();
            cpe.a(m(), "Not yet complete!");
            int iDecrementAndGet = this.s.decrementAndGet();
            cpe.a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                hVar = this.D;
                q();
            } else {
                hVar = null;
            }
        }
        if (hVar != null) {
            hVar.e();
        }
    }

    public final t68 j() {
        if (this.v) {
            return this.q;
        }
        return this.w ? this.r : this.p;
    }

    public synchronized void k(int i) {
        h<?> hVar;
        cpe.a(m(), "Not yet complete!");
        if (this.s.getAndAdd(i) == 0 && (hVar = this.D) != null) {
            hVar.b();
        }
    }

    @VisibleForTesting
    public synchronized g<R> l(ona onaVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.t = onaVar;
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        return this;
    }

    public final boolean m() {
        return this.C || this.A || this.F;
    }

    public void n() {
        synchronized (this) {
            this.f1385j.c();
            if (this.F) {
                q();
                return;
            }
            if (this.i.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.C) {
                throw new IllegalStateException("Already failed once");
            }
            this.C = true;
            ona onaVar = this.t;
            e eVarC = this.i.c();
            k(eVarC.size() + 1);
            this.f1387n.c(this, onaVar, null);
            for (d dVar : eVarC) {
                dVar.b.execute(new a(dVar.a));
            }
            i();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void o() {
        synchronized (this) {
            this.f1385j.c();
            if (this.F) {
                this.y.recycle();
                q();
                return;
            }
            if (this.i.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.A) {
                throw new IllegalStateException("Already have resource");
            }
            this.D = this.m.a(this.y, this.u, this.t, this.k);
            this.A = true;
            e eVarC = this.i.c();
            k(eVarC.size() + 1);
            this.f1387n.c(this, this.t, this.D);
            for (d dVar : eVarC) {
                dVar.b.execute(new b(dVar.a));
            }
            i();
        }
    }

    public boolean p() {
        return this.x;
    }

    public final synchronized void q() {
        if (this.t == null) {
            throw new IllegalArgumentException();
        }
        this.i.clear();
        this.t = null;
        this.D = null;
        this.y = null;
        this.C = false;
        this.F = false;
        this.A = false;
        this.G = false;
        this.E.O(false);
        this.E = null;
        this.B = null;
        this.z = null;
        this.f1386l.release(this);
    }

    public synchronized void r(zsf zsfVar) {
        this.f1385j.c();
        this.i.e(zsfVar);
        if (this.i.isEmpty()) {
            h();
            if ((this.A || this.C) && this.s.get() == 0) {
                q();
            }
        }
    }

    public synchronized void s(DecodeJob<R> decodeJob) {
        this.E = decodeJob;
        (decodeJob.V() ? this.o : j()).execute(decodeJob);
    }

    @VisibleForTesting
    public g(t68 t68Var, t68 t68Var2, t68 t68Var3, t68 t68Var4, nn6 nn6Var, h.a aVar, Pools.Pool<g<?>> pool, c cVar) {
        this.i = new e();
        this.f1385j = umi.a();
        this.s = new AtomicInteger();
        this.o = t68Var;
        this.p = t68Var2;
        this.q = t68Var3;
        this.r = t68Var4;
        this.f1387n = nn6Var;
        this.k = aVar;
        this.f1386l = pool;
        this.m = cVar;
    }
}
