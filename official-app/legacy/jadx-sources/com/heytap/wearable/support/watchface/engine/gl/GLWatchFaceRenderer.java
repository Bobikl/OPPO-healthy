package com.heytap.wearable.support.watchface.engine.gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.heytap.sports.move.moving.MovingDataPanelKt;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.gl.RenderObject;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgram;
import com.heytap.wearable.support.watchface.gl.material.ShaderProgramPlane2D;
import com.heytap.wearable.support.watchface.gl.material.Texture;
import com.heytap.wearable.support.watchface.gl.shape.Plane;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.lt9;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class GLWatchFaceRenderer implements CustomGLSurfaceView.n {
    public State a;
    public Context i;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lock f8443c = new ReentrantLock();
    public ShaderProgram d = new ShaderProgramPlane2D();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Texture[] f8444e = {new Texture()};
    public Plane[] f = {new Plane(2.0f, 2.0f)};
    public RenderObject g = new RenderObject();
    public int h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8445j = 368;
    public int k = MovingDataPanelKt.MOVING_PANEL_MAX_HEIGHT_DP;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8446l = false;
    public boolean m = false;

    public enum State {
        PrepareState,
        ReadyState,
        ChangeState
    }

    public GLWatchFaceRenderer(Context context, a aVar) {
        this.a = State.PrepareState;
        SdkDebugLog.d("WatchFaceRenderer3D", "WatchFaceRenderer3D()");
        this.i = context;
        this.a = State.ReadyState;
    }

    public final void a() {
        for (int iGlGetError = GLES20.glGetError(); iGlGetError != 0; iGlGetError = GLES20.glGetError()) {
            SdkDebugLog.d("WatchFaceRenderer3D", "checkGLError" + iGlGetError);
        }
    }

    public void b() {
        throw null;
    }

    public void c() {
        throw null;
    }

    public boolean d(ShaderProgram shaderProgram, String str, String str2) {
        return shaderProgram.create(g(str), g(str2)).booleanValue();
    }

    public void e(Texture texture, Bitmap bitmap) {
        if (texture != null) {
            texture.updateData(bitmap);
        }
    }

    public boolean f(boolean z) {
        return true;
    }

    public String g(String str) {
        String str2 = "";
        InputStream inputStreamOpen = null;
        if (str != null) {
            try {
                try {
                    inputStreamOpen = this.i.getAssets().open(str);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    if (inputStreamOpen.read(bArr) != -1) {
                        str2 = new String(bArr, "UTF-8");
                    }
                } catch (Exception e2) {
                    SdkDebugLog.e("WatchFaceRenderer3D", "[loadShader]:IOException:" + e2.getMessage());
                }
            } finally {
                lt9.a(inputStreamOpen, "WatchFaceRenderer3D");
            }
        }
        return str2;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
        this.a = State.ReadyState;
    }

    public final void k() {
        try {
            throw null;
        } catch (Exception unused) {
            new StringBuilder().append("[updatePreTexture]:IOException:fileResID_");
            throw null;
        }
    }

    public void l(Texture texture, Bitmap bitmap) {
        if (texture != null) {
            texture.updateSubData(bitmap);
        }
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.n
    public void onDrawFrame(GL10 gl10) {
        GLES20.glEnable(k18.GL_CULL_FACE);
        GLES20.glDisable(k18.GL_DEPTH_TEST);
        State state = State.ReadyState;
        State state2 = this.a;
        if (state == state2) {
            if (!this.f8446l) {
                SdkDebugLog.d("WatchFaceRenderer3D", "onDrawFrame:ChangeState:initResource");
                c();
                this.f8446l = true;
            }
            b();
        } else if (State.PrepareState == state2) {
            GLES20.glClear(16384);
            RenderObject renderObject = this.g;
            if (renderObject != null) {
                renderObject.draw();
            }
            int i = this.h;
            if (i < 4) {
                if (i == 3) {
                    c();
                    this.f8446l = true;
                    i();
                }
            } else if (f(false)) {
                j();
            }
            this.h++;
        } else if (State.ChangeState == state2) {
            SdkDebugLog.d("WatchFaceRenderer3D", "onDrawFrame:ChangeState");
            GLES20.glClear(16384);
            if (!this.f8446l) {
                SdkDebugLog.d("WatchFaceRenderer3D", "onDrawFrame:ChangeState:initResource");
                c();
                this.f8446l = true;
            }
            if (this.m) {
                RenderObject renderObject2 = this.g;
                if (renderObject2 != null) {
                    renderObject2.draw();
                }
                if (f(true) && this.h > 1) {
                    i();
                    j();
                }
            } else {
                this.h = 0;
                k();
                h();
                this.m = true;
                RenderObject renderObject3 = this.g;
                if (renderObject3 != null) {
                    renderObject3.draw();
                }
            }
            this.h++;
        }
        a();
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.n
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f8445j = i;
        this.k = i2;
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView.n
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 0.0f);
        a();
    }
}
