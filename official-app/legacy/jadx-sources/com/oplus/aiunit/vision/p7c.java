package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class p7c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f15234e = new c();
    public static final n2c<Object, Object> f = new a();
    public final List<b<?, ?>> a;
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f15235c;
    public final Pools.Pool<List<Throwable>> d;

    public static class a implements n2c<Object, Object> {
        @Override // com.oplus.aiunit.vision.n2c
        @Nullable
        public n2c.a<Object> a(@NonNull Object obj, int i, int i2, @NonNull erd erdVar) {
            return null;
        }

        @Override // com.oplus.aiunit.vision.n2c
        public boolean b(@NonNull Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o2c<? extends Model, ? extends Data> f15236c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
            this.a = cls;
            this.b = cls2;
            this.f15236c = o2cVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    public static class c {
        @NonNull
        public <Model, Data> o7c<Model, Data> a(@NonNull List<n2c<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new o7c<>(list, pool);
        }
    }

    public p7c(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f15234e);
    }

    @NonNull
    public static <Model, Data> n2c<Model, Data> f() {
        return (n2c<Model, Data>) f;
    }

    public final <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, o2cVar);
        List<b<?, ?>> list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        a(cls, cls2, o2cVar, true);
    }

    @NonNull
    public final <Model, Data> n2c<Model, Data> c(@NonNull b<?, ?> bVar) {
        return (n2c) cpe.d(bVar.f15236c.d(this));
    }

    @NonNull
    public synchronized <Model, Data> n2c<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.f15235c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f15235c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f15235c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (n2c) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f15235c.clear();
            throw th;
        }
    }

    @NonNull
    public synchronized <Model> List<n2c<Model, ?>> e(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.f15235c.contains(bVar) && bVar.a(cls)) {
                    this.f15235c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f15235c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f15235c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    @NonNull
    public final <Model, Data> o2c<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (o2c<Model, Data>) bVar.f15236c;
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        a(cls, cls2, o2cVar, false);
    }

    @NonNull
    public synchronized <Model, Data> List<o2c<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> List<o2c<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        List<o2c<? extends Model, ? extends Data>> listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, o2cVar);
        return listJ;
    }

    @VisibleForTesting
    public p7c(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull c cVar) {
        this.a = new ArrayList();
        this.f15235c = new HashSet();
        this.d = pool;
        this.b = cVar;
    }
}
