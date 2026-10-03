package com.oplus.aiunit.vision;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class di0 implements bv5 {
    public final com.badlogic.gdx.utils.i<Class, com.badlogic.gdx.utils.i<String, a>> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.badlogic.gdx.utils.i<String, Class> f10576j;
    public final com.badlogic.gdx.utils.i<String, wg0<String>> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.utils.j<String> f10577l;
    public final com.badlogic.gdx.utils.i<Class, com.badlogic.gdx.utils.i<String, ai0>> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wg0<yh0> f10578n;
    public final yi0 o;
    public final wg0<ci0> p;
    public int q;
    public int r;
    public int s;
    public final mb7 t;
    public p7b u;

    public static class a {
        public Object a;
        public int b = 1;
    }

    public di0() {
        this(new tea());
    }

    public synchronized void A(String str, wg0<yh0> wg0Var) {
        com.badlogic.gdx.utils.j<String> jVar = this.f10577l;
        wg0.b<yh0> it = wg0Var.iterator();
        while (it.hasNext()) {
            yh0 next = it.next();
            if (!jVar.contains(next.a)) {
                jVar.add(next.a);
                B(str, next);
            }
        }
        jVar.b(32);
    }

    public final synchronized void B(String str, yh0 yh0Var) {
        wg0<String> wg0Var = this.k.get(str);
        if (wg0Var == null) {
            wg0Var = new wg0<>();
            this.k.h(str, wg0Var);
        }
        wg0Var.a(yh0Var.a);
        if (C(yh0Var.a)) {
            this.u.a("Dependency already loaded: " + yh0Var);
            a aVar = this.i.get(this.f10576j.get(yh0Var.a)).get(yh0Var.a);
            aVar.b = aVar.b + 1;
            z(yh0Var.a);
        } else {
            this.u.e("Loading dependency: " + yh0Var);
            i(yh0Var);
        }
    }

    public synchronized boolean C(String str) {
        if (str == null) {
            return false;
        }
        return this.f10576j.b(str);
    }

    public synchronized <T> void D(String str, Class<T> cls) {
        E(str, cls, null);
    }

    public synchronized <T> void E(String str, Class<T> cls, bi0<T> bi0Var) {
        if (v(cls, str) == null) {
            throw new GdxRuntimeException("No loader for type: " + kc3.e(cls));
        }
        int i = 0;
        if (this.f10578n.f18241j == 0) {
            this.q = 0;
            this.r = 0;
            this.s = 0;
        }
        int i2 = 0;
        while (true) {
            wg0<yh0> wg0Var = this.f10578n;
            if (i2 < wg0Var.f18241j) {
                yh0 yh0Var = wg0Var.get(i2);
                if (yh0Var.a.equals(str) && !yh0Var.b.equals(cls)) {
                    throw new GdxRuntimeException("Asset with name '" + str + "' already in preload queue, but has different type (expected: " + kc3.e(cls) + ", found: " + kc3.e(yh0Var.b) + ")");
                }
                i2++;
            } else {
                while (true) {
                    wg0<ci0> wg0Var2 = this.p;
                    if (i < wg0Var2.f18241j) {
                        yh0 yh0Var2 = wg0Var2.get(i).b;
                        if (yh0Var2.a.equals(str) && !yh0Var2.b.equals(cls)) {
                            throw new GdxRuntimeException("Asset with name '" + str + "' already in task list, but has different type (expected: " + kc3.e(cls) + ", found: " + kc3.e(yh0Var2.b) + ")");
                        }
                        i++;
                    } else {
                        Class cls2 = this.f10576j.get(str);
                        if (cls2 != null && !cls2.equals(cls)) {
                            throw new GdxRuntimeException("Asset with name '" + str + "' already loaded, but has different type (expected: " + kc3.e(cls) + ", found: " + kc3.e(cls2) + ")");
                        }
                        this.r++;
                        yh0 yh0Var3 = new yh0(str, cls, bi0Var);
                        this.f10578n.a(yh0Var3);
                        this.u.a("Queued: " + yh0Var3);
                    }
                }
            }
        }
    }

    public final void F() {
        bi0.a aVar;
        yh0 yh0VarH = this.f10578n.h(0);
        if (!C(yh0VarH.a)) {
            this.u.e("Loading: " + yh0VarH);
            i(yh0VarH);
            return;
        }
        this.u.a("Already loaded: " + yh0VarH);
        a aVar2 = this.i.get(this.f10576j.get(yh0VarH.a)).get(yh0VarH.a);
        aVar2.b = aVar2.b + 1;
        z(yh0VarH.a);
        bi0 bi0Var = yh0VarH.f19014c;
        if (bi0Var != null && (aVar = bi0Var.a) != null) {
            aVar.a(this, yh0VarH.a, yh0VarH.b);
        }
        this.q++;
    }

    public synchronized <T, P extends bi0<T>> void G(Class<T> cls, ai0<T, P> ai0Var) {
        H(cls, null, ai0Var);
    }

    public synchronized <T, P extends bi0<T>> void H(Class<T> cls, String str, ai0<T, P> ai0Var) {
        try {
            if (cls == null) {
                throw new IllegalArgumentException("type cannot be null.");
            }
            if (ai0Var == null) {
                throw new IllegalArgumentException("loader cannot be null.");
            }
            this.u.a("Loader set: " + kc3.e(cls) + " -> " + kc3.e(ai0Var.getClass()));
            com.badlogic.gdx.utils.i<String, ai0> iVar = this.m.get(cls);
            if (iVar == null) {
                com.badlogic.gdx.utils.i<Class, com.badlogic.gdx.utils.i<String, ai0>> iVar2 = this.m;
                com.badlogic.gdx.utils.i<String, ai0> iVar3 = new com.badlogic.gdx.utils.i<>();
                iVar2.h(cls, iVar3);
                iVar = iVar3;
            }
            if (str == null) {
                str = "";
            }
            iVar.h(str, ai0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void I(String str, int i) {
        Class cls = this.f10576j.get(str);
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        this.i.get(cls).get(str).b = i;
    }

    public void J(yh0 yh0Var, RuntimeException runtimeException) {
        throw runtimeException;
    }

    public synchronized void K(String str) {
        bi0 bi0Var;
        bi0.a aVar;
        wg0<ci0> wg0Var = this.p;
        if (wg0Var.f18241j > 0) {
            ci0 ci0VarFirst = wg0Var.first();
            if (ci0VarFirst.b.a.equals(str)) {
                this.u.e("Unload (from tasks): " + str);
                ci0VarFirst.f10093l = true;
                ci0VarFirst.f();
                return;
            }
        }
        Class cls = this.f10576j.get(str);
        int i = 0;
        while (true) {
            wg0<yh0> wg0Var2 = this.f10578n;
            if (i >= wg0Var2.f18241j) {
                i = -1;
                break;
            } else if (wg0Var2.get(i).a.equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.r--;
            yh0 yh0VarH = this.f10578n.h(i);
            this.u.e("Unload (from queue): " + str);
            if (cls != null && (bi0Var = yh0VarH.f19014c) != null && (aVar = bi0Var.a) != null) {
                aVar.a(this, yh0VarH.a, yh0VarH.b);
            }
            return;
        }
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        a aVar2 = this.i.get(cls).get(str);
        int i2 = aVar2.b - 1;
        aVar2.b = i2;
        if (i2 <= 0) {
            this.u.e("Unload (dispose): " + str);
            Object obj = aVar2.a;
            if (obj instanceof bv5) {
                ((bv5) obj).dispose();
            }
            this.f10576j.j(str);
            this.i.get(cls).j(str);
        } else {
            this.u.e("Unload (decrement): " + str);
        }
        wg0<String> wg0Var3 = this.k.get(str);
        if (wg0Var3 != null) {
            wg0.b<String> it = wg0Var3.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C(next)) {
                    K(next);
                }
            }
        }
        if (aVar2.b <= 0) {
            this.k.j(str);
        }
    }

    public synchronized boolean L() {
        boolean z = false;
        try {
            if (this.p.f18241j == 0) {
                while (this.f10578n.f18241j != 0 && this.p.f18241j == 0) {
                    F();
                }
                if (this.p.f18241j == 0) {
                    return true;
                }
            }
            if (N() && this.f10578n.f18241j == 0 && this.p.f18241j == 0) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            y(th);
            return this.f10578n.f18241j == 0;
        }
    }

    public boolean M(int i) {
        boolean zL;
        if (x38.app.getType() == Application.ApplicationType.WebGL) {
            return L();
        }
        long jA = pzj.a() + ((long) i);
        while (true) {
            zL = L();
            if (zL || pzj.a() > jA) {
                break;
            }
            exj.a();
        }
        return zL;
    }

    public final boolean N() {
        boolean z;
        bi0.a aVar;
        ci0 ci0VarPeek = this.p.peek();
        try {
            z = ci0VarPeek.f10093l || ci0VarPeek.g();
        } catch (RuntimeException e2) {
            ci0VarPeek.f10093l = true;
            J(ci0VarPeek.b, e2);
        }
        if (!z) {
            return false;
        }
        wg0<ci0> wg0Var = this.p;
        if (wg0Var.f18241j == 1) {
            this.q++;
            this.s = 0;
        }
        wg0Var.pop();
        if (ci0VarPeek.f10093l) {
            return true;
        }
        yh0 yh0Var = ci0VarPeek.b;
        b(yh0Var.a, yh0Var.b, ci0VarPeek.k);
        yh0 yh0Var2 = ci0VarPeek.b;
        bi0 bi0Var = yh0Var2.f19014c;
        if (bi0Var != null && (aVar = bi0Var.a) != null) {
            aVar.a(this, yh0Var2.a, yh0Var2.b);
        }
        long jB = pzj.b();
        this.u.a("Loaded: " + ((jB - ci0VarPeek.f10091e) / 1000000.0f) + "ms " + ci0VarPeek.b);
        return true;
    }

    public <T> void b(String str, Class<T> cls, T t) {
        this.f10576j.h(str, cls);
        com.badlogic.gdx.utils.i<String, a> iVar = this.i.get(cls);
        if (iVar == null) {
            iVar = new com.badlogic.gdx.utils.i<>();
            this.i.h(cls, iVar);
        }
        a aVar = new a();
        aVar.a = t;
        iVar.h(str, aVar);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        this.u.a("Disposing.");
        n();
        this.o.dispose();
    }

    public final void i(yh0 yh0Var) {
        ai0 ai0VarV = v(yh0Var.b, yh0Var.a);
        if (ai0VarV != null) {
            this.p.a(new ci0(this, yh0Var, ai0VarV, this.o));
            this.s++;
        } else {
            throw new GdxRuntimeException("No loader for type: " + kc3.e(yh0Var.b));
        }
    }

    public void n() {
        synchronized (this) {
            this.f10578n.clear();
        }
        o();
        synchronized (this) {
            com.badlogic.gdx.utils.h hVar = new com.badlogic.gdx.utils.h();
            while (this.f10576j.i > 0) {
                hVar.a(51);
                wg0<String> wg0VarC = this.f10576j.e().c();
                wg0.b<String> it = wg0VarC.iterator();
                while (it.hasNext()) {
                    wg0<String> wg0Var = this.k.get(it.next());
                    if (wg0Var != null) {
                        wg0.b<String> it2 = wg0Var.iterator();
                        while (it2.hasNext()) {
                            hVar.e(it2.next(), 0, 1);
                        }
                    }
                }
                wg0.b<String> it3 = wg0VarC.iterator();
                while (it3.hasNext()) {
                    String next = it3.next();
                    if (hVar.d(next, 0) == 0) {
                        K(next);
                    }
                }
            }
            this.i.a(51);
            this.f10576j.a(51);
            this.k.a(51);
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.f10578n.clear();
            this.p.clear();
        }
    }

    public void o() {
        this.u.a("Waiting for loading to complete...");
        while (!L()) {
            exj.a();
        }
        this.u.a("Loading complete.");
    }

    public synchronized <T> T p(String str) {
        return (T) s(str, true);
    }

    public synchronized <T> T q(String str, Class<T> cls) {
        return (T) r(str, cls, true);
    }

    public synchronized <T> T r(String str, Class<T> cls, boolean z) {
        a aVar;
        com.badlogic.gdx.utils.i<String, a> iVar = this.i.get(cls);
        if (iVar != null && (aVar = iVar.get(str)) != null) {
            return (T) aVar.a;
        }
        if (!z) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    public synchronized <T> T s(String str, boolean z) {
        com.badlogic.gdx.utils.i<String, a> iVar;
        a aVar;
        Class cls = this.f10576j.get(str);
        if (cls != null && (iVar = this.i.get(cls)) != null && (aVar = iVar.get(str)) != null) {
            return (T) aVar.a;
        }
        if (!z) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> String t(T t) {
        com.badlogic.gdx.utils.i.c<Class> it = this.i.e().iterator();
        while (it.hasNext()) {
            com.badlogic.gdx.utils.i.a<String, a> it2 = this.i.get(it.next()).iterator();
            while (it2.hasNext()) {
                com.badlogic.gdx.utils.i.b next = it2.next();
                Object obj = ((a) next.b).a;
                if (obj == t || t.equals(obj)) {
                    return (String) next.a;
                }
            }
        }
        return null;
    }

    public synchronized wg0<String> u(String str) {
        return this.k.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> ai0 v(Class<T> cls, String str) {
        com.badlogic.gdx.utils.i<String, ai0> iVar = this.m.get(cls);
        ai0 ai0Var = null;
        if (iVar != null && iVar.i >= 1) {
            if (str == null) {
                return iVar.get("");
            }
            com.badlogic.gdx.utils.i.a<String, ai0> it = iVar.c().iterator();
            int length = -1;
            while (it.hasNext()) {
                com.badlogic.gdx.utils.i.b next = it.next();
                if (((String) next.a).length() > length && str.endsWith((String) next.a)) {
                    ai0Var = (ai0) next.b;
                    length = ((String) next.a).length();
                }
            }
        }
        return ai0Var;
    }

    public p7b w() {
        return this.u;
    }

    public synchronized int x(String str) {
        Class cls;
        cls = this.f10576j.get(str);
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return this.i.get(cls).get(str).b;
    }

    public final void y(Throwable th) {
        this.u.c("Error loading asset.", th);
        if (this.p.isEmpty()) {
            throw new GdxRuntimeException(th);
        }
        ci0 ci0VarPop = this.p.pop();
        yh0 yh0Var = ci0VarPop.b;
        if (ci0VarPop.g && ci0VarPop.h != null) {
            wg0.b<yh0> it = ci0VarPop.h.iterator();
            while (it.hasNext()) {
                K(it.next().a);
            }
        }
        this.p.clear();
        throw new GdxRuntimeException(th);
    }

    public final void z(String str) {
        wg0<String> wg0Var = this.k.get(str);
        if (wg0Var == null) {
            return;
        }
        wg0.b<String> it = wg0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.i.get(this.f10576j.get(next)).get(next).b++;
            z(next);
        }
    }

    public di0(mb7 mb7Var) {
        this(mb7Var, true);
    }

    public di0(mb7 mb7Var, boolean z) {
        this.i = new com.badlogic.gdx.utils.i<>();
        this.f10576j = new com.badlogic.gdx.utils.i<>();
        this.k = new com.badlogic.gdx.utils.i<>();
        this.f10577l = new com.badlogic.gdx.utils.j<>();
        this.m = new com.badlogic.gdx.utils.i<>();
        this.f10578n = new wg0<>();
        this.p = new wg0<>();
        this.u = new p7b("AssetManager", 0);
        this.t = mb7Var;
        if (z) {
            G(bf1.class, new df1(mb7Var));
            G(t8c.class, new tac(mb7Var));
            G(Pixmap.class, new ske(mb7Var));
            G(a3i.class, new b3i(mb7Var));
            G(ptj.class, new qtj(mb7Var));
            G(Texture.class, new vtj(mb7Var));
            G(z7h.class, new a8h(mb7Var));
            G(z8e.class, new a9e(mb7Var));
            G(y8e.class, new b9e(mb7Var));
            G(bne.class, new cne(mb7Var));
            G(com.badlogic.gdx.utils.b.class, new gl9(mb7Var));
            H(i2c.class, ".g3dj", new f18(new com.badlogic.gdx.utils.e(), mb7Var));
            H(i2c.class, ".g3db", new f18(new com.badlogic.gdx.utils.n(), mb7Var));
            H(i2c.class, ".obj", new wad(mb7Var));
            G(wxg.class, new xxg(mb7Var));
            G(Cubemap.class, new ve4(mb7Var));
        }
        this.o = new yi0(1, "AssetManager");
    }
}
