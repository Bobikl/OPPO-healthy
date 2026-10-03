package com.oplus.aiunit.vision;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.a;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o18<T extends com.badlogic.gdx.graphics.a> implements bv5 {
    public static int p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14734j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14735l;
    public int m;
    public static final Map<Application, wg0<o18>> o = new HashMap();
    public static boolean q = false;
    public static final IntBuffer r = BufferUtils.e(1);
    public wg0<T> i = new wg0<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aca f14736n = new aca();

    public static void n(Application application) {
        o.remove(application);
    }

    public static String p() {
        return q(new StringBuilder()).toString();
    }

    public static StringBuilder q(StringBuilder sb) {
        sb.append("Managed buffers/app: { ");
        Iterator<Application> it = o.keySet().iterator();
        while (it.hasNext()) {
            sb.append(o.get(it.next()).f18241j);
            sb.append(" ");
        }
        sb.append("}");
        return sb;
    }

    public static void r(Application application) {
        wg0<o18> wg0Var;
        if (x38.gl20 == null || (wg0Var = o.get(application)) == null) {
            return;
        }
        for (int i = 0; i < wg0Var.f18241j; i++) {
            wg0Var.get(i).b();
        }
    }

    public void b() {
        k18 k18Var = x38.gl20;
        i();
        if (!q) {
            q = true;
            if (x38.app.getType() == Application.ApplicationType.iOS) {
                IntBuffer intBufferAsIntBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asIntBuffer();
                k18Var.H(36006, intBufferAsIntBuffer);
                p = intBufferAsIntBuffer.get(0);
            } else {
                p = 0;
            }
        }
        int iC0 = k18Var.c0();
        this.f14734j = iC0;
        k18Var.f(k18.GL_FRAMEBUFFER, iC0);
        throw null;
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        k18 k18Var = x38.gl20;
        wg0.b<T> it = this.i.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        k18Var.r(this.m);
        k18Var.r(this.k);
        k18Var.r(this.f14735l);
        k18Var.u(this.f14734j);
        Map<Application, wg0<o18>> map = o;
        if (map.get(x38.app) != null) {
            map.get(x38.app).i(this, true);
        }
    }

    public final void i() {
        throw null;
    }

    public abstract void o(T t);
}
