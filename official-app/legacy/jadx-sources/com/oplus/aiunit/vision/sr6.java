package com.oplus.aiunit.vision;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public class sr6 {
    public static String TAG = "EventBus";
    public static volatile sr6 s;
    public static final tr6 t = new tr6();
    public static final Map<Class<?>, List<Class<?>>> u = new HashMap();
    public final Map<Class<?>, CopyOnWriteArrayList<d3j>> a;
    public final Map<Object, List<Class<?>>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f16711c;
    public final ThreadLocal<c> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final teb f16712e;
    public final hoe f;
    public final tr0 g;
    public final bj0 h;
    public final b3j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f16713j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16714l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f16715n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final n7b r;

    public class a extends ThreadLocal<c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class c {
        public final List<Object> a = new ArrayList();
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16716c;
        public d3j d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f16717e;
        public boolean f;
    }

    public sr6() {
        this(t);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static sr6 c() {
        if (s == null) {
            synchronized (sr6.class) {
                if (s == null) {
                    s = new sr6();
                }
            }
        }
        return s;
    }

    public static List<Class<?>> k(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = u;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    a(arrayList, superclass.getInterfaces());
                }
                u.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    public final void b(d3j d3jVar, Object obj) {
        if (obj != null) {
            o(d3jVar, obj, i());
        }
    }

    public ExecutorService d() {
        return this.f16713j;
    }

    public n7b e() {
        return this.r;
    }

    public final void f(d3j d3jVar, Object obj, Throwable th) {
        if (!(obj instanceof x2j)) {
            if (this.k) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.f16714l) {
                this.r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + d3jVar.a.getClass(), th);
            }
            if (this.f16715n) {
                l(new x2j(this, th, obj, d3jVar.a));
                return;
            }
            return;
        }
        if (this.f16714l) {
            n7b n7bVar = this.r;
            Level level = Level.SEVERE;
            n7bVar.b(level, "SubscriberExceptionEvent subscriber " + d3jVar.a.getClass() + " threw an exception", th);
            x2j x2jVar = (x2j) obj;
            this.r.b(level, "Initial event " + x2jVar.f18480c + " caused exception in " + x2jVar.d, x2jVar.b);
        }
    }

    public void g(xde xdeVar) {
        Object obj = xdeVar.a;
        d3j d3jVar = xdeVar.b;
        xde.b(xdeVar);
        if (d3jVar.f10367c) {
            h(d3jVar, obj);
        }
    }

    public void h(d3j d3jVar, Object obj) {
        try {
            d3jVar.b.a.invoke(d3jVar.a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            f(d3jVar, obj, e3.getCause());
        }
    }

    public final boolean i() {
        teb tebVar = this.f16712e;
        if (tebVar != null) {
            return tebVar.isMainThread();
        }
        return true;
    }

    public synchronized boolean j(Object obj) {
        return this.b.containsKey(obj);
    }

    public void l(Object obj) {
        c cVar = this.d.get();
        List<Object> list = cVar.a;
        list.add(obj);
        if (cVar.b) {
            return;
        }
        cVar.f16716c = i();
        cVar.b = true;
        if (cVar.f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                m(list.remove(0), cVar);
            } catch (Throwable th) {
                cVar.b = false;
                cVar.f16716c = false;
                throw th;
            }
        }
        cVar.b = false;
        cVar.f16716c = false;
    }

    public final void m(Object obj, c cVar) throws Error {
        boolean zN;
        Class<?> cls = obj.getClass();
        if (this.p) {
            List<Class<?>> listK = k(cls);
            int size = listK.size();
            zN = false;
            for (int i = 0; i < size; i++) {
                zN |= n(obj, cVar, listK.get(i));
            }
        } else {
            zN = n(obj, cVar, cls);
        }
        if (zN) {
            return;
        }
        if (this.m) {
            this.r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.o || cls == htc.class || cls == x2j.class) {
            return;
        }
        l(new htc(this, obj));
    }

    public final boolean n(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList<d3j> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (d3j d3jVar : copyOnWriteArrayList) {
            cVar.f16717e = obj;
            cVar.d = d3jVar;
            try {
                o(d3jVar, obj, cVar.f16716c);
                boolean z = cVar.f;
                cVar.f16717e = null;
                cVar.d = null;
                cVar.f = false;
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                cVar.f16717e = null;
                cVar.d = null;
                cVar.f = false;
                throw th;
            }
        }
        return true;
    }

    public final void o(d3j d3jVar, Object obj, boolean z) {
        int i = b.a[d3jVar.b.b.ordinal()];
        if (i == 1) {
            h(d3jVar, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                h(d3jVar, obj);
                return;
            } else {
                this.f.a(d3jVar, obj);
                return;
            }
        }
        if (i == 3) {
            hoe hoeVar = this.f;
            if (hoeVar != null) {
                hoeVar.a(d3jVar, obj);
                return;
            } else {
                h(d3jVar, obj);
                return;
            }
        }
        if (i == 4) {
            if (z) {
                this.g.a(d3jVar, obj);
                return;
            } else {
                h(d3jVar, obj);
                return;
            }
        }
        if (i == 5) {
            this.h.a(d3jVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + d3jVar.b.b);
    }

    public void p(Object obj) {
        List<a3j> listA = this.i.a(obj.getClass());
        synchronized (this) {
            Iterator<a3j> it = listA.iterator();
            while (it.hasNext()) {
                q(obj, it.next());
            }
        }
    }

    public final void q(Object obj, a3j a3jVar) {
        Class<?> cls = a3jVar.f9177c;
        d3j d3jVar = new d3j(obj, a3jVar);
        CopyOnWriteArrayList<d3j> copyOnWriteArrayList = this.a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(d3jVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || a3jVar.d > copyOnWriteArrayList.get(i).b.d) {
                copyOnWriteArrayList.add(i, d3jVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (a3jVar.f9178e) {
            if (!this.p) {
                b(d3jVar, this.f16711c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f16711c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    b(d3jVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void r(Object obj) {
        List<Class<?>> list = this.b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                s(obj, it.next());
            }
            this.b.remove(obj);
        } else {
            this.r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public final void s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<d3j> copyOnWriteArrayList = this.a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                d3j d3jVar = copyOnWriteArrayList.get(i);
                if (d3jVar.a == obj) {
                    d3jVar.f10367c = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.q + ", eventInheritance=" + this.p + "]";
    }

    public sr6(tr6 tr6Var) {
        this.d = new a();
        this.r = tr6Var.b();
        this.a = new HashMap();
        this.b = new HashMap();
        this.f16711c = new ConcurrentHashMap();
        teb tebVarC = tr6Var.c();
        this.f16712e = tebVarC;
        this.f = tebVarC != null ? tebVarC.a(this) : null;
        this.g = new tr0(this);
        this.h = new bj0(this);
        List<z2j> list = tr6Var.f17128j;
        this.q = list != null ? list.size() : 0;
        this.i = new b3j(tr6Var.f17128j, tr6Var.h, tr6Var.g);
        this.f16714l = tr6Var.a;
        this.m = tr6Var.b;
        this.f16715n = tr6Var.f17126c;
        this.o = tr6Var.d;
        this.k = tr6Var.f17127e;
        this.p = tr6Var.f;
        this.f16713j = tr6Var.i;
    }
}
