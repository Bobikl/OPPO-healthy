package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o7c<Model, Data> implements n2c<Model, Data> {
    public final List<n2c<Model, Data>> a;
    public final Pools.Pool<List<Throwable>> b;

    public static class a<Data> implements ft4<Data>, ft4.a<Data> {
        public final List<ft4<Data>> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f14823j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Priority f14824l;
        public ft4.a<? super Data> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public List<Throwable> f14825n;
        public boolean o;

        public a(@NonNull List<ft4<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f14823j = pool;
            cpe.c(list);
            this.i = list;
            this.k = 0;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<Data> a() {
            return this.i.get(0).a();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
            List<Throwable> list = this.f14825n;
            if (list != null) {
                this.f14823j.release(list);
            }
            this.f14825n = null;
            Iterator<ft4<Data>> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return this.i.get(0).c();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
            this.o = true;
            Iterator<ft4<Data>> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.oplus.aiunit.vision.ft4.a
        public void d(@Nullable Data data) {
            if (data != null) {
                this.m.d(data);
            } else {
                g();
            }
        }

        @Override // com.oplus.aiunit.vision.ft4.a
        public void e(@NonNull Exception exc) {
            ((List) cpe.d(this.f14825n)).add(exc);
            g();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super Data> aVar) {
            this.f14824l = priority;
            this.m = aVar;
            this.f14825n = this.f14823j.acquire();
            this.i.get(this.k).f(priority, this);
            if (this.o) {
                cancel();
            }
        }

        public final void g() {
            if (this.o) {
                return;
            }
            if (this.k < this.i.size() - 1) {
                this.k++;
                f(this.f14824l, this.m);
            } else {
                cpe.d(this.f14825n);
                this.m.e(new GlideException("Fetch failed", new ArrayList(this.f14825n)));
            }
        }
    }

    public o7c(@NonNull List<n2c<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.a = list;
        this.b = pool;
    }

    @Override // com.oplus.aiunit.vision.n2c
    public n2c.a<Data> a(@NonNull Model model, int i, int i2, @NonNull erd erdVar) {
        n2c.a<Data> aVarA;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        ona onaVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            n2c<Model, Data> n2cVar = this.a.get(i3);
            if (n2cVar.b(model) && (aVarA = n2cVar.a(model, i, i2, erdVar)) != null) {
                onaVar = aVarA.a;
                arrayList.add(aVarA.f14315c);
            }
        }
        if (arrayList.isEmpty() || onaVar == null) {
            return null;
        }
        return new n2c.a<>(onaVar, new a(arrayList, this.b));
    }

    @Override // com.oplus.aiunit.vision.n2c
    public boolean b(@NonNull Model model) {
        Iterator<n2c<Model, Data>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
