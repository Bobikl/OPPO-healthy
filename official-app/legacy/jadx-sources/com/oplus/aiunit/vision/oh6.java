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

/* JADX INFO: loaded from: classes19.dex */
public class oh6<T> {
    public static final Executor EXECUTOR = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f14939e = false;
    public final Set<kh6<T>> a;
    public final Set<kh6<Throwable>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f14940c;

    @Nullable
    public volatile mh6<T> d;

    public class a extends FutureTask<mh6<T>> {
        public a(Callable<mh6<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                oh6.this.k(get());
            } catch (InterruptedException | ExecutionException e2) {
                oh6.this.k(new mh6(e2));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public oh6(Callable<mh6<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        mh6<T> mh6Var = this.d;
        if (mh6Var == null) {
            return;
        }
        if (mh6Var.b() != null) {
            h(mh6Var.b());
        } else {
            f(mh6Var.a());
        }
    }

    public synchronized oh6<T> c(kh6<Throwable> kh6Var) {
        mh6<T> mh6Var = this.d;
        if (mh6Var != null && mh6Var.a() != null) {
            kh6Var.onResult(mh6Var.a());
        }
        this.b.add(kh6Var);
        return this;
    }

    public synchronized oh6<T> d(kh6<T> kh6Var) {
        mh6<T> mh6Var = this.d;
        if (mh6Var != null && mh6Var.b() != null) {
            kh6Var.onResult(mh6Var.b());
        }
        this.a.add(kh6Var);
        return this;
    }

    public final synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            u7b.d("EffectiveAnimation encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kh6) it.next()).onResult(th);
        }
    }

    public final void g() {
        this.f14940c.post(new Runnable() { // from class: com.oplus.aiunit.vision.nh6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e();
            }
        });
    }

    public final synchronized void h(T t) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((kh6) it.next()).onResult(t);
        }
    }

    public synchronized oh6<T> i(kh6<Throwable> kh6Var) {
        this.b.remove(kh6Var);
        return this;
    }

    public synchronized oh6<T> j(kh6<T> kh6Var) {
        this.a.remove(kh6Var);
        return this;
    }

    public final void k(@Nullable mh6<T> mh6Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = mh6Var;
        g();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public oh6(Callable<mh6<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.d = null;
        if (!f14939e || Looper.myLooper() == null) {
            this.f14940c = new Handler(Looper.getMainLooper());
        } else {
            this.f14940c = new Handler(Looper.myLooper());
        }
        if (!z) {
            EXECUTOR.execute(new a(callable));
            return;
        }
        try {
            k(callable.call());
        } catch (Throwable th) {
            k(new mh6<>(th));
        }
    }
}
