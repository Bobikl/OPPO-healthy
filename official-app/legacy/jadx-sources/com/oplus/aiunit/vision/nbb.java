package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public final class nbb implements ch0 {
    public final gc8<a, Object> a = new gc8<>();
    public final b b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f14427c = new HashMap();
    public final Map<Class<?>, xg0<?>> d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14428e;
    public int f;

    public static final class a implements nne {
        public final b a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f14429c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.oplus.aiunit.vision.nne
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.b = i;
            this.f14429c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.f14429c == aVar.f14429c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.f14429c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.f14429c + '}';
        }
    }

    public static final class b extends u51<a> {
        @Override // com.oplus.aiunit.vision.u51
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i, cls);
            return aVarB;
        }
    }

    public nbb(int i) {
        this.f14428e = i;
    }

    @Override // com.oplus.aiunit.vision.ch0
    public synchronized void a(int i) {
        try {
            if (i >= 40) {
                clearMemory();
            } else if (i >= 20 || i == 15) {
                f(this.f14428e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.ch0
    public synchronized <T> T b(int i, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = k(cls).ceilingKey(Integer.valueOf(i));
        return (T) j(n(i, numCeilingKey) ? this.b.e(numCeilingKey.intValue(), cls) : this.b.e(i, cls), cls);
    }

    @Override // com.oplus.aiunit.vision.ch0
    public synchronized <T> T c(int i, Class<T> cls) {
        return (T) j(this.b.e(i, cls), cls);
    }

    @Override // com.oplus.aiunit.vision.ch0
    public synchronized void clearMemory() {
        f(0);
    }

    public final void d(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapK = k(cls);
        Integer num = navigableMapK.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapK.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapK.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void e() {
        f(this.f14428e);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object objF = this.a.f();
            cpe.d(objF);
            xg0 xg0VarG = g(objF);
            this.f -= xg0VarG.a(objF) * xg0VarG.b();
            d(xg0VarG.a(objF), objF.getClass());
            if (Log.isLoggable(xg0VarG.getTag(), 2)) {
                Log.v(xg0VarG.getTag(), "evicted: " + xg0VarG.a(objF));
            }
        }
    }

    public final <T> xg0<T> g(T t) {
        return h(t.getClass());
    }

    public final <T> xg0<T> h(Class<T> cls) {
        xg0<T> vc2Var = (xg0) this.d.get(cls);
        if (vc2Var == null) {
            if (cls.equals(int[].class)) {
                vc2Var = new dca();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                vc2Var = new vc2();
            }
            this.d.put(cls, vc2Var);
        }
        return vc2Var;
    }

    @Nullable
    public final <T> T i(a aVar) {
        return (T) this.a.a(aVar);
    }

    public final <T> T j(a aVar, Class<T> cls) {
        xg0<T> xg0VarH = h(cls);
        T t = (T) i(aVar);
        if (t != null) {
            this.f -= xg0VarH.a(t) * xg0VarH.b();
            d(xg0VarH.a(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(xg0VarH.getTag(), 2)) {
            Log.v(xg0VarH.getTag(), "Allocated " + aVar.b + " bytes");
        }
        return xg0VarH.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> k(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f14427c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14427c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean l() {
        int i = this.f;
        return i == 0 || this.f14428e / i >= 2;
    }

    public final boolean m(int i) {
        return i <= this.f14428e / 2;
    }

    public final boolean n(int i, Integer num) {
        return num != null && (l() || num.intValue() <= i * 8);
    }

    @Override // com.oplus.aiunit.vision.ch0
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        xg0<T> xg0VarH = h(cls);
        int iA = xg0VarH.a(t);
        int iB = xg0VarH.b() * iA;
        if (m(iB)) {
            a aVarE = this.b.e(iA, cls);
            this.a.d(aVarE, t);
            NavigableMap<Integer, Integer> navigableMapK = k(cls);
            Integer num = navigableMapK.get(Integer.valueOf(aVarE.b));
            Integer numValueOf = Integer.valueOf(aVarE.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapK.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            e();
        }
    }
}
