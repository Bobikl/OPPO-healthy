package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes10.dex */
public class c extends ImageView {
    public Matrix i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f20283j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f20284l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f20285n;
    public boolean o;
    public float p;
    public float q;
    public final String r;
    public PointF s;
    public PointF t;
    public float u;
    public float v;
    public boolean w;
    public Rect x;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.tencent.connect.avatar.c$a$a, reason: collision with other inner class name */
        public class RunnableC1007a implements Runnable {
            public RunnableC1007a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.clearAnimation();
                c.this.g();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            c.this.post(new RunnableC1007a());
            c.this.o = false;
        }
    }

    public c(Context context) {
        super(context);
        this.i = new Matrix();
        this.f20283j = new Matrix();
        this.k = 0;
        this.f20284l = 1.0f;
        this.m = 1.0f;
        this.o = false;
        this.r = "TouchView";
        this.s = new PointF();
        this.t = new PointF();
        this.u = 1.0f;
        this.v = 0.0f;
        this.w = false;
        Rect rect = new Rect();
        this.x = rect;
        getDrawingRect(rect);
        b();
    }

    public final float a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public final void b() {
    }

    public final void c(PointF pointF) {
        if (this.f20285n == null) {
            return;
        }
        float[] fArr = new float[9];
        this.i.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float width = this.f20285n.getWidth() * f3;
        float height = this.f20285n.getHeight() * f3;
        Rect rect = this.x;
        float f4 = rect.left - f;
        if (f4 <= 1.0f) {
            f4 = 1.0f;
        }
        float f5 = (f + width) - rect.right;
        if (f5 <= 1.0f) {
            f5 = 1.0f;
        }
        float fWidth = (rect.width() * f4) / (f5 + f4);
        Rect rect2 = this.x;
        float f6 = fWidth + rect2.left;
        float f7 = rect2.top - f2;
        float f8 = (f2 + height) - rect2.bottom;
        if (f7 <= 1.0f) {
            f7 = 1.0f;
        }
        pointF.set(f6, ((rect2.height() * f7) / ((f8 > 1.0f ? f8 : 1.0f) + f7)) + this.x.top);
    }

    public void d(Rect rect) {
        this.x = rect;
        if (this.f20285n != null) {
            h();
        }
    }

    public final void g() {
        boolean z;
        Animation translateAnimation;
        if (this.f20285n == null) {
            return;
        }
        float fWidth = this.x.width();
        float fHeight = this.x.height();
        float[] fArr = new float[9];
        this.i.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float f4 = this.f20284l;
        if (f3 > f4) {
            float f5 = f4 / f3;
            this.v = f5;
            Matrix matrix = this.i;
            PointF pointF = this.t;
            matrix.postScale(f5, f5, pointF.x, pointF.y);
            setImageMatrix(this.i);
            float f6 = this.v;
            float f7 = 1.0f / f6;
            float f8 = 1.0f / f6;
            PointF pointF2 = this.t;
            translateAnimation = new ScaleAnimation(f7, 1.0f, f8, 1.0f, pointF2.x, pointF2.y);
        } else {
            float f9 = this.m;
            if (f3 < f9) {
                float f10 = f9 / f3;
                this.v = f10;
                Matrix matrix2 = this.i;
                PointF pointF3 = this.t;
                matrix2.postScale(f10, f10, pointF3.x, pointF3.y);
                float f11 = this.v;
                PointF pointF4 = this.t;
                translateAnimation = new ScaleAnimation(1.0f, f11, 1.0f, f11, pointF4.x, pointF4.y);
            } else {
                float width = this.f20285n.getWidth() * f3;
                float height = this.f20285n.getHeight() * f3;
                Rect rect = this.x;
                int i = rect.left;
                float f12 = i - f;
                int i2 = rect.top;
                float f13 = i2 - f2;
                if (f12 < 0.0f) {
                    f = i;
                    z = true;
                } else {
                    z = false;
                }
                if (f13 < 0.0f) {
                    f2 = i2;
                    z = true;
                }
                float f14 = height - f13;
                if (width - f12 < fWidth) {
                    f = i - (width - fWidth);
                    z = true;
                }
                if (f14 < fHeight) {
                    f2 = i2 - (height - fHeight);
                    z = true;
                }
                if (z) {
                    float f15 = fArr[2] - f;
                    float f16 = fArr[5] - f2;
                    fArr[2] = f;
                    fArr[5] = f2;
                    this.i.setValues(fArr);
                    setImageMatrix(this.i);
                    translateAnimation = new TranslateAnimation(f15, 0.0f, f16, 0.0f);
                } else {
                    setImageMatrix(this.i);
                    translateAnimation = null;
                }
            }
        }
        if (translateAnimation != null) {
            this.o = true;
            translateAnimation.setDuration(300L);
            startAnimation(translateAnimation);
            new Thread(new a()).start();
        }
    }

    public final void h() {
        if (this.f20285n == null) {
            return;
        }
        float[] fArr = {fMax, 0.0f, this.p, 0.0f, fMax, height, 0.0f, 0.0f, 0.0f};
        this.i.getValues(fArr);
        float fMax = Math.max(this.x.width() / this.f20285n.getWidth(), this.x.height() / this.f20285n.getHeight());
        this.p = this.x.left - (((this.f20285n.getWidth() * fMax) - this.x.width()) / 2.0f);
        float height = this.x.top - (((this.f20285n.getHeight() * fMax) - this.x.height()) / 2.0f);
        this.q = height;
        this.i.setValues(fArr);
        float fMin = Math.min(2048.0f / this.f20285n.getWidth(), 2048.0f / this.f20285n.getHeight());
        this.f20284l = fMin;
        this.m = fMax;
        if (fMin < fMax) {
            this.f20284l = fMax;
        }
        setImageMatrix(this.i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.o) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.i.set(getImageMatrix());
            this.f20283j.set(this.i);
            this.s.set(motionEvent.getX(), motionEvent.getY());
            this.k = 1;
        } else if (action == 1) {
            g();
            this.k = 0;
        } else if (action == 2) {
            int i = this.k;
            if (i == 1) {
                this.i.set(this.f20283j);
                this.i.postTranslate(motionEvent.getX() - this.s.x, motionEvent.getY() - this.s.y);
                setImageMatrix(this.i);
            } else if (i == 2) {
                Matrix matrix = this.i;
                matrix.set(matrix);
                float fA = a(motionEvent);
                if (fA > 10.0f) {
                    this.i.set(this.f20283j);
                    float f = fA / this.u;
                    Matrix matrix2 = this.i;
                    PointF pointF = this.t;
                    matrix2.postScale(f, f, pointF.x, pointF.y);
                }
                setImageMatrix(this.i);
            }
        } else if (action == 5) {
            float fA2 = a(motionEvent);
            this.u = fA2;
            if (fA2 > 10.0f) {
                this.f20283j.set(this.i);
                c(this.t);
                this.k = 2;
            }
        } else if (action == 6) {
            g();
            this.k = 0;
        }
        this.w = true;
        return true;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f20285n = bitmap;
        if (bitmap != null) {
            this.f20285n = bitmap;
        }
    }
}
