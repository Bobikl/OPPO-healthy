package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.l18;
import com.oplus.aiunit.vision.otj;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.x38;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class c extends a {
    public static final Map<Application, wg0<c>> q = new HashMap();

    public static void A(Application application) {
        wg0<c> wg0Var = q.get(application);
        if (wg0Var == null) {
            return;
        }
        for (int i = 0; i < wg0Var.f18241j; i++) {
            wg0Var.get(i).D();
        }
    }

    public static void z(Application application) {
        q.remove(application);
    }

    public boolean B() {
        throw null;
    }

    public final void C(otj otjVar) {
        bind();
        x38.gl30.Z(l18.GL_TEXTURE_2D_ARRAY, 0, otjVar.b(), otjVar.getWidth(), otjVar.getHeight(), otjVar.d(), 0, otjVar.b(), otjVar.e(), null);
        if (!otjVar.a()) {
            otjVar.prepare();
        }
        otjVar.c();
        s(this.k, this.f1215l);
        t(this.m, this.f1216n);
        x38.gl.Y(this.i, 0);
    }

    public void D() {
        if (!B()) {
            throw new GdxRuntimeException("Tried to reload an unmanaged TextureArray");
        }
        this.f1214j = x38.gl.b();
        C(null);
    }
}
