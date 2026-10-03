package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes13.dex */
public class oie implements View.OnTouchListener, View.OnLayoutChangeListener {
    public static float G = 3.0f;
    public static float H = 1.75f;
    public static float I = 1.0f;
    public static int J = 200;
    public float C;
    public ImageView p;
    public GestureDetector q;
    public mf4 r;
    public View.OnClickListener x;
    public View.OnLongClickListener y;
    public f z;
    public Interpolator i = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14953j = J;
    public float k = I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14954l = H;
    public float m = G;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14955n = true;
    public boolean o = false;
    public final Matrix s = new Matrix();
    public final Matrix t = new Matrix();
    public final Matrix u = new Matrix();
    public final RectF v = new RectF();
    public final float[] w = new float[9];
    public int A = 2;
    public int B = 2;
    public boolean D = true;
    public ImageView.ScaleType E = ImageView.ScaleType.FIT_CENTER;
    public ihd F = new a();

    public class a implements ihd {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ihd
        public void a(float f, float f2, float f3, float f4) {
            oie oieVar = oie.this;
            oieVar.z = oieVar.new f(oieVar.p.getContext());
            f fVar = oie.this.z;
            oie oieVar2 = oie.this;
            int iG = oieVar2.G(oieVar2.p);
            oie oieVar3 = oie.this;
            fVar.b(iG, oieVar3.F(oieVar3.p), (int) f3, (int) f4);
            oie.this.p.post(oie.this.z);
        }

