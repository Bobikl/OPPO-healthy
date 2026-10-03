package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class p2c {
    public final p7c a;
    public final a b;

    public static class a {
        public final Map<Class<?>, C0912a<?>> a = new HashMap();

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.p2c$a$a, reason: collision with other inner class name */
        public static class C0912a<Model> {
            public final List<n2c<Model, ?>> a;

            public C0912a(List<n2c<Model, ?>> list) {
                this.a = list;
            }
        }

        public void a() {
            this.a.clear();
        }

        @Nullable
        public <Model> List<n2c<Model, ?>> b(Class<Model> cls) {
            C0912a<?> c0912a = this.a.get(cls);
            if (c0912a == null) {
                return null;
            }
            return (List<n2c<Model, ?>>) c0912a.a;
        }

        public <Model> void c(Class<Model> cls, List<n2c<Model, ?>> list) {
            if (this.a.put(cls, new C0912a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p2c(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new p7c(pool));
    }

    @NonNull
    public static <A> Class<A> b(@NonNull A a2) {
        return (Class<A>) a2.getClass();
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        this.a.b(cls, cls2, o2cVar);
        this.b.a();
    }

    @NonNull
    public synchronized List<Class<?>> c(@NonNull Class<?> cls) {
        return this.a.g(cls);
    }

    @NonNull
    public <A> List<n2c<A, ?>> d(@NonNull A a2) {
        List<n2c<A, ?>> listE = e(b(a2));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2);
        }
        int size = listE.size();
        List<n2c<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            n2c<A, ?> n2cVar = listE.get(i);
            if (n2cVar.b(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(n2cVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2, listE);
        }
        return listEmptyList;
    }

    @NonNull
    public final synchronized <A> List<n2c<A, ?>> e(@NonNull Class<A> cls) {
        List<n2c<A, ?>> listB;
        listB = this.b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void f(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        this.a.i(cls, cls2, o2cVar);
        this.b.a();
    }

    public synchronized <Model, Data> void g(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        h(this.a.k(cls, cls2, o2cVar));
        this.b.a();
    }

    public final <Model, Data> void h(@NonNull List<o2c<? extends Model, ? extends Data>> list) {
        Iterator<o2c<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public p2c(@NonNull p7c p7cVar) {
        this.b = new a();
        this.a = p7cVar;
    }
}
