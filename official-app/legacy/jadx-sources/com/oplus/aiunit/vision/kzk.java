package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer;
import com.heytap.wearable.support.watchface.gl.RenderObject;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram3D;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgramPlane2D;
import com.heytap.wearable.support.watchface.gl.material.Texture;
import com.heytap.wearable.support.watchface.gl.shape.Plane;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class kzk extends GLWatchFaceRenderer implements SurfaceTexture.OnFrameAvailableListener {
    public a A;
    public String B;
    public String C;
    public boolean D;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f13462n;
    public SurfaceTexture o;
    public boolean p;
    public ShaderProgram q;
    public stj[] r;
    public Plane[] s;
    public RenderObject t;
    public Bitmap u;
    public Canvas v;
    public Texture[] w;
    public Plane[] x;
    public ShaderProgramPlane2D y;
    public RenderObject z;

    public interface a {
        void a();

        void b();

        void c(Canvas canvas);
    }

    public kzk(Context context, com.heytap.wearable.support.watchface.engine.gl.a aVar, a aVar2, String str, String str2) {
        super(context, aVar);
        this.f13462n = new float[16];
        this.p = false;
        this.q = new ShaderProgram3D();
        this.r = new stj[]{new stj()};
        this.s = new Plane[]{new Plane(2.0f, 2.0f)};
        this.t = new RenderObject();
        this.w = new Texture[]{new Texture()};
        this.x = new Plane[]{new Plane(2.0f, 2.0f)};
        this.y = new ShaderProgramPlane2D();
        this.z = new RenderObject();
        this.D = true;
        this.B = str;
        this.C = str2;
        this.A = aVar2;
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer
    public void b() {
        GLES20.glEnable(k18.GL_BLEND);
        GLES20.glBlendFunc(k18.GL_SRC_ALPHA, k18.GL_ONE_MINUS_SRC_ALPHA);
        p();
        o();
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer
    public void c() {
        this.s[0].create();
        this.t.setMesh(this.s);
        d(this.q, this.B, this.C);
        this.t.setShaderProgram(this.q);
        this.t.setTexture(this.r);
        SurfaceTexture surfaceTextureA = this.r[0].a();
        this.o = surfaceTextureA;
        surfaceTextureA.setOnFrameAvailableListener(this);
        this.u = Bitmap.createBitmap(this.f8445j, this.k, Bitmap.Config.ARGB_8888);
        this.v = new Canvas(this.u);
        m();
        this.x[0].create();
        d(this.y, "shader/vertexCanvas.shader", "shader/fragCanvas.shader");
        e(this.w[0], this.u);
        this.z.setMesh(this.x);
        this.z.setShaderProgram(this.y);
        this.z.setTexture(this.w);
        this.A.b();
    }

    public final void m() {
        this.u.eraseColor(0);
    }

    public void n(Canvas canvas) {
        this.A.c(canvas);
    }

    public final void o() {
        GLES20.glEnable(k18.GL_CULL_FACE);
        this.z.draw();
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.GLWatchFaceRenderer, com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.n
    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            if (this.f8446l) {
                r();
            }
        }
        super.onDrawFrame(gl10);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.p = true;
            this.A.a();
        }
    }

    public final void p() {
        GLES20.glClear(16384);
        this.t.draw();
    }

    public SurfaceTexture q() {
        return this.o;
    }

    public void r() {
        if (this.p) {
            this.o.updateTexImage();
            this.o.getTransformMatrix(this.f13462n);
            this.q.useProgram();
            this.q.updateWorldMatrix(this.f13462n);
            this.p = false;
        }
        if (this.D) {
            m();
            n(this.v);
            l(this.w[0], this.u);
            this.D = false;
        }
    }
}
