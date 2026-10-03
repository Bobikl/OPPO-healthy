package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes12.dex */
public abstract class qem extends rem {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f15771j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15772l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15773n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;

    public qem(Context context) {
        super(context);
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.f15771j = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public static float j(MotionEvent motionEvent, int i) {
        float x = (i + motionEvent.getX()) - motionEvent.getRawX();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getX(1) + x;
        }
        return 0.0f;
    }

    public static float m(MotionEvent motionEvent, int i) {
        float y = (i + motionEvent.getY()) - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getY(1) + y;
        }
        return 0.0f;
    }

    @Override // com.oplus.aiunit.vision.rem
    public void e(MotionEvent motionEvent) {
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.f16178c;
        int pointerCount = motionEvent2.getPointerCount();
        int pointerCount2 = motionEvent.getPointerCount();
        if (pointerCount2 == 2 && pointerCount2 == pointerCount) {
            this.q = -1.0f;
            this.r = -1.0f;
            float x = motionEvent2.getX(0);
            float y = motionEvent2.getY(0);
            float x2 = motionEvent2.getX(1);
            float y2 = motionEvent2.getY(1);
            this.m = x2 - x;
            this.f15773n = y2 - y;
            float x3 = motionEvent.getX(0);
            float y3 = motionEvent.getY(0);
            float x4 = motionEvent.getX(1);
            float y4 = motionEvent.getY(1);
            this.o = x4 - x3;
            this.p = y4 - y3;
            this.s = x3 - x;
            this.t = y3 - y;
            this.u = x4 - x2;
            this.v = y4 - y2;
        }
    }

    public final PointF k(int i) {
        return i == 0 ? new PointF(this.s, this.t) : new PointF(this.u, this.v);
    }

    public final boolean l(MotionEvent motionEvent, int i, int i2) {
        int i3;
        int i4 = this.h;
        if (i4 == 0 || (i3 = this.i) == 0) {
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels;
            float f2 = this.f15771j;
            this.k = f - f2;
            this.f15772l = displayMetrics.heightPixels - f2;
        } else {
            float f3 = this.f15771j;
            this.k = i4 - f3;
            this.f15772l = i3 - f3;
        }
        float f4 = this.f15771j;
        float f5 = this.k;
        float f6 = this.f15772l;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float fJ = j(motionEvent, i);
        float fM = m(motionEvent, i2);
        boolean z = rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6;
        boolean z2 = fJ < f4 || fM < f4 || fJ > f5 || fM > f6;
        return (z && z2) || z || z2;
    }
}
