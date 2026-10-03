package com.oplus.aiunit.vision;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class k0c {
    public static boolean a = true;

    public static void a(int i, Pixmap pixmap, int i2, int i3) {
        if (!a) {
            b(i, pixmap, i2, i3);
        } else if (x38.app.getType() == Application.ApplicationType.Android || x38.app.getType() == Application.ApplicationType.WebGL || x38.app.getType() == Application.ApplicationType.iOS) {
            d(i, pixmap);
        } else {
            c(i, pixmap, i2, i3);
        }
    }

    public static void b(int i, Pixmap pixmap, int i2, int i3) {
        x38.gl.t(i, 0, pixmap.q(), pixmap.u(), pixmap.s(), 0, pixmap.p(), pixmap.r(), pixmap.t());
        if (x38.gl20 == null && i2 != i3) {
            throw new GdxRuntimeException("texture width and height must be square when using mipmapping.");
        }
        int iU = pixmap.u() / 2;
        int iS = pixmap.s() / 2;
        int i4 = 1;
        Pixmap pixmap2 = pixmap;
        while (iU > 0 && iS > 0) {
            Pixmap pixmap3 = new Pixmap(iU, iS, pixmap2.o());
            pixmap3.v(Pixmap.Blending.None);
            pixmap3.i(pixmap2, 0, 0, pixmap2.u(), pixmap2.s(), 0, 0, iU, iS);
            if (i4 > 1) {
                pixmap2.dispose();
            }
            pixmap2 = pixmap3;
            x38.gl.t(i, i4, pixmap3.q(), pixmap3.u(), pixmap3.s(), 0, pixmap3.p(), pixmap3.r(), pixmap3.t());
            iU = pixmap2.u() / 2;
            iS = pixmap2.s() / 2;
            i4++;
        }
    }

    public static void c(int i, Pixmap pixmap, int i2, int i3) {
        if (!x38.graphics.a("GL_ARB_framebuffer_object") && !x38.graphics.a("GL_EXT_framebuffer_object") && !x38.gl20.getClass().getName().equals("com.badlogic.gdx.backends.lwjgl3.Lwjgl3GLES20") && x38.gl30 == null) {
            b(i, pixmap, i2, i3);
        } else {
            x38.gl.t(i, 0, pixmap.q(), pixmap.u(), pixmap.s(), 0, pixmap.p(), pixmap.r(), pixmap.t());
            x38.gl20.L(i);
        }
    }

    public static void d(int i, Pixmap pixmap) {
        x38.gl.t(i, 0, pixmap.q(), pixmap.u(), pixmap.s(), 0, pixmap.p(), pixmap.r(), pixmap.t());
        x38.gl20.L(i);
    }
}
