package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.bi0;
import com.oplus.aiunit.vision.di0;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.qc7;
import com.oplus.aiunit.vision.uke;
import com.oplus.aiunit.vision.vtj;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.x38;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class Texture extends com.badlogic.gdx.graphics.a {
    public static di0 r;
    public static final Map<Application, wg0<Texture>> s = new HashMap();
    public TextureData q;

    public enum TextureFilter {
        Nearest(k18.GL_NEAREST),
        Linear(k18.GL_LINEAR),
        MipMap(k18.GL_LINEAR_MIPMAP_LINEAR),
        MipMapNearestNearest(k18.GL_NEAREST_MIPMAP_NEAREST),
        MipMapLinearNearest(k18.GL_LINEAR_MIPMAP_NEAREST),
        MipMapNearestLinear(k18.GL_NEAREST_MIPMAP_LINEAR),
        MipMapLinearLinear(k18.GL_LINEAR_MIPMAP_LINEAR);

        final int glEnum;

        TextureFilter(int i) {
            this.glEnum = i;
        }

        public int getGLEnum() {
            return this.glEnum;
        }

        public boolean isMipMap() {
            int i = this.glEnum;
            return (i == 9728 || i == 9729) ? false : true;
        }
    }

    public enum TextureWrap {
        MirroredRepeat(k18.GL_MIRRORED_REPEAT),
        ClampToEdge(k18.GL_CLAMP_TO_EDGE),
        Repeat(k18.GL_REPEAT);

        final int glEnum;

        TextureWrap(int i) {
            this.glEnum = i;
        }

        public int getGLEnum() {
            return this.glEnum;
        }
    }

    public class a implements bi0.a {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.bi0.a
        public void a(di0 di0Var, String str, Class cls) {
            di0Var.I(str, this.a);
        }
    }

    public Texture() {
        super(0, 0);
    }

    public static void A(Application application) {
        s.remove(application);
    }

    public static String C() {
        StringBuilder sb = new StringBuilder();
        sb.append("Managed textures/app: { ");
        Iterator<Application> it = s.keySet().iterator();
        while (it.hasNext()) {
            sb.append(s.get(it.next()).f18241j);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void F(Application application) {
        wg0<Texture> wg0Var = s.get(application);
        if (wg0Var == null) {
            return;
        }
        di0 di0Var = r;
        if (di0Var == null) {
            for (int i = 0; i < wg0Var.f18241j; i++) {
                wg0Var.get(i).I();
            }
            return;
        }
        di0Var.o();
        wg0<? extends Texture> wg0Var2 = new wg0<>(wg0Var);
        wg0.b<? extends Texture> bVarG = wg0Var2.iterator();
        while (bVarG.hasNext()) {
            Texture next = bVarG.next();
            String strT = r.t(next);
            if (strT == null) {
                next.I();
            } else {
                int iX = r.x(strT);
                r.I(strT, 0);
                next.f1214j = 0;
                vtj.b bVar = new vtj.b();
                bVar.f17989e = next.D();
                bVar.f = next.o();
                bVar.g = next.i();
                bVar.h = next.q();
                bVar.i = next.r();
                bVar.f17988c = next.q.f();
                bVar.d = next;
                bVar.a = new a(iX);
                r.K(strT);
                next.f1214j = x38.gl.b();
                r.E(strT, Texture.class, bVar);
            }
        }
        wg0Var.clear();
        wg0Var.b(wg0Var2);
    }

    public static void z(Application application, Texture texture) {
        Map<Application, wg0<Texture>> map = s;
        wg0<Texture> wg0Var = map.get(application);
        if (wg0Var == null) {
            wg0Var = new wg0<>();
        }
        wg0Var.a(texture);
        map.put(application, wg0Var);
    }

    public int B() {
        return this.q.getHeight();
    }

    public TextureData D() {
        return this.q;
    }

    public int E() {
        return this.q.getWidth();
    }

    public boolean G() {
        return this.q.b();
    }

    public void H(TextureData textureData) {
        if (this.q != null && textureData.b() != this.q.b()) {
            throw new GdxRuntimeException("New data must have the same managed status as the old data");
        }
        this.q = textureData;
        if (!textureData.a()) {
            textureData.prepare();
        }
        bind();
        com.badlogic.gdx.graphics.a.x(k18.GL_TEXTURE_2D, textureData);
        v(this.k, this.f1215l, true);
        w(this.m, this.f1216n, true);
        u(this.o, true);
        x38.gl.Y(this.i, 0);
    }

    public void I() {
        if (!G()) {
            throw new GdxRuntimeException("Tried to reload unmanaged Texture");
        }
        this.f1214j = x38.gl.b();
        H(this.q);
    }

    @Override // com.badlogic.gdx.graphics.a, com.oplus.aiunit.vision.bv5
    public void dispose() {
        if (this.f1214j == 0) {
            return;
        }
        b();
        if (this.q.b()) {
            Map<Application, wg0<Texture>> map = s;
            if (map.get(x38.app) != null) {
                map.get(x38.app).i(this, true);
            }
        }
    }

    public String toString() {
        TextureData textureData = this.q;
        return textureData instanceof qc7 ? textureData.toString() : super.toString();
    }

    public Texture(kb7 kb7Var, boolean z) {
        this(kb7Var, (Pixmap.Format) null, z);
    }

    public Texture(kb7 kb7Var, Pixmap.Format format, boolean z) {
        this(TextureData.a.a(kb7Var, format, z));
    }

    public Texture(Pixmap pixmap) {
        this(new uke(pixmap, null, false, false));
    }

    public Texture(TextureData textureData) {
        this(k18.GL_TEXTURE_2D, x38.gl.b(), textureData);
    }

    public Texture(int i, int i2, TextureData textureData) {
        super(i, i2);
        H(textureData);
        if (textureData.b()) {
            z(x38.app, this);
        }
    }
}
