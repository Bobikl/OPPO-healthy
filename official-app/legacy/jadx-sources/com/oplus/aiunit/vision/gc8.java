package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.nne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class gc8<K extends nne, V> {
    public final a<K, V> a = new a<>();
    public final Map<K, a<K, V>> b = new HashMap();

    public static class a<K, V> {
        public final K a;
        public List<V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f11707c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(v);
        }

        @Nullable
        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k) {
            this.d = this;
            this.f11707c = this;
            this.a = k;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.f11707c = aVar.f11707c;
        aVar.f11707c.d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f11707c.d = aVar;
        aVar.d.f11707c = aVar;
    }

    @Nullable
    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2;
        aVar.f11707c = aVar2.f11707c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.f11707c = aVar2;
        g(aVar);
    }

    public void d(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    @Nullable
    public V f() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.b.remove(aVar.a);
            ((nne) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.f11707c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f11707c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
