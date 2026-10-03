package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes12.dex */
public class hbb<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool(new jbb());
    public final Set<yab<T>> a;
    public final Set<yab<Throwable>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f12093c;

    @Nullable
    public volatile ebb<T> d;

    public static class a<T> extends FutureTask<ebb<T>> {
        public hbb<T> i;

        public a(hbb<T> hbbVar, Callable<ebb<T>> callable) {
            super(callable);
            this.i = hbbVar;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    this.i = null;
                    return;
                }
                try {
                    this.i.l(get());
                } catch (InterruptedException | ExecutionException e2) {
                    this.i.l(new ebb(e2));
                }
                this.i = null;
            } catch (Throwable th) {
                this.i = null;
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hbb(Callable<ebb<T>> callable) {
        this(callable, false);
    }

    public synchronized hbb<T> c(yab<Throwable> yabVar) {
        ebb<T> ebbVar = this.d;
        if (ebbVar != null && ebbVar.a() != null) {
            yabVar.onResult(ebbVar.a());
        }
        this.b.add(yabVar);
        return this;
    }

    public synchronized hbb<T> d(yab<T> yabVar) {
        ebb<T> ebbVar = this.d;
        if (ebbVar != null && ebbVar.b() != null) {
            yabVar.onResult(ebbVar.b());
        }
        this.a.add(yabVar);
        return this;
    }

    @Nullable
    public ebb<T> e() {
        return this.d;
    }

    public final synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            o7b.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yab) it.next()).onResult(th);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f12093c.post(new Runnable() { // from class: com.oplus.aiunit.vision.gbb
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.h();
                }
            });
        }
    }

    public final void h() {
        ebb<T> ebbVar = this.d;
        if (ebbVar == null) {
            return;
        }
        if (ebbVar.b() != null) {
            i(ebbVar.b());
        } else {
            f(ebbVar.a());
        }
    }

    public final synchronized void i(T t) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((yab) it.next()).onResult(t);
        }
    }

    public synchronized hbb<T> j(yab<Throwable> yabVar) {
        this.b.remove(yabVar);
        return this;
    }

    public synchronized hbb<T> k(yab<T> yabVar) {
        this.a.remove(yabVar);
        return this;
    }

    public final void l(@Nullable ebb<T> ebbVar) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = ebbVar;
        g();
    }

    public hbb(T t) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f12093c = new Handler(Looper.getMainLooper());
        this.d = null;
        l(new ebb<>(t));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hbb(Callable<ebb<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f12093c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th) {
                l(new ebb<>(th));
                return;
            }
        }
        EXECUTOR.execute(new a(this, callable));
    }
}
