package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes13.dex */
public class mf4 {
    public int a = -1;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f14045c;
    public VelocityTracker d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14046e;
    public float f;
    public float g;
    public final float h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ihd f14047j;

    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            mf4.this.f14047j.c(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public mf4(Context context, ihd ihdVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        this.f14047j = ihdVar;
        this.f14045c = new ScaleGestureDetector(context, new a());
    }

    public final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean d() {
        return this.f14046e;
    }

    public boolean e() {
        return this.f14045c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f14045c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public final boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f = b(motionEvent);
            this.g = c(motionEvent);
            this.f14046e = false;
        } else if (action == 1) {
            this.a = -1;
            if (this.f14046e && this.d != null) {
                this.f = b(motionEvent);
                this.g = c(motionEvent);
                this.d.addMovement(motionEvent);
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                    this.f14047j.a(this.f, this.g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d = null;
            }
        } else if (action == 2) {
            float fB = b(motionEvent);
            float fC = c(motionEvent);
            float f = fB - this.f;
            float f2 = fC - this.g;
            if (!this.f14046e) {
                this.f14046e = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.h);
            }
            if (this.f14046e) {
                this.f14047j.b(f, f2);
                this.f = fB;
                this.g = fC;
                VelocityTracker velocityTracker2 = this.d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.a = -1;
            VelocityTracker velocityTracker3 = this.d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.d = null;
            }
        } else if (action == 6) {
            int iB = wqk.b(motionEvent.getAction());
            if (motionEvent.getPointerId(iB) == this.a) {
                int i = iB == 0 ? 1 : 0;
                this.a = motionEvent.getPointerId(i);
                this.f = motionEvent.getX(i);
                this.g = motionEvent.getY(i);
            }
        }
        int i2 = this.a;
        this.b = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        return true;
    }
}
