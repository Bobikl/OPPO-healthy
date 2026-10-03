package com.vfx.lib;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes10.dex */
public class VFXGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20367l = "VFXGLSurfaceView";
    public static VFXGLSurfaceView m;
    public VFXRenderer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20368j;
    public boolean k;

    public class a implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20369j;
        public final /* synthetic */ float k;

        public a(int i, float f, float f2) {
            this.i = i;
            this.f20369j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionPointerDown(this.i, this.f20369j, this.k);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20371j;
        public final /* synthetic */ float k;

        public b(int i, float f, float f2) {
            this.i = i;
            this.f20371j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionDown(this.i, this.f20371j, this.k);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20373j;
        public final /* synthetic */ float[] k;

        public c(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20373j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionMove(this.i, this.f20373j, this.k);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20375j;
        public final /* synthetic */ float[] k;

        public d(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20375j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionMove(this.i, this.f20375j, this.k);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20377j;
        public final /* synthetic */ float k;

        public e(int i, float f, float f2) {
            this.i = i;
            this.f20377j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionUp(this.i, this.f20377j, this.k);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f20379j;
        public final /* synthetic */ float k;

        public f(int i, float f, float f2) {
            this.i = i;
            this.f20379j = f;
            this.k = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionUp(this.i, this.f20379j, this.k);
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20381j;
        public final /* synthetic */ float[] k;

        public g(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20381j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionCancel(this.i, this.f20381j, this.k);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f20383j;
        public final /* synthetic */ float[] k;

        public h(int[] iArr, float[] fArr, float[] fArr2) {
            this.i = iArr;
            this.f20383j = fArr;
            this.k = fArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXGLSurfaceView.this.i.handleActionCancel(this.i, this.f20383j, this.k);
        }
    }

    public VFXGLSurfaceView(Context context) {
        super(context);
        this.f20368j = false;
        this.k = false;
        b();
    }

    public static VFXGLSurfaceView getInstance() {
        return m;
    }

    public void b() {
        setEGLContextClientVersion(3);
        setFocusableInTouchMode(false);
        m = this;
        setClickable(false);
    }

    public VFXRenderer getVFXRenderer() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        Log.v(f20367l, "java VFXGLSurfaceView onPause");
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        Log.v(f20367l, "java VFXGLSurfaceView onResume");
        super.onResume();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (isInEditMode()) {
            return;
        }
        this.i.setScreenWidthAndHeight(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int[] iArr = new int[pointerCount];
        float[] fArr = new float[pointerCount];
        float[] fArr2 = new float[pointerCount];
        if (this.f20368j) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(((Activity) getContext()).getCurrentFocus().getWindowToken(), 0);
            requestFocus();
            this.f20368j = false;
        }
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i);
            fArr2[i] = motionEvent.getY(i);
        }
        if (motionEvent.getAction() != 2) {
            Log.d(f20367l, "VFX--------------------onTouchEvent--------------------pMotionEvent.getAction(): " + (motionEvent.getAction() & 255));
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            queueEvent(new b(motionEvent.getPointerId(0), fArr[0], fArr2[0]));
        } else if (action == 1) {
            queueEvent(new f(motionEvent.getPointerId(0), fArr[0], fArr2[0]));
        } else if (action != 2) {
            if (action != 3) {
                if (action == 5) {
                    int action2 = motionEvent.getAction() >> 8;
                    queueEvent(new a(motionEvent.getPointerId(action2), motionEvent.getX(action2), motionEvent.getY(action2)));
                } else if (action == 6) {
                    int action3 = motionEvent.getAction() >> 8;
                    if (this.k || action3 == 0) {
                        queueEvent(new e(motionEvent.getPointerId(action3), motionEvent.getX(action3), motionEvent.getY(action3)));
                    }
                }
            } else if (this.k) {
                queueEvent(new h(iArr, fArr, fArr2));
            } else {
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    if (iArr[i2] == 0) {
                        queueEvent(new g(new int[]{0}, new float[]{fArr[i2]}, new float[]{fArr2[i2]}));
                        break;
                    }
                }
            }
        } else if (this.k) {
            queueEvent(new d(iArr, fArr, fArr2));
        } else {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (iArr[i3] == 0) {
                    queueEvent(new c(new int[]{0}, new float[]{fArr[i3]}, new float[]{fArr2[i3]}));
                    break;
                }
            }
        }
        return true;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setAlpha(float f2) {
        super.setAlpha(f2);
    }

    public void setMultipleTouchEnabled(boolean z) {
        this.k = z;
    }

    public void setSoftKeyboardShown(boolean z) {
        this.f20368j = z;
    }

    public void setVFXRenderer(VFXRenderer vFXRenderer) {
        this.i = vFXRenderer;
        setRenderer(vFXRenderer);
    }

    public VFXGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20368j = false;
        this.k = false;
        b();
    }
}