        @Override // com.oplus.aiunit.vision.ihd
        public void b(float f, float f2) {
            if (oie.this.r.e()) {
                return;
            }
            oie.b(oie.this);
            oie.this.u.postTranslate(f, f2);
            oie.this.z();
            ViewParent parent = oie.this.p.getParent();
            if (!oie.this.f14955n || oie.this.r.e() || oie.this.o) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((oie.this.A == 2 || ((oie.this.A == 0 && f >= 1.0f) || ((oie.this.A == 1 && f <= -1.0f) || ((oie.this.B == 0 && f2 >= 1.0f) || (oie.this.B == 1 && f2 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.oplus.aiunit.vision.ihd
        public void c(float f, float f2, float f3) {
            if (oie.this.K() < oie.this.m || f < 1.0f) {
                oie.f(oie.this);
                oie.this.u.postScale(f, f, f2, f3);
                oie.this.z();
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            oie.h(oie.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (oie.this.y != null) {
                oie.this.y.onLongClick(oie.this.p);
            }
        }
    }

    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fK = oie.this.K();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (fK < oie.this.I()) {
                    oie oieVar = oie.this;
                    oieVar.W(oieVar.I(), x, y, true);
                } else if (fK < oie.this.I() || fK >= oie.this.H()) {
                    oie oieVar2 = oie.this;
                    oieVar2.W(oieVar2.J(), x, y, true);
                } else {
                    oie oieVar3 = oie.this;
                    oieVar3.W(oieVar3.H(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (oie.this.x != null) {
                oie.this.x.onClick(oie.this.p);
            }
            RectF rectFB = oie.this.B();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            oie.j(oie.this);
            if (rectFB == null) {
                return false;
            }
            if (!rectFB.contains(x, y)) {
                oie.m(oie.this);
                return false;
            }
            rectFB.width();
            rectFB.height();
            oie.l(oie.this);
            return true;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e implements Runnable {
        public final float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f14956j;
        public final long k = System.currentTimeMillis();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f14957l;
        public final float m;

        public e(float f, float f2, float f3, float f4) {
            this.i = f3;
            this.f14956j = f4;
            this.f14957l = f;
            this.m = f2;
        }

        public final float a() {
            return oie.this.i.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.k) * 1.0f) / oie.this.f14953j));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = a();
            float f = this.f14957l;
            oie.this.F.c((f + ((this.m - f) * fA)) / oie.this.K(), this.i, this.f14956j);
            if (fA < 1.0f) {
                ir3.a(oie.this.p, this);
            }
        }
    }

    public class f implements Runnable {
        public final OverScroller i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14959j;
        public int k;

        public f(Context context) {
            this.i = new OverScroller(context);
        }

        public void a() {
            this.i.forceFinished(true);
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFB = oie.this.B();
            if (rectFB == null) {
                return;
            }
            int iRound3 = Math.round(-rectFB.left);
            float f = i;
            if (f < rectFB.width()) {
                iRound = Math.round(rectFB.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFB.top);
            float f2 = i2;
            if (f2 < rectFB.height()) {
                iRound2 = Math.round(rectFB.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f14959j = iRound3;
            this.k = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.i.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.i.isFinished() && this.i.computeScrollOffset()) {
                int currX = this.i.getCurrX();
                int currY = this.i.getCurrY();
                oie.this.u.postTranslate(this.f14959j - currX, this.k - currY);
                oie.this.z();
                this.f14959j = currX;
                this.k = currY;
                ir3.a(oie.this.p, this);
            }
        }
    }

    public oie(ImageView imageView) {
        this.p = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.r = new mf4(imageView.getContext(), this.F);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.q = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public static /* synthetic */ hjd b(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public static /* synthetic */ sid f(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public static /* synthetic */ wid h(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public static /* synthetic */ ijd j(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public static /* synthetic */ jid l(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public static /* synthetic */ gid m(oie oieVar) {
        oieVar.getClass();
        return null;
    }

    public final boolean A() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectFC = C(D());
        if (rectFC == null) {
            return false;
        }
        float fHeight = rectFC.height();
        float fWidth = rectFC.width();
        float F = F(this.p);
        float f7 = 0.0f;
        if (fHeight <= F) {
            int i = d.a[this.E.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f5 = (F - fHeight) / 2.0f;
                    f6 = rectFC.top;
                } else {
                    f5 = F - fHeight;
                    f6 = rectFC.top;
                }
                f2 = f5 - f6;
            } else {
                f2 = -rectFC.top;
            }
            this.B = 2;
        } else {
            float f8 = rectFC.top;
            if (f8 > 0.0f) {
                this.B = 0;
                f2 = -f8;
            } else {
                float f9 = rectFC.bottom;
                if (f9 < F) {
                    this.B = 1;
                    f2 = F - f9;
                } else {
                    this.B = -1;
                    f2 = 0.0f;
                }
            }
        }
        float fG = G(this.p);
        if (fWidth <= fG) {
            int i2 = d.a[this.E.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f3 = (fG - fWidth) / 2.0f;
                    f4 = rectFC.left;
                } else {
                    f3 = fG - fWidth;
                    f4 = rectFC.left;
                }
                f7 = f3 - f4;
            } else {
                f7 = -rectFC.left;
            }
            this.A = 2;
        } else {
            float f10 = rectFC.left;
            if (f10 > 0.0f) {
                this.A = 0;
                f7 = -f10;
            } else {
                float f11 = rectFC.right;
                if (f11 < fG) {
                    f7 = fG - f11;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.u.postTranslate(f7, f2);
        return true;
    }

    public RectF B() {
        A();
        return C(D());
    }

    public final RectF C(Matrix matrix) {
        Drawable drawable = this.p.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.v.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.v);
        return this.v;
    }

    public final Matrix D() {
        this.t.set(this.s);
        this.t.postConcat(this.u);
        return this.t;
    }

    public Matrix E() {
        return this.t;
    }

    public final int F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float H() {
        return this.m;
    }

    public float I() {
        return this.f14954l;
    }

    public float J() {
        return this.k;
    }

    public float K() {
        return (float) Math.sqrt(((float) Math.pow(M(this.u, 0), 2.0d)) + ((float) Math.pow(M(this.u, 3), 2.0d)));
    }

    public ImageView.ScaleType L() {
        return this.E;
    }

    public final float M(Matrix matrix, int i) {
        matrix.getValues(this.w);
        return this.w[i];
    }

    public final void N() {
        this.u.reset();
        T(this.C);
        P(D());
        A();
    }

    public void O(boolean z) {
        this.f14955n = z;
    }

    public final void P(Matrix matrix) {
        this.p.setImageMatrix(matrix);
    }

    public void Q(float f2) {
        wqk.a(this.k, this.f14954l, f2);
        this.m = f2;
    }

    public void R(float f2) {
        wqk.a(this.k, f2, this.m);
        this.f14954l = f2;
    }

    public void S(float f2) {
        wqk.a(f2, this.f14954l, this.m);
        this.k = f2;
    }

    public void T(float f2) {
        this.u.postRotate(f2 % 360.0f);
        z();
    }

    public void U(float f2) {
        this.u.setRotate(f2 % 360.0f);
        z();
    }

    public void V(float f2) {
        X(f2, false);
    }

    public void W(float f2, float f3, float f4, boolean z) {
        if (f2 < this.k || f2 > this.m) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.p.post(new e(K(), f2, f3, f4));
        } else {
            this.u.setScale(f2, f2, f3, f4);
            z();
        }
    }

    public void X(float f2, boolean z) {
        W(f2, this.p.getRight() / 2, this.p.getBottom() / 2, z);
    }

    public void Y(ImageView.ScaleType scaleType) {
        if (!wqk.d(scaleType) || scaleType == this.E) {
            return;
        }
        this.E = scaleType;
        b0();
    }

    public void Z(int i) {
        this.f14953j = i;
    }

    public void a0(boolean z) {
        this.D = z;
        b0();
    }

    public void b0() {
        if (this.D) {
            c0(this.p.getDrawable());
        } else {
            N();
        }
    }

    public final void c0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fG = G(this.p);
        float F = F(this.p);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.s.reset();
        float f2 = intrinsicWidth;
        float f3 = fG / f2;
        float f4 = intrinsicHeight;
        float f5 = F / f4;
        ImageView.ScaleType scaleType = this.E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.s.postTranslate((fG - f2) / 2.0f, (F - f4) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f3, f5);
            this.s.postScale(fMax, fMax);
            this.s.postTranslate((fG - (f2 * fMax)) / 2.0f, (F - (f4 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f3, f5));
            this.s.postScale(fMin, fMin);
            this.s.postTranslate((fG - (f2 * fMin)) / 2.0f, (F - (f4 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, fG, F);
            if (((int) this.C) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f4, f2);
            }
            int i = d.a[this.E.ordinal()];
            if (i == 1) {
                this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c0(this.p.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        mf4 mf4Var;
        boolean z2;
        GestureDetector gestureDetector;
        boolean zE;
        boolean zD;
        boolean z3;
        boolean z4;
        RectF rectFB;
        boolean z5 = false;
        if (!this.D || !wqk.c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (K() < this.k) {
                    RectF rectFB2 = B();
                    if (rectFB2 != null) {
                        view.post(new e(K(), this.k, rectFB2.centerX(), rectFB2.centerY()));
                        z = true;
                    }
                } else if (K() > this.m && (rectFB = B()) != null) {
                    view.post(new e(K(), this.m, rectFB.centerX(), rectFB.centerY()));
                    z = true;
                }
            }
            mf4Var = this.r;
            if (mf4Var != null) {
                zE = mf4Var.e();
                zD = this.r.d();
                boolean zF = this.r.f(motionEvent);
                if (!zE || this.r.e()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!zD || this.r.d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 && z4) {
                    z5 = true;
                }
                this.o = z5;
                z2 = zF;
            } else {
                z2 = z;
            }
            gestureDetector = this.q;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        y();
        z = false;
        mf4Var = this.r;
        if (mf4Var != null) {
            zE = mf4Var.e();
            zD = this.r.d();
            boolean zF2 = this.r.f(motionEvent);
            if (zE) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (zD) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = true;
            }
            this.o = z5;
            z2 = zF2;
        } else {
            z2 = z;
        }
        gestureDetector = this.q;
        return gestureDetector == null ? z2 : z2;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.x = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.q.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.y = onLongClickListener;
    }

    public void setOnMatrixChangeListener(zhd zhdVar) {
    }

    public void setOnOutsidePhotoTapListener(gid gidVar) {
    }

    public void setOnPhotoTapListener(jid jidVar) {
    }

    public void setOnScaleChangeListener(sid sidVar) {
    }

    public void setOnSingleFlingListener(wid widVar) {
    }

    public void setOnViewDragListener(hjd hjdVar) {
    }

    public void setOnViewTapListener(ijd ijdVar) {
    }

    public final void y() {
        f fVar = this.z;
        if (fVar != null) {
            fVar.a();
            this.z = null;
        }
    }

    public final void z() {
        if (A()) {
            P(D());
        }
    }
}
