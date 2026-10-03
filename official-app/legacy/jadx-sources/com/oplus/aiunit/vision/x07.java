package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class x07 {
    public static final g<Object> a = new a();

    public class a implements g<Object> {
        @Override // com.oplus.aiunit.vision.x07.g
        public void a(@NonNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements d<List<T>> {
        @Override // com.oplus.aiunit.vision.x07.d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements g<List<T>> {
        @Override // com.oplus.aiunit.vision.x07.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T create();
    }

    public static final class e<T> implements Pools.Pool<T> {
        public final d<T> a;
        public final g<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Pools.Pool<T> f18459c;

        public e(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f18459c = pool;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T tAcquire = this.f18459c.acquire();
            if (tAcquire == null) {
                tAcquire = this.a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tAcquire.getClass());
                }
            }
            if (tAcquire instanceof f) {
                ((f) tAcquire).e().b(false);
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t) {
            if (t instanceof f) {
                ((f) t).e().b(true);
            }
            this.b.a(t);
            return this.f18459c.release(t);
        }
    }

    public interface f {
        @NonNull
        umi e();
    }

    public interface g<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> a(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar) {
        return b(pool, dVar, c());
    }

    @NonNull
    public static <T> Pools.Pool<T> b(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(pool, dVar, gVar);
    }

    @NonNull
    public static <T> g<T> c() {
        return (g<T>) a;
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> d(int i, @NonNull d<T> dVar) {
        return a(new Pools.SynchronizedPool(i), dVar);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> e() {
        return f(20);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> f(int i) {
        return b(new Pools.SynchronizedPool(i), new b(), new c());
    }
}
