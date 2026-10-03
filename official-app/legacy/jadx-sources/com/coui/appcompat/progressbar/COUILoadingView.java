package com.coui.appcompat.progressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.vi2;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$string;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class COUILoadingView extends View {
    public static final int DEFAULT_TYPE = 1;
    public static final int LARGE_TYPE = 2;
    public static final int MEDIUM_TYPE = 1;
    public static final String N = "COUILoadingView";
    public static final int ORIGINAL_ANGLE = -90;
    public static final int SMALL_TYPE = 0;
    public static final int SWIPT_ANGEL = 60;
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public Paint E;
    public float F;
    public float G;
    public float H;
    public RectF I;
    public float J;
    public float K;
    public int L;
    public COUIViewExplorerByTouchHelper.a M;
    public float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1969j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1970l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1971n;
    public int o;
    public int p;
    public int q;
    public float r;
    public Context s;
    public Paint t;
    public float u;
    public float v;
    public float w;
    public ValueAnimator x;
    public COUIViewExplorerByTouchHelper y;
    public String z;

    public class a implements COUIViewExplorerByTouchHelper.a {
        public int a = -1;

        public a() {
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public CharSequence getClassName() {
            return null;
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public int getCurrentPosition() {
            return -1;
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public int getDisablePosition() {
            return -1;
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public void getItemBounds(int i, Rect rect) {
            if (i == 0) {
                rect.set(0, 0, COUILoadingView.this.f1970l, COUILoadingView.this.m);
            }
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public int getItemCounts() {
            return 1;
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public CharSequence getItemDescription(int i) {
            return COUILoadingView.this.z != null ? COUILoadingView.this.z : getClass().getSimpleName();
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public int getVirtualViewAt(float f, float f2) {
            return (f < 0.0f || f > ((float) COUILoadingView.this.f1970l) || f2 < 0.0f || f2 > ((float) COUILoadingView.this.m)) ? -1 : 0;
        }

        @Override // com.coui.appcompat.touchhelper.COUIViewExplorerByTouchHelper.a
        public void performAction(int i, int i2, boolean z) {
        }
    }

    public static class b implements ValueAnimator.AnimatorUpdateListener {
        public WeakReference<COUILoadingView> i;

        public b(COUILoadingView cOUILoadingView) {
            this.i = new WeakReference<>(cOUILoadingView);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator.getAnimatedFraction();
            COUILoadingView cOUILoadingView = this.i.get();
            if (cOUILoadingView != null) {
                if (cOUILoadingView.isAttachedToWindow() && cOUILoadingView.getVisibility() == 0) {
                    cOUILoadingView.invalidate();
                } else {
                    Log.e(COUILoadingView.N, "LoadingView state error,cancelAnimations");
                    cOUILoadingView.f();
                }
            }
        }
    }

    public COUILoadingView(Context context) {
        this(context, null);
    }

    public final void f() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(480L);
        this.x.setInterpolator(new vi2());
        this.x.addUpdateListener(new b(this));
        this.x.setRepeatMode(1);
        this.x.setRepeatCount(-1);
        this.x.setInterpolator(new vi2());
    }

    public final void h() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x.removeAllListeners();
            this.x.removeAllUpdateListeners();
            this.x = null;
        }
    }

    public final void i(Canvas canvas) {
        float f = this.G;
        canvas.drawCircle(f, f, this.J, this.E);
    }

    public final void j() {
        this.F = this.r / 2.0f;
        this.G = getWidth() / 2;
        this.H = getHeight() / 2;
        this.J = this.G - this.F;
        float f = this.G;
        float f2 = this.J;
        this.I = new RectF(f - f2, f - f2, f + f2, f + f2);
    }

    public final void k() {
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setColor(this.k);
        this.E.setStyle(Paint.Style.STROKE);
        this.E.setStrokeWidth(this.r);
    }

    public final void l() {
        Paint paint = new Paint(1);
        this.t = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.t.setColor(this.f1969j);
        this.t.setStrokeWidth(this.r);
        this.t.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void m() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.x.cancel();
            }
            this.x.start();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.C) {
            g();
            this.C = true;
        }
        if (this.D || getVisibility() != 0) {
            return;
        }
        m();
        this.D = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        this.C = false;
        this.D = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.K = ((SystemClock.uptimeMillis() % 1000) * 360) / 1000.0f;
        i(canvas);
        canvas.save();
        canvas.rotate(-90.0f, this.G, this.H);
        if (this.I == null) {
            j();
        }
        RectF rectF = this.I;
        float f = this.K;
        canvas.drawArc(rectF, f - 30.0f, (2.0f - Math.abs((180.0f - f) / 180.0f)) * 60.0f, false, this.t);
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.I == null) {
            j();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f1970l, this.m);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getVisibility() != 0 || !isAttachedToWindow()) {
            f();
            this.D = false;
            return;
        }
        if (!this.C) {
            g();
            this.C = true;
        }
        if (this.D) {
            return;
        }
        m();
        this.D = true;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && isAttachedToWindow() && getVisibility() == 0 && getWindowVisibility() == 0) {
            m();
        } else {
            f();
        }
    }

    public void setHeight(int i) {
        this.m = i;
    }

    public void setLoadingType(int i) {
        this.f1971n = i;
    }

    public void setLoadingViewBgCircleColor(int i) {
        this.k = i;
        k();
    }

    public void setLoadingViewColor(int i) {
        this.f1969j = i;
        l();
    }

    public void setWidth(int i) {
        this.f1970l = i;
    }

    public COUILoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiLoadingViewStyle);
    }

    public COUILoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R$attr.couiLoadingViewStyle, R$style.Widget_COUI_COUILoadingView);
    }

    public COUILoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new float[6];
        this.f1970l = 0;
        this.m = 0;
        this.f1971n = 1;
        this.w = 60.0f;
        this.z = null;
        this.A = 0.1f;
        this.B = 0.4f;
        this.C = false;
        this.D = false;
        this.M = new a();
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.L = attributeSet.getStyleAttribute();
        } else {
            this.L = i;
        }
        this.s = context;
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILoadingView, i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_loading_view_default_length);
        this.f1970l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUILoadingView_couiLoadingViewWidth, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUILoadingView_couiLoadingViewHeight, dimensionPixelSize);
        this.f1971n = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUILoadingView_couiLoadingViewType, 1);
        this.f1969j = typedArrayObtainStyledAttributes.getColor(R$styleable.COUILoadingView_couiLoadingViewColor, 0);
        this.k = typedArrayObtainStyledAttributes.getColor(R$styleable.COUILoadingView_couiLoadingViewBgCircleColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.o = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_strokewidth);
        this.p = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_medium_strokewidth);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_large_strokewidth);
        this.q = dimensionPixelSize2;
        this.r = this.o;
        int i3 = this.f1971n;
        if (1 == i3) {
            this.r = this.p;
            this.A = 0.1f;
            this.B = 0.4f;
        } else if (2 == i3) {
            this.r = dimensionPixelSize2;
            this.A = 0.215f;
            this.B = 1.0f;
        }
        this.u = this.f1970l >> 1;
        this.v = this.m >> 1;
        COUIViewExplorerByTouchHelper cOUIViewExplorerByTouchHelper = new COUIViewExplorerByTouchHelper(this);
        this.y = cOUIViewExplorerByTouchHelper;
        cOUIViewExplorerByTouchHelper.b(this.M);
        ViewCompat.setAccessibilityDelegate(this, this.y);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.z = context.getString(R$string.coui_loading_view_access_string);
        l();
        k();
    }
}
