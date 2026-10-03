package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class mtc {
    public String a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14217c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mtc f14219j;
    public boolean b = true;
    public final Vector3 d = new Vector3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Quaternion f14218e = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    public final Vector3 f = new Vector3(1.0f, 1.0f, 1.0f);
    public final Matrix4 g = new Matrix4();
    public final Matrix4 h = new Matrix4();
    public wg0<ztc> i = new wg0<>(2);
    public final wg0<mtc> k = new wg0<>(2);

    public static mtc f(wg0<mtc> wg0Var, String str, boolean z, boolean z2) {
        int i = wg0Var.f18241j;
        if (z2) {
            for (int i2 = 0; i2 < i; i2++) {
                mtc mtcVar = wg0Var.get(i2);
                if (mtcVar.a.equalsIgnoreCase(str)) {
                    return mtcVar;
                }
            }
        } else {
            for (int i3 = 0; i3 < i; i3++) {
                mtc mtcVar2 = wg0Var.get(i3);
                if (mtcVar2.a.equals(str)) {
                    return mtcVar2;
                }
            }
        }
        if (!z) {
            return null;
        }
        for (int i4 = 0; i4 < i; i4++) {
            mtc mtcVarF = f(wg0Var.get(i4).k, str, true, z2);
            if (mtcVarF != null) {
                return mtcVarF;
            }
        }
        return null;
    }

    public <T extends mtc> int a(T t) {
        return h(-1, t);
    }

    public void b(boolean z) {
        Matrix4[] matrix4Arr;
        int i;
        wg0.b<ztc> it = this.i.iterator();
        while (it.hasNext()) {
            ztc next = it.next();
            com.badlogic.gdx.utils.a<mtc, Matrix4> aVar = next.f19547c;
            if (aVar != null && (matrix4Arr = next.d) != null && (i = aVar.k) == matrix4Arr.length) {
                for (int i2 = 0; i2 < i; i2++) {
                    next.d[i2].set(next.f19547c.i[i2].h).mul(next.f19547c.f1287j[i2]);
                }
            }
        }
        if (z) {
            wg0.b<mtc> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().b(true);
            }
        }
    }

    public Matrix4 c() {
        if (!this.f14217c) {
            this.g.set(this.d, this.f14218e, this.f);
        }
        return this.g;
    }

    public void d(boolean z) {
        c();
        e();
        if (z) {
            wg0.b<mtc> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().d(true);
            }
        }
    }

    public Matrix4 e() {
        mtc mtcVar;
        if (!this.b || (mtcVar = this.f14219j) == null) {
            this.h.set(this.g);
        } else {
            this.h.set(mtcVar.h).mul(this.g);
        }
        return this.h;
    }

    public mtc g() {
        return this.f14219j;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public <T extends mtc> int h(int i, T t) {
        for (mtc mtcVarG = this; mtcVarG != null; mtcVarG = mtcVarG.g()) {
            if (mtcVarG == t) {
                throw new GdxRuntimeException("Cannot add a parent as a child");
            }
        }
        mtc mtcVarG2 = t.g();
        if (mtcVarG2 != null && !mtcVarG2.i(t)) {
            throw new GdxRuntimeException("Could not remove child from its current parent");
        }
        if (i >= 0) {
            wg0<mtc> wg0Var = this.k;
            if (i >= wg0Var.f18241j) {
                wg0<mtc> wg0Var2 = this.k;
                int i2 = wg0Var2.f18241j;
                wg0Var2.a(t);
                i = i2;
            } else {
                wg0Var.f(i, t);
            }
        } else {
            wg0<mtc> wg0Var3 = this.k;
            int i3 = wg0Var3.f18241j;
            wg0Var3.a(t);
            i = i3;
        }
        t.f14219j = this;
        return i;
    }

    public <T extends mtc> boolean i(T t) {
        if (!this.k.i(t, true)) {
            return false;
        }
        t.f14219j = null;
        return true;
    }
}
